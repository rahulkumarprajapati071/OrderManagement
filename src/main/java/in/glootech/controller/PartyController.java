package in.glootech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.glootech.entity.Party;
import in.glootech.service.PartyService;

@RestController
@RequestMapping("/parties")
public class PartyController {

    @Autowired
    private PartyService partyService;

    @PostMapping
    public ResponseEntity<Party> createParty(@RequestBody Party party) {
        Party createdParty = partyService.createParty(party);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdParty);
    }

    @GetMapping("/{partyId}")
    public ResponseEntity<Party> getParty(@PathVariable String partyId) {
        Party party = partyService.getParty(partyId);
        if (party != null) {
            return ResponseEntity.ok(party);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Party>> getAllParties() {
        List<Party> parties = partyService.getAllParties();
        return ResponseEntity.ok(parties);
    }

    @PutMapping("/{partyId}")
    public ResponseEntity<Party> updateParty(@PathVariable String partyId, @RequestBody Party party) {
        Party updatedParty = partyService.updateParty(partyId, party);
        if (updatedParty != null) {
            return ResponseEntity.ok(updatedParty);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{partyId}")
    public ResponseEntity<Void> deleteParty(@PathVariable String partyId) {
        partyService.deleteParty(partyId);
        return ResponseEntity.noContent().build();
    }
}

