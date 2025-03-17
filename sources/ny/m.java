package Ny;

import Il.d;
import Rl.e;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import aA.C13909a;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import nI.r;
import ug.k;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LNy/m;", "", "LRy/a;", "settingsRepo", "LaA/a;", "sessionManager", "Lug/k;", "labsFeatures", "LIl/d;", "marketConfigRepository", "<init>", "(LRy/a;LaA/a;Lug/k;LIl/d;)V", "LTJ/g;", "LNy/m$a$a;", "b", "()LTJ/g;", "a", "LRy/a;", "LaA/a;", "c", "Lug/k;", "d", "LIl/d;", "e", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: e  reason: collision with root package name */
    public static final a f112634e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f112635f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Ry.a f112636a;

    /* renamed from: b  reason: collision with root package name */
    private final C13909a f112637b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k f112638c;

    /* renamed from: d  reason: collision with root package name */
    private final d f112639d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LNy/m$a;", "", "<init>", "()V", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u0018\u0010%¨\u0006&"}, d2 = {"LNy/m$a$a;", "", "", "storeName", "", "isCouponsEnabled", "isCoWorkerDiscountEnabled", "isUserEmailRequired", "showTotalPricesInclVat", "showPriceDisclaimer", "isTimeSlotManagementEnabled", "isOnGoingOrdersScreenEnabled", "Lkp/d;", "currencyConfig", "<init>", "(Ljava/lang/String;ZZZZZZZLkp/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Z", "f", "()Z", "c", "e", "i", "g", "h", "Lkp/d;", "()Lkp/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ny.m$a$a  reason: collision with other inner class name */
        public static final class C2775a {

            /* renamed from: a  reason: collision with root package name */
            private final String f112640a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f112641b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f112642c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f112643d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f112644e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f112645f;

            /* renamed from: g  reason: collision with root package name */
            private final boolean f112646g;

            /* renamed from: h  reason: collision with root package name */
            private final boolean f112647h;

            /* renamed from: i  reason: collision with root package name */
            private final C11522d f112648i;

            public C2775a() {
                this((String) null, false, false, false, false, false, false, false, (C11522d) null, 511, (DefaultConstructorMarker) null);
            }

            public final C11522d a() {
                return this.f112648i;
            }

            public final boolean b() {
                return this.f112645f;
            }

            public final boolean c() {
                return this.f112644e;
            }

            public final String d() {
                return this.f112640a;
            }

            public final boolean e() {
                return this.f112642c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2775a)) {
                    return false;
                }
                C2775a aVar = (C2775a) obj;
                return C17542s.e(this.f112640a, aVar.f112640a) && this.f112641b == aVar.f112641b && this.f112642c == aVar.f112642c && this.f112643d == aVar.f112643d && this.f112644e == aVar.f112644e && this.f112645f == aVar.f112645f && this.f112646g == aVar.f112646g && this.f112647h == aVar.f112647h && C17542s.e(this.f112648i, aVar.f112648i);
            }

            public final boolean f() {
                return this.f112641b;
            }

            public final boolean g() {
                return this.f112647h;
            }

            public final boolean h() {
                return this.f112646g;
            }

            public int hashCode() {
                String str = this.f112640a;
                int i10 = 0;
                int hashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f112641b)) * 31) + Boolean.hashCode(this.f112642c)) * 31) + Boolean.hashCode(this.f112643d)) * 31) + Boolean.hashCode(this.f112644e)) * 31) + Boolean.hashCode(this.f112645f)) * 31) + Boolean.hashCode(this.f112646g)) * 31) + Boolean.hashCode(this.f112647h)) * 31;
                C11522d dVar = this.f112648i;
                if (dVar != null) {
                    i10 = dVar.hashCode();
                }
                return hashCode + i10;
            }

            public final boolean i() {
                return this.f112643d;
            }

            public String toString() {
                String str = this.f112640a;
                boolean z10 = this.f112641b;
                boolean z11 = this.f112642c;
                boolean z12 = this.f112643d;
                boolean z13 = this.f112644e;
                boolean z14 = this.f112645f;
                boolean z15 = this.f112646g;
                boolean z16 = this.f112647h;
                C11522d dVar = this.f112648i;
                return "Settings(storeName=" + str + ", isCouponsEnabled=" + z10 + ", isCoWorkerDiscountEnabled=" + z11 + ", isUserEmailRequired=" + z12 + ", showTotalPricesInclVat=" + z13 + ", showPriceDisclaimer=" + z14 + ", isTimeSlotManagementEnabled=" + z15 + ", isOnGoingOrdersScreenEnabled=" + z16 + ", currencyConfig=" + dVar + ")";
            }

            public C2775a(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, C11522d dVar) {
                this.f112640a = str;
                this.f112641b = z10;
                this.f112642c = z11;
                this.f112643d = z12;
                this.f112644e = z13;
                this.f112645f = z14;
                this.f112646g = z15;
                this.f112647h = z16;
                this.f112648i = dVar;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C2775a(java.lang.String r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, kp.C11522d r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
                /*
                    r11 = this;
                    r0 = r21
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r1 = r2
                    goto L_0x000a
                L_0x0009:
                    r1 = r12
                L_0x000a:
                    r3 = r0 & 2
                    r4 = 0
                    if (r3 == 0) goto L_0x0011
                    r3 = r4
                    goto L_0x0012
                L_0x0011:
                    r3 = r13
                L_0x0012:
                    r5 = r0 & 4
                    if (r5 == 0) goto L_0x0018
                    r5 = r4
                    goto L_0x0019
                L_0x0018:
                    r5 = r14
                L_0x0019:
                    r6 = r0 & 8
                    if (r6 == 0) goto L_0x001f
                    r6 = r4
                    goto L_0x0020
                L_0x001f:
                    r6 = r15
                L_0x0020:
                    r7 = r0 & 16
                    if (r7 == 0) goto L_0x0026
                    r7 = r4
                    goto L_0x0028
                L_0x0026:
                    r7 = r16
                L_0x0028:
                    r8 = r0 & 32
                    if (r8 == 0) goto L_0x002e
                    r8 = r4
                    goto L_0x0030
                L_0x002e:
                    r8 = r17
                L_0x0030:
                    r9 = r0 & 64
                    if (r9 == 0) goto L_0x0036
                    r9 = r4
                    goto L_0x0038
                L_0x0036:
                    r9 = r18
                L_0x0038:
                    r10 = r0 & 128(0x80, float:1.794E-43)
                    if (r10 == 0) goto L_0x003d
                    goto L_0x003f
                L_0x003d:
                    r4 = r19
                L_0x003f:
                    r0 = r0 & 256(0x100, float:3.59E-43)
                    if (r0 == 0) goto L_0x0044
                    goto L_0x0046
                L_0x0044:
                    r2 = r20
                L_0x0046:
                    r12 = r11
                    r13 = r1
                    r14 = r3
                    r15 = r5
                    r16 = r6
                    r17 = r7
                    r18 = r8
                    r19 = r9
                    r20 = r4
                    r21 = r2
                    r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Ny.m.a.C2775a.<init>(java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kp.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "scanAndGoSettings", "", "isEmployee", "LRl/e;", "marketConfig", "LNy/m$a$a;", "<anonymous>", "(Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;ZLRl/e;)LNy/m$a$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.SettingsOrchestrator$asStateFlow$1", f = "SettingsOrchestrator.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements r<ScanAndGoSettings, Boolean, e, C17164e<? super a.C2775a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112649c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f112650d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f112651e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f112652f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m f112653g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar, C17164e<? super b> eVar) {
            super(4, eVar);
            this.f112653g = mVar;
        }

        public final Object i(ScanAndGoSettings scanAndGoSettings, boolean z10, e eVar, C17164e<? super a.C2775a> eVar2) {
            b bVar = new b(this.f112653g, eVar2);
            bVar.f112650d = scanAndGoSettings;
            bVar.f112651e = z10;
            bVar.f112652f = eVar;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0075  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                eI.C17187b.f()
                int r0 = r14.f112649c
                if (r0 != 0) goto L_0x008b
                XH.y.b(r15)
                java.lang.Object r15 = r14.f112650d
                com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r15 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r15
                boolean r0 = r14.f112651e
                java.lang.Object r1 = r14.f112652f
                Rl.e r1 = (Rl.e) r1
                r2 = 0
                if (r15 == 0) goto L_0x001d
                java.lang.String r3 = r15.n()
                r5 = r3
                goto L_0x001e
            L_0x001d:
                r5 = r2
            L_0x001e:
                r3 = 0
                if (r15 == 0) goto L_0x0027
                boolean r4 = r15.q()
                r6 = r4
                goto L_0x0028
            L_0x0027:
                r6 = r3
            L_0x0028:
                r4 = 1
                if (r0 == 0) goto L_0x0035
                if (r15 == 0) goto L_0x0035
                boolean r0 = r15.r()
                if (r0 != r4) goto L_0x0035
                r7 = r4
                goto L_0x0036
            L_0x0035:
                r7 = r3
            L_0x0036:
                if (r15 == 0) goto L_0x003d
                boolean r0 = r15.h()
                goto L_0x003e
            L_0x003d:
                r0 = r3
            L_0x003e:
                if (r0 != 0) goto L_0x004d
                if (r15 == 0) goto L_0x0047
                boolean r0 = r15.f()
                goto L_0x0048
            L_0x0047:
                r0 = r3
            L_0x0048:
                if (r0 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r8 = r3
                goto L_0x004e
            L_0x004d:
                r8 = r4
            L_0x004e:
                if (r15 == 0) goto L_0x0056
                boolean r0 = r15.m()
                r9 = r0
                goto L_0x0057
            L_0x0056:
                r9 = r3
            L_0x0057:
                if (r15 == 0) goto L_0x0069
                boolean r0 = r15.e()
                if (r0 == 0) goto L_0x0066
                boolean r0 = r15.f()
                if (r0 == 0) goto L_0x0066
                goto L_0x0067
            L_0x0066:
                r4 = r3
            L_0x0067:
                r10 = r4
                goto L_0x006a
            L_0x0069:
                r10 = r3
            L_0x006a:
                if (r15 == 0) goto L_0x0072
                boolean r15 = r15.j()
                r11 = r15
                goto L_0x0073
            L_0x0072:
                r11 = r3
            L_0x0073:
                if (r1 == 0) goto L_0x0079
                kp.d r2 = r1.c()
            L_0x0079:
                r13 = r2
                Ny.m r15 = r14.f112653g
                ug.k r15 = r15.f112638c
                boolean r12 = r15.i()
                Ny.m$a$a r15 = new Ny.m$a$a
                r4 = r15
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r15
            L_0x008b:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: Ny.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((ScanAndGoSettings) obj, ((Boolean) obj2).booleanValue(), (e) obj3, (C17164e) obj4);
        }
    }

    public m(Ry.a aVar, C13909a aVar2, k kVar, d dVar) {
        C17542s.j(aVar, "settingsRepo");
        C17542s.j(aVar2, "sessionManager");
        C17542s.j(kVar, "labsFeatures");
        C17542s.j(dVar, "marketConfigRepository");
        this.f112636a = aVar;
        this.f112637b = aVar2;
        this.f112638c = kVar;
        this.f112639d = dVar;
    }

    public final C16532g<a.C2775a> b() {
        return C16534i.m(this.f112636a.b(), this.f112637b.j(), this.f112639d.d(), new b(this, (C17164e<? super b>) null));
    }
}
