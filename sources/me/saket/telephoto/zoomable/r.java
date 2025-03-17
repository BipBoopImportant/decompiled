package me.saket.telephoto.zoomable;

import G1.C4505h;
import G1.C4508k;
import G1.C4510m;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import c2.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableElement;
import me.saket.telephoto.zoomable.internal.TransformableElement;
import n0.C5589L;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import rK.C17862C;
import rK.C17863D;
import rK.C17864E;
import rK.C17877l;
import rK.C17879n;
import rK.q;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJQ\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010+\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lme/saket/telephoto/zoomable/r;", "LG1/m;", "LG1/h;", "Lme/saket/telephoto/zoomable/j;", "state", "Lme/saket/telephoto/zoomable/c;", "suspendableOnDoubleClick", "", "enabled", "Lkotlin/Function1;", "Lo1/g;", "LXH/N;", "onClick", "onLongClick", "<init>", "(Lme/saket/telephoto/zoomable/j;Lme/saket/telephoto/zoomable/c;ZLnI/l;LnI/l;)V", "onDoubleClick", "L2", "(Lme/saket/telephoto/zoomable/j;ZLnI/l;LnI/l;Lme/saket/telephoto/zoomable/c;)V", "p", "Lme/saket/telephoto/zoomable/j;", "q", "Lme/saket/telephoto/zoomable/c;", "LrK/l;", "r", "LrK/l;", "hapticFeedback", "s", "LnI/l;", "getOnPress", "()LnI/l;", "onPress", "t", "getOnDoubleClick", "Lkotlin/Function0;", "u", "LnI/a;", "getOnQuickZoomStopped", "()LnI/a;", "onQuickZoomStopped", "Lc2/y;", "v", "getOnTransformStopped", "onTransformStopped", "LrK/y;", "w", "LrK/y;", "tappableAndQuickZoomableNode", "LrK/C;", "x", "LrK/C;", "transformableNode", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class r extends C4510m implements C4505h {
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public j f144777p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public c f144778q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C17877l f144779r = C17879n.b(this);

    /* renamed from: s  reason: collision with root package name */
    private final C17642l<C5667g, C16807N> f144780s;

    /* renamed from: t  reason: collision with root package name */
    private final C17642l<C5667g, C16807N> f144781t;

    /* renamed from: u  reason: collision with root package name */
    private final C17631a<C16807N> f144782u;

    /* renamed from: v  reason: collision with root package name */
    private final C17642l<y, C16807N> f144783v;

    /* renamed from: w  reason: collision with root package name */
    private final rK.y f144784w;

    /* renamed from: x  reason: collision with root package name */
    private final C17862C f144785x;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "centroid", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17642l<C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f144786c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
        @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.ZoomableNode$onDoubleClick$1$1", f = "Zoomable.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: me.saket.telephoto.zoomable.r$a$a  reason: collision with other inner class name */
        static final class C3531a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f144787c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ r f144788d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f144789e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3531a(r rVar, long j10, C17164e<? super C3531a> eVar) {
                super(2, eVar);
                this.f144788d = rVar;
                this.f144789e = j10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3531a(this.f144788d, this.f144789e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3531a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f144787c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    c K22 = this.f144788d.f144778q;
                    j J22 = this.f144788d.f144777p;
                    long j10 = this.f144789e;
                    this.f144787c = 1;
                    if (K22.a(J22, j10, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar) {
            super(1);
            this.f144786c = rVar;
        }

        public final void a(long j10) {
            F0 unused = C16314k.d(this.f144786c.c2(), (C17168i) null, (T) null, new C3531a(this.f144786c, j10, (C17164e<? super C3531a>) null), 3, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5667g) obj).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends C17544u implements C17642l<C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f144790c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
        @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.ZoomableNode$onPress$1$1", f = "Zoomable.kt", l = {146}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f144791c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ r f144792d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f144792d = rVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f144792d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f144791c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    C17863D P10 = this.f144792d.f144777p.P();
                    C5589L a10 = q.f146796a.a();
                    this.f144791c = 1;
                    if (C17864E.b(P10, a10, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(1);
            this.f144790c = rVar;
        }

        public final void a(long j10) {
            F0 unused = C16314k.d(this.f144790c.c2(), (C17168i) null, (T) null, new a(this.f144790c, (C17164e<? super a>) null), 3, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5667g) obj).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f144793c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
        @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.ZoomableNode$onQuickZoomStopped$1$1", f = "Zoomable.kt", l = {158}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f144794c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ r f144795d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f144795d = rVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f144795d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f144794c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    this.f144795d.f144779r.a();
                    j J22 = this.f144795d.f144777p;
                    this.f144794c = 1;
                    if (J22.z(this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(0);
            this.f144793c = rVar;
        }

        public final void invoke() {
            if (this.f144793c.f144777p.T()) {
                F0 unused = C16314k.d(this.f144793c.c2(), (C17168i) null, (T) null, new a(this.f144793c, (C17164e<? super a>) null), 3, (Object) null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/y;", "velocity", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends C17544u implements C17642l<y, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f144796c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
        @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.ZoomableNode$onTransformStopped$1$1", f = "Zoomable.kt", l = {167, 169}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f144797c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ r f144798d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f144799e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar, long j10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f144798d = rVar;
                this.f144799e = j10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f144798d, this.f144799e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f144797c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    if (this.f144798d.f144777p.T()) {
                        this.f144798d.f144779r.a();
                        j J22 = this.f144798d.f144777p;
                        this.f144797c = 1;
                        if (J22.z(this) == f10) {
                            return f10;
                        }
                    } else {
                        j J23 = this.f144798d.f144777p;
                        long j10 = this.f144799e;
                        c2.d i11 = C4508k.i(this.f144798d);
                        this.f144797c = 2;
                        if (J23.G(j10, i11, this) == f10) {
                            return f10;
                        }
                    }
                } else if (i10 == 1 || i10 == 2) {
                    XH.y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(r rVar) {
            super(1);
            this.f144796c = rVar;
        }

        public final void a(long j10) {
            if (this.f144796c.f144777p.S()) {
                F0 unused = C16314k.d(this.f144796c.c2(), (C17168i) null, (T) null, new a(this.f144796c, j10, (C17164e<? super a>) null), 3, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((y) obj).o());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17642l<C5667g, Boolean> {
        e(Object obj) {
            super(1, obj, j.class, "canConsumePanChange", "canConsumePanChange-k-4lQ0M$zoomable_release(J)Z", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return t(((C5667g) obj).v());
        }

        public final Boolean t(long j10) {
            return Boolean.valueOf(((j) this.receiver).D(j10));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17642l<C5667g, Boolean> {
        f(Object obj) {
            super(1, obj, j.class, "canConsumePanChange", "canConsumePanChange-k-4lQ0M$zoomable_release(J)Z", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return t(((C5667g) obj).v());
        }

        public final Boolean t(long j10) {
            return Boolean.valueOf(((j) this.receiver).D(j10));
        }
    }

    public r(j jVar, c cVar, boolean z10, C17642l<? super C5667g, C16807N> lVar, C17642l<? super C5667g, C16807N> lVar2) {
        c cVar2 = cVar;
        C17542s.j(jVar, "state");
        C17542s.j(cVar2, "suspendableOnDoubleClick");
        this.f144777p = jVar;
        this.f144778q = cVar2;
        b bVar = new b(this);
        this.f144780s = bVar;
        a aVar = new a(this);
        this.f144781t = aVar;
        c cVar3 = new c(this);
        this.f144782u = cVar3;
        d dVar = new d(this);
        this.f144783v = dVar;
        rK.y c10 = new TappableAndQuickZoomableElement(bVar, lVar, lVar2, aVar, cVar3, this.f144777p.P(), z10).a();
        this.f144784w = c10;
        C17862C c11 = new TransformableElement(this.f144777p.P(), new e(this.f144777p), false, z10, dVar).a();
        this.f144785x = c11;
        C2(c10);
        C2(c11);
    }

    public final void L2(j jVar, boolean z10, C17642l<? super C5667g, C16807N> lVar, C17642l<? super C5667g, C16807N> lVar2, c cVar) {
        j jVar2 = jVar;
        c cVar2 = cVar;
        C17542s.j(jVar2, "state");
        C17542s.j(cVar2, "onDoubleClick");
        if (!C17542s.e(this.f144777p, jVar2)) {
            this.f144777p = jVar2;
        }
        this.f144778q = cVar2;
        this.f144785x.Q2(jVar.P(), new f(jVar2), false, z10, this.f144783v);
        this.f144784w.Q2(this.f144780s, lVar, lVar2, this.f144781t, this.f144782u, jVar.P(), z10);
    }
}
