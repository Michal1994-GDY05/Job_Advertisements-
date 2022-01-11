package pl.jakusz.offertable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jakusz.offertable.model.OfferTable;
import pl.jakusz.offertable.repo.OfferTableRepo;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OfferTableServiceImp implements OfferTableService {

    @Autowired
    private OfferTableRepo offerTableRepo;

    @Override
    public List<OfferTable> getAllLppOffer() {
        List<OfferTable> findAll_and_sorted = offerTableRepo.findAll()
                .stream()
                .sorted(Comparator.comparing(OfferTable::isActive))
                .collect(Collectors.toList());

        return findAll_and_sorted;
    }

    @Override
    public List<OfferTable> search_job_offers(String keyword) {
        if (keyword != null) {
            return offerTableRepo.search(keyword);
        }
        return offerTableRepo.findAll();
    }

    @Override
    public OfferTable hide_or_disclose_a_job_offer_byID(long id) {

        OfferTable offerTable = offerTableRepo.getById(id);

        if (offerTable.isActive()) {
            offerTable.setActive(false);
            offerTableRepo.save(offerTable);
        } else {
            offerTable.setActive(true);
            offerTableRepo.save(offerTable);
        }
        return offerTable;
    }

    @Override
    public OfferTable getOfferTableByID(Long id) {
        Optional<OfferTable> optional = offerTableRepo.findById(id);
        OfferTable offerTable = null;
        if (optional.isPresent()) {
            offerTable = optional.get();
        } else {
            throw new RuntimeException("Offer table not found for id: " + id);
        }
        return offerTable;
    }
}
