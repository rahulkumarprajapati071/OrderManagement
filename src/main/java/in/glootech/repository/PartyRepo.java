package in.glootech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.glootech.entity.Party;

public interface PartyRepo extends JpaRepository<Party, String>{

}
