
create table member(				--테이블 표 생성, 
	id varchar2(10) primary key,	--pk = 이 테이블의 기준 키, 유일성을 사용(중복 데이터 거부)
	name varchar2(30) not null,		--not null = 반드시 테이터를 입력하시오 라는 의미 / 데이터를 입력하지 않으려면 그냥 null / default 값 = 값을 넣지 않을때 기본으로 출력되는 값
	height number(5,2),				--number = 숫자형(int 같은 개념) / varchar 오라클에서만 사용
	weight number(5,2),
	age number(2)
);

insert into member values('hyunh', '현대빈', 169.9, 68.4, 55);		--insert into (테이블명) values = 위에서 생성한 테이블에 넣을 데이터 입력
insert into member values('kim', '김정은', 158.9, 58.4, 25);
insert into member values('lee', '이정은', 179.9, 68.4, 35);
insert into member values('park', '박정은', 189.9, 78.4, 45);
insert into member values('choi', '최정은', 199.9, 88.4, 34);


select * from member;				--해당 테이블 실행

commit								--테이블에 데이터 저장

--drop table member;


