package Bv;

import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.K;
import m0.C5530a;
import m0.C5532b;
import m0.C5554m;
import m0.C5559o0;
import n0.C5584G;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r0.m;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000e\u001a\u00020\f2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b\u001d\u0010)R#\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b\"\u0010)¨\u0006,"}, d2 = {"LBv/g;", "", "Lr0/m;", "interactionSource", "Ln0/G;", "focusIndication", "LQJ/Q;", "scope", "<init>", "(Lr0/m;Ln0/G;LQJ/Q;)V", "Lkotlin/Function2;", "LdI/e;", "LXH/N;", "block", "e", "(LnI/p;)V", "g", "()V", "Lkotlin/Function0;", "invokeOnCompletion", "h", "(LnI/a;)V", "f", "a", "Lr0/m;", "b", "()Lr0/m;", "Ln0/G;", "()Ln0/G;", "c", "LQJ/Q;", "getScope", "()LQJ/Q;", "LQJ/F0;", "d", "LQJ/F0;", "animation", "Lm0/a;", "", "Lm0/m;", "Lm0/a;", "()Lm0/a;", "scale", "translation", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Bv.g  reason: case insensitive filesystem */
public final class C6402g {

    /* renamed from: a  reason: collision with root package name */
    private final m f33465a;

    /* renamed from: b  reason: collision with root package name */
    private final C5584G f33466b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f33467c;

    /* renamed from: d  reason: collision with root package name */
    private F0 f33468d;

