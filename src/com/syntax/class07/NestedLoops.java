package com.syntax.class07;

public class NestedLoops {public static void main(String[] args) {
	
	
	for (int i=1; i<=3;i++) 
	{  System.out.println("Hello");
	for (int y=1;y<=2; y++) 
	{   System.out.println("Bye");}  }

System.out.println("------------------");

for (int i=1; i<=3;i++) 
{  System.out.print("Who let the dogs out ");
for (int y=1;y<=2; y++) 
{   System.out.println("Who, who? ");}  }



for  (int a=0; a<=9; a++) 
{ for (int b=0; b<=9; b++) 
{for (int c=0; c<=9; c++) {System.out.println(a+" "+b+" "+c); }}
{}}


}}
