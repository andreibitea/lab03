package Lab3;

public class P2 {
    public static void main(String[] args){
        int[] s = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nr, ok;
        for(int i=0; i<s.length; i++){
            nr=s[i];
            ok=1;
            for(int j=2; j<=nr/2; j++)
                if(nr%j==0){
                    ok=0;
                    break;
                }
            if(nr==1) ok=0;
            if(ok==1) System.out.println(nr);
        }
    }
}
