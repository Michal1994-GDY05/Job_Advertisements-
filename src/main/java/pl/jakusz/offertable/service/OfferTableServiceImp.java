package pl.jakusz.offertable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jakusz.offertable.model.OfferTable;
import pl.jakusz.offertable.repo.OfferTableRepo;

import java.util.List;
import java.util.Optional;

@Service
public class OfferTableServiceImp implements OfferTableService{

    @Autowired
    private OfferTableRepo offerTableRepo;

    @Override
    public List<OfferTable> getAllLppOffer() {
        return offerTableRepo.findAll();
    }

    @Override
    public List<OfferTable> searchLppOffer(String keyword) {
        if (keyword != null) {
            return offerTableRepo.search(keyword);
        }
        return offerTableRepo.findAll();
    }

    @Override
    public OfferTable getOfferByID(long id) {

        OfferTable offerTable = offerTableRepo.getById(id);
        offerTable.setActive(false);
        offerTableRepo.save(offerTable);
        return offerTable;
    }
}
