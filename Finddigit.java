import java.util.*;
class Finddigit{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int org=n;
            int c=0;
            while(n>0)
            {
                int dig=n%10;
                if(dig!=0 && (org%dig)==0)
                c++;
                n/=10;
            }
            System.out.println(c);
        }
    }
}
