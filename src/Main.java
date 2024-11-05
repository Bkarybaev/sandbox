import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scannernum = new Scanner(System.in);
        Person person1 = new Person();
        person1.name = scanner.nextLine();
        person1.surName = scanner.nextLine();
        person1.age = scannernum.nextInt();

//        Person person2 = new Person();
//        person2.name = "Baiel";
//        person2.surName = "Karybaev";
//        person2.age = 20;



        System.out.println(person1.getInfo());
//        System.out.println(person2.getInfo());
    }
}