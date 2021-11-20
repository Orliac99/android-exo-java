public class mangas extends livre{
    
    private boolean encouleur ;
    public Mangas(string t, string a, int nb, double p, boolean ec){
        super(t,a,nb,p) ;
        encouleur = ec ;
    }

    @Override
    public void acheter() {
        System.out.println("Ce Mangas a été acheter par <nom de l'acheteur>.");
    }
}