package pl.jakusz.offertable.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class OfferTable_YourTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String yourTask;

    @ManyToOne
    @JoinColumn(name = "offerTable_id")
    private OfferTable offerTable;


}
