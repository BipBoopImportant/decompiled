package com.sugarcube.app.base.data.user.privacypolicy;

import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.data.user.UserRepo;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyExperimentHelper;", "", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "<init>", "(Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "", "isUserEnrolledInExperiment", "(LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/user/UserRepo;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PrivacyPolicyExperimentHelper {
    public static final int $stable = 0;
    private final ConfigRepository configRepository;
    private final UserRepo userRepo;

    public PrivacyPolicyExperimentHelper(UserRepo userRepo2, ConfigRepository configRepository2) {
        C17542s.j(userRepo2, "userRepo");
        C17542s.j(configRepository2, "configRepository");
        this.userRepo = userRepo2;
        this.configRepository = configRepository2;
    }

    public final Object isUserEnrolledInExperiment(C17164e<? super Boolean> eVar) {
        return !this.userRepo.isLoggedIn().getValue().booleanValue() ? b.a(false) : this.configRepository.get(FeatureFlags.EnablePrivacyCheckbox.INSTANCE, eVar);
    }
}
