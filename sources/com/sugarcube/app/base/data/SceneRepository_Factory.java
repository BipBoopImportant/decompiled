package com.sugarcube.app.base.data;

import KF.C13147a;
import OE.C13309a;
import OE.q;
import WH.C16729a;
import android.content.Context;
import com.sugarcube.app.base.data.database.ScenesDatabase;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase;
import com.sugarcube.app.base.network.NetworkClient;
import nH.C17624c;

public final class SceneRepository_Factory implements C17624c<SceneRepository> {
    private final C16729a<Context> appContextProvider;
    private final C16729a<C13309a> appEnvironmentProvider;
    private final C16729a<C13147a> captureFilesProvider;
    private final C16729a<ConfigRepository> configRepositoryProvider;
    private final C16729a<ScenesDatabase> databaseProvider;
    private final C16729a<NetworkClient> networkClientProvider;
    private final C16729a<PreferenceStorage> preferenceStorageProvider;
    private final C16729a<PrivacyPolicyConsentUseCase> privacyPolicyConsentUseCaseProvider;
    private final C16729a<q> sugarcubeProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public SceneRepository_Factory(C16729a<Context> aVar, C16729a<q> aVar2, C16729a<ScenesDatabase> aVar3, C16729a<NetworkClient> aVar4, C16729a<PreferenceStorage> aVar5, C16729a<C13309a> aVar6, C16729a<UserRepo> aVar7, C16729a<ConfigRepository> aVar8, C16729a<C13147a> aVar9, C16729a<PrivacyPolicyConsentUseCase> aVar10) {
        this.appContextProvider = aVar;
        this.sugarcubeProvider = aVar2;
        this.databaseProvider = aVar3;
        this.networkClientProvider = aVar4;
        this.preferenceStorageProvider = aVar5;
        this.appEnvironmentProvider = aVar6;
        this.userRepoProvider = aVar7;
        this.configRepositoryProvider = aVar8;
        this.captureFilesProvider = aVar9;
        this.privacyPolicyConsentUseCaseProvider = aVar10;
    }

    public static SceneRepository_Factory create(C16729a<Context> aVar, C16729a<q> aVar2, C16729a<ScenesDatabase> aVar3, C16729a<NetworkClient> aVar4, C16729a<PreferenceStorage> aVar5, C16729a<C13309a> aVar6, C16729a<UserRepo> aVar7, C16729a<ConfigRepository> aVar8, C16729a<C13147a> aVar9, C16729a<PrivacyPolicyConsentUseCase> aVar10) {
        return new SceneRepository_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static SceneRepository newInstance(Context context, q qVar, ScenesDatabase scenesDatabase, NetworkClient networkClient, PreferenceStorage preferenceStorage, C13309a aVar, UserRepo userRepo, ConfigRepository configRepository, C13147a aVar2, PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase) {
        return new SceneRepository(context, qVar, scenesDatabase, networkClient, preferenceStorage, aVar, userRepo, configRepository, aVar2, privacyPolicyConsentUseCase);
    }

    public SceneRepository get() {
        return newInstance(this.appContextProvider.get(), this.sugarcubeProvider.get(), this.databaseProvider.get(), this.networkClientProvider.get(), this.preferenceStorageProvider.get(), this.appEnvironmentProvider.get(), this.userRepoProvider.get(), this.configRepositoryProvider.get(), this.captureFilesProvider.get(), this.privacyPolicyConsentUseCaseProvider.get());
    }
}
