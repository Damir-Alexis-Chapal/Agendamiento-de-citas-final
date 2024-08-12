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

CREATE TABLE cita(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    cliente_id BIGINT,
    barbero_id BIGINT,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id),
    FOREIGN KEY (barbero_id) REFERENCES barbero(id),
    UNIQUE (fecha, hora, barbero_id) -- Evitar citas duplicadas en la misma fecha/hora con el mismo barbero
);

INSERT INTO cliente (nombre, apellido, contraseña, nombre_usuario) VALUES ('Alexis', 'Cha','follamarias','alexis23');
INSERT INTO cliente (nombre, apellido, contraseña, nombre_usuario) VALUES ('Maria', 'De los angeles', 'holabb','qmaspues');
INSERT INTO barbero(nombre, apellido) VALUES ('admin', 'admin');
show tables;

select * from cliente;
select * from cita;
select * from barbero;

