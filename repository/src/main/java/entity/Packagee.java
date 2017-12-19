package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Packagee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private String senderCity;
    private String destinationCity;
    private boolean tracking;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Route route;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private User sender;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private User receiver;

    @Override
    public String toString() {
        return "Packagee{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", senderCity='" + senderCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", tracking=" + tracking +
                ", route=" + route +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}
