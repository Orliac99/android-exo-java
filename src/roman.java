public class roman extends livre{

    private boolean format ;
    public Romans(string t, string a, int nb, double p, boolean f){
        super(t,a,nb,p) ;
        format = f ;
    }

    @Override
    public void acheter() {
        System.out.println("Ce Roman a été acheter par <nom de l'acheteur>.");        
    }
}