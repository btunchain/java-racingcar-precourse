# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
<hr>

# 자동차 경주 게임 기능 구현
## 구현 기능 목록
1. UI Init
2. 게임 시작
3. 차량명 입력
    - 3-1. 입력 문자 Split
    - 3-2. 차량명 유효성 체크
4. 경주 횟수 입력
    - 4-1. 입력 이동 횟수 유효성 체크
5. 경주 시작
    - 5-1. 자동차별 난수 생성
    - 5-2. 5-1번 결과에 따른 이동여부
6. 경주횟수 만큼의 5번 반복 로직
7. 결과 계산
8. 결과 출력
9. UI Close

## 구현 클래스
### main
* constant
    - RacingCarGameConstant : 레이싱 게임 관련 상수 정의 클래스
* service
    - Race : 경주 진행 로직 클래스
    - RacingCarGame : 레이싱 게임 로직 클래스
    - RacingCarSetting : 레이싱 자동차 설정 클래스
    - RacingCountSetting : 레이싱 카운트 설정 클래스
* util
    - ListUtils : List 관련 유틸 클래스
    - UIUtils : UI 관련 유틸 클래스
    - StringUtils : 문자열 관련 유틸 클래스
    - ValidationUtils : 유효성 체크 유틸 클래스
* vo
    - Car : 차량정보 클래스
    - Cars : 차량정보 리스트 클래스
</br></br>
* StartApplication : application 실행 클래스

### test
* service
    - RaceTest
    - RacingCarGameTest
    - RacingCarSettingTest
    - RacingCountSettingTest
* util
    - ListUtilsTest
    - StringUtilsTest
    - ValidationUtilsTest
* vo
    - CarTest