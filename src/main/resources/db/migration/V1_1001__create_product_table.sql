------------------------------------------------------
--            Irupi Tables Setup         --
------------------------------------------------------
create table product (
  id                             varchar(36),  -- uuid
  -- -------------------------------------------------
  usuario_registro          	 varchar(50),
  precio_br                  	 decimal(15,2),
  precio_col                  	 decimal(15,2),
  -- -------------------------------------------------
  cantidad                       integer,
  mes_registro                   integer,
  fecha_registro                 timestamp,
  descripcion          	 		 varchar(50),
  nombre          	 			 varchar(50),
  primary key (id)
);

