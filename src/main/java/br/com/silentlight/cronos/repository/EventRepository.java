package br.com.silentlight.cronos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.silentlight.cronos.entity.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long>{

}
