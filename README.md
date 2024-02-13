# Algoritm
## 1. 저장소를 자신의 계정으로 Fork하기
> Organiztion의 레포지토리를 개인 Github 저장소로 복사하는 작업입니다.

* 포크 버튼을 클릭합니다.

![image](https://github.com/SSAFY11-SEOUL-15/Algorithm/assets/97653343/5413342c-75ef-4e5b-a9f2-c964d2bf2022)


* CreateFork 버튼을 눌러 복사한 저장소를 생성합니다.

![포크2](https://github.com/SSAFY11-SEOUL-15/Algorithm/assets/97653343/76de889c-c4bc-4210-80c1-15c268ebf059)

* 개인 저장소에 레포지토리가 생성되었습니다. 😉👍

![포크3](https://github.com/SSAFY11-SEOUL-15/Algorithm/assets/97653343/9ed6d3c0-1c6f-40cc-8089-b27e6c9d28a9)

### 2. Pull Request를 위한 브랜치 생성

> github에서 서로 다른 작업을 하기 위한 별도의 공간을 만들기 위해 브랜치를 생성할 수 있습니다.

* 개인 저장소에서 브랜치를 생성합니다.

![브랜치1](https://github.com/SSAFY11-SEOUL-15/Algorithm/assets/97653343/9b44e059-b552-4492-9aab-407ae3169867)

* `New branch` 버튼을 클릭하면 나오는 화면입니다.

![image](https://github.com/SSAFY11-SEOUL-15/Algorithm/assets/97653343/42ba6021-5c6b-4757-99c7-d6cf4ee37810)
* 브랜치 이름은 본인의 Github ID로 만들어주세요 😉
* create new branch 버튼을 클릭해 새로운 브랜치를 만들어 줍니다.

* 브랜치를 생성한 후의 상태는 다음과 같습니다.

![image](https://github.com/SSAFY11-SEOUL-15/Algorithm/assets/97653343/dcb46469-b657-41f9-bdf5-5a9913a46194)

### 3. 본인 원격 저장소에 소스 코드 올리기

> 우리의 코드를 한 곳에 모으기 전에 자신의 저장소에 코드를 올려주셔야 합니다.

* 이전에 생성한 브랜치로 작업 브랜치를 옮겨 주세요.

![image](https://github.com/SSAFY11-SEOUL-15/Algorithm/assets/97653343/2dff99e7-6db1-4a14-a19b-17a2f55eb39d)

### 4. github 서비스에서 Pull Request 보내기

> Pull Request는 github에서 제공하는 기능으로 코드리뷰 요청을 보낼 때 사용합니다.
> Pull Request는 original 저장소(SSAFY Algorithm의 저장소)의 master 브랜치와 앞 단계에서 생성한 브랜치 이름을 기준으로 합니다.

```
ex) 미션을 진행한 javajigi/java-baseball javajigi 브랜치 => woowacourse/java-baseball main
브랜치로 Pull Request를 보낸다.
```

* 브라우저에서 github 저장소에 접근
* 브랜치를 작업 브랜치로 변경(앞 단계의 예에서는 javajigi)
* 브랜치 오른쪽에 있는 **"New pull request"** 버튼 클릭

![pull request 보내기](./images/etc/pull_request_1.png)

* Pull Request 제목은 `[$날짜] $이름` 형식으로 작성해주세요. ex) [0213] 김정훈
* 작업한 내용을 입력하고 **"Create pull request"** 버튼을 클릭해 Pull Request를 보내주세요.

![pull request 브랜치 변경](./images/etc/pull_request_2.jpg)

* Pull Request를 보냈을 때의 상태는 아래와 같습니다.

![pull request](./images/pull_request.jpg)

