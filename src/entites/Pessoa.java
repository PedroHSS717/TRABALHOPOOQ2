package entites;

public class Pessoa {
	private String Nome;
	private Integer Idade;
	private int ano2050;
	public int getAno2050() { 
		
		return ano2050;
	}
	public void setAno2050(int ano2050) {
		this.ano2050 = ano2050;
	}
	public Pessoa() {
	
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Integer getIdade() {
		return Idade;
	}
	public void setIdade(Integer idade) {
		Idade = idade;
	}

	public void Calculo(int anodenascimento) {
		this.setIdade((2022 - anodenascimento) * 12);
		System.out.println("Sua idade em meses é: " + this.getIdade());
		
	}
	public void ano2050(int anodenascimento) {
		this.setAno2050(2050 - anodenascimento);
		System.out.println("Sua idade em 2050 é: " + this.getAno2050());
		
	}
	
	
	
	
	
	

}
