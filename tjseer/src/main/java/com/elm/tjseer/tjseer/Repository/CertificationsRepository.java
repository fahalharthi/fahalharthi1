package com.elm.tjseer.tjseer.Repository;

import com.elm.tjseer.tjseer.Models.Certifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationsRepository extends JpaRepository<Certifications,Integer> {
}
