package Task1;

public class Methods
{
    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("A");
            methodB("start");
            System.out.println("A");
            methodC("start");
            methodD("start");

        } else {
            System.out.println("d");
            System.out.println(methodC(input));

        }
        System.out.println("T");
    }

    public void methodB(String start) {
        System.out.println("V");
    }

    public String methodC(String input) {
        System.out.println("E");
        System.out.println("R");
        return input;
    }


    public String methodD(String start) {
        System.out.println("S");
        System.out.println("J");
        System.out.println("O");
        System.out.println("V");
        return start;
    }

}
