use adlister_db;

CREATE table users (
    id int unsigned not null auto_increment,
    username varchar(50),
    email varchar(50),
    password varchar(50),
    primary key (id)
);

CREATE table ads (
    id int unsigned not null auto_increment,
    user_id int,
    title varchar(50),
    description varchar(100),
    primary key (id),
    foreign key (user_id) references users(id)
);