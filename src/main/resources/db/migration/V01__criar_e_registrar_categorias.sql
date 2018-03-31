create table categoria(
	codigo BIGINT(20) primary key auto_increment,
	nome varchar(50) not null
)ENGINE=InnoDB default CHARSET=utf8;

insert into categoria(nome) values('lazer');
insert into categoria(nome) values('Alimentação');
insert into categoria(nome) values('Supermercado');
insert into categoria(nome) values('Farmácia');
insert into categoria(nome) values('Outros');

