import java.util.*;
class Atm
{
    String choice;
    double balance=750000;
    int lang,pin,withdrawn;

    void welcomeMessage()
    {
        System.out.println("welcome");
        System.out.println("Insert your card");
    }

    void selectLanguage()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Select your language");
        System.out.println("1 for English");
        System.out.println("2 for hindi");
        System.out.println("3 for Tamil");
        lang=s.nextInt();
        switch(lang)
        {
            case 1:
                if(lang==1)
                    System.out.println("You selected English");
                break;
            case 2:
                if(lang==2)
                    System.out.println("You selected Hindi");
                break;
            case 3:
                if(lang==3)
                    System.out.println("You selected Tamil");
                break;
            default:
                System.out.println("You entered wrong number");

        }
    }
    void validate()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Entered your pin number");
        pin=s.nextInt();
        if(pin==7473)
        {
            System.out.println("Entered the amount to withdrawn");
            withdrawn=s.nextInt();
            if(withdrawn<=balance)
            {
                balance-=withdrawn;
                System.out.println("Do you want to display the amount?");
                choice=s.next();
                if(choice.equalsIgnoreCase("yes"))
                {
                    System.out.println("The balance is"+ balance);
                }
                else
                {
                    System.out.println("Thank you for using this ATM!");
                    System.out.println("Take your card");
                }

            }
            else
            {
                System.out.println("Insufficient fund");
            }
        }
        else
        {
            System.out.println("You entered wrong pin");
        }

    }
    public static void main(String args[])
    {
        Atm myAtm=new Atm();
        myAtm.welcomeMessage();
        myAtm.selectLanguage();
        myAtm.validate();
    }
}
