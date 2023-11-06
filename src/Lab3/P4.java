package Lab3;

public class P4 {
    public static void main(String[] args){
        String n = "Ele fac cafele";
        String p;
        int ok=1;
        for(int i=0; i<n.length; i++)
            p[i]=n[i];
        for(int i=0; i<n.length; i++)
            for(int j = n.length-1; j>=0; j--)
                if(n[i]!=p[j]){
                    ok=0;
                    System.out.println("Cuvantul nu este palindrom");
                    break;
                }
        if(ok==1) System.out.println("Cuvantul este palindrom");
    }
}
