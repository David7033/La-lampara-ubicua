PRÁCTICA No. 4.- Programación concurrente para conexión a un origen de datos.
- DESARROLLO DE LA PRÁCTICA
Battleship o Batalla Naval es un juego de lápiz y papel tradicional de adivinanza que involucra a
dos participantes.
Se compone de dos tableros por jugador, dividido cada uno en cuadrículas. Los tableros típicos
son cuadrados de 10 por 10 casillas, y cada posición se identifica con números para las columnas
(de 1 a 10) y con letras para las filas (de la A a la J). En uno de los tableros el jugador coloca sus
barcos y registra los tiros del oponente. En el otro, se registran los tiros propios.
Antes de comenzar, cada jugador posiciona los barcos de forma secreta o invisible al oponente,
generalmente con el tablero en posición vertical como pizarra. Cada uno ocupa, según su modelo,
una cierta cantidad de posiciones, ya sea horizontal o verticalmente. De esta forma, no se permiten
lugares solapados, ya que cada uno ocupa posiciones únicas. Ambos participantes poseen y
deben ubicar igual número de naves.
Una vez todas las naves han sido posicionadas, se inicia una serie de rondas. En cada ronda, cada
jugador en su turno indica una posición del tablero de su oponente. Si esa posición es ocupada por
una parte de un barco, el oponente indica averiado (toque o tocado) y el atacante marca con rojo
esa posición, con un pin. Cuando todas las posiciones de un mismo barco han sido dañadas debe
indicarse hundido dando a conocer tal circunstancia que indicará al atacante la importancia de la
nave destruida. Ahora bien, si la posición indicada, efectivamente, no posee un barco alojado, se
indica con agua, y será marcada con un pin blanco.
Quien descubra primero todas las naves será el vencedor, pero en caso de que el participante que
comenzó la partida hunda el barco en su última jugada, el otro participante tiene una última
posibilidad para alcanzar el empate.
1. Crea un paquete que contenga las clases necesarias para el control de la comunicación en la aplicación.
2. Adicionalmente crea un paquete que implemente la interfaz de usuario para la aplicación propuesta.
3. También usa un paquete que implemente la lógica del juego.
4. Ten en cuenta implementar un algoritmo para la versión automática de adversario.
5. Documenta toda la aplicación.