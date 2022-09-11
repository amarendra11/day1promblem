package example4;

public class example4 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<args.length;i++)
        {
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("sum of natural numbers" +sum);
    }
}
