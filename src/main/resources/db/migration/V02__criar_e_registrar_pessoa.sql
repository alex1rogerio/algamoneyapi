CREATE table pessoa(
	codigo BIGINT(20) primary key auto_increment,
	nome varchar(50) not null,
	ativo boolean not null
)ENGINE=InnoDB default CHARSET=utf8;


CREATE table endereco(
	codigo BIGINT(20) primary key auto_increment,
	logradouro varchar(50) not null,
	numero varchar(10) not null,
	complemento varchar(50),
	bairro varchar(50) not null,
	cep varchar(50) not null,
	cidade varchar(50) not null,
	estado varchar(50) not null
)ENGINE=InnoDB default CHARSET=utf8;


