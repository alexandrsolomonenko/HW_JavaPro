package HW_28_09_2023.Auto;

public class Main {
    public static void main(String[] args) {
        Auto truck = Factory.produceTruck(250, "Mercedes", "Actros");
        Auto sportCar = Factory.produceSportCar(500, "Ferrari", "LaFerrari");
        Auto sedan = Factory.produceSedan(150, "BMW", "5 Series");

        // Получение значений полей и их вывод
        System.out.println("Truck: " + truck.getBrand() + " " + truck.getModel());
        System.out.println("Engine Power: " + truck.getEnginePower());

        System.out.println("Sport Car: " + sportCar.getBrand() + " " + sportCar.getModel());
        System.out.println("Engine Power: " + sportCar.getEnginePower());

        System.out.println("Sedan: " + sedan.getBrand() + " " + sedan.getModel());
        System.out.println("Engine Power: " + sedan.getEnginePower());
    }
}


//    В созданном пакете создайте класс Автомобиль. Создайте поля для типа автомобиля – грузовик,
//        спорткар, легковой (можно сделать перечисление), мощность двигателя (сколько лошадиных сил),
//        поля для марки и модели автомобиля. Одно из полей сделайте публичным, второе – без модификатора
//        доступа, остальные – приватными. Создайте объект этого класса в программе и попробуйте установить
//        значения для полей. Какие поля возможно установить? Для приватных полей напишите геттеры и сеттеры.
//        2 Создайте класс Завод. Класс будет производить три вида автомобилей (иметь 3 метода) – спорткар,
//        грузовик, легковой. В основной программе создайте несколько автомобилей с помощью класса Завод.