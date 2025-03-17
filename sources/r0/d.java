package R0;

import G1.C4505h;
import G1.C4506i;
import G1.C4507j;
import G1.C4510m;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4892n0;
import U0.D0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.platform.C5100f0;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import tI.C17978n;
import z1.C6271a;
import z1.C6272b;
import z1.C6274d;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007H@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007H@¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J*\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020&H@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u0019\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR+\u0010M\u001a\u00020\u00142\u0006\u0010H\u001a\u00020\u00148B@BX\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\u0019\"\u0004\bL\u0010CR+\u0010Q\u001a\u00020\u00142\u0006\u0010H\u001a\u00020\u00148B@BX\u0002¢\u0006\u0012\n\u0004\bN\u0010J\u001a\u0004\bO\u0010\u0019\"\u0004\bP\u0010CR\u0014\u0010S\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0019R\u0014\u0010W\u001a\u00020T8BX\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0019\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"LR0/d;", "LG1/m;", "LG1/h;", "Lz1/a;", "", "isRefreshing", "Lkotlin/Function0;", "LXH/N;", "onRefresh", "enabled", "LR0/e;", "state", "Lc2/h;", "threshold", "<init>", "(ZLnI/a;ZLR0/e;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lo1/g;", "available", "Q2", "(J)J", "", "velocity", "Y2", "(FLdI/e;)Ljava/lang/Object;", "P2", "()F", "O2", "(LdI/e;)Ljava/lang/Object;", "N2", "m2", "()V", "Lz1/e;", "source", "C1", "(JI)J", "consumed", "N0", "(JJI)J", "Lc2/y;", "E1", "(JLdI/e;)Ljava/lang/Object;", "g3", "p", "Z", "X2", "()Z", "c3", "(Z)V", "q", "LnI/a;", "getOnRefresh", "()LnI/a;", "b3", "(LnI/a;)V", "r", "getEnabled", "a3", "s", "LR0/e;", "U2", "()LR0/e;", "d3", "(LR0/e;)V", "t", "F", "getThreshold-D9Ej5fM", "e3", "(F)V", "LG1/j;", "u", "LG1/j;", "nestedScrollNode", "<set-?>", "v", "LU0/n0;", "W2", "f3", "verticalOffset", "w", "S2", "Z2", "distancePulled", "R2", "adjustedDistancePulled", "", "V2", "()I", "thresholdPx", "T2", "progress", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends C4510m implements C4505h, C6271a {

    /* renamed from: p  reason: collision with root package name */
    private boolean f12239p;

    /* renamed from: q  reason: collision with root package name */
    private C17631a<C16807N> f12240q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12241r;

    /* renamed from: s  reason: collision with root package name */
    private e f12242s;

    /* renamed from: t  reason: collision with root package name */
    private float f12243t;

    /* renamed from: u  reason: collision with root package name */
    private C4507j f12244u;

    /* renamed from: v  reason: collision with root package name */
    private final C4892n0 f12245v;

    /* renamed from: w  reason: collision with root package name */
    private final C4892n0 f12246w;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {406}, m = "animateToHidden")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12247c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f12248d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f12249e;

        /* renamed from: f  reason: collision with root package name */
        int f12250f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f12249e = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12248d = obj;
            this.f12250f |= Integer.MIN_VALUE;
            return this.f12249e.N2(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {400}, m = "animateToThreshold")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12251c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f12252d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f12253e;

        /* renamed from: f  reason: collision with root package name */
        int f12254f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f12253e = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12252d = obj;
            this.f12254f |= Integer.MIN_VALUE;
            return this.f12253e.O2(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", f = "PullToRefresh.kt", l = {287, 289}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12255c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f12256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f12256d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f12256d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f12255c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f12256d.X2()) {
                    e U22 = this.f12256d.U2();
                    this.f12255c = 1;
                    if (U22.c(1.0f, this) == f10) {
                        return f10;
                    }
                } else {
                    e U23 = this.f12256d.U2();
                    this.f12255c = 2;
                    if (U23.c(0.0f, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1", f = "PullToRefresh.kt", l = {319}, m = "invokeSuspend")
    /* renamed from: R0.d$d  reason: collision with other inner class name */
    static final class C0188d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12257c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f12258d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0188d(d dVar, C17164e<? super C0188d> eVar) {
            super(2, eVar);
            this.f12258d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0188d(this.f12258d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C0188d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f12257c;
            if (i10 == 0) {
                y.b(obj);
                this.f12257c = 1;
                if (this.f12258d.U2().c(this.f12258d.W2() / ((float) this.f12258d.V2()), this) == f10) {
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {327}, m = "onPreFling-QWom1Mo")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        float f12259c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f12260d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f12261e;

        /* renamed from: f  reason: collision with root package name */
        int f12262f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f12261e = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12260d = obj;
            this.f12262f |= Integer.MIN_VALUE;
            return this.f12261e.E1(0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {359, 362}, m = "onRelease")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12263c;

        /* renamed from: d  reason: collision with root package name */
        float f12264d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f12265e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f12266f;

        /* renamed from: g  reason: collision with root package name */
        int f12267g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f12266f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12265e = obj;
            this.f12267g |= Integer.MIN_VALUE;
            return this.f12266f.Y2(0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", l = {333, 335}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12268c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f12269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f12269d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f12269d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f12268c;
            if (i10 == 0) {
                y.b(obj);
                if (!this.f12269d.X2()) {
                    d dVar = this.f12269d;
                    this.f12268c = 1;
                    if (dVar.N2(this) == f10) {
                        return f10;
                    }
                } else {
                    d dVar2 = this.f12269d;
                    this.f12268c = 2;
                    if (dVar2.O2(this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ d(boolean z10, C17631a aVar, boolean z11, e eVar, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, aVar, z11, eVar, f10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N2(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof R0.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            R0.d$a r0 = (R0.d.a) r0
            int r1 = r0.f12250f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12250f = r1
            goto L_0x0018
        L_0x0013:
            R0.d$a r0 = new R0.d$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f12248d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12250f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f12247c
            R0.d r0 = (R0.d) r0
            XH.y.b(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            XH.y.b(r5)
            R0.e r5 = r4.f12242s
            r0.f12247c = r4
            r0.f12250f = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            r5 = 0
            r0.Z2(r5)
            r0.f3(r5)
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.d.N2(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O2(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof R0.d.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            R0.d$b r0 = (R0.d.b) r0
            int r1 = r0.f12254f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12254f = r1
            goto L_0x0018
        L_0x0013:
            R0.d$b r0 = new R0.d$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f12252d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12254f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f12251c
            R0.d r0 = (R0.d) r0
            XH.y.b(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            XH.y.b(r5)
            R0.e r5 = r4.f12242s
            r0.f12251c = r4
            r0.f12254f = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            int r5 = r0.V2()
            float r5 = (float) r5
            r0.Z2(r5)
            int r5 = r0.V2()
            float r5 = (float) r5
            r0.f3(r5)
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.d.O2(dI.e):java.lang.Object");
    }

    private final float P2() {
        if (R2() <= ((float) V2())) {
            return R2();
        }
        float l10 = C17978n.l(Math.abs(T2()) - 1.0f, 0.0f, 2.0f);
        return ((float) V2()) + (((float) V2()) * (l10 - (((float) Math.pow((double) l10, (double) 2)) / ((float) 4))));
    }

    private final long Q2(long j10) {
        float f10;
        if (this.f12239p) {
            f10 = 0.0f;
        } else {
            float d10 = C17978n.d(S2() + C5667g.n(j10), 0.0f);
            f10 = d10 - S2();
            Z2(d10);
            f3(P2());
        }
        return C5668h.a(0.0f, f10);
    }

    private final float R2() {
        return S2() * 0.5f;
    }

    private final float S2() {
        return this.f12246w.a();
    }

    private final float T2() {
        return R2() / ((float) V2());
    }

    /* access modifiers changed from: private */
    public final int V2() {
        return ((c2.d) C4506i.a(this, C5100f0.e())).K0(this.f12243t);
    }

    /* access modifiers changed from: private */
    public final float W2() {
        return this.f12245v.a();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y2(float r7, dI.C17164e<? super java.lang.Float> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof R0.d.f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            R0.d$f r0 = (R0.d.f) r0
            int r1 = r0.f12267g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12267g = r1
            goto L_0x0018
        L_0x0013:
            R0.d$f r0 = new R0.d$f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12265e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12267g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            float r7 = r0.f12264d
            java.lang.Object r0 = r0.f12263c
            R0.d r0 = (R0.d) r0
            XH.y.b(r8)
            goto L_0x0080
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            float r7 = r0.f12264d
            java.lang.Object r0 = r0.f12263c
            R0.d r0 = (R0.d) r0
            XH.y.b(r8)
            goto L_0x006c
        L_0x0045:
            XH.y.b(r8)
            boolean r8 = r6.f12239p
            if (r8 == 0) goto L_0x0051
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.d(r5)
            return r7
        L_0x0051:
            float r8 = r6.R2()
            int r2 = r6.V2()
            float r2 = (float) r2
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0072
            r0.f12263c = r6
            r0.f12264d = r7
            r0.f12267g = r4
            java.lang.Object r8 = r6.O2(r0)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r0 = r6
        L_0x006c:
            nI.a<XH.N> r8 = r0.f12240q
            r8.invoke()
            goto L_0x0080
        L_0x0072:
            r0.f12263c = r6
            r0.f12264d = r7
            r0.f12267g = r3
            java.lang.Object r8 = r6.N2(r0)
            if (r8 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r0 = r6
        L_0x0080:
            float r8 = r0.S2()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x008a
        L_0x0088:
            r7 = r5
            goto L_0x008f
        L_0x008a:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x008f
            goto L_0x0088
        L_0x008f:
            r0.Z2(r5)
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.d(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.d.Y2(float, dI.e):java.lang.Object");
    }

    private final void Z2(float f10) {
        this.f12246w.n(f10);
    }

    private final void f3(float f10) {
        this.f12245v.n(f10);
    }

    public long C1(long j10, int i10) {
        return this.f12242s.e() ? C5667g.f26701b.c() : !this.f12241r ? C5667g.f26701b.c() : (!z1.e.d(i10, z1.e.f32374a.b()) || C5667g.n(j10) >= 0.0f) ? C5667g.f26701b.c() : Q2(j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object E1(long r5, dI.C17164e<? super c2.y> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof R0.d.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            R0.d$e r0 = (R0.d.e) r0
            int r1 = r0.f12262f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12262f = r1
            goto L_0x0018
        L_0x0013:
            R0.d$e r0 = new R0.d$e
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f12260d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12262f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            float r5 = r0.f12259c
            XH.y.b(r7)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            XH.y.b(r7)
            float r5 = c2.y.i(r5)
            r6 = 0
            r0.f12259c = r6
            r0.f12262f = r3
            java.lang.Object r7 = r4.Y2(r5, r0)
            if (r7 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r5 = r6
        L_0x0047:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = c2.z.a(r5, r6)
            c2.y r5 = c2.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.d.E1(long, dI.e):java.lang.Object");
    }

    public long N0(long j10, long j11, int i10) {
        if (this.f12242s.e()) {
            return C5667g.f26701b.c();
        }
        if (!this.f12241r) {
            return C5667g.f26701b.c();
        }
        if (!z1.e.d(i10, z1.e.f32374a.b())) {
            return C5667g.f26701b.c();
        }
        long Q22 = Q2(j11);
        F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new C0188d(this, (C17164e<? super C0188d>) null), 3, (Object) null);
        return Q22;
    }

    public final e U2() {
        return this.f12242s;
    }

    public final boolean X2() {
        return this.f12239p;
    }

    public final void a3(boolean z10) {
        this.f12241r = z10;
    }

    public final void b3(C17631a<C16807N> aVar) {
        this.f12240q = aVar;
    }

    public final void c3(boolean z10) {
        this.f12239p = z10;
    }

    public final void d3(e eVar) {
        this.f12242s = eVar;
    }

    public final void e3(float f10) {
        this.f12243t = f10;
    }

    public final void g3() {
        F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new g(this, (C17164e<? super g>) null), 3, (Object) null);
    }

    public void m2() {
        C2(this.f12244u);
        F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
    }

    private d(boolean z10, C17631a<C16807N> aVar, boolean z11, e eVar, float f10) {
        this.f12239p = z10;
        this.f12240q = aVar;
        this.f12241r = z11;
        this.f12242s = eVar;
        this.f12243t = f10;
        this.f12244u = C6274d.a(this, (C6272b) null);
        this.f12245v = D0.a(0.0f);
        this.f12246w = D0.a(0.0f);
    }
}
