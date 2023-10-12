

import java.util.Scanner; 

public class ConvertNumbers {
  public void decToRom (int input) {
    String s = "";
    while (input >= 1000) {
        s += "M";
        input -= 1000;        
    }
    while (input >= 900) {
        s += "CM";
        input -= 900;
    }
    while (input >= 500) {
        s += "D";
        input -= 500;
    }
    while (input >= 400) {
        s += "CD";
        input -= 400;
    }
    while (input >= 100) {
        s += "C";
        input -= 100;
    }
    while (input >= 90) {
        s += "XC";
        input -= 90;
    }
    while (input >= 50) {
        s += "L";
        input -= 50;
    }
    while (input >= 40) {
        s += "XL";
        input -= 40;
    }
    while (input >= 10) {
        s += "X";
        input -= 10;
    }
    while (input >= 9) {
        s += "IX";
        input -= 9;
    }
    while (input >= 5) {
        s += "V";
        input -= 5;
    }
    while (input >= 4) {
        s += "IV";
        input -= 4;
    }
    while (input >= 1) {
        s += "I";
        input -= 1;
    }    
    System.out.println("Roman Numeral: " + s);
  }  
  
  public static void romToDec (String input){
    int dec = 0; 
    while (input.length() > 0){
     if (input.startsWith ("M")){
        dec += 1000; 
        input = input.substring(1); 
      } 
      else if (input.startsWith ("CM")) {
        dec += 900; 
        input = input.substring(2); 
      }
      else if (input.startsWith("D")){
        dec += 500; 
        input = input.substring(1); 
      }
      else if (input.startsWith("CD")){
        dec += 400; 
        input = input.substring(2); 
      }
      else if (input.startsWith ("C")){
        dec +=100; 
        input = input.substring(1); 
      }
      else if (input.startsWith("XC")){
        dec += 90; 
        input = input.substring(2); 
      }
      else if (input.startsWith("L")){
        dec += 50; 
        input = input.substring(1); 
      }
      else if (input.startsWith("XL")){
        dec += 40; 
        input = input.substring(2); 
      }
      else if (input.startsWith("X")){
        dec +=10; 
        input = input.substring(1); 
     }
      else if (input.startsWith("IX")){
        dec += 9; 
        input = input.substring(2); 
      }
      else if (input.startsWith ("V")){
        dec += 5; 
        input = input.substring(1); 
      }
      else if (input.startsWith ("IV")){
        dec += 4; 
        input = input.substring(2); 
      }
      else if (input.startsWith("I"))  {
        dec += 1; 
        input = input.substring(1); 
      }
    }
  System.out.print ("Decimal: " + dec); 
  } 
}