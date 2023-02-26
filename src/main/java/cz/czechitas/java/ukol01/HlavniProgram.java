package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();
    public void start() {
        zofka.setPenWidth(4);
        zofka.setPenColor(Color.black);
        zofka.setSpeed(90);

        /*Část 1
        Vytvořte metodu nakresliPrasatko(), která nakreslí prasátko jako na obrázku.
        Jako bonus můžete dokreslit prasátku i ocásek.
        Metodu zavolejte z metody start ve třídě HlavniProgram, aby se prasátko opravdu nakreslilo do okna aplikace.
        nakresliPrasatko(zofka);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(140);
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
        zofka.move(140);
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
        zofka.move(6);
    }
    */
        /* MNOHOUHELNIK:
        for (var i = 0; i < 16; i++) {
            zofka.move(33);
            zofka.turnLeft(22.5);
        }*/
        /* OSMIUHELNIK:

        for (var i = 0; i < 8; i++) {
            zofka.move(33);
            zofka.turnLeft(45);
        }*/
        /* KOLECKO:
        for (var i = 0; i < 360; i++) {
            zofka.move(1);
            zofka.turnLeft(1); }
        */
        /* SLUNICKO:

        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
    }
     */
        // UKOL BEZ POUZITI METOD - K OPRAVE
        /*1.domecek
        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(300);
        zofka.penDown();
        zofka.turnLeft(45);

        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);

        //2.domecek
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(180);
        zofka.penDown();
        zofka.turnRight(90);

        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);

        //3.domecek
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(180);

        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);

        //4.domecek
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);

        //5.domecek
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);

        //6.domecek
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        //7.domecek
        zofka.penUp();
        zofka.move(180);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        //Prasatko
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(250);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(45);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnLeft(90);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnRight(45);
        zofka.move(80);
        zofka.turnRight(135);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(45);
        zofka.move(60);
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
        zofka.move(6);
        //SLUNICKO:
        zofka.penUp();
        zofka.turnRight(20);
        zofka.move(400);
        zofka.penDown();
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
        for (var i = 0; i < 30; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);

        //L
        zofka.penUp();
        zofka.turnLeft(155);
        zofka.move(580);
        zofka.penDown();
        zofka.turnLeft(180);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penUp();
        zofka.move(40);
        zofka.penDown();
        //E
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penUp();
        zofka.move(40);
        zofka.penDown();
        //N
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnRight(155);
        zofka.move(88);
        zofka.turnLeft(155);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.move(80);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penDown();
        //K
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(55);
        zofka.turnLeft(180);
        zofka.move(55);
        zofka.turnLeft(45);
        zofka.move(40);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.penDown();
        //A
        zofka.turnLeft(75);
        zofka.move(85);
        zofka.turnRight(145);
        zofka.move(85);
        zofka.turnRight(180);
        zofka.move(35);
        zofka.turnLeft(75);
        zofka.move(28);
        */

        // UKOL S POUZITIM METOD (MOZNA :D)

        //1.domecek
        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(300);
        zofka.penDown();
        zofka.turnLeft(45);
        nakresliDomecek();

        //2.domecek
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(180);
        zofka.penDown();
        zofka.turnRight(90);
        nakresliDomecek();

        //3.domecek
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(180);
        nakresliDomecek();

        //4.domecek
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(180);
        nakresliDomecek();

        //5.domecek
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(180);
        nakresliDomecek();

        //6.domecek
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(180);
        nakresliDomecek();

        //7.domecek
        zofka.penUp();
        zofka.move(180);
        zofka.penDown();
        zofka.turnLeft(90);
        nakresliDomecek();

        //Prasatko
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(250);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(45);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnLeft(90);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnRight(45);
        zofka.move(80);
        zofka.turnRight(135);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(45);
        zofka.move(60);
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
        zofka.move(6);

        //SLUNICKO:
        zofka.penUp();
        zofka.turnRight(20);
        zofka.move(400);
        zofka.penDown();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        nakresliSlunicko();
        nakresliPaprsek();
        }

    private void nakresliDomecek() {
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(80);
    }
    private void nakresliSlunicko(){
        for(var i=0;i< 30;i++){
            zofka.move(1);
            zofka.turnLeft(1);
        }
    }

    private void nakresliPaprsek(){
        zofka.turnRight(90);
        zofka.move(33);
        zofka.turnRight(180);
        zofka.move(33);
        zofka.turnRight(90);
    }

    public static void main (String[]args){
        new HlavniProgram().start();
    }

}


