![](https://desvinculados.viewnext.com/Recursos/Imagenes/logo-viewnext.png)


![Static Badge](https://img.shields.io/badge/Spring-grey?logo=spring) ![Static Badge](https://img.shields.io/badge/IntelliJ-IDEA-grey?logo=IntelliJ-IDEA) ![Static Badge](https://img.shields.io/badge/Visual%20Studio%20Code-grey?logo=visual-studio-code) ![Static Badge](https://img.shields.io/badge/JavaScript-grey?logo=JavaScript)






[Descripción del proyecto](#creación-de-microservicios-agencia-de-viajes)

[Estado del proyecto](#estado-del-proyecto)


## Creación de microservicios agencia de viajes

Se pretende crear una aplicación para una agencia de viajes, basada en microservicios. En el  backend, la 
aplicación constará de tres microservicios que accederán a una base de datos. Se trata de los 
microservicios de hotel, vuelos y reservas 

### [Servicio de hotel](https://github.com/MrHarvyson/Proyecto_Viewnext/tree/main/hotelMicroservicio)

A partir de una tabla de hoteles que incluye los siguientes campos: idHotel (autonumérico), 
nombre, categoria, precio y disponible (si o no), se crearán los siguientes recursos: 
- Ante una petición get, devuelve la lista de hoteles disponibles. 
- Mediante otra petición get, se obtendrán los datos de un hotel a partir de su nombre.

### [Servicio vuelos](https://github.com/MrHarvyson/Proyecto_Viewnext/tree/main/vueloMicroservicio)

Actúa sobre una tabla de vuelos con los siguientes campos: idVuelo (autonumérico), compañia, 
fechaVuelo, precio y plazas disponibles. 

Expone dos recursos: 
 
- Un recurso que devuelve la lista de vuelos disponibles al recibir una petición get. La  URL 
incluye el total de plazas que se pretenden reservar y se deberán devolver los  datos de 
los vuelos que tengan plazas suficientes para dicho valor.

- Un recurso que al recibir una petición put actualiza los datos del vuelo indicado. Recibe 
en la url el idVuelo y las plazas reservadas.

### [Servicio reservas](https://github.com/MrHarvyson/Proyecto_Viewnext/tree/main/reservaMicroservicio)

Utiliza una tabla de reservas con los siguientes campos: idReserva(autonumérico), 
nombreCliente, dni, idHotel e idVuelo. Tendrá los siguientes recursos 

- Expone un recurso que ante una petición de tipo post, que recibe en el cuerpo de la 
misma un objeto JSON con el identificador vuelo, identificador hotel, nombre, dni y total 
de personas que forman la reserva, registrará la misma en la base de datos. Interacciona 
con el servicio de vuelos para actualizar las plazas disponibles al realizar la reserva. 

- Dispondrá de otro recurso que, ante una petición get, devolverá las reservas existentes 
(nombre, dni, vuelo), para el nombre hotel recibido como variable en url. Deberá 
interaccionar con el servicio de hoteles para conocer el idHotel a partir de su nombre

# ESTADO DEL PROYECTO

<h4 align="center">
:construction: Proyecto en construcción :construction:
</h4>

# :hammer:Funcionalidades del proyecto

- `Funcionalidad 1` : listar todos los hoteles que tenemos registrado en la base de datos.
- `Funcionalidad 2` : obtener los datos del hotel que pidamos.
- `Funcionalidad 3` : listar todos los hoteles disponibles.
- `Funcionalidad 4` : listar todos los vuelos.
- `Funcionalidad 5` : listar los vuelos que disponen de la cantidad de plazas que tienen.
- `Funcionalidad 6` : actualizar un vuelo segun las plazas que se le pase.
- `Funcionalidad 7` : lista de todas las reservas.
- `Funcionalidad 8` : lista de reservar para el nombre del hotel que se le pase (nombre, dni, idvuelo).
- `Funcionalidad 9` :crear una reserva y que se actualice en el microservicio de vuelos las plazas disponibles


Disponemos de una [página web](https://github.com/MrHarvyson/Proyecto_Viewnext/tree/main/htmlAgencia) para usar la mayoría de los endPoints.

---

# END POINTS

## HOTEL

`@GET`: lista de todos los hoteles
http://localhost:8000/hoteles

`@GET`: hotel con el nombre tal
http://localhost:8000/hoteles/{nombre}

`@GET`: lista hoteles disponibles
http://localhost:8000/hoteles/disponibles

## VUELO

`@GET`: lista de todos los vuelos
http://localhost:9000/vuelos

`@GET`: lista de vuelos disponible segun plazas de reservas enviadas
http://localhost:9000/vuelos/{plazas}

`@PUT`: actualizar un vuelo segun las plazas que se le pasan para reservar
http://localhost:9000/vuelos/{idvuelo}/{plazasreservadas}

## RESERVA

`@GET`: lista de todas las reservas
http://localhost:8080/reservas

`@GET`: lista de reservar para el nombre del hotel que se le pase (nombre, dni, idvuelo)
http://localhost:8080/reservas/{nombre}
(puede probar con los nombre de hoteles Hotel Valencia o Hotel Málaga para que salgan más de un resultado)

`@POST`: creamos una reserva y se actualiza en el microservicio de vuelos las plazas disponibles
http://localhost:8080/reservas

