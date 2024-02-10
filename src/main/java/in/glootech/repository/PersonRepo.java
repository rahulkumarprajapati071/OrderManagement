package in.glootech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.glootech.entity.Person;

public interface PersonRepo extends JpaRepository<Person, String>{

}
