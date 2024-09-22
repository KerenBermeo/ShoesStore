-- Inserta roles
INSERT INTO rol (rol_name) VALUES 
('SUPERADMIN'), 
('ADMIN'), 
('CLIENTE'), 
('ANONIMO');

-- Inserta permisos
INSERT INTO permissions (permission_name) VALUES 
('CREAR_ADMIN'), 
('ACTIVAR_DESACTIVAR_ADMIN'), 
('CREAR_PRODUCTO'), 
('VER_PRODUCTOS'), 
('COMPRAR_PRODUCTOS');

-- Relaciona roles con permisos
INSERT INTO rol_permissions (rol_id, permission_id) VALUES
(1, 1), -- SUPERADMIN -> CREAR_ADMIN
(1, 2), -- SUPERADMIN -> ACTIVAR_DESACTIVAR_ADMIN
(2, 3), -- ADMIN -> CREAR_PRODUCTO
(2, 4), -- ADMIN -> VER_PRODUCTOS
(3, 4), -- CLIENTE -> VER_PRODUCTOS
(3, 5), -- CLIENTE -> COMPRAR_PRODUCTOS
(4, 4); -- ANONIMO -> VER_PRODUCTOS
