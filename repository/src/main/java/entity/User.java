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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(referencedColumnName = "id")
    private Role role;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "sender")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Packagee> packagesS;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "sender")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Packagee> packagesR;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
