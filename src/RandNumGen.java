import java.util.Scanner;

    public class RandNumGen
    {
        public int num;

        int one = 1;
        int two = 2;



        public int orders(int getInput)
        {


                int mina = 100000;
                int maxa = 199999;
                int minb = 200000;
                int maxb = 999999;

                if (getInput == 1)
                {


                    int dig = (int) (Math.random() * (maxa - mina + 1) + mina);
                    this.num = dig;
//                    System.out.println("Thank you. You have chosen generic parts & your order number is: " +dig);
                    System.out.println("Thank you.\n");

                    return dig;

                } else
                {


                    int dig2 = (int) (Math.random() * (maxb - minb + 1) + minb);
                    this.num = dig2;
//                    System.out.println("Thank you. You have chosen third party parts & your order number is: " +dig2);
                    System.out.println("Thank you.\n");

                    return dig2;
                }
        }
    }

