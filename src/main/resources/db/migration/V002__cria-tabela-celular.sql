CREATE TABLE celular (
	id bigint not null auto_increment,
    cliente_id bigint not null,
    modelo text not null,
	marca text not null,
	num_serie text not null,
    status varchar(20) not null,
    
    primary key (id)
);

alter table celular add constraint fk_celular_cliente
foreign key (cliente_id) references cliente (id);