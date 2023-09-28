package backend.truetrip.repositories;

import backend.truetrip.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    List<Users> findByNameContaining(String name);
}
