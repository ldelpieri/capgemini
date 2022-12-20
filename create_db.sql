/*
drop database tienda_shopping;
*/
create schema tienda_shopping;

use tienda_shopping;

-- CREACIÓN DE TABLAS

create table Producto_base (
	prod_base_codigo integer auto_increment primary key, -- PK
	prod_base_nombre char(255) not null,
	prod_base_descripcion text not null,
	prod_base_precio decimal(12,2) not null,
	prod_base_tiempo decimal(12,2) not null,
    prod_base_foto text
);

create table Personalizacion (
	pers_codigo integer auto_increment primary key, -- PK
	pers_nombre char(50) not null,
	pers_precio decimal(12,2) not null
);

create table Producto_personalizable (
	prod_pers_codigo integer auto_increment primary key, -- PK
	prod_pers_producto_base integer not null, -- FK
	prod_pers_personalizacion integer not null -- FK
);

create table Producto_personalizado (
	prod_pers_codigo integer auto_increment primary key, -- PK
    prod_pers_producto_personalizable integer not null, -- FK
    prod_pers_personalizacion char(255),
	prod_pers_estado char(10) not null,
	prod_pers_tienda integer not null -- FK
);

create table Tienda (
	tien_codigo integer auto_increment primary key, -- PK
	tien_nombre char(50) not null,
	tien_vendedor integer not null -- FK
);

create table Vendedor (
	vend_codigo integer auto_increment primary key, -- PK
	vend_nombre char(50) not null,
    vend_tienda integer -- FK
);

create table Medio_aceptado (
	medi_acep_tienda integer not null, -- PK FK
	medi_acep_medio_de_pago char(20) not null -- PK FK
);

create table Factura (
	fact_codigo integer auto_increment primary key, -- PK
	fact_fecha timestamp not null,
    fact_tienda integer not null, -- FK
	fact_nombre char(50) not null,
	fact_apellido char(50) not null,
    fact_email char(255) not null,
	fact_medio_de_pago char(20) not null,
	fact_total decimal(22,2) not null
);

create table Item_factura (
	item_factura integer not null, -- PK FK
	item_producto integer not null, -- PK FK
	item_cantidad integer not null,
	item_precio decimal(12,2) not null
);

-- SET FOREIGN KEY
alter table Vendedor
	add foreign key (vend_tienda) references Tienda(tien_codigo);

alter table Producto_personalizado
	add foreign key (prod_pers_tienda) references Tienda(tien_codigo);
    
alter table Producto_personalizado
	add foreign key (prod_pers_producto_personalizable) references Producto_personalizable(prod_pers_codigo);

alter table Medio_aceptado
	add foreign key (medi_acep_tienda) references Tienda(tien_codigo);
    
alter table Tienda
	add foreign key (tien_vendedor) references Vendedor(vend_codigo);
     
alter table Producto_personalizado
	add foreign key (prod_pers_producto_personalizable) references Producto_personalizable(prod_pers_codigo);

alter table Factura
	add foreign key (fact_tienda) references Tienda(tien_codigo);




     