package jG;

import OE.C13309a;
import QJ.C16304f;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import QJ.T;
import RF.q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.X;
import android.net.Uri;
import android.util.Log;
import com.sugarcube.app.base.data.AssetCache;
import com.sugarcube.app.base.data.AssetItem;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCatalogPage;
import com.sugarcube.app.base.data.database.CachedCompiledComposition;
import com.sugarcube.app.base.data.database.SalesDressedBedDataKey;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.decorate.v2.internal.manager.model.ModelManager;
import com.sugarcube.decorate.v2.internal.manager.model.ModelRepository;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import nI.p;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001/B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\n0\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u001e\u0010\u000fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\b#\u0010$J=\u0010)\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020'0\fH\u0016¢\u0006\u0004\b)\u0010*J\u0018\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+H@¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"LjG/b;", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelManager;", "LOE/a;", "appEnvironment", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelRepository;", "modelRepository", "LjG/a;", "fileWriter", "<init>", "(LOE/a;Lcom/sugarcube/decorate/v2/internal/manager/model/ModelRepository;LjG/a;)V", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "", "", "d", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogItem;", "catalogItem", "", "e", "(Lcom/sugarcube/core/network/models/CatalogItem;LdI/e;)Ljava/lang/Object;", "Ljava/util/UUID;", "uuid", "jobId", "Lcom/sugarcube/app/base/data/AssetCache;", "f", "(Ljava/util/UUID;Ljava/util/UUID;)Lcom/sugarcube/app/base/data/AssetCache;", "Ljava/io/File;", "g", "(Ljava/util/UUID;Ljava/util/UUID;)Ljava/io/File;", "fetchCatalogItemModel", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "", "Lcom/sugarcube/app/base/data/AssetItem;", "fetchDecorationAssets", "(Lcom/sugarcube/app/base/data/database/Scene;LdI/e;)Ljava/lang/Object;", "sceneUuid", "compositionUuid", "", "gltfMap", "writeGltfMapToFile", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/Map;)Ljava/lang/String;", "Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;", "cachedCompiledComposition", "cacheCatalogItems", "(Lcom/sugarcube/app/base/data/database/CachedCompiledComposition;LdI/e;)Ljava/lang/Object;", "a", "LOE/a;", "getAppEnvironment", "()LOE/a;", "b", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelRepository;", "c", "LjG/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jG.b  reason: case insensitive filesystem */
public final class C17400b implements ModelManager {

    /* renamed from: d  reason: collision with root package name */
    public static final a f143845d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f143846e = C13309a.f112794f;

    /* renamed from: a  reason: collision with root package name */
    private final C13309a f143847a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ModelRepository f143848b;

