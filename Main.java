
public class Main{
    
    
    public static void main(String[] args){
        Nton obj1 = null,obj2 = null, obj3 = null;
        try {
            
           obj1 = new Nton("First object A", "First object B");
           System.out.print(obj1.getObjCount()+ "\n");
           obj2 = new Nton("Second object A", "Second object B");
           System.out.print(obj1.getObjCount()+ "\n");
            
        } catch (Exception e) {

        }
      System.out.print("success\n");
      System.out.print(obj1 + "\n");
      System.out.print(obj2 + "\n");
      try {
        obj3 = new Nton("lol","lol2");  
      } catch (Exception e) {

      }
      
      
      
      System.out.print(obj3 + "\n" + (obj1.getObjCount()));

}
    }
    
