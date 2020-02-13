package com.elm.tjseer.tjseer.Implementation;

import com.elm.tjseer.tjseer.Models.Certifications;
import com.elm.tjseer.tjseer.Repository.CertificationsRepository;
import com.elm.tjseer.tjseer.Services.CertificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationsImplementation implements CertificationsService {

    @Autowired
    public CertificationsRepository rep;

    @Override
    public Certifications addCerts(Certifications certifications) {
        return rep.save(certifications);
    }

    @Override
    public List<Certifications> getAllCerts() {
        return rep.findAll();
    }

    @Override
    public Certifications getUser(int certsID) {
        return rep.findById(certsID).get();
    }

    @Override
    public Certifications updateUsers(Certifications certifications, int certsID) {
        certifications.setCertsID(certsID);
        return rep.save(certifications);
    }

    @Override
    public void delete(int certsID) {
        rep.deleteById(certsID);

    }

    @Override
    public String deleteAllCerts() {
        rep.deleteAll();
        return"All Certifications are delete";
    }
}


