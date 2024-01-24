class nithin
{
  public static void main(String args[])
   {
      int a=30,b=10,c=20,d=0;
     
      if(a>b) 
      {
       d=a;
       a=b;
       b=d;
      }

         if(b>c) 
       {
        d=b;
        b=c;
        c=d; 
         
      }
         if(a>c)
       {
         d=c;
         c=b;
         b=c;
      }
     
      System.out.println("a="+a);
      System.out.println("b="+b);
      System.out.println("c="+c);
  }
} 


     

     


    
     



      
