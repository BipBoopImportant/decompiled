package com.sugarcube.app.base.data.user.privacypolicy;

import OE.q;
import WH.C16729a;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import nH.C17624c;

public final class PrivacyPolicyConsentUseCase_Factory implements C17624c<PrivacyPolicyConsentUseCase> {
    private final C16729a<PrivacyPolicyExperimentHelper> experimentHelperProvider;
    private final C16729a<FirebaseInteractions> firebaseInteractionsProvider;
    private final C16729a<q> sugarcubeProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public PrivacyPolicyConsentUseCase_Factory(C16729a<q> aVar, C16729a<FirebaseInteractions> aVar2, C16729a<UserRepo> aVar3, C16729a<PrivacyPolicyExperimentHelper> aVar4) {
        this.sugarcubeProvider = aVar;
        this.firebaseInteractionsProvider = aVar2;
        this.userRepoProvider = aVar3;
        this.experimentHelperProvider = aVar4;
    }

    public static PrivacyPolicyConsentUseCase_Factory create(C16729a<q> aVar, C16729a<FirebaseInteractions> aVar2, C16729a<UserRepo> aVar3, C16729a<PrivacyPolicyExperimentHelper> aVar4) {
        return new PrivacyPolicyConsentUseCase_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static PrivacyPolicyConsentUseCase newInstance(q qVar, FirebaseInteractions firebaseInteractions, UserRepo userRepo, PrivacyPolicyExperimentHelper privacyPolicyExperimentHelper) {
        return new PrivacyPolicyConsentUseCase(qVar, firebaseInteractions, userRepo, privacyPolicyExperimentHelper);
    }

    public PrivacyPolicyConsentUseCase get() {
        return newInstance(this.sugarcubeProvider.get(), this.firebaseInteractionsProvider.get(), this.userRepoProvider.get(), this.experimentHelperProvider.get());
    }
}
