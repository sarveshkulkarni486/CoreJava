
import java.util.*;
public class ArrayTest {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice=0;
        do {
            System.out.println("Enter your choice: From below menu");
            System.out.println("1. Accept an Array");
            System.out.println("2. Display Data");
            System.out.println("3. Add all numbers");
            System.out.println("4. Add Row wise");
            System.out.println("5. Add column wise");
            System.out.println("6. find maximum");
            System.out.println("7. find minimum");
            System.out.println("8. find maximum row wise");
            System.out.println("9. find minimum row wise");
            System.out.println("10. find maxmimum column wise");
            System.out.println("11. find minimum column wise");
            System.out.println("12. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ArrayService.AcceptData();
                    break;
                case 2:
                    ArrayService.DisplayData();
                    break;
                case 3:
                    int sum = ArrayService.AddAllNumbers();
                    System.out.println(sum);
                    break;
                case 4:
                    ArrayService.AddRows();
                    break;
                case 5:
                    ArrayService.AddColumns();
                    break;
                case 6:
                    ArrayService.FindMax();
                    break;
                case 7:
                    ArrayService.FindMin();
                    break;
                case 8:
                    ArrayService.FindRowMax();
                    break;
                case 9:
                    ArrayService.FindRowMin();
                    break;
                case 10:
                    ArrayService.FindColumnMax();
                    break;
                case 11:
                    ArrayService.FindColumnMin();
                    break;
                case 12:
                    System.exit(choice);
                default:
                    break;
            }

        }while(choice!=12); 
    }
    
}
