package pl.jakusz.offertable.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OfferTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String workplace;
    private String placeOfWork;
    private LocalDate localDate = LocalDate.now();
    private boolean active = true;
}
