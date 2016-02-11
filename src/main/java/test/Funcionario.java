package test;

import java.util.Date;

public class Funcionario {
	
	private int id;
	private String nome;
	private String funcao;
	private Date data;
	
	
	
	public Funcionario(String nome, String funcao, Date data) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	

}
