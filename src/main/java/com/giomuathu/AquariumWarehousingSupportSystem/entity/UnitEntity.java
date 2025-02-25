package com.giomuathu.AquariumWarehousingSupportSystem.entity;

import lombok.*;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "unit")
public class UnitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long unitId;

    private String unitName;

    @OneToMany(mappedBy = "unitId", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<ProductEntity> products;
}
