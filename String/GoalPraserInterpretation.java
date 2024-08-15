package String;

public class GoalPraserInterpretation {
    public String interpret(String command) {


        //incomplete

        String builder = "";
        for(char character : command.toCharArray()){

            String stringChar = String.valueOf(character);
            if(stringChar == "G"){
                builder+="G";
            }
            else if(stringChar == "()"){
                builder+= "o";
            }
            else if (stringChar == "(al)") {
                builder+="al";
            }
        }
        return builder;
        
    }

    public static void main(String[] args) {
        GoalPraserInterpretation Coffee = new GoalPraserInterpretation();
        System.out.print(Coffee.interpret("G()(al)"));
    }
}
