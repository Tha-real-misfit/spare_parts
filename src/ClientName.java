import java.util.Scanner;

public class ClientName
{
    public String name;

    public String product;


    public ClientName(String name)
    {



        Scanner customer = new Scanner(System.in);

                System.out.println("\nPlease enter your name: ");

                String userName = customer.nextLine();
                userName = Character.toUpperCase(userName.charAt(0)) + userName.substring(1);

                System.out.println("\nHello " + userName + "\n");

        System.out.println("What product are you looking for: ");

        String userProduct = customer.nextLine();
        userProduct = Character.toUpperCase(userProduct.charAt(0)) + userProduct.substring(1);

        System.out.println("You have selected " + userProduct + "\n");


        this.name = userName;


    }


}
