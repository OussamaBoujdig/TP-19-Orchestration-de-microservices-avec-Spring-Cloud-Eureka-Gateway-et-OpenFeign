package com.example.Voiture.Entité;

import lombok.AllArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {

    @Id
    @GeneratedValue
    private Long id;

    private String marque;
    private String matricule;
    private String model;
    private Long id_client;  // clé étrangère

    @Transient
    private Client client;  // ne sera pas stocké en DB
}
