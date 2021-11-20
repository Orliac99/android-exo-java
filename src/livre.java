public abstract class livre implements livraison {
    private string titre, auteur;
    private int nombre_de_page;
    double prix;
    public abstract Livre(String t, String a, int nb, double p){
        titre = t;
        auteur = a;
        nombre_de_page = nb;
        prix = p;
    }

    public abstract void acheter();

    @Override
    public void stocker();
}