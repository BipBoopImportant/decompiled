package hu;

import EB.C12831c;
import FB.C12860a;
import FB.C12863d;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Ww.w;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.location.LocationManager;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.r;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu.C11571d;
import nI.p;
import nI.q;
import nt.C11674a;
import pu.C11777a;
import pu.C11778b;
import pu.C11779c;
import qu.C11817a;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 !2\u00020\u0001:\u00015BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH@¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001bH@¢\u0006\u0004\b!\u0010\u001aJ%\u0010%\u001a\u0004\u0018\u00010\u001d*\b\u0012\u0004\u0012\u00020\u001d0\"2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J$\u0010(\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\"\u0012\u0006\u0012\u0004\u0018\u00010#0'H@¢\u0006\u0004\b(\u0010\u001aJ\u000f\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00182\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010ER\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010FR\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0G8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010H¨\u0006J"}, d2 = {"Lhu/a;", "Lpu/a;", "Lap/d;", "distanceCalculator", "Llu/d;", "enableStoreModeUseCase", "Lap/f;", "getUserLocationUseCase", "Landroid/location/LocationManager;", "locationManager", "LFB/a;", "localStoreSelectionRepository", "Lnt/a;", "storeModeLocalDataSource", "LFB/d;", "storeRepository", "LWw/w;", "verifyPermissionUseCase", "Ltf/a;", "killSwitchRepository", "Lqu/a;", "storeModeAnalytics", "<init>", "(Lap/d;Llu/d;Lap/f;Landroid/location/LocationManager;LFB/a;Lnt/a;LFB/d;LWw/w;Ltf/a;Lqu/a;)V", "LXH/N;", "i", "(LdI/e;)Ljava/lang/Object;", "", "o", "LEB/c;", "closestStore", "n", "(LEB/c;LdI/e;)Ljava/lang/Object;", "l", "", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "currentLocation", "j", "(Ljava/util/List;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)LEB/c;", "LXH/v;", "k", "m", "()Z", "LTJ/P;", "Lpu/b;", "p", "()LTJ/P;", "LTJ/g;", "Lpu/c;", "b", "()LTJ/g;", "Landroidx/lifecycle/y;", "lifecycleOwner", "a", "(Landroidx/lifecycle/y;)V", "Lap/d;", "Llu/d;", "c", "Lap/f;", "d", "Landroid/location/LocationManager;", "e", "LFB/a;", "f", "Lnt/a;", "g", "LFB/d;", "h", "LWw/w;", "Ltf/a;", "Lqu/a;", "LTJ/B;", "LTJ/B;", "userCloseToStoreFlow", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hu.a  reason: case insensitive filesystem */
public final class C11383a implements C11777a {

    /* renamed from: l  reason: collision with root package name */
    public static final C2213a f98161l = new C2213a((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f98162m = 8;

    /* renamed from: a  reason: collision with root package name */
    private final ap.d f98163a;

    /* renamed from: b  reason: collision with root package name */
    private final C11571d f98164b;

    /* renamed from: c  reason: collision with root package name */
    private final ap.f f98165c;

    /* renamed from: d  reason: collision with root package name */
    private final LocationManager f98166d;

    /* renamed from: e  reason: collision with root package name */
    private final C12860a f98167e;

    /* renamed from: f  reason: collision with root package name */
    private final C11674a f98168f;

    /* renamed from: g  reason: collision with root package name */
    private final C12863d f98169g;

    /* renamed from: h  reason: collision with root package name */
    private final w f98170h;

    /* renamed from: i  reason: collision with root package name */
    private final C10253a f98171i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C11817a f98172j;

    /* renamed from: k  reason: collision with root package name */
    private final C16505B<C11778b> f98173k = C16521S.a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hu.a$a  reason: collision with other inner class name */
    public static final class C2213a {
        public /* synthetic */ C2213a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2213a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storemode.EnableStoreModeWhenNearbyStoreIntegrationImpl", f = "EnableStoreModeWhenNearbyStoreIntegrationImpl.kt", l = {84, 87, 92}, m = "checkNearbyStore")
    /* renamed from: hu.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f98174c;

        /* renamed from: d  reason: collision with root package name */
        Object f98175d;

        /* renamed from: e  reason: collision with root package name */
        Object f98176e;

        /* renamed from: f  reason: collision with root package name */
        Object f98177f;

        /* renamed from: g  reason: collision with root package name */
        Object f98178g;

        /* renamed from: h  reason: collision with root package name */
        Object f98179h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f98180i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C11383a f98181j;

        /* renamed from: k  reason: collision with root package name */
        int f98182k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C11383a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f98181j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98180i = obj;
            this.f98182k |= Integer.MIN_VALUE;
            return this.f98181j.i(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hu.a$c */
    public static final class c implements C16532g<LocationLatLng> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f98183a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hu.a$c$a  reason: collision with other inner class name */
        public static final class C2214a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f98184a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storemode.EnableStoreModeWhenNearbyStoreIntegrationImpl$getStoresAndCurrentLocation$$inlined$map$1$2", f = "EnableStoreModeWhenNearbyStoreIntegrationImpl.kt", l = {50}, m = "emit")
            /* renamed from: hu.a$c$a$a  reason: collision with other inner class name */
            public static final class C2215a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f98185c;

                /* renamed from: d  reason: collision with root package name */
                int f98186d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2214a f98187e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2215a(C2214a aVar, C17164e eVar) {
                    super(eVar);
                    this.f98187e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f98185c = obj;
                    this.f98186d |= Integer.MIN_VALUE;
                    return this.f98187e.emit((Object) null, this);
                }
            }

            public C2214a(C16533h hVar) {
                this.f98184a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof hu.C11383a.c.C2214a.C2215a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    hu.a$c$a$a r0 = (hu.C11383a.c.C2214a.C2215a) r0
                    int r1 = r0.f98186d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f98186d = r1
                    goto L_0x0018
                L_0x0013:
                    hu.a$c$a$a r0 = new hu.a$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f98185c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f98186d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004c
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f98184a
                    XH.x r5 = (XH.x) r5
                    java.lang.Object r5 = r5.j()
                    boolean r2 = XH.x.g(r5)
                    if (r2 == 0) goto L_0x0043
                    r5 = 0
                L_0x0043:
                    r0.f98186d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: hu.C11383a.c.C2214a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f98183a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f98183a.collect(new C2214a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storemode.EnableStoreModeWhenNearbyStoreIntegrationImpl", f = "EnableStoreModeWhenNearbyStoreIntegrationImpl.kt", l = {155, 174}, m = "getStoresAndCurrentLocation")
    /* renamed from: hu.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f98188c;

        /* renamed from: d  reason: collision with root package name */
        Object f98189d;

        /* renamed from: e  reason: collision with root package name */
        Object f98190e;

        /* renamed from: f  reason: collision with root package name */
        Object f98191f;

        /* renamed from: g  reason: collision with root package name */
        Object f98192g;

        /* renamed from: h  reason: collision with root package name */
        Object f98193h;

        /* renamed from: i  reason: collision with root package name */
        int f98194i;

        /* renamed from: j  reason: collision with root package name */
        int f98195j;

        /* renamed from: k  reason: collision with root package name */
        int f98196k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f98197l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C11383a f98198m;

        /* renamed from: n  reason: collision with root package name */
        int f98199n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C11383a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f98198m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98197l = obj;
            this.f98199n |= Integer.MIN_VALUE;
            return this.f98198m.k(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storemode.EnableStoreModeWhenNearbyStoreIntegrationImpl$getStoresAndCurrentLocation$currentLocation$2", f = "EnableStoreModeWhenNearbyStoreIntegrationImpl.kt", l = {173}, m = "invokeSuspend")
    /* renamed from: hu.a$e */
    static final class e extends l implements q<C16533h<? super LocationLatLng>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f98200c;

        /* renamed from: d  reason: collision with root package name */
        Object f98201d;

        /* renamed from: e  reason: collision with root package name */
        Object f98202e;

        /* renamed from: f  reason: collision with root package name */
        Object f98203f;

        /* renamed from: g  reason: collision with root package name */
        Object f98204g;

        /* renamed from: h  reason: collision with root package name */
        Object f98205h;

        /* renamed from: i  reason: collision with root package name */
        Object f98206i;

        /* renamed from: j  reason: collision with root package name */
        Object f98207j;

        /* renamed from: k  reason: collision with root package name */
        Object f98208k;

        /* renamed from: l  reason: collision with root package name */
        int f98209l;

        /* renamed from: m  reason: collision with root package name */
        int f98210m;

        /* renamed from: n  reason: collision with root package name */
        int f98211n;

        /* renamed from: o  reason: collision with root package name */
        int f98212o;

        /* renamed from: p  reason: collision with root package name */
        int f98213p;

        /* renamed from: q  reason: collision with root package name */
        int f98214q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f98215r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f98216s;

        e(C17164e<? super e> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super LocationLatLng> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f98215r = hVar;
            eVar2.f98216s = th2;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f98214q
                r3 = 1
                if (r2 == 0) goto L_0x0042
                if (r2 != r3) goto L_0x003a
                java.lang.Object r1 = r0.f98207j
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f98206i
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f98205h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f98204g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f98203f
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f98202e
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f98201d
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f98200c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f98216s
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f98215r
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r20)
                goto L_0x010b
            L_0x003a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0042:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f98215r
                TJ.h r2 = (TJ.C16533h) r2
                java.lang.Object r4 = r0.f98216s
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                qv.e r11 = qv.e.WARN
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0060:
                boolean r6 = r5.hasNext()
                r13 = 0
                if (r6 == 0) goto L_0x0078
                java.lang.Object r6 = r5.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r11, r13)
                if (r7 == 0) goto L_0x0060
                r12.add(r6)
                goto L_0x0060
            L_0x0078:
                java.util.Iterator r14 = r12.iterator()
                r15 = 0
                r7 = r12
                r5 = r15
                r6 = r5
            L_0x0080:
                boolean r8 = r14.hasNext()
                java.lang.String r9 = "StoreModeIntegration"
                if (r8 == 0) goto L_0x00e2
                java.lang.Object r16 = r14.next()
                r7 = r16
                qv.b r7 = (qv.C11819b) r7
                if (r5 != 0) goto L_0x00a1
                java.lang.String r8 = "Failed to get location updates"
                java.lang.String r8 = qv.C11818a.a(r8, r4)
                if (r8 != 0) goto L_0x009d
                r7 = r16
                goto L_0x00e2
            L_0x009d:
                java.lang.String r5 = qv.C11820c.a(r8)
            L_0x00a1:
                r17 = r5
                if (r6 != 0) goto L_0x00ce
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r6 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r6, r3)
                if (r5 == 0) goto L_0x00b8
                java.lang.String r5 = "m"
                goto L_0x00ba
            L_0x00b8:
                java.lang.String r5 = "b"
            L_0x00ba:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                java.lang.String r5 = "|"
                r6.append(r5)
                r6.append(r9)
                java.lang.String r6 = r6.toString()
            L_0x00ce:
                r18 = r6
                r8 = 0
                r5 = r7
                r6 = r11
                r7 = r18
                r9 = r4
                r10 = r17
                r5.a(r6, r7, r8, r9, r10)
                r7 = r16
                r5 = r17
                r6 = r18
                goto L_0x0080
            L_0x00e2:
                r0.f98215r = r2
                r0.f98216s = r4
                r0.f98200c = r2
                r0.f98201d = r9
                r0.f98202e = r2
                r0.f98203f = r11
                r0.f98204g = r5
                r0.f98205h = r6
                r0.f98206i = r12
                r0.f98207j = r14
                r0.f98208k = r7
                r0.f98209l = r13
                r0.f98210m = r13
                r0.f98211n = r13
                r0.f98212o = r13
                r0.f98213p = r13
                r0.f98214q = r3
                java.lang.Object r2 = r2.emit(r15, r0)
                if (r2 != r1) goto L_0x010b
                return r1
            L_0x010b:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.C11383a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storemode.EnableStoreModeWhenNearbyStoreIntegrationImpl$initialize$1", f = "EnableStoreModeWhenNearbyStoreIntegrationImpl.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: hu.a$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98217c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5221y f98218d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11383a f98219e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storemode.EnableStoreModeWhenNearbyStoreIntegrationImpl$initialize$1$1", f = "EnableStoreModeWhenNearbyStoreIntegrationImpl.kt", l = {77}, m = "invokeSuspend")
        /* renamed from: hu.a$f$a  reason: collision with other inner class name */
        static final class C2216a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f98220c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C11383a f98221d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2216a(C11383a aVar, C17164e<? super C2216a> eVar) {
                super(2, eVar);
                this.f98221d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2216a(this.f98221d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C2216a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f98220c;
                if (i10 == 0) {
                    y.b(obj);
                    C11383a aVar = this.f98221d;
                    this.f98220c = 1;
                    if (aVar.i(this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C5221y yVar, C11383a aVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f98218d = yVar;
            this.f98219e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f98218d, this.f98219e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f98217c;
            if (i10 == 0) {
                y.b(obj);
                C5221y yVar = this.f98218d;
                r.b bVar = r.b.RESUMED;
                C2216a aVar = new C2216a(this.f98219e, (C17164e<? super C2216a>) null);
                this.f98217c = 1;
                if (androidx.lifecycle.Q.b(yVar, bVar, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storemode.EnableStoreModeWhenNearbyStoreIntegrationImpl", f = "EnableStoreModeWhenNearbyStoreIntegrationImpl.kt", l = {120, 129}, m = "notifyAboutNearbyStore")
    /* renamed from: hu.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f98222c;

        /* renamed from: d  reason: collision with root package name */
        Object f98223d;

        /* renamed from: e  reason: collision with root package name */
        Object f98224e;

        /* renamed from: f  reason: collision with root package name */
        Object f98225f;

        /* renamed from: g  reason: collision with root package name */
        Object f98226g;

        /* renamed from: h  reason: collision with root package name */
        Object f98227h;

        /* renamed from: i  reason: collision with root package name */
        Object f98228i;

        /* renamed from: j  reason: collision with root package name */
        Object f98229j;

        /* renamed from: k  reason: collision with root package name */
        Object f98230k;

        /* renamed from: l  reason: collision with root package name */
        Object f98231l;

        /* renamed from: m  reason: collision with root package name */
        Object f98232m;

        /* renamed from: n  reason: collision with root package name */
        boolean f98233n;

        /* renamed from: o  reason: collision with root package name */
        int f98234o;

        /* renamed from: p  reason: collision with root package name */
        int f98235p;

        /* renamed from: q  reason: collision with root package name */
        int f98236q;

        /* renamed from: r  reason: collision with root package name */
        int f98237r;

        /* renamed from: s  reason: collision with root package name */
        int f98238s;

        /* renamed from: t  reason: collision with root package name */
        int f98239t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f98240u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ C11383a f98241v;

        /* renamed from: w  reason: collision with root package name */
        int f98242w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C11383a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f98241v = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98240u = obj;
            this.f98242w |= Integer.MIN_VALUE;
            return this.f98241v.n((C12831c) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storemode.EnableStoreModeWhenNearbyStoreIntegrationImpl", f = "EnableStoreModeWhenNearbyStoreIntegrationImpl.kt", l = {97}, m = "shouldWeCheckNearbyStore")
    /* renamed from: hu.a$h */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f98243c;

        /* renamed from: d  reason: collision with root package name */
        Object f98244d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f98245e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11383a f98246f;

        /* renamed from: g  reason: collision with root package name */
        int f98247g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C11383a aVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f98246f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98245e = obj;
            this.f98247g |= Integer.MIN_VALUE;
            return this.f98246f.o(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpu/b;", "nearbyStore", "", "badgeShown", "Lpu/c;", "<anonymous>", "(Lpu/b;Z)Lpu/c;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.storemode.EnableStoreModeWhenNearbyStoreIntegrationImpl$showStoreModeBadgeFlow$1", f = "EnableStoreModeWhenNearbyStoreIntegrationImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hu.a$i */
    static final class i extends l implements q<C11778b, Boolean, C17164e<? super C11779c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98248c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f98249d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f98250e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11383a f98251f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C11383a aVar, C17164e<? super i> eVar) {
            super(3, eVar);
            this.f98251f = aVar;
        }

        public final Object i(C11778b bVar, boolean z10, C17164e<? super C11779c> eVar) {
            i iVar = new i(this.f98251f, eVar);
            iVar.f98249d = bVar;
            iVar.f98250e = z10;
            return iVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((C11778b) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98248c == 0) {
                y.b(obj);
                C11778b bVar = (C11778b) this.f98249d;
                boolean z10 = this.f98250e;
                if (bVar == null || z10) {
                    return C11779c.a.f101382a;
                }
                this.f98251f.f98172j.c();
                this.f98251f.f98172j.d();
                return C11779c.b.f101383a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C11383a(ap.d dVar, C11571d dVar2, ap.f fVar, LocationManager locationManager, C12860a aVar, C11674a aVar2, C12863d dVar3, w wVar, C10253a aVar3, C11817a aVar4) {
        C17542s.j(dVar, "distanceCalculator");
        C17542s.j(dVar2, "enableStoreModeUseCase");
        C17542s.j(fVar, "getUserLocationUseCase");
        C17542s.j(locationManager, "locationManager");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(aVar2, "storeModeLocalDataSource");
        C17542s.j(dVar3, "storeRepository");
        C17542s.j(wVar, "verifyPermissionUseCase");
        C17542s.j(aVar3, "killSwitchRepository");
        C17542s.j(aVar4, "storeModeAnalytics");
        this.f98163a = dVar;
        this.f98164b = dVar2;
        this.f98165c = fVar;
        this.f98166d = locationManager;
        this.f98167e = aVar;
        this.f98168f = aVar2;
        this.f98169g = dVar3;
        this.f98170h = wVar;
        this.f98171i = aVar3;
        this.f98172j = aVar4;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(dI.C17164e<? super XH.C16807N> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof hu.C11383a.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            hu.a$b r0 = (hu.C11383a.b) r0
            int r1 = r0.f98182k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f98182k = r1
            goto L_0x0018
        L_0x0013:
            hu.a$b r0 = new hu.a$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f98180i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f98182k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0068
            if (r3 == r6) goto L_0x005c
            if (r3 == r5) goto L_0x0050
            if (r3 != r4) goto L_0x0048
            java.lang.Object r9 = r0.f98179h
            EB.c r9 = (EB.C12831c) r9
            java.lang.Object r9 = r0.f98178g
            com.ingka.ikea.appconfig.model.LocationLatLng r9 = (com.ingka.ikea.appconfig.model.LocationLatLng) r9
            java.lang.Object r9 = r0.f98177f
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r0.f98176e
            XH.v r9 = (XH.v) r9
            java.lang.Object r9 = r0.f98175d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f98174c
            hu.a r9 = (hu.C11383a) r9
            XH.y.b(r1)
            goto L_0x00c3
        L_0x0048:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0050:
            java.lang.Object r9 = r0.f98175d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r3 = r0.f98174c
            hu.a r3 = (hu.C11383a) r3
            XH.y.b(r1)
            goto L_0x0091
        L_0x005c:
            java.lang.Object r9 = r0.f98175d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r3 = r0.f98174c
            hu.a r3 = (hu.C11383a) r3
            XH.y.b(r1)
            goto L_0x0079
        L_0x0068:
            XH.y.b(r1)
            r0.f98174c = r8
            r0.f98175d = r9
            r0.f98182k = r6
            java.lang.Object r1 = r8.o(r0)
            if (r1 != r2) goto L_0x0078
            return r2
        L_0x0078:
            r3 = r8
        L_0x0079:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0084
            XH.N r9 = XH.C16807N.f139792a
            return r9
        L_0x0084:
            r0.f98174c = r3
            r0.f98175d = r9
            r0.f98182k = r5
            java.lang.Object r1 = r3.k(r0)
            if (r1 != r2) goto L_0x0091
            return r2
        L_0x0091:
            XH.v r1 = (XH.v) r1
            java.lang.Object r5 = r1.a()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r1.b()
            com.ingka.ikea.appconfig.model.LocationLatLng r6 = (com.ingka.ikea.appconfig.model.LocationLatLng) r6
            EB.c r7 = r3.j(r5, r6)
            if (r7 != 0) goto L_0x00ae
            TJ.B<pu.b> r9 = r3.f98173k
            r0 = 0
            r9.setValue(r0)
            XH.N r9 = XH.C16807N.f139792a
            return r9
        L_0x00ae:
            r0.f98174c = r3
            r0.f98175d = r9
            r0.f98176e = r1
            r0.f98177f = r5
            r0.f98178g = r6
            r0.f98179h = r7
            r0.f98182k = r4
            java.lang.Object r9 = r3.n(r7, r0)
            if (r9 != r2) goto L_0x00c3
            return r2
        L_0x00c3:
            XH.N r9 = XH.C16807N.f139792a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.C11383a.i(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: EB.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: EB.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: EB.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: EB.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final EB.C12831c j(java.util.List<EB.C12831c> r10, com.ingka.ikea.appconfig.model.LocationLatLng r11) {
        /*
            r9 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0032
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0009:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r10.next()
            r2 = r1
            EB.c r2 = (EB.C12831c) r2
            ap.d r3 = r9.f98163a
            com.ingka.ikea.appconfig.model.LocationLatLng r4 = new com.ingka.ikea.appconfig.model.LocationLatLng
            double r5 = r2.d()
            double r7 = r2.e()
            r4.<init>(r5, r7)
            double r2 = r3.b(r11, r4)
            r4 = 4641240890982006784(0x4069000000000000, double:200.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0009
            r0 = r1
        L_0x0030:
            EB.c r0 = (EB.C12831c) r0
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.C11383a.j(java.util.List, com.ingka.ikea.appconfig.model.LocationLatLng):EB.c");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [dI.e] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0180, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x0060, B:20:0x006c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066 A[ExcHandler: CancellationException (r0v18 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:15:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(dI.C17164e<? super XH.v<? extends java.util.List<EB.C12831c>, com.ingka.ikea.appconfig.model.LocationLatLng>> r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            boolean r0 = r2 instanceof hu.C11383a.d
            if (r0 == 0) goto L_0x0018
            r0 = r2
            hu.a$d r0 = (hu.C11383a.d) r0
            int r3 = r0.f98199n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r0.f98199n = r3
        L_0x0016:
            r3 = r0
            goto L_0x001e
        L_0x0018:
            hu.a$d r0 = new hu.a$d
            r0.<init>(r1, r2)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r3.f98197l
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f98199n
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0069
            if (r5 == r7) goto L_0x0050
            if (r5 != r6) goto L_0x0048
            java.lang.Object r2 = r3.f98193h
            TJ.g r2 = (TJ.C16532g) r2
            java.lang.Object r2 = r3.f98192g
            TJ.g r2 = (TJ.C16532g) r2
            java.lang.Object r2 = r3.f98190e
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r3.f98189d
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r3 = r3.f98188c
            hu.a r3 = (hu.C11383a) r3
            XH.y.b(r0)
            goto L_0x0177
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0050:
            java.lang.Object r2 = r3.f98191f
            hu.a r2 = (hu.C11383a) r2
            java.lang.Object r2 = r3.f98190e
            hu.a r2 = (hu.C11383a) r2
            java.lang.Object r2 = r3.f98189d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r5 = r3.f98188c
            hu.a r5 = (hu.C11383a) r5
            XH.y.b(r0)     // Catch:{ CancellationException -> 0x0066, all -> 0x0064 }
            goto L_0x0086
        L_0x0064:
            r0 = move-exception
            goto L_0x008f
        L_0x0066:
            r0 = move-exception
            goto L_0x0180
        L_0x0069:
            XH.y.b(r0)
            XH.x$a r0 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            FB.d r0 = r1.f98169g     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            r3.f98188c = r1     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            r3.f98189d = r2     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            r3.f98190e = r1     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            r3.f98191f = r1     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            r3.f98194i = r8     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            r3.f98195j = r8     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            r3.f98199n = r7     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            java.lang.Object r0 = r0.c(r3)     // Catch:{ CancellationException -> 0x0066, all -> 0x008d }
            if (r0 != r4) goto L_0x0085
            return r4
        L_0x0085:
            r5 = r1
        L_0x0086:
            java.util.List r0 = (java.util.List) r0     // Catch:{ CancellationException -> 0x0066, all -> 0x0064 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0066, all -> 0x0064 }
            goto L_0x0099
        L_0x008d:
            r0 = move-exception
            r5 = r1
        L_0x008f:
            XH.x$a r9 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0099:
            java.lang.Throwable r15 = XH.x.e(r0)
            r14 = 0
            if (r15 != 0) goto L_0x00a7
            r7 = r0
            java.util.List r7 = (java.util.List) r7
            r9 = r7
            r7 = r14
            goto L_0x013f
        L_0x00a7:
            qv.e r13 = qv.e.WARN
            qv.d r9 = qv.d.f102012a
            java.util.List r9 = r9.a()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00ba:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00d1
            java.lang.Object r11 = r9.next()
            r12 = r11
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r13, r8)
            if (r12 == 0) goto L_0x00ba
            r10.add(r11)
            goto L_0x00ba
        L_0x00d1:
            java.util.Iterator r16 = r10.iterator()
            r9 = r14
            r10 = r9
        L_0x00d7:
            boolean r11 = r16.hasNext()
            if (r11 == 0) goto L_0x00ed
            java.lang.Object r11 = r16.next()
            qv.b r11 = (qv.C11819b) r11
            if (r9 != 0) goto L_0x00f3
            java.lang.String r9 = "Failed to load stores"
            java.lang.String r9 = qv.C11818a.a(r9, r15)
            if (r9 != 0) goto L_0x00ef
        L_0x00ed:
            r7 = r14
            goto L_0x013b
        L_0x00ef:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x00f3:
            r17 = r9
            if (r10 != 0) goto L_0x0122
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "main"
            boolean r9 = HJ.C15854t.b0(r9, r10, r7)
            if (r9 == 0) goto L_0x010a
            java.lang.String r9 = "m"
            goto L_0x010c
        L_0x010a:
            java.lang.String r9 = "b"
        L_0x010c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "|"
            r10.append(r9)
            java.lang.String r9 = "StoreModeIntegration"
            r10.append(r9)
            java.lang.String r10 = r10.toString()
        L_0x0122:
            r18 = r10
            r12 = 0
            r9 = r11
            r10 = r13
            r11 = r18
            r19 = r13
            r13 = r15
            r7 = r14
            r14 = r17
            r9.a(r10, r11, r12, r13, r14)
            r14 = r7
            r9 = r17
            r10 = r18
            r13 = r19
            r7 = 1
            goto L_0x00d7
        L_0x013b:
            java.util.List r9 = YH.C16877v.n()
        L_0x013f:
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0147
            r14 = r7
            goto L_0x017b
        L_0x0147:
            ap.f r10 = r5.f98165c
            TJ.g r10 = r10.a(r8)
            hu.a$c r11 = new hu.a$c
            r11.<init>(r10)
            hu.a$e r12 = new hu.a$e
            r12.<init>(r7)
            TJ.g r7 = TJ.C16534i.g(r11, r12)
            r3.f98188c = r5
            r3.f98189d = r2
            r3.f98190e = r9
            r3.f98191f = r0
            r3.f98192g = r10
            r3.f98193h = r10
            r3.f98194i = r8
            r3.f98195j = r8
            r3.f98196k = r8
            r3.f98199n = r6
            java.lang.Object r0 = TJ.C16534i.D(r7, r3)
            if (r0 != r4) goto L_0x0176
            return r4
        L_0x0176:
            r2 = r9
        L_0x0177:
            r14 = r0
            com.ingka.ikea.appconfig.model.LocationLatLng r14 = (com.ingka.ikea.appconfig.model.LocationLatLng) r14
            r9 = r2
        L_0x017b:
            XH.v r0 = XH.C16796C.a(r9, r14)
            return r0
        L_0x0180:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.C11383a.k(dI.e):java.lang.Object");
    }

    private final Object l(C17164e<? super Boolean> eVar) {
        return C16534i.B(this.f98168f.b(), eVar);
    }

    private final boolean m() {
        if (A2.b.a(this.f98166d)) {
            Iterable<Boolean> values = this.f98170h.a(C16877v.e("android.permission.ACCESS_FINE_LOCATION")).values();
            if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                for (Boolean booleanValue : values) {
                    if (!booleanValue.booleanValue()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(EB.C12831c r21, dI.C17164e<? super XH.C16807N> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof hu.C11383a.g
            if (r3 == 0) goto L_0x0019
            r3 = r2
            hu.a$g r3 = (hu.C11383a.g) r3
            int r4 = r3.f98242w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f98242w = r4
            goto L_0x001e
        L_0x0019:
            hu.a$g r3 = new hu.a$g
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f98240u
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f98242w
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x007e
            if (r6 == r8) goto L_0x004f
            if (r6 != r7) goto L_0x0047
            boolean r1 = r3.f98233n
            java.lang.Object r2 = r3.f98225f
            EB.d r2 = (EB.C12832d) r2
            java.lang.Object r2 = r3.f98224e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f98223d
            EB.c r2 = (EB.C12831c) r2
            java.lang.Object r3 = r3.f98222c
            hu.a r3 = (hu.C11383a) r3
            XH.y.b(r4)
            r8 = r1
            r1 = r2
            goto L_0x01a4
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004f:
            java.lang.Object r1 = r3.f98231l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f98230k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f98229j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f98228i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f98227h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r3.f98226g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f98225f
            EB.d r1 = (EB.C12832d) r1
            java.lang.Object r1 = r3.f98224e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f98223d
            EB.c r1 = (EB.C12831c) r1
            java.lang.Object r2 = r3.f98222c
            hu.a r2 = (hu.C11383a) r2
            XH.y.b(r4)
            r3 = r2
            r2 = r8
            goto L_0x0183
        L_0x007e:
            XH.y.b(r4)
            FB.a r4 = r0.f98167e
            EB.d r4 = r4.c()
            r6 = 0
            if (r4 == 0) goto L_0x008f
            java.lang.String r9 = r4.e()
            goto L_0x0090
        L_0x008f:
            r9 = r6
        L_0x0090:
            java.lang.String r10 = r21.g()
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
            r10 = 0
            if (r4 == 0) goto L_0x009d
            r11 = r8
            goto L_0x009e
        L_0x009d:
            r11 = r10
        L_0x009e:
            if (r11 != 0) goto L_0x0185
            qv.e r7 = qv.e.DEBUG
            qv.d r12 = qv.d.f102012a
            java.util.List r12 = r12.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00b3:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00ca
            java.lang.Object r13 = r12.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r7, r10)
            if (r14 == 0) goto L_0x00b3
            r15.add(r13)
            goto L_0x00b3
        L_0x00ca:
            java.util.Iterator r14 = r15.iterator()
            r12 = r6
            r13 = r15
        L_0x00d0:
            boolean r16 = r14.hasNext()
            java.lang.String r10 = "StoreModeIntegration"
            if (r16 == 0) goto L_0x013d
            java.lang.Object r18 = r14.next()
            r13 = r18
            qv.b r13 = (qv.C11819b) r13
            r16 = r15
            r15 = 0
            if (r6 != 0) goto L_0x00f6
            java.lang.String r8 = "Automatically updated store due to user being nearby it"
            java.lang.String r8 = qv.C11818a.a(r8, r15)
            if (r8 != 0) goto L_0x00f2
            r8 = r16
            r13 = r18
            goto L_0x013e
        L_0x00f2:
            java.lang.String r6 = qv.C11820c.a(r8)
        L_0x00f6:
            if (r12 != 0) goto L_0x0123
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r12 = "main"
            r15 = 1
            boolean r8 = HJ.C15854t.b0(r8, r12, r15)
            if (r8 == 0) goto L_0x010c
            java.lang.String r8 = "m"
            goto L_0x010e
        L_0x010c:
            java.lang.String r8 = "b"
        L_0x010e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            java.lang.String r8 = "|"
            r12.append(r8)
            r12.append(r10)
            java.lang.String r8 = r12.toString()
            goto L_0x0124
        L_0x0123:
            r8 = r12
        L_0x0124:
            r15 = 0
            r12 = r13
            r13 = r7
            r10 = r14
            r14 = r8
            r19 = r8
            r8 = r16
            r16 = 0
            r17 = r6
            r12.a(r13, r14, r15, r16, r17)
            r15 = r8
            r14 = r10
            r13 = r18
            r12 = r19
            r8 = 1
            r10 = 0
            goto L_0x00d0
        L_0x013d:
            r8 = r15
        L_0x013e:
            FB.a r15 = r0.f98167e
            r16 = r5
            EB.d$a r5 = EB.C12832d.f109333f
            EB.d r5 = r5.a(r1)
            r15.a(r5)
            lu.d r5 = r0.f98164b
            java.lang.String r15 = r21.g()
            r3.f98222c = r0
            r3.f98223d = r1
            r3.f98224e = r2
            r3.f98225f = r4
            r3.f98226g = r10
            r3.f98227h = r7
            r3.f98228i = r6
            r3.f98229j = r12
            r3.f98230k = r8
            r3.f98231l = r14
            r3.f98232m = r13
            r3.f98233n = r9
            r3.f98234o = r11
            r2 = 0
            r3.f98235p = r2
            r3.f98236q = r2
            r3.f98237r = r2
            r3.f98238s = r2
            r3.f98239t = r2
            r2 = 1
            r3.f98242w = r2
            java.lang.Object r3 = r5.a(r15, r3)
            r5 = r16
            if (r3 != r5) goto L_0x0182
            return r5
        L_0x0182:
            r3 = r0
        L_0x0183:
            r8 = r2
            goto L_0x01a4
        L_0x0185:
            if (r9 == 0) goto L_0x01a2
            lu.d r6 = r0.f98164b
            java.lang.String r8 = r21.g()
            r3.f98222c = r0
            r3.f98223d = r1
            r3.f98224e = r2
            r3.f98225f = r4
            r3.f98233n = r9
            r3.f98234o = r11
            r3.f98242w = r7
            java.lang.Object r2 = r6.a(r8, r3)
            if (r2 != r5) goto L_0x01a2
            return r5
        L_0x01a2:
            r3 = r0
            r8 = r9
        L_0x01a4:
            TJ.B<pu.b> r2 = r3.f98173k
            pu.b r3 = new pu.b
            java.lang.String r4 = r1.g()
            java.lang.String r1 = r1.h()
            r3.<init>(r4, r1, r8)
            r2.setValue(r3)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.C11383a.n(EB.c, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof hu.C11383a.h
            if (r0 == 0) goto L_0x0013
            r0 = r6
            hu.a$h r0 = (hu.C11383a.h) r0
            int r1 = r0.f98247g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f98247g = r1
            goto L_0x0018
        L_0x0013:
            hu.a$h r0 = new hu.a$h
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f98245e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f98247g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f98244d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f98243c
            hu.a r6 = (hu.C11383a) r6
            XH.y.b(r1)
            goto L_0x004a
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            r0.f98243c = r5
            r0.f98244d = r6
            r0.f98247g = r4
            java.lang.Object r1 = r5.l(r0)
            if (r1 != r2) goto L_0x0049
            return r2
        L_0x0049:
            r6 = r5
        L_0x004a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0055
        L_0x0053:
            r4 = r1
            goto L_0x005c
        L_0x0055:
            boolean r6 = r6.m()
            if (r6 != 0) goto L_0x005c
            goto L_0x0053
        L_0x005c:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.C11383a.o(dI.e):java.lang.Object");
    }

    public void a(C5221y yVar) {
        C17542s.j(yVar, "lifecycleOwner");
        if (this.f98171i.h()) {
            F0 unused = C16314k.d(C5222z.a(yVar), (C17168i) null, (T) null, new f(yVar, this, (C17164e<? super f>) null), 3, (Object) null);
        }
    }

    public C16532g<C11779c> b() {
        return C16534i.n(this.f98173k, this.f98168f.e(), new i(this, (C17164e<? super i>) null));
    }

    /* renamed from: p */
    public C16519P<C11778b> c() {
        return C16534i.c(this.f98173k);
    }
}
