import java.util.Scanner;
public class Invoice
{
    public int choice;
    int one = 1;
    int two = 2;

    public Invoice()
    {

        this.choice = choice;
        Scanner scanner=new Scanner(System.in);
        System.out.println("\nAre you needing to pay an invoice? " +one+ " for yes or " +two+ " for no: ");

        int invoice=scanner.nextInt();

        if(invoice==1)
        {
            System.out.println("You have chosen yes to an invoice, we will be in contact to finalise payment\n");
        } else {
            System.out.println("You have chosen no to an invoice\n");
        }
    }
}
