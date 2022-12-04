/*
use tienda_shopping
drop table Factura
drop table Item_factura
drop table medio_aceptado
drop table Producto_personalizado
drop table Tienda
drop table Vendedor
drop table Producto
drop table Producto_base
drop table personalizacion
use master
drop database tienda_shopping
*/
use master
go

create database tienda_shopping
go

use tienda_shopping
go

--CREACIÓN DE TABLAS

create table Producto_base (
	prod_base_codigo integer identity(1,1) primary key, --PK
	prod_base_nombre char(50) not null,
	prod_base_detalle char(50) not null,
	prod_base_precio decimal(12,2) not null,
	prod_base_tiempo decimal(12,2) not null
)

create table Personalizacion (
	pers_codigo integer identity(1,1) primary key, --PK
	pers_nombre char(50) not null,
	pers_precio decimal(12,2) not null
)

create table Producto (
	prod_producto_base integer not null, --PK FK
	prod_personalizacion integer not null --PK FK
)

create table Producto_personalizado (
	prod_pers_codigo integer identity(1,1) primary key, --PK
	prod_pers_producto_base integer not null, --FK
	prod_pers_producto_personalizacion integer not null, -- FK
	prod_pers_estado char(10) not null,
	prod_pers_tienda integer not null --FK
)

create table Tienda (
	tien_codigo integer identity(1,1) primary key, --PK
	tien_nombre char(50) not null,
	tien_vendedor integer not null --FK
)

create table Vendedor (
	vend_codigo integer identity(1,1) primary key, --PK
	vend_nombre char(50) not null
)

create table medio_aceptado (
	medi_acep_tienda integer not null, --PK FK
	medi_acep_medio char(15) not null --PK
)

create table Factura (
	fact_codigo integer identity(1,1) primary key, -- PK
	fact_fecha smalldatetime not null,
	fact_nombre char(50) not null,
	fact_apellido char(50) not null,
	fact_tipo_documento char(9) not null,
	fact_numero_documento char(20) not null,
	fact_medio_pago integer not null,
	fact_total decimal(22,2) not null
)

create table Item_factura (
	item_factura integer not null, -- PK FK
	item_producto integer not null, -- PK FK
	item_cantidad integer not null,
	item_precio decimal(12,2) not null
)

--SET PRIMARY KEY
alter table Producto
	add constraint pk primary key (prod_producto_base, prod_personalizacion)

alter table Medio_aceptado
	add constraint pk2 primary key (medi_acep_tienda, medi_acep_medio)

alter table Item_factura
	add constraint pk3 primary key (item_factura, item_producto)


--SET FOREIGN KEY

alter table Producto_personalizado
	add foreign key (prod_pers_producto_base, prod_pers_producto_personalizacion) references Producto(prod_producto_base, prod_personalizacion)

alter table Producto_personalizado
	add foreign key (prod_pers_tienda) references Tienda(tien_codigo)


alter table Medio_aceptado
	add foreign key (medi_acep_tienda) references Tienda(tien_codigo)

alter table Tienda
	add foreign key (tien_vendedor) references Vendedor(vend_codigo)


alter table Producto
	 add foreign key (prod_producto_base) references Producto_base(prod_base_codigo)

alter table Producto
	 add foreign key (prod_personalizacion) references Personalizacion(pers_codigo)