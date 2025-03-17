package WB;

import GB.C12918c;
import GB.h;
import HB.C12962b;
import HJ.C15854t;
import IB.C13018a;
import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import Sr.a;
import TJ.C16532g;
import TJ.C16534i;
import WB.C13775g;
import WB.j;
import XH.C16807N;
import XH.v;
import YH.C16877v;
import bC.C14000a;
import dI.C17164e;
import ft.C11285c;
import gC.C14508a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u001a\u001a\u00020\u0019*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J1\u0010-\u001a\u00020,2\b\u0010'\u001a\u0004\u0018\u00010!2\u0006\u0010(\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0001¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010:¨\u0006;"}, d2 = {"LWB/b;", "LWB/a;", "LSr/a;", "getMarketSpecificMapConfigUseCase", "LIB/a;", "getAmenityOpeningHoursUseCase", "LgC/a;", "getOpeningHoursHeaderUseCase", "LHB/b;", "storeDetailsRepository", "LbC/a;", "openingHoursMapper", "LWB/c;", "smallStoreDetailsMapper", "Lft/c;", "repository", "<init>", "(LSr/a;LIB/a;LgC/a;LHB/b;LbC/a;LWB/c;Lft/c;)V", "LGB/h;", "LSr/a$a;", "marketSpecificMapConfig", "LgC/a$a;", "openingHoursHeader", "", "firstTimeSmallStoreShown", "LWB/j$a;", "i", "(LGB/h;LSr/a$a;LgC/a$a;Z)LWB/j$a;", "", "LIB/a$a;", "LIB/a$a$a;", "h", "(Ljava/util/List;)LIB/a$a$a;", "", "storeId", "LTJ/g;", "LWB/j;", "a", "(Ljava/lang/String;)LTJ/g;", "customNavigationUrl", "poiName", "", "poiLatitude", "poiLongitude", "LWB/g$a;", "g", "(Ljava/lang/String;Ljava/lang/String;DD)LWB/g$a;", "LSr/a;", "b", "LIB/a;", "c", "LgC/a;", "d", "LHB/b;", "e", "LbC/a;", "f", "LWB/c;", "Lft/c;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WB.b  reason: case insensitive filesystem */
public final class C13770b implements C13769a {

    /* renamed from: a  reason: collision with root package name */
    private final Sr.a f117504a;

    /* renamed from: b  reason: collision with root package name */
    private final C13018a f117505b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C14508a f117506c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C12962b f117507d;

    /* renamed from: e  reason: collision with root package name */
    private final C14000a f117508e;

