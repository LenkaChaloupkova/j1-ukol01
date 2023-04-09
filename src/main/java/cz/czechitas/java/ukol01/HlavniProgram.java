package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();
    public void start() {
        zofka.setPenWidth(4);
        zofka.setPenColor(Color.black);
        zofka.setSpeed(90);
        zofka.penUp();

        //1.domecek
        zofka.turnRight(135);
        zofka.move(300);
        zofka.turnLeft(45);
        nakresliDomecek();

        //2.domecek
        zofka.turnLeft(180);
        zofka.move(180);
        zofka.turnRight(90);
        nakresliDomecek();

        //3.domecek
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
        nakresliDomecek();

        //4.domecek
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
        nakresliDomecek();

        //5.domecek
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
        nakresliDomecek();

        //6.domecek
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
        nakresliDomecek();

        //7.domecek
        zofka.move(180);
        zofka.turnLeft(90);
        nakresliDomecek();

        //Prasatko
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(250);
        zofka.penDown();
        zofka.turnLeft(90);
        nakresliDomecek();
        zofka.turnLeft(180);
        zofka.move(80);
        zofka.turnLeft(135);
        nakresliPraseciNohy();
        zofka.move(80);
        zofka.turnRight(45);
        nakresliPraseciNohy();
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnRight(45);
        nakresliPraseciOcasek();

        //SLUNICKO:
        zofka.penUp();
        zofka.turnRight(20);
        zofka.move(400);
        zofka.penDown();
        nakresliSlunicko();

        //JMENO

        napisJmenoLenka();
    }

    private void napisJmenoLenka() {
        napisPismenoL();
        napisPismenoE();
        napisPismenoN();
        napisPismenoK();
        napisPismenoA();
    }

    private void napisPismenoA() {
        zofka.turnLeft(75);
        zofka.move(85);
        zofka.turnRight(145);
        zofka.move(85);
        zofka.turnRight(180);
        zofka.move(35);
        zofka.turnLeft(75);
        zofka.move(28);
    }

    private void napisPismenoK() {
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
    }

    private void napisPismenoN() {
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
    }

    private void napisPismenoE() {
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
    }

    private void napisPismenoL() {
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
    }

    private void nakresliPraseciOcasek() {
        zofka.penDown();
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

    private void nakresliPraseciNohy() {
        zofka.penDown();
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnLeft(90);
        zofka.move(33);
        zofka.turnLeft(180);
        zofka.move(33);
        zofka.turnRight(45);
    }

    private void nakresliDomecek() {
        zofka.penDown();
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
        zofka.penUp();
    }
    private void nakresliSlunicko(){
        for(var i=0; i< 36; i++){
            zofka.move(10);
            zofka.turnLeft(10);
            if (i % 3 == 0) {
                nakresliPaprsek();
            }
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


