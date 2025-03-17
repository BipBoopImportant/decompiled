package bG;

import RF.k;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.decorate.DesignItemInfo;
import com.sugarcube.decorate.DesignStateManager;
import com.sugarcube.decorate.TemporaryDesignStateListener;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorage;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import dI.C17164e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 42\u00020\u0001:\u0001&B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH@¢\u0006\u0004\b\u0012\u0010\u0013JV\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00142\"\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018`\u0019H@¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010!\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\b!\u0010\"J\"\u0010#\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R(\u00100\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"LbG/a;", "Lcom/sugarcube/decorate/DesignStateManager;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/decorate/v1/internal/designpersistence/SceneTempStorage;", "sceneTempStorage", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/decorate/v1/internal/designpersistence/SceneTempStorage;)V", "", "isNewComposition", "Ljava/util/UUID;", "compositionUuid", "b", "(ZLjava/util/UUID;)Ljava/util/UUID;", "sceneUuid", "LXH/N;", "c", "(ZLjava/util/UUID;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "isPreserveFeatureEnabled", "(LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "engine", "Ljava/util/HashMap;", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "LRF/k;", "Lkotlin/collections/HashMap;", "models", "updateDesignState", "(ZLjava/util/UUID;Ljava/util/UUID;Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Ljava/util/HashMap;LdI/e;)Ljava/lang/Object;", "cleanUpTemporaryDesignState", "(Ljava/util/UUID;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate/TemporaryDesignStateListener;", "restoreListener", "initialize", "(ZLjava/util/UUID;Ljava/util/UUID;Lcom/sugarcube/decorate/TemporaryDesignStateListener;LdI/e;)Ljava/lang/Object;", "canBeRestored", "stop", "()V", "a", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "Lcom/sugarcube/decorate/v1/internal/designpersistence/SceneTempStorage;", "", "Lcom/sugarcube/decorate/DesignItemInfo;", "Ljava/util/List;", "getDesignItems", "()Ljava/util/List;", "setDesignItems", "(Ljava/util/List;)V", "designItems", "d", "Z", "isStopped", "e", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bG.a  reason: case insensitive filesystem */
public final class C17033a implements DesignStateManager {

    /* renamed from: e  reason: collision with root package name */
    public static final C3459a f141074e = new C3459a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f141075f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final ConfigRepository f141076a;

    /* renamed from: b  reason: collision with root package name */
    private final SceneTempStorage f141077b;

    /* renamed from: c  reason: collision with root package name */
    private List<DesignItemInfo> f141078c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f141079d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LbG/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bG.a$a  reason: collision with other inner class name */
    public static final class C3459a {
        public /* synthetic */ C3459a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3459a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.state.DesignStateManagerV1Impl", f = "DesignStateManagerV1Impl.kt", l = {210}, m = "canBeRestored")
    /* renamed from: bG.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f141080c;

        /* renamed from: d  reason: collision with root package name */
        Object f141081d;

        /* renamed from: e  reason: collision with root package name */
        Object f141082e;

        /* renamed from: f  reason: collision with root package name */
        Object f141083f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f141084g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17033a f141085h;

        /* renamed from: i  reason: collision with root package name */
        int f141086i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17033a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f141085h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f141084g = obj;
            this.f141086i |= Integer.MIN_VALUE;
            return this.f141085h.canBeRestored((UUID) null, (UUID) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.state.DesignStateManagerV1Impl", f = "DesignStateManagerV1Impl.kt", l = {146}, m = "cleanUpTemporaryDesignState")
    /* renamed from: bG.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f141087c;

        /* renamed from: d  reason: collision with root package name */
        Object f141088d;

        /* renamed from: e  reason: collision with root package name */
        Object f141089e;

        /* renamed from: f  reason: collision with root package name */
        Object f141090f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f141091g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17033a f141092h;

        /* renamed from: i  reason: collision with root package name */
        int f141093i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17033a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f141092h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f141091g = obj;
            this.f141093i |= Integer.MIN_VALUE;
            return this.f141092h.cleanUpTemporaryDesignState((UUID) null, (UUID) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.state.DesignStateManagerV1Impl", f = "DesignStateManagerV1Impl.kt", l = {169, 170, 197}, m = "initialize")
    /* renamed from: bG.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f141094c;

        /* renamed from: d  reason: collision with root package name */
        Object f141095d;

        /* renamed from: e  reason: collision with root package name */
        Object f141096e;

        /* renamed from: f  reason: collision with root package name */
        Object f141097f;

        /* renamed from: g  reason: collision with root package name */
        Object f141098g;

        /* renamed from: h  reason: collision with root package name */
        Object f141099h;

        /* renamed from: i  reason: collision with root package name */
        Object f141100i;

        /* renamed from: j  reason: collision with root package name */
        Object f141101j;

        /* renamed from: k  reason: collision with root package name */
        Object f141102k;

        /* renamed from: l  reason: collision with root package name */
        Object f141103l;

        /* renamed from: m  reason: collision with root package name */
        Object f141104m;

        /* renamed from: n  reason: collision with root package name */
        Object f141105n;

        /* renamed from: o  reason: collision with root package name */
        Object f141106o;

        /* renamed from: p  reason: collision with root package name */
        Object f141107p;

        /* renamed from: q  reason: collision with root package name */
        boolean f141108q;

        /* renamed from: r  reason: collision with root package name */
        boolean f141109r;

        /* renamed from: s  reason: collision with root package name */
        int f141110s;

        /* renamed from: t  reason: collision with root package name */
        int f141111t;

        /* renamed from: u  reason: collision with root package name */
        int f141112u;

        /* renamed from: v  reason: collision with root package name */
        /* synthetic */ Object f141113v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ C17033a f141114w;

        /* renamed from: x  reason: collision with root package name */
        int f141115x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17033a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f141114w = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f141113v = obj;
            this.f141115x |= Integer.MIN_VALUE;
            return this.f141114w.initialize(false, (UUID) null, (UUID) null, (TemporaryDesignStateListener) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.state.DesignStateManagerV1Impl", f = "DesignStateManagerV1Impl.kt", l = {114, 137}, m = "persistTemporaryDesignState")
    /* renamed from: bG.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f141116c;

        /* renamed from: d  reason: collision with root package name */
        Object f141117d;

        /* renamed from: e  reason: collision with root package name */
        Object f141118e;

        /* renamed from: f  reason: collision with root package name */
        Object f141119f;

        /* renamed from: g  reason: collision with root package name */
        Object f141120g;

        /* renamed from: h  reason: collision with root package name */
        Object f141121h;

        /* renamed from: i  reason: collision with root package name */
        Object f141122i;

        /* renamed from: j  reason: collision with root package name */
        Object f141123j;

        /* renamed from: k  reason: collision with root package name */
        Object f141124k;

        /* renamed from: l  reason: collision with root package name */
        Object f141125l;

        /* renamed from: m  reason: collision with root package name */
        Object f141126m;

        /* renamed from: n  reason: collision with root package name */
        Object f141127n;

        /* renamed from: o  reason: collision with root package name */
        Object f141128o;

        /* renamed from: p  reason: collision with root package name */
        Object f141129p;

        /* renamed from: q  reason: collision with root package name */
        Object f141130q;

        /* renamed from: r  reason: collision with root package name */
        Object f141131r;

        /* renamed from: s  reason: collision with root package name */
        Object f141132s;

        /* renamed from: t  reason: collision with root package name */
        boolean f141133t;

        /* renamed from: u  reason: collision with root package name */
        boolean f141134u;

        /* renamed from: v  reason: collision with root package name */
        int f141135v;

        /* renamed from: w  reason: collision with root package name */
        int f141136w;

        /* renamed from: x  reason: collision with root package name */
        /* synthetic */ Object f141137x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ C17033a f141138y;

        /* renamed from: z  reason: collision with root package name */
        int f141139z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17033a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f141138y = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f141137x = obj;
            this.f141139z |= Integer.MIN_VALUE;
            return this.f141138y.c(false, (UUID) null, (UUID) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.v1.state.DesignStateManagerV1Impl", f = "DesignStateManagerV1Impl.kt", l = {76, 77, 98}, m = "updateDesignState")
    /* renamed from: bG.a$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f141140c;

        /* renamed from: d  reason: collision with root package name */
        Object f141141d;

        /* renamed from: e  reason: collision with root package name */
        Object f141142e;

        /* renamed from: f  reason: collision with root package name */
        Object f141143f;

        /* renamed from: g  reason: collision with root package name */
        Object f141144g;

        /* renamed from: h  reason: collision with root package name */
        Object f141145h;

        /* renamed from: i  reason: collision with root package name */
        Object f141146i;

        /* renamed from: j  reason: collision with root package name */
        Object f141147j;

        /* renamed from: k  reason: collision with root package name */
        Object f141148k;

        /* renamed from: l  reason: collision with root package name */
        Object f141149l;

        /* renamed from: m  reason: collision with root package name */
        Object f141150m;

        /* renamed from: n  reason: collision with root package name */
        Object f141151n;

        /* renamed from: o  reason: collision with root package name */
        Object f141152o;

        /* renamed from: p  reason: collision with root package name */
        boolean f141153p;

        /* renamed from: q  reason: collision with root package name */
        boolean f141154q;

        /* renamed from: r  reason: collision with root package name */
        boolean f141155r;

        /* renamed from: s  reason: collision with root package name */
        int f141156s;

        /* renamed from: t  reason: collision with root package name */
        int f141157t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f141158u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ C17033a f141159v;

        /* renamed from: w  reason: collision with root package name */
        int f141160w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17033a aVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f141159v = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f141158u = obj;
            this.f141160w |= Integer.MIN_VALUE;
            return this.f141159v.updateDesignState(false, (UUID) null, (UUID) null, (IDecorateEngine) null, (HashMap<ObjectInstanceId, k>) null, this);
        }
    }

    public C17033a(ConfigRepository configRepository, SceneTempStorage sceneTempStorage) {
        C17542s.j(configRepository, "configRepository");
        C17542s.j(sceneTempStorage, "sceneTempStorage");
        this.f141076a = configRepository;
        this.f141077b = sceneTempStorage;
    }

    private final UUID b(boolean z10, UUID uuid) {
        if (z10) {
            return null;
        }
        return uuid;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(boolean r20, java.util.UUID r21, java.util.UUID r22, dI.C17164e<? super XH.C16807N> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            boolean r5 = r4 instanceof bG.C17033a.e
            if (r5 == 0) goto L_0x001d
            r5 = r4
            bG.a$e r5 = (bG.C17033a.e) r5
            int r6 = r5.f141139z
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f141139z = r6
            goto L_0x0022
        L_0x001d:
            bG.a$e r5 = new bG.a$e
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r6 = r5.f141137x
            java.lang.Object r7 = eI.C17187b.f()
            int r8 = r5.f141139z
            r9 = 2
            r10 = 1
            if (r8 == 0) goto L_0x00a8
            if (r8 == r10) goto L_0x0083
            if (r8 != r9) goto L_0x007b
            java.lang.Object r1 = r5.f141132s
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141131r
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141130q
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r5.f141129p
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r5.f141128o
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r5.f141127n
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141126m
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141125l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r5.f141124k
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r5.f141123j
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r5.f141122i
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r5.f141121h
            com.sugarcube.decorate.v1.internal.domain.DesignState r1 = (com.sugarcube.decorate.v1.internal.domain.DesignState) r1
            java.lang.Object r1 = r5.f141120g
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141119f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r5.f141118e
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141117d
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141116c
            bG.a r1 = (bG.C17033a) r1
            XH.y.b(r6)
            goto L_0x0170
        L_0x007b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0083:
            boolean r1 = r5.f141133t
            java.lang.Object r2 = r5.f141120g
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r3 = r5.f141119f
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r5.f141118e
            java.util.UUID r4 = (java.util.UUID) r4
            java.lang.Object r8 = r5.f141117d
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r10 = r5.f141116c
            bG.a r10 = (bG.C17033a) r10
            XH.y.b(r6)
            r17 = r6
            r6 = r2
            r2 = r8
            r8 = r17
            r18 = r4
            r4 = r3
            r3 = r18
            goto L_0x00c7
        L_0x00a8:
            XH.y.b(r6)
            java.util.UUID r6 = r0.b(r1, r3)
            com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorage r8 = r0.f141077b
            r5.f141116c = r0
            r5.f141117d = r2
            r5.f141118e = r3
            r5.f141119f = r4
            r5.f141120g = r6
            r5.f141133t = r1
            r5.f141139z = r10
            java.lang.Object r8 = r8.hasSavedState(r2, r6, r5)
            if (r8 != r7) goto L_0x00c6
            return r7
        L_0x00c6:
            r10 = r0
        L_0x00c7:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "persistTemporaryDesignState:: hasUnRestoredState? "
            r11.append(r12)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "DesignStateManager"
            android.util.Log.v(r12, r11)
            if (r8 == 0) goto L_0x00e8
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x00e8:
            java.util.List<com.sugarcube.decorate.DesignItemInfo> r11 = r10.f141078c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = YH.C16877v.y(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r13 = r11.iterator()
        L_0x00fb:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x012c
            java.lang.Object r14 = r13.next()
            com.sugarcube.decorate.DesignItemInfo r14 = (com.sugarcube.decorate.DesignItemInfo) r14
            com.sugarcube.decorate.TempModelInstanceInfo r15 = r14.c()
            com.sugarcube.decorate.DesignItemInfo r9 = new com.sugarcube.decorate.DesignItemInfo
            com.sugarcube.decorate.TempModelInstanceInfo r0 = new com.sugarcube.decorate.TempModelInstanceInfo
            r16 = r7
            com.sugarcube.decorate_engine.ObjectInstanceId r7 = r15.b()
            com.sugarcube.core.network.models.CatalogItem r15 = r15.a()
            r0.<init>(r7, r15)
            com.sugarcube.decorate_engine.ModelScreenTransform r7 = r14.d()
            r9.<init>(r0, r7)
            r12.add(r9)
            r0 = r19
            r7 = r16
            r9 = 2
            goto L_0x00fb
        L_0x012c:
            r16 = r7
            java.util.List r0 = YH.C16877v.n()
            com.sugarcube.decorate.v1.internal.domain.DesignState r7 = new com.sugarcube.decorate.v1.internal.domain.DesignState
            r7.<init>(r2, r6, r12, r0)
            com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorage r9 = r10.f141077b
            r5.f141116c = r10
            r5.f141117d = r2
            r5.f141118e = r3
            r5.f141119f = r4
            r5.f141120g = r6
            r5.f141121h = r7
            r5.f141122i = r11
            r5.f141123j = r11
            r5.f141124k = r12
            r5.f141125l = r13
            r5.f141126m = r2
            r5.f141127n = r6
            r5.f141128o = r12
            r5.f141129p = r0
            r5.f141130q = r12
            r5.f141131r = r6
            r5.f141132s = r2
            r5.f141133t = r1
            r5.f141134u = r8
            r0 = 0
            r5.f141135v = r0
            r5.f141136w = r0
            r0 = 2
            r5.f141139z = r0
            java.lang.Object r0 = r9.saveObject(r7, r5)
            r1 = r16
            if (r0 != r1) goto L_0x0170
            return r1
        L_0x0170:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bG.C17033a.c(boolean, java.util.UUID, java.util.UUID, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.UUID} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object canBeRestored(java.util.UUID r6, java.util.UUID r7, dI.C17164e<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof bG.C17033a.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            bG.a$b r0 = (bG.C17033a.b) r0
            int r1 = r0.f141086i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f141086i = r1
            goto L_0x0018
        L_0x0013:
            bG.a$b r0 = new bG.a$b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f141084g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f141086i
            r4 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r6 = r0.f141083f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f141082e
            r7 = r6
            java.util.UUID r7 = (java.util.UUID) r7
            java.lang.Object r6 = r0.f141081d
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r8 = r0.f141080c
            bG.a r8 = (bG.C17033a) r8
            XH.y.b(r1)
            goto L_0x0058
        L_0x003a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0042:
            XH.y.b(r1)
            com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorage r1 = r5.f141077b
            r0.f141080c = r5
            r0.f141081d = r6
            r0.f141082e = r7
            r0.f141083f = r8
            r0.f141086i = r4
            java.lang.Object r1 = r1.loadObject(r6, r7, r0)
            if (r1 != r2) goto L_0x0058
            return r2
        L_0x0058:
            com.sugarcube.decorate.v1.internal.domain.DesignState r1 = (com.sugarcube.decorate.v1.internal.domain.DesignState) r1
            if (r1 == 0) goto L_0x0071
            java.util.UUID r8 = r1.d()
            boolean r6 = kotlin.jvm.internal.C17542s.e(r8, r6)
            if (r6 == 0) goto L_0x0071
            java.util.UUID r6 = r1.a()
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)
            if (r6 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bG.C17033a.canBeRestored(java.util.UUID, java.util.UUID, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object cleanUpTemporaryDesignState(java.util.UUID r6, java.util.UUID r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof bG.C17033a.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            bG.a$c r0 = (bG.C17033a.c) r0
            int r1 = r0.f141093i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f141093i = r1
            goto L_0x0018
        L_0x0013:
            bG.a$c r0 = new bG.a$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f141091g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f141093i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f141090f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f141089e
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r6 = r0.f141088d
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r6 = r0.f141087c
            bG.a r6 = (bG.C17033a) r6
            XH.y.b(r1)
            goto L_0x005f
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            boolean r1 = r5.f141079d
            if (r1 == 0) goto L_0x004b
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x004b:
            com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorage r1 = r5.f141077b
            r0.f141087c = r5
            r0.f141088d = r6
            r0.f141089e = r7
            r0.f141090f = r8
            r0.f141093i = r4
            java.lang.Object r6 = r1.cleanUp(r6, r7, r0)
            if (r6 != r2) goto L_0x005e
            return r2
        L_0x005e:
            r6 = r5
        L_0x005f:
            java.util.List<com.sugarcube.decorate.DesignItemInfo> r6 = r6.f141078c
            r6.clear()
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bG.C17033a.cleanUpTemporaryDesignState(java.util.UUID, java.util.UUID, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object initialize(boolean r22, java.util.UUID r23, java.util.UUID r24, com.sugarcube.decorate.TemporaryDesignStateListener r25, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r26
            boolean r5 = r4 instanceof bG.C17033a.d
            if (r5 == 0) goto L_0x001d
            r5 = r4
            bG.a$d r5 = (bG.C17033a.d) r5
            int r6 = r5.f141115x
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f141115x = r6
            goto L_0x0022
        L_0x001d:
            bG.a$d r5 = new bG.a$d
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r6 = r5.f141113v
            java.lang.Object r7 = eI.C17187b.f()
            int r8 = r5.f141115x
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r8 == 0) goto L_0x00c3
            if (r8 == r11) goto L_0x009e
            if (r8 == r10) goto L_0x007b
            if (r8 != r9) goto L_0x0073
            java.lang.Object r1 = r5.f141107p
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r5.f141106o
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r5.f141105n
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r5.f141104m
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r5.f141103l
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r5.f141102k
            com.sugarcube.decorate.v1.internal.domain.DesignState r1 = (com.sugarcube.decorate.v1.internal.domain.DesignState) r1
            java.lang.Object r1 = r5.f141101j
            com.sugarcube.decorate.v1.internal.domain.DesignState r1 = (com.sugarcube.decorate.v1.internal.domain.DesignState) r1
            java.lang.Object r1 = r5.f141100i
            com.sugarcube.decorate.v1.internal.domain.DesignState r1 = (com.sugarcube.decorate.v1.internal.domain.DesignState) r1
            java.lang.Object r1 = r5.f141099h
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141098g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r5.f141097f
            com.sugarcube.decorate.TemporaryDesignStateListener r1 = (com.sugarcube.decorate.TemporaryDesignStateListener) r1
            java.lang.Object r1 = r5.f141096e
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141095d
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141094c
            bG.a r1 = (bG.C17033a) r1
            XH.y.b(r6)
            goto L_0x01d2
        L_0x0073:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x007b:
            boolean r1 = r5.f141108q
            java.lang.Object r2 = r5.f141100i
            com.sugarcube.decorate.v1.internal.domain.DesignState r2 = (com.sugarcube.decorate.v1.internal.domain.DesignState) r2
            java.lang.Object r3 = r5.f141099h
            java.util.UUID r3 = (java.util.UUID) r3
            java.lang.Object r4 = r5.f141098g
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r8 = r5.f141097f
            com.sugarcube.decorate.TemporaryDesignStateListener r8 = (com.sugarcube.decorate.TemporaryDesignStateListener) r8
            java.lang.Object r10 = r5.f141096e
            java.util.UUID r10 = (java.util.UUID) r10
            java.lang.Object r11 = r5.f141095d
            java.util.UUID r11 = (java.util.UUID) r11
            java.lang.Object r13 = r5.f141094c
            bG.a r13 = (bG.C17033a) r13
            XH.y.b(r6)
            goto L_0x0112
        L_0x009e:
            boolean r1 = r5.f141108q
            java.lang.Object r2 = r5.f141099h
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r3 = r5.f141098g
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r5.f141097f
            com.sugarcube.decorate.TemporaryDesignStateListener r4 = (com.sugarcube.decorate.TemporaryDesignStateListener) r4
            java.lang.Object r8 = r5.f141096e
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r11 = r5.f141095d
            java.util.UUID r11 = (java.util.UUID) r11
            java.lang.Object r13 = r5.f141094c
            bG.a r13 = (bG.C17033a) r13
            XH.y.b(r6)
            r19 = r4
            r4 = r3
            r3 = r8
            r8 = r13
            r13 = r19
            goto L_0x00eb
        L_0x00c3:
            XH.y.b(r6)
            r0.f141079d = r12
            java.util.UUID r6 = r0.b(r1, r3)
            com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorage r8 = r0.f141077b
            r5.f141094c = r0
            r5.f141095d = r2
            r5.f141096e = r3
            r13 = r25
            r5.f141097f = r13
            r5.f141098g = r4
            r5.f141099h = r6
            r5.f141108q = r1
            r5.f141115x = r11
            java.lang.Object r8 = r8.loadObject(r2, r6, r5)
            if (r8 != r7) goto L_0x00e7
            return r7
        L_0x00e7:
            r11 = r2
            r2 = r6
            r6 = r8
            r8 = r0
        L_0x00eb:
            com.sugarcube.decorate.v1.internal.domain.DesignState r6 = (com.sugarcube.decorate.v1.internal.domain.DesignState) r6
            r5.f141094c = r8
            r5.f141095d = r11
            r5.f141096e = r3
            r5.f141097f = r13
            r5.f141098g = r4
            r5.f141099h = r2
            r5.f141100i = r6
            r5.f141108q = r1
            r5.f141115x = r10
            java.lang.Object r10 = r8.isPreserveFeatureEnabled(r5)
            if (r10 != r7) goto L_0x0106
            return r7
        L_0x0106:
            r19 = r3
            r3 = r2
            r2 = r6
            r6 = r10
            r10 = r19
            r20 = r13
            r13 = r8
            r8 = r20
        L_0x0112:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "initialize:: persistenceEnabled? "
            r14.append(r15)
            r14.append(r6)
            java.lang.String r15 = ", tempScene:"
            r14.append(r15)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "DesignStateManager"
            android.util.Log.v(r15, r14)
            if (r2 == 0) goto L_0x01d5
            if (r6 != 0) goto L_0x013c
            goto L_0x01d5
        L_0x013c:
            java.util.UUID r14 = r2.a()
            boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r3)
            if (r14 == 0) goto L_0x01d2
            java.util.UUID r14 = r2.d()
            boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r11)
            if (r14 == 0) goto L_0x01d2
            java.util.List r14 = r2.b()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r9 = 10
            int r9 = YH.C16877v.y(r14, r9)
            r15.<init>(r9)
            java.util.Iterator r9 = r14.iterator()
        L_0x0165:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L_0x019a
            java.lang.Object r16 = r9.next()
            com.sugarcube.decorate.DesignItemInfo r16 = (com.sugarcube.decorate.DesignItemInfo) r16
            com.sugarcube.decorate.TempModelInstanceInfo r12 = new com.sugarcube.decorate.TempModelInstanceInfo
            com.sugarcube.decorate.TempModelInstanceInfo r17 = r16.c()
            com.sugarcube.decorate_engine.ObjectInstanceId r0 = r17.b()
            com.sugarcube.decorate.TempModelInstanceInfo r17 = r16.c()
            r18 = r7
            com.sugarcube.core.network.models.CatalogItem r7 = r17.a()
            r12.<init>(r0, r7)
            com.sugarcube.decorate.DesignItemInfo r0 = new com.sugarcube.decorate.DesignItemInfo
            com.sugarcube.decorate_engine.ModelScreenTransform r7 = r16.d()
            r0.<init>(r12, r7)
            r15.add(r0)
            r0 = r21
            r7 = r18
            r12 = 0
            goto L_0x0165
        L_0x019a:
            r18 = r7
            r8.onItemsRestored(r15)
            r5.f141094c = r13
            r5.f141095d = r11
            r5.f141096e = r10
            r5.f141097f = r8
            r5.f141098g = r4
            r5.f141099h = r3
            r5.f141100i = r2
            r5.f141101j = r2
            r5.f141102k = r2
            r5.f141103l = r14
            r5.f141104m = r14
            r5.f141105n = r15
            r5.f141106o = r9
            r5.f141107p = r15
            r5.f141108q = r1
            r5.f141109r = r6
            r0 = 0
            r5.f141110s = r0
            r5.f141111t = r0
            r5.f141112u = r0
            r0 = 3
            r5.f141115x = r0
            java.lang.Object r0 = r13.cleanUpTemporaryDesignState(r11, r3, r5)
            r1 = r18
            if (r0 != r1) goto L_0x01d2
            return r1
        L_0x01d2:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x01d5:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bG.C17033a.initialize(boolean, java.util.UUID, java.util.UUID, com.sugarcube.decorate.TemporaryDesignStateListener, dI.e):java.lang.Object");
    }

    public Object isPreserveFeatureEnabled(C17164e<? super Boolean> eVar) {
        return this.f141076a.get(FeatureFlags.PreserveDesignState.INSTANCE, eVar);
    }

    public void stop() {
        this.f141079d = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0115 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateDesignState(boolean r22, java.util.UUID r23, java.util.UUID r24, com.sugarcube.decorate.internal.shared.IDecorateEngine r25, java.util.HashMap<com.sugarcube.decorate_engine.ObjectInstanceId, RF.k> r26, dI.C17164e<? super XH.C16807N> r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r27
            boolean r5 = r4 instanceof bG.C17033a.f
            if (r5 == 0) goto L_0x001d
            r5 = r4
            bG.a$f r5 = (bG.C17033a.f) r5
            int r6 = r5.f141160w
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f141160w = r6
            goto L_0x0022
        L_0x001d:
            bG.a$f r5 = new bG.a$f
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r6 = r5.f141158u
            java.lang.Object r7 = eI.C17187b.f()
            int r8 = r5.f141160w
            r9 = 3
            r10 = 2
            r11 = 1
            if (r8 == 0) goto L_0x00bd
            if (r8 == r11) goto L_0x009b
            if (r8 == r10) goto L_0x0076
            if (r8 != r9) goto L_0x006e
            java.lang.Object r1 = r5.f141152o
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r5.f141151n
            bG.a r1 = (bG.C17033a) r1
            java.lang.Object r1 = r5.f141150m
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r5.f141149l
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r5.f141148k
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r5.f141147j
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r5.f141146i
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141145h
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r5.f141144g
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r5.f141143f
            com.sugarcube.decorate.internal.shared.IDecorateEngine r1 = (com.sugarcube.decorate.internal.shared.IDecorateEngine) r1
            java.lang.Object r1 = r5.f141142e
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141141d
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r5.f141140c
            bG.a r1 = (bG.C17033a) r1
            XH.y.b(r6)
            goto L_0x01ee
        L_0x006e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0076:
            boolean r1 = r5.f141154q
            boolean r2 = r5.f141153p
            java.lang.Object r3 = r5.f141146i
            java.util.UUID r3 = (java.util.UUID) r3
            java.lang.Object r4 = r5.f141145h
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r8 = r5.f141144g
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r10 = r5.f141143f
            com.sugarcube.decorate.internal.shared.IDecorateEngine r10 = (com.sugarcube.decorate.internal.shared.IDecorateEngine) r10
            java.lang.Object r12 = r5.f141142e
            java.util.UUID r12 = (java.util.UUID) r12
            java.lang.Object r13 = r5.f141141d
            java.util.UUID r13 = (java.util.UUID) r13
            java.lang.Object r14 = r5.f141140c
            bG.a r14 = (bG.C17033a) r14
            XH.y.b(r6)
            goto L_0x0120
        L_0x009b:
            boolean r1 = r5.f141153p
            java.lang.Object r2 = r5.f141146i
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r3 = r5.f141145h
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r5.f141144g
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r8 = r5.f141143f
            com.sugarcube.decorate.internal.shared.IDecorateEngine r8 = (com.sugarcube.decorate.internal.shared.IDecorateEngine) r8
            java.lang.Object r12 = r5.f141142e
            java.util.UUID r12 = (java.util.UUID) r12
            java.lang.Object r13 = r5.f141141d
            java.util.UUID r13 = (java.util.UUID) r13
            java.lang.Object r14 = r5.f141140c
            bG.a r14 = (bG.C17033a) r14
            XH.y.b(r6)
            goto L_0x00f5
        L_0x00bd:
            XH.y.b(r6)
            boolean r6 = r0.f141079d
            if (r6 == 0) goto L_0x00c7
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x00c7:
            java.util.UUID r6 = r0.b(r1, r3)
            com.sugarcube.decorate.v1.internal.designpersistence.SceneTempStorage r8 = r0.f141077b
            r5.f141140c = r0
            r5.f141141d = r2
            r5.f141142e = r3
            r12 = r25
            r5.f141143f = r12
            r13 = r26
            r5.f141144g = r13
            r5.f141145h = r4
            r5.f141146i = r6
            r5.f141153p = r1
            r5.f141160w = r11
            java.lang.Object r8 = r8.hasSavedState(r2, r6, r5)
            if (r8 != r7) goto L_0x00ea
            return r7
        L_0x00ea:
            r14 = r0
            r20 = r13
            r13 = r2
            r2 = r6
            r6 = r8
            r8 = r12
            r12 = r3
            r3 = r4
            r4 = r20
        L_0x00f5:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r5.f141140c = r14
            r5.f141141d = r13
            r5.f141142e = r12
            r5.f141143f = r8
            r5.f141144g = r4
            r5.f141145h = r3
            r5.f141146i = r2
            r5.f141153p = r1
            r5.f141154q = r6
            r5.f141160w = r10
            java.lang.Object r10 = r14.isPreserveFeatureEnabled(r5)
            if (r10 != r7) goto L_0x0116
            return r7
        L_0x0116:
            r20 = r2
            r2 = r1
            r1 = r6
            r6 = r10
            r10 = r8
            r8 = r4
            r4 = r3
            r3 = r20
        L_0x0120:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r9 = "updateDesignState:: hasUnRestoredState? "
            r15.append(r9)
            r15.append(r1)
            java.lang.String r9 = ", persistenceEnabled: "
            r15.append(r9)
            r15.append(r6)
            java.lang.String r9 = r15.toString()
            java.lang.String r15 = "DesignStateManager"
            android.util.Log.v(r15, r9)
            if (r1 == 0) goto L_0x0149
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0149:
            if (r6 != 0) goto L_0x014e
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x014e:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r15 = r8.size()
            r9.<init>(r15)
            java.util.Set r15 = r8.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x015f:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x01a8
            java.lang.Object r16 = r15.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r17 = r16.getValue()
            RF.k r17 = (RF.k) r17
            com.sugarcube.decorate_engine.ObjectInstanceId r0 = r17.f()
            com.sugarcube.decorate_engine.ModelScreenTransform r0 = r10.getModelScreenTransform(r0, r11)
            com.sugarcube.decorate.TempModelInstanceInfo r11 = new com.sugarcube.decorate.TempModelInstanceInfo
            java.lang.Object r18 = r16.getKey()
            r19 = r7
            r7 = r18
            com.sugarcube.decorate_engine.ObjectInstanceId r7 = (com.sugarcube.decorate_engine.ObjectInstanceId) r7
            java.lang.Object r16 = r16.getValue()
            RF.k r16 = (RF.k) r16
            com.sugarcube.app.base.data.database.CachedCatalogItem r16 = r16.d()
            r22 = r6
            com.sugarcube.core.network.models.CatalogItem r6 = r16.getCatalogItem()
            r11.<init>(r7, r6)
            com.sugarcube.decorate.DesignItemInfo r6 = new com.sugarcube.decorate.DesignItemInfo
            r6.<init>(r11, r0)
            r9.add(r6)
            r0 = r21
            r6 = r22
            r7 = r19
            r11 = 1
            goto L_0x015f
        L_0x01a8:
            r22 = r6
            r19 = r7
            java.util.List r0 = YH.C16877v.w1(r9)
            r14.f141078c = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01bb
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x01bb:
            r5.f141140c = r14
            r5.f141141d = r13
            r5.f141142e = r12
            r5.f141143f = r10
            r5.f141144g = r8
            r5.f141145h = r4
            r5.f141146i = r3
            r5.f141147j = r8
            r5.f141148k = r8
            r5.f141149l = r9
            r5.f141150m = r15
            r5.f141151n = r14
            r5.f141152o = r9
            r5.f141153p = r2
            r5.f141154q = r1
            r0 = r22
            r5.f141155r = r0
            r0 = 0
            r5.f141156s = r0
            r5.f141157t = r0
            r0 = 3
            r5.f141160w = r0
            java.lang.Object r0 = r14.c(r2, r13, r3, r5)
            r1 = r19
            if (r0 != r1) goto L_0x01ee
            return r1
        L_0x01ee:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bG.C17033a.updateDesignState(boolean, java.util.UUID, java.util.UUID, com.sugarcube.decorate.internal.shared.IDecorateEngine, java.util.HashMap, dI.e):java.lang.Object");
    }
}
