# Grupo Mok
# Descripción
Se desarrolla una base de datos de prueba con 4 tablas y donde la tabla ESCRITURAS va a contener informacion para porbar los endpoints.
# Tecnologías Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- IntelliJ IDEA
- Maven
# Requisitos del Sistema
- Java 17 o superior
- MySQL 8.0 o superior
- IntelliJ IDEA (o cualquier otro IDE compatible)
# Configuración y Ejecución
- Clona el repositorio: https://github.com/devpcarlos/GrupoMok.git
- Abre el proyecto en Intellij IDEA
- Configura la conexión a la base de datos MySQL:
   - Abre el archivo application.properties.
   - Actualiza los valores de spring.datasource.url, spring.datasource.username y spring.datasource.password con tus credenciales de MySQL.
   - Recuerda tener la base de datos creada create database Mok
# Datos para probar el endpoint y obtener la informacion en la tablas escrituras de la base de datos mok.
 - INSERT INTO escrituras (genero, created) 
VALUES ('Genero epico', NOW()),
('Subgeneros Narrativos', NOW()),
('Subgeneros Liricos', NOW()),
('Subgeneros Dramaticos', NOW()),
('Narrativa', NOW()),
('lirica', NOW()),
('dramatica', NOW()),
('epica', NOW()),
('didacticas', NOW()),
('ficcion', NOW()),
('Subgeneros uno', NOW()),
('Subgeneros dos', NOW());
- Puedes usar el endpoint para traer toda la informacio http://localhost:8080/escrituras o buscar por el genero http://localhost:8080/escrituras/{genero} 
