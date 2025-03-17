package com.sugarcube.app.base.network;

import WH.C16729a;
import com.sugarcube.app.base.external.config.a;
import nH.C17624c;

public final class AutocompleteClient_Factory implements C17624c<AutocompleteClient> {
    private final C16729a<a> configProvider;

    public AutocompleteClient_Factory(C16729a<a> aVar) {
        this.configProvider = aVar;
    }

    public static AutocompleteClient_Factory create(C16729a<a> aVar) {
        return new AutocompleteClient_Factory(aVar);
    }

    public static AutocompleteClient newInstance(a aVar) {
        return new AutocompleteClient(aVar);
    }

    public AutocompleteClient get() {
        return newInstance(this.configProvider.get());
    }
}
