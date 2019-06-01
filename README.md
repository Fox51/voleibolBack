# voleibolBack

Instrucciones:
- instalar las dependencias maven: clean install

Formato 
(get, post, put)
http://localhost:8080/volleyball/equipos/
http://localhost:8080/volleyball/partidos/
http://localhost:8080/volleyball/sets/

(get, delete)
http://localhost:8080/volleyball/equipos/id
http://localhost:8080/volleyball/partidos/id
http://localhost:8080/volleyball/sets/id

Añadir:
* Equipos:
{
	"equipoNombre":"B"
}

* Partidos:
{
    "fechaEncuentro": "2019-06-01",
    "listaDeSets": [{ "numeroSet": 1 }, { "numeroSet": 2 }]
}

