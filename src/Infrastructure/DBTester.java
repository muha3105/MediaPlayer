package Infrastructure;

/**
 *
 * @author tha
 */
public class DBTester {

    public static void main (String [] args){
        
//This is a test for the master


        do{
           String data = DB.getDisplayData();
           if (data.equals(DB.NOMOREDATA)){
               break;
           }else{
               System.out.print(data);
           }   
        } while(true);
        

        
        System.out.println("numberOfColumns="+DB.getNumberOfColumns());
        do{
           String data = DB.getData();
           if (data.equals(DB.NOMOREDATA)){
               break;
           }else{
               System.out.print(data);
           }   
        } while(true);
       
    }
    
}
