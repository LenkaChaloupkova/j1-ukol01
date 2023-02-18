package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        /*Část 1
        Vytvořte metodu nakresliPrasatko(), která nakreslí prasátko jako na obrázku.
        Jako bonus můžete dokreslit prasátku i ocásek.
        Metodu zavolejte z metody start ve třídě HlavniProgram, aby se prasátko opravdu nakreslilo do okna aplikace.
         */
        zofka.setPenWidth(3);
        zofka.setPenColor(Color.black);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(30);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnLeft(90);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnRight(45);
        zofka.move(150);
        zofka.turnRight(135);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(45);
        zofka.move(33);
        zofka.turnLeft(90);
        zofka.move(27);
        zofka.turnLeft(90);
        zofka.move(21);
        zofka.turnLeft(90);
        zofka.move(15);
        zofka.turnLeft(90);
        zofka.move(9);
        zofka.turnLeft(90);
        zofka.move(3);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
