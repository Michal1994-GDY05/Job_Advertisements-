package pl.jakusz.offertable.staty;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.jakusz.offertable.model.AdminUser;
import pl.jakusz.offertable.model.OfferTable;
import pl.jakusz.offertable.model.OfferTable_TypeOffer;
import pl.jakusz.offertable.repo.AdminUserRepo;
import pl.jakusz.offertable.repo.OfferTableRepo;
import pl.jakusz.offertable.repo.TypeOfferRepo;

@Component
public class Staty {

    private PasswordEncoder passwordEncoder;
    private AdminUserRepo adminUserRepo;
    private OfferTableRepo offerTableRepo;
    private TypeOfferRepo typeOfferRepo;

    public Staty(PasswordEncoder passwordEncoder, AdminUserRepo adminUserRepo, OfferTableRepo offerTableRepo, TypeOfferRepo typeOfferRepo) {
        this.passwordEncoder = passwordEncoder;
        this.adminUserRepo = adminUserRepo;
        this.offerTableRepo = offerTableRepo;
        this.typeOfferRepo = typeOfferRepo;
//
//        AdminUser user = new AdminUser();
//        user.setUsername("Admin");
//        user.setPassword(passwordEncoder.encode("Admin123"));
//        user.getAuthorities();
//        adminUserRepo.save(user);
//
//
//
//
//
//        OfferTable_TypeOffer offerTableTypeOffer = new OfferTable_TypeOffer();
//        offerTableTypeOffer.setCity("Gdańsk");
//        offerTableTypeOffer.setOffer_Type("Zdalnie");
//        offerTableTypeOffer.setSpecialist("Senior");
//        typeOfferRepo.save(offerTableTypeOffer);
//
//        OfferTable_TypeOffer offerTableTypeOffer2 = new OfferTable_TypeOffer();
//        offerTableTypeOffer2.setCity("Gdańsk");
//        offerTableTypeOffer2.setOffer_Type("Stacjonarnie");
//        offerTableTypeOffer2.setSpecialist("Junior");
//        typeOfferRepo.save(offerTableTypeOffer2);
//
//        OfferTable_TypeOffer offerTableTypeOffer3 = new OfferTable_TypeOffer();
//        offerTableTypeOffer3.setCity("Gdańsk");
//        offerTableTypeOffer3.setOffer_Type("Hybrydowo");
//        offerTableTypeOffer3.setSpecialist("Mid");
//        typeOfferRepo.save(offerTableTypeOffer3);
//
//        OfferTable_TypeOffer offerTableTypeOffer4 = new OfferTable_TypeOffer();
//        offerTableTypeOffer4.setCity("Gdańsk");
//        offerTableTypeOffer4.setOffer_Type("Stacjonarnie");
//        offerTableTypeOffer4.setSpecialist("Staz");
//        typeOfferRepo.save(offerTableTypeOffer4);
//
//        OfferTable_TypeOffer offerTableTypeOffer5 = new OfferTable_TypeOffer();
//        offerTableTypeOffer5.setCity("Gdańsk");
//        offerTableTypeOffer5.setOffer_Type("Hybrydowo");
//        offerTableTypeOffer5.setSpecialist("Mid");
//        typeOfferRepo.save(offerTableTypeOffer5);
//
//        OfferTable_TypeOffer offerTableTypeOffer6 = new OfferTable_TypeOffer();
//        offerTableTypeOffer6.setCity("Gdańsk");
//        offerTableTypeOffer6.setOffer_Type("Zdalnie");
//        offerTableTypeOffer6.setSpecialist("Senior");
//        typeOfferRepo.save(offerTableTypeOffer6);
//
//        OfferTable_TypeOffer offerTableTypeOffer7 = new OfferTable_TypeOffer();
//        offerTableTypeOffer7.setCity("Gdańsk");
//        offerTableTypeOffer7.setOffer_Type("Hybrydowo");
//        offerTableTypeOffer7.setSpecialist("Mid");
//        typeOfferRepo.save(offerTableTypeOffer7);
//
//        OfferTable_TypeOffer offerTableTypeOffer8 = new OfferTable_TypeOffer();
//        offerTableTypeOffer8.setCity("Gdańsk");
//        offerTableTypeOffer8.setOffer_Type("Zdalnie");
//        offerTableTypeOffer8.setSpecialist("Senior");
//        typeOfferRepo.save(offerTableTypeOffer8);
//
//
//
//        OfferTable lpp = new OfferTable();
//        lpp.setPlaceOfWork("Gdańsk");
//        lpp.setWorkplace("PHP DEVELOPER");
//        lpp.setActive(false);
//        lpp.setOfferTableTypeOffers(offerTableTypeOffer);
//        offerTableRepo.save(lpp);
//
//        OfferTable lpp2 = new OfferTable();
//        lpp2.setPlaceOfWork("Gdańsk");
//        lpp2.setWorkplace("JAVA DEVELOPER");
//        lpp2.setActive(false);
//        lpp2.setOfferTableTypeOffers(offerTableTypeOffer2);
//        offerTableRepo.save(lpp2);
//
//        OfferTable lpp3 = new OfferTable();
//        lpp3.setPlaceOfWork("Gdańsk");
//        lpp3.setWorkplace("SYSTEM ARCHITEKT - APLIKACJE MOBILNE");
//        lpp3.setOfferTableTypeOffers(offerTableTypeOffer3);
//        offerTableRepo.save(lpp3);
//
//        OfferTable lpp4 = new OfferTable();
//        lpp4.setPlaceOfWork("Gdańsk");
//        lpp4.setWorkplace("ANALITYCZKA SYSTEMOWA/ ANALITYK SYSTEMOWY");
//        lpp4.setOfferTableTypeOffers(offerTableTypeOffer4);
//        offerTableRepo.save(lpp4);
//
//        OfferTable lpp5 = new OfferTable();
//        lpp5.setPlaceOfWork("Gdańsk");
//        lpp5.setWorkplace("JUNIOR PHP DEVELOPER");
//        lpp5.setOfferTableTypeOffers(offerTableTypeOffer5);
//        offerTableRepo.save(lpp5);
//
//        OfferTable lpp6 = new OfferTable();
//        lpp6.setPlaceOfWork("Gdańsk");
//        lpp6.setWorkplace("SOFTWARE TESTER");
//        lpp6.setOfferTableTypeOffers(offerTableTypeOffer6);
//        offerTableRepo.save(lpp6);
//
//        OfferTable lpp7 = new OfferTable();
//        lpp7.setPlaceOfWork("Gdańsk");
//        lpp7.setWorkplace("SCRUM MASTER");
//        lpp7.setOfferTableTypeOffers(offerTableTypeOffer7);
//        offerTableRepo.save(lpp7);
//
//        OfferTable lpp8 = new OfferTable();
//        lpp8.setPlaceOfWork("Gdańsk");
//        lpp8.setWorkplace("ANDROID DEVELOPER");
//        lpp8.setOfferTableTypeOffers(offerTableTypeOffer8);
//        offerTableRepo.save(lpp8);



    }
}
