package alien.learn.ademo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import alien.learn.ademo.entity.Clientinfo;

public interface ClientinfoRepository extends JpaRepository<Clientinfo, Integer> {

    Optional<Clientinfo> findByName(String name);

    Optional<Clientinfo> findByIdNumber(String idNumber);

};
