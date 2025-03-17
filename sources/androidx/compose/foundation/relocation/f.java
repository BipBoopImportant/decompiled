package androidx.compose.foundation.relocation;

import E1.C4488v;
import G1.A;
import G1.B0;
import G1.C4508k;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import o1.C5669i;
import y0.C6247a;
import y0.C6249c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001&B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH@¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\bR\u001a\u0010\u001e\u001a\u00020\u00198\u0016XD¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010$\u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Landroidx/compose/foundation/relocation/f;", "Landroidx/compose/ui/d$c;", "Ly0/a;", "LG1/A;", "LG1/B0;", "Ly0/c;", "responder", "<init>", "(Ly0/c;)V", "LE1/v;", "coordinates", "LXH/N;", "D", "(LE1/v;)V", "childCoordinates", "Lkotlin/Function0;", "Lo1/i;", "boundsProvider", "z0", "(LE1/v;LnI/a;LdI/e;)Ljava/lang/Object;", "n", "Ly0/c;", "E2", "()Ly0/c;", "setResponder", "", "o", "Z", "h2", "()Z", "shouldAutoInvalidate", "p", "hasBeenPlaced", "", "T", "()Ljava/lang/Object;", "traverseKey", "q", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends d.c implements C6247a, A, B0 {

    /* renamed from: q  reason: collision with root package name */
    public static final a f18433q = new a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f18434r = 8;

    /* renamed from: n  reason: collision with root package name */
    private C6249c f18435n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f18436o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f18437p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/relocation/f$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LQJ/F0;", "<anonymous>", "(LQJ/Q;)LQJ/F0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super F0>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f18438c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f18439d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f18440e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4488v f18441f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C5669i> f18442g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C5669i> f18443h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {196}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f18444c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f f18445d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C4488v f18446e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17631a<C5669i> f18447f;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.relocation.f$b$a$a  reason: collision with other inner class name */
            /* synthetic */ class C0270a extends C17540p implements C17631a<C5669i> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f18448a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C4488v f18449b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C17631a<C5669i> f18450c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0270a(f fVar, C4488v vVar, C17631a<C5669i> aVar) {
                    super(0, C17542s.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f18448a = fVar;
                    this.f18449b = vVar;
                    this.f18450c = aVar;
                }

                /* renamed from: t */
                public final C5669i invoke() {
                    return f.D2(this.f18448a, this.f18449b, this.f18450c);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar, C4488v vVar, C17631a<C5669i> aVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f18445d = fVar;
                this.f18446e = vVar;
                this.f18447f = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f18445d, this.f18446e, this.f18447f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f18444c;
                if (i10 == 0) {
                    y.b(obj);
                    C6249c E22 = this.f18445d.E2();
                    C0270a aVar = new C0270a(this.f18445d, this.f18446e, this.f18447f);
                    this.f18444c = 1;
                    if (E22.Y1(aVar, this) == f10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {207}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.relocation.f$b$b  reason: collision with other inner class name */
        static final class C0271b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f18451c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f f18452d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17631a<C5669i> f18453e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0271b(f fVar, C17631a<C5669i> aVar, C17164e<? super C0271b> eVar) {
                super(2, eVar);
                this.f18452d = fVar;
                this.f18453e = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0271b(this.f18452d, this.f18453e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0271b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C6247a c10;
                Object f10 = C17187b.f();
                int i10 = this.f18451c;
                if (i10 == 0) {
                    y.b(obj);
                    if (this.f18452d.j2() && (c10 = b.c(this.f18452d)) != null) {
                        C4488v k10 = C4508k.k(this.f18452d);
                        C17631a<C5669i> aVar = this.f18453e;
                        this.f18451c = 1;
                        if (c10.z0(k10, aVar, this) == f10) {
                            return f10;
                        }
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, C4488v vVar, C17631a<C5669i> aVar, C17631a<C5669i> aVar2, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f18440e = fVar;
            this.f18441f = vVar;
            this.f18442g = aVar;
            this.f18443h = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f18440e, this.f18441f, this.f18442g, this.f18443h, eVar);
            bVar.f18439d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super F0> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f18438c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f18439d;
                F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(this.f18440e, this.f18441f, this.f18442g, (C17164e<? super a>) null), 3, (Object) null);
                return C16314k.d(q10, (C17168i) null, (T) null, new C0271b(this.f18440e, this.f18443h, (C17164e<? super C0271b>) null), 3, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/i;", "b", "()Lo1/i;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<C5669i> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f18454c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4488v f18455d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C5669i> f18456e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C4488v vVar, C17631a<C5669i> aVar) {
            super(0);
            this.f18454c = fVar;
            this.f18455d = vVar;
            this.f18456e = aVar;
        }

        /* renamed from: b */
        public final C5669i invoke() {
            C5669i C22 = f.D2(this.f18454c, this.f18455d, this.f18456e);
            if (C22 != null) {
                return this.f18454c.E2().n0(C22);
            }
            return null;
        }
    }

    public f(C6249c cVar) {
        this.f18435n = cVar;
    }

    /* access modifiers changed from: private */
    public static final C5669i D2(f fVar, C4488v vVar, C17631a<C5669i> aVar) {
        C5669i invoke;
        if (!fVar.j2() || !fVar.f18437p) {
            return null;
        }
        C4488v k10 = C4508k.k(fVar);
        if (!vVar.c()) {
            vVar = null;
        }
        if (vVar == null || (invoke = aVar.invoke()) == null) {
            return null;
        }
        return d.c(k10, vVar, invoke);
    }

    public void D(C4488v vVar) {
        this.f18437p = true;
    }

    public final C6249c E2() {
        return this.f18435n;
    }

    public Object T() {
        return f18433q;
    }

    public boolean h2() {
        return this.f18436o;
    }

    public Object z0(C4488v vVar, C17631a<C5669i> aVar, C17164e<? super C16807N> eVar) {
        Object f10 = S.f(new b(this, vVar, aVar, new c(this, vVar, aVar), (C17164e<? super b>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }
}
