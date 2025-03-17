package nK;

import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.L;
import U0.M;
import U0.P;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.y;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5135u0;
import c2.r;
import c2.s;
import dI.C17164e;
import eI.C17187b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import me.saket.telephoto.zoomable.m;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5673m;
import oK.C17711d;
import oK.C17715h;
import oK.C17716i;
import oK.C17720m;
import pK.C17765j;
import pK.C17769n;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\nX\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u0002²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00108\n@\nX\u0002"}, d2 = {"LnK/j;", "imageSource", "LpK/n;", "zoomableState", "LnK/d;", "imageOptions", "LnK/h;", "errorReporter", "LnK/k;", "i", "(LnK/j;LpK/n;LnK/d;LnK/h;LU0/m;II)LnK/k;", "Lkotlin/Function0;", "LpK/j;", "transformation", "h", "(LnK/j;LnI/a;LnK/d;LnK/h;LU0/m;II)LnK/k;", "LoK/h;", "d", "(LnK/j;LnK/d;LnK/h;LU0/m;I)LoK/h;", "decoder", "sub-sampling-image_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.l  reason: case insensitive filesystem */
public final class C17681l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.SubSamplingImageStateKt$createImageRegionDecoder$1", f = "SubSamplingImageState.kt", l = {115, 116}, m = "invokeSuspend")
    /* renamed from: nK.l$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f144948c;

        /* renamed from: d  reason: collision with root package name */
        int f144949d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f144950e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17679j f144951f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17715h.a f144952g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17673d f144953h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4899r0<C17715h> f144954i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ A1<C17677h> f144955j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, C17679j jVar, C17715h.a aVar, C17673d dVar, C4899r0<C17715h> r0Var, A1<? extends C17677h> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f144950e = context;
            this.f144951f = jVar;
            this.f144952g = aVar;
            this.f144953h = dVar;
            this.f144954i = r0Var;
            this.f144955j = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f144950e, this.f144951f, this.f144952g, this.f144953h, this.f144954i, this.f144955j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C4899r0<C17715h> r0Var;
            Object f10 = C17187b.f();
            int i10 = this.f144949d;
            if (i10 == 0) {
                y.b(obj);
                C17711d.a aVar = C17711d.f145327b;
                Context context = this.f144950e;
                C17679j jVar = this.f144951f;
                this.f144949d = 1;
                obj = aVar.a(context, jVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                r0Var = (C4899r0) this.f144948c;
                try {
                    y.b(obj);
                    C17681l.g(r0Var, (C17715h) obj);
                } catch (IOException e10) {
                    C17681l.e(this.f144955j).a(e10, this.f144951f);
                }
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4899r0<C17715h> r0Var2 = this.f144954i;
            C17715h.a a10 = C17720m.f145390c.a(this.f144952g);
            C17715h.b bVar = new C17715h.b(this.f144950e, this.f144951f, this.f144953h, (C17711d) obj);
            this.f144948c = r0Var2;
            this.f144949d = 2;
            obj = a10.a(bVar, this);
            if (obj == f10) {
                return f10;
            }
            r0Var = r0Var2;
            C17681l.g(r0Var, (C17715h) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nK.l$b */
    static final class b extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<C17715h> f144956c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nK/l$b$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: nK.l$b$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4899r0 f144957a;

            public a(C4899r0 r0Var) {
                this.f144957a = r0Var;
            }

            public void b() {
                C17715h b10 = C17681l.f(this.f144957a);
                if (b10 != null) {
                    b10.close();
                }
                C17681l.g(this.f144957a, (C17715h) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4899r0<C17715h> r0Var) {
            super(1);
            this.f144956c = r0Var;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            C17542s.j(m10, "$this$DisposableEffect");
            return new a(this.f144956c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nK.l$c */
    static final class c extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17769n f144958c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nK/l$c$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: nK.l$c$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17769n f144959a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f144960b;

            public a(C17769n nVar, boolean z10) {
                this.f144959a = nVar;
                this.f144960b = z10;
            }

            public void b() {
                this.f144959a.c(this.f144960b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17769n nVar) {
            super(1);
            this.f144958c = nVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            C17542s.j(m10, "$this$DisposableEffect");
            boolean m11 = this.f144958c.m();
            this.f144958c.c(false);
            return new a(this.f144958c, m11);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nK.l$d */
    static final class d extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17679j f144961c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nK/l$d$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: nK.l$d$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17679j f144962a;

            public a(C17679j jVar) {
                this.f144962a = jVar;
            }

            public void b() {
                this.f144962a.close();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17679j jVar) {
            super(1);
            this.f144961c = jVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            C17542s.j(m10, "$this$DisposableEffect");
            return new a(this.f144961c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpK/j;", "b", "()LpK/j;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nK.l$e */
    static final class e extends C17544u implements C17631a<C17765j> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17769n f144963c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17769n nVar) {
            super(0);
            this.f144963c = nVar;
        }

        /* renamed from: b */
        public final C17765j invoke() {
            return this.f144963c.f();
        }
    }

    private static final C17715h d(C17679j jVar, C17673d dVar, C17677h hVar, C4889m mVar, int i10) {
        mVar.C(-957687349);
        if (C4895p.J()) {
            C4895p.S(-957687349, i10, -1, "me.saket.telephoto.subsamplingimage.createImageRegionDecoder (SubSamplingImageState.kt:105)");
        }
        Context context = (Context) mVar.Q(AndroidCompositionLocals_androidKt.g());
        A1 q10 = p1.q(hVar, mVar, (i10 >> 6) & 14);
        mVar.C(-703447536);
        int i11 = i10 & 14;
        boolean z10 = ((i11 ^ 6) > 4 && mVar.V(jVar)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = u1.e((Object) null, (o1) null, 2, (Object) null);
            mVar.u(D10);
        }
        C4899r0 r0Var = (C4899r0) D10;
        mVar.U();
        if (!((Boolean) mVar.Q(C5135u0.a())).booleanValue()) {
            P.g(jVar, new a(context, jVar, (C17715h.a) mVar.Q(C17716i.a()), dVar, r0Var, q10, (C17164e<? super a>) null), mVar, i11 | 64);
            mVar.C(-703425474);
            boolean V10 = mVar.V(r0Var);
            Object D11 = mVar.D();
            if (V10 || D11 == C4889m.f14007a.a()) {
                D11 = new b(r0Var);
                mVar.u(D11);
            }
            mVar.U();
            P.c(jVar, (C17642l) D11, mVar, i11);
        }
        C17715h f10 = f(r0Var);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return f10;
    }

    /* access modifiers changed from: private */
    public static final C17677h e(A1<? extends C17677h> a12) {
        return (C17677h) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C17715h f(C4899r0<C17715h> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void g(C4899r0<C17715h> r0Var, C17715h hVar) {
        r0Var.setValue(hVar);
    }

    public static final C17680k h(C17679j jVar, C17631a<? extends C17765j> aVar, C17673d dVar, C17677h hVar, C4889m mVar, int i10, int i11) {
        C17542s.j(jVar, "imageSource");
        C17542s.j(aVar, "transformation");
        mVar.C(-928375270);
        if ((i11 & 4) != 0) {
            dVar = C17673d.f144890d.a();
        }
        if ((i11 & 8) != 0) {
            hVar = C17677h.f144928a.a();
        }
        if (C4895p.J()) {
            C4895p.S(-928375270, i10, -1, "me.saket.telephoto.subsamplingimage.rememberSubSamplingImageState (SubSamplingImageState.kt:83)");
        }
        int i12 = i10 >> 3;
        A1<T> q10 = p1.q(aVar, mVar, i12 & 14);
        mVar.C(-1410909987);
        mVar.C(-1410912790);
        int i13 = i10 & 14;
        boolean z10 = ((i13 ^ 6) > 4 && mVar.V(jVar)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = new C17675f(jVar, j(q10));
            mVar.u(D10);
        }
        C17675f fVar = (C17675f) D10;
        mVar.U();
        fVar.t(d(jVar, dVar, hVar, mVar, (i12 & 112) | i13 | (i12 & 896)));
        mVar.U();
        fVar.d(mVar, 0);
        P.c(jVar, new d(jVar), mVar, i13);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return fVar;
    }

    public static final C17680k i(C17679j jVar, C17769n nVar, C17673d dVar, C17677h hVar, C4889m mVar, int i10, int i11) {
        C17542s.j(jVar, "imageSource");
        C17542s.j(nVar, "zoomableState");
        mVar.C(-1739799410);
        if ((i11 & 4) != 0) {
            dVar = C17673d.f144890d.a();
        }
        C17673d dVar2 = dVar;
        if ((i11 & 8) != 0) {
            hVar = C17677h.f144928a.a();
        }
        C17677h hVar2 = hVar;
        if (C4895p.J()) {
            C4895p.S(-1739799410, i10, -1, "me.saket.telephoto.subsamplingimage.rememberSubSamplingImageState (SubSamplingImageState.kt:54)");
        }
        mVar.C(-1410943781);
        int i12 = (i10 & 112) ^ 48;
        boolean z10 = false;
        boolean z11 = (i12 > 32 && mVar.V(nVar)) || (i10 & 48) == 32;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            D10 = new e(nVar);
            mVar.u(D10);
        }
        mVar.U();
        C17680k h10 = h(jVar, (C17631a) D10, dVar2, hVar2, mVar, i10 & 8078, 0);
        mVar.C(-1410936802);
        if ((i12 > 32 && mVar.V(nVar)) || (i10 & 48) == 32) {
            z10 = true;
        }
        Object D11 = mVar.D();
        if (z10 || D11 == C4889m.f14007a.a()) {
            D11 = new c(nVar);
            mVar.u(D11);
        }
        mVar.U();
        P.c(nVar, (C17642l) D11, mVar, (i10 >> 3) & 14);
        m.a aVar = m.f144727a;
        r b10 = h10.b();
        nVar.n(aVar.b(b10 != null ? C5673m.c(s.d(b10.k())) : null));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return h10;
    }

    private static final C17631a<C17765j> j(A1<? extends C17631a<? extends C17765j>> a12) {
        return (C17631a) a12.getValue();
    }
}
