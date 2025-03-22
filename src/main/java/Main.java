// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1 - Oblicz pole trójkąta prostokątngo");
    System.out.println("2 - Sprawdź czy trójkąt jest prostokątny");
    System.out.println(" ");
    int choice = scanner.nextInt();

  switch(choice){
    case 1:
      System.out.println("Podaj długość podstawy: ");
      double base = scanner.nextDouble();

      System.out.println("Podaj długość wysokości:  ");
      double height = scanner.nextDouble();

      double area = (base * height)/2;
      System.out.println("Pole trójkąta wynosi: " +area);
      break;


    case 2:
      System.out.print("Podaj długość boku a:  ");
      double a = scanner.nextDouble();

      System.out.println("Podaj długość boku b: ");
      double b = scanner.nextDouble();

      System.out.println("Podaj długość boku c: ");
      double c = scanner.nextDouble();

       if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b)
       {
      
      System.out.println("Podany trójkąt jest prostokątny");
       }
        else
      {
      System.out.println("Podany trójkąt nie jest prostokątny");
      }
      break;
      
}
        

      
      
  
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}