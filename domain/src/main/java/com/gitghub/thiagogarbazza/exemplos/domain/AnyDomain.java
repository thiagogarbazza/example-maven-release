package com.gitghub.thiagogarbazza.exemplos.domain;

import java.math.BigDecimal;

public class AnyDomain {

    private String name;

    private BigDecimal variation;

    public AnyDomain(String name, BigDecimal variation) {
        this.name = name;
        this.variation = variation;
    }

    public BigDecimal calc(BigDecimal v1, BigDecimal v2) {
        return v1.multiply(v2).multiply(variation);
    }
}
