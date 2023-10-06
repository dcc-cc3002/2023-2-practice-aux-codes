# Enunciado

## Contexto

Se tiene un juego de cartas, donde existe un tablero para ellas. Este tablero está dividido en tres
secciones, dependiendo de esta, es la carta que puede ser jugada:

- Sección de Combate: Solo admite cartas de tipo `Combat`
- Sección de Distancia: Solo admite cartas de tipo `Distance`
- Sección de Asedio: Solo admite cartas de tipo `Siege`

Un jugador, quien posee un tablero, es capaz de jugar cartas, mediante el método definido
`play(card: Card)`, que, dependiendo del tipo de carta, enviará esta a la sección correspondiente
del tablero.

El código es funcional, pero paupérrimamente diseñado.

## Problema

Modifique el maloliente código entregado para mejorar su diseño. En particular, haga lo siguiente:

1. Defina en el trait `Card` el método `playOnBoard(board: Board)`. Gracias a este método, todas las
cartas podrán tener una manera distinta de jugarse en el tablero.


2. Implemente en la clase `Board` los métodos necesarios para recibir cartas de tipo `Combat`,
`Distance` y `Siege`. Con esto, eliminamos la responsabilidad de saber el tipo de la carta para
poder procesarla.

   - **Tip adicional de diseño**: Incluso si estamos utilizando un trait como tipo para nuestras
   zonas de cartas, únicamente existen, de manera exclusiva, cartas de un tipo específico en cada
   zona. Corrija esta situación.


3. Finalmente, implemente en cada clase de carta el método `playOnBoard(board: Board)` utilizando
los métodos previamente definidos del tablero.
