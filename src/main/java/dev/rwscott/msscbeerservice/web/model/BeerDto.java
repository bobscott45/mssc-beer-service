package dev.rwscott.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime created;
    private OffsetDateTime lastModified;
    private String name;
    private BeerStyleEnum style;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
}
