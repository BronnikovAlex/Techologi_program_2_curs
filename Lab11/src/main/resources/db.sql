\c java_db
insert into sales.customer
values (default, 'Ivanov'),
       (default, 'Artjemij_Vsjevolodovich'),
       (default, 'Rogozhnicov'),
       (default, 'Romashkina_Ksjenija'),
       (default, 'Astorija_Jevgjenjjevna'),
       (default, 'Gjeorgina_Fjodorovna'),
       (default, 'Smith_Mark'),
       (default, 'Shchjeglov_Jaroslav'),
       (default, 'Pjetrovich');
insert into sales.product
values (default, 'Britva_Gillette_5000_ultra+_vip_edithion', 5000000),
       (default, 'Britva_Gillette_x50(t)', 3599),
       (default, 'Britva_SuperSjeljodka_v3', 299),
       (default, 'Plita_eljectrichjeskaja_Roxi', 12499),
       (default, 'Ruchka_Sharikovaja_KuraLapa', 59999999),
       (default, 'Mikrovolnovaja_Pjech_Frosti', 5999),
       (default, 'Kniga_Burjatskij_dlja_nachinajushchih', 599),
       (default, 'Stul_Krossplatformjennyj', 1001);
insert into sales.customer_product
values (default, 5000000, 8, 1),
       (default, 5000000, 2, 1),
       (default, 5000000, 3, 1),
       (default, 3599, 1, 2),
       (default, 3599, 3, 2),
       (default, 3599, 5, 2),
       (default, 299, 6, 3),
       (default, 299, 7, 3),
       (default, 299, 9, 3),
       (default, 12499, 2, 4),
       (default, 12499, 1, 4),
       (default, 59999999, 6, 5),
       (default, 59999999, 4, 5),
       (default, 5999, 2, 6),
       (default, 5999, 7, 6),
       (default, 599, 3, 7),
       (default, 599, 1, 7),
       (default, 599, 7, 7),
       (default, 1001, 8, 8);
