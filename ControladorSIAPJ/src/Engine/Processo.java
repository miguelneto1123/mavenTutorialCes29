package Engine;

public class Processo {
	private int id;
	private String NomeReclamante, Telefone,Email,Content;
	public void setNomeReclamante(String s){
		this.NomeReclamante = s;
	}
	public void setTelefone(String s){
		this.Telefone = s;
	}
	public void setEmail(String s){
		this.Email = s;
	}
	public void setContent(String s){
		this.Content = s;
	}
	public void setID(int i){
		this.id = i;
	}
	public int getID(){
		return id;
	}
	public String getNomeReclamante(){
		return this.NomeReclamante;
	}
	public String getTelefone(){
		return this.Telefone;
	}
	public String getEmail(){
		return this.Email;
	}
	public String getContent(){
		return this.Content;
	}
}
