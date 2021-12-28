package pl.jakusz.offertable.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.jakusz.offertable.model.AdminUser;

@Repository
public interface AdminUserRepo extends JpaRepository<AdminUser, Long> {

    AdminUser findByUsername(String username);

}
