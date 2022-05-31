package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema,Long>{
	/*
	O Jpa converte através do FindAll tudo que está no Java 
	para a linguagem MySQL
	*/
	
	//Buscar todos pela Descricao
	//Containing é o Like do MySQL
	//IgnoreCase não considera maiúsculo e minúsculo
	//O Descricao aqui chama o Atributo de Classe "descricao" da classe Tema
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}

