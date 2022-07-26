package dio.com.model;

import java.util.Objects;

public class Gato {

	private String Nome;
	private String Cor;
	private int idade ;
	
	public Gato(String nome, String cor, int idade) {
		Nome = nome;
		Cor = cor;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Gato [Nome=" + Nome + ", Cor=" + Cor + ", idade=" + idade + ", hashCode()=" + hashCode()
				+ ", getNome()=" + getNome() + ", getCor()=" + getCor() + ", getIdade()=" + getIdade() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Cor, Nome, idade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(Cor, other.Cor) && Objects.equals(Nome, other.Nome) && idade == other.idade;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
