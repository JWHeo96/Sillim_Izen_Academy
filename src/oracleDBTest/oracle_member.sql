// 테이블 생성
create table member (
	id varchar2(10) primary key,
	name varchar2(50),
	height number(5,2),
	weight number(5,2),
	age number(3)
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