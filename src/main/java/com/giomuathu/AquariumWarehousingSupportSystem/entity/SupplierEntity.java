package com.giomuathu.AquariumWarehousingSupportSystem.entity;

import lombok.*;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
@Table(name = "supplier")
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long supplierId;
    private String supplierName;
    private int supplierCode;
    @Column(name = "`group`")
    private String group;
    private String email;
    private String phone;
    private boolean status;
    private int taxIdentificationNumber;

    @OneToMany(mappedBy = "supplierId", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<ProductEntity> products;
}
