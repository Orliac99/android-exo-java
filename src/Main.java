class Livre {
    private string titre, auteur;
    private int nombre_de_page;
    double prix;
    public Livre(String t, String a, int nb, double p){
        titre = t;
        auteur = a;
        nombre_de_page = nb;
        prix = p;
    }
}
class Romans extends Livre{
    private boolean format ;
    public Romans(string t, string a, int nb, double p, boolean f){
        super(t,a,nb,p) ;
        format = f ;
    }
}
class Mangas extends Livre{
    private boolean encouleur ;
    public Mangas(string t, string a, int nb, double p, boolean ec){
        super(t,a,nb,p) ;
        encouleur = ec ;
    }
}
class Albums extends Livre{
    private boolean  page_coloriee ;
    public Albums(string t, string a, int nb, double p, boolean pc){
        super(t,a,nb,p) ;
        page_coloriee = pc ;
    }
}