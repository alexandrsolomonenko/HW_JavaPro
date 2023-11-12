package hw_02_11_2023.bicycle;

import java.awt.*;
import java.util.Random;
/**
 * <h1> Велосипед!</h1>
 * Создайте класс Велосипед. Типы полей этого класса должны быть объявлены как внутренние классы
 * (руль, седло, колесо, передачи, рама и т.д.). Каждая часть велосипеда помимо описания характеристик
 * хранит запас прочности. Когда запас прочности равен 0, часть велосипеда ломается.
 * <p>
 * <b>Ответ на загадку:</b> Велосипед.
 *
 * @автор  Александр Соломоненко
 */

/**
 * Создание класса Bicycle
 */
public class Bicycle {

    private Handlebar handlebar;
    private Saddle saddle;
    private Wheel[] wheels;
    private Gears gears;
    private Frame frame;

    /**
     * Создаем комплектующие для велосипеда.
     */
    public Bicycle() {

        handlebar = new Handlebar();
        saddle = new Saddle();
        wheels = new Wheel[2];
        wheels[0] = new Wheel();
        wheels[1] = new Wheel();
        gears = new Gears();
        frame = new Frame();
    }
    /**
     *В методе "ride" , велосипед проезжает препятствия вплоть
     *до тех пор, пока нет сломанных частей.
     */
    public void ride() {
        int obstacleCount = 0;
        Random random = new Random();

        while (!isBroken()) {
            obstacleCount++;
            int obstacleStrength = random.nextInt(101);
            int obstacleType = random.nextInt(4);
            switch (obstacleType) {
                case 0:
                    handlebar.setStrength(handlebar.getStrength() - obstacleStrength);
                    break;
                case 1:
                    saddle.setStrength(saddle.getStrength() - obstacleStrength);
                    break;
                case 2:
                    wheels[0].setStrength(wheels[0].getStrength() - obstacleStrength);
                    break;
                case 3:
                    wheels[1].setStrength(wheels[1].getStrength() - obstacleStrength);
                    break;
            }

            System.out.println("Велосипед проехал препятствие " + obstacleCount);

            if (isBroken())
                break;
        }

        System.out.println("Велосипед сломался!");
    }

    /**
     *Возвращаем значение поврежденный частей велосипеда.
     */
    private boolean isBroken() {

        return handlebar.isBroken() || saddle.isBroken() || wheels[0].isBroken() || wheels[1].isBroken();
    }

    /**
    *Внутренний класс, для руля.
     */
    private class Handlebar {
        /**
         * Прочность комплектующей части велосипеда.
         */
        private int strength;

        public Handlebar() {
            strength = 100;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            if (strength >= 0)
                this.strength = strength;
        }

        public boolean isBroken() {
            return strength <= 0;
        }
    }
    /**
     *Внутренний класс, для седла.
     */
    private class Saddle {
        /**
         * Прочность комплектующей части велосипеда.
         */
        private int strength;

        public Saddle() {
            strength = 100;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            if (strength >= 0)
                this.strength = strength;
        }

        public boolean isBroken() {
            return strength <= 0;
        }
    }
    /**
     *Внутренний класс, для колес.
     */
    private class Wheel {
        /**
         * Прочность комплектующей части велосипеда.
         */
        private int strength;

        public Wheel() {
            strength = 100;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            if (strength >= 0)
                this.strength = strength;
        }

        public boolean isBroken() {
            return strength <= 0;
        }
    }
    /**
     *Внутренний класс, для шестеренок.
     */
    private class Gears {

    }
    /**
     *Внутренний класс, для рамы.
     */
    private class Frame {

    }
}
