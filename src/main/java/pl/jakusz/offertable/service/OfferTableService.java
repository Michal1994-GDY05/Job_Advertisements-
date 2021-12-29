package pl.jakusz.offertable.service;

import org.springframework.stereotype.Service;
import pl.jakusz.offertable.model.OfferTable;

import java.util.List;


public interface OfferTableService {

    List<OfferTable> getAllLppOffert();

}
