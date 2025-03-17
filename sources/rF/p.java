package RF;

import com.sugarcube.app.base.data.Result;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.source.SmartaRepository;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.SmartaDebug;
import com.sugarcube.core.network.models.SmartaPlacement;
import com.sugarcube.core.network.models.SmartaPlacementResponse;
import com.sugarcube.core.network.models.SmartaPlacementResult;
import dI.C17164e;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006\u001e"}, d2 = {"LRF/p;", "", "Lcom/sugarcube/app/base/data/source/SmartaRepository;", "smartaRepository", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "<init>", "(Lcom/sugarcube/app/base/data/source/SmartaRepository;Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "Lcom/sugarcube/core/network/models/SmartaPlacementResponse;", "smartaPlacementResponse", "", "latency", "Lcom/sugarcube/core/network/models/SmartaPlacementResult;", "c", "(Lcom/sugarcube/core/network/models/SmartaPlacementResponse;J)Lcom/sugarcube/core/network/models/SmartaPlacementResult;", "Lcom/sugarcube/app/base/data/Result$Error;", "error", "b", "(Lcom/sugarcube/app/base/data/Result$Error;J)Lcom/sugarcube/core/network/models/SmartaPlacementResult;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "Lcom/sugarcube/core/network/models/Composition;", "updatedComposition", "", "isShowroom", "isHela", "a", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Lcom/sugarcube/core/network/models/Composition;ZZLdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/source/SmartaRepository;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final a f115571c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f115572d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final SmartaRepository f115573a;

    /* renamed from: b  reason: collision with root package name */
    private final ConfigRepository f115574b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"LRF/p$a;", "", "<init>", "()V", "", "ERROR_TIMEOUT", "Ljava/lang/String;", "ERROR_UNSUPPORTED", "ERROR_NETWORK", "ERROR_UNKNOWN", "RESULT_SUCCESS", "RESULT_FAILED", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.internal.shared.SmartaPlacementUseCase", f = "SmartaPlacementUseCase.kt", l = {52, 59, 73, 90}, m = "execute")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f115575c;

        /* renamed from: d  reason: collision with root package name */
        Object f115576d;

        /* renamed from: e  reason: collision with root package name */
        Object f115577e;

        /* renamed from: f  reason: collision with root package name */
        Object f115578f;

        /* renamed from: g  reason: collision with root package name */
        Object f115579g;

        /* renamed from: h  reason: collision with root package name */
        Object f115580h;

        /* renamed from: i  reason: collision with root package name */
        Object f115581i;

        /* renamed from: j  reason: collision with root package name */
        Object f115582j;

        /* renamed from: k  reason: collision with root package name */
        Object f115583k;

        /* renamed from: l  reason: collision with root package name */
        Object f115584l;

        /* renamed from: m  reason: collision with root package name */
        boolean f115585m;

        /* renamed from: n  reason: collision with root package name */
        boolean f115586n;

        /* renamed from: o  reason: collision with root package name */
        boolean f115587o;

        /* renamed from: p  reason: collision with root package name */
        int f115588p;

        /* renamed from: q  reason: collision with root package name */
        int f115589q;

        /* renamed from: r  reason: collision with root package name */
        long f115590r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f115591s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ p f115592t;

        /* renamed from: u  reason: collision with root package name */
        int f115593u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f115592t = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f115591s = obj;
            this.f115593u |= Integer.MIN_VALUE;
            return this.f115592t.a((CachedCatalogItem) null, (Composition) null, false, false, this);
        }
    }

    public p(SmartaRepository smartaRepository, ConfigRepository configRepository) {
        C17542s.j(smartaRepository, "smartaRepository");
        C17542s.j(configRepository, "configRepository");
        this.f115573a = smartaRepository;
        this.f115574b = configRepository;
    }

    private final SmartaPlacementResult b(Result.Error error, long j10) {
        String message;
        Throwable exception = error.getException();
        if (exception instanceof UnsupportedOperationException) {
            message = "Not Supported";
        } else if (exception instanceof CancellationException) {
            message = "Timeout";
        } else if (exception instanceof UnknownHostException) {
            message = "Network error";
        } else {
            message = exception.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
        }
        return new SmartaPlacementResult((SmartaPlacement) null, "Failed", true, message, Long.valueOf(j10));
    }

    private final SmartaPlacementResult c(SmartaPlacementResponse smartaPlacementResponse, long j10) {
        StringBuilder sb2 = new StringBuilder();
        Integer errorCode = smartaPlacementResponse.getErrorCode();
        if (errorCode != null) {
            int intValue = errorCode.intValue();
            sb2.append("Error code # " + intValue + ": ");
        }
        SmartaDebug debug = smartaPlacementResponse.getDebug();
        String message = debug != null ? debug.getMessage() : null;
        if (message == null) {
            message = "";
        }
        sb2.append(message);
        String sb3 = sb2.toString();
        return new SmartaPlacementResult(smartaPlacementResponse.getPlacedFurniture(), smartaPlacementResponse.getError() ? "Failed" : "Success", smartaPlacementResponse.getError(), sb3, Long.valueOf(j10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0140 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0171 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.sugarcube.app.base.data.database.CachedCatalogItem r30, com.sugarcube.core.network.models.Composition r31, boolean r32, boolean r33, dI.C17164e<? super com.sugarcube.core.network.models.SmartaPlacementResult> r34) {
        /*
            r29 = this;
            r0 = r29
            r1 = r34
            boolean r2 = r1 instanceof RF.p.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            RF.p$b r2 = (RF.p.b) r2
            int r3 = r2.f115593u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f115593u = r3
            goto L_0x001c
        L_0x0017:
            RF.p$b r2 = new RF.p$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f115591s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f115593u
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r5 == 0) goto L_0x00c1
            if (r5 == r9) goto L_0x00a1
            if (r5 == r8) goto L_0x0088
            if (r5 == r7) goto L_0x006b
            if (r5 != r6) goto L_0x0063
            long r4 = r2.f115590r
            java.lang.Object r1 = r2.f115584l
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r6 = r2.f115583k
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r6 = r2.f115582j
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r2.f115581i
            com.sugarcube.core.network.models.SmartaPlacementRequest r6 = (com.sugarcube.core.network.models.SmartaPlacementRequest) r6
            java.lang.Object r6 = r2.f115580h
            kotlin.jvm.internal.O r6 = (kotlin.jvm.internal.O) r6
            java.lang.Object r7 = r2.f115579g
            com.sugarcube.app.base.data.feature.ConfigItem$FeatureFlag r7 = (com.sugarcube.app.base.data.feature.ConfigItem.FeatureFlag) r7
            java.lang.Object r7 = r2.f115578f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r2.f115577e
            com.sugarcube.core.network.models.Composition r7 = (com.sugarcube.core.network.models.Composition) r7
            java.lang.Object r7 = r2.f115576d
            com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7
            java.lang.Object r2 = r2.f115575c
            RF.p r2 = (RF.p) r2
            XH.y.b(r3)
            goto L_0x020d
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006b:
            boolean r1 = r2.f115586n
            boolean r5 = r2.f115585m
            java.lang.Object r7 = r2.f115579g
            com.sugarcube.app.base.data.feature.ConfigItem$FeatureFlag r7 = (com.sugarcube.app.base.data.feature.ConfigItem.FeatureFlag) r7
            java.lang.Object r8 = r2.f115578f
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r12 = r2.f115577e
            com.sugarcube.core.network.models.Composition r12 = (com.sugarcube.core.network.models.Composition) r12
            java.lang.Object r13 = r2.f115576d
            com.sugarcube.app.base.data.database.CachedCatalogItem r13 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r13
            java.lang.Object r14 = r2.f115575c
            RF.p r14 = (RF.p) r14
            XH.y.b(r3)
            goto L_0x0174
        L_0x0088:
            boolean r1 = r2.f115586n
            boolean r5 = r2.f115585m
            java.lang.Object r8 = r2.f115578f
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r12 = r2.f115577e
            com.sugarcube.core.network.models.Composition r12 = (com.sugarcube.core.network.models.Composition) r12
            java.lang.Object r13 = r2.f115576d
            com.sugarcube.app.base.data.database.CachedCatalogItem r13 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r13
            java.lang.Object r14 = r2.f115575c
            RF.p r14 = (RF.p) r14
            XH.y.b(r3)
            goto L_0x0138
        L_0x00a1:
            boolean r1 = r2.f115586n
            boolean r5 = r2.f115585m
            java.lang.Object r12 = r2.f115578f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r2.f115577e
            com.sugarcube.core.network.models.Composition r13 = (com.sugarcube.core.network.models.Composition) r13
            java.lang.Object r14 = r2.f115576d
            com.sugarcube.app.base.data.database.CachedCatalogItem r14 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r14
            java.lang.Object r15 = r2.f115575c
            RF.p r15 = (RF.p) r15
            XH.y.b(r3)
            r27 = r15
            r15 = r1
            r1 = r12
            r12 = r14
            r14 = r5
            r5 = r27
            goto L_0x00fb
        L_0x00c1:
            XH.y.b(r3)
            java.lang.Boolean r3 = r30.isSupportedAutodecorate()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r10)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 == 0) goto L_0x00d3
            return r11
        L_0x00d3:
            boolean r3 = r30.isStackableChild()
            if (r3 == 0) goto L_0x0104
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r0.f115574b
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableStackablesSmartPlacement r5 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableStackablesSmartPlacement.INSTANCE
            r2.f115575c = r0
            r12 = r30
            r2.f115576d = r12
            r13 = r31
            r2.f115577e = r13
            r2.f115578f = r1
            r14 = r32
            r2.f115585m = r14
            r15 = r33
            r2.f115586n = r15
            r2.f115593u = r9
            java.lang.Object r3 = r3.get(r5, r2)
            if (r3 != r4) goto L_0x00fa
            return r4
        L_0x00fa:
            r5 = r0
        L_0x00fb:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x010d
            return r11
        L_0x0104:
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r5 = r0
        L_0x010d:
            boolean r3 = r12.isWallPlaceableAny()
            if (r3 == 0) goto L_0x0141
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r5.f115574b
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartPlacementWallMount r6 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartPlacementWallMount.INSTANCE
            r2.f115575c = r5
            r2.f115576d = r12
            r2.f115577e = r13
            r2.f115578f = r1
            r2.f115585m = r14
            r2.f115586n = r15
            r2.f115593u = r8
            java.lang.Object r3 = r3.get(r6, r2)
            if (r3 != r4) goto L_0x012c
            return r4
        L_0x012c:
            r8 = r1
            r1 = r15
            r27 = r14
            r14 = r5
            r5 = r27
            r28 = r13
            r13 = r12
            r12 = r28
        L_0x0138:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x014d
            return r11
        L_0x0141:
            r8 = r1
            r1 = r15
            r27 = r14
            r14 = r5
            r5 = r27
            r28 = r13
            r13 = r12
            r12 = r28
        L_0x014d:
            if (r5 == 0) goto L_0x0152
            com.sugarcube.app.base.data.feature.FeatureFlags$SmartPlacementSupport r3 = com.sugarcube.app.base.data.feature.FeatureFlags.SmartPlacementSupport.INSTANCE
            goto L_0x0159
        L_0x0152:
            if (r1 == 0) goto L_0x0157
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartPlacementHela r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartPlacementHela.INSTANCE
            goto L_0x0159
        L_0x0157:
            com.sugarcube.app.base.data.feature.FeatureFlags$SmartPlacementSupportOwnRoom r3 = com.sugarcube.app.base.data.feature.FeatureFlags.SmartPlacementSupportOwnRoom.INSTANCE
        L_0x0159:
            com.sugarcube.app.base.data.feature.ConfigRepository r6 = r14.f115574b
            r2.f115575c = r14
            r2.f115576d = r13
            r2.f115577e = r12
            r2.f115578f = r8
            r2.f115579g = r3
            r2.f115585m = r5
            r2.f115586n = r1
            r2.f115593u = r7
            java.lang.Object r6 = r6.get(r3, r2)
            if (r6 != r4) goto L_0x0172
            return r4
        L_0x0172:
            r7 = r3
            r3 = r6
        L_0x0174:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x017d
            return r11
        L_0x017d:
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            if (r12 == 0) goto L_0x018a
            java.util.List r15 = r12.getPlacedFurnitureSet()
            if (r15 != 0) goto L_0x018e
        L_0x018a:
            java.util.List r15 = YH.C16877v.n()
        L_0x018e:
            if (r12 == 0) goto L_0x0197
            java.util.UUID r16 = r12.getSceneUuid()
            r30 = r16
            goto L_0x0199
        L_0x0197:
            r30 = r11
        L_0x0199:
            if (r12 == 0) goto L_0x01a4
            boolean r11 = r12.isShared()
            if (r11 != r9) goto L_0x01a4
            r20 = r9
            goto L_0x01a6
        L_0x01a4:
            r20 = r10
        L_0x01a6:
            if (r12 == 0) goto L_0x01af
            java.lang.String r9 = r12.getName()
            r18 = r9
            goto L_0x01b1
        L_0x01af:
            r18 = 0
        L_0x01b1:
            com.sugarcube.core.network.models.CatalogItem r9 = r13.getCatalogItem()
            java.lang.String r23 = r9.getLocalItemNumber()
            if (r12 == 0) goto L_0x01c2
            com.sugarcube.core.network.models.CompositionSavedProperties r9 = r12.getSavedProperties()
            r21 = r9
            goto L_0x01c4
        L_0x01c2:
            r21 = 0
        L_0x01c4:
            com.sugarcube.core.network.models.SmartaPlacementRequest r9 = new com.sugarcube.core.network.models.SmartaPlacementRequest
            r25 = 32
            r26 = 0
            r22 = 0
            java.lang.String r24 = "local_item_number"
            r16 = r9
            r17 = r15
            r19 = r30
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            long r10 = java.lang.System.currentTimeMillis()
            com.sugarcube.app.base.data.source.SmartaRepository r0 = r14.f115573a
            r2.f115575c = r14
            r2.f115576d = r13
            r2.f115577e = r12
            r2.f115578f = r8
            r2.f115579g = r7
            r2.f115580h = r6
            r2.f115581i = r9
            r2.f115582j = r15
            r7 = r30
            r2.f115583k = r7
            r2.f115584l = r6
            r2.f115585m = r5
            r2.f115586n = r1
            r2.f115587o = r3
            r1 = 0
            r2.f115588p = r1
            r2.f115590r = r10
            r2.f115589q = r1
            r1 = 4
            r2.f115593u = r1
            java.lang.Object r3 = r0.postSmartaPlacement(r9, r2)
            if (r3 != r4) goto L_0x020a
            return r4
        L_0x020a:
            r1 = r6
            r4 = r10
            r2 = r14
        L_0x020d:
            r1.f144348a = r3
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            T r3 = r6.f144348a
            java.lang.String r4 = "response"
            if (r3 != 0) goto L_0x021f
            kotlin.jvm.internal.C17542s.z(r4)
            r3 = 0
            goto L_0x0221
        L_0x021f:
            com.sugarcube.app.base.data.Result r3 = (com.sugarcube.app.base.data.Result) r3
        L_0x0221:
            boolean r5 = r3 instanceof com.sugarcube.app.base.data.Result.Success
            if (r5 == 0) goto L_0x0243
            T r3 = r6.f144348a
            if (r3 != 0) goto L_0x022e
            kotlin.jvm.internal.C17542s.z(r4)
            r11 = 0
            goto L_0x0231
        L_0x022e:
            r11 = r3
            com.sugarcube.app.base.data.Result r11 = (com.sugarcube.app.base.data.Result) r11
        L_0x0231:
            java.lang.String r3 = "null cannot be cast to non-null type com.sugarcube.app.base.data.Result.Success<com.sugarcube.core.network.models.SmartaPlacementResponse>"
            kotlin.jvm.internal.C17542s.h(r11, r3)
            com.sugarcube.app.base.data.Result$Success r11 = (com.sugarcube.app.base.data.Result.Success) r11
            java.lang.Object r3 = r11.getData()
            com.sugarcube.core.network.models.SmartaPlacementResponse r3 = (com.sugarcube.core.network.models.SmartaPlacementResponse) r3
            com.sugarcube.core.network.models.SmartaPlacementResult r0 = r2.c(r3, r0)
            goto L_0x025e
        L_0x0243:
            boolean r3 = r3 instanceof com.sugarcube.app.base.data.Result.Error
            if (r3 == 0) goto L_0x025f
            T r3 = r6.f144348a
            if (r3 != 0) goto L_0x0250
            kotlin.jvm.internal.C17542s.z(r4)
            r11 = 0
            goto L_0x0253
        L_0x0250:
            r11 = r3
            com.sugarcube.app.base.data.Result r11 = (com.sugarcube.app.base.data.Result) r11
        L_0x0253:
            java.lang.String r3 = "null cannot be cast to non-null type com.sugarcube.app.base.data.Result.Error"
            kotlin.jvm.internal.C17542s.h(r11, r3)
            com.sugarcube.app.base.data.Result$Error r11 = (com.sugarcube.app.base.data.Result.Error) r11
            com.sugarcube.core.network.models.SmartaPlacementResult r0 = r2.b(r11, r0)
        L_0x025e:
            return r0
        L_0x025f:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: RF.p.a(com.sugarcube.app.base.data.database.CachedCatalogItem, com.sugarcube.core.network.models.Composition, boolean, boolean, dI.e):java.lang.Object");
    }
}
