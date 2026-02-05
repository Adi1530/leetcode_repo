package rough;
import java.util.Scanner;
public class rough_3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x=sc.nextInt();
        int ans=1;
        for(int i=x;i>0;i--){
            ans*=i;
        }
        System.out.println(ans);
    }

}
