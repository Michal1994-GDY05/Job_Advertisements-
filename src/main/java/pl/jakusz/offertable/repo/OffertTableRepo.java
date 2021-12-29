package pl.jakusz.offertable.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.jakusz.offertable.model.OfferTable;


public interface OffertTableRepo extends JpaRepository<OfferTable, Long> {
}
