package com.jws.user.service.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="micro_users")
public class User {
    @Id
    @Column(name = "ID")
    private String userId;
    @Column(name = "NAME",length = 30)
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ABOUT")
    private String about;
    //other user properties that is needed
@Transient
    private List<Rating> ratings=new ArrayList<>();
}
