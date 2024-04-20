# GestionSistemaHotel

Explicación del Sistema de Gestión de Hotel
El sistema de gestión de hotel es una aplicación Java que permite a los usuarios y administradores interactuar con un hotel. Proporciona funcionalidades como iniciar sesión como usuario o administrador, registrar nuevos usuarios, buscar habitaciones disponibles, realizar reservas, cancelar reservas y ver detalles de las reservas pasadas y activas. Los administradores tienen acceso adicional para añadir o eliminar habitaciones, cambiar detalles de las habitaciones y ver listas de todas las reservas.

Explicación de las Clases
1.	MainApp: Esta es la clase principal que contiene el método main donde se inicializa el sistema de gestión de hotel y se llama al método run para ejecutar el sistema.

2.	sistemaGestionHotel: Esta clase representa el sistema de gestión de hotel. Contiene métodos para manejar el inicio de sesión de usuarios y administradores, el registro de nuevos usuarios, y la ejecución del menú de opciones para usuarios y administradores.

3.	User: Esta clase representa a un usuario del sistema. Tiene propiedades como username y password, así como métodos para obtener el nombre de usuario.
4.	Admin: Similar a la clase User, pero representa a un administrador del sistema.

5.	UserMenu: Una clase interna de sistemaGestionHotel que maneja el menú de opciones para usuarios. Contiene métodos para buscar habitaciones disponibles, reservar una habitación, cancelar reservas y ver detalles de las reservas.

6.	Hotel: Esta clase representa un hotel. Contiene métodos para buscar habitaciones por número y obtener todas las reservas del hotel.

7.	Habitacion: Representa una habitación en el hotel. Tiene métodos para establecer el tipo de habitación, el precio por noche, el número máximo de huéspedes y las comodidades.

8.	Reserva: Esta clase representa una reserva de habitación.

En resumen, el sistema de gestión de hotel proporciona una interfaz sencilla de consola para que los usuarios y administradores interactúen con el hotel, realizando operaciones como reservar habitaciones, administrar reservas y gestionar detalles de las habitaciones.

Instrucciones para ejecutar el sistema de gestión de hotel:
1.	Configuración del entorno de desarrollo:
•       Asegúrate de tener instalado Java Development Kit (JDK) en tu sistema.
•	Puedes descargar e instalar JDK desde el sitio web oficial de Oracle o utilizar una distribución de Java como OpenJDK.

2.	Descarga del código fuente:
•	Descarga todos los archivos de código fuente proporcionados en un directorio en tu sistema.

3.	Compilación del código fuente:
•	Abre una terminal o línea de comandos.
•	Navega al directorio donde guardaste los archivos de código fuente.
•	Utiliza el comando javac *.java para compilar todos los archivos .java en el directorio.

4.	Ejecución del sistema:
•	Una vez compilados los archivos, utiliza el comando java MainApp para ejecutar la aplicación.

5.	Interacción con el sistema:
•	Sigue las instrucciones proporcionadas por la aplicación en la consola para interactuar con el sistema.
•	Puedes elegir entre iniciar sesión como usuario, iniciar sesión como administrador, registrarte como nuevo usuario o salir del sistema.

6.	Exploración de las funcionalidades:
•	Explora las diferentes opciones disponibles según tu rol (usuario o administrador).
•	Realiza operaciones como buscar habitaciones disponibles, reservar habitaciones, cancelar reservas, ver detalles de las reservas, añadir o eliminar habitaciones, cambiar detalles de las habitaciones, y ver listas de todas las reservas.

Siguiendo estos pasos, podrás ejecutar y utilizar el sistema de gestión de hotel en tu entorno local.

