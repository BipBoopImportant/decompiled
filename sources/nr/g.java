package nr;

import Jq.d;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nr.f;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnr/g;", "Lnr/f;", "LJq/c;", "repository", "<init>", "(LJq/c;)V", "LTJ/g;", "LJq/d;", "LQq/l;", "Lnr/f$a;", "b", "(LTJ/g;)LTJ/g;", "invoke", "()LTJ/g;", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "LJq/c;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Jq.c f100020a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<f.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100021a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.g$a$a  reason: collision with other inner class name */
        public static final class C2307a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100022a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.usecase.GetFaqContentFlowUseCaseImpl$mapToTabContent$$inlined$map$1$2", f = "GetFaqContentFlowUseCase.kt", l = {50}, m = "emit")
            /* renamed from: nr.g$a$a$a  reason: collision with other inner class name */
            public static final class C2308a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100023c;

                /* renamed from: d  reason: collision with root package name */
                int f100024d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2307a f100025e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2308a(C2307a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100025e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100023c = obj;
                    this.f100024d |= Integer.MIN_VALUE;
                    return this.f100025e.emit((Object) null, this);
                }
            }

            public C2307a(C16533h hVar) {
                this.f100022a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof nr.g.a.C2307a.C2308a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    nr.g$a$a$a r0 = (nr.g.a.C2307a.C2308a) r0
                    int r1 = r0.f100024d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100024d = r1
                    goto L_0x0018
                L_0x0013:
                    nr.g$a$a$a r0 = new nr.g$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f100023c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100024d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x006c
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f100022a
                    Jq.d r5 = (Jq.d) r5
                    boolean r2 = r5 instanceof Jq.d.a
                    if (r2 != 0) goto L_0x0061
                    boolean r2 = r5 instanceof Jq.d.b
                    if (r2 == 0) goto L_0x0041
                    goto L_0x0061
                L_0x0041:
                    boolean r2 = r5 instanceof Jq.d.c
                    if (r2 == 0) goto L_0x0048
                    nr.f$a$c r5 = nr.f.a.c.f100019a
                    goto L_0x0063
                L_0x0048:
                    boolean r2 = r5 instanceof Jq.d.C1628d
                    if (r2 == 0) goto L_0x005b
                    nr.f$a$b r2 = new nr.f$a$b
                    Jq.d$d r5 = (Jq.d.C1628d) r5
                    java.lang.Object r5 = r5.a()
                    Qq.l r5 = (Qq.l) r5
                    r2.<init>(r5)
                    r5 = r2
                    goto L_0x0063
                L_0x005b:
                    XH.t r5 = new XH.t
                    r5.<init>()
                    throw r5
                L_0x0061:
                    nr.f$a$a r5 = nr.f.a.C2306a.f100017a
                L_0x0063:
                    r0.f100024d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x006c
                    return r1
                L_0x006c:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: nr.g.a.C2307a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f100021a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100021a.collect(new C2307a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.usecase.GetFaqContentFlowUseCaseImpl", f = "GetFaqContentFlowUseCase.kt", l = {39}, m = "preheatCache")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f100026c;

        /* renamed from: d  reason: collision with root package name */
        Object f100027d;

        /* renamed from: e  reason: collision with root package name */
        Object f100028e;

        /* renamed from: f  reason: collision with root package name */
        Object f100029f;

        /* renamed from: g  reason: collision with root package name */
        Object f100030g;

        /* renamed from: h  reason: collision with root package name */
        Object f100031h;

        /* renamed from: i  reason: collision with root package name */
        Object f100032i;

        /* renamed from: j  reason: collision with root package name */
        Object f100033j;

        /* renamed from: k  reason: collision with root package name */
        Object f100034k;

        /* renamed from: l  reason: collision with root package name */
        Object f100035l;

        /* renamed from: m  reason: collision with root package name */
        int f100036m;

        /* renamed from: n  reason: collision with root package name */
        int f100037n;

        /* renamed from: o  reason: collision with root package name */
        int f100038o;

        /* renamed from: p  reason: collision with root package name */
        int f100039p;

        /* renamed from: q  reason: collision with root package name */
        int f100040q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f100041r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ g f100042s;

        /* renamed from: t  reason: collision with root package name */
        int f100043t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f100042s = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f100041r = obj;
            this.f100043t |= Integer.MIN_VALUE;
            return this.f100042s.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LJq/d;", "LQq/l;", "it", "", "<anonymous>", "(LJq/d;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.usecase.GetFaqContentFlowUseCaseImpl$preheatCache$3", f = "GetFaqContentFlowUseCase.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<Jq.d<Qq.l>, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100044c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f100045d;

        c(C17164e<? super c> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(eVar);
            cVar.f100045d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(Jq.d<Qq.l> dVar, C17164e<? super Boolean> eVar) {
            return ((c) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f100044c == 0) {
                y.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!(((Jq.d) this.f100045d) instanceof d.c));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public g(Jq.c cVar) {
        C17542s.j(cVar, "repository");
        this.f100020a = cVar;
    }

    private final C16532g<f.a> b(C16532g<? extends Jq.d<Qq.l>> gVar) {
        return new a(gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super XH.C16807N> r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            boolean r2 = r1 instanceof nr.g.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            nr.g$b r2 = (nr.g.b) r2
            int r3 = r2.f100043t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f100043t = r3
            goto L_0x001c
        L_0x0017:
            nr.g$b r2 = new nr.g$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f100041r
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f100043t
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r14 = 1
            r15 = 0
            if (r5 == 0) goto L_0x0069
            if (r5 != r14) goto L_0x0061
            java.lang.Object r1 = r2.f100034k
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f100033j
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f100032i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f100031h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f100030g
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r2.f100029f
            nr.g r1 = (nr.g) r1
            java.lang.Object r1 = r2.f100028e
            nr.g r1 = (nr.g) r1
            java.lang.Object r1 = r2.f100027d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f100026c
            nr.g r1 = (nr.g) r1
            XH.y.b(r3)
            r23 = r7
            r24 = r8
            goto L_0x016a
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0069:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x007f:
            boolean r16 = r5.hasNext()
            if (r16 == 0) goto L_0x0096
            java.lang.Object r11 = r5.next()
            r12 = r11
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r3, r15)
            if (r12 == 0) goto L_0x007f
            r14.add(r11)
            goto L_0x007f
        L_0x0096:
            java.util.Iterator r5 = r14.iterator()
            r16 = r14
            r11 = 0
            r12 = 0
        L_0x009e:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x012e
            java.lang.Object r22 = r5.next()
            r16 = r22
            qv.b r16 = (qv.C11819b) r16
            r15 = 0
            if (r11 != 0) goto L_0x00c3
            java.lang.String r13 = "FAQ Preheating cache"
            java.lang.String r13 = qv.C11818a.a(r13, r15)
            if (r13 != 0) goto L_0x00bf
            r23 = r7
            r24 = r8
            r7 = r22
            goto L_0x0134
        L_0x00bf:
            java.lang.String r11 = qv.C11820c.a(r13)
        L_0x00c3:
            if (r12 != 0) goto L_0x0113
            java.lang.Class<nr.g> r12 = nr.g.class
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r23 = r7
            r24 = r8
            r7 = 0
            r13 = 36
            r15 = 2
            java.lang.String r8 = HJ.C15854t.s1(r12, r13, r7, r15, r7)
            r13 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r13, r7, r15, r7)
            int r7 = r8.length()
            if (r7 != 0) goto L_0x00e7
            goto L_0x00eb
        L_0x00e7:
            java.lang.String r12 = HJ.C15854t.P0(r8, r10)
        L_0x00eb:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r8 = 1
            boolean r7 = HJ.C15854t.b0(r7, r9, r8)
            if (r7 == 0) goto L_0x00fd
            r7 = r24
            goto L_0x00ff
        L_0x00fd:
            r7 = r23
        L_0x00ff:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r6)
            r8.append(r12)
            java.lang.String r7 = r8.toString()
            r12 = r7
            goto L_0x0117
        L_0x0113:
            r23 = r7
            r24 = r8
        L_0x0117:
            r19 = 0
            r17 = r3
            r18 = r12
            r7 = 0
            r20 = r7
            r21 = r11
            r16.a(r17, r18, r19, r20, r21)
            r16 = r22
            r7 = r23
            r8 = r24
            r15 = 0
            goto L_0x009e
        L_0x012e:
            r23 = r7
            r24 = r8
            r7 = r16
        L_0x0134:
            Jq.c r8 = r0.f100020a
            TJ.g r8 = r8.h()
            nr.g$c r13 = new nr.g$c
            r15 = 0
            r13.<init>(r15)
            r2.f100026c = r0
            r2.f100027d = r1
            r2.f100028e = r0
            r2.f100029f = r0
            r2.f100030g = r3
            r2.f100031h = r11
            r2.f100032i = r12
            r2.f100033j = r14
            r2.f100034k = r5
            r2.f100035l = r7
            r1 = 0
            r2.f100036m = r1
            r2.f100037n = r1
            r2.f100038o = r1
            r2.f100039p = r1
            r2.f100040q = r1
            r1 = 1
            r2.f100043t = r1
            java.lang.Object r1 = TJ.C16534i.C(r8, r13, r2)
            if (r1 != r4) goto L_0x0169
            return r4
        L_0x0169:
            r1 = r0
        L_0x016a:
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x017d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0195
            java.lang.Object r5 = r3.next()
            r7 = r5
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r2, r8)
            if (r7 == 0) goto L_0x017d
            r4.add(r5)
            goto L_0x017d
        L_0x0195:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r7 = 0
        L_0x019b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0219
            java.lang.Object r5 = r3.next()
            r16 = r5
            qv.b r16 = (qv.C11819b) r16
            r5 = 0
            if (r7 != 0) goto L_0x01b9
            java.lang.String r7 = "FAQ Cache preheated"
            java.lang.String r7 = qv.C11818a.a(r7, r5)
            if (r7 != 0) goto L_0x01b5
            goto L_0x0219
        L_0x01b5:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x01b9:
            if (r4 != 0) goto L_0x0206
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r8 = 36
            r11 = 2
            r12 = 0
            java.lang.String r13 = HJ.C15854t.s1(r4, r8, r12, r11, r12)
            r14 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r14, r12, r11, r12)
            int r15 = r13.length()
            if (r15 != 0) goto L_0x01db
            goto L_0x01df
        L_0x01db:
            java.lang.String r4 = HJ.C15854t.P0(r13, r10)
        L_0x01df:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            r15 = 1
            boolean r13 = HJ.C15854t.b0(r13, r9, r15)
            if (r13 == 0) goto L_0x01f1
            r13 = r24
            goto L_0x01f3
        L_0x01f1:
            r13 = r23
        L_0x01f3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r13)
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            goto L_0x020b
        L_0x0206:
            r11 = 2
            r12 = 0
            r14 = 46
            r15 = 1
        L_0x020b:
            r19 = 0
            r17 = r2
            r18 = r4
            r20 = r5
            r21 = r7
            r16.a(r17, r18, r19, r20, r21)
            goto L_0x019b
        L_0x0219:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.g.a(dI.e):java.lang.Object");
    }

    public C16532g<f.a> invoke() {
        return C16534i.s(b(this.f100020a.h()));
    }
}
