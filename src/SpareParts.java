import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;


public class SpareParts
{
        public static void firstMethod()
        {

//-----------------------RandNumGen class start
            ArrayList<RandNumGen> storedNumber = new ArrayList<>();

            ArrayList<Integer> check = new ArrayList<>();
//-----------------------RandNumGen class end

//-----------------------read file start
            try {
                File myObj = new File("infofile.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] previousGenerated = data.split(":");
                    if(previousGenerated.length == 0) {
                        check.add(Integer.valueOf(previousGenerated[0]));
                    } else {

                    }

                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
//-----------------------read file end

            String a = "English";
            String b = "Spanish";

            Scanner scan = new Scanner(System.in);
            boolean finish = false;
            int finalNumber;


            while(!finish)
            {

                System.out.println("Welcome to spare parts");

                Scanner scanner=new Scanner(System.in);

//-----------------------user service class start

                UserService spoken = new UserService();
                spoken.setLanguage("\nPress 1 for " +a+ " 2 for " +b);
                System.out.println(spoken.getLanguage());
                int language = Integer.parseInt(scanner.nextLine());
                if(language ==1){
                    System.out.println("You have chosen english");
                } else {
                    System.out.println("Lo siento, no hablo espanol ahora, \nPor favor continua en ingles");
                }
//-----------------------user service class end

//-----------------------calling classes start

                ClientName user = new ClientName("");

                RandNumGen generatedNumber = new RandNumGen();

//-----------------------calling classes end

//-----------------------customer name class section array start

                ArrayList<ClientName> List = new ArrayList<>();

                List.add(user);

                for (int i = 0; i < List.size(); i++)
                {

                    System.out.println(List.get(0).name);
                }
//-----------------------customer name class section array end

//-----------------------number generator section start

                RandNumGen myOrder = new RandNumGen();

                storedNumber.add(generatedNumber);

                int useNumber=0;


                boolean cont = true;
                while(cont)
                {

                    Scanner getInput = new Scanner(System.in);
                    System.out.println("\nPlease enter 1 for genuine parts or 2 for third party parts: ");

                    int select = scanner.nextInt();

                    finalNumber = myOrder.orders(select);

                    for (Integer number : check)
                    {
                        if (number == finalNumber)
                        {

                        } else
                        {
                            useNumber = finalNumber;
                            cont = false;
                        }
                    }
                    if(check.isEmpty())
                    {
                        useNumber = finalNumber;
                        cont = false;
                    }
                }
                for (int i = 0; i < storedNumber.size(); i++)
                {
                }
                storedNumber.get(0).num = useNumber;
                System.out.println("The order number is:"+useNumber);
//-----------------------number generator section start
//-----------------------save file start
            try
            {
                FileWriter myWriter = new FileWriter("infofile.txt", true);
                myWriter.write("\nThe order number is:" + storedNumber.get(0).num);
                myWriter.close();
                System.out.println("Successfully written to the file.");
            } catch(
                    IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
                Invoice choice = new Invoice();
                System.out.println("Would you like to continue? 1 for yes 2 for no: ");
                String end = scan.nextLine();
                if(end.equals("2"))
                {
                    System.out.println("Thank you, have a good day ");
                    finish = true;
                }
            }
            //-----------------------save file end
        }
        public static void main(String[] args)
    {
        //-----------------------calling method start
        firstMethod();
        //-----------------------calling method end
    }
}
