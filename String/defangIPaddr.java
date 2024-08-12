package String;

public class defangIPaddr {
    public String defangIPaddr(String address) {

        //Replacing the . with [.]
        return address.replace(".", "[.]");
        
    }
    
	public static void main(String[] args) {
		defangIPaddr Coffee  = new defangIPaddr();
		System.out.println(Coffee.defangIPaddr("255.100.50.0"));//testcase
	}
    
}
