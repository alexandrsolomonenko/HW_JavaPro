package hw_09_01_2024;

public class MyClass {
    private int privateField1;
    private String privateField2;
    private double privateField3;
    private boolean privateField4;

    public void method1() {
        System.out.println("Вызван метод 1");
    }

    public void method2() {
        System.out.println("Вызван метод 2");
    }

    public void method3() {
        System.out.println("Вызван метод 3");
    }

    public void method4() {
        System.out.println("Вызван метод 4");
    }

    public void method5() {
        System.out.println("Вызван метод 5");
    }

    public void method6() {
        System.out.println("Вызван метод 6");
    }

    public void method7() {
        System.out.println("Вызван метод 7");
    }

    public void method8() {
        System.out.println("Вызван метод 8");
    }

    public void method9() {
        System.out.println("Вызван метод 9");
    }

    public void method10() {
        System.out.println("Вызван метод 10");
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "privateField1=" + privateField1 +
                ", privateField2='" + privateField2 + '\'' +
                ", privateField3=" + privateField3 +
                ", privateField4=" + privateField4 +
                '}';
    }

    public int getPrivateField1() {
        return privateField1;
    }

    public void setPrivateField1(int privateField1) {
        this.privateField1 = privateField1;
    }

    public String getPrivateField2() {
        return privateField2;
    }

    public void setPrivateField2(String privateField2) {
        this.privateField2 = privateField2;
    }

    public double getPrivateField3() {
        return privateField3;
    }

    public void setPrivateField3(double privateField3) {
        this.privateField3 = privateField3;
    }

    public boolean isPrivateField4() {
        return privateField4;
    }

    public void setPrivateField4(boolean privateField4) {
        this.privateField4 = privateField4;
    }
}
