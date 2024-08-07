create database barberia;
use barberia;

create table Usuario(
id bigint auto_increment primary key,
nombre varchar(20),
apellido varchar(20)
);

create table Barbero(
id bigint auto_increment primary key,
nombre varchar(20),
apellido varchar(20)
);

create table Cita(
id bigint auto_increment primary key,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    usuario_id bigint,
    barbero_id bigint,
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id),
    FOREIGN KEY (barbero_id) REFERENCES Barbero(id)
);

show tables;

DESCRIBE Usuario;
DESCRIBE Barbero;
DESCRIBE Cita;
