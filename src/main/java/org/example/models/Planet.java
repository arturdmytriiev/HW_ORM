package org.example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "planet")
public class Planet  {
    @Id
    private String id;

    @Column(name = "name" , nullable = false)
    private String name;
}
