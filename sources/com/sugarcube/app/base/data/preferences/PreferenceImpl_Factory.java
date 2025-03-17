package com.sugarcube.app.base.data.preferences;

import WH.C16729a;
import android.content.Context;
import nH.C17624c;

public final class PreferenceImpl_Factory implements C17624c<PreferenceImpl> {
    private final C16729a<Context> contextProvider;

    public PreferenceImpl_Factory(C16729a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static PreferenceImpl_Factory create(C16729a<Context> aVar) {
        return new PreferenceImpl_Factory(aVar);
    }

    public static PreferenceImpl newInstance(Context context) {
        return new PreferenceImpl(context);
    }

    public PreferenceImpl get() {
        return newInstance(this.contextProvider.get());
    }
}
