create schema task12;
insert into task12.item values
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0),
                            (default, 0, 0);
select sum(i.value) from task12.item i;
TRUNCATE task12.item;
DELETE FROM task12.item;