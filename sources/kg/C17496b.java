package kG;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.app.base.data.source.CompositionRepository;
import com.sugarcube.core.network.models.IntrinsicsData;
import com.sugarcube.core.network.models.LightingData;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.PlanePolygonSet;
import com.sugarcube.core.network.models.PlanesData;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.SegmentationMetaData;
import com.sugarcube.decorate.v2.internal.manager.model.ModelManager;
import com.sugarcube.decorate.v2.internal.manager.scene.SceneLoadingManager;
import dI.C17164e;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001)B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`\u00182\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\"\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\"\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J*\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b$\u0010%J\"\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.¨\u0006/"}, d2 = {"LkG/b;", "Lcom/sugarcube/decorate/v2/internal/manager/scene/SceneLoadingManager;", "Landroid/content/Context;", "appContext", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "compositionRepository", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;", "modelManager", "<init>", "(Landroid/content/Context;Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/data/source/CompositionRepository;Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;)V", "Ljava/util/UUID;", "uuid", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "h", "(Ljava/util/UUID;)Lcom/sugarcube/app/base/data/analytics/RoomSource;", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "Lcom/sugarcube/core/network/models/RoomType;", "g", "(Lcom/sugarcube/app/base/data/database/Scene;)Lcom/sugarcube/core/network/models/RoomType;", "Ljava/util/HashMap;", "Landroid/net/Uri;", "Lkotlin/collections/HashMap;", "d", "(Lcom/sugarcube/app/base/data/database/Scene;LdI/e;)Ljava/lang/Object;", "uriMap", "Lcom/sugarcube/core/network/models/Manifest;", "f", "(Lcom/sugarcube/app/base/data/database/Scene;Ljava/util/HashMap;)Lcom/sugarcube/core/network/models/Manifest;", "e", "(Lcom/sugarcube/app/base/data/database/Scene;Ljava/util/HashMap;)Landroid/net/Uri;", "sceneUuid", "compositionUuid", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "c", "(Lcom/sugarcube/app/base/data/database/Scene;Ljava/util/UUID;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "LkG/c;", "loadDesign", "(Ljava/util/UUID;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lcom/sugarcube/app/base/data/SceneRepository;", "Lcom/sugarcube/app/base/data/source/CompositionRepository;", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kG.b  reason: case insensitive filesystem */
public final class C17496b implements SceneLoadingManager {

    /* renamed from: e  reason: collision with root package name */
    public static final a f144200e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f144201f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f144202a;

    /* renamed from: b  reason: collision with root package name */
    private final SceneRepository f144203b;

    /* renamed from: c  reason: collision with root package name */
    private final CompositionRepository f144204c;

    /* renamed from: d  reason: collision with root package name */
    private final ModelManager f144205d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LkG/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kG.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.manager.scene.SceneLoadingManagerImpl", f = "SceneLoadingManagerImpl.kt", l = {149, 174}, m = "getCachedCompiledComposition")
    /* renamed from: kG.b$b  reason: collision with other inner class name */
    static final class C3520b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f144206c;

        /* renamed from: d  reason: collision with root package name */
        Object f144207d;

        /* renamed from: e  reason: collision with root package name */
        Object f144208e;

        /* renamed from: f  reason: collision with root package name */
        Object f144209f;

        /* renamed from: g  reason: collision with root package name */
        Object f144210g;

        /* renamed from: h  reason: collision with root package name */
        Object f144211h;

        /* renamed from: i  reason: collision with root package name */
        Object f144212i;

        /* renamed from: j  reason: collision with root package name */
        Object f144213j;

        /* renamed from: k  reason: collision with root package name */
        Object f144214k;

        /* renamed from: l  reason: collision with root package name */
        Object f144215l;

        /* renamed from: m  reason: collision with root package name */
        int f144216m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f144217n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C17496b f144218o;

        /* renamed from: p  reason: collision with root package name */
        int f144219p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3520b(C17496b bVar, C17164e<? super C3520b> eVar) {
            super(eVar);
            this.f144218o = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f144217n = obj;
            this.f144219p |= Integer.MIN_VALUE;
            return this.f144218o.c((Scene) null, (UUID) null, (UUID) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.manager.scene.SceneLoadingManagerImpl", f = "SceneLoadingManagerImpl.kt", l = {96}, m = "getCachedUriMap")
    /* renamed from: kG.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f144220c;

        /* renamed from: d  reason: collision with root package name */
        Object f144221d;

        /* renamed from: e  reason: collision with root package name */
        Object f144222e;

        /* renamed from: f  reason: collision with root package name */
        Object f144223f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f144224g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17496b f144225h;

        /* renamed from: i  reason: collision with root package name */
        int f144226i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17496b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f144225h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f144224g = obj;
            this.f144226i |= Integer.MIN_VALUE;
            return this.f144225h.d((Scene) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.manager.scene.SceneLoadingManagerImpl", f = "SceneLoadingManagerImpl.kt", l = {43, 53, 58}, m = "loadDesign")
    /* renamed from: kG.b$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f144227c;

        /* renamed from: d  reason: collision with root package name */
        Object f144228d;

        /* renamed from: e  reason: collision with root package name */
        Object f144229e;

        /* renamed from: f  reason: collision with root package name */
        Object f144230f;

        /* renamed from: g  reason: collision with root package name */
        Object f144231g;

        /* renamed from: h  reason: collision with root package name */
        Object f144232h;

        /* renamed from: i  reason: collision with root package name */
        Object f144233i;

        /* renamed from: j  reason: collision with root package name */
        Object f144234j;

        /* renamed from: k  reason: collision with root package name */
        Object f144235k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f144236l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17496b f144237m;

        /* renamed from: n  reason: collision with root package name */
        int f144238n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17496b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f144237m = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f144236l = obj;
            this.f144238n |= Integer.MIN_VALUE;
            return this.f144237m.loadDesign((UUID) null, (UUID) null, this);
        }
    }

    public C17496b(Context context, SceneRepository sceneRepository, CompositionRepository compositionRepository, ModelManager modelManager) {
        C17542s.j(context, "appContext");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(compositionRepository, "compositionRepository");
        C17542s.j(modelManager, "modelManager");
        this.f144202a = context;
        this.f144203b = sceneRepository;
        this.f144204c = compositionRepository;
        this.f144205d = modelManager;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.sugarcube.core.network.models.CompiledComposition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: com.sugarcube.core.network.models.CompiledComposition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.sugarcube.core.network.models.CompiledComposition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.util.UUID} */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.Map, java.util.HashMap] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01a7 A[PHI: r4 
      PHI: (r4v1 java.lang.Object) = (r4v3 java.lang.Object), (r4v0 java.lang.Object) binds: [B:35:0x01a4, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(com.sugarcube.app.base.data.database.Scene r42, java.util.UUID r43, java.util.UUID r44, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCompiledComposition> r45) {
        /*
            r41 = this;
            r0 = r41
            r1 = r44
            r2 = r45
            boolean r3 = r2 instanceof kG.C17496b.C3520b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            kG.b$b r3 = (kG.C17496b.C3520b) r3
            int r4 = r3.f144219p
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f144219p = r4
            goto L_0x001e
        L_0x0019:
            kG.b$b r3 = new kG.b$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f144217n
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f144219p
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x008e
            if (r6 == r8) goto L_0x0057
            if (r6 != r7) goto L_0x004f
            java.lang.Object r1 = r3.f144212i
            com.sugarcube.app.base.data.database.CachedCompiledComposition r1 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r1
            java.lang.Object r1 = r3.f144211h
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            java.lang.Object r1 = r3.f144210g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f144209f
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r3.f144208e
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r3.f144207d
            com.sugarcube.app.base.data.database.Scene r1 = (com.sugarcube.app.base.data.database.Scene) r1
            java.lang.Object r1 = r3.f144206c
            kG.b r1 = (kG.C17496b) r1
            XH.y.b(r4)
            goto L_0x01a7
        L_0x004f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0057:
            java.lang.Object r1 = r3.f144215l
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r2 = r3.f144214k
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r3.f144213j
            java.time.Instant r2 = (java.time.Instant) r2
            java.lang.Object r2 = r3.f144212i
            java.time.Instant r2 = (java.time.Instant) r2
            java.lang.Object r2 = r3.f144211h
            com.sugarcube.core.network.models.Composition r2 = (com.sugarcube.core.network.models.Composition) r2
            java.lang.Object r6 = r3.f144210g
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r8 = r3.f144209f
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r9 = r3.f144208e
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r10 = r3.f144207d
            com.sugarcube.app.base.data.database.Scene r10 = (com.sugarcube.app.base.data.database.Scene) r10
            java.lang.Object r11 = r3.f144206c
            kG.b r11 = (kG.C17496b) r11
            XH.y.b(r4)
            r14 = r9
            r13 = r10
            r10 = r1
            r1 = r8
            r40 = r4
            r4 = r2
            r2 = r6
            r6 = r40
            goto L_0x013b
        L_0x008e:
            XH.y.b(r4)
            java.time.Instant r4 = java.time.Instant.now()
            java.lang.String r6 = "now(...)"
            kotlin.jvm.internal.C17542s.i(r4, r6)
            java.time.Instant r9 = java.time.Instant.now()
            kotlin.jvm.internal.C17542s.i(r9, r6)
            java.util.List r6 = YH.C16877v.n()
            if (r1 != 0) goto L_0x00ac
            java.util.UUID r10 = java.util.UUID.randomUUID()
            goto L_0x00ad
        L_0x00ac:
            r10 = r1
        L_0x00ad:
            kotlin.jvm.internal.C17542s.g(r10)
            int r11 = r42.getSceneId()
            r25 = r11
            com.sugarcube.core.network.models.Composition r15 = new com.sugarcube.core.network.models.Composition
            r12 = r15
            r31 = 246812(0x3c41c, float:3.45857E-40)
            r32 = 0
            r13 = -1
            java.lang.String r14 = ""
            r16 = 0
            r33 = r15
            r15 = r16
            r17 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r18 = r10
            r19 = r6
            r20 = r4
            r21 = r9
            r26 = r43
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            if (r1 != 0) goto L_0x0111
            com.sugarcube.app.base.data.database.CachedCompiledComposition r4 = new com.sugarcube.app.base.data.database.CachedCompiledComposition
            java.util.List r8 = YH.C16877v.n()
            com.sugarcube.core.network.models.CompiledComposition r35 = new com.sugarcube.core.network.models.CompiledComposition
            r16 = 4
            r17 = 0
            r15 = 0
            r12 = r35
            r13 = r33
            r14 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r38 = 6
            r39 = 0
            r36 = 0
            r37 = 0
            r34 = r4
            r34.<init>(r35, r36, r37, r38, r39)
            r13 = r42
            r14 = r43
            r11 = r0
            r15 = r33
            goto L_0x0188
        L_0x0111:
            com.sugarcube.app.base.data.source.CompositionRepository r12 = r0.f144204c
            r3.f144206c = r0
            r13 = r42
            r3.f144207d = r13
            r14 = r43
            r3.f144208e = r14
            r3.f144209f = r1
            r3.f144210g = r2
            r15 = r33
            r3.f144211h = r15
            r3.f144212i = r4
            r3.f144213j = r9
            r3.f144214k = r6
            r3.f144215l = r10
            r3.f144216m = r11
            r3.f144219p = r8
            java.lang.Object r4 = r12.fetchCompiledComposition(r1, r3)
            if (r4 != r5) goto L_0x0138
            return r5
        L_0x0138:
            r11 = r0
            r6 = r4
            r4 = r15
        L_0x013b:
            r8 = r6
            com.sugarcube.core.network.models.CompiledComposition r8 = (com.sugarcube.core.network.models.CompiledComposition) r8
            if (r8 == 0) goto L_0x0165
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.sugarcube.core.network.models.Composition r9 = r8.getComposition()
            java.util.Map r9 = r9.getGltf()
            if (r9 == 0) goto L_0x015b
            com.sugarcube.decorate.v2.internal.manager.model.ModelManager r10 = r11.f144205d
            java.util.UUID r12 = r13.getJobId()
            java.lang.String r9 = r10.writeGltfMapToFile(r14, r1, r12, r9)
        L_0x0159:
            r10 = r9
            goto L_0x015d
        L_0x015b:
            r9 = 0
            goto L_0x0159
        L_0x015d:
            com.sugarcube.app.base.data.database.CachedCompiledComposition r9 = new com.sugarcube.app.base.data.database.CachedCompiledComposition
            r9.<init>(r8, r6, r10)
            r15 = r4
            r4 = r9
            goto L_0x0188
        L_0x0165:
            com.sugarcube.app.base.data.database.CachedCompiledComposition r6 = new com.sugarcube.app.base.data.database.CachedCompiledComposition
            java.util.List r9 = YH.C16877v.n()
            com.sugarcube.core.network.models.CompiledComposition r12 = new com.sugarcube.core.network.models.CompiledComposition
            r19 = 4
            r20 = 0
            r18 = 0
            r15 = r12
            r16 = r4
            r17 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            r19 = 6
            r17 = 0
            r15 = r6
            r16 = r12
            r15.<init>(r16, r17, r18, r19, r20)
            r15 = r4
            r4 = r6
            r6 = r9
        L_0x0188:
            com.sugarcube.decorate.v2.internal.manager.model.ModelManager r9 = r11.f144205d
            r3.f144206c = r11
            r3.f144207d = r13
            r3.f144208e = r14
            r3.f144209f = r1
            r3.f144210g = r2
            r3.f144211h = r15
            r3.f144212i = r4
            r3.f144213j = r8
            r3.f144214k = r6
            r3.f144215l = r10
            r3.f144219p = r7
            java.lang.Object r4 = r9.cacheCatalogItems(r4, r3)
            if (r4 != r5) goto L_0x01a7
            return r5
        L_0x01a7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kG.C17496b.c(com.sugarcube.app.base.data.database.Scene, java.util.UUID, java.util.UUID, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(com.sugarcube.app.base.data.database.Scene r7, dI.C17164e<? super java.util.HashMap<android.net.Uri, android.net.Uri>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kG.C17496b.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kG.b$c r0 = (kG.C17496b.c) r0
            int r1 = r0.f144226i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f144226i = r1
            goto L_0x0018
        L_0x0013:
            kG.b$c r0 = new kG.b$c
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f144224g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f144226i
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r7 = r0.f144223f
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r8 = r0.f144222e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f144221d
            com.sugarcube.app.base.data.database.Scene r8 = (com.sugarcube.app.base.data.database.Scene) r8
            java.lang.Object r0 = r0.f144220c
            kG.b r0 = (kG.C17496b) r0
            XH.y.b(r1)
            r5 = r1
            r1 = r7
            r7 = r8
            r8 = r5
            goto L_0x0060
        L_0x003d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0045:
            XH.y.b(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.sugarcube.decorate.v2.internal.manager.model.ModelManager r3 = r6.f144205d
            r0.f144220c = r6
            r0.f144221d = r7
            r0.f144222e = r8
            r0.f144223f = r1
            r0.f144226i = r4
            java.lang.Object r8 = r3.fetchDecorationAssets(r7, r0)
            if (r8 != r2) goto L_0x0060
            return r2
        L_0x0060:
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0066:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r8.next()
            com.sugarcube.app.base.data.AssetItem r0 = (com.sugarcube.app.base.data.AssetItem) r0
            int r2 = r0.getResponseCode()
            r3 = 200(0xc8, float:2.8E-43)
            if (r3 > r2) goto L_0x0097
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 >= r3) goto L_0x0097
            android.net.Uri r2 = r0.getUri()
            java.io.File r0 = r0.getFile()
            java.io.File r0 = r0.getAbsoluteFile()
            java.lang.String r3 = "getAbsoluteFile(...)"
            kotlin.jvm.internal.C17542s.i(r0, r3)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r1.put(r2, r0)
            goto L_0x0066
        L_0x0097:
            YE.b r8 = YE.C13868b.f118106a
            java.util.UUID r1 = r7.getSceneUuid()
            java.util.UUID r7 = r7.getUuid()
            android.net.Uri r0 = r0.getUri()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fetch asset error: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            r2.append(r7)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r7 = r2.toString()
            YE.e r0 = YE.e.Decoration
            r8.b(r7, r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            return r7
        L_0x00cf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kG.C17496b.d(com.sugarcube.app.base.data.database.Scene, dI.e):java.lang.Object");
    }

    private final Uri e(Scene scene, HashMap<Uri, Uri> hashMap) {
        Uri glbUrl = scene.getGlbUrl();
        if (glbUrl != null) {
            return hashMap.get(glbUrl);
        }
        return null;
    }

    private final Manifest f(Scene scene, HashMap<Uri, Uri> hashMap) {
        Manifest manifest = scene.getManifest();
        Manifest copy$default = manifest != null ? Manifest.copy$default(manifest, (PlanesData) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (SegmentationMetaData) null, (PlanesData) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (LightingData) null, (IntrinsicsData) null, (Uri) null, (PlanePolygonSet) null, 0, 1048575, (Object) null) : null;
        if (scene.getGlbUrl() != null) {
            copy$default = null;
        }
        if (copy$default != null) {
            copy$default.replaceUris(hashMap);
        }
        return copy$default;
    }

    private final RoomType g(Scene scene) {
        RoomType roomType = scene.getRoomType();
        if (roomType != null) {
            return roomType;
        }
        RoomTypeRenderer roomTypeRenderer = RoomTypeRenderer.INSTANCE;
        Resources resources = this.f144202a.getResources();
        C17542s.i(resources, "getResources(...)");
        return roomTypeRenderer.getRoom(resources, scene.getName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.sugarcube.app.base.data.database.Scene} */
    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.sugarcube.app.base.data.analytics.RoomSource h(java.util.UUID r6) {
        /*
            r5 = this;
            com.sugarcube.app.base.data.SceneRepository r0 = r5.f144203b
            androidx.lifecycle.K r1 = r0.getShowrooms()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L_0x0035
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.sugarcube.core.network.models.Showroom r4 = (com.sugarcube.core.network.models.Showroom) r4
            java.util.UUID r4 = r4.getSceneUuid()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 == 0) goto L_0x0015
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            com.sugarcube.core.network.models.Showroom r3 = (com.sugarcube.core.network.models.Showroom) r3
            if (r3 == 0) goto L_0x0035
            com.sugarcube.app.base.data.analytics.RoomSource r6 = com.sugarcube.app.base.data.analytics.RoomSource.Showroom
            return r6
        L_0x0035:
            androidx.lifecycle.F r0 = r0.getScenes()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x006c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.sugarcube.app.base.data.database.Scene r3 = (com.sugarcube.app.base.data.database.Scene) r3
            java.util.UUID r3 = r3.getSceneUuid()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 == 0) goto L_0x0047
            r2 = r1
        L_0x005f:
            com.sugarcube.app.base.data.database.Scene r2 = (com.sugarcube.app.base.data.database.Scene) r2
            if (r2 == 0) goto L_0x006c
            boolean r6 = r2.isStock()
            if (r6 == 0) goto L_0x006c
            com.sugarcube.app.base.data.analytics.RoomSource r6 = com.sugarcube.app.base.data.analytics.RoomSource.Stock
            return r6
        L_0x006c:
            com.sugarcube.app.base.data.analytics.RoomSource r6 = com.sugarcube.app.base.data.analytics.RoomSource.UserCaptured
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kG.C17496b.h(java.util.UUID):com.sugarcube.app.base.data.analytics.RoomSource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0116 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object loadDesign(java.util.UUID r27, java.util.UUID r28, dI.C17164e<? super kG.C17497c> r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r29
            boolean r3 = r2 instanceof kG.C17496b.d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            kG.b$d r3 = (kG.C17496b.d) r3
            int r4 = r3.f144238n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f144238n = r4
            goto L_0x001e
        L_0x0019:
            kG.b$d r3 = new kG.b$d
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f144236l
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f144238n
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x00ac
            if (r6 == r9) goto L_0x0092
            if (r6 == r8) goto L_0x006b
            if (r6 != r7) goto L_0x0063
            java.lang.Object r1 = r3.f144235k
            com.sugarcube.core.network.models.Manifest r1 = (com.sugarcube.core.network.models.Manifest) r1
            java.lang.Object r2 = r3.f144234j
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r5 = r3.f144233i
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r3.f144232h
            com.sugarcube.core.network.models.RoomType r5 = (com.sugarcube.core.network.models.RoomType) r5
            java.lang.Object r6 = r3.f144231g
            com.sugarcube.app.base.data.database.Scene r6 = (com.sugarcube.app.base.data.database.Scene) r6
            java.lang.Object r7 = r3.f144230f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r3.f144229e
            java.util.UUID r7 = (java.util.UUID) r7
            java.lang.Object r8 = r3.f144228d
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r3 = r3.f144227c
            kG.b r3 = (kG.C17496b) r3
            XH.y.b(r4)
            r21 = r1
            r20 = r2
            r19 = r5
            r18 = r6
            r15 = r8
            goto L_0x0122
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006b:
            java.lang.Object r1 = r3.f144232h
            com.sugarcube.core.network.models.RoomType r1 = (com.sugarcube.core.network.models.RoomType) r1
            java.lang.Object r2 = r3.f144231g
            com.sugarcube.app.base.data.database.Scene r2 = (com.sugarcube.app.base.data.database.Scene) r2
            java.lang.Object r6 = r3.f144230f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r8 = r3.f144229e
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r10 = r3.f144228d
            java.util.UUID r10 = (java.util.UUID) r10
            java.lang.Object r11 = r3.f144227c
            kG.b r11 = (kG.C17496b) r11
            XH.y.b(r4)
            r24 = r6
            r6 = r2
            r2 = r24
            r25 = r11
            r11 = r10
            r10 = r25
            goto L_0x00f2
        L_0x0092:
            java.lang.Object r1 = r3.f144230f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r3.f144229e
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r6 = r3.f144228d
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r10 = r3.f144227c
            kG.b r10 = (kG.C17496b) r10
            XH.y.b(r4)
            r24 = r4
            r4 = r1
            r1 = r6
        L_0x00a9:
            r6 = r24
            goto L_0x00ca
        L_0x00ac:
            XH.y.b(r4)
            com.sugarcube.app.base.data.SceneRepository r4 = r0.f144203b
            r3.f144227c = r0
            r3.f144228d = r1
            r6 = r28
            r3.f144229e = r6
            r3.f144230f = r2
            r3.f144238n = r9
            java.lang.Object r4 = r4.getScene(r1, r3)
            if (r4 != r5) goto L_0x00c4
            return r5
        L_0x00c4:
            r10 = r0
            r24 = r4
            r4 = r2
            r2 = r6
            goto L_0x00a9
        L_0x00ca:
            com.sugarcube.app.base.data.database.Scene r6 = (com.sugarcube.app.base.data.database.Scene) r6
            if (r6 == 0) goto L_0x014f
            com.sugarcube.core.network.models.RoomType r11 = r10.g(r6)
            r3.f144227c = r10
            r3.f144228d = r1
            r3.f144229e = r2
            r3.f144230f = r4
            r3.f144231g = r6
            r3.f144232h = r11
            r3.f144238n = r8
            java.lang.Object r8 = r10.d(r6, r3)
            if (r8 != r5) goto L_0x00e7
            return r5
        L_0x00e7:
            r24 = r11
            r11 = r1
            r1 = r24
            r25 = r8
            r8 = r2
            r2 = r4
            r4 = r25
        L_0x00f2:
            java.util.HashMap r4 = (java.util.HashMap) r4
            android.net.Uri r12 = r10.e(r6, r4)
            com.sugarcube.core.network.models.Manifest r13 = r10.f(r6, r4)
            r3.f144227c = r10
            r3.f144228d = r11
            r3.f144229e = r8
            r3.f144230f = r2
            r3.f144231g = r6
            r3.f144232h = r1
            r3.f144233i = r4
            r3.f144234j = r12
            r3.f144235k = r13
            r3.f144238n = r7
            java.lang.Object r4 = r10.c(r6, r11, r8, r3)
            if (r4 != r5) goto L_0x0117
            return r5
        L_0x0117:
            r19 = r1
            r18 = r6
            r7 = r8
            r3 = r10
            r15 = r11
            r20 = r12
            r21 = r13
        L_0x0122:
            r22 = r4
            com.sugarcube.app.base.data.database.CachedCompiledComposition r22 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r22
            java.util.UUID r16 = r22.getCompositionUuid()
            if (r16 == 0) goto L_0x0147
            if (r7 == 0) goto L_0x013a
            com.sugarcube.core.network.models.Composition r1 = r22.getComposition()
            boolean r1 = r1.isStock()
            if (r1 == 0) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r9 = 0
        L_0x013a:
            r17 = r9
            com.sugarcube.app.base.data.analytics.RoomSource r23 = r3.h(r15)
            kG.c r1 = new kG.c
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        L_0x0147:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Composition UUID is null - something went terribly wrong."
            r1.<init>(r2)
            throw r1
        L_0x014f:
            YE.b r3 = YE.C13868b.f118106a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fetch scene error: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            YE.e r2 = YE.e.Decoration
            r3.b(r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Scene could not be fetched."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kG.C17496b.loadDesign(java.util.UUID, java.util.UUID, dI.e):java.lang.Object");
    }
}
