package nu;

import EB.C12832d;
import FB.C12860a;
import HB.C12961a;
import IB.C13018a;
import QJ.M;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import gu.C11362c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import nu.e;
import zt.C12554a;
import zu.C12555a;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010#J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010#J#\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0 0(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010#J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020)0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010#J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020)0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010#J\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b1\u0010#J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020)0 H\u0002¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020)0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b4\u0010#J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020)0 H\u0002¢\u0006\u0004\b5\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010LR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010PR\u001c\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0N8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010P¨\u0006T"}, d2 = {"Lnu/f;", "Lnu/e;", "LFB/a;", "localStoreSelectionRepository", "Lru/c;", "wayfindingIntegration", "LCt/e;", "getFoodMobileDataUseCase", "LCt/c;", "getFoodMobileOrderForCurrentStore", "Lgu/c;", "getStoreEventsUseCase", "Lzu/a;", "getWayfindingDetailsUseCase", "LHB/a;", "popularTimesRepository", "LIB/a;", "getAmenityOpeningHoursUseCase", "Lnu/i;", "getStoreOffersUseCase", "LQJ/M;", "ioDispatcher", "Lnu/c;", "getOnboardingScreensUseCase", "LNt/a;", "getStoreBenefitsUseCase", "Lnu/k;", "hasSmallStoreBeenShownUseCase", "<init>", "(LFB/a;Lru/c;LCt/e;LCt/c;Lgu/c;Lzu/a;LHB/a;LIB/a;Lnu/i;LQJ/M;Lnu/c;LNt/a;Lnu/k;)V", "LEB/d;", "storeSelection", "LTJ/g;", "Lnu/e$a$b;", "m", "(LEB/d;)LTJ/g;", "Lnu/e$a$f;", "n", "Lnu/e$a$j;", "u", "", "Lnu/e$a;", "o", "(LEB/d;)Ljava/util/List;", "Lnu/e$a$a;", "l", "s", "p", "Lnu/e$a$i;", "t", "r", "()LTJ/g;", "q", "invoke", "a", "LFB/a;", "b", "Lru/c;", "c", "LCt/e;", "d", "LCt/c;", "e", "Lgu/c;", "f", "Lzu/a;", "g", "LHB/a;", "h", "LIB/a;", "i", "Lnu/i;", "j", "LQJ/M;", "k", "Lnu/c;", "LNt/a;", "Lnu/k;", "LTJ/B;", "", "LTJ/B;", "isStoreOpenFlow", "Lzt/a;", "foodMobileDataFlow", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f100229a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ru.c f100230b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Ct.e f100231c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Ct.c f100232d;

    /* renamed from: e  reason: collision with root package name */
    private final C11362c f100233e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C12555a f100234f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C12961a f100235g;

    /* renamed from: h  reason: collision with root package name */
    private final C13018a f100236h;

    /* renamed from: i  reason: collision with root package name */
    private final i f100237i;

    /* renamed from: j  reason: collision with root package name */
    private final M f100238j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C11678c f100239k;

    /* renamed from: l  reason: collision with root package name */
    private final Nt.a f100240l;

    /* renamed from: m  reason: collision with root package name */
    private final k f100241m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16505B<Boolean> f100242n = C16521S.a(Boolean.FALSE);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<C12554a> f100243o = C16521S.a(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$foodMobileFlow$$inlined$flatMapLatest$1", f = "GetSelectedStoreUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super e.a.C2326a>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100244c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100245d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100246e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f100247f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12832d f100248g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, f fVar, C12832d dVar) {
            super(3, eVar);
            this.f100247f = fVar;
            this.f100248g = dVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super e.a.C2326a> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f100247f, this.f100248g);
            aVar.f100245d = hVar;
            aVar.f100246e = bool;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100244c;
            if (i10 == 0) {
                y.b(obj);
                ((Boolean) this.f100246e).booleanValue();
                b bVar = new b(this.f100247f.f100232d.invoke(), this.f100247f, this.f100248g);
                this.f100244c = 1;
                if (C16534i.x((C16533h) this.f100245d, bVar, this) == f10) {
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
    public static final class b implements C16532g<e.a.C2326a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f100250b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12832d f100251c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100252a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f100253b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C12832d f100254c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$foodMobileFlow$lambda$9$$inlined$map$1$2", f = "GetSelectedStoreUseCase.kt", l = {52, 50}, m = "emit")
            /* renamed from: nu.f$b$a$a  reason: collision with other inner class name */
            public static final class C2328a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100255c;

                /* renamed from: d  reason: collision with root package name */
                int f100256d;

                /* renamed from: e  reason: collision with root package name */
                Object f100257e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f100258f;

                /* renamed from: g  reason: collision with root package name */
                Object f100259g;

                /* renamed from: h  reason: collision with root package name */
                Object f100260h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2328a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100258f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100255c = obj;
                    this.f100256d |= Integer.MIN_VALUE;
                    return this.f100258f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, f fVar, C12832d dVar) {
                this.f100252a = hVar;
                this.f100253b = fVar;
                this.f100254c = dVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r14, dI.C17164e r15) {
                /*
                    r13 = this;
                    boolean r0 = r15 instanceof nu.f.b.a.C2328a
                    if (r0 == 0) goto L_0x0013
                    r0 = r15
                    nu.f$b$a$a r0 = (nu.f.b.a.C2328a) r0
                    int r1 = r0.f100256d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100256d = r1
                    goto L_0x0018
                L_0x0013:
                    nu.f$b$a$a r0 = new nu.f$b$a$a
                    r0.<init>(r13, r15)
                L_0x0018:
                    java.lang.Object r15 = r0.f100255c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100256d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x004b
                    if (r2 == r4) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    XH.y.b(r15)
                    goto L_0x00ba
                L_0x002d:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r15)
                    throw r14
                L_0x0035:
                    java.lang.Object r14 = r0.f100260h
                    dt.a r14 = (dt.C11240a) r14
                    java.lang.Object r2 = r0.f100259g
                    TJ.h r2 = (TJ.C16533h) r2
                    java.lang.Object r4 = r0.f100257e
                    nu.f$b$a r4 = (nu.f.b.a) r4
                    XH.y.b(r15)
                    XH.x r15 = (XH.x) r15
                    java.lang.Object r15 = r15.j()
                    goto L_0x006e
                L_0x004b:
                    XH.y.b(r15)
                    TJ.h r2 = r13.f100252a
                    dt.a r14 = (dt.C11240a) r14
                    nu.f r15 = r13.f100253b
                    Ct.e r15 = r15.f100231c
                    EB.d r5 = r13.f100254c
                    java.lang.String r5 = r5.e()
                    r0.f100257e = r13
                    r0.f100259g = r2
                    r0.f100260h = r14
                    r0.f100256d = r4
                    java.lang.Object r15 = r15.m3invokegIAlus(r5, r0)
                    if (r15 != r1) goto L_0x006d
                    return r1
                L_0x006d:
                    r4 = r13
                L_0x006e:
                    boolean r5 = XH.x.g(r15)
                    r6 = 0
                    if (r5 == 0) goto L_0x0076
                    r15 = r6
                L_0x0076:
                    Ct.e$a r15 = (Ct.e.a) r15
                    if (r15 == 0) goto L_0x009c
                    zt.a r5 = new zt.a
                    java.lang.String r8 = r15.c()
                    boolean r9 = r15.b()
                    boolean r10 = r15.a()
                    if (r14 == 0) goto L_0x0090
                    java.lang.String r14 = r14.b()
                    r11 = r14
                    goto L_0x0091
                L_0x0090:
                    r11 = r6
                L_0x0091:
                    EB.d r14 = r4.f100254c
                    java.lang.String r12 = r14.e()
                    r7 = r5
                    r7.<init>(r8, r9, r10, r11, r12)
                    goto L_0x009d
                L_0x009c:
                    r5 = r6
                L_0x009d:
                    nu.f r14 = r4.f100253b
                    TJ.B r14 = r14.f100243o
                    r14.setValue(r5)
                    nu.e$a$a r14 = new nu.e$a$a
                    r14.<init>(r5)
                    r0.f100257e = r6
                    r0.f100259g = r6
                    r0.f100260h = r6
                    r0.f100256d = r3
                    java.lang.Object r14 = r2.emit(r14, r0)
                    if (r14 != r1) goto L_0x00ba
                    return r1
                L_0x00ba:
                    XH.N r14 = XH.C16807N.f139792a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.f.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, f fVar, C12832d dVar) {
            this.f100249a = gVar;
            this.f100250b = fVar;
            this.f100251c = dVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100249a.collect(new a(hVar, this.f100250b, this.f100251c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<e.a.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f100262b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12832d f100263c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100264a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f100265b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C12832d f100266c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$getStoreDetailsFlow$$inlined$map$1$2", f = "GetSelectedStoreUseCase.kt", l = {50}, m = "emit")
            /* renamed from: nu.f$c$a$a  reason: collision with other inner class name */
            public static final class C2329a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100267c;

                /* renamed from: d  reason: collision with root package name */
                int f100268d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100269e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2329a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100269e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100267c = obj;
                    this.f100268d |= Integer.MIN_VALUE;
                    return this.f100269e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, f fVar, C12832d dVar) {
                this.f100264a = hVar;
                this.f100265b = fVar;
                this.f100266c = dVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof nu.f.c.a.C2329a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    nu.f$c$a$a r0 = (nu.f.c.a.C2329a) r0
                    int r1 = r0.f100268d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100268d = r1
                    goto L_0x0018
                L_0x0013:
                    nu.f$c$a$a r0 = new nu.f$c$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f100267c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100268d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r9)
                    goto L_0x00ad
                L_0x002a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0032:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f100264a
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Object r8 = YH.C16877v.y0(r8)
                    IB.a$a r8 = (IB.C13018a.C2677a) r8
                    if (r8 == 0) goto L_0x0073
                    java.util.List r2 = r8.a()
                    if (r2 == 0) goto L_0x0073
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.Iterator r2 = r2.iterator()
                L_0x004d:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x0063
                    java.lang.Object r4 = r2.next()
                    r5 = r4
                    IB.a$a$a r5 = (IB.C13018a.C2677a.C2678a) r5
                    GB.a$a r5 = r5.h()
                    GB.a$a r6 = GB.C12916a.C2641a.STORE
                    if (r5 != r6) goto L_0x004d
                    goto L_0x0064
                L_0x0063:
                    r4 = 0
                L_0x0064:
                    IB.a$a$a r4 = (IB.C13018a.C2677a.C2678a) r4
                    if (r4 == 0) goto L_0x0073
                    java.lang.Boolean r2 = r4.e()
                    if (r2 == 0) goto L_0x0073
                    boolean r2 = r2.booleanValue()
                    goto L_0x0074
                L_0x0073:
                    r2 = 0
                L_0x0074:
                    nu.f r4 = r7.f100265b
                    TJ.B r4 = r4.f100242n
                    java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r2)
                    r4.setValue(r2)
                    nu.e$a$f r2 = new nu.e$a$f
                    EB.d r4 = r7.f100266c
                    java.lang.String r4 = r4.e()
                    EB.d r5 = r7.f100266c
                    java.lang.String r5 = r5.getName()
                    EB.d r6 = r7.f100266c
                    boolean r6 = r6.f()
                    if (r8 == 0) goto L_0x009d
                    java.util.List r8 = r8.a()
                    if (r8 != 0) goto L_0x00a1
                L_0x009d:
                    java.util.List r8 = YH.C16877v.n()
                L_0x00a1:
                    r2.<init>(r4, r5, r6, r8)
                    r0.f100268d = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto L_0x00ad
                    return r1
                L_0x00ad:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.f.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar, f fVar, C12832d dVar) {
            this.f100261a = gVar;
            this.f100262b = fVar;
            this.f100263c = dVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100261a.collect(new a(hVar, this.f100262b, this.f100263c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetSelectedStoreUseCase.kt", l = {192, 189}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super e.a>, C12832d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100270c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100271d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100272e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f100273f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, f fVar) {
            super(3, eVar);
            this.f100273f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super e.a> hVar, C12832d dVar, C17164e<? super C16807N> eVar) {
            d dVar2 = new d(eVar, this.f100273f);
            dVar2.f100271d = hVar;
            dVar2.f100272e = dVar;
            return dVar2.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0083 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f100270c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r6)
                goto L_0x0084
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.f100271d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r6)
                goto L_0x0041
            L_0x0022:
                XH.y.b(r6)
                java.lang.Object r6 = r5.f100271d
                r1 = r6
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r6 = r5.f100272e
                EB.d r6 = (EB.C12832d) r6
                if (r6 != 0) goto L_0x004d
                nu.f r6 = r5.f100273f
                nu.c r6 = r6.f100239k
                r5.f100271d = r1
                r5.f100270c = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L_0x0041
                return r0
            L_0x0041:
                KJ.f r6 = (KJ.C15990f) r6
                nu.e$a$c r3 = new nu.e$a$c
                r3.<init>(r6)
                TJ.g r6 = TJ.C16534i.J(r3)
                goto L_0x0078
            L_0x004d:
                java.util.List r3 = YH.C16877v.c()
                nu.f r4 = r5.f100273f
                TJ.g r4 = r4.m(r6)
                r3.add(r4)
                nu.f r4 = r5.f100273f
                TJ.g r4 = r4.n(r6)
                r3.add(r4)
                nu.f r4 = r5.f100273f
                java.util.List r6 = r4.o(r6)
                java.util.Collection r6 = (java.util.Collection) r6
                r3.addAll(r6)
                java.util.List r6 = YH.C16877v.a(r3)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                TJ.g r6 = TJ.C16534i.O(r6)
            L_0x0078:
                r3 = 0
                r5.f100271d = r3
                r5.f100270c = r2
                java.lang.Object r6 = TJ.C16534i.x(r1, r6, r5)
                if (r6 != r0) goto L_0x0084
                return r0
            L_0x0084:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lnu/e$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$popularTimesLiveFlow$1", f = "GetSelectedStoreUseCase.kt", l = {278, 280}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super e.a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f100274c;

        /* renamed from: d  reason: collision with root package name */
        Object f100275d;

        /* renamed from: e  reason: collision with root package name */
        Object f100276e;

        /* renamed from: f  reason: collision with root package name */
        Object f100277f;

        /* renamed from: g  reason: collision with root package name */
        int f100278g;

        /* renamed from: h  reason: collision with root package name */
        int f100279h;

        /* renamed from: i  reason: collision with root package name */
        int f100280i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f100281j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ f f100282k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C12832d f100283l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, C12832d dVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f100282k = fVar;
            this.f100283l = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f100282k, this.f100283l, eVar);
            eVar2.f100281j = obj;
            return eVar2;
        }

        public final Object invoke(C16533h<? super e.a> hVar, C17164e<? super C16807N> eVar) {
            return ((e) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
            r3 = r9;
            r9 = r1;
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
            throw r9;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x003a, B:13:0x004e] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: CancellationException (r9v14 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:8:0x003a] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f100280i
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0043
                if (r1 == r3) goto L_0x0024
                if (r1 != r2) goto L_0x001c
                java.lang.Object r0 = r8.f100275d
                GB.e r0 = (GB.e) r0
                java.lang.Object r0 = r8.f100281j
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r9)
                goto L_0x00ad
            L_0x001c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0024:
                int r1 = r8.f100278g
                java.lang.Object r3 = r8.f100277f
                TJ.h r3 = (TJ.C16533h) r3
                java.lang.Object r3 = r8.f100276e
                EB.d r3 = (EB.C12832d) r3
                java.lang.Object r3 = r8.f100275d
                nu.f r3 = (nu.f) r3
                java.lang.Object r3 = r8.f100274c
                TJ.h r3 = (TJ.C16533h) r3
                java.lang.Object r3 = r8.f100281j
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r9)     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
                goto L_0x0072
            L_0x003e:
                r9 = move-exception
                goto L_0x007d
            L_0x0040:
                r9 = move-exception
                goto L_0x00b0
            L_0x0043:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f100281j
                TJ.h r9 = (TJ.C16533h) r9
                nu.f r1 = r8.f100282k
                EB.d r5 = r8.f100283l
                XH.x$a r6 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                HB.a r6 = r1.f100235g     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                java.lang.String r7 = r5.e()     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                r8.f100281j = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                r8.f100274c = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                r8.f100275d = r1     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                r8.f100276e = r5     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                r8.f100277f = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                r8.f100278g = r4     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                r8.f100279h = r4     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                r8.f100280i = r3     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                java.lang.Object r1 = r6.b(r7, r8)     // Catch:{ CancellationException -> 0x0040, all -> 0x0079 }
                if (r1 != r0) goto L_0x006f
                return r0
            L_0x006f:
                r3 = r9
                r9 = r1
                r1 = r4
            L_0x0072:
                GB.e r9 = (GB.e) r9     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
                java.lang.Object r9 = XH.x.b(r9)     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
                goto L_0x0087
            L_0x0079:
                r1 = move-exception
                r3 = r9
                r9 = r1
                r1 = r4
            L_0x007d:
                XH.x$a r5 = XH.x.f139812b
                java.lang.Object r9 = XH.y.a(r9)
                java.lang.Object r9 = XH.x.b(r9)
            L_0x0087:
                boolean r5 = XH.x.g(r9)
                if (r5 == 0) goto L_0x008f
                r5 = 0
                goto L_0x0090
            L_0x008f:
                r5 = r9
            L_0x0090:
                r6 = r5
                GB.e r6 = (GB.e) r6
                nu.e$a$d r7 = new nu.e$a$d
                r7.<init>(r6)
                r8.f100281j = r3
                r8.f100274c = r5
                r8.f100275d = r6
                r8.f100276e = r9
                r8.f100278g = r4
                r8.f100279h = r1
                r8.f100280i = r2
                java.lang.Object r9 = r3.emit(r7, r8)
                if (r9 != r0) goto L_0x00ad
                return r0
            L_0x00ad:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            L_0x00b0:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nu.f$f  reason: collision with other inner class name */
    public static final class C2330f implements C16532g<e.a.C2327e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100284a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nu.f$f$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100285a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$showSmallStoreFlow$$inlined$map$1$2", f = "GetSelectedStoreUseCase.kt", l = {50}, m = "emit")
            /* renamed from: nu.f$f$a$a  reason: collision with other inner class name */
            public static final class C2331a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100286c;

                /* renamed from: d  reason: collision with root package name */
                int f100287d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100288e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2331a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100288e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100286c = obj;
                    this.f100287d |= Integer.MIN_VALUE;
                    return this.f100288e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f100285a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof nu.f.C2330f.a.C2331a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    nu.f$f$a$a r0 = (nu.f.C2330f.a.C2331a) r0
                    int r1 = r0.f100287d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100287d = r1
                    goto L_0x0018
                L_0x0013:
                    nu.f$f$a$a r0 = new nu.f$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f100286c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100287d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004e
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f100285a
                    nu.k$a r5 = (nu.k.a) r5
                    nu.e$a$e r2 = new nu.e$a$e
                    if (r5 == 0) goto L_0x0041
                    Gt.e r5 = r5.a()
                    goto L_0x0042
                L_0x0041:
                    r5 = 0
                L_0x0042:
                    r2.<init>(r5)
                    r0.f100287d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.f.C2330f.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2330f(C16532g gVar) {
            this.f100284a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100284a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements C16532g<e.a.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100289a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100290a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$storeBenefitFlow$$inlined$map$1$2", f = "GetSelectedStoreUseCase.kt", l = {50}, m = "emit")
            /* renamed from: nu.f$g$a$a  reason: collision with other inner class name */
            public static final class C2332a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100291c;

                /* renamed from: d  reason: collision with root package name */
                int f100292d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100293e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2332a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100293e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100291c = obj;
                    this.f100292d |= Integer.MIN_VALUE;
                    return this.f100293e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f100290a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof nu.f.g.a.C2332a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    nu.f$g$a$a r0 = (nu.f.g.a.C2332a) r0
                    int r1 = r0.f100292d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100292d = r1
                    goto L_0x0018
                L_0x0013:
                    nu.f$g$a$a r0 = new nu.f$g$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f100291c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100292d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004e
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f100290a
                    Nt.a$a r5 = (Nt.a.C1716a) r5
                    nu.e$a$g r2 = new nu.e$a$g
                    if (r5 == 0) goto L_0x0041
                    Mt.a r5 = r5.a()
                    goto L_0x0042
                L_0x0041:
                    r5 = 0
                L_0x0042:
                    r2.<init>(r5)
                    r0.f100292d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.f.g.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public g(C16532g gVar) {
            this.f100289a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100289a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements C16532g<e.a.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C12832d f100295b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100296a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C12832d f100297b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$storeEventsFlow$$inlined$map$1$2", f = "GetSelectedStoreUseCase.kt", l = {50}, m = "emit")
            /* renamed from: nu.f$h$a$a  reason: collision with other inner class name */
            public static final class C2333a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100298c;

                /* renamed from: d  reason: collision with root package name */
                int f100299d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100300e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2333a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100300e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100298c = obj;
                    this.f100299d |= Integer.MIN_VALUE;
                    return this.f100300e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C12832d dVar) {
                this.f100296a = hVar;
                this.f100297b = dVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof nu.f.h.a.C2333a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    nu.f$h$a$a r0 = (nu.f.h.a.C2333a) r0
                    int r1 = r0.f100299d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100299d = r1
                    goto L_0x0018
                L_0x0013:
                    nu.f$h$a$a r0 = new nu.f$h$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f100298c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100299d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0052
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f100296a
                    java.util.List r7 = (java.util.List) r7
                    nu.e$a$h r2 = new nu.e$a$h
                    EB.d r4 = r6.f100297b
                    java.lang.String r4 = r4.e()
                    EB.d r5 = r6.f100297b
                    java.lang.String r5 = r5.getName()
                    r2.<init>(r4, r7, r5)
                    r0.f100299d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0052
                    return r1
                L_0x0052:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.f.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar, C12832d dVar) {
            this.f100294a = gVar;
            this.f100295b = dVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100294a.collect(new a(hVar, this.f100295b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements C16532g<e.a.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100301a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100302a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$storeOffersFlow$$inlined$map$1$2", f = "GetSelectedStoreUseCase.kt", l = {50}, m = "emit")
            /* renamed from: nu.f$i$a$a  reason: collision with other inner class name */
            public static final class C2334a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100303c;

                /* renamed from: d  reason: collision with root package name */
                int f100304d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100305e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2334a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100305e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100303c = obj;
                    this.f100304d |= Integer.MIN_VALUE;
                    return this.f100305e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f100302a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof nu.f.i.a.C2334a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    nu.f$i$a$a r0 = (nu.f.i.a.C2334a) r0
                    int r1 = r0.f100304d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100304d = r1
                    goto L_0x0018
                L_0x0013:
                    nu.f$i$a$a r0 = new nu.f$i$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f100303c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100304d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f100302a
                    java.util.List r6 = (java.util.List) r6
                    nu.e$a$i r2 = new nu.e$a$i
                    r4 = 0
                    r2.<init>(r6, r4)
                    r0.f100304d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.f.i.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public i(C16532g gVar) {
            this.f100301a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100301a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lnu/e$a$i;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$storeOffersFlow$2", f = "GetSelectedStoreUseCase.kt", l = {291}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super e.a.i>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100306c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100307d;

        j(C17164e<? super j> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(eVar);
            jVar.f100307d = obj;
            return jVar;
        }

        public final Object invoke(C16533h<? super e.a.i> hVar, C17164e<? super C16807N> eVar) {
            return ((j) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100306c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f100307d;
                e.a.i iVar = new e.a.i(C16877v.n(), true);
                this.f100307d = hVar;
                this.f100306c = 1;
                if (hVar.emit(iVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f100307d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$wayfindingDataFlow$$inlined$flatMapLatest$1", f = "GetSelectedStoreUseCase.kt", l = {194, 198, 189}, m = "invokeSuspend")
    public static final class k extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super e.a.j>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100308c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100309d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100310e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f100311f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12832d f100312g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C17164e eVar, f fVar, C12832d dVar) {
            super(3, eVar);
            this.f100311f = fVar;
            this.f100312g = dVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super e.a.j> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            k kVar = new k(eVar, this.f100311f, this.f100312g);
            kVar.f100309d = hVar;
            kVar.f100310e = bool;
            return kVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f100308c
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0036
                if (r1 == r4) goto L_0x002e
                if (r1 == r3) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                XH.y.b(r9)
                goto L_0x00d5
            L_0x0017:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001f:
                java.lang.Object r1 = r8.f100309d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r9)
                XH.x r9 = (XH.x) r9
                java.lang.Object r9 = r9.j()
                goto L_0x0098
            L_0x002e:
                java.lang.Object r1 = r8.f100309d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r9)
                goto L_0x006c
            L_0x0036:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f100309d
                TJ.h r9 = (TJ.C16533h) r9
                java.lang.Object r1 = r8.f100310e
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x0052
                nu.f$l r1 = new nu.f$l
                r1.<init>(r5)
                TJ.g r1 = TJ.C16534i.H(r1)
                goto L_0x00ca
            L_0x0052:
                nu.f r1 = r8.f100311f
                ru.c r1 = r1.f100230b
                EB.d r6 = r8.f100312g
                java.lang.String r6 = r6.e()
                r8.f100309d = r9
                r8.f100308c = r4
                java.lang.Object r1 = r1.b(r6, r8)
                if (r1 != r0) goto L_0x0069
                return r0
            L_0x0069:
                r7 = r1
                r1 = r9
                r9 = r7
            L_0x006c:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L_0x0081
                nu.f$m r9 = new nu.f$m
                r9.<init>(r5)
                TJ.g r9 = TJ.C16534i.H(r9)
            L_0x007d:
                r7 = r1
                r1 = r9
                r9 = r7
                goto L_0x00ca
            L_0x0081:
                nu.f r9 = r8.f100311f
                zu.a r9 = r9.f100234f
                EB.d r4 = r8.f100312g
                java.lang.String r4 = r4.e()
                r8.f100309d = r1
                r8.f100308c = r3
                java.lang.Object r9 = r9.m16invokegIAlus(r4, r8)
                if (r9 != r0) goto L_0x0098
                return r0
            L_0x0098:
                boolean r3 = XH.x.g(r9)
                if (r3 == 0) goto L_0x009f
                r9 = r5
            L_0x009f:
                yu.a r9 = (yu.C12516a) r9
                if (r9 == 0) goto L_0x00bf
                Gt.g r9 = new Gt.g
                EB.d r3 = r8.f100312g
                java.lang.String r3 = r3.e()
                int r4 = st.c.f102791n0
                EB.d r6 = r8.f100312g
                java.lang.String r6 = r6.getName()
                java.lang.Object[] r6 = new java.lang.Object[]{r6}
                IC.e r4 = IC.C13026h.b(r4, r6)
                r9.<init>(r3, r4)
                goto L_0x00c0
            L_0x00bf:
                r9 = r5
            L_0x00c0:
                nu.f$n r3 = new nu.f$n
                r3.<init>(r9, r5)
                TJ.g r9 = TJ.C16534i.H(r3)
                goto L_0x007d
            L_0x00ca:
                r8.f100309d = r5
                r8.f100308c = r2
                java.lang.Object r9 = TJ.C16534i.x(r9, r1, r8)
                if (r9 != r0) goto L_0x00d5
                return r0
            L_0x00d5:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.f.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lnu/e$a$j;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$wayfindingDataFlow$1$1", f = "GetSelectedStoreUseCase.kt", l = {212}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super e.a.j>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100313c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100314d;

        l(C17164e<? super l> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(eVar);
            lVar.f100314d = obj;
            return lVar;
        }

        public final Object invoke(C16533h<? super e.a.j> hVar, C17164e<? super C16807N> eVar) {
            return ((l) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100313c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f100314d;
                e.a.j jVar = new e.a.j((Gt.g) null);
                this.f100314d = hVar;
                this.f100313c = 1;
                if (hVar.emit(jVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f100314d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lnu/e$a$j;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$wayfindingDataFlow$1$2", f = "GetSelectedStoreUseCase.kt", l = {216}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super e.a.j>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100315c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100316d;

        m(C17164e<? super m> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            m mVar = new m(eVar);
            mVar.f100316d = obj;
            return mVar;
        }

        public final Object invoke(C16533h<? super e.a.j> hVar, C17164e<? super C16807N> eVar) {
            return ((m) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100315c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f100316d;
                e.a.j jVar = new e.a.j((Gt.g) null);
                this.f100316d = hVar;
                this.f100315c = 1;
                if (hVar.emit(jVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f100316d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lnu/e$a$j;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetSelectedStoreUseCaseImpl$wayfindingDataFlow$1$3", f = "GetSelectedStoreUseCase.kt", l = {230}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super e.a.j>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100317c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100318d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Gt.g f100319e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(Gt.g gVar, C17164e<? super n> eVar) {
            super(2, eVar);
            this.f100319e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            n nVar = new n(this.f100319e, eVar);
            nVar.f100318d = obj;
            return nVar;
        }

        public final Object invoke(C16533h<? super e.a.j> hVar, C17164e<? super C16807N> eVar) {
            return ((n) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100317c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f100318d;
                e.a.j jVar = new e.a.j(this.f100319e);
                this.f100318d = hVar;
                this.f100317c = 1;
                if (hVar.emit(jVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f100318d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public f(C12860a aVar, ru.c cVar, Ct.e eVar, Ct.c cVar2, C11362c cVar3, C12555a aVar2, C12961a aVar3, C13018a aVar4, i iVar, M m10, C11678c cVar4, Nt.a aVar5, k kVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(cVar, "wayfindingIntegration");
        C17542s.j(eVar, "getFoodMobileDataUseCase");
        C17542s.j(cVar2, "getFoodMobileOrderForCurrentStore");
        C17542s.j(cVar3, "getStoreEventsUseCase");
        C17542s.j(aVar2, "getWayfindingDetailsUseCase");
        C17542s.j(aVar3, "popularTimesRepository");
        C17542s.j(aVar4, "getAmenityOpeningHoursUseCase");
        C17542s.j(iVar, "getStoreOffersUseCase");
        C17542s.j(m10, "ioDispatcher");
        C17542s.j(cVar4, "getOnboardingScreensUseCase");
        C17542s.j(aVar5, "getStoreBenefitsUseCase");
        C17542s.j(kVar, "hasSmallStoreBeenShownUseCase");
        this.f100229a = aVar;
        this.f100230b = cVar;
        this.f100231c = eVar;
        this.f100232d = cVar2;
        this.f100233e = cVar3;
        this.f100234f = aVar2;
        this.f100235g = aVar3;
        this.f100236h = aVar4;
        this.f100237i = iVar;
        this.f100238j = m10;
        this.f100239k = cVar4;
        this.f100240l = aVar5;
        this.f100241m = kVar;
    }

    private final C16532g<e.a.C2326a> l(C12832d dVar) {
        return C16534i.g0(this.f100242n, new a((C17164e) null, this, dVar));
    }

    /* access modifiers changed from: private */
    public final C16532g<e.a.b> m(C12832d dVar) {
        return C16534i.J(new e.a.b(dVar.e(), dVar.getName(), dVar.f()));
    }

    /* access modifiers changed from: private */
    public final C16532g<e.a.f> n(C12832d dVar) {
        return new c(this.f100236h.a(C16877v.e(dVar.e())), this, dVar);
    }

    /* access modifiers changed from: private */
    public final List<C16532g<e.a>> o(C12832d dVar) {
        List c10 = C16877v.c();
        c10.add(t(dVar));
        c10.add(l(dVar));
        c10.add(s(dVar));
        c10.add(u(dVar));
        c10.add(p(dVar));
        c10.add(r());
        c10.add(q(dVar));
        return C16877v.a(c10);
    }

    private final C16532g<e.a> p(C12832d dVar) {
        return C16534i.H(new e(this, dVar, (C17164e<? super e>) null));
    }

    private final C16532g<e.a> q(C12832d dVar) {
        return new C2330f(C16534i.s(this.f100241m.a(dVar)));
    }

    private final C16532g<e.a> r() {
        return new g(C16534i.s(this.f100240l.invoke()));
    }

    private final C16532g<e.a> s(C12832d dVar) {
        return new h(this.f100233e.a(dVar.e()), dVar);
    }

    private final C16532g<e.a.i> t(C12832d dVar) {
        return C16534i.S(new i(this.f100237i.a(dVar.e())), new j((C17164e<? super j>) null));
    }

    private final C16532g<e.a.j> u(C12832d dVar) {
        return C16534i.g0(this.f100230b.a(), new k((C17164e) null, this, dVar));
    }

    public C16532g<e.a> invoke() {
        return C16534i.L(C16534i.g0(this.f100229a.b(), new d((C17164e) null, this)), this.f100238j);
    }
}
