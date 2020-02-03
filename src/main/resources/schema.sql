create table recognition(
  id         integer identity PRIMARY KEY,
  message    varchar(2000) NOT NULL,
  author     varchar(128) NOT NULL,
  recipient  varchar(128) NOT NULL
--    ,
--    created_at timestamp with time zone DEFAULT CURRENT_TIMESTAMP
);

create table reaction(
  id             integer identity PRIMARY KEY,
recognition_id integer NOT NULL,
author varchar(128)NOT NULL,
kind varchar(32)NOT NULL,
message varchar(1000),
--    created_at     timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
foreign key(recognition_id)references recognition(id)
);
