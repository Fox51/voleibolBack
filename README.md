# voleibolBack

Instrucciones:
- instalar las dependencias maven: clean install

## Formato 
### (get, post, put)
* /volleyball/equipos/
* /volleyball/partidos/
* /volleyball/sets/

### (get, delete)
* /volleyball/equipos/id
* /volleyball/partidos/id
* /volleyball/sets/id

## Añadir:
* Equipos:
{
	"equipoNombre":"B"
}

* Partidos:
{
    "fechaEncuentro": "2019-06-01",
    "listaDeSets": [{ "numeroSet": 1 }, { "numeroSet": 2 }]
}

