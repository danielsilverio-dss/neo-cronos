package br.com.silentlight.cronos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.silentlight.cronos.entity.Character;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long>{

}
