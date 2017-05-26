package com.gitghub.thiagogarbazza.exemplos.restadapter;

import com.gitghub.thiagogarbazza.exemplos.domain.AnyDomain;
import com.gitghub.thiagogarbazza.exemplos.domain.AnyService;

public class AnyDomainRestController {

    private AnyService anyService;

    public void criar(AnyDomain anyDomain) {
        anyService.save(anyDomain);
    }

    protected void setAnyService(AnyService anyService) {
        this.anyService = anyService;
    }
}
