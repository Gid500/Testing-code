package JavaInterfaceMenu;

import java.util.Scanner;

interface TestInterface {
    String title = "(1)title";
    String Tmenu1 = "(2)Tmenu1";
    String Tmenu2 = "(3)Tmenu2";

    public void Ttitle();
    public void Tmenu1();
    public void Tmenu2();
}

interface TestInterface2 extends TestInterface {
    public int calculator(int num1, int num2);    
}

class Main implements TestInterface2 {
    
    public void Ttitle(){
        System.out.println(String.format("%9s", TestInterface.title));
    }

    public void Tmenu1() {
        System.out.println(String.format("%10s", TestInterface.Tmenu1));
    }

    public void Tmenu2() {
        System.out.println(String.format("%10s", TestInterface.Tmenu2));
    }

    public int calculator(int num1, int num2){
        int reslut = num1 + num2;
        System.out.print(reslut);
        return reslut;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main menu = new Main();

        menu.Ttitle();
        menu.Tmenu1();
        menu.Tmenu2();

        String str[] = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        menu.calculator(num1, num2);

        sc.close();
    }
}