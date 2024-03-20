package com.ifgoiano.TopFilmes.domain.domainException;

public class RegrasDeNegocioException extends RuntimeException{
    public RegrasDeNegocioException(String mensagem){
        super(mensagem);
    }
}
