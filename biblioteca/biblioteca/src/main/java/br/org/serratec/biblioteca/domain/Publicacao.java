package br.org.serratec.biblioteca.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class Publicacao {
	
	@NotBlank(message = "Informe o nome do Autor")
	@Size(max = 60)
	@Column(nullable = false, length = 60)
	private String autor;
	
	@Column
	private LocalDate dataPublicacao;
	
	@Column
	private String editora;
	
	

	public String getAutor() {
		
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
