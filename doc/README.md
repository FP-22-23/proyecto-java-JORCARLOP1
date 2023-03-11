# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  22/23)
Autor/a: JORGE CARRASCAL LÓPEZ   uvus:JORCARLOP1

Aquí debes añadir la descripción del dataset y un enunciado del dominio del proyecto.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset o datasets del proyecto
    * **\<dataset1.csv\>**: Añade una descripción genérica del dataset.
    * **\<dataset2.csv\>**: Añade una descripción del resto de datasets que puedas tener.
    
## Estructura del *dataset*

Aquí debes describir la estructura del dataset explicando qué representan los datos que contiene y la descripción de cada una de las columnas. Incluye también la URL del dataset original.

El dataset está compuesto por \<N\> columnas, con la siguiente descripción:

* **\<num>**: de tipo \<INTEGER\>, da la enumeracion de datos
* **\<date>**: de tipo \<tipo\>, fecha de solicitud del solicitante
* **\<cheveux>**: de tipo \<String\>, color de pelo del solicitante
* **\<age>**: de tipo \<int\>, edad del solicitante
* **\<exp>**: de tipo \<int\>, experiencia del solicitante
* **\<salaire>**: de tipo \<Int\>, expectativa de salario
* **\<sexe>**: de tipo \<String\>, sexo del solicitante
* **\<diplome>**: de tipo \<String\>, diplomatura del solicitante
* **\<specialite>**: de tipo \<String\>, especialidad del solicitante
* **\<note>**: de tipo \<Double\>, nota del solicitante sobre la búsqueda de oro
* **\<dispo>**: de tipo \<Boolean\>, disponibilidad del solicitante
* **\<embauche>**: de tipo \<Boolean\>, contratado del solicitante
* **\<paises>**: de tipo \<List<String>>\>, expectativa de paises del solicitante

## Tipos implementados

Describe aquí los tipos que usas en tu proyecto.

### Tipo Base
Descripción breve del tipo base.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Muestra los datos de todo el csv
- C2: Muestra numero, fecha de solicitud, pelo y edad 
- ...

**Restricciones**:
 
- R1: La experiencia no puede ser 0
- R2: La fecha no puede ser la actual
- R3: El num no puede ser nulo
- ...
- 
**Criterio de igualdad**: Compara los valores del CSV

**Criterio de ordenación**: Ordena a partir de Num.

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...

#### Tipos auxiliares
Descripción de los tipos auxiliares que sean necesarios añadir al proyecto.

### Factoría
Descripción breve de la factoría.

- _comprobar_disponibilidad_: hace un booleano por oui o non.
- _comprobar_contrato_: hace un booleano por 0 o 1.
- _creador_lista_: a partir de los datos separados por ';'.

### Tipo Contenedor

Descripción breve del tipo contenedor.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Descripción de la restricción 1.
- R2: Descripción de la restricción 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenación**: Describir el criterio de ordenación (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...
