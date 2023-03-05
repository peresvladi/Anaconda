import java.util.ArrayList;
import java.util.List;

public class Test {
 public static void main(String[] args) {
   System.out.println(Test());
 } 
      
  
    
 
    public static Object Test(){
      List<java.lang.ref.WeakReference<Test>> instances = new ArrayList<>();
       
      return instances.add(new java.lang.ref.WeakReference<Test>(this));
    
 }
  }
