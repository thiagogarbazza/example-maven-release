package com.gitghub.thiagogarbazza.exemplos.domain;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AnyDomainTest {

    private AnyDomain anyDomain;

    @Before
    public void beforeTest() {
        anyDomain = new AnyDomain("test", new BigDecimal("37"));
    }

    @Test
    public void calc() throws Exception {
        assertEquals(new BigDecimal("4070"), anyDomain.calc(new BigDecimal("10"), new BigDecimal("11")));
    }
}