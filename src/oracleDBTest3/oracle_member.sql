// 테이블 생성
create table member (
	id varchar2(10) primary key, --이 테이블의 기준키, 유일성을 사용(중복 데이터 거부)
	name varchar2(30) not null, --not null, 반드시 데이터를 입력하시오.
	height number(5, 2) default 0.00, -- (5, 2), 총 5자리 중 소수점 아래 2자리까지 허용
	weight number(5, 2) default 0.00,
	age number(3) default 0
);

// member라는 테이블에 값 입력
insert into member values('heo', '허장욱', 176.1, 85.0, 28);
insert into member values('kim', '김정은', 158.1, 58.0, 25);
insert into member values('lee', '이정은', 179.1, 68.0, 35);
insert into member values('park', '박정은', 189.1, 78.0, 45);
insert into member values('choi', '최정은', 199.1, 88.0, 34);

// 결과 출력
select * from member;

// 데이터 저장
commit

// 테이블 삭제
drop table member;

-- 인터페이스 설계
memberInter_DBConnection, 
memberInter_Select, 
memberInter_Insert, 
memberInter_Update, 
memberInter_Delete

-- 클래스 설계
memberDBConnectTest, 
memberSelectTest, 
memberInsertTest, 
memberUpdateTest, 
memberDeleteTest

-- 메소드 설계
memberDBConnect(),
memberSelect(), 
memberInsert(), 
memberUpdate(), 
memberDelete()

main class: memberInter_classMethod