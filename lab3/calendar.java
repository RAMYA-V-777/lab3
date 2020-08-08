/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class calendar {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter the year:");
        int y=obj.nextInt();
        System.out.println("Enter the month you need to view:");
        int month=obj.nextInt();
        System.out.println("\nEnter the startnumber of the day in which the year begins:");
        int beginningday=obj.nextInt();
        int n=0;
            switch(month)
            {
                case 1:
                    System.out.println("     January-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                    
                    if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                    n=31;
                      
                        
                 for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
              
                 
                     break;
                case 2:
                     System.out.println("        Febraury-"+y);
                     System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                       if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                     
                   n=28;    
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                      break;
                case 3:
                     System.out.println("         March-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      
                        n=30;
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                   
                    break;
                case 4:
                    System.out.println("      April-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      
                        n=31;
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                   
                    break;
                 case 5:
                    System.out.println("          May-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      
                        n=31;
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                   
                    break;
                 case 6:
                    System.out.println("        June-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      n=30;
                        
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                    
                    break;
                 case 7:
                    System.out.println("          July-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      n=31;
                        
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                   
                    break;
                  case 8:
                      System.out.println("       August-"+y);
                    System.out.println(" Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      n=31;
                        
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                   
                    break;
                  case 9:
                    System.out.println("         September-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      
                        n=30;
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                    break;
                   case 10:
                    System.out.println("       October-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      
                        n=31;
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                 
                    break;   
                   case 11:
                    System.out.println("       November-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      
                        n=30;
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                    
                    break;
                   case 12:
                    System.out.println("             December-"+y);
                    System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
                      if(beginningday==1)
                     System.out.println("   ");
                    else if(beginningday==2)
                      System.out.println("       ");
                    else if(beginningday==3)
                       System.out.println("          ");
                    else if(beginningday==4)
                         System.out.println("             ");
                    else if(beginningday==5)
                          System.out.println("                 ");
                    else if(beginningday==6)
                           System.out.println("                    ");
                    else if(beginningday==7)
                            System.out.println("                       ");
                      
                        n=31;
                  for(int day=1;day<=n;day++)
                    {
                        if(day<7){
                             System.out.println(day+"  ");
                        }
                        else{
                             System.out.println(day+"  ");
                        }
                       if(day%7 == 0)
                        {
                             System.out.println();
                        }
                      
                    }
                    
                    break;    
                   default:
                       System.out.println("\nYour month is not present in any year");
                      
            }
       
                    
            
            
                          
                     }
                         
                    
            }
            
        
        
        
    
    
