# voleibolBack

Instrucciones:
- instalar las dependencias maven: clean install
- SA Tomcat 9

## Base de datos
MySql - MariaDB

## Arquitectura
Modelo-DAO-Servicio

## Formato 
### (get, post, put)
* /voleibolBack/equipos/
* /voleibolBack/partidos/
* /voleibolBack/sets/

### (get, delete)
* /voleibolBack/equipos/{id}
* /voleibolBack/partidos/{id}
* /voleibolBack/sets/{id}

## Añadir:
* Crear Equipos:
{
	"equipoNombre":"A",
	"equipoPuntuacion": 0
}

* Crear Partido:
{
    "fechaEncuentro": "2019-06-01"
}

* Asignar con Update Equipos a Partido:
{
    "partidoId": 3,
    "fechaEncuentro": "2019-06-01",
    "lista de equipos": [
		{
			"equipoNombre":"A",
			"equipoPuntuacion": 0
		},
		{
			"equipoNombre":"B",
			"equipoPuntuacion": 0
		}
	]
}

* Crear Set:
{
	"numeroSet":"1"
}

* Asignar Equipos a Set
{
	"setId": 5,
	"numeroSet":"1",
	"puentuaciones": [
		{
			"equipoNombre":"A",
			"equipoPuntuacion": 10
		},
		{
			"equipoNombre":"B",
			"equipoPuntuacion": 15
		}
	]
}

* Actualizar Puntuacion a Partido:
{
    "partidoId": 3,
    "fechaEncuentro": "2019-06-01",
    "lista de equipos": [
		{
			"equipoNombre":"A",
			"equipoPuntuacion": 10
		},
		{
			"equipoNombre":"B",
			"equipoPuntuacion": 15
		}
	]
}

* Repetir...

