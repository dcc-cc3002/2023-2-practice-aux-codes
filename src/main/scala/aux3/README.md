# Enunciado
La idea de este auxiliar práctico es poner en práctica todo lo que es Test Driven Development (TDD)

## Pt. 1: Clonar la repo
La primera parte consiste en clonar este repositorio para ello use el terminal de preferencia con el que pueda acceder a `git`.
En este terminal navegue usando `cd` hasta la carpeta la cual desee **clonar** el repositiorio de auxiliares, tenga presente
que este repositiorio le servirá para todas las auxiliares prácticas del semestre. No se preocupe si clona la carpeta en un lugar distinto,
si no sabe donde esta siempre puede hacer `pwd` para que muestre el directorio en el que se encuentra.

Para clonar el repositorio haga (una vez ubicado en la carpeta destino):
```bash
git clone https://github.com/dcc-cc3002/2023-2-practice-aux-codes.git
```

Esto creará una carpeta nueva llamada '2023-2-practice-aux-codes', puede encontrarla usando `ls` (o `dir` si esta en Windows), para entrar en
la repo haga `cd`:
```bash
cd 2023-2-practice-aux-codes
```

Hay ya estará dentro del proyecto de git:
```bash
git status # funciona!!
git fetch # para ver si hay novedades
git pull # para actualizar el proyecto
```

Para este auxiliar vamos a trabajar con las carpetas `src/main/scala/aux3/problem` y `src/test/scala/aux3/problem`, pero es necesario que cuando
habrá el proyecto lo haga desde la carpeta raíz de este (2023-2-practice-aux-codes) ni más afuera ni más adentro. Asi IntelliJ sabrá donde esta todo.

## Pt 2: SocialY
### Contexto

Ustedes trabajan para una famosa red social llamada T***ter que recientemente ha cambiado de dueño. Es nuevo CEO quiere rehacer todo de nuevo y asegurarse que todo este bien diseñado. 

### Indicaciones
- Cree la clase `SocialY` dentro del paquete social, **OJO**, esta clase NO debe extender del trait `ISocialY`, eso será una *Mousekeherramienta* que nos servirá más tarde.
- Esta clase debe incluir los siguientes métodos:
```scala
def login(username: String, password: String): Boolean
def register(username: String, password: String): Boolean
```

#### Consideraciones
Recuerde que debe hacerlo siguiendo TDD: primero los tests y luego el código. La recomendación es crear la clase `SocialY` pero dejarla en blanco y luego crear la clase `SocialYTest` en el paquete de testing correspondiente y hacer que extienda de  `FunSuite` de Munit.

Para ello debe guiarse de los siguientes requisitos:
- `login`
    - un usuario debe poder loggearse.
    - un usuario que no existe no debe poder loggearse.
    - un usuario solo puede loggearse si su contraseña es correcta.
- `register`
    - un usuario debe poder registrarse.
    - un nueve usuario no puede ocupar un `username` en uso.

***Hint: Puede usar la clase Map (diccionario) de Scala para guardar los username con sus respectivas password***

## Pt 3: User
### Contexto
Al señor Alon (el dueño) parece gustarle su manera de trabajar, asi que como regalo le asigno más trabajo!

Ahora debe crear la clase `User` que representa un usuario dentro de la red social “Y”, para ello esta vez SI haga que este implemente el trait `IUser`.

### Indicaciones
Al extender un trait, la clase debe si o si implementar ciertas funcionalidades. Son justamente estas las que usted tiene que testear primero y luego implementar, de manera similar, debe crear la clas `UserTest` primero y hay hacer testing.

#### Consideraciones
Los requisitos son los siguientes:
- Se debe poder saber la cantidad de seguidores y seguidos de un usuario
- Es obligatorio que el usuario tengo username y password
- Es opcional que el usuario tenga name (es decir, que debe haber un valor por defecto)
- Un usuario puede seguir a multiples usuarios
- Un usuario puede ser seguido por multiples usuario
- Un usuario puede des-seguir a un usuario que siga
- Un usuario no puede seguirse a si mismo
- No se puede seguir 2 veces al mismo usuario (ni des-seguir)
- La contraseña debe ser secreta, por lo que debe haber una forma de autenticar un posible intento

***Hint: Puede usar la clase Set de Scala para guardar los seguidores y seguidos de manera única***

## Pt 4: Refactoring
### Contexto
Un trabajo simplemente impecable, todos en la empresa están maravillados con usted, solo falta la última patita: Arreglar `SocialY`.

Ahora que tiene `IUser` bien implementado, arregle `SocialY`, haciendo que implemente el trait `ISocialY`, si se fija las únicas diferencias es que ahora deben retornar un `Option[IUser]`.

### Indicaciones
Extienda "a la mala" `Social` usando `ISocialY`, cambiando el valor de retorno correspondiente. Recuerde que la gracia de `Option` es que puede retornar `None` o `Some`, es decir, nulo o algo. Si se fija el método `get` de un `Map` usa justamente esto puesto que la llave puede o no estar en el diccionario.

Para este caso `login` funciona de manera muy similar: buscando un `User` en el `Map` y retornandolo con las debidas precauciones. Para el caso del `register` se debe crear el `User` dentro del método y agregarlo a la memoria, luego retornar, de nuevo, con las debidas precauciones.


***Hint:
 En los tests en vez de usar el retorno de las funciones (true or false) use el método isDefined de Option.***








<!-- # TTD -->
<!-- ## Basico (Option) -->
<!-- Correr los tests de `Social` y revisar que tests fallan.  -->
<!---->
<!-- Detalle: -->
<!-- - Arreglar `login`: no verifica si la password es correcta, implememntar el método auth -->
<!-- - Arreglar `register`: no verifica si el usuario existe. -->
<!---->
<!-- Idea: entender la utilidad de testear las funcionalidades deseadas y como se hacen los tests con unos ejemplos -->
<!---->
<!-- ## Intermedio (Testing only) -->
<!-- Hacer tests para las funcionalidades de `Post` -->
<!---->
<!-- Detalle: -->
<!-- - Añadir tests para verificar el content y el owner -->
<!-- - Añadir tests para dar y quitar likes -->
<!---->
<!-- Idea: Unos pocos tests para soltar la mano, el codigo de Posts se entrega completo y listo, solo hacer testing. Sirve para ver la funcionalidad de la estructua Set. -->
<!---->
<!-- ## Dificil (TTD) -->
<!-- Implementar las funcionalidades especificadas en el `trait` `IUser` de buena forma  -->
<!---->
<!-- Detalle: -->
<!-- - Solo tiene el trait, la clase no existe, por lo que se debe crear de 0 -->
<!-- - Primero se hacen los tests -->
<!-- - Luego se hace la implementación -->
<!---->
<!-- Idea: User es relativamente sencillo. Crear un test por cada metodo como minimo. -->
<!---->
<!-- ## Propuesto (Muy dificil (?)) -->
<!-- Extender Post para añadir comentarios y extender Social y User para añadir un buscador de posts de usuarios. -->
<!---->
<!-- Detalle: -->
<!-- - Post debe usar un ArrayBuffer de otros posts para añadir comentarios, y se debe añadir un método en el User para comentar. -->
<!-- - User debe tener un ArrayBuffer de sus posts. -->
<!-- - Social debe preguntarle al User sobre sus posts y entregarlo. -->
<!---->
<!-- Idea: Que sea similar a un "proyecto" de software, en el sentido de que en el enunciado este como "historia de usuario" pero más técnica para guiar la implementacion -->
