//Roman Numeral Converter Lab - Daivya Sadhvani 
//Advanced Software Development - 9/13/2023

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ConvertNumbers cn = new ConvertNumbers(); 
    System.out.println("\n\nWelcome to Roman Numeral-Decimal Convertor");
    System.out.print("\nEnter number to convert: ");
    int userDec = scan.nextInt();
    cn.decToRom (userDec);
    System.out.print("\nEnter numeral to convert: "); 
    String userRom = scan.next(); 
    cn.romToDec (userRom); 
      
    }
}
