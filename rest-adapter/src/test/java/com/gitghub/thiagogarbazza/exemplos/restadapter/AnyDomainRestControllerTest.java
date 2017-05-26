package com.gitghub.thiagogarbazza.exemplos.restadapter;

import com.gitghub.thiagogarbazza.exemplos.domain.AnyDomain;
import com.gitghub.thiagogarbazza.exemplos.domain.AnyService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AnyDomainRestControllerTest {

    @Mock
    private AnyService anyServiceMock;

    @Before
    public void beforeTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCriar() {
        AnyDomain anyDomain = new AnyDomain("Test", BigDecimal.TEN);

        when(anyServiceMock.save(anyDomain)).thenReturn(anyDomain);

        assertEquals(anyDomain, anyServiceMock.save(anyDomain));

        verify(anyServiceMock, times(1)).save(anyDomain);
    }
}