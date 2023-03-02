import java.time.LocalDate;

public class Pessoa{

	private String nome;
	private LocalDate datanascimento;
	
	public Pessoa(){
		this.nome = "";
		this.datanascimento = LocalDate.now();
	}
	public Pessoa(String nome, Integer dia, Integer mes, Integer ano){
		this.nome = nome;
		this.datanascimento = LocalDate.of(ano, mes, dia);
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public LocalDate getDatanascimento(){
		return datanascimento;
	}
	public void setDatanascimento(LocalDate datanasc){
		this.datanascimento = datanasc;
	}
	
	public String toString(){
		return "O nome é: " + this.nome + "\nA data de nascimento é: " + this.datanascimento;
	}
}