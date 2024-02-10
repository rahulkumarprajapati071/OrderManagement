package in.glootech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.glootech.entity.Party;
import in.glootech.repository.PartyRepo;

@Service
public class PartyServiceImpl implements PartyService {

    @Autowired
    private PartyRepo partyRepository;

    @Override
    public Party createParty(Party party) {
        return partyRepository.save(party);
    }

    @Override
    public Party getParty(String partyId) {
        return partyRepository.findById(partyId).orElse(null);
    }

    @Override
    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }

    @Override
    public Party updateParty(String partyId, Party party) {
        if (partyRepository.existsById(partyId)) {
            party.setPartyId(partyId);
            return partyRepository.save(party);
        }
        return null;
    }

    @Override
    public void deleteParty(String partyId) {
        partyRepository.deleteById(partyId);
    }
}

