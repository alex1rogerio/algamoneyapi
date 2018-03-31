drop table pessoa;

CREATE table pessoa(
	codigo BIGINT(20) primary key auto_increment,
	nome varchar(50) not null,
	ativo boolean not null,
	logradouro varchar(50) not null,
	numero varchar(10) not null,
	complemento varchar(50),
	bairro varchar(50) not null,
	cep varchar(50) not null,
	cidade varchar(50) not null,
	estado varchar(50) not null
)ENGINE=InnoDB default CHARSET=utf8;

insert into pessoa (nome,ativo,logradouro,numero,complemento,bairro,cep,cidade,estado)
values ('Alexandre Rogerio',true,'Rua laudo ferreira de Camargo','23','xxx','pq sao vicente','09371100','Maua','SP' );

