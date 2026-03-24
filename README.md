/* TODO

1.Crear una clase personaje, con sus habilidades, objetos, vida y ataque, cada uno direfente para variación (Crear habilidad para cada Xmen, ej: Lobezno se autocura y no necesita curación...)

2.Crear clase heroes/mutantes que dependan de su clase padre

3.Hacer lo mismo con Enemigos.

    -Crear 4-5 boses, cada uno más dificil que él anterior.

4.Crear clase inventario (Array que vaya guardando todos los objetos que vayamos adquiriendo. Podemos levar 5 de cada )

5.Crear clase combate, donde, por turnos, lucharemos contra los enemigos( nos limitamos a 4 opciones). Cada personaje tiene 3 opciones

    1.Elegir que pérsonaje va a atacar. Luego nos da otras 3 opciones:

        -Atacar:elegimos a que enemigo debemos atacar (dependiendo de cuantos sean)

        -Defender (al usarlo, el personaje defiende a los otros personajes)

        -Habilidad: Uso de la habilidad de cada personaje
    
    2.Elegir objeto (Curar, aumentar ataque, defensa de todos)

    3.Huir en grupo (con probabilidad de 50%)

        !!Si perdemos 1 personaje (máximo 3 en combate), no podremos usarlo para combatir

        //* Si ganamos/derrotamos a los enemigos, subiremos de nivel (Cada personaje). Luego aparecerá el boss

6.Crear clase menú (4 opciones)

    -1.Cambiar personajes (tenemos un array de personajes, pero solo usamos máximo 3 "espacios" para toda la aventura
    
        -1.Los personajes no elegidos y/o abatidos quedrán en espera hasta que decidamos cambiarlos
        -2. Los personajes abatidos no los podremos usar a menos que los curemos)

    -2.Elegir camino.

    -3.Elegir objeto (curarnos, aumentar daño o defensa, reanimar personaje (ya nos permite usar el pérsonaje)).

        !!Bucle para solo las opciones que nos dá.

    //* Usar a Cerebro(solo para Charles, sino, esta opción no aparece)

    !!(hacerlo bucle para elegir solo las 3 opciones)

6.Crear clase camino, donde elijamos el camino que queremos realizar, en cada camino debe haber enemigos (entre 1 y 5).

    -1.Si ya hizimos un caminos. Podemos hacer un minijuego en su lugar
    -2. Si conseguimos el máximo, no nos permitirá jugar más al minijuego 

4.Crear la clase Cerebro que sea solo util para personaje Charles. Mira cuantos enemigos hay en cada camino (si los enemigos fueron derrotados anteriormente en un camino, saldrá 0 enemigos)

7.Crear clase minijuego para conseguir objetos. implementarlo en camino

    !!Si conseguimos el máximo, no nos dejará recolectar más objetos (No deja jugar al minijuego)

8.Tras cada victoria en cada zona, nos lleva al boss final que nos dará combate.

9.Si gana, podemos incluirlo en nuestro equipo (Sólo sirve para los 2 primeros caminos).

10.Trás derrotar los 4-5 boses, habrémos ganado o si morimos en combate (perdemos los 3 héroes).




📁 controlador

-Main 

-Juego → controla flujo general

📁 modelo

-Personaje (PADRE)


    nombre

    vida

    ataque

    estado (estaDefendiendo)

    inventario (opcional o referencia)

Métodos:

    atacar()

    defender()

    recibirDaño()

-Heroe (HIJO)

    habilidades especiales (Lobezno se cura, etc.)

    uso de objetos

    interacción con jugador

-Enemigo (HIJO)

    comportamiento básico enemigo

-Boss (HIJO de Enemigo)

    más vida

    más daño

    habilidades especiales

-Inventario

    array o lista de objetos

    límite (ej: 5 por objeto)

Métodos:

    agregarItem()

    usarItem()

    eliminarItem()

-Combate

    turnos

    elegir acción

    aplicar daño

    comprobar muerte

Métodos:

    iniciarCombate()

    turnoJugador()

    turnoEnemigo()

-Camino

    enemigos del camino (1–5)

    caminos conectados

    si ya fue completado

-Métodos:

    iniciarCamino()

    generarEnemigos()

-Cerebro

    ver enemigos en caminos

Método:

    verEnemigos(Camino c)

-MiniJuego

    lógica del minijuego

    recompensa


-Menu

    elegir personajes

    usar objetos

    elegir camino