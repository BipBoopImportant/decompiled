package com.sugarcube.app.base.data.user.privacypolicy;

import WH.C16729a;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import nH.C17624c;

public final class PrivacyPolicyExperimentHelper_Factory implements C17624c<PrivacyPolicyExperimentHelper> {
    private final C16729a<ConfigRepository> configRepositoryProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public PrivacyPolicyExperimentHelper_Factory(C16729a<UserRepo> aVar, C16729a<ConfigRepository> aVar2) {
        this.userRepoProvider = aVar;
        this.configRepositoryProvider = aVar2;
    }

    public static PrivacyPolicyExperimentHelper_Factory create(C16729a<UserRepo> aVar, C16729a<ConfigRepository> aVar2) {
        return new PrivacyPolicyExperimentHelper_Factory(aVar, aVar2);
    }

    public static PrivacyPolicyExperimentHelper newInstance(UserRepo userRepo, ConfigRepository configRepository) {
        return new PrivacyPolicyExperimentHelper(userRepo, configRepository);
    }

    public PrivacyPolicyExperimentHelper get() {
        return newInstance(this.userRepoProvider.get(), this.configRepositoryProvider.get());
    }
}
