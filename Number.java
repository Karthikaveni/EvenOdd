# LargestNumber
import java.io.*;
import java.util.*;
public class Number{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c,largest;
    System.out.println("Enter any three numbers :");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();                                  
    largest=(a>b)?(a>c?a:c):(b>c?b:c);                                                                                             
    System.out.println("Largest: "+largest);
  }
}   
