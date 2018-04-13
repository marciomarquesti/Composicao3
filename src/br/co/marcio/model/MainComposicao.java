package br.co.marcio.model;

public class MainComposicao {

	public static void main(String[] args) {

		Carro carro = new Carro("Corolla");
		
		carro.addEngenheiro("Márcio");
		carro.addEngenheiro("Marcelo");
		carro.addEngenheiro("Carlos");
		
		for(int i=0;i<carro.getEngenheiro().size();i++) {
			System.out.println(carro.getEngenheiro().get(i).getNome());
		}
		
	}

}
