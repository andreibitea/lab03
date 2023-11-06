package Lab3;

public class P1 {
    public static void main(String[] args){
        String[] a = {"java","test","university"};
        String[] b = {"car","university","plane"};
            for(int i=0; i<a.length; i++)
                for(int j=0; j<b.length; j++)
                    if (a[i] == b[j])
                        System.out.println(a[i]);
    }
}
