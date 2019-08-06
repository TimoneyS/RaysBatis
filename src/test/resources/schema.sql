create table author (
    id  int,
    username  varchar(32),
    password  varchar(32),
    realname  varchar(64),
    decrible  varchar(255),
    create_date timestamp
);

create table question (
    id          int,
    title       varchar(255),
    content     clob,
    author_id   int,
    create_date timestamp
);

create table answer (
    id          int,
    content     clob,
    question_id int,
    author_id   int,
    create_date timestamp
);

create table post (
    id          int,
    content     clob,
    answer_id   int,
    author_id   int,
    create_date timestamp
);



insert into author (id, username, password, realname, decrible, create_date)
values
(1, '517176491', 'wangrui', '王瑞', '专家答者', now()),
(2, 'wangmile', 'wwww', '王米乐', '菜鸟', now()),
(3, 'xhj123', 'xxxx', '谢慧君', '菜鸟', now()),
(4, 'lr_001', 'xxxx', '路人甲', '菜鸟', now()),
(5, 'lr_002', 'xxxx', '路人乙', '菜鸟', now()),
(6, 'lr_003', 'xxxx', '路人丙', '菜鸟', now());


insert into question (id, title, content, author_id, create_date)
values (1, '什么东西最好吃', '请问，牛奶和牛肉哪个更好吃啊', 2, now());

insert into answer (id, content, question_id, author_id, create_date)
values
(1, '牛奶最好吃，因为容易消化', 1, 1, now()),
(2, '牛肉最好吃，因为好吃', 1, 3, now());


insert into post (id, content, answer_id, author_id,  create_date)
values 
(1, '是的，牛奶最好吃了', 1, 4, now()),
(2, '确实，牛奶很好吃', 1, 5, now()),
(3, '牛肉赛高', 2, 6, now());


