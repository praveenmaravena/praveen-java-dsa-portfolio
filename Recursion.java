public class Recursion{
    public static void main(String[] args){
        System.out.println("Portfolio after 5 years:" + compoundInterest(10000,5));
    }
    public static double compoundInterest(double principle, int years){
        if(years==0){
            return principle;
        }
        return compoundInterest(principle*2,years-1);
    }
}