package InnerClass;



public class InnerClass {
    class FirstName{
      
            void Show(){
                System.out.println("Hey");
            
            }
        
    }

    public static void main(String ags[]){
       FirstName obj= new InnerClass().new FirstName();
     
       obj.Show();
    }
  

}
