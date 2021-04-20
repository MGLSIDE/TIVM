package com.mycompany.myapp;
/*本项目虚拟机采用文本来存储指令，指令以文本形式
/*此项目为半成品项目，请诸位大佬来帮忙增加读写文件和识别指令过程*/
import java.io.*;

public class L 
{ 
   
  static int LC;
  static int AC;
  static int BC;
  static boolean  D;
  static boolean G;
  static boolean L;
 
  /*读写文件*/
  public static void main(String[] args)
	{

int[] a = { 0, 0, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
		/*虚拟堆栈和寄存器*/
		          int AL = 0;
		a[0] = AL;int BL = 0;
		a[1] = BL;int CL = 0;
		a[0] = CL;int LL = 0;
		a[0] = LL;int FL = 0;
		a[0] = FL;int GL = 0;
	    a[0] = GL;}

  
		/*使用全局变量来作为寄存器*/
		/*使用if语句实现寄存器比较指令*/
		
	  static void ABO(){   /*AC寄存器和BC寄存器的比较指令*/
		  if(AC-BC<0)
		  {D = true;} 
		   else{D=false;} 
		   }
		  
	 /*AC寄存器和LC寄存器的比较指令*/
	  static void ALO(){
		 if(AC-LC<0)
	  {    G  = false;   }
	  else{
		  G = true;
	  }
	  }
	  /*LC寄存器和BC寄存器的比较指令*/
	  static void LBO(){
		  if(LC-BC<0){
			  L = false;
		  }
		  else
		  {
			  L = true;
		  }
		  
	  }
	 }
