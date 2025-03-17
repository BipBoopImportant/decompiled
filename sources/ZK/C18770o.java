package zK;

import G1.r;
import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16534i;
import U0.A1;
import U0.T0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import c2.h;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5530a;
import m0.C5546i;
import m0.C5554m;
import nI.p;
import o1.C5662b;
import o1.C5673m;
import o1.C5674n;
import p1.C5747v0;
import p1.C5749w0;
import r0.j;
import r0.k;
import r0.o;
import r1.C5817c;
import r1.g;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u00013Ba\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u0014*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, d2 = {"LzK/o;", "Landroidx/compose/ui/d$c;", "LG1/r;", "LU0/T0;", "Lr0/k;", "interactionSource", "", "resizeFactor", "Lm0/i;", "animationSpec", "LU0/A1;", "Lp1/v0;", "color", "Lm0/a;", "Lm0/m;", "scale", "Lc2/h;", "cornersRadius", "<init>", "(Lr0/k;FLm0/i;LU0/A1;LU0/A1;LU0/A1;)V", "LXH/N;", "F2", "(LdI/e;)Ljava/lang/Object;", "LQJ/Q;", "scope", "H2", "(LQJ/Q;)V", "G2", "m2", "()V", "Lr1/c;", "z", "(Lr1/c;)V", "w0", "c1", "o1", "n", "Lr0/k;", "o", "F", "p", "Lm0/i;", "q", "LU0/A1;", "r", "s", "LQJ/x;", "t", "LQJ/x;", "finishSignalDeferred", "u", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zK.o  reason: case insensitive filesystem */
final class C18770o extends d.c implements r, T0 {

    /* renamed from: u  reason: collision with root package name */
    public static final a f152859u = new a((DefaultConstructorMarker) null);

    /* renamed from: v  reason: collision with root package name */
    private static final float f152860v = h.B((float) 0);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final k f152861n;

    /* renamed from: o  reason: collision with root package name */
    private final float f152862o;

    /* renamed from: p  reason: collision with root package name */
    private final C5546i<Float> f152863p;

    /* renamed from: q  reason: collision with root package name */
    private final A1<C5747v0> f152864q;

    /* renamed from: r  reason: collision with root package name */
    private final A1<C5530a<Float, C5554m>> f152865r;

    /* renamed from: s  reason: collision with root package name */
    private final A1<h> f152866s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public C16339x<C16807N> f152867t = C16343z.a((F0) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LzK/o$a;", "", "<init>", "()V", "", "DefaultScale", "F", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zK.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "net.ikea.skapa.ui.util.SkapaButtonIndicationImplementation", f = "ModifierExt.kt", l = {107, 108, 109}, m = "animate")
    /* renamed from: zK.o$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152868c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f152869d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C18770o f152870e;

        /* renamed from: f  reason: collision with root package name */
        int f152871f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C18770o oVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f152870e = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152869d = obj;
            this.f152871f |= Integer.MIN_VALUE;
            return this.f152870e.F2(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "net.ikea.skapa.ui.util.SkapaButtonIndicationImplementation$onAttach$1", f = "ModifierExt.kt", l = {114}, m = "invokeSuspend")
    /* renamed from: zK.o$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152872c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f152873d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C18770o f152874e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/j;", "interaction", "LXH/N;", "<anonymous>", "(Lr0/j;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "net.ikea.skapa.ui.util.SkapaButtonIndicationImplementation$onAttach$1$1", f = "ModifierExt.kt", l = {}, m = "invokeSuspend")
        /* renamed from: zK.o$c$a */
        static final class a extends l implements p<j, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f152875c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f152876d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C18770o f152877e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Q f152878f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C18770o oVar, Q q10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f152877e = oVar;
                this.f152878f = q10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f152877e, this.f152878f, eVar);
                aVar.f152876d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(j jVar, C17164e<? super C16807N> eVar) {
                return ((a) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f152875c == 0) {
                    y.b(obj);
                    j jVar = (j) this.f152876d;
                    if (jVar instanceof o.b) {
                        this.f152877e.H2(this.f152878f);
                    } else if (jVar instanceof o.c) {
                        this.f152877e.G2(this.f152878f);
                    } else if (jVar instanceof o.a) {
                        this.f152877e.G2(this.f152878f);
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C18770o oVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f152874e = oVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f152874e, eVar);
            cVar.f152873d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f152872c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<j> c10 = this.f152874e.f152861n.c();
                a aVar = new a(this.f152874e, (Q) this.f152873d, (C17164e<? super a>) null);
                this.f152872c = 1;
                if (C16534i.j(c10, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "net.ikea.skapa.ui.util.SkapaButtonIndicationImplementation$reset$1", f = "ModifierExt.kt", l = {}, m = "invokeSuspend")
    /* renamed from: zK.o$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152879c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18770o f152880d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C18770o oVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f152880d = oVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f152880d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f152879c == 0) {
                y.b(obj);
                C16339x D22 = this.f152880d.f152867t;
                C16807N n10 = C16807N.f139792a;
                D22.J(n10);
                return n10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "net.ikea.skapa.ui.util.SkapaButtonIndicationImplementation$resize$1", f = "ModifierExt.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: zK.o$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18770o f152882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C18770o oVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f152882d = oVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f152882d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f152881c;
            if (i10 == 0) {
                y.b(obj);
                C18770o oVar = this.f152882d;
                this.f152881c = 1;
                if (oVar.F2(this) == f10) {
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

    public C18770o(k kVar, float f10, C5546i<Float> iVar, A1<C5747v0> a12, A1<C5530a<Float, C5554m>> a13, A1<h> a14) {
        C17542s.j(kVar, "interactionSource");
        C17542s.j(iVar, "animationSpec");
        C17542s.j(a12, "color");
        C17542s.j(a13, "scale");
        C17542s.j(a14, "cornersRadius");
        this.f152861n = kVar;
        this.f152862o = f10;
        this.f152863p = iVar;
        this.f152864q = a12;
        this.f152865r = a13;
        this.f152866s = a14;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F2(dI.C17164e<? super XH.C16807N> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof zK.C18770o.b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            zK.o$b r0 = (zK.C18770o.b) r0
            int r1 = r0.f152871f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152871f = r1
            goto L_0x0018
        L_0x0013:
            zK.o$b r0 = new zK.o$b
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f152869d
            java.lang.Object r9 = eI.C17187b.f()
            int r1 = r0.f152871f
            r10 = 3
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x0040
            if (r1 == r11) goto L_0x0038
            if (r1 != r10) goto L_0x0030
            XH.y.b(r13)
            goto L_0x009f
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0038:
            java.lang.Object r1 = r0.f152868c
            zK.o r1 = (zK.C18770o) r1
            XH.y.b(r13)
            goto L_0x007c
        L_0x0040:
            java.lang.Object r1 = r0.f152868c
            zK.o r1 = (zK.C18770o) r1
            XH.y.b(r13)
            goto L_0x006f
        L_0x0048:
            XH.y.b(r13)
            U0.A1<m0.a<java.lang.Float, m0.m>> r13 = r12.f152865r
            java.lang.Object r13 = r13.getValue()
            r1 = r13
            m0.a r1 = (m0.C5530a) r1
            float r13 = r12.f152862o
            java.lang.Float r13 = kotlin.coroutines.jvm.internal.b.d(r13)
            m0.i<java.lang.Float> r3 = r12.f152863p
            r0.f152868c = r12
            r0.f152871f = r2
            r4 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            r2 = r13
            r6 = r0
            java.lang.Object r13 = m0.C5530a.f(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r9) goto L_0x006e
            return r9
        L_0x006e:
            r1 = r12
        L_0x006f:
            QJ.x<XH.N> r13 = r1.f152867t
            r0.f152868c = r1
            r0.f152871f = r11
            java.lang.Object r13 = r13.f(r0)
            if (r13 != r9) goto L_0x007c
            return r9
        L_0x007c:
            U0.A1<m0.a<java.lang.Float, m0.m>> r13 = r1.f152865r
            java.lang.Object r13 = r13.getValue()
            m0.a r13 = (m0.C5530a) r13
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.d(r2)
            m0.i<java.lang.Float> r3 = r1.f152863p
            r1 = 0
            r0.f152868c = r1
            r0.f152871f = r10
            r4 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            r1 = r13
            r6 = r0
            java.lang.Object r13 = m0.C5530a.f(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r9) goto L_0x009f
            return r9
        L_0x009f:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zK.C18770o.F2(dI.e):java.lang.Object");
    }

    public final void G2(Q q10) {
        C17542s.j(q10, "scope");
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new d(this, (C17164e<? super d>) null), 3, (Object) null);
    }

    public final void H2(Q q10) {
        C17542s.j(q10, "scope");
        this.f152867t = C16343z.a((F0) null);
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new e(this, (C17164e<? super e>) null), 3, (Object) null);
    }

    public void c1() {
        this.f152867t.J(C16807N.f139792a);
    }

    public void m2() {
        F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
    }

    public void o1() {
        this.f152867t.J(C16807N.f139792a);
    }

    public void w0() {
    }

    public void z(C5817c cVar) {
        long j10;
        r1.d dVar;
        long j11;
        r1.d dVar2;
        C5747v0 value;
        C5817c cVar2 = cVar;
        C17542s.j(cVar2, "<this>");
        float floatValue = ((Number) this.f152865r.getValue().m()).floatValue();
        long N12 = cVar.N1();
        r1.d I12 = cVar.I1();
        long b10 = I12.b();
        I12.e().t();
        try {
            I12.c().f(floatValue, floatValue, N12);
            if (((Number) this.f152865r.getValue().m()).floatValue() == 1.0f || (value = this.f152864q.getValue()) == null) {
                j11 = b10;
                dVar2 = I12;
            } else {
                try {
                    long y10 = value.y();
                    float G10 = h.D(this.f152866s.getValue().G(), h.f23031b.c()) ? f152860v : this.f152866s.getValue().G();
                    cVar.I1().e();
                    j11 = b10;
                    dVar2 = I12;
                    r1.f.L1(cVar, y10, 0, C5674n.a(C5673m.l(cVar.b()), C5673m.i(cVar.b())), C5662b.b(cVar2.H1(G10), 0.0f, 2, (Object) null), (g) null, 0.0f, (C5749w0) null, 0, 242, (Object) null);
                } catch (Throwable th2) {
                    th = th2;
                    dVar = dVar2;
                    j10 = j11;
                    dVar.e().n();
                    dVar.g(j10);
                    throw th;
                }
            }
            cVar.V1();
            dVar2.e().n();
            dVar2.g(j11);
        } catch (Throwable th3) {
            th = th3;
            j10 = b10;
            dVar = I12;
        }
    }
}
