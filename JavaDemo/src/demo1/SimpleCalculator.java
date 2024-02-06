package demo1;

import java.util.Scanner; 
public class SimpleCalculator {     
public static void main(String[] args) {         
Scanner scanner = new Scanner(System.in);         
System.out.println("Enter the first number:");         
double num1 = scanner.nextDouble();         
System.out.println("Enter the operator (+, -, *, /):");         
char operator = scanner.next().charAt(0);         
System.out.println("Enter the second number:");         
double num2 = scanner.nextDouble();         
double result;         
switch (operator) {             
case '+':                 
result = num1 + num2;                 
break;             
case '-':                 
result = num1 - num2;                 
break;             
case '*':                
 result = num1 * num2;                 
break;             
case '/':              
if (num2 != 0) {                     
result = num1 / num2;                 
} 
else {                     
System.out.println("Error: Cannot divide by zero.");                     
return;                
}                 
break;             
default:                 
System.out.println("Invalid operator. Please enter +, -, *, or /.");                
 return;        
}         
System.out.println("Result: " + result);         
scanner.close();    
 } 
}