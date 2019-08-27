import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class PhoneEmail 
{
 public static void main(String[] argv) 
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("how many data to print");
  int n = sc.nextInt();
  for (int i = 0; i < n; i++) 
   {
   System.out.println("Enter your id");
   String id = sc.next();
   System.out.println("enter your phone number");
   String no = sc.next();
   Pattern pattern = Pattern.compile("\\d{10}");
   Matcher matcher = pattern.matcher(no);
   if (matcher.matches())
     {
      System.out.println("Phone Number is Valid");
     } 
      else if(matcher.matches())
     {
      System.out.println("Phone Number must be in the form [0-9]10number");
      String no1=sc.next();
     }
      else
     {
      System.out.println("Phone Number must be in the form [0-9]10number");
      String no2=sc.next();
     }
   System.out.println("enter the Email");
   String email = sc.next(); 
   Pattern pattern1 = Pattern.compile("^[a-z0-9_+&*-]+(?:\\." + "[a-z0-9_+&*-]+)*@" + "(?:[a-z0-9-]+\\.)+[a-z]{2,7}$");
   Matcher matcher1 = pattern1.matcher(email);
    if (matcher1.matches())
     {
      System.out.println("email is Valid");
     } 
      else if(matcher1.matches()) 
     {
      System.out.println("email must be in the form X-----X@x---x.xxx");
      String email1 = sc.next(); 
     }
   }
  }
}
