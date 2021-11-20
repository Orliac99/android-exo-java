public class album extends livre{

    private boolean  page_coloriee ;
    public Albums(string t, string a, int nb, double p, boolean pc){
    super(t,a,nb,p) ;
    page_coloriee = pc ;
    }

    @Override
    public void acheter() {
        System.out.println("Cet Album a été acheter par <nom de l'acheteur>.");
    }
}