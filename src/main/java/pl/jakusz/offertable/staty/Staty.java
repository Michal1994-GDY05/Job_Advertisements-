package pl.jakusz.offertable.staty;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.jakusz.offertable.model.AdminUser;
import pl.jakusz.offertable.model.OfferTable;
import pl.jakusz.offertable.model.TypeOffer;
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

        AdminUser user = new AdminUser();
        user.setUsername("Admin");
        user.setPassword(passwordEncoder.encode("Admin123"));
        user.getAuthorities();
        adminUserRepo.save(user);





        TypeOffer typeOffer = new TypeOffer();
        typeOffer.setCity("Gdańsk");
        typeOffer.setOffer_Type("Zdalnie");
        typeOffer.setSpecialist("Senior");
        typeOfferRepo.save(typeOffer);

        TypeOffer typeOffer2 = new TypeOffer();
        typeOffer2.setCity("Gdańsk");
        typeOffer2.setOffer_Type("Stacjonarnie");
        typeOffer2.setSpecialist("Junior");
        typeOfferRepo.save(typeOffer2);

        TypeOffer typeOffer3 = new TypeOffer();
        typeOffer3.setCity("Gdańsk");
        typeOffer3.setOffer_Type("Hybrydowo");
        typeOffer3.setSpecialist("Mid");
        typeOfferRepo.save(typeOffer3);

        TypeOffer typeOffer4 = new TypeOffer();
        typeOffer4.setCity("Gdańsk");
        typeOffer4.setOffer_Type("Stacjonarnie");
        typeOffer4.setSpecialist("Staz");
        typeOfferRepo.save(typeOffer4);

        TypeOffer typeOffer5 = new TypeOffer();
        typeOffer5.setCity("Gdańsk");
        typeOffer5.setOffer_Type("Hybrydowo");
        typeOffer5.setSpecialist("Mid");
        typeOfferRepo.save(typeOffer5);

        TypeOffer typeOffer6 = new TypeOffer();
        typeOffer6.setCity("Gdańsk");
        typeOffer6.setOffer_Type("Zdalnie");
        typeOffer6.setSpecialist("Senior");
        typeOfferRepo.save(typeOffer6);

        TypeOffer typeOffer7 = new TypeOffer();
        typeOffer7.setCity("Gdańsk");
        typeOffer7.setOffer_Type("Hybrydowo");
        typeOffer7.setSpecialist("Mid");
        typeOfferRepo.save(typeOffer7);

        TypeOffer typeOffer8 = new TypeOffer();
        typeOffer8.setCity("Gdańsk");
        typeOffer8.setOffer_Type("Zdalnie");
        typeOffer8.setSpecialist("Senior");
        typeOfferRepo.save(typeOffer8);



        OfferTable lpp = new OfferTable();
        lpp.setPlaceOfWork("Gdańsk");
        lpp.setWorkplace("PHP DEVELOPER");
        lpp.setActive(false);
        lpp.setTypeOffers(typeOffer);
        offerTableRepo.save(lpp);

        OfferTable lpp2 = new OfferTable();
        lpp2.setPlaceOfWork("Gdańsk");
        lpp2.setWorkplace("JAVA DEVELOPER");
        lpp2.setActive(false);
        lpp2.setTypeOffers(typeOffer2);
        offerTableRepo.save(lpp2);

        OfferTable lpp3 = new OfferTable();
        lpp3.setPlaceOfWork("Gdańsk");
        lpp3.setWorkplace("SYSTEM ARCHITEKT - APLIKACJE MOBILNE");
        lpp3.setTypeOffers(typeOffer3);
        offerTableRepo.save(lpp3);

        OfferTable lpp4 = new OfferTable();
        lpp4.setPlaceOfWork("Gdańsk");
        lpp4.setWorkplace("ANALITYCZKA SYSTEMOWA/ ANALITYK SYSTEMOWY");
        lpp4.setTypeOffers(typeOffer4);
        offerTableRepo.save(lpp4);

        OfferTable lpp5 = new OfferTable();
        lpp5.setPlaceOfWork("Gdańsk");
        lpp5.setWorkplace("JUNIOR PHP DEVELOPER");
        lpp5.setTypeOffers(typeOffer5);
        offerTableRepo.save(lpp5);

        OfferTable lpp6 = new OfferTable();
        lpp6.setPlaceOfWork("Gdańsk");
        lpp6.setWorkplace("SOFTWARE TESTER");
        lpp6.setTypeOffers(typeOffer6);
        offerTableRepo.save(lpp6);

        OfferTable lpp7 = new OfferTable();
        lpp7.setPlaceOfWork("Gdańsk");
        lpp7.setWorkplace("SCRUM MASTER");
        lpp7.setTypeOffers(typeOffer7);
        offerTableRepo.save(lpp7);

        OfferTable lpp8 = new OfferTable();
        lpp8.setPlaceOfWork("Gdańsk");
        lpp8.setWorkplace("ANDROID DEVELOPER");
        lpp8.setTypeOffers(typeOffer8);
        offerTableRepo.save(lpp8);



    }
}