    /* renamed from: e  reason: collision with root package name */
    private final C5530a<Float, C5554m> f33469e = C5532b.b(1.0f, 0.0f, 2, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private final C5530a<Float, C5554m> f33470f = C5532b.b(0.0f, 0.0f, 2, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.compose.common.JumpOnClickAnimationState$onCancel$1", f = "JumpOnClickAnimationState.kt", l = {77, 78}, m = "invokeSuspend")
    /* renamed from: Bv.g$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33471c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6402g f33472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6402g gVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f33472d = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f33472d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f33471c;
            if (i10 == 0) {
                y.b(obj);
                C5530a<Float, C5554m> c10 = this.f33472d.c();
                Float d10 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                this.f33471c = 1;
                if (c10.t(d10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5530a<Float, C5554m> d11 = this.f33472d.d();
            Float d12 = kotlin.coroutines.jvm.internal.b.d(0.0f);
            this.f33471c = 2;
            if (d11.t(d12, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.compose.common.JumpOnClickAnimationState$onPress$1", f = "JumpOnClickAnimationState.kt", l = {35, 36, 37}, m = "invokeSuspend")
    /* renamed from: Bv.g$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33473c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6402g f33474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6402g gVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f33474d = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f33474d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f33473c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r4) goto L_0x0021
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                XH.y.b(r12)
                goto L_0x0071
            L_0x0015:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001d:
                XH.y.b(r12)
                goto L_0x0051
            L_0x0021:
                XH.y.b(r12)
                goto L_0x003d
            L_0x0025:
                XH.y.b(r12)
                Bv.g r12 = r11.f33474d
                m0.a r12 = r12.c()
                r1 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.d(r1)
                r11.f33473c = r4
                java.lang.Object r12 = r12.t(r1, r11)
                if (r12 != r0) goto L_0x003d
                return r0
            L_0x003d:
                Bv.g r12 = r11.f33474d
                m0.a r12 = r12.d()
                r1 = 0
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.d(r1)
                r11.f33473c = r3
                java.lang.Object r12 = r12.t(r1, r11)
                if (r12 != r0) goto L_0x0051
                return r0
            L_0x0051:
                Bv.g r12 = r11.f33474d
                m0.a r3 = r12.c()
                r12 = 1058642330(0x3f19999a, float:0.6)
                java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.d(r12)
                m0.o0 r5 = Bv.C6404i.f33492a
                r11.f33473c = r2
                r6 = 0
                r7 = 0
                r9 = 12
                r10 = 0
                r8 = r11
                java.lang.Object r12 = m0.C5530a.f(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L_0x0071
                return r0
            L_0x0071:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: Bv.C6402g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.compose.common.JumpOnClickAnimationState$onRelease$1", f = "JumpOnClickAnimationState.kt", l = {45}, m = "invokeSuspend")
    /* renamed from: Bv.g$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33475c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f33476d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6402g f33477e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f33478f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.membership.impl.compose.common.JumpOnClickAnimationState$onRelease$1$1", f = "JumpOnClickAnimationState.kt", l = {49}, m = "invokeSuspend")
        /* renamed from: Bv.g$c$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f33479c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C6402g f33480d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C6402g gVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f33480d = gVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f33480d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f33479c;
                if (i10 == 0) {
                    y.b(obj);
                    C5530a<Float, C5554m> c10 = this.f33480d.c();
                    Float d10 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                    C5559o0 c11 = C6404i.f33493b;
                    this.f33479c = 1;
                    if (C5530a.f(c10, d10, c11, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
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
        @f(c = "com.ingka.ikea.membership.impl.compose.common.JumpOnClickAnimationState$onRelease$1$2", f = "JumpOnClickAnimationState.kt", l = {54, 58}, m = "invokeSuspend")
        /* renamed from: Bv.g$c$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f33481c;

            /* renamed from: d  reason: collision with root package name */
            int f33482d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f33483e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C6402g f33484f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f33485g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
            @f(c = "com.ingka.ikea.membership.impl.compose.common.JumpOnClickAnimationState$onRelease$1$2$1$1", f = "JumpOnClickAnimationState.kt", l = {65, 66}, m = "invokeSuspend")
            /* renamed from: Bv.g$c$b$a */
            static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f33486c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C6402g f33487d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(C6402g gVar, C17164e<? super a> eVar) {
                    super(2, eVar);
                    this.f33487d = gVar;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new a(this.f33487d, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f33486c;
                    if (i10 == 0) {
                        y.b(obj);
                        C5530a<Float, C5554m> c10 = this.f33487d.c();
                        Float d10 = kotlin.coroutines.jvm.internal.b.d(0.88f);
                        C5559o0 a10 = C6404i.f33492a;
                        this.f33486c = 1;
                        if (C5530a.f(c10, d10, a10, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else if (i10 == 2) {
                        y.b(obj);
                        return C16807N.f139792a;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5530a<Float, C5554m> c11 = this.f33487d.c();
                    Float d11 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                    C5559o0 a11 = C6404i.f33492a;
                    this.f33486c = 2;
                    if (C5530a.f(c11, d11, a11, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
                        return f10;
                    }
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C6402g gVar, C17631a<C16807N> aVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f33484f = gVar;
                this.f33485g = aVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N j(K k10, C17631a aVar, Q q10, C6402g gVar, C5530a aVar2) {
                if (((Number) aVar2.m()).floatValue() >= 0.0f && !k10.f144344a) {
                    k10.f144344a = true;
                    aVar.invoke();
                    F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(gVar, (C17164e<? super a>) null), 3, (Object) null);
                }
                return C16807N.f139792a;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f33484f, this.f33485g, eVar);
                bVar.f33483e = obj;
                return bVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: QJ.Q} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r12.f33482d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x002a
                    if (r1 == r3) goto L_0x0022
                    if (r1 != r2) goto L_0x001a
                    java.lang.Object r0 = r12.f33481c
                    kotlin.jvm.internal.K r0 = (kotlin.jvm.internal.K) r0
                    java.lang.Object r0 = r12.f33483e
                    QJ.Q r0 = (QJ.Q) r0
                    XH.y.b(r13)
                    goto L_0x0082
                L_0x001a:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L_0x0022:
                    java.lang.Object r1 = r12.f33483e
                    QJ.Q r1 = (QJ.Q) r1
                    XH.y.b(r13)
                    goto L_0x0054
                L_0x002a:
                    XH.y.b(r13)
                    java.lang.Object r13 = r12.f33483e
                    r1 = r13
                    QJ.Q r1 = (QJ.Q) r1
                    Bv.g r13 = r12.f33484f
                    m0.a r4 = r13.d()
                    r13 = -1085485875(0xffffffffbf4ccccd, float:-0.8)
                    java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.d(r13)
                    m0.o0 r6 = Bv.C6404i.f33494c
                    r12.f33483e = r1
                    r12.f33482d = r3
                    r7 = 0
                    r8 = 0
                    r10 = 12
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = m0.C5530a.f(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L_0x0054
                    return r0
                L_0x0054:
                    kotlin.jvm.internal.K r13 = new kotlin.jvm.internal.K
                    r13.<init>()
                    Bv.g r3 = r12.f33484f
                    m0.a r4 = r3.d()
                    r3 = 0
                    java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.d(r3)
                    m0.o0 r6 = Bv.C6404i.f33495d
                    nI.a<XH.N> r3 = r12.f33485g
                    Bv.g r7 = r12.f33484f
                    Bv.h r8 = new Bv.h
                    r8.<init>(r13, r3, r1, r7)
                    r12.f33483e = r1
                    r12.f33481c = r13
                    r12.f33482d = r2
                    r7 = 0
                    r10 = 4
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = m0.C5530a.f(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L_0x0082
                    return r0
                L_0x0082:
                    XH.N r13 = XH.C16807N.f139792a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: Bv.C6402g.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6402g gVar, C17631a<C16807N> aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f33477e = gVar;
            this.f33478f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f33477e, this.f33478f, eVar);
            cVar.f33476d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f33475c;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f33476d;
                C5530a<Float, C5554m> c10 = this.f33477e.c();
                Float d10 = kotlin.coroutines.jvm.internal.b.d(0.6f);
                C5559o0 a10 = C6404i.f33492a;
                this.f33476d = q10;
                this.f33475c = 1;
                if (C5530a.f(c10, d10, a10, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                q10 = (Q) this.f33476d;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(this.f33477e, (C17164e<? super a>) null), 3, (Object) null);
            F0 unused2 = C16314k.d(q10, (C17168i) null, (T) null, new b(this.f33477e, this.f33478f, (C17164e<? super b>) null), 3, (Object) null);
            return C16807N.f139792a;
        }
    }

    public C6402g(m mVar, C5584G g10, Q q10) {
        C17542s.j(mVar, "interactionSource");
        C17542s.j(q10, "scope");
        this.f33465a = mVar;
        this.f33466b = g10;
        this.f33467c = q10;
    }

    private final void e(p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        F0 f02 = this.f33468d;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f33468d = C16314k.d(this.f33467c, (C17168i) null, (T) null, pVar, 3, (Object) null);
    }

    public final C5584G a() {
        return this.f33466b;
    }

    public final m b() {
        return this.f33465a;
    }

    public final C5530a<Float, C5554m> c() {
        return this.f33469e;
    }

    public final C5530a<Float, C5554m> d() {
        return this.f33470f;
    }

    public final void f() {
        e(new a(this, (C17164e<? super a>) null));
    }

    public final void g() {
        e(new b(this, (C17164e<? super b>) null));
    }

    public final void h(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "invokeOnCompletion");
        e(new c(this, aVar, (C17164e<? super c>) null));
    }
}
