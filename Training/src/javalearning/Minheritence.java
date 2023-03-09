package javalearning;
import java.io.*;
import java.util.Scanner;


	class Animal{  
		void eat(){System.out.println("eating...");}  
		}  
		class Dog extends Animal{  
		void bark(){System.out.println("barking...");}  
		}  
		class BabyDog extends Dog{  
		void weep(){System.out.println("weeping...");}  
		} 
		public class Minheritence {
		class TestInheritance2{  
		public static void main(String args[]){  
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
		}}  
		}
