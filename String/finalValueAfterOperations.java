package String;

public class finalValueAfterOperations {
        public int finalValueAfterOperations(String[] operations) {

            //initilizing variable
            int x = 0;

             //foreach for identifying the condition
            for(String operation : operations){

                //incrimenting/decrementing x
                if(operation.contains("--")) --x;
                else ++x;
            }
            return x;
        }
    public static void main(String[] args) {
        finalValueAfterOperations Coffee = new finalValueAfterOperations();
        System.out.println(Coffee.finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
    
}
