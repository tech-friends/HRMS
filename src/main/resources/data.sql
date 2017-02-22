insert into APP_USER(ID, PASSWORD, USERNAME) values(1, '$2a$10$U79LVqvf0X5JcnimtmFGCOY1790ONHkcxQxWCkNXDCrpTvu.vUZhq', 'sanjeet');
insert into USER_ROLE(APP_USER_ID, ROLE) values(1, 'ADMIN');
insert into USER_ROLE(APP_USER_ID, ROLE) values(1, 'PREMIUM_MEMBER');