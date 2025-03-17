package jG;

import OE.C13309a;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import android.net.Uri;
import com.sugarcube.app.base.data.AssetCache;
import com.sugarcube.app.base.data.AssetItem;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.decorate.v2.internal.manager.model.ModelRepository;
import dI.C17164e;
import eI.C17187b;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\u0010\u001a*\u0012&\u0012$\u0012\u0004\u0012\u00020\f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0002`\u000e0\u000bj\u0002`\u000f0\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"LjG/c;", "Lcom/sugarcube/decorate/v2/internal/manager/model/ModelRepository;", "LOE/a;", "appEnvironment", "Lcom/sugarcube/app/base/network/NetworkClient;", "networkClient", "<init>", "(LOE/a;Lcom/sugarcube/app/base/network/NetworkClient;)V", "", "version", "Lcom/sugarcube/app/base/data/Result;", "", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "Lcom/sugarcube/core/network/models/CombinableMap;", "Lcom/sugarcube/core/network/models/SalesDressedBedData;", "fetchCombinableData", "(ILdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "Ljava/io/File;", "fetchAssetFile", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/api/NetworkAPIs;", "a", "Lcom/sugarcube/core/network/api/NetworkAPIs;", "networkAPIs", "Lcom/sugarcube/app/base/data/AssetCache;", "b", "Lcom/sugarcube/app/base/data/AssetCache;", "cache", "c", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jG.c  reason: case insensitive filesystem */
public final class C17401c implements ModelRepository {

    /* renamed from: c  reason: collision with root package name */
    public static final a f143930c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f143931d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final NetworkAPIs f143932a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AssetCache f143933b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LjG/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DEFAULT_ROOT_DIR", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jG.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Ljava/io/File;", "<anonymous>", "(LQJ/Q;)Ljava/io/File;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelRepositoryImpl$fetchAssetFile$2", f = "ModelRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: jG.c$b */
    static final class b extends l implements p<Q, C17164e<? super File>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f143934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Uri f143935d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17401c f143936e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Uri uri, C17401c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f143935d = uri;
            this.f143936e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f143935d, this.f143936e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super File> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            AssetItem value;
            AssetItem a10;
            C17187b.f();
            if (this.f143934c == 0) {
                y.b(obj);
                Uri uri = this.f143935d;
                if (uri == null || (value = this.f143936e.f143933b.put(uri).getValue()) == null || (a10 = C17403e.a(value)) == null) {
                    return null;
                }
                return a10.getFile();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.manager.model.ModelRepositoryImpl", f = "ModelRepository.kt", l = {64}, m = "fetchCombinableData")
    /* renamed from: jG.c$c  reason: collision with other inner class name */
    static final class C3514c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f143937c;

        /* renamed from: d  reason: collision with root package name */
        Object f143938d;

        /* renamed from: e  reason: collision with root package name */
        int f143939e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f143940f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17401c f143941g;

        /* renamed from: h  reason: collision with root package name */
        int f143942h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3514c(C17401c cVar, C17164e<? super C3514c> eVar) {
            super(eVar);
            this.f143941g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143940f = obj;
            this.f143942h |= Integer.MIN_VALUE;
            return this.f143941g.fetchCombinableData(0, this);
        }
    }

    public C17401c(C13309a aVar, NetworkClient networkClient) {
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(networkClient, "networkClient");
        this.f143932a = networkClient.api();
        this.f143933b = new AssetCache(new File(new File(aVar.d(), "sugarcube-cache/"), "models"), 0, 2, (DefaultConstructorMarker) null);
    }

    public Object fetchAssetFile(Uri uri, C17164e<? super File> eVar) {
        return C16310i.g(C16311i0.b(), new b(uri, this, (C17164e<? super b>) null), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCombinableData(int r6, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.sugarcube.core.network.models.CatalogItem>>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jG.C17401c.C3514c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            jG.c$c r0 = (jG.C17401c.C3514c) r0
            int r1 = r0.f143942h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143942h = r1
            goto L_0x0018
        L_0x0013:
            jG.c$c r0 = new jG.c$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f143940f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f143942h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            int r6 = r0.f143939e
            java.lang.Object r7 = r0.f143938d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f143937c
            jG.c r7 = (jG.C17401c) r7
            XH.y.b(r1)     // Catch:{ IOException -> 0x0033 }
            goto L_0x0051
        L_0x0033:
            r7 = move-exception
            goto L_0x006b
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            com.sugarcube.core.network.api.NetworkAPIs r1 = r5.f143932a     // Catch:{ IOException -> 0x0033 }
            r0.f143937c = r5     // Catch:{ IOException -> 0x0033 }
            r0.f143938d = r7     // Catch:{ IOException -> 0x0033 }
            r0.f143939e = r6     // Catch:{ IOException -> 0x0033 }
            r0.f143942h = r4     // Catch:{ IOException -> 0x0033 }
            java.lang.Object r1 = r1.fetchSalesDressedBedData(r6, r0)     // Catch:{ IOException -> 0x0033 }
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            QL.x r1 = (QL.x) r1     // Catch:{ IOException -> 0x0033 }
            java.lang.Object r7 = r1.a()     // Catch:{ IOException -> 0x0033 }
            com.sugarcube.core.network.models.SalesDressedBedDataResponse r7 = (com.sugarcube.core.network.models.SalesDressedBedDataResponse) r7     // Catch:{ IOException -> 0x0033 }
            if (r7 == 0) goto L_0x0061
            java.util.Map r7 = r7.getData()     // Catch:{ IOException -> 0x0033 }
            if (r7 != 0) goto L_0x0065
        L_0x0061:
            java.util.Map r7 = YH.X.j()     // Catch:{ IOException -> 0x0033 }
        L_0x0065:
            com.sugarcube.app.base.data.Result$Success r0 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ IOException -> 0x0033 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0033 }
            goto L_0x0088
        L_0x006b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to fetch combinable data for version "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ModelRepositoryImpl"
            android.util.Log.e(r0, r6, r7)
            com.sugarcube.app.base.data.Result$Error r0 = new com.sugarcube.app.base.data.Result$Error
            r6 = 2
            r1 = 0
            r0.<init>(r7, r1, r6, r1)
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jG.C17401c.fetchCombinableData(int, dI.e):java.lang.Object");
    }
}
