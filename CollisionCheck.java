import java.io.*;
class Collide extends Exception
{
    String message;
    Collide(String message)
    {
       super(message);
     } 
}
class CollisionCheck
{
    public static void main(String args[])throws IOException
    {
          String t1 = null;
          String t2 = null;
          try
          {
          
                 DataInputStream obj = new DataInputStream(System.in);
                 System.out.println("Enter the Truck 1's direction");
                 t1 = obj.readLine();
          
                System.out.println("Enter the Truck 2's direction");
                t2 = obj.readLine();
          
                if(!t1.equals(t2))
          {  
                throw new Collide("Truck t2 must head " + t1);
          }
          else
          {
               System.out.println("No problem in the directions");
          }
          }
       catch (Collide c)
       {
            System.out.println("Exception caught");
            t2 = t1;
            System.out.println("Collision was avoided by redirection");
       }
          System.out.println("The direction of t1 :" + t1);
          System.out.println("The direction of t2 :" + t2);
    }
}
