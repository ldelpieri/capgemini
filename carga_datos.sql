use tienda_shopping;
-- VENDEDORES
insert into Vendedor (vend_nombre) values ("Marti Castro");
insert into Vendedor (vend_nombre) values ("Maria Cristina Aparicio");
insert into Vendedor (vend_nombre) values ("Antoni Herrero");

-- TIENDAS
insert into Tienda (tien_nombre, tien_vendedor) values ("Nessie", 1);
insert into Tienda (tien_nombre, tien_vendedor) values ("Manticora Serio", 2);
insert into Tienda (tien_nombre, tien_vendedor) values ("Herrero", 3);

-- MEDIOS DE PAGO ACEPTADOS
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (1, "TRANSFERENCIA");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (1, "EFECTIVO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (1, "TARJETA_DE_CREDITO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (1, "TARJETA_DE_DEBITO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (2, "TARJETA_DE_CREDITO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (2, "TARJETA_DE_DEBITO");
insert into Medio_aceptado (medi_acep_tienda, medi_acep_medio_de_pago) values (3, "EFECTIVO");

-- PRODUCTOS BASE
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Traje de Baño Speed", "El Traje de Baño Speed Estampada forma parte de la línea de básicos de la marca que estiliza la silueta de las más chicas. Sus breteles cruzados en la espalda, aseguran sujeción para que puedan estar cómodas y seguras en la actividad que más disfrutan. Posee elástico de 2.5 cm que mantienen el calce perfecto con una gran retención de talle y poder hidrodinámico. Su estampado las hará sentir únicas y hará que se destaquen dentro y fuera del agua. Delicadeza, estilo, silueta y eficiencia en este traje de baño ideal.", 7799, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw7cff958f/products/SE_9158IN5F/SE_9158IN5F-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Short Nike Drifit", "El Short Nike Drifit Kylian Kz es el compañero de entrenamiento ideal de los más chicos de la familia. Cuenta con bolsillos a los lados para que no pierdan nada y un ajuste con elástico y cordón para mantener la prenda en su lugar. El estampado en llamas les dará la velocidad que necesitan y un look urbano para que se destaques a donde vayan. Además, su construcción en poliéster y con tecnología Dri-Fit absorbe el sudor y lo elimina rápidamente manteniéndolos frescos en todo momento.", 10799, 4, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw790a34f4/products/NI_DA5600-010/NI_DA5600-010-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Falda Lotto Universal", "La Pollera Lotto Universal está confeccionada en poliéster y ajusta con elástico para un mayor confort al utilizarla. Su estilo liso hacen que sea una prenda fácil de combinar para entrenar y jugar al tenis.", 3499, 5, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw28968860/products/LO_NIFW22279/LO_NIFW22279-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Zapatillas Nike Court", "El peso del calzado puede variar según el número solicitado. Los talles corresponden a numeración de Argentina", 50699, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw6b73a139/products/NI_DH2987-100/NI_DH2987-100-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Zapatillas Nike Air Max", "Las zapatillas Nike Air Max Sc representan el clásico estilo Air MAx con líneas fáciles de llevar y amortiguación Air Visible, estas zapatillas prometen comodidad y amortiguación perfecta. Además, tienen un acabo ideal que completa cualquier look, tanto deportivo como urbano. El estilo de confección y sus materiales, agregan profundidad al calzado y a la vez, lo convierten en una compañía super duradera y liviana para el uso diario. Ponételas con unos joggins o un jean, siempre quedan de 10.", 38299, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw0ca20125/products/NI_CW4554-400/NI_CW4554-400-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Camiseta Homenaje 86 Alternativa", "La Camiseta Le Coq Sportif Argentina Homenaje 86 Alternativa te lleva a aquellos momentos de felicidad previos a la Copa Mundial que consagró a Argentina ganadora del mundo. Esta prenda está inspirada en el partido amistoso jugado una semana antes del comienzo del Mundial 86 en Colombia contra Junior de Baranquilla. Su diseño rememora el utilizado por los jugadores en aquel partido, con el escudo termoadherido, el número 10 en la espalda y el logo coronados de gloria aplicado en transfer. Su confección en poliéster liviano y suave para que sientas el confort en todo momento. Qué placer mayor el de tener esta Camiseta en tu ropero.", 19999, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dwdcd3612b/products/LE_LTN0222155/LE_LTN0222155-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Remera Nike Dri-Fit", "Lo clásico no es sinónimo de aburrido; lleva la Remera Nike Dri-Fit Wild Top y lucí una prenda de todos los días con un look renovado y urbano. El calce regular te permite moverte libremente y la composición en algodón garantiza una suavidad y comodidad únicas para que enfrentes tu rutina con todo el confort posible.", 10199, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw9b57f5fc/products/NI_DD6288-869/NI_DD6288-869-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Remera Puma Power", "La Remera Puma Power está pensada para crear un look deportivo creativo y eficiente para tus momentos de entrenamiento. Está hecha con un algodón suave que te mantiene cómodo y te da suavidad mientras que la lleves puesta. Su estampa creando franjas diagonales con el logo, crea un diseño impactante para vos. Combinala con tus shorts favoritos y mostrale a todos lo que tenés para dar!", 8299, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dw76ecc48c/products/PU_672765-02/PU_672765-02-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Remera Topper Gtw Loose", "La Remera Topper Loose brinda un look casual y fácil de combinar con todos tus outfits. Lucila en la facultad, en el trabajo y en tus salidas. El estampado es el protagonista discreto de una remera con un toque de color y estilo. Disfruta de tu rutina con todo el confort posible gracias a la suavidad del algodón y que nada te frene.", 5999, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dwd93d86ea/products/TO_165405/TO_165405-1.JPG");
insert into Producto_base (prod_base_nombre, prod_base_descripcion, prod_base_precio, prod_base_tiempo, prod_base_foto)
	values ("Campera Topper Rtc", "Confeccionada en poliéster y fue pensada para ser un must en tu ropero a la hora de elegir tu outfit y salir a la calle. Sus bolsillos te permiten guardar tus pertenencias, mientras que el cierre frontal completo ayuda a vestirla rápidamente y mantenerte abrigada en los días de menor temperatura.", 12299, 3, "https://www.dexter.com.ar/on/demandware.static/-/Sites-dabra-catalog/default/dwc544a724/products/TO_162917/TO_162917-1.JPG");

-- PERSONALIZACIONES
insert into Personalizacion (pers_nombre, pers_precio) values ("Impresión directa", 550);
insert into Personalizacion (pers_nombre, pers_precio) values ("Serigrafía", 899);
insert into Personalizacion (pers_nombre, pers_precio) values ("Hot print", 1000);
insert into Personalizacion (pers_nombre, pers_precio) values ("Sublimación", 850);
insert into Personalizacion (pers_nombre, pers_precio) values ("Bordado", 2500);
insert into Personalizacion (pers_nombre, pers_precio) values ("Full Print", 1150);
insert into Personalizacion (pers_nombre, pers_precio) values ("Transfer Digital", 750);
insert into Personalizacion (pers_nombre, pers_precio) values ("Impresión UV", 850);
insert into Personalizacion (pers_nombre, pers_precio) values ("Grabado", 3000);
insert into Personalizacion (pers_nombre, pers_precio) values ("Vinilo", 270);

-- PRODUCTOS PERSONALIZABLES
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 1);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 3);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 5);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 7);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 8);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (1, 10);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (2, 2);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (2, 3);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (2, 6);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (2, 7);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (3, 9);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (3, 10);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (4, 2);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (4, 5);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (4, 8);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (5, 2);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (5, 6);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (5, 7);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (5, 8);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (5, 9);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (6, 6);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (7, 8);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (8, 9);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (9, 10);
insert into Producto_personalizable (prod_pers_producto_base, prod_pers_personalizacion) values (10, 4);

