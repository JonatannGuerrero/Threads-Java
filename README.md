# Threads Java 🏁

Programa desarrollado con NetBeans. Bajo el lenguaje Java, este da un ejemplo de uso de los Threads (Hilos o Multitarea) en Java. Simulando la fábula que cuenta la carrera entre la Liebre y Tortuga se usará los Threads para desarrollar el código. ¿Quién Ganará?

> Para remusumir que es un Thread basicamente es codigo que se puede ejecutar paralelamente osea al tiempo, ahi dos formas de crearlo, agregandole a la clase *extends Thread* o *Implements Runnable* este ejemplo esta hecho con *Implements Runnable.*

Para ejecutar el código de este repositorio, recuerde cambiar el nombre del *packege* que en mi caso lo llame *HilosConcurrencia,* que en los tres archivos se encuentra en la línea 6 en su caso llámelo como guste pero **no lo olvide.**

 **Jugando con Hilos**

Para hacerlo más interesante la carrera será cuesta arriba por una pista resbaladiza, de modo que a veces podrán resbalar y retroceder algunas posiciones. Habrá un thread que implementará la Tortuga y la Liebre. Cada hilo se suspende por un segundo y evalua lo que ha pasado según las siguientes probabilidades de cada animal.


**Tortuga  🐢**

| Suceso | probabilidad  | Movimiento  |
| :------------: | :------------: | :------------: |
| Avance rápido  | 50%  | 3 pasos a la derecha     |
| Resbaló        | 20%  | 6 pasos a la izquierda   |
| Avance lento   | 30%  | 1 paso a la derecha      |

**Liebre 🐇**

| Suceso | probabilidad  | Movimiento  |
| :------------:   | :------------: | :------------: |
| Duerme           | 20% | Sin acciones              |
| Gran salto       | 20% | 9 pasos a la derecha      |
| Resbalón grande  | 10% | 12 pasos a la izquierda   |
| Salto pequeño    | 30% | 1 paso a la derecha       |
| Resbalón pequeño | 20% | 2 pasos a la izquierda    |

# Desarrollo 🔥📈

Para el desarrollo del problema se calculó la probabilidad con un random que determina que acción realiza cada animal, la pista tiene 70 casillas, la casilla 70 es de llegada por ende el primer animal que llegue será el ganador.

**Foto de ejecución**

![](https://i.imgur.com/XFLMhBo.png)

En este caso el animal ganador fue la Liebre, observemos que dio un gran salto y de estar en la casilla 61 dio 9 pasos a la derecha (20%) la cual la llevo a la casilla 70 y por ende gano la carrera.

**Importante 🚨**

Como información adicional, para saber cuál es la probabilidad de que la Liebre o la Tortuga gane la carrera podríamos modificar el código para usar la ley de los grandes números y determinar esa probabilidad. Tengo un programa en el cual utilizo esta ley por si quieres verlo [aqui.](https://github.com/JonatannGuerrero/Robabilidad-Rusia2018)

# 🔧 Built With
- NetBeans - Java 
# 📝 License
MIT License Copyright © 2021 | JonatannGuerrero