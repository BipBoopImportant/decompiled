package com.sugarcube.app.base.network;

import WH.C16729a;
import android.content.Context;
import nH.C17624c;

public final class NetworkLiveData_Factory implements C17624c<NetworkLiveData> {
    private final C16729a<Context> contextProvider;

    public NetworkLiveData_Factory(C16729a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static NetworkLiveData_Factory create(C16729a<Context> aVar) {
        return new NetworkLiveData_Factory(aVar);
    }

    public static NetworkLiveData newInstance(Context context) {
        return new NetworkLiveData(context);
    }

    public NetworkLiveData get() {
        return newInstance(this.contextProvider.get());
    }
}
