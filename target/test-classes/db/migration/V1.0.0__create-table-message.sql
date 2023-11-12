begin;
CREATE TABLE tbl_message(
 id BIGINT(20) NOT NULL AUTO_INCREMENT,  
 `date_created` DATETIME default NOW(), 
 `is_deleted` CHAR(1) NOT NULL DEFAULT 'N', 
 message text,
 lng varchar(20) default "en",
 code varchar(50),
 primary key(id))ENGINE = InnoDB;
 insert into tbl_message (id, date_created, message, lng, code) values(null, now(), "Някакъв низ", "bg", "SOME_STRING");
 commit;