    /* renamed from: f  reason: collision with root package name */
    private final C13771c f117509f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C11285c f117510g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "LIB/a$a;", "amenityOpeningHoursResults", "LSr/a$a;", "marketSpecificMapConfig", "LWB/j;", "<anonymous>", "(Ljava/util/List;LSr/a$a;)LWB/j;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.storedetails.impl.map.presentation.GetStoreDataUseCaseImpl$invoke$1", f = "GetStoreDataUseCase.kt", l = {59, 62, 64}, m = "invokeSuspend")
    /* renamed from: WB.b$a */
    static final class a extends l implements q<List<? extends C13018a.C2677a>, a.C1810a, C17164e<? super j>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f117511c;

        /* renamed from: d  reason: collision with root package name */
        Object f117512d;

        /* renamed from: e  reason: collision with root package name */
        Object f117513e;

        /* renamed from: f  reason: collision with root package name */
        Object f117514f;

        /* renamed from: g  reason: collision with root package name */
        Object f117515g;

        /* renamed from: h  reason: collision with root package name */
        Object f117516h;

        /* renamed from: i  reason: collision with root package name */
        int f117517i;

        /* renamed from: j  reason: collision with root package name */
        int f117518j;

        /* renamed from: k  reason: collision with root package name */
        int f117519k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f117520l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f117521m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C13770b f117522n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f117523o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13770b bVar, String str, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f117522n = bVar;
            this.f117523o = str;
        }

        /* renamed from: i */
        public final Object invoke(List<C13018a.C2677a> list, a.C1810a aVar, C17164e<? super j> eVar) {
            a aVar2 = new a(this.f117522n, this.f117523o, eVar);
            aVar2.f117520l = list;
            aVar2.f117521m = aVar;
            return aVar2.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: Sr.a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: gC.a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: Sr.a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0125  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0151  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r1 = r20
                r2 = 1
                java.lang.Object r3 = eI.C17187b.f()
                int r0 = r1.f117519k
                r4 = 3
                r5 = 2
                r6 = 0
                r7 = 0
                if (r0 == 0) goto L_0x0089
                if (r0 == r2) goto L_0x0063
                if (r0 == r5) goto L_0x003c
                if (r0 != r4) goto L_0x0034
                int r0 = r1.f117518j
                java.lang.Object r3 = r1.f117515g
                GB.h r3 = (GB.h) r3
                java.lang.Object r4 = r1.f117514f
                WB.b r4 = (WB.C13770b) r4
                java.lang.Object r4 = r1.f117513e
                WB.b r4 = (WB.C13770b) r4
                java.lang.Object r5 = r1.f117511c
                gC.a$a r5 = (gC.C14508a.C3116a) r5
                java.lang.Object r7 = r1.f117521m
                Sr.a$a r7 = (Sr.a.C1810a) r7
                java.lang.Object r8 = r1.f117520l
                java.util.List r8 = (java.util.List) r8
                XH.y.b(r21)
                goto L_0x0149
            L_0x0034:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x003c:
                int r0 = r1.f117517i
                java.lang.Object r5 = r1.f117515g
                GB.h r5 = (GB.h) r5
                java.lang.Object r7 = r1.f117514f
                WB.b r7 = (WB.C13770b) r7
                java.lang.Object r8 = r1.f117513e
                WB.b r8 = (WB.C13770b) r8
                java.lang.Object r9 = r1.f117512d
                java.lang.Object r10 = r1.f117511c
                gC.a$a r10 = (gC.C14508a.C3116a) r10
                java.lang.Object r11 = r1.f117521m
                Sr.a$a r11 = (Sr.a.C1810a) r11
                java.lang.Object r12 = r1.f117520l
                java.util.List r12 = (java.util.List) r12
                XH.y.b(r21)
                r13 = r12
                r12 = r9
                r9 = r7
                r7 = r5
                r5 = r21
                goto L_0x011b
            L_0x0063:
                java.lang.Object r0 = r1.f117514f
                WB.b r0 = (WB.C13770b) r0
                java.lang.Object r0 = r1.f117513e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f117512d
                WB.b r0 = (WB.C13770b) r0
                java.lang.Object r0 = r1.f117511c
                r8 = r0
                gC.a$a r8 = (gC.C14508a.C3116a) r8
                java.lang.Object r0 = r1.f117521m
                r9 = r0
                Sr.a$a r9 = (Sr.a.C1810a) r9
                java.lang.Object r0 = r1.f117520l
                r10 = r0
                java.util.List r10 = (java.util.List) r10
                XH.y.b(r21)     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r0 = r21
                goto L_0x00ce
            L_0x0084:
                r0 = move-exception
                goto L_0x00db
            L_0x0086:
                r0 = move-exception
                goto L_0x0202
            L_0x0089:
                XH.y.b(r21)
                java.lang.Object r0 = r1.f117520l
                r10 = r0
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r0 = r1.f117521m
                r9 = r0
                Sr.a$a r9 = (Sr.a.C1810a) r9
                WB.b r0 = r1.f117522n
                IB.a$a$a r0 = r0.h(r10)
                if (r0 == 0) goto L_0x00aa
                WB.b r8 = r1.f117522n
                gC.a r8 = r8.f117506c
                gC.a$a r0 = r8.a(r0)
                r8 = r0
                goto L_0x00ab
            L_0x00aa:
                r8 = r7
            L_0x00ab:
                WB.b r0 = r1.f117522n
                java.lang.String r11 = r1.f117523o
                XH.x$a r12 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                HB.b r12 = r0.f117507d     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r1.f117520l = r10     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r1.f117521m = r9     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r1.f117511c = r8     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r1.f117512d = r0     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r1.f117513e = r11     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r1.f117514f = r0     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r1.f117517i = r6     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r1.f117518j = r6     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                r1.f117519k = r2     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                java.lang.Object r0 = r12.a(r11, r1)     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                if (r0 != r3) goto L_0x00ce
                return r3
            L_0x00ce:
                GB.h r0 = (GB.h) r0     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0086, all -> 0x0084 }
            L_0x00d4:
                r12 = r10
                r19 = r9
                r9 = r0
                r0 = r19
                goto L_0x00e6
            L_0x00db:
                XH.x$a r11 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
                goto L_0x00d4
            L_0x00e6:
                WB.b r10 = r1.f117522n
                java.lang.Throwable r11 = XH.x.e(r9)
                if (r11 != 0) goto L_0x0158
                r7 = r9
                GB.h r7 = (GB.h) r7
                ft.c r11 = r10.f117510g
                TJ.g r11 = r11.b()
                r1.f117520l = r12
                r1.f117521m = r0
                r1.f117511c = r8
                r1.f117512d = r9
                r1.f117513e = r10
                r1.f117514f = r10
                r1.f117515g = r7
                r1.f117516h = r9
                r1.f117517i = r6
                r1.f117519k = r5
                java.lang.Object r5 = TJ.C16534i.B(r11, r1)
                if (r5 != r3) goto L_0x0114
                return r3
            L_0x0114:
                r11 = r0
                r0 = r6
                r13 = r12
                r12 = r9
                r9 = r10
                r10 = r8
                r8 = r9
            L_0x011b:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                r14 = r5 ^ 1
                if (r5 != 0) goto L_0x014e
                ft.c r5 = r8.f117510g
                r1.f117520l = r13
                r1.f117521m = r11
                r1.f117511c = r10
                r1.f117512d = r12
                r1.f117513e = r8
                r1.f117514f = r9
                r1.f117515g = r7
                r1.f117517i = r0
                r1.f117518j = r14
                r1.f117519k = r4
                java.lang.Object r0 = r5.a(r2, r1)
                if (r0 != r3) goto L_0x0144
                return r3
            L_0x0144:
                r3 = r7
                r4 = r8
                r5 = r10
                r7 = r11
                r0 = r14
            L_0x0149:
                r14 = r0
                r8 = r4
                r10 = r5
                r11 = r7
                r7 = r3
            L_0x014e:
                if (r14 == 0) goto L_0x0151
                goto L_0x0152
            L_0x0151:
                r2 = r6
            L_0x0152:
                WB.j$a r0 = r8.i(r7, r11, r10, r2)
                goto L_0x0201
            L_0x0158:
                qv.e r0 = qv.e.WARN
                qv.d r3 = qv.d.f102012a
                java.util.List r3 = r3.a()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x016b:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x0182
                java.lang.Object r8 = r3.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r0, r6)
                if (r9 == 0) goto L_0x016b
                r4.add(r8)
                goto L_0x016b
            L_0x0182:
                java.util.Iterator r3 = r4.iterator()
                r4 = r7
                r6 = r4
            L_0x0188:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x01ff
                java.lang.Object r8 = r3.next()
                r13 = r8
                qv.b r13 = (qv.C11819b) r13
                if (r4 != 0) goto L_0x01a4
                java.lang.String r4 = "Failed to get store details"
                java.lang.String r4 = qv.C11818a.a(r4, r11)
                if (r4 != 0) goto L_0x01a0
                goto L_0x01ff
            L_0x01a0:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x01a4:
                if (r6 != 0) goto L_0x01f3
                java.lang.Class r6 = r10.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r8 = 36
                java.lang.String r8 = HJ.C15854t.s1(r6, r8, r7, r5, r7)
                r9 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r9, r7, r5, r7)
                int r9 = r8.length()
                if (r9 != 0) goto L_0x01c4
                goto L_0x01ca
            L_0x01c4:
                java.lang.String r6 = "Kt"
                java.lang.String r6 = HJ.C15854t.P0(r8, r6)
            L_0x01ca:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                java.lang.String r9 = "main"
                boolean r8 = HJ.C15854t.b0(r8, r9, r2)
                if (r8 == 0) goto L_0x01dd
                java.lang.String r8 = "m"
                goto L_0x01df
            L_0x01dd:
                java.lang.String r8 = "b"
            L_0x01df:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r8)
                java.lang.String r8 = "|"
                r9.append(r8)
                r9.append(r6)
                java.lang.String r6 = r9.toString()
            L_0x01f3:
                r16 = 0
                r14 = r0
                r15 = r6
                r17 = r11
                r18 = r4
                r13.a(r14, r15, r16, r17, r18)
                goto L_0x0188
            L_0x01ff:
                WB.j$b r0 = WB.j.b.f117543a
            L_0x0201:
                return r0
            L_0x0202:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: WB.C13770b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13770b(Sr.a aVar, C13018a aVar2, C14508a aVar3, C12962b bVar, C14000a aVar4, C13771c cVar, C11285c cVar2) {
        C17542s.j(aVar, "getMarketSpecificMapConfigUseCase");
        C17542s.j(aVar2, "getAmenityOpeningHoursUseCase");
        C17542s.j(aVar3, "getOpeningHoursHeaderUseCase");
        C17542s.j(bVar, "storeDetailsRepository");
        C17542s.j(aVar4, "openingHoursMapper");
        C17542s.j(cVar, "smallStoreDetailsMapper");
        C17542s.j(cVar2, "repository");
        this.f117504a = aVar;
        this.f117505b = aVar2;
        this.f117506c = aVar3;
        this.f117507d = bVar;
        this.f117508e = aVar4;
        this.f117509f = cVar;
        this.f117510g = cVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: IB.a$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: IB.a$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: IB.a$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: IB.a$a$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final IB.C13018a.C2677a.C2678a h(java.util.List<IB.C13018a.C2677a> r5) {
        /*
            r4 = this;
            java.lang.Object r5 = YH.C16877v.y0(r5)
            IB.a$a r5 = (IB.C13018a.C2677a) r5
            r0 = 0
            if (r5 == 0) goto L_0x002d
            java.util.List r5 = r5.a()
            if (r5 == 0) goto L_0x002d
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0015:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r5.next()
            r2 = r1
            IB.a$a$a r2 = (IB.C13018a.C2677a.C2678a) r2
            GB.a$a r2 = r2.h()
            GB.a$a r3 = GB.C12916a.C2641a.STORE
            if (r2 != r3) goto L_0x0015
            r0 = r1
        L_0x002b:
            IB.a$a$a r0 = (IB.C13018a.C2677a.C2678a) r0
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: WB.C13770b.h(java.util.List):IB.a$a$a");
    }

    /* access modifiers changed from: private */
    public final j.a i(h hVar, a.C1810a aVar, C14508a.C3116a aVar2, boolean z10) {
        Object obj;
        List<v<C13023e, C15987c<C13023e>>> list;
        List<C12918c.b> d10;
        Iterator it = hVar.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C12918c) obj).e() == C12918c.C2642c.STORE) {
                break;
            }
        }
        C12918c cVar = (C12918c) obj;
        if (cVar == null || (d10 = cVar.d()) == null || (list = this.f117508e.g(d10)) == null) {
            list = C16877v.n();
        }
        String e10 = hVar.e();
        String c10 = hVar.c();
        return new j.a(e10, aVar2, C15985a.h(list), c10, new C13775g(aVar, new C13774f(hVar.d().a(), hVar.d().b()), g(aVar.b(), hVar.e(), hVar.d().a(), hVar.d().b()), C16877v.e(new h(new C13774f(hVar.d().a(), hVar.d().b())))), this.f117509f.b(hVar.b(), z10));
    }

    public C16532g<j> a(String str) {
        C17542s.j(str, "storeId");
        return C16534i.n(this.f117505b.a(C16877v.e(str)), this.f117504a.invoke(), new a(this, str, (C17164e<? super a>) null));
    }

    public final C13775g.a g(String str, String str2, double d10, double d11) {
        String str3 = str2;
        C17542s.j(str2, "poiName");
        if (str != null) {
            return new C13775g.a.C2901a(C15854t.Q(C15854t.Q(C15854t.Q(str, "$SEARCH_QUERY", str2, false, 4, (Object) null), "$LAT", String.valueOf(d10), false, 4, (Object) null), "$LNG", String.valueOf(d11), false, 4, (Object) null));
        }
        return new C13775g.a.b("https://www.google.com/maps/dir/?api=1&destination=" + d10 + "," + d11);
    }
}
