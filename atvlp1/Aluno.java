public class Aluno extends Pessoa{

	private String email;
	private String telefone;
	
	public Aluno(){
	super();
	this.email = "";
	this.telefone = "";
	}
	public Aluno(String nome, Integer dia, Integer mes, Integer ano, String email, String telefone){
		super(nome, dia, mes, ano);
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getTelefone(){
		return telefone;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String toString(){
		return super.toString() + "\nO email é: " + this.email + "\nO telefone é: " + this.telefone;
	}

}