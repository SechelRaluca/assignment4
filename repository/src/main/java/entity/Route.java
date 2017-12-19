package entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "route")
    private Packagee aPackage;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            joinColumns = @JoinColumn(referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "id"))
    private List<RoutePair> routePairs;

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                '}';
    }
}
