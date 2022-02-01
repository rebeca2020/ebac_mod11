package br.com.exercicio;

public class Persona {

	private String nome;
	private String sexo;

	public Persona(String nome, String sexo) { // obs:preciso passar 2 informações lá na lista.

		this.nome = nome;
		this.sexo = sexo;
	}

	
	public String toString() { // toString usado para converter o objeto em String.
		return this.nome;
	}
	
//	
//	@Override
//	public String toString() {
//		return "Persona [nome=" + nome + ", sexo=" + sexo + "]";
//	}

//Implementação para não haver repetição do objeto.(equals e hashCode).
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
