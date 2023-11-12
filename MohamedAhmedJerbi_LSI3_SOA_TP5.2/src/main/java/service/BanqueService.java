package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.List;

@WebService
public class BanqueService {
    List<Compte> comptes= new ArrayList<Compte>();
    double montant;
    public BanqueService(double montant){
        this.montant=montant;

    }
    @WebMethod
    public double conversion(@WebParam double montant) {
        return montant * 3.36;
    }
    public Compte getCompte(int x) {
        return comptes.get(x);
    }
    public List<Compte> getComptes(){
        return comptes;
    }

}