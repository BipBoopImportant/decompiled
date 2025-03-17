package com.sugarcube.app.base.data.user;

import OE.C13309a;
import OE.C13313e;
import WH.C16729a;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.network.NetworkClient;
import nH.C17624c;

public final class DeviceRegistration_Factory implements C17624c<DeviceRegistration> {
    private final C16729a<C13309a> appEnvironmentProvider;
    private final C16729a<FirebaseInteractions> firebaseInteractionsProvider;
    private final C16729a<C13313e> installationConfigProvider;
    private final C16729a<NetworkClient> networkClientProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public DeviceRegistration_Factory(C16729a<C13309a> aVar, C16729a<NetworkClient> aVar2, C16729a<FirebaseInteractions> aVar3, C16729a<C13313e> aVar4, C16729a<UserRepo> aVar5) {
        this.appEnvironmentProvider = aVar;
        this.networkClientProvider = aVar2;
        this.firebaseInteractionsProvider = aVar3;
        this.installationConfigProvider = aVar4;
        this.userRepoProvider = aVar5;
    }

    public static DeviceRegistration_Factory create(C16729a<C13309a> aVar, C16729a<NetworkClient> aVar2, C16729a<FirebaseInteractions> aVar3, C16729a<C13313e> aVar4, C16729a<UserRepo> aVar5) {
        return new DeviceRegistration_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static DeviceRegistration newInstance(C13309a aVar, NetworkClient networkClient, FirebaseInteractions firebaseInteractions, C13313e eVar, UserRepo userRepo) {
        return new DeviceRegistration(aVar, networkClient, firebaseInteractions, eVar, userRepo);
    }

    public DeviceRegistration get() {
        return newInstance(this.appEnvironmentProvider.get(), this.networkClientProvider.get(), this.firebaseInteractionsProvider.get(), this.installationConfigProvider.get(), this.userRepoProvider.get());
    }
}
