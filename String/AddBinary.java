

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder out = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int val = 0;
        while(i>=0||j>=0){
            int sum = val;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            out.append(sum%2);
            val = sum/2;
            i--;
            j--;
        }
        if(val!=0){
            out.append(val);
        }
        return out.reverse().toString();

    }
    public static void main(String[] args) {
        AddBinary Coffee = new AddBinary();
        System.out.println(Coffee.addBinary("11", "1"));
    }
}
