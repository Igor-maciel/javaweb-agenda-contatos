create database agenda;

use agenda;

create table contato(
	id int primary key auto_increment,
	nome varchar(100) not null,
	data_cadastro datetime default now(),
	fone varchar(15) ,
	email varchar(100),
	observacao varchar(255)

);
