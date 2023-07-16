import utlity.Users;

import java.util.Scanner;

public class AtmProject {
    private static final Scanner scan = new Scanner(System.in);
    public static Users name() {
        Users users = new Users();

        System.out.println("Add-User-Details");

        System.out.println("Enter Your FullName:");
        String name = scan.next();
        System.out.println("Enter Your Phone Number:");
        Integer number = scan.nextInt();
        System.out.println("Enter Your Address");
        String address = scan.next();
        System.out.println("Enter Deposit Amount");
        Double amount = scan.nextDouble();


        users.setName(name);
        users.setAddress(address);
        users.setNumber(number);
        users.setAmount(amount);

        return users;
    }

    void userDetails(Users users){
        System.out.println("User Details:");
        System.out.println("Name : \t" + users.getName());
        System.out.println("Phone Number: \t" + users.getNumber());
        System.out.println("Address: \t" + users.getAddress());
        System.out.println("Amount: \t" + users.getAmount());
    }

    static Users withDraw(Users users){
        System.out.println("Enter the amount you want to withdraw:");
        Double withDrawAmount = scan.nextDouble();
        if (users.getAmount() >= withDrawAmount) {
            Double finalAmount = users.getAmount() - withDrawAmount;
            users.setAmount(finalAmount);
            System.out.println(withDrawAmount + " is successfully withdrawn");
        }else {
            System.out.println("insufficent balance");
        }

        return users;
    }
    static void checkBalance(Users user){
        System.out.println("Total Amount:" + user.getAmount());

    }
    static Users addBalance(Users user) {
        System.out.println("Amount of money you have deposit:");
        Double addBalance = scan.nextDouble();
        user.setAmount(user.getAmount() + addBalance);
        System.out.println("Total" +  user.getAmount());
        return user;
    }


    public static void main(String[] args) {
        boolean exit = true;
        Users user = name();


        while (exit) {
            System.out.print("1. Withdraw-Balance \t");
            System.out.println("2. Check-Balance \t");
            System.out.print("3. Add-Balance \t \t \t");
            System.out.print("4. -----EXIT----");

            Integer choice = scan.nextInt();

            switch (choice) {
                case 1:
                    user = withDraw(user);
                    break;
                case 2:
                    checkBalance(user);
                    break;
                case 3:
                    user= addBalance(user);
                    break;
                case 4:
                    exit = false;
                    System.out.println("Thank You FOr using our service");
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }

        }


    }


}