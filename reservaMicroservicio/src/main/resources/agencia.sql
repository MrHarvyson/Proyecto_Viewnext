CREATE SCHEMA agencia;

USE agencia;

CREATE TABLE hoteles (
    idhotel INT AUTO_INCREMENT,
    nombre VARCHAR(255),
    categoria VARCHAR(255),
    precio DECIMAL(10, 2),
    disponible BOOLEAN,
    url VARCHAR(255),
    descripcion VARCHAR(255),
    PRIMARY KEY (idhotel)
);

CREATE TABLE vuelos (
    idvuelo INT AUTO_INCREMENT,
    compania VARCHAR(255),
    fechavuelo DATE,
    precio DECIMAL(10, 2),
    plazasdisponibles INT,
    PRIMARY KEY (idvuelo)
);

CREATE TABLE reservas (
    idreserva INT AUTO_INCREMENT,
    nombrecliente VARCHAR(255),
    dni VARCHAR(9),
    totalreservas INT,
    idhotel INT,
    idvuelo INT,
    PRIMARY KEY (idreserva),
    FOREIGN KEY (idhotel) REFERENCES Hoteles(idhotel),
    FOREIGN KEY (idvuelo) REFERENCES Vuelos(idvuelo)
);

INSERT INTO hoteles (nombre, categoria, precio, disponible, url, descripcion) VALUES
('NH Hotel Group', '5 estrellas', 150.00, true,'https://huakai.es/wp-content/uploads/2023/07/35-45-anos-copia.webp','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.'),
('RIU Hotels & Resorts', '4 estrellas', 120.00, true,'https://huakai.es/wp-content/uploads/2023/07/MESAS-DE-TRABAJO-WEBMesa-de-trabajo-1-copia.png','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.'),
('Grupotel Hotels & Resort', '3 estrellas', 90.00, false,'https://huakai.es/wp-content/uploads/2023/07/35-45-anos-copia.webp','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.'),
('Payasol Ibiza Hotels', '5 estrellas', 200.00, true,'https://huakai.es/wp-content/uploads/2023/07/MESAS-DE-TRABAJO-WEBMesa-de-trabajo-1.png','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.'),
('Meliá', '4 estrellas', 130.00, false,'https://huakai.es/wp-content/uploads/2023/07/35-45-anos-copia.webp','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.'),
('Barcelo', '3 estrellas', 80.00, true,'https://huakai.es/wp-content/uploads/2023/07/MESAS-DE-TRABAJO-WEBMesa-de-trabajo-1-copia-2.png','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.'),
('Iberostar', '5 estrellas', 210.00, false,'https://huakai.es/wp-content/uploads/2023/07/35-45-anos-copia.webp','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.'),
('Eurostars', '4 estrellas', 110.00, true,'https://huakai.es/wp-content/uploads/2023/07/Mexico-Fotos-GoPro-584x438-2.webp','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.'),
('Hotel Cuevas', '3 estrellas', 70.00, true,'https://huakai.es/wp-content/uploads/2023/09/Sin-titulo-600-x-402-px.png','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.'),
('Vincci Soho', '5 estrellas', 160.00, true,'https://huakai.es/wp-content/uploads/2023/09/Diseno-sin-titulo-2023-09-25T154810.664.webp','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget efficitur ante. Quisque ac nunc ut neque placerat sodales quis id est. Curabitur non pulvinar magna. Nunc nec arcu ex.');

INSERT INTO vuelos (compania, fechavuelo, precio, plazasdisponibles) VALUES
 ('Iberia', '2023-12-01', 100.00, 200),
 ('Air Europa', '2023-12-02', 120.00, 180),
 ('Ryanair', '2023-12-03', 50.00, 220),
 ('Vueling', '2023-12-05', 80.00, 190),
 ('Air France', '2023-12-07', 140.00, 160),
 ('Emirates', '2023-12-09', 200.00, 100);

INSERT INTO reservas (nombrecliente, dni, totalreservas, idhotel, idvuelo) VALUES
('Juan Pérez', '12345678A', 1, 1, 1),
('Luis Cabezas', '12334421A', 1, 2, 1),
('Ana Gómez', '23456789B', 2, 3, 2),
('Carlos Martínez', '34567890C', 1, 3, 3),
('María Rodríguez', '45678901D', 2, 4, 4),
('Pedro García', '56789012E', 1, 5, 5),
('Isabel Fernández', '67890123F', 2, 6, 6),
('Jose Carlos', '28844912Z', 1, 7, 1),
('Javier González', '78901234G', 1, 8, 2),
('Carmen López', '89012345H', 2, 8, 6),
('Francisco Torres', '90123456I', 1, 8, 2),
('Lucia Morneo', '90123456J', 1, 9, 2),
('Teresa Sánchez', '01234567J', 2, 10, 5);
