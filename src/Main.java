import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Cat> catList = new ArrayList<>();
    public Scanner scanner;

    public static void main(String[]args){
        Main runMain = new Main();
        runMain.run();
    }

    //Constructor to initialize data
    public Main(){
        scanner = new Scanner(System.in);
    }

    //Method to run the user menu
    public void run(){
        CatList();

        boolean running = true;
        while (running){
            displayMenu();
            System.out.print("What do you want to do? Put in a number: ");//User input got the switch
            String input = scanner.nextLine();
            int inputNum;
            try {
                inputNum = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Input error. Please enter a number.");
                continue;
            }

            //Switch method
            switch (inputNum){
                case 1:
                    case1();
                    break;
                case 2:
                    case2();
                    break;
                case 3:
                    case3();
                    break;
                case 4:
                    case4();
                    break;
                case 8: //Method invocation
                    running = false;
                default:
                    System.out.println("Option doesn't exist");
            }
        }
        scanner.close();
    }

    //Method for menu display
    public void displayMenu(){
        System.out.println("\n==== Cat Limb ====");
        System.out.println("1. Mode: In/Out");
        System.out.println("2. Mode: Only In");
        System.out.println("3. Mode: Only Out");
        System.out.println("4. Mode: Closed");
        System.out.println("8. Close program");
    }

    //Method for case 1 - Mode: In/Out
    //If the cat has an  index of <5 - change permission to true
    public void case1(){
        for(int i = 0; i <catList.size(); i++){
            Cat cat = catList.get(i);
            if (i < 5) {
                cat.setPermission(true);
            }
        }

        System.out.println("Mode: In/Out");
        for(Cat cat : catList){
            System.out.println(cat);
        }
    }

    //Method for case 2 - Mode: Only In
    //If the cat has an index of <5 - change permission to true
    public void case2 (){
        for(int i = 0; i < catList.size(); i++){
            Cat cat = catList.get(i);
            if (i < 5) {
                cat.setPermission(true);
            }
        }

        System.out.println("Mode: Only In");
        for(Cat cat : catList){
            System.out.println(cat);
        }
    }

    //Method for case 3 - Mode: Only Out
    //Loop trough catList - all cats should have permission set to true
    public void case3(){
        System.out.println("Mode: Only Out");
        for(Cat cat : catList){
            cat.setPermission(true);
            System.out.println(cat);
        }
    }

    //Method for case 4 - Mode: Closed
    //Loop trough catList - all cats should have permission set to false
    public void case4(){
        System.out.println("Mode: Closed");
        for(Cat cat : catList){
            cat.setPermission(false);
            System.out.println(cat);
        }
    }

    //List of cats
    public void CatList(){
        catList.add(new Cat("Molle", false));
        catList.add(new Cat("Baby", false));
        catList.add(new Cat("Bobby", false));
        catList.add(new Cat("Olle", false));
        catList.add(new Cat("Perci", false));
        catList.add(new Cat("Balle", false));
    }
}
