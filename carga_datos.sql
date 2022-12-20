use tienda_shopping;

insert into Vendedor (vend_nombre) values ("Scaloni");
insert into Vendedor (vend_nombre) values ("Messi");
insert into Vendedor (vend_nombre) values ("De Paul");

insert into Tienda (tien_nombre, tien_vendedor) values ("La Escaloneta", 1);
insert into Tienda (tien_nombre, tien_vendedor) values ("Messirve", 2);
insert into Tienda (tien_nombre, tien_vendedor) values ("La triple T", 3);

insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Traje de Baño Speed", "El Traje de Baño Speed Estampada forma parte de la línea de básicos de la marca que estiliza la silueta de las más chicas. Sus breteles cruzados en la espalda, aseguran sujeción para que puedan estar cómodas y seguras en la actividad que más disfrutan. Posee elástico de 2.5 cm que mantienen el calce perfecto con una gran retención de talle y poder hidrodinámico. Su estampado las hará sentir únicas y hará que se destaquen dentro y fuera del agua. Delicadeza, estilo, silueta y eficiencia en este traje de baño ideal.",
		7799, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw7cff958f/products/SE_9158IN5F/SE_9158IN5F-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Short Nike Drifit Kylian Kz", "El Short Nike Drifit Kylian Kz es el compañero de entrenamiento ideal de los más chicos de la familia. Cuenta con bolsillos a los lados para que no pierdan nada y un ajuste con elástico y cordón para mantener la prenda en su lugar. El estampado en llamas les dará la velocidad que necesitan y un look urbano para que se destaques a donde vayan. Además, su construcción en poliéster y con tecnología Dri-Fit absorbe el sudor y lo elimina rápidamente manteniéndolos frescos en todo momento.", 10799, 4, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw790a34f4/products/NI_DA5600-010/NI_DA5600-010-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Pollera Lotto Universal", "La Pollera Lotto Universal está confeccionada en poliéster y ajusta con elástico para un mayor confort al utilizarla. Su estilo liso hacen que sea una prenda fácil de combinar para entrenar y jugar al tenis.", 3499, 5, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw28968860/products/LO_NIFW22279/LO_NIFW22279-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Zapatillas Nike Court Vision Lo Be", "El peso del calzado puede variar según el número solicitado. Los talles corresponden a numeración de Argentina", 50699, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw6b73a139/products/NI_DH2987-100/NI_DH2987-100-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Zapatillas Nike Air Max Sc", "Las zapatillas Nike Air Max Sc representan el clásico estilo Air MAx con líneas fáciles de llevar y amortiguación Air Visible, estas zapatillas prometen comodidad y amortiguación perfecta. Además, tienen un acabo ideal que completa cualquier look, tanto deportivo como urbano. El estilo de confección y sus materiales, agregan profundidad al calzado y a la vez, lo convierten en una compañía super duradera y liviana para el uso diario. Ponételas con unos joggins o un jean, siempre quedan de 10.", 38299, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw0ca20125/products/NI_CW4554-400/NI_CW4554-400-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Camiseta Le Coq Sportif Argentina Homenaje 86 Alternativa", "La Camiseta Le Coq Sportif Argentina Homenaje 86 Alternativa te lleva a aquellos momentos de felicidad previos a la Copa Mundial que consagró a Argentina ganadora del mundo. Esta prenda está inspirada en el partido amistoso jugado una semana antes del comienzo del Mundial 86 en Colombia contra Junior de Baranquilla. Su diseño rememora el utilizado por los jugadores en aquel partido, con el escudo termoadherido, el número 10 en la espalda y el logo coronados de gloria aplicado en transfer. Su confección en poliéster liviano y suave para que sientas el confort en todo momento. Qué placer mayor el de tener esta Camiseta en tu ropero.", 19999, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dwdcd3612b/products/LE_LTN0222155/LE_LTN0222155-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Remera Nike Dri-Fit Wild Top", "
Lo clásico no es sinónimo de aburrido; lleva la Remera Nike Dri-Fit Wild Top y lucí una prenda de todos los días con un look renovado y urbano. El calce regular te permite moverte libremente y la composición en algodón garantiza una suavidad y comodidad únicas para que enfrentes tu rutina con todo el confort posible.", 10199, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw9b57f5fc/products/NI_DD6288-869/NI_DD6288-869-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Remera Puma Power", "La Remera Puma Power está pensada para crear un look deportivo creativo y eficiente para tus momentos de entrenamiento. Está hecha con un algodón suave que te mantiene cómodo y te da suavidad mientras que la lleves puesta. Su estampa creando franjas diagonales con el logo, crea un diseño impactante para vos. Combinala con tus shorts favoritos y mostrale a todos lo que tenés para dar!", 8299, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw76ecc48c/products/PU_672765-02/PU_672765-02-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Remera Topper Gtw Loose", "La Remera Topper Loose brinda un look casual y fácil de combinar con todos tus outfits. Lucila en la facultad, en el trabajo y en tus salidas. El estampado es el protagonista discreto de una remera con un toque de color y estilo. Disfruta de tu rutina con todo el confort posible gracias a la suavidad del algodón y que nada te frene.", 5999, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dwd93d86ea/products/TO_165405/TO_165405-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Campera Topper Rtc", "Confeccionada en poliéster y fue pensada para ser un must en tu ropero a la hora de elegir tu outfit y salir a la calle. Sus bolsillos te permiten guardar tus pertenencias, mientras que el cierre frontal completo ayuda a vestirla rápidamente y mantenerte abrigada en los días de menor temperatura.", 12299, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dwc544a724/products/TO_162917/TO_162917-1.JPG");

insert into Personalizacion (pers_nombre, pers_precio) values ("Estampado", 100);
insert into Personalizacion (pers_nombre, pers_precio) values ("Pintado", 150);
insert into Personalizacion (pers_nombre, pers_precio) values ("Intervenido", 80);
insert into Personalizacion (pers_nombre, pers_precio) values ("Brillante", 200);

insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 1);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 2);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 3);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (2, 2);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (3, 4);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (3, 2);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (5, 4);

insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda)
	values (1,"Carita de Messi", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda)
	values (2,"Emoji", "Pausa", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda)
	values (3,"Un sticker", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda)
	values (4,"Lo pinto a mano", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda)
	values (5,"Algo le voy a hacer", "Pausa", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda)
	values (1,"Secreto...", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda)
	values (3,"Adivinalo", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda)
	values (4,"Muy buena", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda)
	values (5,"Foto personalizada", "Activo", 3);
    
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (1, "TRANSFERENCIA");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (1, "EFECTIVO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (1, "TARJETA_DE_CREDITO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (1, "TARJETA_DE_DEBITO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (2, "TARJETA_DE_CREDITO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (2, "TARJETA_DE_DEBITO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (3, "EFECTIVO");


