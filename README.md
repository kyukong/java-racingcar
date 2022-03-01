# java-racingcar

### 자동차 경주 미션 저장소
입력한 시도 횟수만큼 자동차들을 각각 랜덤으로 이동시켜 가장 많이 이동한 자동차를 뽑는 프로그램

## 기능 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

## 🚀 구현할 기능 목록

---

> ### 1. 입력

- ### 자동차 이름 목록
    - [x] [ 예외 ] : `공백` - *(입력받은 문자열의 앞 뒤를 제거해준다.)*
    - [x] [ 예외 ] : 자동차가 `2대 미만`
    - [x] [ 예외 ] : 이름이 `중복`
    - [x] [ 예외 ] : `5글자 초과`
    
- ### 시도할 횟수
    - [x] [ 예외 ] : `공백`
    - [x] [ 예외 ] : 숫자가 아닌 `문자`
    - [x] [ 예외 ] : `1 미만`
    
- ### 예외 처리
    - [x] `IllegalArgumentException`를 발생 시킴
    - [x] `[ERROR]`로 시작하는 에러 메시지를 출력
    - [x] 에러 생성 지점부터 `다시 입력 받음 `

> ### 2. 레이싱

- ### 자동차 이동
    - [x] `0에서 9 사이에서 무작위 값을 구한 후` 무작위 값이 `4 이상일 경우 전진`
        - [x] 입력 받은 횟수 만큼 이동 시도
    - [x] 개별 자동차 위치 갱신

- ### 경기 진행
    - [x] 입력 받은 `횟수 만큼 반복해서 경기 진행`
    - [x] 최종 우승자 판별
    
> ### 3. 출력

- ### 각 차수별 실행 결과
    - [x] `이름 : 이동한 거리 * ( - ) 로 출력`
- ### 최종 우승자
    - [x] `단독` 우승자
    - [x] `공동` 우승자
        - [X] "," 로 분리하여 출력
