DROP TABLE vehiculo;

CREATE TABLE vehiculo(
	idVehiculo INTEGER 	PRIMARY KEY not null AUTO_INCREMENT,
	marca VARCHAR(30),
	color VARCHAR(30),
	modelo INTEGER,
	idTipo VARCHAR(10) not null,
	UNIQUE (idTipo)

)ENGINE=InnoDB;

create table automovil (
    idAutomovil INTEGER AUTO_INCREMENT not null primary key,
    idTipoVehiculo VARCHAR(20),
	 tipoEncendido	VARCHAR(15),
	 tipoTraccion VARCHAR(15),
    foreign key(idTipoVehiculo) references vehiculo(idTipo) ON DELETE CASCADE
) engine=innodb;

create table avion (
    idAvion INTEGER AUTO_INCREMENT not null primary key,
    idTipoVehiculo VARCHAR(20),
	 tipoAvion	VARCHAR(15),
	 propulsores VARCHAR(15),
    foreign key(idTipoVehiculo) references vehiculo(idTipo) ON DELETE CASCADE
) engine=innodb;

create table bicicleta (
    idBicicleta INTEGER AUTO_INCREMENT not null primary key,
    idTipoVehiculo VARCHAR(20),
	 tipoBicicleta	VARCHAR(15),
	 tipoFrenos VARCHAR(15),
	 Velocimetro BOOL,
    foreign key(idTipoVehiculo) references vehiculo(idTipo) ON DELETE CASCADE
) engine=innodb;

create table motocicleta (
    idMotocicleta INTEGER AUTO_INCREMENT not null primary key,
    idTipoVehiculo VARCHAR(20),
	 cascos	INTEGER,
	 tipoMotocicleta VARCHAR(15),
	 tipoEncendido VARCHAR(15),
    foreign key(idTipoVehiculo) references vehiculo(idTipo) ON DELETE CASCADE
) engine=innodb;

INSERT INTO vehiculo values (0,'vw','BLANCO',1984,'AU001');

INSERT INTO automovil values(0,'AU001','Electronico','4x4');


SELECT * FROM vehiculo v inner join automovil a on a.idTipoVehiculo = v.idTipo ;

SELECT * FROM automovil;

DELETE FROM vehiculo WHERE idTipo='AU001'; 

