USE barberia;

INSERT INTO Usuario (nombre, apellido) VALUES ('Juan', 'Perez');
INSERT INTO Usuario (nombre, apellido) VALUES ('Maria', 'Gomez');

INSERT INTO Barbero (nombre, apellido) VALUES ('Carlos Rodriguez', 'Corte Clásico');
INSERT INTO Barbero (nombre, apellido) VALUES ('Luis Hernandez', 'Afeitado');

INSERT INTO Cita (fecha, hora, usuario_id, barbero_id) VALUES ('2024-08-10', '10:00:00', 1, 1);
INSERT INTO Cita (fecha, hora, usuario_id, barbero_id) VALUES ('2024-08-11', '11:00:00', 2, 2);

SELECT * FROM Usuario;
