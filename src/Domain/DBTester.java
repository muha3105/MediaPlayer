package Domain;

/**
 *
 * @author tha
 */
public class DBTester {

    public static void main (String [] args){
        
//How is this showed


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
