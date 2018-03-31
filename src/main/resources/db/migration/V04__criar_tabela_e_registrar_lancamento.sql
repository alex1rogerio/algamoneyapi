create table lancamento(
codigo bigint(20) primary key auto_increment,
descricao varchar(50)  not null,
data_vencimento date  not null,
data_pagamento date,
valor decimal (10,2) not null,
observacao varchar(100)  not null,
tipo varchar(20)  not null,
codigo_categoria bigint(20) not null,
codigo_pessoa bigint(20) not null,
foreign key (codigo_categoria) references categoria (codigo),
foreign key (codigo_pessoa) references pessoa (codigo)
)engine=innodb default charset=utf8;


insert into lancamento (descricao,data_vencimento,data_pagamento,valor,observacao,tipo,codigo_categoria,codigo_pessoa) 
values ('Salario Mensal','2018-02-26' , null , 6500.00 ,'DIstribuicao de Lucros', 'RECEITA', 1, 1);

insert into lancamento (descricao,data_vencimento,data_pagamento,valor,observacao,tipo,codigo_categoria,codigo_pessoa) 
values ('Despesas Diversas','2018-02-26' , null , 6500.00 ,'DIstribuicao de Lucros', 'DESPESA', 1, 1);

insert into lancamento (descricao,data_vencimento,data_pagamento,valor,observacao,tipo,codigo_categoria,codigo_pessoa) 
values ('Refeicao','2018-02-26' , null , 6500.00 ,'DIstribuicao de Lucros', 'DESPESA', 1, 1);

insert into lancamento (descricao,data_vencimento,data_pagamento,valor,observacao,tipo,codigo_categoria,codigo_pessoa) 
values ('Mecanica','2018-02-26' , null , 6500.00 ,'DIstribuicao de Lucros', 'DESPESA', 1, 1);

