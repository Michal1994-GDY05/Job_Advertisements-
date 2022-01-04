package pl.jakusz.offertable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jakusz.offertable.model.OfferTable;
import pl.jakusz.offertable.repo.OffertTableRepo;

import java.util.List;

@Service
public class OfferTableServiceImp implements OfferTableService{

    @Autowired
    private OffertTableRepo offertTableRepo;

    @Override
    public List<OfferTable> getAllLppOffert() {
        return offertTableRepo.findAll();
    }

    @Override
    public List<OfferTable> searchLppOffer(String keyword) {
        if (keyword != null) {
            return offertTableRepo.search(keyword);
        }
        return offertTableRepo.findAll();
    }
}
