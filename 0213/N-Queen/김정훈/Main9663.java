import java.io.*;

class Main9663 {
    static int N;
    static int[][] map;
    static int answer;
    static int[] dx = {-1,-1};
    static int[] dy = {-1, 1};

    static boolean check(int x, int y){
        return x < 0 || y < 0 || x >= N || y >= N;    
    }

    static boolean checkCross(int x, int y, int d) {
        int nx = x + dx[d];
        int ny = y + dy[d];
        
        while(!check(nx, ny)){
            if(map[nx][ny] == 1) return false;

            nx += dx[d];
            ny += dy[d];
        }

        return true;
    }
    
    static boolean checkCol(int x, int y) {
    	for(int i = 0; i < x; i++){
            if(map[i][y] == 1) return false;
        }
    	
    	return true;
    }
    
    static boolean promise(int x, int y){

        if(!checkCol(x ,y)) return false;

        for(int i = 0; i < 2; i++){
            if(!checkCross(x, y, i)) return false;
        }
        
        return true;
    }

    static void NQueen(int x, int y, int depth){
        
        if(!promise(x, y)) return;
        
        if(depth == N){
            answer += 1;
            return;
        }

        map[x][y] = 1;
        for(int i = 0; i < N; i++){
            NQueen(x+1, i, depth+1);
        }
        map[x][y] = 0;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for(int i = 0; i < N; i++){
            NQueen(0, i, 1);
        }
        
        System.out.print(answer);
    }
}
