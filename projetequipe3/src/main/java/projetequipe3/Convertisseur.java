package projetequipe3;

public class Convertisseur {
	
	public double euroToFranc(double montantEnEuro) {
		return montantEnEuro * 6.55957;
	}
	
	public double francToEuro(double montantEnFranc) {
		return montantEnFranc / 6.55957;
	}

}