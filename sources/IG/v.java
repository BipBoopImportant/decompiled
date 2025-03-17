package ig;

import IC.C13020b;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import Ln.h;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.app.cart.impl.data.b;
import dI.C17164e;
import eI.C17187b;
import hg.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import sv.C11892a;
import ug.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010!¨\u0006'"}, d2 = {"Lig/v;", "Lig/u;", "Lsv/a;", "mCommerceConfigRepository", "LLn/h;", "cartRepository", "LXf/b;", "remoteShoppingRemoteDataSource", "Lug/k;", "labsFeatures", "LNd/c;", "abTesting", "<init>", "(Lsv/a;LLn/h;LXf/b;Lug/k;LNd/c;)V", "Lcom/ingka/ikea/app/cart/impl/data/b;", "Lhg/q$b$b$a;", "h", "(Lcom/ingka/ikea/app/cart/impl/data/b;)Lhg/q$b$b$a;", "LTJ/g;", "invoke", "()LTJ/g;", "a", "LXf/b;", "b", "Lug/k;", "c", "LNd/c;", "LTJ/B;", "d", "LTJ/B;", "emittedUiState", "", "e", "LTJ/g;", "config", "f", "cartTotalPrice", "g", "remoteSales", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Xf.b f74619a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f74620b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Nd.c f74621c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C16505B<q.b.C1292b.a> f74622d = C16521S.a(null);

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<Double> f74623e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C16532g<Double> f74624f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C16532g<q.b.C1292b.a> f74625g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetRemoteSalesUiStateUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetRemoteSalesUiStateUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements nI.q<C16533h<? super q.b.C1292b.a>, q.b.C1292b.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74626c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74627d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74628e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f74629f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, v vVar) {
            super(3, eVar);
            this.f74629f = vVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super q.b.C1292b.a> hVar, q.b.C1292b.a aVar, C17164e<? super C16807N> eVar) {
            a aVar2 = new a(eVar, this.f74629f);
            aVar2.f74627d = hVar;
            aVar2.f74628e = aVar;
            return aVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74626c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74627d;
                q.b.C1292b.a aVar = (q.b.C1292b.a) this.f74628e;
                C16532g J10 = aVar != null ? C16534i.J(aVar) : this.f74629f.f74625g;
                this.f74626c = 1;
                if (C16534i.x(hVar, J10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lhg/q$b$b$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetRemoteSalesUiStateUseCaseImpl$invoke$2", f = "GetRemoteSalesUiStateUseCase.kt", l = {128}, m = "invokeSuspend")
    static final class b extends l implements p<C16533h<? super q.b.C1292b.a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74630c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74631d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f74631d = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super q.b.C1292b.a> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74630c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74631d;
                this.f74631d = hVar;
                this.f74630c = 1;
                if (hVar.emit(null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f74631d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f74633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Double f74634c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74635a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f74636b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Double f74637c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetRemoteSalesUiStateUseCaseImpl$remoteSales$lambda$7$$inlined$map$1$2", f = "GetRemoteSalesUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.v$c$a$a  reason: collision with other inner class name */
            public static final class C1346a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74638c;

                /* renamed from: d  reason: collision with root package name */
                int f74639d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74640e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1346a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74640e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74638c = obj;
                    this.f74639d |= Integer.MIN_VALUE;
                    return this.f74640e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, v vVar, Double d10) {
                this.f74635a = hVar;
                this.f74636b = vVar;
                this.f74637c = d10;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r19, dI.C17164e r20) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r20
                    boolean r2 = r1 instanceof ig.v.c.a.C1346a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    ig.v$c$a$a r2 = (ig.v.c.a.C1346a) r2
                    int r3 = r2.f74639d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f74639d = r3
                    goto L_0x001c
                L_0x0017:
                    ig.v$c$a$a r2 = new ig.v$c$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f74638c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f74639d
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    XH.y.b(r1)
                    goto L_0x0123
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f74635a
                    r4 = r19
                    java.lang.Double r4 = (java.lang.Double) r4
                    ig.v r6 = r0.f74636b
                    qv.e r13 = qv.e.DEBUG
                    qv.d r7 = qv.d.f102012a
                    java.util.List r7 = r7.a()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L_0x0054:
                    boolean r9 = r7.hasNext()
                    if (r9 == 0) goto L_0x006c
                    java.lang.Object r9 = r7.next()
                    r10 = r9
                    qv.b r10 = (qv.C11819b) r10
                    r11 = 0
                    boolean r10 = r10.b(r13, r11)
                    if (r10 == 0) goto L_0x0054
                    r8.add(r9)
                    goto L_0x0054
                L_0x006c:
                    java.util.Iterator r14 = r8.iterator()
                    r15 = 0
                    r7 = r15
                    r8 = r7
                L_0x0073:
                    boolean r9 = r14.hasNext()
                    if (r9 == 0) goto L_0x010c
                    java.lang.Object r9 = r14.next()
                    qv.b r9 = (qv.C11819b) r9
                    r11 = 0
                    if (r7 != 0) goto L_0x00a8
                    java.lang.Double r7 = r0.f74637c
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r12 = "Cart total: "
                    r10.append(r12)
                    r10.append(r4)
                    java.lang.String r12 = ", threshold: "
                    r10.append(r12)
                    r10.append(r7)
                    java.lang.String r7 = r10.toString()
                    java.lang.String r7 = qv.C11818a.a(r7, r11)
                    if (r7 != 0) goto L_0x00a4
                    goto L_0x010c
                L_0x00a4:
                    java.lang.String r7 = qv.C11820c.a(r7)
                L_0x00a8:
                    r16 = r7
                    if (r8 != 0) goto L_0x00fa
                    java.lang.Class r7 = r6.getClass()
                    java.lang.String r7 = r7.getName()
                    kotlin.jvm.internal.C17542s.g(r7)
                    r8 = 36
                    r10 = 2
                    java.lang.String r8 = HJ.C15854t.s1(r7, r8, r15, r10, r15)
                    r12 = 46
                    java.lang.String r8 = HJ.C15854t.o1(r8, r12, r15, r10, r15)
                    int r10 = r8.length()
                    if (r10 != 0) goto L_0x00cb
                    goto L_0x00d1
                L_0x00cb:
                    java.lang.String r7 = "Kt"
                    java.lang.String r7 = HJ.C15854t.P0(r8, r7)
                L_0x00d1:
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    java.lang.String r8 = r8.getName()
                    java.lang.String r10 = "main"
                    boolean r8 = HJ.C15854t.b0(r8, r10, r5)
                    if (r8 == 0) goto L_0x00e4
                    java.lang.String r8 = "m"
                    goto L_0x00e6
                L_0x00e4:
                    java.lang.String r8 = "b"
                L_0x00e6:
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r10.append(r8)
                    java.lang.String r8 = "|"
                    r10.append(r8)
                    r10.append(r7)
                    java.lang.String r8 = r10.toString()
                L_0x00fa:
                    r17 = r8
                    r10 = 0
                    r7 = r9
                    r8 = r13
                    r9 = r17
                    r12 = r16
                    r7.a(r8, r9, r10, r11, r12)
                    r7 = r16
                    r8 = r17
                    goto L_0x0073
                L_0x010c:
                    java.lang.Double r6 = r0.f74637c
                    double r6 = r6.doubleValue()
                    boolean r4 = ip.g.a(r4, r6)
                    java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r2.f74639d = r5
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto L_0x0123
                    return r3
                L_0x0123:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.v.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar, v vVar, Double d10) {
            this.f74632a = gVar;
            this.f74633b = vVar;
            this.f74634c = d10;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74632a.collect(new a(hVar, this.f74633b, this.f74634c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetRemoteSalesUiStateUseCaseImpl$special$$inlined$flatMapLatest$1", f = "GetRemoteSalesUiStateUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class d extends l implements nI.q<C16533h<? super Boolean>, Double, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74641c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74642d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74643e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f74644f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, v vVar) {
            super(3, eVar);
            this.f74644f = vVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Boolean> hVar, Double d10, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar, this.f74644f);
            dVar.f74642d = hVar;
            dVar.f74643e = d10;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74641c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74642d;
                Double d10 = (Double) this.f74643e;
                C16532g J10 = d10 == null ? C16534i.J(kotlin.coroutines.jvm.internal.b.a(false)) : new c(this.f74644f.f74624f, this.f74644f, d10);
                this.f74641c = 1;
                if (C16534i.x(hVar, J10, this) == f10) {
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
    public static final class e implements C16532g<Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74645a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f74646b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74647a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f74648b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetRemoteSalesUiStateUseCaseImpl$special$$inlined$map$1$2", f = "GetRemoteSalesUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.v$e$a$a  reason: collision with other inner class name */
            public static final class C1347a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74649c;

                /* renamed from: d  reason: collision with root package name */
                int f74650d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74651e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1347a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74651e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74649c = obj;
                    this.f74650d |= Integer.MIN_VALUE;
                    return this.f74651e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, v vVar) {
                this.f74647a = hVar;
                this.f74648b = vVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x023a A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r27, dI.C17164e r28) {
                /*
                    r26 = this;
                    r0 = r26
                    r1 = r28
                    boolean r2 = r1 instanceof ig.v.e.a.C1347a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    ig.v$e$a$a r2 = (ig.v.e.a.C1347a) r2
                    int r3 = r2.f74650d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f74650d = r3
                    goto L_0x001c
                L_0x0017:
                    ig.v$e$a$a r2 = new ig.v$e$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f74649c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f74650d
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    XH.y.b(r1)
                    goto L_0x023b
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f74647a
                    r4 = r27
                    com.ingka.ikea.mcomsettings.MComConfig r4 = (com.ingka.ikea.mcomsettings.MComConfig) r4
                    if (r4 == 0) goto L_0x0046
                    java.lang.Double r4 = r4.m()
                    goto L_0x0047
                L_0x0046:
                    r4 = 0
                L_0x0047:
                    java.lang.String r7 = "|"
                    java.lang.String r8 = "b"
                    java.lang.String r9 = "m"
                    java.lang.String r10 = "main"
                    java.lang.String r11 = "Kt"
                    r14 = 0
                    if (r4 == 0) goto L_0x016c
                    ig.v r12 = r0.f74648b
                    Nd.c r12 = r12.f74621c
                    Nd.d r6 = Nd.d.f62000a
                    Nd.a$a r6 = r12.c(r6, r5)
                    Nd.d$a r6 = (Nd.d.a) r6
                    ig.v r12 = r0.f74648b
                    qv.e r5 = qv.e.DEBUG
                    qv.d r16 = qv.d.f102012a
                    java.util.List r16 = r16.a()
                    java.lang.Iterable r16 = (java.lang.Iterable) r16
                    java.util.ArrayList r13 = new java.util.ArrayList
                    r13.<init>()
                    java.util.Iterator r16 = r16.iterator()
                L_0x0077:
                    boolean r17 = r16.hasNext()
                    if (r17 == 0) goto L_0x0092
                    java.lang.Object r15 = r16.next()
                    r22 = r4
                    r4 = r15
                    qv.b r4 = (qv.C11819b) r4
                    boolean r4 = r4.b(r5, r14)
                    if (r4 == 0) goto L_0x008f
                    r13.add(r15)
                L_0x008f:
                    r4 = r22
                    goto L_0x0077
                L_0x0092:
                    r22 = r4
                    java.util.Iterator r4 = r13.iterator()
                    r13 = 0
                    r14 = 0
                L_0x009a:
                    boolean r15 = r4.hasNext()
                    if (r15 == 0) goto L_0x0137
                    java.lang.Object r15 = r4.next()
                    r16 = r15
                    qv.b r16 = (qv.C11819b) r16
                    if (r13 != 0) goto L_0x00c8
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                    r13.<init>()
                    java.lang.String r15 = "Cart remote sales AB test variant: "
                    r13.append(r15)
                    r13.append(r6)
                    java.lang.String r13 = r13.toString()
                    r15 = 0
                    java.lang.String r13 = qv.C11818a.a(r13, r15)
                    if (r13 != 0) goto L_0x00c4
                    goto L_0x0137
                L_0x00c4:
                    java.lang.String r13 = qv.C11820c.a(r13)
                L_0x00c8:
                    if (r14 != 0) goto L_0x011b
                    java.lang.Class r14 = r12.getClass()
                    java.lang.String r14 = r14.getName()
                    kotlin.jvm.internal.C17542s.g(r14)
                    r23 = r4
                    r24 = r8
                    r25 = r9
                    r4 = 36
                    r8 = 2
                    r15 = 0
                    java.lang.String r9 = HJ.C15854t.s1(r14, r4, r15, r8, r15)
                    r4 = 46
                    java.lang.String r9 = HJ.C15854t.o1(r9, r4, r15, r8, r15)
                    int r4 = r9.length()
                    if (r4 != 0) goto L_0x00f0
                    goto L_0x00f4
                L_0x00f0:
                    java.lang.String r14 = HJ.C15854t.P0(r9, r11)
                L_0x00f4:
                    java.lang.Thread r4 = java.lang.Thread.currentThread()
                    java.lang.String r4 = r4.getName()
                    r8 = 1
                    boolean r4 = HJ.C15854t.b0(r4, r10, r8)
                    if (r4 == 0) goto L_0x0106
                    r4 = r25
                    goto L_0x0108
                L_0x0106:
                    r4 = r24
                L_0x0108:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r4)
                    r8.append(r7)
                    r8.append(r14)
                    java.lang.String r14 = r8.toString()
                    goto L_0x0121
                L_0x011b:
                    r23 = r4
                    r24 = r8
                    r25 = r9
                L_0x0121:
                    r19 = 0
                    r17 = r5
                    r18 = r14
                    r4 = 0
                    r20 = r4
                    r21 = r13
                    r16.a(r17, r18, r19, r20, r21)
                    r4 = r23
                    r8 = r24
                    r9 = r25
                    goto L_0x009a
                L_0x0137:
                    Nd.d$a$b r4 = Nd.d.a.b.f62003a
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r6, r4)
                    if (r4 != 0) goto L_0x0157
                    Nd.d$a$a r4 = Nd.d.a.C1043a.f62002a
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r6, r4)
                    if (r4 == 0) goto L_0x0148
                    goto L_0x0157
                L_0x0148:
                    Nd.d$a$c r4 = Nd.d.a.c.f62004a
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r6, r4)
                    if (r4 == 0) goto L_0x0151
                    goto L_0x0163
                L_0x0151:
                    XH.t r1 = new XH.t
                    r1.<init>()
                    throw r1
                L_0x0157:
                    ig.v r4 = r0.f74648b
                    ug.k r4 = r4.f74620b
                    boolean r4 = r4.e()
                    if (r4 == 0) goto L_0x0168
                L_0x0163:
                    r6 = r22
                L_0x0165:
                    r0 = 1
                    goto L_0x0232
                L_0x0168:
                    r0 = 1
                    r6 = 0
                    goto L_0x0232
                L_0x016c:
                    r24 = r8
                    r25 = r9
                    ig.v r4 = r0.f74648b
                    qv.e r5 = qv.e.DEBUG
                    qv.d r6 = qv.d.f102012a
                    java.util.List r6 = r6.a()
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.Iterator r6 = r6.iterator()
                L_0x0185:
                    boolean r9 = r6.hasNext()
                    if (r9 == 0) goto L_0x019c
                    java.lang.Object r9 = r6.next()
                    r12 = r9
                    qv.b r12 = (qv.C11819b) r12
                    boolean r12 = r12.b(r5, r14)
                    if (r12 == 0) goto L_0x0185
                    r8.add(r9)
                    goto L_0x0185
                L_0x019c:
                    java.util.Iterator r6 = r8.iterator()
                    r8 = 0
                    r15 = 0
                L_0x01a2:
                    boolean r9 = r6.hasNext()
                    if (r9 == 0) goto L_0x01b9
                    java.lang.Object r9 = r6.next()
                    qv.b r9 = (qv.C11819b) r9
                    r12 = 0
                    if (r15 != 0) goto L_0x01c1
                    java.lang.String r13 = "No remote sales config"
                    java.lang.String r13 = qv.C11818a.a(r13, r12)
                    if (r13 != 0) goto L_0x01bc
                L_0x01b9:
                    r14 = 0
                    goto L_0x022f
                L_0x01bc:
                    java.lang.String r13 = qv.C11820c.a(r13)
                    goto L_0x01c2
                L_0x01c1:
                    r13 = r15
                L_0x01c2:
                    if (r8 != 0) goto L_0x0212
                    java.lang.Class r8 = r4.getClass()
                    java.lang.String r8 = r8.getName()
                    kotlin.jvm.internal.C17542s.g(r8)
                    r12 = 2
                    r14 = 0
                    r15 = 36
                    java.lang.String r0 = HJ.C15854t.s1(r8, r15, r14, r12, r14)
                    r21 = r4
                    r4 = 46
                    java.lang.String r0 = HJ.C15854t.o1(r0, r4, r14, r12, r14)
                    int r16 = r0.length()
                    if (r16 != 0) goto L_0x01e6
                    goto L_0x01ea
                L_0x01e6:
                    java.lang.String r8 = HJ.C15854t.P0(r0, r11)
                L_0x01ea:
                    java.lang.Thread r0 = java.lang.Thread.currentThread()
                    java.lang.String r0 = r0.getName()
                    r4 = 1
                    boolean r0 = HJ.C15854t.b0(r0, r10, r4)
                    if (r0 == 0) goto L_0x01fc
                    r0 = r25
                    goto L_0x01fe
                L_0x01fc:
                    r0 = r24
                L_0x01fe:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r0)
                    r4.append(r7)
                    r4.append(r8)
                    java.lang.String r0 = r4.toString()
                    r8 = r0
                    goto L_0x0218
                L_0x0212:
                    r21 = r4
                    r12 = 2
                    r14 = 0
                    r15 = 36
                L_0x0218:
                    r18 = 0
                    r0 = r15
                    r15 = r9
                    r16 = r5
                    r17 = r8
                    r4 = 0
                    r19 = r4
                    r20 = r13
                    r15.a(r16, r17, r18, r19, r20)
                    r0 = r26
                    r15 = r13
                    r4 = r21
                    goto L_0x01a2
                L_0x022f:
                    r6 = r14
                    goto L_0x0165
                L_0x0232:
                    r2.f74650d = r0
                    java.lang.Object r0 = r1.emit(r6, r2)
                    if (r0 != r3) goto L_0x023b
                    return r3
                L_0x023b:
                    XH.N r0 = XH.C16807N.f139792a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.v.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar, v vVar) {
            this.f74645a = gVar;
            this.f74646b = vVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74645a.collect(new a(hVar, this.f74646b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements C16532g<Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74652a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74653a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetRemoteSalesUiStateUseCaseImpl$special$$inlined$map$2$2", f = "GetRemoteSalesUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.v$f$a$a  reason: collision with other inner class name */
            public static final class C1348a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74654c;

                /* renamed from: d  reason: collision with root package name */
                int f74655d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74656e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1348a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74656e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74654c = obj;
                    this.f74655d |= Integer.MIN_VALUE;
                    return this.f74656e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74653a = hVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
                r7 = (r7 = r7.c()).b();
             */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof ig.v.f.a.C1348a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    ig.v$f$a$a r0 = (ig.v.f.a.C1348a) r0
                    int r1 = r0.f74655d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74655d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.v$f$a$a r0 = new ig.v$f$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f74654c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74655d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x006b
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f74653a
                    Ln.g r7 = (Ln.g) r7
                    r2 = 0
                    if (r7 == 0) goto L_0x004c
                    Ln.e r7 = r7.c()
                    if (r7 == 0) goto L_0x004c
                    Ln.e$a r7 = r7.b()
                    if (r7 == 0) goto L_0x004c
                    Ln.e$b r7 = r7.c()
                    goto L_0x004d
                L_0x004c:
                    r7 = r2
                L_0x004d:
                    if (r7 == 0) goto L_0x0058
                    java.lang.Double r4 = r7.b()
                    if (r4 != 0) goto L_0x0056
                    goto L_0x0058
                L_0x0056:
                    r2 = r4
                    goto L_0x0062
                L_0x0058:
                    if (r7 == 0) goto L_0x0062
                    double r4 = r7.a()
                    java.lang.Double r2 = kotlin.coroutines.jvm.internal.b.c(r4)
                L_0x0062:
                    r0.f74655d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x006b
                    return r1
                L_0x006b:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.v.f.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar) {
            this.f74652a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74652a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements C16532g<q.b.C1292b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f74658b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74659a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f74660b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetRemoteSalesUiStateUseCaseImpl$special$$inlined$map$3$2", f = "GetRemoteSalesUiStateUseCase.kt", l = {53, 50}, m = "emit")
            /* renamed from: ig.v$g$a$a  reason: collision with other inner class name */
            public static final class C1349a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74661c;

                /* renamed from: d  reason: collision with root package name */
                int f74662d;

                /* renamed from: e  reason: collision with root package name */
                Object f74663e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f74664f;

                /* renamed from: g  reason: collision with root package name */
                Object f74665g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1349a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74664f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74661c = obj;
                    this.f74662d |= Integer.MIN_VALUE;
                    return this.f74664f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, v vVar) {
                this.f74659a = hVar;
                this.f74660b = vVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof ig.v.g.a.C1349a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    ig.v$g$a$a r0 = (ig.v.g.a.C1349a) r0
                    int r1 = r0.f74662d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74662d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.v$g$a$a r0 = new ig.v$g$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f74661c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74662d
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L_0x0041
                    if (r2 == r4) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    XH.y.b(r9)
                    goto L_0x008b
                L_0x002d:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0035:
                    java.lang.Object r8 = r0.f74665g
                    TJ.h r8 = (TJ.C16533h) r8
                    java.lang.Object r2 = r0.f74663e
                    ig.v$g$a r2 = (ig.v.g.a) r2
                    XH.y.b(r9)
                    goto L_0x0065
                L_0x0041:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f74659a
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L_0x007d
                    ig.v r8 = r7.f74660b
                    Xf.b r8 = r8.f74619a
                    r0.f74663e = r7
                    r0.f74665g = r9
                    r0.f74662d = r4
                    java.lang.Object r8 = r8.a(r0)
                    if (r8 != r1) goto L_0x0061
                    return r1
                L_0x0061:
                    r2 = r7
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L_0x0065:
                    com.ingka.ikea.app.cart.impl.data.b r9 = (com.ingka.ikea.app.cart.impl.data.b) r9
                    if (r9 == 0) goto L_0x007c
                    ig.v r4 = r2.f74660b
                    hg.q$b$b$a r9 = r4.h(r9)
                    ig.v r2 = r2.f74660b
                    TJ.B r2 = r2.f74622d
                    r2.setValue(r9)
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L_0x007e
                L_0x007c:
                    r9 = r8
                L_0x007d:
                    r8 = r5
                L_0x007e:
                    r0.f74663e = r5
                    r0.f74665g = r5
                    r0.f74662d = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x008b
                    return r1
                L_0x008b:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.v.g.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public g(C16532g gVar, v vVar) {
            this.f74657a = gVar;
            this.f74658b = vVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74657a.collect(new a(hVar, this.f74658b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public v(C11892a aVar, h hVar, Xf.b bVar, k kVar, Nd.c cVar) {
        C17542s.j(aVar, "mCommerceConfigRepository");
        C17542s.j(hVar, "cartRepository");
        C17542s.j(bVar, "remoteShoppingRemoteDataSource");
        C17542s.j(kVar, "labsFeatures");
        C17542s.j(cVar, "abTesting");
        this.f74619a = bVar;
        this.f74620b = kVar;
        this.f74621c = cVar;
        C16532g<Double> s10 = C16534i.s(new e(C11892a.C2450a.a(aVar, false, 1, (Object) null), this));
        this.f74623e = s10;
        this.f74624f = new f(hVar.m());
        this.f74625g = C16534i.s(new g(C16534i.g0(s10, new d((C17164e) null, this)), this));
    }

    /* access modifiers changed from: private */
    public final q.b.C1292b.a h(com.ingka.ikea.app.cart.impl.data.b bVar) {
        C13023e eVar;
        C13023e a10 = C13026h.a(Oo.b.f84662h7);
        String a11 = bVar.a().a();
        boolean b10 = bVar.b().b();
        if (b10) {
            return new q.b.C1292b.a.C1295b(C13026h.a(Oo.b.f84728n7), a10, a11, C16877v.G0(C16877v.s(bVar.a().a(), bVar.a().b()), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null), new C13023e.c(Oo.a.f84311f, C13020b.a(bVar.b().a()), C16877v.e(Integer.valueOf(bVar.b().a())), (DefaultConstructorMarker) null));
        } else if (!b10) {
            Iterable<b.c> c10 = bVar.c();
            ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
            for (b.c cVar : c10) {
                String str = cVar.b() + " - " + cVar.a();
                if (cVar instanceof b.c.a) {
                    eVar = C13026h.b(Oo.b.f84695k7, str);
                } else if (cVar instanceof b.c.C1231b) {
                    eVar = C13026h.b(Oo.b.f84706l7, str);
                } else {
                    throw new t();
                }
                arrayList.add(eVar);
            }
            return new q.b.C1292b.a.C1293a(C13026h.a(Oo.b.f84717m7), a10, a11, new q.b.C1292b.a.C1293a.C1294a(C13026h.a(Oo.b.f84684j7), C13026h.a(Oo.b.f84673i7), C15985a.h(arrayList)));
        } else {
            throw new t();
        }
    }

    public C16532g<q.b.C1292b.a> invoke() {
        return C16534i.s(C16534i.S(C16534i.g0(this.f74622d, new a((C17164e) null, this)), new b((C17164e<? super b>) null)));
    }
}
