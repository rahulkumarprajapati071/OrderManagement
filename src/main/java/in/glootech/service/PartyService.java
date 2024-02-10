package in.glootech.service;

import java.util.List;

import in.glootech.entity.Party;

public interface PartyService {
    Party createParty(Party party);
    Party getParty(String partyId);
    List<Party> getAllParties();
    Party updateParty(String partyId, Party party);
    void deleteParty(String partyId);
}

