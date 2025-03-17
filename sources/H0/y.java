package H0;

import A1.B;
import A1.C4336c;
import A1.C4349p;
import A1.C4350q;
import A1.K;
import A1.P;
import A1.U;
import B0.N;
import XH.C16807N;
import androidx.compose.ui.platform.w1;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import p0.m;
import p0.t;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0015\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\rH@¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\"\u001a\u00020\u0002*\u00020\u000f8@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "", "LXH/N;", "updateTouchMode", "k", "(Landroidx/compose/ui/d;LnI/l;)Landroidx/compose/ui/d;", "LH0/i;", "mouseSelectionObserver", "LB0/N;", "textDragObserver", "i", "(Landroidx/compose/ui/d;LH0/i;LB0/N;)Landroidx/compose/ui/d;", "LA1/c;", "observer", "LA1/p;", "down", "j", "(LA1/c;LB0/N;LA1/p;LdI/e;)Ljava/lang/Object;", "LH0/d;", "clicksCounter", "h", "(LA1/c;LH0/i;LH0/d;LA1/p;LdI/e;)Ljava/lang/Object;", "e", "(LA1/c;LdI/e;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/w1;", "viewConfiguration", "LA1/B;", "change1", "change2", "f", "(Landroidx/compose/ui/platform/w1;LA1/B;LA1/B;)Z", "g", "(LA1/p;)Z", "isPrecisePointer", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {425}, m = "awaitDown")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f7017c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f7018d;

        /* renamed from: e  reason: collision with root package name */
        int f7019e;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f7018d = obj;
            this.f7019e |= Integer.MIN_VALUE;
            return y.e((C4336c) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {158, 181}, m = "mouseSelection")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f7020c;

        /* renamed from: d  reason: collision with root package name */
        Object f7021d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f7022e;

        /* renamed from: f  reason: collision with root package name */
        int f7023f;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f7022e = obj;
            this.f7023f |= Integer.MIN_VALUE;
            return y.h((C4336c) null, (C4531i) null, (C4526d) null, (C4349p) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "it", "LXH/N;", "a", "(LA1/B;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<B, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4531i f7024c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4531i iVar) {
            super(1);
            this.f7024c = iVar;
        }

        public final void a(B b10) {
            if (this.f7024c.d(b10.h())) {
                b10.a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "it", "LXH/N;", "a", "(LA1/B;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<B, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4531i f7025c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4543v f7026d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C4531i iVar, C4543v vVar) {
            super(1);
            this.f7025c = iVar;
            this.f7026d = vVar;
        }

        public final void a(B b10) {
            if (this.f7025c.c(b10.h(), this.f7026d)) {
                b10.a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", l = {104}, m = "invokeSuspend")
    static final class e extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7027c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f7028d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4531i f7029e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ N f7030f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {105, 111, 113}, m = "invokeSuspend")
        static final class a extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

            /* renamed from: d  reason: collision with root package name */
            int f7031d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f7032e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4531i f7033f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C4526d f7034g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ N f7035h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4531i iVar, C4526d dVar, N n10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f7033f = iVar;
                this.f7034g = dVar;
                this.f7035h = n10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f7033f, this.f7034g, this.f7035h, eVar);
                aVar.f7032e = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
                return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: A1.c} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r9.f7031d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0026
                    if (r1 == r4) goto L_0x001e
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    goto L_0x001a
                L_0x0012:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L_0x001a:
                    XH.y.b(r10)
                    goto L_0x0089
                L_0x001e:
                    java.lang.Object r1 = r9.f7032e
                    A1.c r1 = (A1.C4336c) r1
                    XH.y.b(r10)
                    goto L_0x0039
                L_0x0026:
                    XH.y.b(r10)
                    java.lang.Object r10 = r9.f7032e
                    r1 = r10
                    A1.c r1 = (A1.C4336c) r1
                    r9.f7032e = r1
                    r9.f7031d = r4
                    java.lang.Object r10 = H0.y.e(r1, r9)
                    if (r10 != r0) goto L_0x0039
                    return r0
                L_0x0039:
                    A1.p r10 = (A1.C4349p) r10
                    boolean r4 = H0.y.g(r10)
                    r5 = 0
                    if (r4 == 0) goto L_0x0076
                    int r4 = r10.b()
                    boolean r4 = A1.C4353u.c(r4)
                    if (r4 == 0) goto L_0x0076
                    java.util.List r4 = r10.c()
                    int r6 = r4.size()
                    r7 = 0
                L_0x0055:
                    if (r7 >= r6) goto L_0x0067
                    java.lang.Object r8 = r4.get(r7)
                    A1.B r8 = (A1.B) r8
                    boolean r8 = r8.p()
                    if (r8 == 0) goto L_0x0064
                    goto L_0x0076
                L_0x0064:
                    int r7 = r7 + 1
                    goto L_0x0055
                L_0x0067:
                    H0.i r2 = r9.f7033f
                    H0.d r4 = r9.f7034g
                    r9.f7032e = r5
                    r9.f7031d = r3
                    java.lang.Object r10 = H0.y.h(r1, r2, r4, r10, r9)
                    if (r10 != r0) goto L_0x0089
                    return r0
                L_0x0076:
                    boolean r3 = H0.y.g(r10)
                    if (r3 != 0) goto L_0x0089
                    B0.N r3 = r9.f7035h
                    r9.f7032e = r5
                    r9.f7031d = r2
                    java.lang.Object r10 = H0.y.j(r1, r3, r10, r9)
                    if (r10 != r0) goto L_0x0089
                    return r0
                L_0x0089:
                    XH.N r10 = XH.C16807N.f139792a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: H0.y.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C4531i iVar, N n10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f7029e = iVar;
            this.f7030f = n10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f7029e, this.f7030f, eVar);
            eVar2.f7028d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((e) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f7027c;
            if (i10 == 0) {
                XH.y.b(obj);
                K k10 = (K) this.f7028d;
                a aVar = new a(this.f7029e, new C4526d(k10.getViewConfiguration()), this.f7030f, (C17164e<? super a>) null);
                this.f7027c = 1;
                if (t.c(k10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {124, 128}, m = "touchSelection")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f7036c;

        /* renamed from: d  reason: collision with root package name */
        Object f7037d;

        /* renamed from: e  reason: collision with root package name */
        Object f7038e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f7039f;

        /* renamed from: g  reason: collision with root package name */
        int f7040g;

        f(C17164e<? super f> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f7039f = obj;
            this.f7040g |= Integer.MIN_VALUE;
            return y.j((C4336c) null, (N) null, (C4349p) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "it", "LXH/N;", "a", "(LA1/B;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<B, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f7041c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(N n10) {
            super(1);
            this.f7041c = n10;
        }

        public final void a(B b10) {
            this.f7041c.k(C4350q.g(b10));
            b10.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", f = "SelectionGestures.kt", l = {91}, m = "invokeSuspend")
    static final class h extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7042c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f7043d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f7044e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {93}, m = "invokeSuspend")
        static final class a extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

            /* renamed from: d  reason: collision with root package name */
            int f7045d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f7046e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17642l<Boolean, C16807N> f7047f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17642l<? super Boolean, C16807N> lVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f7047f = lVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f7047f, eVar);
                aVar.f7046e = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
                return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x002f A[RETURN] */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r4.f7045d
                    r2 = 1
                    if (r1 == 0) goto L_0x001b
                    if (r1 != r2) goto L_0x0013
                    java.lang.Object r1 = r4.f7046e
                    A1.c r1 = (A1.C4336c) r1
                    XH.y.b(r5)
                    goto L_0x0030
                L_0x0013:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L_0x001b:
                    XH.y.b(r5)
                    java.lang.Object r5 = r4.f7046e
                    A1.c r5 = (A1.C4336c) r5
                    r1 = r5
                L_0x0023:
                    A1.r r5 = A1.r.Initial
                    r4.f7046e = r1
                    r4.f7045d = r2
                    java.lang.Object r5 = r1.B1(r5, r4)
                    if (r5 != r0) goto L_0x0030
                    return r0
                L_0x0030:
                    A1.p r5 = (A1.C4349p) r5
                    nI.l<java.lang.Boolean, XH.N> r3 = r4.f7047f
                    boolean r5 = H0.y.g(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r3.invoke(r5)
                    goto L_0x0023
                */
                throw new UnsupportedOperationException("Method not decompiled: H0.y.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C17642l<? super Boolean, C16807N> lVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f7044e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f7044e, eVar);
            hVar.f7043d = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((h) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f7042c;
            if (i10 == 0) {
                XH.y.b(obj);
                a aVar = new a(this.f7044e, (C17164e<? super a>) null);
                this.f7042c = 1;
                if (((K) this.f7043d).t1(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062 A[SYNTHETIC] */
    public static final java.lang.Object e(A1.C4336c r7, dI.C17164e<? super A1.C4349p> r8) {
        /*
            boolean r0 = r8 instanceof H0.y.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            H0.y$a r0 = (H0.y.a) r0
            int r1 = r0.f7019e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7019e = r1
            goto L_0x0018
        L_0x0013:
            H0.y$a r0 = new H0.y$a
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f7018d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f7019e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.f7017c
            A1.c r7 = (A1.C4336c) r7
            XH.y.b(r8)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            XH.y.b(r8)
        L_0x0038:
            A1.r r8 = A1.r.Main
            r0.f7017c = r7
            r0.f7019e = r3
            java.lang.Object r8 = r7.B1(r8, r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            A1.p r8 = (A1.C4349p) r8
            java.util.List r2 = r8.c()
            int r4 = r2.size()
            r5 = 0
        L_0x0050:
            if (r5 >= r4) goto L_0x0062
            java.lang.Object r6 = r2.get(r5)
            A1.B r6 = (A1.B) r6
            boolean r6 = A1.C4350q.b(r6)
            if (r6 != 0) goto L_0x005f
            goto L_0x0038
        L_0x005f:
            int r5 = r5 + 1
            goto L_0x0050
        L_0x0062:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.y.e(A1.c, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final boolean f(w1 w1Var, B b10, B b11) {
        return C5667g.k(C5667g.q(b10.h(), b11.h())) < m.k(w1Var, b10.n());
    }

    public static final boolean g(C4349p pVar) {
        List<B> c10 = pVar.c();
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!P.g(c10.get(i10).n(), P.f4356a.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: H0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: H0.i} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(A1.C4336c r7, H0.C4531i r8, H0.C4526d r9, A1.C4349p r10, dI.C17164e<? super XH.C16807N> r11) {
        /*
            boolean r0 = r11 instanceof H0.y.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            H0.y$b r0 = (H0.y.b) r0
            int r1 = r0.f7023f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7023f = r1
            goto L_0x0018
        L_0x0013:
            H0.y$b r0 = new H0.y$b
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f7022e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f7023f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r5) goto L_0x003f
            if (r2 != r4) goto L_0x0037
            java.lang.Object r7 = r0.f7021d
            r8 = r7
            H0.i r8 = (H0.C4531i) r8
            java.lang.Object r7 = r0.f7020c
            A1.c r7 = (A1.C4336c) r7
            XH.y.b(r11)
            goto L_0x00ea
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            java.lang.Object r7 = r0.f7021d
            r8 = r7
            H0.i r8 = (H0.C4531i) r8
            java.lang.Object r7 = r0.f7020c
            A1.c r7 = (A1.C4336c) r7
            XH.y.b(r11)
            goto L_0x0082
        L_0x004c:
            XH.y.b(r11)
            r9.d(r10)
            java.util.List r11 = r10.c()
            java.lang.Object r11 = r11.get(r3)
            A1.B r11 = (A1.B) r11
            boolean r10 = H0.T.b(r10)
            if (r10 == 0) goto L_0x00ae
            long r9 = r11.h()
            boolean r9 = r8.e(r9)
            if (r9 == 0) goto L_0x0115
            long r9 = r11.f()
            H0.y$c r11 = new H0.y$c
            r11.<init>(r8)
            r0.f7020c = r7
            r0.f7021d = r8
            r0.f7023f = r5
            java.lang.Object r11 = p0.m.i(r7, r9, r11, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x00aa
            A1.p r7 = r7.b1()
            java.util.List r7 = r7.c()
            int r9 = r7.size()
        L_0x0096:
            if (r3 >= r9) goto L_0x00aa
            java.lang.Object r10 = r7.get(r3)
            A1.B r10 = (A1.B) r10
            boolean r11 = A1.C4350q.c(r10)
            if (r11 == 0) goto L_0x00a7
            r10.a()
        L_0x00a7:
            int r3 = r3 + 1
            goto L_0x0096
        L_0x00aa:
            r8.a()
            goto L_0x0115
        L_0x00ae:
            int r9 = r9.a()
            if (r9 == r5) goto L_0x00c4
            if (r9 == r4) goto L_0x00bd
            H0.v$a r9 = H0.C4543v.f6972a
            H0.v r9 = r9.m()
            goto L_0x00ca
        L_0x00bd:
            H0.v$a r9 = H0.C4543v.f6972a
            H0.v r9 = r9.n()
            goto L_0x00ca
        L_0x00c4:
            H0.v$a r9 = H0.C4543v.f6972a
            H0.v r9 = r9.l()
        L_0x00ca:
            long r5 = r11.h()
            boolean r10 = r8.b(r5, r9)
            if (r10 == 0) goto L_0x0115
            long r10 = r11.f()
            H0.y$d r2 = new H0.y$d
            r2.<init>(r8, r9)
            r0.f7020c = r7
            r0.f7021d = r8
            r0.f7023f = r4
            java.lang.Object r11 = p0.m.i(r7, r10, r2, r0)
            if (r11 != r1) goto L_0x00ea
            return r1
        L_0x00ea:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x0112
            A1.p r7 = r7.b1()
            java.util.List r7 = r7.c()
            int r9 = r7.size()
        L_0x00fe:
            if (r3 >= r9) goto L_0x0112
            java.lang.Object r10 = r7.get(r3)
            A1.B r10 = (A1.B) r10
            boolean r11 = A1.C4350q.c(r10)
            if (r11 == 0) goto L_0x010f
            r10.a()
        L_0x010f:
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x0112:
            r8.a()
        L_0x0115:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.y.h(A1.c, H0.i, H0.d, A1.p, dI.e):java.lang.Object");
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, C4531i iVar, N n10) {
        return U.c(dVar, iVar, n10, new e(iVar, n10, (C17164e<? super e>) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: B0.N} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0 A[Catch:{ CancellationException -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[Catch:{ CancellationException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce A[Catch:{ CancellationException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(A1.C4336c r8, B0.N r9, A1.C4349p r10, dI.C17164e<? super XH.C16807N> r11) {
        /*
            boolean r0 = r11 instanceof H0.y.f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            H0.y$f r0 = (H0.y.f) r0
            int r1 = r0.f7040g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7040g = r1
            goto L_0x0018
        L_0x0013:
            H0.y$f r0 = new H0.y$f
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f7039f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f7040g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r8 = r0.f7037d
            r9 = r8
            B0.N r9 = (B0.N) r9
            java.lang.Object r8 = r0.f7036c
            A1.c r8 = (A1.C4336c) r8
            XH.y.b(r11)     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x00a1
        L_0x0035:
            r8 = move-exception
            goto L_0x00d4
        L_0x0038:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0040:
            java.lang.Object r8 = r0.f7038e
            A1.B r8 = (A1.B) r8
            java.lang.Object r9 = r0.f7037d
            B0.N r9 = (B0.N) r9
            java.lang.Object r10 = r0.f7036c
            A1.c r10 = (A1.C4336c) r10
            XH.y.b(r11)     // Catch:{ CancellationException -> 0x0035 }
            r7 = r10
            r10 = r8
            r8 = r7
            goto L_0x0073
        L_0x0053:
            XH.y.b(r11)
            java.util.List r10 = r10.c()     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r10 = YH.C16877v.w0(r10)     // Catch:{ CancellationException -> 0x0035 }
            A1.B r10 = (A1.B) r10     // Catch:{ CancellationException -> 0x0035 }
            long r5 = r10.f()     // Catch:{ CancellationException -> 0x0035 }
            r0.f7036c = r8     // Catch:{ CancellationException -> 0x0035 }
            r0.f7037d = r9     // Catch:{ CancellationException -> 0x0035 }
            r0.f7038e = r10     // Catch:{ CancellationException -> 0x0035 }
            r0.f7040g = r4     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r11 = p0.m.c(r8, r5, r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r11 != r1) goto L_0x0073
            return r1
        L_0x0073:
            A1.B r11 = (A1.B) r11     // Catch:{ CancellationException -> 0x0035 }
            if (r11 == 0) goto L_0x00d1
            androidx.compose.ui.platform.w1 r2 = r8.getViewConfiguration()     // Catch:{ CancellationException -> 0x0035 }
            boolean r10 = f(r2, r10, r11)     // Catch:{ CancellationException -> 0x0035 }
            if (r10 == 0) goto L_0x00d1
            long r4 = r11.h()     // Catch:{ CancellationException -> 0x0035 }
            r9.i(r4)     // Catch:{ CancellationException -> 0x0035 }
            long r10 = r11.f()     // Catch:{ CancellationException -> 0x0035 }
            H0.y$g r2 = new H0.y$g     // Catch:{ CancellationException -> 0x0035 }
            r2.<init>(r9)     // Catch:{ CancellationException -> 0x0035 }
            r0.f7036c = r8     // Catch:{ CancellationException -> 0x0035 }
            r0.f7037d = r9     // Catch:{ CancellationException -> 0x0035 }
            r4 = 0
            r0.f7038e = r4     // Catch:{ CancellationException -> 0x0035 }
            r0.f7040g = r3     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r11 = p0.m.i(r8, r10, r2, r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r11 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ CancellationException -> 0x0035 }
            boolean r10 = r11.booleanValue()     // Catch:{ CancellationException -> 0x0035 }
            if (r10 == 0) goto L_0x00ce
            A1.p r8 = r8.b1()     // Catch:{ CancellationException -> 0x0035 }
            java.util.List r8 = r8.c()     // Catch:{ CancellationException -> 0x0035 }
            int r10 = r8.size()     // Catch:{ CancellationException -> 0x0035 }
            r11 = 0
        L_0x00b6:
            if (r11 >= r10) goto L_0x00ca
            java.lang.Object r0 = r8.get(r11)     // Catch:{ CancellationException -> 0x0035 }
            A1.B r0 = (A1.B) r0     // Catch:{ CancellationException -> 0x0035 }
            boolean r1 = A1.C4350q.c(r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r1 == 0) goto L_0x00c7
            r0.a()     // Catch:{ CancellationException -> 0x0035 }
        L_0x00c7:
            int r11 = r11 + 1
            goto L_0x00b6
        L_0x00ca:
            r9.g()     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x00d1
        L_0x00ce:
            r9.onCancel()     // Catch:{ CancellationException -> 0x0035 }
        L_0x00d1:
            XH.N r8 = XH.C16807N.f139792a
            return r8
        L_0x00d4:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.y.j(A1.c, B0.N, A1.p, dI.e):java.lang.Object");
    }

    public static final androidx.compose.ui.d k(androidx.compose.ui.d dVar, C17642l<? super Boolean, C16807N> lVar) {
        return U.d(dVar, 8675309, new h(lVar, (C17164e<? super h>) null));
    }
}
