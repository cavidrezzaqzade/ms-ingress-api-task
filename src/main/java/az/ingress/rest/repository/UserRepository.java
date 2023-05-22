package az.ingress.rest.repository;

import az.ingress.rest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author caci
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
