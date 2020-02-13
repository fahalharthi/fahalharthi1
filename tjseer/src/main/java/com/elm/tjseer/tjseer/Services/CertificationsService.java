package com.elm.tjseer.tjseer.Services;


import com.elm.tjseer.tjseer.Models.Certifications;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CertificationsService {

   public Certifications addCerts(Certifications certifications);

    public List<Certifications> getAllCerts();

    public Certifications getUser (int certsID);

    public Certifications updateUsers (Certifications certifications, int  certsID);

    public void delete(int certsID);

    public String deleteAllCerts();
}
