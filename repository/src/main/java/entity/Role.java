package entity;

import enums.RoleEnum;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role=" + role +
                '}';
    }
}
