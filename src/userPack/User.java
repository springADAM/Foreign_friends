package userPack;

import java.util.ArrayList;

public class User {

    protected String nom;
    protected String prenom;
    protected String nationality;
    protected ArrayList<Friends> f = new ArrayList<>();

    public String getNationality() {
        return nationality;
    }

    public User(String nom, String prenom,String nationality) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationality= nationality;
    }

    public void insertF(Friends f) {
        this.f.add(f);
    }
    public ArrayList<Friends> getF(){
        return f;
    }

    @Override
    public String toString() {
        return "Nom : "+nom+" Prenom : "+prenom+" Nationality : "+nationality;
    }

    @Override
    public boolean equals(Object obj) {

        return (((User) obj).nationality == this.nationality);
    }
}
