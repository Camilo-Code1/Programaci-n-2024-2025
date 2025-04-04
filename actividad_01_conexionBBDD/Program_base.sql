DROP DATABASE IF EXISTS BBDD_PROM;
CREATE DATABASE BBDD_PROM;
USE BBDD_PROM;


-- Crear tabla de tipos
CREATE TABLE Tipo (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL
);

-- Crear tabla de productos
CREATE TABLE Producto (
    id INT PRIMARY KEY AUTO_INCREMENT,
    referencia VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    tipo_id INT,
    cantidad INT NOT NULL,
    precio DOUBLE NOT NULL,
    descuento INT DEFAULT 0,
    iva INT DEFAULT 0,
    aplicar_dto BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (tipo_id) REFERENCES Tipo(id)
);
-- Insertar tipos
INSERT INTO Tipo (nombre) VALUES ('Electrónica');
INSERT INTO Tipo (nombre) VALUES ('Ropa');
INSERT INTO Tipo (nombre) VALUES ('Alimentos');
INSERT INTO Tipo (nombre) VALUES ('Hogar');
INSERT INTO Tipo (nombre) VALUES ('Juguetes');
INSERT INTO Tipo (nombre) VALUES ('Deportes');
INSERT INTO Tipo (nombre) VALUES ('Libros');
INSERT INTO Tipo (nombre) VALUES ('Belleza');
INSERT INTO Tipo (nombre) VALUES ('Automóvil');
INSERT INTO Tipo (nombre) VALUES ('Música');

-- Insertar productos
INSERT INTO Producto (referencia, nombre, descripcion, tipo_id, cantidad, precio, descuento, iva, aplicar_dto) VALUES 
('E001', 'Smartphone', 'Smartphone de última generación con pantalla AMOLED.', 1, 50, 699.99, 10, 21, TRUE),
('R001', 'Camisa de Algodon', 'Camisa de algodón 100% para uso diario.', 2, 100, 29.99, 5, 21, FALSE),
('A001', 'Galletas', 'Deliciosas galletas de chocolate.', 3, 200, 2.50, 0, 10, FALSE),
('H001', 'Sofa', 'Sofá cómodo y elegante para tu sala.', 4, 20, 499.99, 15, 21, TRUE),
('J001', 'Peluche', 'Muñeca de peluche suave y adorable.', 5, 150, 19.99, 0, 21, FALSE),
('D001', 'Balon', 'Balón de fútbol de alta calidad.', 6, 75, 24.99, 0, 21, FALSE),
('L001', 'Novela', 'Una novela clásica de la literatura mundial.', 7, 300, 15.99, 0, 10, FALSE),
('B001', 'Crema Hidratante', 'Crema hidratante para todo tipo de piel.', 8, 50, 12.99, 5, 21, TRUE),
('A002', 'Aceite de Motor', 'Aceite de motor sintético para vehículos.', 9, 40, 29.99, 0, 21, FALSE),
('M001', 'CD de Múusica', 'Álbum de música popular.', 10, 100, 9.99, 0, 10, FALSE);
