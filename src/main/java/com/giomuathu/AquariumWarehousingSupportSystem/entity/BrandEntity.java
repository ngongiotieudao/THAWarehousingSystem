package com.giomuathu.AquariumWarehousingSupportSystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
@Table(name = "brand")
public class BrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long brandId;

    private String brandName;

    @OneToMany(mappedBy = "brandId", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<ProductEntity> products;
}
