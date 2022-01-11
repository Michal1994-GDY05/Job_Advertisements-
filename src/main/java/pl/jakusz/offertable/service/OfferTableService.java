package pl.jakusz.offertable.service;

import org.springframework.stereotype.Service;
import pl.jakusz.offertable.model.OfferTable;

import java.util.List;


public interface OfferTableService {

    List<OfferTable> getAllLppOffer();
    List<OfferTable> search_job_offers(String keyword);
    OfferTable hide_or_disclose_a_job_offer_byID(long id);
    OfferTable getOfferTableByID(Long id);
}
