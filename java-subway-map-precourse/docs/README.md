# 기능 구현 목록

## 초기 설정
- [ ] 프로그램 시작시 필요한 정보를 미리 셋팅할 수 있다.
- [x] 메인 화면에서 입력시 예외사항 
  - [x] 메인 화면에 존재하는 기능만 입력할 수 있다. (1,2,3,4,Q) 

## 지하철 역 관련 기능
- [x] 지하철 역 등록

- [x] 지하철 역 등록 예외사항
    - [x] 등록하려는 지하철 역이 이미 존재하는지 체크한다.
    - [x] 지하철 역 이름이 2글자 이상인지 체크한다.
    - [x] 입력받은 역 관리 기능이 존재하는지 체크한다. 
  
- [x] 지하철 역 삭제 (단, 노선에 등록된 역은 삭제할 수 없다)

- [ ] 지하철 역 삭제 예외사항
    - [x] 삭제하려는 지하철 역이 존재하는 체크한다.
    - [ ] 삭제하려는 지하철 역이 노선에 있는지 체크한다.

- [x] 지하철 역 목록 조회

## 지하철 노선 관련 기능
- [x] 지하철 노선 등록

- [x] 지하철 노선 등록 예외사항
    - [x] 등록하려는 지하철 노선이 이미 존재하는지 체크한다.
    - [x] 지하철 노선 이름이 2글자 이상인지 체크한다.
    - [x] 상행 종점역과 하행 종점역이 존재하는지 체크한다.
    - [x] 상행 종점역과 하행 종점역이 이미 노선에 존재하는지 체크한다.

- [x] 지하철 노선 삭제
    - [x] 삭제하려는 지하철 노선이 존재하는지 체크한다.

- [x] 지하철 노선 목록 조회

## 구간 관리 기능
- [ ] 구간 등록
    - [ ] 지하철 노선을 알 수 있다.
    - [ ] 지하철 역을 알 수 있다.
    - [ ] 해당 순서에 지하철 역을 추가할 수 있다.

- [ ] 구간 등록 예외사항
    - [ ] 입력한 기능이 존재하는지 체크한다. (1 or 2)
    - [ ] 입력한 노선이 존재하는지 체크한다.
    - [ ] 입력한 역이 존재하는지 체크한다.
    - [ ] 입력한 역이 이미 노선에 존재하는지 체크한다. (갈래길이 생기는지 체크)
    - [ ] 입력한 순서가 숫자인지 체크한다.

- [ ] 구간 삭제
    - [ ] 해당 지하철 노선에 역 목록을 알 수 있다.
    - [ ] 입력한 역을 삭제할 수 있다.

- [ ] 구간 삭제 예외사항
    - [ ] 입력한 노선이 존재하는지 체크한다.
    - [ ] 입력한 노선의 역 목록에 역이 존재하는지 체크한다.
    - [ ] 노선에 포함된 역이 두개 이하인지 체크한다. (구간 삭제 불가능)

## 지하철 노선도 조회
- [ ] 지하철 노선에 등록된 역을 조회할 수 있다.