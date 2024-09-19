package DynamicProgramming;

public class ClimingStairs {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int a =3; int b=2;
        for(int i = 0;i<n-3;i++){
            a=a+b;
            b=a-b;
        }
        return a;

    }
    public static void main(String[] args) {
        ClimingStairs Coffee = new ClimingStairs();
        System.out.println(Coffee.climbStairs(3));
    }
}
