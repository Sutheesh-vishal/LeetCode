package Array;

public class numberOfEmployeesWhoMetTargetTotal {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target){

        int TargetMet = 0;
        for (int i = 0; i < hours.length; i++) {
         if(hours[i]>= target){
            TargetMet++;
         }   
        }
        return TargetMet;
    }

    public static void main(String[] args) {
        numberOfEmployeesWhoMetTargetTotal Coffee = new numberOfEmployeesWhoMetTargetTotal();
        System.out.println(Coffee.numberOfEmployeesWhoMetTarget(new int[]{98}, 2));
    }
}