    /* renamed from: c  reason: collision with root package name */
    private final C17399a f143849c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LjG/b$a;", "", "<init>", "()V", "", "SDB_VERSION", "I", "", "DEFAULT_ROOT_DIR", "Ljava/lang/String;", "TAG", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jG.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelManagerImpl", f = "ModelManagerImpl.kt", l = {94}, m = "cacheCatalogItems")
    /* renamed from: jG.b$b  reason: collision with other inner class name */
    static final class C3513b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143850c;

        /* renamed from: d  reason: collision with root package name */
        Object f143851d;

        /* renamed from: e  reason: collision with root package name */
        Object f143852e;

        /* renamed from: f  reason: collision with root package name */
        Object f143853f;

        /* renamed from: g  reason: collision with root package name */
        Object f143854g;

        /* renamed from: h  reason: collision with root package name */
        Object f143855h;

        /* renamed from: i  reason: collision with root package name */
        Object f143856i;

        /* renamed from: j  reason: collision with root package name */
        Object f143857j;

        /* renamed from: k  reason: collision with root package name */
        Object f143858k;

        /* renamed from: l  reason: collision with root package name */
        Object f143859l;

        /* renamed from: m  reason: collision with root package name */
        Object f143860m;

        /* renamed from: n  reason: collision with root package name */
        Object f143861n;

        /* renamed from: o  reason: collision with root package name */
        int f143862o;

        /* renamed from: p  reason: collision with root package name */
        int f143863p;

        /* renamed from: q  reason: collision with root package name */
        int f143864q;

        /* renamed from: r  reason: collision with root package name */
        int f143865r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f143866s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C17400b f143867t;

        /* renamed from: u  reason: collision with root package name */
        int f143868u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3513b(C17400b bVar, C17164e<? super C3513b> eVar) {
            super(eVar);
            this.f143867t = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143866s = obj;
            this.f143868u |= Integer.MIN_VALUE;
            return this.f143867t.cacheCatalogItems((CachedCompiledComposition) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/app/base/data/database/CachedCatalogItem;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelManagerImpl$cacheCatalogItems$2$cachedItem$1", f = "ModelManagerImpl.kt", l = {95}, m = "invokeSuspend")
    /* renamed from: jG.b$c */
    static final class c extends l implements p<Q, C17164e<? super CachedCatalogItem>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f143869c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17400b f143870d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CatalogItem f143871e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17400b bVar, CatalogItem catalogItem, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f143870d = bVar;
            this.f143871e = catalogItem;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f143870d, this.f143871e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super CachedCatalogItem> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f143869c;
            if (i10 == 0) {
                y.b(obj);
                C17400b bVar = this.f143870d;
                CachedCatalogItem a10 = q.a(this.f143871e);
                this.f143869c = 1;
                obj = bVar.fetchCatalogItemModel(a10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelManagerImpl", f = "ModelManagerImpl.kt", l = {40, 44}, m = "fetchCatalogItemModel")
    /* renamed from: jG.b$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143872c;

        /* renamed from: d  reason: collision with root package name */
        Object f143873d;

        /* renamed from: e  reason: collision with root package name */
        Object f143874e;

        /* renamed from: f  reason: collision with root package name */
        Object f143875f;

        /* renamed from: g  reason: collision with root package name */
        Object f143876g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f143877h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17400b f143878i;

        /* renamed from: j  reason: collision with root package name */
        int f143879j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17400b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f143878i = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143877h = obj;
            this.f143879j |= Integer.MIN_VALUE;
            return this.f143878i.fetchCatalogItemModel((CachedCatalogItem) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "<anonymous>", "(LQJ/Q;)Ljava/util/Map;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelManagerImpl$fetchCombinableAssets$2", f = "ModelManagerImpl.kt", l = {103, 106}, m = "invokeSuspend")
    /* renamed from: jG.b$e */
    static final class e extends l implements p<Q, C17164e<? super Map<String, ? extends CachedCatalogItem>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f143880c;

        /* renamed from: d  reason: collision with root package name */
        Object f143881d;

        /* renamed from: e  reason: collision with root package name */
        Object f143882e;

        /* renamed from: f  reason: collision with root package name */
        Object f143883f;

        /* renamed from: g  reason: collision with root package name */
        Object f143884g;

        /* renamed from: h  reason: collision with root package name */
        Object f143885h;

        /* renamed from: i  reason: collision with root package name */
        Object f143886i;

        /* renamed from: j  reason: collision with root package name */
        Object f143887j;

        /* renamed from: k  reason: collision with root package name */
        Object f143888k;

        /* renamed from: l  reason: collision with root package name */
        Object f143889l;

        /* renamed from: m  reason: collision with root package name */
        Object f143890m;

        /* renamed from: n  reason: collision with root package name */
        Object f143891n;

        /* renamed from: o  reason: collision with root package name */
        Object f143892o;

        /* renamed from: p  reason: collision with root package name */
        Object f143893p;

        /* renamed from: q  reason: collision with root package name */
        Object f143894q;

        /* renamed from: r  reason: collision with root package name */
        int f143895r;

        /* renamed from: s  reason: collision with root package name */
        int f143896s;

        /* renamed from: t  reason: collision with root package name */
        int f143897t;

        /* renamed from: u  reason: collision with root package name */
        int f143898u;

        /* renamed from: v  reason: collision with root package name */
        int f143899v;

        /* renamed from: w  reason: collision with root package name */
        int f143900w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f143901x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ C17400b f143902y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CachedCatalogItem cachedCatalogItem, C17400b bVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f143901x = cachedCatalogItem;
            this.f143902y = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f143901x, this.f143902y, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Map<String, CachedCatalogItem>> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.sugarcube.app.base.data.database.CachedCatalogItem} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0117  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x013d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                r26 = this;
                r0 = r26
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f143900w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x006b
                if (r2 == r4) goto L_0x0061
                if (r2 != r3) goto L_0x0059
                int r2 = r0.f143897t
                int r4 = r0.f143896s
                int r6 = r0.f143895r
                java.lang.Object r7 = r0.f143894q
                java.lang.Object r8 = r0.f143893p
                java.util.Map r8 = (java.util.Map) r8
                java.lang.Object r9 = r0.f143892o
                com.sugarcube.app.base.data.database.CachedCatalogItem r9 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r9
                java.lang.Object r10 = r0.f143891n
                com.sugarcube.app.base.data.database.CachedCatalogItem r10 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r10
                java.lang.Object r10 = r0.f143890m
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                java.lang.Object r10 = r0.f143889l
                java.util.Map r10 = (java.util.Map) r10
                java.lang.Object r10 = r0.f143888k
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                java.lang.Object r10 = r0.f143886i
                java.util.Iterator r10 = (java.util.Iterator) r10
                java.lang.Object r11 = r0.f143885h
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.lang.Object r12 = r0.f143884g
                java.util.Map r12 = (java.util.Map) r12
                java.lang.Object r13 = r0.f143883f
                java.util.Map r13 = (java.util.Map) r13
                java.lang.Object r14 = r0.f143882e
                jG.b r14 = (jG.C17400b) r14
                java.lang.Object r15 = r0.f143881d
                java.util.Map r15 = (java.util.Map) r15
                java.lang.Object r3 = r0.f143880c
                java.util.Map r3 = (java.util.Map) r3
                XH.y.b(r27)
                r17 = r9
                r5 = r12
                r9 = 2
                r12 = r7
                r7 = r1
                r1 = r27
                goto L_0x0113
            L_0x0059:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0061:
                java.lang.Object r2 = r0.f143880c
                java.util.Map r2 = (java.util.Map) r2
                XH.y.b(r27)
                r2 = r27
                goto L_0x0089
            L_0x006b:
                XH.y.b(r27)
                com.sugarcube.app.base.data.database.CachedCatalogItem r2 = r0.f143901x
                java.util.Map r2 = r2.getCombinableMap()
                if (r2 != 0) goto L_0x008b
                jG.b r3 = r0.f143902y
                com.sugarcube.app.base.data.database.CachedCatalogItem r6 = r0.f143901x
                com.sugarcube.core.network.models.CatalogItem r6 = r6.getCatalogItem()
                r0.f143880c = r2
                r0.f143900w = r4
                java.lang.Object r2 = r3.e(r6, r0)
                if (r2 != r1) goto L_0x0089
                return r1
            L_0x0089:
                java.util.Map r2 = (java.util.Map) r2
            L_0x008b:
                jG.b r3 = r0.f143902y
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                int r6 = r2.size()
                int r6 = YH.X.e(r6)
                r4.<init>(r6)
                java.util.Set r6 = r2.entrySet()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r7 = r6.iterator()
                r13 = r2
                r15 = r13
                r14 = r3
                r8 = r4
                r11 = r6
                r10 = r7
                r4 = 0
                r6 = 0
                r3 = r15
                r2 = 0
            L_0x00ae:
                boolean r7 = r10.hasNext()
                if (r7 == 0) goto L_0x013d
                java.lang.Object r7 = r10.next()
                r9 = r7
                java.util.Map$Entry r9 = (java.util.Map.Entry) r9
                java.lang.Object r12 = r9.getKey()
                java.lang.Object r16 = r9.getValue()
                r5 = r16
                com.sugarcube.app.base.data.database.CachedCatalogItem r5 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r5
                if (r5 == 0) goto L_0x0133
                r16 = r1
                com.sugarcube.decorate.v2.internal.manager.model.ModelRepository r1 = r14.f143848b
                com.sugarcube.core.network.models.CatalogItem r17 = r5.getCatalogItem()
                r27 = r1
                android.net.Uri r1 = r17.getAssetUrl()
                r0.f143880c = r3
                r0.f143881d = r15
                r0.f143882e = r14
                r0.f143883f = r13
                r0.f143884g = r8
                r0.f143885h = r11
                r0.f143886i = r10
                r0.f143887j = r7
                r0.f143888k = r9
                r0.f143889l = r8
                r0.f143890m = r9
                r0.f143891n = r5
                r0.f143892o = r5
                r0.f143893p = r8
                r0.f143894q = r12
                r0.f143895r = r6
                r0.f143896s = r4
                r0.f143897t = r2
                r7 = 0
                r0.f143898u = r7
                r0.f143899v = r7
                r9 = 2
                r0.f143900w = r9
                r7 = r27
                java.lang.Object r1 = r7.fetchAssetFile(r1, r0)
                r7 = r16
                if (r1 != r7) goto L_0x0110
                return r7
            L_0x0110:
                r17 = r5
                r5 = r8
            L_0x0113:
                java.io.File r1 = (java.io.File) r1
                if (r1 != 0) goto L_0x011e
                java.io.File r1 = new java.io.File
                java.lang.String r9 = ""
                r1.<init>(r9)
            L_0x011e:
                r18 = r1
                r24 = 62
                r25 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                com.sugarcube.app.base.data.database.CachedCatalogItem r1 = com.sugarcube.app.base.data.database.CachedCatalogItem.copy$default(r17, r18, r19, r20, r21, r22, r23, r24, r25)
                goto L_0x0136
            L_0x0133:
                r7 = r1
                r1 = 0
                r5 = r8
            L_0x0136:
                r8.put(r12, r1)
                r8 = r5
                r1 = r7
                goto L_0x00ae
            L_0x013d:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: jG.C17400b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "<anonymous>", "(LQJ/Q;)Ljava/util/Map;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelManagerImpl$fetchCombinableData$2", f = "ModelManagerImpl.kt", l = {113, 115}, m = "invokeSuspend")
    /* renamed from: jG.b$f */
    static final class f extends l implements p<Q, C17164e<? super Map<String, CachedCatalogItem>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f143903c;

        /* renamed from: d  reason: collision with root package name */
        int f143904d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CatalogItem f143905e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17400b f143906f;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "size", "variant"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelManagerImpl$fetchCombinableData$2$1", f = "ModelManagerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: jG.b$f$a */
        static final class a extends l implements nI.q<String, String, C17164e<? super Map<String, CachedCatalogItem>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f143907c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f143908d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f143909e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Result<Map<String, Map<String, CatalogItem>>> f143910f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Result<? extends Map<String, ? extends Map<String, CatalogItem>>> result, C17164e<? super a> eVar) {
                super(3, eVar);
                this.f143910f = result;
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f143907c == 0) {
                    y.b(obj);
                    Map map = (Map) ((Map) ((Result.Success) this.f143910f).getData()).get(new SalesDressedBedDataKey((String) this.f143908d, (String) this.f143909e).toString());
                    if (map == null) {
                        return null;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        CatalogItem catalogItem = (CatalogItem) entry.getValue();
                        linkedHashMap.put(key, catalogItem != null ? new CachedCatalogItem((File) null, (File) null, false, (CachedCatalogPage) null, (Map) null, catalogItem, 31, (DefaultConstructorMarker) null) : null);
                    }
                    return X.z(linkedHashMap);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(String str, String str2, C17164e<? super Map<String, CachedCatalogItem>> eVar) {
                a aVar = new a(this.f143910f, eVar);
                aVar.f143908d = str;
                aVar.f143909e = str2;
                return aVar.invokeSuspend(C16807N.f139792a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CatalogItem catalogItem, C17400b bVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f143905e = catalogItem;
            this.f143906f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f143905e, this.f143906f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Map<String, CachedCatalogItem>> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f143904d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r0 = r6.f143903c
                com.sugarcube.app.base.data.Result r0 = (com.sugarcube.app.base.data.Result) r0
                XH.y.b(r7)
                goto L_0x0078
            L_0x0016:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001e:
                XH.y.b(r7)
                goto L_0x0055
            L_0x0022:
                XH.y.b(r7)
                com.sugarcube.core.network.models.CatalogItem r7 = r6.f143905e
                java.lang.Boolean r7 = r7.getHidden()
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r1)
                if (r7 != 0) goto L_0x0092
                com.sugarcube.core.network.models.CatalogItem r7 = r6.f143905e
                boolean r7 = r7.isCombinable()
                if (r7 == 0) goto L_0x0092
                com.sugarcube.core.network.models.CatalogItem r7 = r6.f143905e
                boolean r7 = r7.isCombinableParent()
                if (r7 == 0) goto L_0x0092
                jG.b r7 = r6.f143906f
                com.sugarcube.decorate.v2.internal.manager.model.ModelRepository r7 = r7.f143848b
                r6.f143904d = r3
                r1 = 3
                java.lang.Object r7 = r7.fetchCombinableData(r1, r6)
                if (r7 != r0) goto L_0x0055
                return r0
            L_0x0055:
                com.sugarcube.app.base.data.Result r7 = (com.sugarcube.app.base.data.Result) r7
                boolean r1 = r7 instanceof com.sugarcube.app.base.data.Result.Success
                if (r1 == 0) goto L_0x0082
                com.sugarcube.core.network.models.CatalogItem r1 = r6.f143905e
                java.lang.String r1 = r1.getCombinableSize()
                com.sugarcube.core.network.models.CatalogItem r3 = r6.f143905e
                java.lang.String r3 = r3.getCombinableVariant()
                jG.b$f$a r4 = new jG.b$f$a
                r5 = 0
                r4.<init>(r7, r5)
                r6.f143903c = r7
                r6.f143904d = r2
                java.lang.Object r7 = NF.C13291e.d(r1, r3, r4, r6)
                if (r7 != r0) goto L_0x0078
                return r0
            L_0x0078:
                java.util.Map r7 = (java.util.Map) r7
                if (r7 != 0) goto L_0x0097
                java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                r7.<init>()
                goto L_0x0097
            L_0x0082:
                boolean r7 = r7 instanceof com.sugarcube.app.base.data.Result.Error
                if (r7 == 0) goto L_0x008c
                java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                r7.<init>()
                goto L_0x0097
            L_0x008c:
                XH.t r7 = new XH.t
                r7.<init>()
                throw r7
            L_0x0092:
                java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                r7.<init>()
            L_0x0097:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jG.C17400b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "Lcom/sugarcube/app/base/data/AssetItem;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelManagerImpl$fetchDecorationAssets$2", f = "ModelManagerImpl.kt", l = {78}, m = "invokeSuspend")
    /* renamed from: jG.b$g */
    static final class g extends l implements p<Q, C17164e<? super List<? extends AssetItem>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f143911c;

        /* renamed from: d  reason: collision with root package name */
        Object f143912d;

        /* renamed from: e  reason: collision with root package name */
        Object f143913e;

        /* renamed from: f  reason: collision with root package name */
        Object f143914f;

        /* renamed from: g  reason: collision with root package name */
        Object f143915g;

        /* renamed from: h  reason: collision with root package name */
        Object f143916h;

        /* renamed from: i  reason: collision with root package name */
        Object f143917i;

        /* renamed from: j  reason: collision with root package name */
        Object f143918j;

        /* renamed from: k  reason: collision with root package name */
        int f143919k;

        /* renamed from: l  reason: collision with root package name */
        int f143920l;

        /* renamed from: m  reason: collision with root package name */
        int f143921m;

        /* renamed from: n  reason: collision with root package name */
        private /* synthetic */ Object f143922n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C17400b f143923o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Scene f143924p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/app/base/data/AssetItem;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/app/base/data/AssetItem;"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelManagerImpl$fetchDecorationAssets$2$1$1", f = "ModelManagerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: jG.b$g$a */
        static final class a extends l implements p<Q, C17164e<? super AssetItem>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f143925c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AssetCache f143926d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Uri f143927e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ N f143928f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ N f143929g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(AssetCache assetCache, Uri uri, N n10, N n11, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f143926d = assetCache;
                this.f143927e = uri;
                this.f143928f = n10;
                this.f143929g = n11;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f143926d, this.f143927e, this.f143928f, this.f143929g, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super AssetItem> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                int responseCode;
                C17187b.f();
                if (this.f143925c == 0) {
                    y.b(obj);
                    AssetItem value = this.f143926d.put(this.f143927e).getValue();
                    AssetItem a10 = value != null ? C17403e.a(value) : null;
                    N n10 = this.f143928f;
                    N n11 = this.f143929g;
                    if (a10 != null && a10.getDownloadTimeMS() > 0 && 200 <= (responseCode = a10.getResponseCode()) && responseCode < 300) {
                        n10.f144347a += a10.getDownloadTimeMS();
                        n11.f144347a += a10.getFile().length();
                    }
                    if (a10 != null) {
                        return a10;
                    }
                    throw new IOException("Failed to fetch asset: " + this.f143927e);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C17400b bVar, Scene scene, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f143923o = bVar;
            this.f143924p = scene;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f143923o, this.f143924p, eVar);
            gVar.f143922n = obj;
            return gVar;
        }

        public final Object invoke(Q q10, C17164e<? super List<AssetItem>> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f143921m;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f143922n;
                AssetCache b10 = this.f143923o.f(this.f143924p.getSceneUuid(), this.f143924p.getJobId());
                N n10 = new N();
                N n11 = new N();
                List<Uri> b11 = C17403e.b(this.f143924p);
                Iterable iterable = b11;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(C16314k.b(q10, (C17168i) null, (T) null, new a(b10, (Uri) it.next(), n10, n11, (C17164e<? super a>) null), 3, (Object) null));
                    b11 = b11;
                    arrayList = arrayList2;
                    iterable = iterable;
                    it = it;
                }
                ArrayList arrayList3 = arrayList;
                Iterator it2 = it;
                Iterable iterable2 = iterable;
                this.f143922n = q10;
                this.f143911c = b10;
                this.f143912d = n10;
                this.f143913e = n11;
                this.f143914f = b11;
                this.f143915g = iterable2;
                this.f143916h = iterable2;
                this.f143917i = arrayList3;
                this.f143918j = it2;
                this.f143919k = 0;
                this.f143920l = 0;
                this.f143921m = 1;
                obj2 = C16304f.a(arrayList3, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Iterator it3 = (Iterator) this.f143918j;
                Collection collection = (Collection) this.f143917i;
                Iterable iterable3 = (Iterable) this.f143916h;
                Iterable iterable4 = (Iterable) this.f143915g;
                List list = (List) this.f143914f;
                N n12 = (N) this.f143913e;
                N n13 = (N) this.f143912d;
                AssetCache assetCache = (AssetCache) this.f143911c;
                Q q11 = (Q) this.f143922n;
                try {
                    y.b(obj);
                    obj2 = obj;
                } catch (IOException e10) {
                    UUID sceneUuid = this.f143924p.getSceneUuid();
                    Log.e("ModelManagerImpl", "Error fetching decoration assets for scene: " + sceneUuid, e10);
                    return C16877v.n();
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (List) obj2;
        }
    }

    public C17400b(C13309a aVar, ModelRepository modelRepository, C17399a aVar2) {
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(modelRepository, "modelRepository");
        C17542s.j(aVar2, "fileWriter");
        this.f143847a = aVar;
        this.f143848b = modelRepository;
        this.f143849c = aVar2;
    }

    private final Object d(CachedCatalogItem cachedCatalogItem, C17164e<? super Map<String, CachedCatalogItem>> eVar) {
        return C16310i.g(C16311i0.b(), new e(cachedCatalogItem, this, (C17164e<? super e>) null), eVar);
    }

    /* access modifiers changed from: private */
    public final Object e(CatalogItem catalogItem, C17164e<? super Map<String, CachedCatalogItem>> eVar) {
        return C16310i.g(C16311i0.b(), new f(catalogItem, this, (C17164e<? super f>) null), eVar);
    }

    /* access modifiers changed from: private */
    public final AssetCache f(UUID uuid, UUID uuid2) {
        return new AssetCache(g(uuid, uuid2), 0, 2, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r5 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File g(java.util.UUID r4, java.util.UUID r5) {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            OE.a r1 = r3.f143847a
            java.io.File r1 = r1.d()
            java.lang.String r2 = "sugarcube-cache/"
            r0.<init>(r1, r2)
            if (r5 == 0) goto L_0x0025
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            if (r5 != 0) goto L_0x002e
        L_0x0025:
            java.lang.String r5 = r4.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r5, r4)
        L_0x002e:
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jG.C17400b.g(java.util.UUID, java.util.UUID):java.io.File");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object cacheCatalogItems(com.sugarcube.app.base.data.database.CachedCompiledComposition r20, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCompiledComposition> r21) {
        /*
            r19 = this;
            r0 = r21
            boolean r1 = r0 instanceof jG.C17400b.C3513b
            if (r1 == 0) goto L_0x0017
            r1 = r0
            jG.b$b r1 = (jG.C17400b.C3513b) r1
            int r2 = r1.f143868u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f143868u = r2
            r2 = r19
            goto L_0x001e
        L_0x0017:
            jG.b$b r1 = new jG.b$b
            r2 = r19
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.f143866s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.f143868u
            r6 = 1
            if (r5 == 0) goto L_0x007e
            if (r5 != r6) goto L_0x0076
            int r0 = r1.f143864q
            int r5 = r1.f143863p
            int r8 = r1.f143862o
            java.lang.Object r9 = r1.f143861n
            com.sugarcube.app.base.data.database.CachedCompiledComposition r9 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r9
            java.lang.Object r10 = r1.f143860m
            com.sugarcube.core.network.models.CatalogItem r10 = (com.sugarcube.core.network.models.CatalogItem) r10
            java.lang.Object r10 = r1.f143859l
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r1.f143857j
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r1.f143856i
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r13 = r1.f143855h
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r1.f143854g
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r1.f143853f
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r6 = r1.f143852e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r1.f143851d
            com.sugarcube.app.base.data.database.CachedCompiledComposition r7 = (com.sugarcube.app.base.data.database.CachedCompiledComposition) r7
            r20 = r0
            java.lang.Object r0 = r1.f143850c
            jG.b r0 = (jG.C17400b) r0
            XH.y.b(r3)
            r2 = r0
            r0 = r7
            r16 = r15
            r7 = r5
            r15 = r14
            r5 = r4
            r14 = r13
            r4 = r20
            r13 = r12
            r12 = r10
            r10 = 1
            r18 = r6
            r6 = r1
            r1 = r18
            goto L_0x0111
        L_0x0076:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x007e:
            XH.y.b(r3)
            com.sugarcube.core.network.models.CompiledComposition r3 = r20.getCompiledComposition()
            java.util.List r3 = r3.getCatalogItems()
            if (r3 != 0) goto L_0x008c
            return r20
        L_0x008c:
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 10
            int r6 = YH.C16877v.y(r5, r6)
            int r6 = YH.X.e(r6)
            r7 = 16
            int r6 = tI.C17978n.e(r6, r7)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r6)
            java.util.Iterator r8 = r5.iterator()
            r9 = r20
            r15 = r3
            r13 = r5
            r14 = r13
            r12 = r7
            r11 = r8
            r5 = 0
            r8 = 0
            r3 = r2
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r9
        L_0x00b6:
            boolean r10 = r11.hasNext()
            if (r10 == 0) goto L_0x0139
            java.lang.Object r10 = r11.next()
            r2 = r10
            com.sugarcube.core.network.models.CatalogItem r2 = (com.sugarcube.core.network.models.CatalogItem) r2
            r17 = r4
            OE.a r4 = r3.f143847a
            QJ.M r4 = r4.e()
            r20 = r4
            jG.b$c r4 = new jG.b$c
            r21 = r5
            r5 = 0
            r4.<init>(r3, r2, r5)
            r6.f143850c = r3
            r6.f143851d = r0
            r6.f143852e = r1
            r6.f143853f = r15
            r6.f143854g = r14
            r6.f143855h = r13
            r6.f143856i = r12
            r6.f143857j = r11
            r6.f143858k = r10
            r6.f143859l = r12
            r6.f143860m = r2
            r6.f143861n = r9
            r6.f143862o = r8
            r6.f143863p = r7
            r2 = r21
            r6.f143864q = r2
            r5 = 0
            r6.f143865r = r5
            r10 = 1
            r6.f143868u = r10
            r5 = r20
            java.lang.Object r4 = QJ.C16310i.g(r5, r4, r6)
            r5 = r17
            if (r4 != r5) goto L_0x0106
            return r5
        L_0x0106:
            r16 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r18 = r4
            r4 = r2
            r2 = r3
            r3 = r18
        L_0x0111:
            com.sugarcube.app.base.data.database.CachedCatalogItem r3 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r3
            int r17 = r3.getId()
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.b.e(r17)
            XH.v r3 = XH.C16796C.a(r10, r3)
            java.lang.Object r10 = r3.c()
            java.lang.Object r3 = r3.d()
            r12.put(r10, r3)
            r3 = r2
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r2 = r19
            r18 = r5
            r5 = r4
            r4 = r18
            goto L_0x00b6
        L_0x0139:
            r13 = 5
            r14 = 0
            r10 = 0
            r0 = 0
            r11 = r12
            r12 = r0
            com.sugarcube.app.base.data.database.CachedCompiledComposition r0 = com.sugarcube.app.base.data.database.CachedCompiledComposition.copy$default(r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jG.C17400b.cacheCatalogItems(com.sugarcube.app.base.data.database.CachedCompiledComposition, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: dI.e<? super com.sugarcube.app.base.data.database.CachedCatalogItem>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087 A[Catch:{ Exception -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba A[Catch:{ Exception -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogItemModel(com.sugarcube.app.base.data.database.CachedCatalogItem r13, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogItem> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof jG.C17400b.d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            jG.b$d r0 = (jG.C17400b.d) r0
            int r1 = r0.f143879j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143879j = r1
            goto L_0x0018
        L_0x0013:
            jG.b$d r0 = new jG.b$d
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f143877h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f143879j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0066
            if (r3 == r5) goto L_0x004f
            if (r3 != r4) goto L_0x0047
            java.lang.Object r13 = r0.f143876g
            java.io.File r13 = (java.io.File) r13
            java.lang.Object r13 = r0.f143875f
            java.io.File r13 = (java.io.File) r13
            java.lang.Object r14 = r0.f143874e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f143873d
            com.sugarcube.app.base.data.database.CachedCatalogItem r14 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r14
            java.lang.Object r0 = r0.f143872c
            jG.b r0 = (jG.C17400b) r0
            XH.y.b(r1)     // Catch:{ Exception -> 0x0044 }
            r11 = r1
            r1 = r13
            r13 = r14
            r14 = r11
            goto L_0x00a6
        L_0x0044:
            r13 = move-exception
            goto L_0x00d9
        L_0x0047:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x004f:
            java.lang.Object r13 = r0.f143874e
            r14 = r13
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r13 = r0.f143873d
            com.sugarcube.app.base.data.database.CachedCatalogItem r13 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r13
            java.lang.Object r3 = r0.f143872c
            jG.b r3 = (jG.C17400b) r3
            XH.y.b(r1)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0083
        L_0x0060:
            r14 = move-exception
            r11 = r14
            r14 = r13
            r13 = r11
            goto L_0x00d9
        L_0x0066:
            XH.y.b(r1)
            com.sugarcube.decorate.v2.internal.manager.model.ModelRepository r1 = r12.f143848b     // Catch:{ Exception -> 0x0060 }
            com.sugarcube.core.network.models.CatalogItem r3 = r13.getCatalogItem()     // Catch:{ Exception -> 0x0060 }
            android.net.Uri r3 = r3.getAssetUrl()     // Catch:{ Exception -> 0x0060 }
            r0.f143872c = r12     // Catch:{ Exception -> 0x0060 }
            r0.f143873d = r13     // Catch:{ Exception -> 0x0060 }
            r0.f143874e = r14     // Catch:{ Exception -> 0x0060 }
            r0.f143879j = r5     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r1 = r1.fetchAssetFile(r3, r0)     // Catch:{ Exception -> 0x0060 }
            if (r1 != r2) goto L_0x0082
            return r2
        L_0x0082:
            r3 = r12
        L_0x0083:
            java.io.File r1 = (java.io.File) r1     // Catch:{ Exception -> 0x0060 }
            if (r1 == 0) goto L_0x00ba
            boolean r5 = r13.isCombinable()     // Catch:{ Exception -> 0x0060 }
            if (r5 == 0) goto L_0x00ab
            boolean r5 = r13.isCombinableParent()     // Catch:{ Exception -> 0x0060 }
            if (r5 == 0) goto L_0x00ab
            r0.f143872c = r3     // Catch:{ Exception -> 0x0060 }
            r0.f143873d = r13     // Catch:{ Exception -> 0x0060 }
            r0.f143874e = r14     // Catch:{ Exception -> 0x0060 }
            r0.f143875f = r1     // Catch:{ Exception -> 0x0060 }
            r0.f143876g = r1     // Catch:{ Exception -> 0x0060 }
            r0.f143879j = r4     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r14 = r3.d(r13, r0)     // Catch:{ Exception -> 0x0060 }
            if (r14 != r2) goto L_0x00a6
            return r2
        L_0x00a6:
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ Exception -> 0x0060 }
        L_0x00a8:
            r7 = r14
            r3 = r1
            goto L_0x00ad
        L_0x00ab:
            r14 = 0
            goto L_0x00a8
        L_0x00ad:
            r9 = 46
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r2 = r13
            com.sugarcube.app.base.data.database.CachedCatalogItem r13 = com.sugarcube.app.base.data.database.CachedCatalogItem.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0060 }
            return r13
        L_0x00ba:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0060 }
            com.sugarcube.core.network.models.CatalogItem r0 = r13.getCatalogItem()     // Catch:{ Exception -> 0x0060 }
            android.net.Uri r0 = r0.getAssetUrl()     // Catch:{ Exception -> 0x0060 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0060 }
            r1.<init>()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = "Failed to fetch the main model file for URL: "
            r1.append(r2)     // Catch:{ Exception -> 0x0060 }
            r1.append(r0)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0060 }
            r14.<init>(r0)     // Catch:{ Exception -> 0x0060 }
            throw r14     // Catch:{ Exception -> 0x0060 }
        L_0x00d9:
            java.io.IOException r0 = new java.io.IOException
            com.sugarcube.core.network.models.CatalogItem r14 = r14.getCatalogItem()
            android.net.Uri r14 = r14.getAssetUrl()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not fetch catalog item model for url="
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jG.C17400b.fetchCatalogItemModel(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    public Object fetchDecorationAssets(Scene scene, C17164e<? super List<AssetItem>> eVar) {
        return C16310i.g(this.f143847a.e(), new g(this, scene, (C17164e<? super g>) null), eVar);
    }

    public String writeGltfMapToFile(UUID uuid, UUID uuid2, UUID uuid3, Map<String, ? extends Object> map) {
        C17542s.j(uuid, "sceneUuid");
        C17542s.j(uuid2, "compositionUuid");
        C17542s.j(map, "gltfMap");
        return this.f143849c.a(g(uuid, uuid3), uuid2, map);
    }
}
