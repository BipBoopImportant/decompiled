package N0;

import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.P;
import U0.p1;
import XH.C16807N;
import XH.C16814e;
import XH.y;
import c2.h;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5584G;
import n0.C5585H;
import nI.p;
import p1.C5747v0;
import r0.j;
import r0.k;
import r0.o;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H'ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"LN0/f;", "Ln0/G;", "", "bounded", "Lc2/h;", "radius", "LU0/A1;", "Lp1/v0;", "color", "<init>", "(ZFLU0/A1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr0/k;", "interactionSource", "Ln0/H;", "b", "(Lr0/k;LU0/m;I)Ln0/H;", "LN0/g;", "rippleAlpha", "LN0/l;", "c", "(Lr0/k;ZFLU0/A1;LU0/A1;LU0/m;I)LN0/l;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "F", "LU0/A1;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public abstract class f implements C5584G {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9185a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9186b;

    /* renamed from: c  reason: collision with root package name */
    private final A1<C5747v0> f9187c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", l = {219}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f9188c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f9189d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f9190e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l f9191f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/j;", "interaction", "LXH/N;", "c", "(Lr0/j;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: N0.f$a$a  reason: collision with other inner class name */
        static final class C0133a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f9192a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f9193b;

            C0133a(l lVar, Q q10) {
                this.f9192a = lVar;
                this.f9193b = q10;
            }

            /* renamed from: c */
            public final Object emit(j jVar, C17164e<? super C16807N> eVar) {
                if (jVar instanceof o.b) {
                    this.f9192a.b((o.b) jVar, this.f9193b);
                } else if (jVar instanceof o.c) {
                    this.f9192a.d(((o.c) jVar).a());
                } else if (jVar instanceof o.a) {
                    this.f9192a.d(((o.a) jVar).a());
                } else {
                    this.f9192a.e(jVar, this.f9193b);
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, l lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f9190e = kVar;
            this.f9191f = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f9190e, this.f9191f, eVar);
            aVar.f9189d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f9188c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<j> c10 = this.f9190e.c();
                C0133a aVar = new C0133a(this.f9191f, (Q) this.f9189d);
                this.f9188c = 1;
                if (c10.collect(aVar, this) == f10) {
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

    public /* synthetic */ f(boolean z10, float f10, A1 a12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, a12);
    }

    @C16814e
    public final C5585H b(k kVar, C4889m mVar, int i10) {
        long j10;
        mVar.W(988743187);
        if (C4895p.J()) {
            C4895p.S(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        o oVar = (o) mVar.Q(p.d());
        boolean z10 = false;
        if (this.f9187c.getValue().y() != 16) {
            mVar.W(-303571590);
            mVar.P();
            j10 = this.f9187c.getValue().y();
        } else {
            mVar.W(-303521246);
            j10 = oVar.b(mVar, 0);
            mVar.P();
        }
        A1 q10 = p1.q(C5747v0.k(j10), mVar, 0);
        A1 q11 = p1.q(oVar.a(mVar, 0), mVar, 0);
        int i11 = i10 & 14;
        l c10 = c(kVar, this.f9185a, this.f9186b, q10, q11, mVar, i11 | ((i10 << 12) & ImageMetadata.JPEG_GPS_COORDINATES));
        if (((i11 ^ 6) > 4 && mVar.V(kVar)) || (i10 & 6) == 4) {
            z10 = true;
        }
        boolean F10 = mVar.F(c10) | z10;
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(kVar, c10, (C17164e<? super a>) null);
            mVar.u(D10);
        }
        P.f(c10, kVar, (p) D10, mVar, (i10 << 3) & 112);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return c10;
    }

    public abstract l c(k kVar, boolean z10, float f10, A1<C5747v0> a12, A1<g> a13, C4889m mVar, int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9185a == fVar.f9185a && h.D(this.f9186b, fVar.f9186b) && C17542s.e(this.f9187c, fVar.f9187c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f9185a) * 31) + h.E(this.f9186b)) * 31) + this.f9187c.hashCode();
    }

    private f(boolean z10, float f10, A1<C5747v0> a12) {
        this.f9185a = z10;
        this.f9186b = f10;
        this.f9187c = a12;
    }
}
