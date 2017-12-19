package entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class RoutePair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    String City;
    String time;

    @ManyToMany(mappedBy = "routePairs", fetch = FetchType.EAGER)
    private List<Route> routes = new ArrayList<>();

    @Override
    public String toString() {
        return "RoutePair{" +
                "City='" + City + '\'' +
                ", time=" + time +
                ", routes=" + routes +
                '}';
    }
}
