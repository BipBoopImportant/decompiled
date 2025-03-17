package RB;

import EB.C12831c;
import FB.C12863d;
import HJ.C15854t;
import IB.C13018a;
import PB.n;
import RB.C13505b;
import RB.C13507d;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import YH.X;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import nI.s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001 B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f0\u00120\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJB\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000f0\u001e0\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000eH\u0002¢\u0006\u0004\b \u0010!J%\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000eH\u0001¢\u0006\u0004\b$\u0010\u0016J#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"LRB/e;", "LRB/d;", "LFB/d;", "storeRepository", "LRB/b;", "getStockDataUseCase", "Lap/f;", "getUserLocationUseCase", "LIB/a;", "getAmenityOpeningHoursUseCase", "LPB/n;", "uiModelMapper", "<init>", "(LFB/d;LRB/b;Lap/f;LIB/a;LPB/n;)V", "LTJ/g;", "", "LEB/c;", "storesFlow", "", "", "LIB/a$a$a;", "f", "(LTJ/g;)LTJ/g;", "itemNo", "LRB/b$a;", "g", "(Ljava/lang/String;)LTJ/g;", "", "showOnlyScanAndGoCompatibleStores", "includeUserLocation", "LXH/x;", "LPB/g;", "a", "(ZLjava/lang/String;LTJ/g;)LTJ/g;", "includeLocation", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "i", "h", "(Z)LTJ/g;", "LFB/d;", "b", "LRB/b;", "c", "Lap/f;", "d", "LIB/a;", "e", "LPB/n;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.e  reason: case insensitive filesystem */
public final class C13508e implements C13507d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f115187f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f115188g = 8;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C12863d f115189a;

    /* renamed from: b  reason: collision with root package name */
    private final C13505b f115190b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ap.f f115191c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C13018a f115192d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final n f115193e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LRB/e$a;", "", "<init>", "()V", "", "THROTTLE_PERIOD_MILLIS", "J", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00000\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00000\u0007H\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "LEB/c;", "stores", "LRB/b$a;", "stockData", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "location", "", "", "LIB/a$a$a;", "openingHours", "LXH/x;", "LPB/g;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/appconfig/model/LocationLatLng;Ljava/util/Map;)LXH/x;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$invoke$1", f = "GetStoreDataUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: RB.e$b */
    static final class b extends l implements s<List<? extends C12831c>, List<? extends C13505b.a>, LocationLatLng, Map<String, ? extends List<? extends C13018a.C2677a.C2678a>>, C17164e<? super x<? extends List<? extends PB.g>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115194c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f115195d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f115196e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f115197f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f115198g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C13508e f115199h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13508e eVar, C17164e<? super b> eVar2) {
            super(5, eVar2);
            this.f115199h = eVar;
        }

        /* renamed from: i */
        public final Object z(List<C12831c> list, List<C13505b.a> list2, LocationLatLng locationLatLng, Map<String, ? extends List<C13018a.C2677a.C2678a>> map, C17164e<? super x<? extends List<PB.g>>> eVar) {
            b bVar = new b(this.f115199h, eVar);
            bVar.f115195d = list;
            bVar.f115196e = list2;
            bVar.f115197f = locationLatLng;
            bVar.f115198g = map;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f115194c == 0) {
                y.b(obj);
                return x.a(x.b(this.f115199h.f115193e.a((List) this.f115195d, (List) this.f115196e, (LocationLatLng) this.f115197f, (Map) this.f115198g)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LTJ/h;", "LXH/x;", "", "LPB/g;", "", "exception", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$invoke$2", f = "GetStoreDataUseCase.kt", l = {105}, m = "invokeSuspend")
    /* renamed from: RB.e$c */
    static final class c extends l implements q<C16533h<? super x<? extends List<? extends PB.g>>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f115200c;

        /* renamed from: d  reason: collision with root package name */
        int f115201d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f115202e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f115203f;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super x<? extends List<PB.g>>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar);
            cVar.f115202e = hVar;
            cVar.f115203f = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f115201d;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f115202e;
                Throwable th2 = (Throwable) this.f115203f;
                x.a aVar = x.f139812b;
                x a10 = x.a(x.b(y.a(th2)));
                this.f115202e = hVar;
                this.f115203f = th2;
                this.f115200c = aVar;
                this.f115201d = 1;
                if (hVar.emit(a10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                x.a aVar2 = (x.a) this.f115200c;
                Throwable th3 = (Throwable) this.f115203f;
                C16533h hVar2 = (C16533h) this.f115202e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00000\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "LEB/c;", "stores", "LTJ/g;", "", "", "LIB/a$a$a;", "<anonymous>", "(Ljava/util/List;)LTJ/g;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$openingHoursFlow$1", f = "GetStoreDataUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: RB.e$d */
    static final class d extends l implements p<List<? extends C12831c>, C17164e<? super C16532g<? extends Map<String, ? extends List<? extends C13018a.C2677a.C2678a>>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115204c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f115205d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13508e f115206e;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: RB.e$d$a */
        public static final class a implements C16532g<Map<String, ? extends List<? extends C13018a.C2677a.C2678a>>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f115207a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: RB.e$d$a$a  reason: collision with other inner class name */
            public static final class C2831a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f115208a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$openingHoursFlow$1$invokeSuspend$$inlined$map$1$2", f = "GetStoreDataUseCase.kt", l = {50}, m = "emit")
                /* renamed from: RB.e$d$a$a$a  reason: collision with other inner class name */
                public static final class C2832a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f115209c;

                    /* renamed from: d  reason: collision with root package name */
                    int f115210d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C2831a f115211e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2832a(C2831a aVar, C17164e eVar) {
                        super(eVar);
                        this.f115211e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f115209c = obj;
                        this.f115210d |= Integer.MIN_VALUE;
                        return this.f115211e.emit((Object) null, this);
                    }
                }

                public C2831a(C16533h hVar) {
                    this.f115208a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof RB.C13508e.d.a.C2831a.C2832a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        RB.e$d$a$a$a r0 = (RB.C13508e.d.a.C2831a.C2832a) r0
                        int r1 = r0.f115210d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f115210d = r1
                        goto L_0x0018
                    L_0x0013:
                        RB.e$d$a$a$a r0 = new RB.e$d$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f115209c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f115210d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r8)
                        goto L_0x0074
                    L_0x0029:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0031:
                        XH.y.b(r8)
                        TJ.h r8 = r6.f115208a
                        java.util.List r7 = (java.util.List) r7
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        r2 = 10
                        int r2 = YH.C16877v.y(r7, r2)
                        int r2 = YH.X.e(r2)
                        r4 = 16
                        int r2 = tI.C17978n.e(r2, r4)
                        java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                        r4.<init>(r2)
                        java.util.Iterator r7 = r7.iterator()
                    L_0x0053:
                        boolean r2 = r7.hasNext()
                        if (r2 == 0) goto L_0x006b
                        java.lang.Object r2 = r7.next()
                        IB.a$a r2 = (IB.C13018a.C2677a) r2
                        java.lang.String r5 = r2.b()
                        java.util.List r2 = r2.a()
                        r4.put(r5, r2)
                        goto L_0x0053
                    L_0x006b:
                        r0.f115210d = r3
                        java.lang.Object r7 = r8.emit(r4, r0)
                        if (r7 != r1) goto L_0x0074
                        return r1
                    L_0x0074:
                        XH.N r7 = XH.C16807N.f139792a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: RB.C13508e.d.a.C2831a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public a(C16532g gVar) {
                this.f115207a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f115207a.collect(new C2831a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C13508e eVar, C17164e<? super d> eVar2) {
            super(2, eVar2);
            this.f115206e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f115206e, eVar);
            dVar.f115205d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(List<C12831c> list, C17164e<? super C16532g<? extends Map<String, ? extends List<C13018a.C2677a.C2678a>>>> eVar) {
            return ((d) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f115204c == 0) {
                y.b(obj);
                Iterable<C12831c> iterable = (List) this.f115205d;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (C12831c g10 : iterable) {
                    arrayList.add(g10.g());
                }
                return new a(this.f115206e.f115192d.a(arrayList));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LTJ/h;", "", "LRB/b$a;", "", "exception", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$stockListFlow$1", f = "GetStoreDataUseCase.kt", l = {164}, m = "invokeSuspend")
    /* renamed from: RB.e$e  reason: collision with other inner class name */
    static final class C2833e extends l implements q<C16533h<? super List<? extends C13505b.a>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115212c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f115213d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f115214e;

        C2833e(C17164e<? super C2833e> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super List<C13505b.a>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            C2833e eVar2 = new C2833e(eVar);
            eVar2.f115213d = hVar;
            eVar2.f115214e = th2;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16533h hVar;
            Throwable th2;
            Object f10 = C17187b.f();
            int i10 = this.f115212c;
            if (i10 == 0) {
                y.b(obj);
                hVar = (C16533h) this.f115213d;
                Throwable th3 = (Throwable) this.f115214e;
                List n10 = C16877v.n();
                this.f115213d = hVar;
                this.f115214e = th3;
                this.f115212c = 1;
                if (hVar.emit(n10, this) == f10) {
                    return f10;
                }
                th2 = th3;
            } else if (i10 == 1) {
                th2 = (Throwable) this.f115214e;
                hVar = (C16533h) this.f115213d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Failed to load stock data", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            throw new C13507d.a.C2830a("Failed to load stock data");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "LEB/c;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$storeListFlow$1", f = "GetStoreDataUseCase.kt", l = {146, 152}, m = "invokeSuspend")
    /* renamed from: RB.e$f */
    static final class f extends l implements p<C16533h<? super List<? extends C12831c>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f115215c;

        /* renamed from: d  reason: collision with root package name */
        Object f115216d;

        /* renamed from: e  reason: collision with root package name */
        Object f115217e;

        /* renamed from: f  reason: collision with root package name */
        Object f115218f;

        /* renamed from: g  reason: collision with root package name */
        Object f115219g;

        /* renamed from: h  reason: collision with root package name */
        Object f115220h;

        /* renamed from: i  reason: collision with root package name */
        Object f115221i;

        /* renamed from: j  reason: collision with root package name */
        int f115222j;

        /* renamed from: k  reason: collision with root package name */
        int f115223k;

        /* renamed from: l  reason: collision with root package name */
        int f115224l;

        /* renamed from: m  reason: collision with root package name */
        boolean f115225m;

        /* renamed from: n  reason: collision with root package name */
        int f115226n;

        /* renamed from: o  reason: collision with root package name */
        private /* synthetic */ Object f115227o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C13508e f115228p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f115229q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C13508e eVar, boolean z10, C17164e<? super f> eVar2) {
            super(2, eVar2);
            this.f115228p = eVar;
            this.f115229q = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f115228p, this.f115229q, eVar);
            fVar.f115227o = obj;
            return fVar;
        }

        public final Object invoke(C16533h<? super List<C12831c>> hVar, C17164e<? super C16807N> eVar) {
            return ((f) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f115226n
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L_0x0051
                if (r1 == r2) goto L_0x0038
                if (r1 != r3) goto L_0x0030
                java.lang.Object r0 = r14.f115221i
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r14.f115220h
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r14.f115219g
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object r0 = r14.f115218f
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r14.f115217e
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r14.f115216d
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r14.f115227o
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r15)
                goto L_0x00d8
            L_0x0030:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0038:
                java.lang.Object r1 = r14.f115217e
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r14.f115216d
                RB.e r1 = (RB.C13508e) r1
                java.lang.Object r1 = r14.f115215c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r14.f115227o
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r15)     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                goto L_0x0076
            L_0x004c:
                r15 = move-exception
                goto L_0x007d
            L_0x004e:
                r15 = move-exception
                goto L_0x0187
            L_0x0051:
                XH.y.b(r15)
                java.lang.Object r15 = r14.f115227o
                r1 = r15
                TJ.h r1 = (TJ.C16533h) r1
                RB.e r15 = r14.f115228p
                XH.x$a r5 = XH.x.f139812b     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                FB.d r5 = r15.f115189a     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                r14.f115227o = r1     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                r14.f115215c = r1     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                r14.f115216d = r15     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                r14.f115217e = r1     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                r14.f115222j = r4     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                r14.f115223k = r4     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                r14.f115226n = r2     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                java.lang.Object r15 = r5.c(r14)     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                if (r15 != r0) goto L_0x0076
                return r0
            L_0x0076:
                java.util.List r15 = (java.util.List) r15     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                java.lang.Object r15 = XH.x.b(r15)     // Catch:{ CancellationException -> 0x004e, all -> 0x004c }
                goto L_0x0087
            L_0x007d:
                XH.x$a r5 = XH.x.f139812b
                java.lang.Object r15 = XH.y.a(r15)
                java.lang.Object r15 = XH.x.b(r15)
            L_0x0087:
                boolean r5 = r14.f115229q
                java.lang.Throwable r12 = XH.x.e(r15)
                if (r12 != 0) goto L_0x00db
                r2 = r15
                java.util.List r2 = (java.util.List) r2
                r6 = r2
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r8 = r6.iterator()
            L_0x009e:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x00b7
                java.lang.Object r9 = r8.next()
                r10 = r9
                EB.c r10 = (EB.C12831c) r10
                if (r5 == 0) goto L_0x00b3
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x009e
            L_0x00b3:
                r7.add(r9)
                goto L_0x009e
            L_0x00b7:
                r14.f115227o = r1
                r14.f115215c = r15
                r14.f115216d = r2
                r14.f115217e = r6
                r14.f115218f = r6
                r14.f115219g = r7
                r14.f115220h = r8
                r14.f115221i = r7
                r14.f115225m = r5
                r14.f115222j = r4
                r14.f115223k = r4
                r14.f115224l = r4
                r14.f115226n = r3
                java.lang.Object r15 = r1.emit(r7, r14)
                if (r15 != r0) goto L_0x00d8
                return r0
            L_0x00d8:
                XH.N r15 = XH.C16807N.f139792a
                return r15
            L_0x00db:
                qv.e r15 = qv.e.WARN
                qv.d r0 = qv.d.f102012a
                java.util.List r0 = r0.a()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x00ee:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x0105
                java.lang.Object r6 = r0.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r15, r4)
                if (r7 == 0) goto L_0x00ee
                r5.add(r6)
                goto L_0x00ee
            L_0x0105:
                java.util.Iterator r0 = r5.iterator()
                r4 = 0
                r5 = r4
                r6 = r5
            L_0x010c:
                boolean r7 = r0.hasNext()
                java.lang.String r8 = "Failed to load stores"
                if (r7 == 0) goto L_0x0181
                java.lang.Object r7 = r0.next()
                qv.b r7 = (qv.C11819b) r7
                if (r5 != 0) goto L_0x0126
                java.lang.String r5 = qv.C11818a.a(r8, r12)
                if (r5 == 0) goto L_0x0181
                java.lang.String r5 = qv.C11820c.a(r5)
            L_0x0126:
                if (r6 != 0) goto L_0x0175
                java.lang.Class r6 = r1.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r8 = 36
                java.lang.String r8 = HJ.C15854t.s1(r6, r8, r4, r3, r4)
                r9 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r9, r4, r3, r4)
                int r9 = r8.length()
                if (r9 != 0) goto L_0x0146
                goto L_0x014c
            L_0x0146:
                java.lang.String r6 = "Kt"
                java.lang.String r6 = HJ.C15854t.P0(r8, r6)
            L_0x014c:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                java.lang.String r9 = "main"
                boolean r8 = HJ.C15854t.b0(r8, r9, r2)
                if (r8 == 0) goto L_0x015f
                java.lang.String r8 = "m"
                goto L_0x0161
            L_0x015f:
                java.lang.String r8 = "b"
            L_0x0161:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r8)
                java.lang.String r8 = "|"
                r9.append(r8)
                r9.append(r6)
                java.lang.String r6 = r9.toString()
            L_0x0175:
                r13 = r6
                r9 = 0
                r6 = r7
                r7 = r15
                r8 = r13
                r10 = r12
                r11 = r5
                r6.a(r7, r8, r9, r10, r11)
                r6 = r13
                goto L_0x010c
            L_0x0181:
                RB.d$a$b r15 = new RB.d$a$b
                r15.<init>(r8)
                throw r15
            L_0x0187:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: RB.C13508e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$userLocationFlow$1", f = "GetStoreDataUseCase.kt", l = {125, 140}, m = "invokeSuspend")
    /* renamed from: RB.e$g */
    static final class g extends l implements p<C16533h<? super LocationLatLng>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f115230c;

        /* renamed from: d  reason: collision with root package name */
        Object f115231d;

        /* renamed from: e  reason: collision with root package name */
        Object f115232e;

        /* renamed from: f  reason: collision with root package name */
        int f115233f;

        /* renamed from: g  reason: collision with root package name */
        int f115234g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f115235h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C16532g<Boolean> f115236i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C13508e f115237j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$userLocationFlow$1$invokeSuspend$$inlined$flatMapLatest$1", f = "GetStoreDataUseCase.kt", l = {189}, m = "invokeSuspend")
        /* renamed from: RB.e$g$a */
        public static final class a extends l implements q<C16533h<? super LocationLatLng>, Boolean, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f115238c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f115239d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f115240e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C16533h f115241f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C13508e f115242g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C17164e eVar, C16533h hVar, C13508e eVar2) {
                super(3, eVar);
                this.f115241f = hVar;
                this.f115242g = eVar2;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super LocationLatLng> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
                a aVar = new a(eVar, this.f115241f, this.f115242g);
                aVar.f115239d = hVar;
                aVar.f115240e = bool;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C16532g J10;
                String str;
                C16533h hVar;
                C16533h hVar2;
                Iterator it;
                Object f10 = C17187b.f();
                int i10 = this.f115238c;
                if (i10 == 0) {
                    y.b(obj);
                    C16533h hVar3 = (C16533h) this.f115239d;
                    boolean booleanValue = ((Boolean) this.f115240e).booleanValue();
                    String str2 = DslKt.INDICATOR_BACKGROUND;
                    if (booleanValue) {
                        C16533h hVar4 = this.f115241f;
                        e eVar = e.DEBUG;
                        ArrayList arrayList = new ArrayList();
                        for (Object next : qv.d.f102012a.a()) {
                            if (((C11819b) next).b(eVar, false)) {
                                arrayList.add(next);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        String str3 = null;
                        String str4 = null;
                        while (it2.hasNext()) {
                            C11819b bVar = (C11819b) it2.next();
                            if (str3 == null) {
                                String a10 = C11818a.a("start getting location updates", (Throwable) null);
                                if (a10 == null) {
                                    break;
                                }
                                str3 = C11820c.a(a10);
                            }
                            if (str4 == null) {
                                String name = hVar4.getClass().getName();
                                C17542s.g(name);
                                it = it2;
                                hVar2 = hVar4;
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name;
                            } else {
                                it = it2;
                                hVar2 = hVar4;
                            }
                            e eVar2 = eVar;
                            bVar.a(eVar2, str4, false, (Throwable) null, str3);
                            eVar = eVar2;
                            it2 = it;
                            hVar4 = hVar2;
                        }
                        J10 = C16534i.g(new b(this.f115242g.f115191c.a(true)), new c((C17164e<? super c>) null));
                    } else {
                        C16533h hVar5 = this.f115241f;
                        e eVar3 = e.DEBUG;
                        ArrayList<C11819b> arrayList2 = new ArrayList<>();
                        for (Object next2 : qv.d.f102012a.a()) {
                            if (((C11819b) next2).b(eVar3, false)) {
                                arrayList2.add(next2);
                            }
                        }
                        String str5 = null;
                        String str6 = null;
                        for (C11819b bVar2 : arrayList2) {
                            if (str5 == null) {
                                String a11 = C11818a.a("stop getting location updates", (Throwable) null);
                                if (a11 == null) {
                                    break;
                                }
                                str5 = C11820c.a(a11);
                            }
                            if (str6 == null) {
                                String name2 = hVar5.getClass().getName();
                                C17542s.g(name2);
                                hVar = hVar5;
                                str = str2;
                                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o13.length() != 0) {
                                    name2 = C15854t.P0(o13, "Kt");
                                }
                                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                            } else {
                                hVar = hVar5;
                                str = str2;
                            }
                            bVar2.a(eVar3, str6, false, (Throwable) null, str5);
                            hVar5 = hVar;
                            str2 = str;
                        }
                        J10 = C16534i.J(null);
                    }
                    this.f115238c = 1;
                    if (C16534i.x(hVar3, J10, this) == f10) {
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

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: RB.e$g$b */
        public static final class b implements C16532g<LocationLatLng> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f115243a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: RB.e$g$b$a */
            public static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f115244a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$userLocationFlow$1$invokeSuspend$lambda$3$$inlined$map$1$2", f = "GetStoreDataUseCase.kt", l = {50}, m = "emit")
                /* renamed from: RB.e$g$b$a$a  reason: collision with other inner class name */
                public static final class C2834a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f115245c;

                    /* renamed from: d  reason: collision with root package name */
                    int f115246d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ a f115247e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2834a(a aVar, C17164e eVar) {
                        super(eVar);
                        this.f115247e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f115245c = obj;
                        this.f115246d |= Integer.MIN_VALUE;
                        return this.f115247e.emit((Object) null, this);
                    }
                }

                public a(C16533h hVar) {
                    this.f115244a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof RB.C13508e.g.b.a.C2834a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        RB.e$g$b$a$a r0 = (RB.C13508e.g.b.a.C2834a) r0
                        int r1 = r0.f115246d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f115246d = r1
                        goto L_0x0018
                    L_0x0013:
                        RB.e$g$b$a$a r0 = new RB.e$g$b$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f115245c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f115246d
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
                        TJ.h r6 = r4.f115244a
                        XH.x r5 = (XH.x) r5
                        java.lang.Object r5 = r5.j()
                        boolean r2 = XH.x.g(r5)
                        if (r2 == 0) goto L_0x0043
                        r5 = 0
                    L_0x0043:
                        r0.f115246d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x004c
                        return r1
                    L_0x004c:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: RB.C13508e.g.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public b(C16532g gVar) {
                this.f115243a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f115243a.collect(new a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseImpl$userLocationFlow$1$locationFlow$1$3", f = "GetStoreDataUseCase.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: RB.e$g$c */
        static final class c extends l implements q<C16533h<? super LocationLatLng>, Throwable, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f115248c;

            /* renamed from: d  reason: collision with root package name */
            Object f115249d;

            /* renamed from: e  reason: collision with root package name */
            Object f115250e;

            /* renamed from: f  reason: collision with root package name */
            Object f115251f;

            /* renamed from: g  reason: collision with root package name */
            Object f115252g;

            /* renamed from: h  reason: collision with root package name */
            Object f115253h;

            /* renamed from: i  reason: collision with root package name */
            Object f115254i;

            /* renamed from: j  reason: collision with root package name */
            Object f115255j;

            /* renamed from: k  reason: collision with root package name */
            int f115256k;

            /* renamed from: l  reason: collision with root package name */
            int f115257l;

            /* renamed from: m  reason: collision with root package name */
            int f115258m;

            /* renamed from: n  reason: collision with root package name */
            int f115259n;

            /* renamed from: o  reason: collision with root package name */
            int f115260o;

            /* renamed from: p  reason: collision with root package name */
            int f115261p;

            /* renamed from: q  reason: collision with root package name */
            private /* synthetic */ Object f115262q;

            /* renamed from: r  reason: collision with root package name */
            /* synthetic */ Object f115263r;

            c(C17164e<? super c> eVar) {
                super(3, eVar);
            }

            public final Object invoke(C16533h<? super LocationLatLng> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
                c cVar = new c(eVar);
                cVar.f115262q = hVar;
                cVar.f115263r = th2;
                return cVar.invokeSuspend(C16807N.f139792a);
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
                    int r2 = r0.f115261p
                    r3 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 != r3) goto L_0x0036
                    java.lang.Object r1 = r0.f115254i
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r1 = r0.f115253h
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.lang.Object r1 = r0.f115252g
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r0.f115251f
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r0.f115250e
                    qv.e r1 = (qv.e) r1
                    java.lang.Object r1 = r0.f115249d
                    TJ.h r1 = (TJ.C16533h) r1
                    java.lang.Object r1 = r0.f115248c
                    TJ.h r1 = (TJ.C16533h) r1
                    java.lang.Object r1 = r0.f115263r
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    java.lang.Object r1 = r0.f115262q
                    TJ.h r1 = (TJ.C16533h) r1
                    XH.y.b(r20)
                    goto L_0x012a
                L_0x0036:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x003e:
                    XH.y.b(r20)
                    java.lang.Object r2 = r0.f115262q
                    TJ.h r2 = (TJ.C16533h) r2
                    java.lang.Object r4 = r0.f115263r
                    java.lang.Throwable r4 = (java.lang.Throwable) r4
                    qv.e r11 = qv.e.WARN
                    qv.d r5 = qv.d.f102012a
                    java.util.List r5 = r5.a()
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.ArrayList r12 = new java.util.ArrayList
                    r12.<init>()
                    java.util.Iterator r5 = r5.iterator()
                L_0x005c:
                    boolean r6 = r5.hasNext()
                    r13 = 0
                    if (r6 == 0) goto L_0x0074
                    java.lang.Object r6 = r5.next()
                    r7 = r6
                    qv.b r7 = (qv.C11819b) r7
                    boolean r7 = r7.b(r11, r13)
                    if (r7 == 0) goto L_0x005c
                    r12.add(r6)
                    goto L_0x005c
                L_0x0074:
                    java.util.Iterator r14 = r12.iterator()
                    r15 = 0
                    r7 = r12
                    r5 = r15
                    r6 = r5
                L_0x007c:
                    boolean r8 = r14.hasNext()
                    if (r8 == 0) goto L_0x0103
                    java.lang.Object r16 = r14.next()
                    r7 = r16
                    qv.b r7 = (qv.C11819b) r7
                    if (r5 != 0) goto L_0x009c
                    java.lang.String r8 = "Failed to get location updates"
                    java.lang.String r8 = qv.C11818a.a(r8, r4)
                    if (r8 != 0) goto L_0x0098
                    r7 = r16
                    goto L_0x0103
                L_0x0098:
                    java.lang.String r5 = qv.C11820c.a(r8)
                L_0x009c:
                    r17 = r5
                    if (r6 != 0) goto L_0x00ee
                    java.lang.Class r5 = r2.getClass()
                    java.lang.String r5 = r5.getName()
                    kotlin.jvm.internal.C17542s.g(r5)
                    r6 = 36
                    r8 = 2
                    java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r8, r15)
                    r9 = 46
                    java.lang.String r6 = HJ.C15854t.o1(r6, r9, r15, r8, r15)
                    int r8 = r6.length()
                    if (r8 != 0) goto L_0x00bf
                    goto L_0x00c5
                L_0x00bf:
                    java.lang.String r5 = "Kt"
                    java.lang.String r5 = HJ.C15854t.P0(r6, r5)
                L_0x00c5:
                    java.lang.Thread r6 = java.lang.Thread.currentThread()
                    java.lang.String r6 = r6.getName()
                    java.lang.String r8 = "main"
                    boolean r6 = HJ.C15854t.b0(r6, r8, r3)
                    if (r6 == 0) goto L_0x00d8
                    java.lang.String r6 = "m"
                    goto L_0x00da
                L_0x00d8:
                    java.lang.String r6 = "b"
                L_0x00da:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r6)
                    java.lang.String r6 = "|"
                    r8.append(r6)
                    r8.append(r5)
                    java.lang.String r6 = r8.toString()
                L_0x00ee:
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
                    goto L_0x007c
                L_0x0103:
                    r0.f115262q = r2
                    r0.f115263r = r4
                    r0.f115248c = r2
                    r0.f115249d = r2
                    r0.f115250e = r11
                    r0.f115251f = r5
                    r0.f115252g = r6
                    r0.f115253h = r12
                    r0.f115254i = r14
                    r0.f115255j = r7
                    r0.f115256k = r13
                    r0.f115257l = r13
                    r0.f115258m = r13
                    r0.f115259n = r13
                    r0.f115260o = r13
                    r0.f115261p = r3
                    java.lang.Object r2 = r2.emit(r15, r0)
                    if (r2 != r1) goto L_0x012a
                    return r1
                L_0x012a:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: RB.C13508e.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C16532g<Boolean> gVar, C13508e eVar, C17164e<? super g> eVar2) {
            super(2, eVar2);
            this.f115236i = gVar;
            this.f115237j = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f115236i, this.f115237j, eVar);
            gVar.f115235h = obj;
            return gVar;
        }

        public final Object invoke(C16533h<? super LocationLatLng> hVar, C17164e<? super C16807N> eVar) {
            return ((g) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f115234g
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0033
                if (r1 == r4) goto L_0x002b
                if (r1 != r3) goto L_0x0023
                java.lang.Object r0 = r7.f115232e
                RB.e r0 = (RB.C13508e) r0
                java.lang.Object r0 = r7.f115231d
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r7.f115230c
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r7.f115235h
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r8)
                goto L_0x0071
            L_0x0023:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x002b:
                java.lang.Object r1 = r7.f115235h
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r8)
                goto L_0x0046
            L_0x0033:
                XH.y.b(r8)
                java.lang.Object r8 = r7.f115235h
                r1 = r8
                TJ.h r1 = (TJ.C16533h) r1
                r7.f115235h = r1
                r7.f115234g = r4
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L_0x0046
                return r0
            L_0x0046:
                TJ.g<java.lang.Boolean> r8 = r7.f115236i
                RB.e r4 = r7.f115237j
                RB.e$g$a r5 = new RB.e$g$a
                r5.<init>(r2, r1, r4)
                TJ.g r2 = TJ.C16534i.g0(r8, r5)
                r5 = 5000(0x1388, double:2.4703E-320)
                TJ.g r2 = RB.C13509f.b(r2, r5)
                TJ.g r2 = TJ.C16534i.s(r2)
                r7.f115235h = r1
                r7.f115230c = r2
                r7.f115231d = r8
                r7.f115232e = r4
                r8 = 0
                r7.f115233f = r8
                r7.f115234g = r3
                java.lang.Object r8 = TJ.C16534i.x(r1, r2, r7)
                if (r8 != r0) goto L_0x0071
                return r0
            L_0x0071:
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: RB.C13508e.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13508e(C12863d dVar, C13505b bVar, ap.f fVar, C13018a aVar, n nVar) {
        C17542s.j(dVar, "storeRepository");
        C17542s.j(bVar, "getStockDataUseCase");
        C17542s.j(fVar, "getUserLocationUseCase");
        C17542s.j(aVar, "getAmenityOpeningHoursUseCase");
        C17542s.j(nVar, "uiModelMapper");
        this.f115189a = dVar;
        this.f115190b = bVar;
        this.f115191c = fVar;
        this.f115192d = aVar;
        this.f115193e = nVar;
    }

    private final C16532g<Map<String, List<C13018a.C2677a.C2678a>>> f(C16532g<? extends List<C12831c>> gVar) {
        return C16534i.F(gVar, new d(this, (C17164e<? super d>) null));
    }

    private final C16532g<List<C13505b.a>> g(String str) {
        return C16534i.g(this.f115190b.a(str), new C2833e((C17164e<? super C2833e>) null));
    }

    public C16532g<x<List<PB.g>>> a(boolean z10, String str, C16532g<Boolean> gVar) {
        C17542s.j(gVar, "includeUserLocation");
        C16532g<List<C12831c>> h10 = h(z10);
        return C16534i.g(C16534i.s(C16534i.l(h10, str != null ? g(str) : C16534i.J(C16877v.n()), i(gVar), str == null ? f(h10) : C16534i.J(X.j()), new b(this, (C17164e<? super b>) null))), new c((C17164e<? super c>) null));
    }

    public final C16532g<List<C12831c>> h(boolean z10) {
        return C16534i.H(new f(this, z10, (C17164e<? super f>) null));
    }

    public final C16532g<LocationLatLng> i(C16532g<Boolean> gVar) {
        C17542s.j(gVar, "includeLocation");
        return C16534i.H(new g(gVar, this, (C17164e<? super g>) null));
    }
}
