use farmacia;

ALTER TABLE MEDICAMENTOS
DROP FOREIGN KEY medicamentos_ibfk_1;
 
ALTER TABLE MEDICAMENTOS
Drop column id_categoria;
 
ALTER TABLE MEDICAMENTOS
ADD COLUMN categoria nvarchar(200)
DEFAULT 'Pastillas';
 
SELECT * FROM MEDICAMENTOS;

ALTER TABLE factura_detalle
DROP FOREIGN KEY factura_detalle_ibfk_2;


CREATE TABLE sugerencia (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    sugerencia TEXT
);

INSERT INTO sugerencia (nombre, sugerencia) VALUES 
('Jonathan', 'Mejorar atención');

select * from sugerencia;