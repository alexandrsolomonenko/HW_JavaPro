package HW_28_09_2023.SafeString;

public class Pair {
    private String first;
    private String second;

    {
        System.out.println("Значения полей first и second: " + first + ", " + second);
        first = "one";
        second = "two";
    }

    public Pair() {
        System.out.println("Значения полей first и second в конструкторе по умолчанию: " + first + ", " + second);
    }

    public Pair(String first, String second) {
        System.out.println("Значения полей first и second в конструкторе с параметрами: " + first + ", " + second);
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }
}

