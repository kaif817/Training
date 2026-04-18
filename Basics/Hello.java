public class Hello {
   public static void main(String[] args) {
       
        int score = 98;
        
        if(score>50)
               System.out.println("Passed");
        else
               System.out.println("Failed");
            
        if(score>=90)                     
               System.out.println("A");
        else if(score>74&&score<90)
                System.out.println("Grade: B");
        else if(score>59&&score<75)
                System.out.println("C");
        else
                System.out.println("D");
                
        
   }
}