package com.elm.tjseer.tjseer.Controllers;


import com.elm.tjseer.tjseer.Services.CertificationsService;
import com.elm.tjseer.tjseer.Models.Certifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
public class CertificationsController {

    @Autowired
    private CertificationsService certificationsService;


    @PostMapping(value = "/addCert")
    public Certifications addCerts(@RequestBody Certifications certifications){
        return certificationsService.addCerts(certifications);
    }

    @GetMapping(value = "/getAllCerts")
    public List<Certifications> getAllCerts(){
        return certificationsService.getAllCerts();
    }

    @GetMapping(value = "/getCerts")
    public Certifications getUser(@PathVariable("{/id}") int certsID){
        return certificationsService.getUser(certsID);
    }

    @PutMapping( "updateCerts{/id}")
    public Certifications updateUsers(@RequestBody Certifications certifications, @PathVariable("id")int certsID){
        return certificationsService.updateUsers(certifications,certsID);
    }

    @DeleteMapping(value = "/deleteCert")
    public void deleteUser(@PathVariable("userID") int userID){
        certificationsService.delete(userID);

    }
    @DeleteMapping(value = "/deleteAllCerts")
    public String deleteAllUser(){
         certificationsService.deleteAllCerts();
        return"All certifiactes are deleted";
    }

}
