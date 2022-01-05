package pl.jakusz.offertable.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.jakusz.offertable.model.OfferTable;

import java.util.List;


public interface OfferTableRepo extends JpaRepository<OfferTable, Long> {

    @Query("SELECT o FROM OfferTable o WHERE o.workplace LIKE %?1%")
    List<OfferTable> search(String keyword);
}
