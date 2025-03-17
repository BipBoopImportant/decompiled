package UE;

import KJ.C15985a;
import OE.C13309a;
import OE.C13316h;
import OE.n;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16870n;
import YH.C16877v;
import android.content.res.Resources;
import android.net.Uri;
import bI.C17035a;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.ShowroomRepository;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.external.entrypoint.EntryPointModelUseCase;
import com.sugarcube.core.network.models.Showroom;
import dI.C17164e;
import eI.C17187b;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import nF.C14850a;
import nF.C14851b;
import nF.C14853d;
import nI.p;
import nI.s;
import uI.C18055d;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001+B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0015\"\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001c0\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020#0&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020#06058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107¨\u00069"}, d2 = {"LUE/b;", "Lcom/sugarcube/app/base/external/entrypoint/EntryPointModelUseCase;", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "assetRepository", "Landroid/content/res/Resources;", "resources", "Lcom/sugarcube/app/base/data/ShowroomRepository;", "showroomRepository", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "LOE/a;", "appEnvironment", "<init>", "(Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;Landroid/content/res/Resources;Lcom/sugarcube/app/base/data/ShowroomRepository;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/DeviceCompatibility;LOE/a;)V", "Landroid/net/Uri;", "assetUri", "LnF/b$a;", "g", "(Landroid/net/Uri;)LnF/b$a;", "", "LnF/a;", "items", "LnF/b$b;", "h", "([LnF/a;)LnF/b$b;", "LTJ/g;", "", "j", "()LTJ/g;", "", "captureEnabled", "k", "(ZLandroid/net/Uri;)LnF/a;", "LnF/b;", "default", "()LnF/b;", "LTJ/P;", "i", "()LTJ/P;", "a", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "b", "Landroid/content/res/Resources;", "c", "Lcom/sugarcube/app/base/data/ShowroomRepository;", "d", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "e", "Lcom/sugarcube/app/base/DeviceCompatibility;", "f", "LOE/a;", "LTJ/B;", "LuI/d;", "LTJ/B;", "entryPointType", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UE.b  reason: case insensitive filesystem */
public final class C13734b implements EntryPointModelUseCase {

    /* renamed from: h  reason: collision with root package name */
    public static final C2878b f117060h = new C2878b((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f117061i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final VideoAssetRepository f117062a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Resources f117063b;

    /* renamed from: c  reason: collision with root package name */
    private final ShowroomRepository f117064c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final ConfigRepository f117065d;

    /* renamed from: e  reason: collision with root package name */
    private final DeviceCompatibility f117066e;

    /* renamed from: f  reason: collision with root package name */
    private final C13309a f117067f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C16505B<C18055d<? extends C14851b>> f117068g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.EntryPointModelUseCaseImpl$1", f = "EntryPointModelUseCaseImpl.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: UE.b$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117069c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13734b f117070d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: UE.b$a$a  reason: collision with other inner class name */
        static final class C2877a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C13734b f117071a;

            C2877a(C13734b bVar) {
                this.f117071a = bVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f117071a.f117068g.setValue(P.b(z10 ? C14851b.C3193b.class : C14851b.a.class));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13734b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f117070d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f117070d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f117069c;
            if (i10 == 0) {
                y.b(obj);
                C16532g observe = this.f117070d.f117065d.observe(FeatureFlags.CarouselEntryPoint.INSTANCE);
                C2877a aVar = new C2877a(this.f117070d);
                this.f117069c = 1;
                if (observe.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LUE/b$b;", "", "<init>", "()V", "", "SHOWROOM_CARD_COUNT", "I", "", "CAPTURE_VIDEO_ITEM_ID", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UE.b$b  reason: collision with other inner class name */
    public static final class C2878b {
        public /* synthetic */ C2878b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2878b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UE.b$c */
    public static final class c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f117072a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: UE.b$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f117073a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.EntryPointModelUseCaseImpl$execute$$inlined$map$1$2", f = "EntryPointModelUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: UE.b$c$a$a  reason: collision with other inner class name */
            public static final class C2879a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f117074c;

                /* renamed from: d  reason: collision with root package name */
                int f117075d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f117076e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2879a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f117076e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f117074c = obj;
                    this.f117075d |= Integer.MIN_VALUE;
                    return this.f117076e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f117073a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof UE.C13734b.c.a.C2879a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    UE.b$c$a$a r0 = (UE.C13734b.c.a.C2879a) r0
                    int r1 = r0.f117075d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f117075d = r1
                    goto L_0x0018
                L_0x0013:
                    UE.b$c$a$a r0 = new UE.b$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f117074c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f117075d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f117073a
                    com.sugarcube.app.base.DeviceCompatibility$a r5 = (com.sugarcube.app.base.DeviceCompatibility.a) r5
                    boolean r5 = r5.b()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f117075d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: UE.C13734b.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f117072a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f117072a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "captureEnabled", "LuI/d;", "LnF/b;", "type", "Landroid/net/Uri;", "assetUri", "", "LnF/a;", "showrooms", "<anonymous>", "(ZLuI/d;Landroid/net/Uri;Ljava/util/List;)LnF/b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.EntryPointModelUseCaseImpl$execute$2", f = "EntryPointModelUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: UE.b$d */
    static final class d extends l implements s<Boolean, C18055d<? extends C14851b>, Uri, List<? extends C14850a>, C17164e<? super C14851b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117077c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f117078d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f117079e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f117080f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f117081g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C13734b f117082h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C13734b bVar, C17164e<? super d> eVar) {
            super(5, eVar);
            this.f117082h = bVar;
        }

        public final Object i(boolean z10, C18055d<? extends C14851b> dVar, Uri uri, List<C14850a> list, C17164e<? super C14851b> eVar) {
            d dVar2 = new d(this.f117082h, eVar);
            dVar2.f117078d = z10;
            dVar2.f117079e = dVar;
            dVar2.f117080f = uri;
            dVar2.f117081g = list;
            return dVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f117077c == 0) {
                y.b(obj);
                boolean z10 = this.f117078d;
                Uri uri = (Uri) this.f117080f;
                List list = (List) this.f117081g;
                if (!C17542s.e((C18055d) this.f117079e, P.b(C14851b.C3193b.class))) {
                    return this.f117082h.g(uri);
                }
                C14850a f10 = this.f117082h.k(z10, uri);
                C13734b bVar = this.f117082h;
                U u10 = new U(2);
                u10.a(f10);
                u10.b(list.toArray(new C14850a[0]));
                return bVar.h((C14850a[]) u10.d(new C14850a[u10.c()]));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i(((Boolean) obj).booleanValue(), (C18055d) obj2, (Uri) obj3, (List) obj4, (C17164e) obj5);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UE.b$e */
    public static final class e implements C16532g<List<? extends C14850a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f117083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13734b f117084b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: UE.b$e$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f117085a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C13734b f117086b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.external.EntryPointModelUseCaseImpl$showroomCarouselItems$$inlined$map$1$2", f = "EntryPointModelUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: UE.b$e$a$a  reason: collision with other inner class name */
            public static final class C2880a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f117087c;

                /* renamed from: d  reason: collision with root package name */
                int f117088d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f117089e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2880a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f117089e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f117087c = obj;
                    this.f117088d |= Integer.MIN_VALUE;
                    return this.f117089e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C13734b bVar) {
                this.f117085a = hVar;
                this.f117086b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r18, dI.C17164e r19) {
                /*
                    r17 = this;
                    r0 = r17
                    r1 = r19
                    boolean r2 = r1 instanceof UE.C13734b.e.a.C2880a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    UE.b$e$a$a r2 = (UE.C13734b.e.a.C2880a) r2
                    int r3 = r2.f117088d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f117088d = r3
                    goto L_0x001c
                L_0x0017:
                    UE.b$e$a$a r2 = new UE.b$e$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f117087c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f117088d
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    XH.y.b(r1)
                    goto L_0x00f2
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f117085a
                    r4 = r18
                    java.util.List r4 = (java.util.List) r4
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    r6 = 8
                    java.util.List r4 = YH.C16877v.k1(r4, r6)
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    UE.b$f r6 = new UE.b$f
                    r6.<init>()
                    java.util.List r4 = YH.C16877v.g1(r4, r6)
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r7 = 10
                    int r7 = YH.C16877v.y(r4, r7)
                    r6.<init>(r7)
                    java.util.Iterator r4 = r4.iterator()
                    r7 = 0
                L_0x0064:
                    boolean r8 = r4.hasNext()
                    if (r8 == 0) goto L_0x00e9
                    java.lang.Object r8 = r4.next()
                    int r9 = r7 + 1
                    if (r7 >= 0) goto L_0x0075
                    YH.C16877v.x()
                L_0x0075:
                    com.sugarcube.core.network.models.Showroom r8 = (com.sugarcube.core.network.models.Showroom) r8
                    FF.h r10 = FF.C12891h.Blank
                    FF.e$j r7 = FF.Y.a(r8, r7, r10)
                    java.util.UUID r8 = r7.n()
                    java.lang.String r11 = r8.toString()
                    java.lang.String r8 = "toString(...)"
                    kotlin.jvm.internal.C17542s.i(r11, r8)
                    java.util.UUID r8 = r7.e()
                    java.lang.String r16 = r8.toString()
                    java.lang.String r12 = r7.j()
                    nF.d$b r13 = new nF.d$b
                    android.net.Uri r8 = r7.g()
                    java.lang.String r8 = java.lang.String.valueOf(r8)
                    UE.b r10 = r0.f117086b
                    android.content.res.Resources r10 = r10.f117063b
                    int r14 = OE.n.f113206G2
                    java.lang.String r10 = r10.getString(r14)
                    java.lang.String r14 = "getString(...)"
                    kotlin.jvm.internal.C17542s.i(r10, r14)
                    int r14 = com.sugarcube.common.R.drawable.sc_room_thumb_placeholder
                    r13.<init>(r8, r10, r14)
                    tF.p r8 = r7.l()
                    if (r8 == 0) goto L_0x00c8
                    UE.b r10 = r0.f117086b
                    android.content.res.Resources r10 = r10.f117063b
                    java.lang.String r8 = tF.C15084i.b(r8, r10)
                L_0x00c6:
                    r14 = r8
                    goto L_0x00ca
                L_0x00c8:
                    r8 = 0
                    goto L_0x00c6
                L_0x00ca:
                    nF.d$b r15 = new nF.d$b
                    android.net.Uri r8 = r7.k()
                    java.lang.String r8 = java.lang.String.valueOf(r8)
                    java.lang.String r7 = r7.j()
                    int r10 = OE.C13316h.f112847b
                    r15.<init>(r8, r7, r10)
                    nF.a r7 = new nF.a
                    r10 = r7
                    r10.<init>(r11, r12, r13, r14, r15, r16)
                    r6.add(r7)
                    r7 = r9
                    goto L_0x0064
                L_0x00e9:
                    r2.f117088d = r5
                    java.lang.Object r1 = r1.emit(r6, r2)
                    if (r1 != r3) goto L_0x00f2
                    return r3
                L_0x00f2:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: UE.C13734b.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar, C13734b bVar) {
            this.f117083a = gVar;
            this.f117084b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f117083a.collect(new a(hVar, this.f117084b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UE.b$f */
    public static final class f<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((Showroom) t11).getRoomSize(), ((Showroom) t10).getRoomSize());
        }
    }

    public C13734b(VideoAssetRepository videoAssetRepository, Resources resources, ShowroomRepository showroomRepository, ConfigRepository configRepository, DeviceCompatibility deviceCompatibility, C13309a aVar) {
        C17542s.j(videoAssetRepository, "assetRepository");
        C17542s.j(resources, "resources");
        C17542s.j(showroomRepository, "showroomRepository");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(deviceCompatibility, "deviceCompatibility");
        C17542s.j(aVar, "appEnvironment");
        this.f117062a = videoAssetRepository;
        this.f117063b = resources;
        this.f117064c = showroomRepository;
        this.f117065d = configRepository;
        this.f117066e = deviceCompatibility;
        this.f117067f = aVar;
        this.f117068g = C16521S.a(P.b(configRepository.isEnabledBlocking(FeatureFlags.CarouselEntryPoint.INSTANCE) ? C14851b.C3193b.class : C14851b.a.class));
        F0 unused = C16314k.d(aVar.b(), aVar.e(), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final C14851b.a g(Uri uri) {
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        String string = this.f117063b.getString(n.f113231K3);
        C17542s.i(string, "getString(...)");
        return new C14851b.a(new C14853d.c(uri2, string, C13316h.f112821C));
    }

    /* access modifiers changed from: private */
    public final C14851b.C3193b h(C14850a... aVarArr) {
        return new C14851b.C3193b(this.f117063b.getString(n.f113249N3), this.f117063b.getString(n.f113243M3), C15985a.l(C16877v.t0(C16870n.f(aVarArr))));
    }

    private final C16532g<List<C14850a>> j() {
        return new e(this.f117064c.getShowrooms(), this);
    }

    /* access modifiers changed from: private */
    public final C14850a k(boolean z10, Uri uri) {
        String string = this.f117063b.getString(n.f113261P3);
        C17542s.i(string, "getString(...)");
        String string2 = this.f117063b.getString(n.f113255O3);
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        String string3 = this.f117063b.getString(n.f113200F2);
        C17542s.i(string3, "getString(...)");
        C14850a aVar = new C14850a("capture_video", string, new C14853d.c(uri2, string3, C13316h.f112821C), string2, (C14853d) null, (String) null, 48, (DefaultConstructorMarker) null);
        if (z10) {
            return aVar;
        }
        return null;
    }

    /* renamed from: default  reason: not valid java name */
    public C14851b m18default() {
        return C17542s.e(this.f117068g.getValue(), P.b(C14851b.C3193b.class)) ? h(k(this.f117066e.isCaptureEnabled(), this.f117062a.get(VideoAsset.LANDING_ENTRY_POINT))) : g(this.f117062a.get(VideoAsset.LANDING_ENTRY_POINT));
    }

    /* renamed from: i */
    public C16519P<C14851b> execute() {
        return C16534i.c0(C16534i.l(new c(this.f117066e.getSupportedFeatures()), this.f117068g, this.f117062a.getFlow(VideoAsset.LANDING_ENTRY_POINT), j(), new d(this, (C17164e<? super d>) null)), this.f117067f.b(), C16515L.f138570a.c(), m18default());
    }
}
