
public class ExcelSheetColumnTitle {
        public String convertToTitle(int columnNumber) {
            StringBuilder s = new StringBuilder();
            while(columnNumber > 0){
                int i =  (columnNumber-1)%26;
                s.append((char)(i+'A'));
                columnNumber=(columnNumber-1)/26;  
            }
            return s.reverse().toString();
        }
    public static void main(String[] args) {
        ExcelSheetColumnTitle Coffee = new ExcelSheetColumnTitle();
        System.out.println(Coffee.convertToTitle(28));
    }
}
