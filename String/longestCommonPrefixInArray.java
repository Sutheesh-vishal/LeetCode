package String;

import javax.xml.transform.stream.StreamSource;

public class longestCommonPrefixInArray {
    public String longestCommonPrefix(String[] strs){

        String Prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(Prefix)!=0){
                Prefix=Prefix.substring(0, Prefix.length()-1);
            }
        }

        return Prefix;
    }
    public static void main(String[] args) {
        longestCommonPrefixInArray Coffee = new longestCommonPrefixInArray();
        System.out.println(Coffee.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
