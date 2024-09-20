Descripcion de los metodos utilizados

•	Mezclar(): Mezcla las cartas y muestra un mensaje

•	SeleccionaralAzar(): Como lo menciona la variable, selecciona una carta al azar, la muestra y también la elimina, mostrando cuantas quedan

•	MostrarPrimera(): Muestra la primera carta y la elimina, mostrando cuantas cartas quedan

•	RepartirMano(): Muestra cinco cartas, las elimina y luego indica cuantas cartas restan.


Explicacion del funcionamiento del programa

•	Definicion de la baraja de poker: La baraja de póker se compone de 52 cartas divididas en cuatro palos: tréboles, corazones, picas y diamantes. Cada palo tiene 13 cartas con valores del 2 al 10, además de las figuras (J, Q, K) y el as (A). Los tréboles y picas son de color negro, mientras que los corazones y diamantes son rojos

•	Clases

Card: Representa una carta con atributos para el palo, color y valor
Deck: Contiene una lista de cartas (utilizando ArrayList del Collection Framework), métodos para mezclar (shuffle), mostrar y remover la primera carta (head), seleccionar una carta al azar (pick), y repartir cinco cartas (hand).	

•	Métodos: Cada método imprime un mensaje según la acción realizada y actualiza el número de cartas restantes en el deck.


