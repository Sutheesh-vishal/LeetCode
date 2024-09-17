public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for(int i = 0;i<columnTitle.length();i++){
            char col = columnTitle.charAt(i);
            int val = col- 'A'+1;
            res = res*26+val;
        }
        return res;
    }
    public static void main(String[] args) {
        ExcelSheetColumnNumber Coffee = new ExcelSheetColumnNumber();
        System.out.println(Coffee.titleToNumber("AB"));
    }
}
