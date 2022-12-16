use tienda_shopping;

insert into Vendedor (vend_nombre) values ("Scaloni");
insert into Vendedor (vend_nombre) values ("Messi");
insert into Vendedor (vend_nombre) values ("De Paul");

insert into Tienda (tien_nombre, tien_vendedor) values ("La Escaloneta", 1);
insert into Tienda (tien_nombre, tien_vendedor) values ("Messirve", 2);
insert into Tienda (tien_nombre, tien_vendedor) values ("La triple T", 3);

insert into Medio_de_pago (medi_pago_nombre) values ("Efectivo");
insert into Medio_de_pago (medi_pago_nombre) values ("Tarjeta de crédito");
insert into Medio_de_pago (medi_pago_nombre) values ("Tarjeta de débido");
insert into Medio_de_pago (medi_pago_nombre) values ("Transferencia");

insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo)
	values ("Remera", "Remera nashe, lista para usar", 1500, 7);
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo)
	values ("Camisa", "Camisita estallada, la rompe toda", 7000, 10);
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo)
	values ("Zapatillas", "nananananananaanananananan", 14000, 5);
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo)
	values ("Camiseta Argentina", "claaave", 8000, 3);

insert into Personalizacion (pers_nombre, pers_precio) values ("Estampa", 100);
insert into Personalizacion (pers_nombre, pers_precio) values ("Pintado", 150);
insert into Personalizacion (pers_nombre, pers_precio) values ("Intervenido", 80);
insert into Personalizacion (pers_nombre, pers_precio) values ("Brillante", 200);

insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 1);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 2);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 3);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (2, 2);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (3, 4);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (3, 2);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (4, 4);


