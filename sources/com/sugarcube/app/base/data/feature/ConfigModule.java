package com.sugarcube.app.base.data.feature;

import OE.C13309a;
import QJ.Q;
import R2.h;
import S2.b;
import V2.a;
import VE.C13760b;
import W2.f;
import android.content.Context;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import com.sugarcube.app.base.data.user.UserRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.P;
import nI.C17642l;
import qI.C17786c;
import uI.C18064m;
import xE.C15216f;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJW\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eR%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\tR%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigModule;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "LR2/h;", "LW2/f;", "provideRemoteDataStore", "(Landroid/content/Context;)LR2/h;", "provideOverrideDataStore", "LOE/a;", "appEnvironment", "Lcom/sugarcube/app/base/data/feature/OptimizelyRepository;", "opt", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/external/config/a;", "config", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "preferenceStorage", "remoteDataStore", "overrideDataStore", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "provideConfigRepo", "(LOE/a;Lcom/sugarcube/app/base/data/feature/OptimizelyRepository;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/external/config/a;Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;LR2/h;LR2/h;)Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "LVE/b;", "networkConfig", "LxE/f;", "provideOptimizelyManager", "(Landroid/content/Context;LVE/b;)LxE/f;", "remoteDataStore$delegate", "LqI/c;", "getRemoteDataStore", "overrideDataStore$delegate", "getOverrideDataStore", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfigModule {
    static final /* synthetic */ C18064m<Object>[] $$delegatedProperties;
    public static final int $stable = 8;
    private final C17786c overrideDataStore$delegate = a.b("gm_override_data_store", (b) null, (C17642l) null, (Q) null, 14, (Object) null);
    private final C17786c remoteDataStore$delegate = a.b("gm_remote_data_store", (b) null, (C17642l) null, (Q) null, 14, (Object) null);

    static {
        Class<ConfigModule> cls = ConfigModule.class;
        $$delegatedProperties = new C18064m[]{P.i(new I(cls, "remoteDataStore", "getRemoteDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)), P.i(new I(cls, "overrideDataStore", "getOverrideDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    }

    private final h<f> getOverrideDataStore(Context context) {
        return (h) this.overrideDataStore$delegate.a(context, $$delegatedProperties[1]);
    }

    private final h<f> getRemoteDataStore(Context context) {
        return (h) this.remoteDataStore$delegate.a(context, $$delegatedProperties[0]);
    }

    public final ConfigRepository provideConfigRepo(C13309a aVar, OptimizelyRepository optimizelyRepository, UserRepo userRepo, com.sugarcube.app.base.external.config.a aVar2, PreferenceStorage preferenceStorage, h<f> hVar, h<f> hVar2) {
        h<f> hVar3 = hVar;
        h<f> hVar4 = hVar2;
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(optimizelyRepository, "opt");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(aVar2, "config");
        PreferenceStorage preferenceStorage2 = preferenceStorage;
        C17542s.j(preferenceStorage2, "preferenceStorage");
        C17542s.j(hVar3, "remoteDataStore");
        C17542s.j(hVar4, "overrideDataStore");
        return new ConfigRepositoryImpl(aVar, optimizelyRepository, userRepo, aVar2, preferenceStorage2, new PreferencesDataStoreWrapper(hVar3), new PreferencesDataStoreWrapper(hVar4));
    }

    public final C15216f provideOptimizelyManager(Context context, C13760b bVar) {
        C17542s.j(context, "appContext");
        C17542s.j(bVar, "networkConfig");
        C15216f a10 = C15216f.i().d(bVar.b().f()).a(context);
        C17542s.i(a10, "build(...)");
        return a10;
    }

    public final h<f> provideOverrideDataStore(Context context) {
        C17542s.j(context, "appContext");
        return getOverrideDataStore(context);
    }

    public final h<f> provideRemoteDataStore(Context context) {
        C17542s.j(context, "appContext");
        return getRemoteDataStore(context);
    }
}