-- PRODUCTOS PERSONALIZADOS
-- TIENDA 1
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (24,"Corazones naranjas", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (12,"Kiwis y sandias", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (6," Patitas de gato", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (9,"Hojas de ginko", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (5,"Plumas azules", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (16,"Qatar 2022", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (14,"Ravioles con queso", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (1,"Music Fantacy", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (23,"Navidark", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (3,"Flores de Jazmín", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (11,"The Beatles", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (25,"Rainbow", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (8,"Autos antiguos", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (21,"Emojis", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (7,"Naturaleza", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (19,"Cactus", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (10,"Animales salvajes", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (15,"Harry Potter", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (20,"Coldplay", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (4,"Messi campeón", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (22,"Videojuegos", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (17,"BTS", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (2,"Counter Strike", "Activo", 1);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (18,"Sopa de letras", "Activo", 1);
    
-- TIENDA 2
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (2,"Luz solar", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (3,"Techno", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (7,"Physics Board", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (10,"Pac-Man", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (11,"Tetris", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (16,"Tabla periódica", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (17,"Aviación", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (20,"Notas musicales", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (21,"Mandala", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (22,"Planeta tierra", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (23,"Mosaico africano", "Activo", 2);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (24,"Mickey Mouse", "Activo", 2);


-- TIENDA 3
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (1,"Rompecabezas", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (7,"Mozaico Barroco", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (11,"Manchas de pintura", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (13,"Constelaciones", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (16,"Llamaradas de colores", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (21,"Espacio exterior", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (22,"Montaña rusa", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (23,"Mondrian", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (24,"Banda de jazz", "Activo", 3);
insert into Producto_personalizado (prod_pers_producto_personalizable, prod_pers_personalizacion, prod_pers_estado, prod_pers_tienda) values (25,"Nubes de lluvia", "Activo", 3);

