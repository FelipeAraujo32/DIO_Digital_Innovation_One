package com.padores.spring.padroesspring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderencoRepository  extends CrudRepository<Endereco, String>{


}
