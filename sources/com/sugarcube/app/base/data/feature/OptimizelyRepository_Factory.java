package com.sugarcube.app.base.data.feature;

import OE.C13309a;
import OE.C13313e;
import WH.C16729a;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.config.a;
import nH.C17624c;
import xE.C15216f;

public final class OptimizelyRepository_Factory implements C17624c<OptimizelyRepository> {
    private final C16729a<a> appConfigProvider;
    private final C16729a<C13309a> appEnvironmentProvider;
    private final C16729a<C13313e> installationConfigProvider;
    private final C16729a<C15216f> optimizelyManagerProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public OptimizelyRepository_Factory(C16729a<C13309a> aVar, C16729a<C15216f> aVar2, C16729a<a> aVar3, C16729a<C13313e> aVar4, C16729a<UserRepo> aVar5) {
        this.appEnvironmentProvider = aVar;
        this.optimizelyManagerProvider = aVar2;
        this.appConfigProvider = aVar3;
        this.installationConfigProvider = aVar4;
        this.userRepoProvider = aVar5;
    }

    public static OptimizelyRepository_Factory create(C16729a<C13309a> aVar, C16729a<C15216f> aVar2, C16729a<a> aVar3, C16729a<C13313e> aVar4, C16729a<UserRepo> aVar5) {
        return new OptimizelyRepository_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static OptimizelyRepository newInstance(C13309a aVar, C15216f fVar, a aVar2, C13313e eVar, UserRepo userRepo) {
        return new OptimizelyRepository(aVar, fVar, aVar2, eVar, userRepo);
    }

    public OptimizelyRepository get() {
        return newInstance(this.appEnvironmentProvider.get(), this.optimizelyManagerProvider.get(), this.appConfigProvider.get(), this.installationConfigProvider.get(), this.userRepoProvider.get());
    }
}
