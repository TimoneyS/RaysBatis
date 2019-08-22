create table author (
    id        int,
    username  varchar(32),
    realname  varchar(32),
    create_date timestamp
);

create table question (
    id          int PRIMARY KEY,
    title       varchar(255),
    content     clob,
    author_id   int,
    create_date timestamp
);

create table reply (
    id          int,
    content     clob,
    question_id int,
    author_id   int,
    create_date timestamp
);

insert into author (id, username, realname, create_date)
values
(1, 'wangmile', '王米乐', now()),
(2, 'wangrui1', '王瑞',  now()),
(3, 'xhj12345', '谢慧君', now());


insert into question (id, title, content, author_id, create_date)
values (1, '什么东西最好吃', '请问，牛奶和牛肉哪个更好吃啊', 3, now());

insert into reply (id, content, question_id, author_id, create_date)
values
(1, '牛奶最好吃，因为容易消化', 1, 2, now()),
(2, '牛肉最好吃，因为好吃',   1, 3, now());


