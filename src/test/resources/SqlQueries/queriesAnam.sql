select * from users;
select * from users where id = 86;
select * from conference;
select * from room;
select * from conference_timeline;
select firstname, lastname,name as roomName
    from users
        join conference c on users.id = c.reservator_id
        join room r on c.room_id = r.id
where users.id=86;

select * from users where id = 140;



