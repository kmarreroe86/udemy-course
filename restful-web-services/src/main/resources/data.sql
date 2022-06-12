/*url for h2 db:=  jdbc:h2:mem:testdb*/

insert into user values(1001, sysdate(), 'k1')
insert into user values(2002, sysdate(), 'k2')
insert into user values(3003, sysdate(), 'k3')

insert into post values(4001, 'Post one from k1', 1001)
insert into post values(1002, 'Post two from k1', 1001)
insert into post values(1003, 'Post one from k2', 2002)