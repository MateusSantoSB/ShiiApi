CREATE TABLE secrets(
	id BIGSERIAL primary key NOT NULL,
	secret varchar(255) NOT NULL,
	nickname varchar(25) NOT NULL,
	datepost DATE NOT NULL,
	timepost TIME NOT NULL
);