package br.co.marcio.model;

import java.util.ArrayList;

public class Carro {

	private String modelo;
	
	private ArrayList<Engenheiro> engenheiros;
	
	public Carro (String modelo) {
		engenheiros = new ArrayList<Engenheiro>();
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public ArrayList<Engenheiro> getEngenheiro() {
		return engenheiros;
	}
	
	
	public void addEngenheiro(String nome) {
		Engenheiro engenheiro = new Engenheiro(nome);
		this.getEngenheiro().add(engenheiro);
	}
}
