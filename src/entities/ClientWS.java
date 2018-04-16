package entities;

import java.util.List;

import services.BanqueService;
import services.BanqueWS;
import services.Compte;

public class ClientWS {


	public static void main(String[] args) {
		BanqueService stub = new BanqueWS().getBanqueServicePort();
		System.out.println("Conversion");
		System.out.println(stub.conversionEuroToDh(9000F));
		System.out.println("Consulter un compte");
		Compte cp = stub.getCompte(2L);
		System.out.print("Pour le compte="+" " + cp.getNomCompte() + ", ");
		System.out.println("votre solde est de ="+" " + cp.getSolde());
//		System.out.println("Liste des comptes" + cp.getComptes());
		List<Compte> cptes = stub.getComptes();
		System.out.println("DETAIL DES COMPTES");
		for (Compte cmpt : cptes) {
		
			System.out.println("Nom du compte: "+cmpt.getNomCompte() +" "+"N°: "+ " "+cmpt.getCode() +" "+ "le solde est de :" +cmpt.getSolde());
		}

	}
}
