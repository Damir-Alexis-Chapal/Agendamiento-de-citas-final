CREATE DATABASE agendamiento;
USE agendamiento;

CREATE TABLE cliente(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
	contraseña VARCHAR(255) NOT NULL,
	nombre_usuario VARCHAR(255) NOT NULL
);
CREATE TABLE barbero(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL
);

CREATE TABLE Cita (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    idCliente BIGINT NOT NULL,
    idBarbero BIGINT NOT NULL,
    servicio VARCHAR(200),
    precioServicio BIGINT,
    FOREIGN KEY (idCliente) REFERENCES cliente(id),
    FOREIGN KEY (idBarbero) REFERENCES barbero(id),
    UNIQUE (fecha, hora, idBarbero) -- para evitar citas duplicadas en la misma fecha/hora con el mismo barbero
);


INSERT INTO cliente (nombre, apellido, contraseña, nombre_usuario) VALUES ('Alexis', 'Cha','follamarias','alexis23');
INSERT INTO cliente (nombre, apellido, contraseña, nombre_usuario) VALUES ('Maria', 'De los angeles', 'holabb','qmaspues');

INSERT INTO barbero(nombre, apellido) VALUES ('admin', 'admin');
INSERT INTO barbero(nombre, apellido) VALUES ('alexis', 'admin');
INSERT INTO barbero(nombre, apellido) VALUES ('angel', 'admin');

show tables;

select * from cliente;
select * from Cita;	
select * from barbero;

DELETE FROM barbero;

select SUM(precioServicio) AS GananciaTotal from Cita;

ALTER TABLE barbero ADD CONSTRAINT unique_nombre_apellido UNIQUE (nombre, apellido);
ALTER TABLE cliente ADD CONSTRAINT unique_nombreU_contraseña UNIQUE (nombre_usuario, contraseña);




