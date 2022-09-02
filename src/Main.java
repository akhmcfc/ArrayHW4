public class Main {
    public static void main(String[] args)
    {
        int[] original={5,4,-7,-2,-1};
        int[] reversed= new int[original.length];
        for (int i=0; i< original.length;i=i+1)
        {
            reversed[i]=original[original.length-1- i];
            System.out.println(reversed[i]);
        }

    }
}