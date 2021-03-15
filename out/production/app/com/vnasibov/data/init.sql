create table user
(
    id          numeric,
    uname       varchar(14),
    uname       varchar(14),
    surname     varchar(14),
    age         varchar(4),
    facebookUrl varchar(54),

    username    varchar(14),
    password    varchar(300),
    token       varchar(54),
    constraint pk_user primary key (id)
);

create table course
(
    id     numeric,
    title  varchar(54),
    author varchar(34),
    constraint pk_course primary key (id)
);

create table userCourse(
                    id    numeric,
                    userId    numeric,
                    courseId    numeric,
                    constraint pk_userCourse primary key ( id ),
                    constraint fk_userId foreign key ( userId ) references user ( id ),
                    constraint fk_courseId foreign key ( courseId ) references course ( id )
);