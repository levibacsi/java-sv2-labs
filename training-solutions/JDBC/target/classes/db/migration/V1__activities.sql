create table activities (
    id bigint auto_increment, primary key (id),
    start_time datetime,
    description varchar(255),
    activity_type varchar(50)
);

