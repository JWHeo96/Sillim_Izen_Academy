create table register(
	hakbun number(5) primary key,
	kwamok varchar2(30) default null,
	ezenclass varchar2(1) not null,
	medsungjuk number(3) default 0,
	finsungjuk number(3) default 0
);

insert into register values(23001, 'DB', 'A', 90, 95);
insert into register values(23002, '운영체제', 'B', 95, 95);
insert into register values(23003, '논리회로', 'C', 80, 90);
insert into register values(23004, '자료구조', 'D', 85, 100);
insert into register values(23005, 'JAVA', 'E', 70, 75);

select * from register;

--CRUD
1.registerSelcet
2.registerInsert
3.registerUpdate
4.registerDelete

commit

drop table register;