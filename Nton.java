
public class Nton {
    
    private final int N = 2; //Here you can determine how many objects can be created out of this class.


    private static int count_obj= 0; 
    private String val1;
    private String val2;



    public Nton (String val1, String val2) throws Exception{
        if (count_obj >= N) 
            throw new Exception("Can't create more objects than " + count_obj);
        else {
            count_obj++;
            this.val1 = val1;
            this.val2 = val2;
        }


    }

    public int getObjCount(){
        return count_obj;
    }

    public String getVal1 (){
        return this.val1;
    }

    public String getVal2 (){
        return this.val2;
    }
    
    
    public void setVal1 (String newVal){
        this.val1 = newVal;
    }
    
    public void setVal2 (String newVal){
        this.val2 = newVal;
    }

    public String toString(){
        return new String("this object has val1, val2 "+ val1 +" and " + val2 +" Respectively.");
    }
}
