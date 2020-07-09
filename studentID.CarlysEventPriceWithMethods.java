import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int guestNumber = getNumberOfGuest();
        
        showCompanyMotto();
        
        calculatePrice(guestNumber);
        
    }


    public static int getNumberOfGuest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Guest attending this event");
        return scanner.nextInt();

    }
    
    public static void showCompanyMotto(){
        System.out.println("******************************************************************************");
        System.out.println("                                In God We Trust                              ");
        System.out.println("******************************************************************************");
    }
    
    public static void calculatePrice(int numberOfGuest){
        /*
        Price is calculated by numberOfGuest * pricePerGuest
        Price not given so I'll use 100 per guest
         */
        int price = 100 * numberOfGuest;
        
    }
}
