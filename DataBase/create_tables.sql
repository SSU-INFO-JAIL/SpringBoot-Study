create table member
(
    member_id   char(5)  not null
        primary key,
    member_name char(20) null,
    member_addr char(20) null
);

create table product
(
    product_name char(20)       not null
        primary key,
    cost         decimal(10, 2) not null,
    make_date    date           null,
    company      varchar(50)    null,
    amount       int            not null
);

