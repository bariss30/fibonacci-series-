
package fibonacci;


public class Fibonacci {

   
    public static void main(String[] args) {
     int s1,s2,temp;
     s1=0;
     s2=1;
        System.out.println(s1);
        System.out.println(s2);
do
{
    temp=s1;
    s1=s2;
    s2=temp+s2;
    if(s2>=1000){
    break;
    }
    
    System.out.println(s2);

   
} while(s2<1000);
     


        System.out.println("goodby");
     
        
        
            }
    
}
