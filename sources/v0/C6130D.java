package v0;

import E1.Y;
import E1.Z;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "key", "", "index", "Lv0/E;", "pinnedItemList", "Lkotlin/Function0;", "LXH/N;", "content", "a", "(Ljava/lang/Object;ILv0/E;LnI/p;LU0/m;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.D  reason: case insensitive filesystem */
public final class C6130D {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v0.D$a */
    static final class a extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6129C f30796c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"v0/D$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v0.D$a$a  reason: collision with other inner class name */
        public static final class C0473a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6129C f30797a;

            public C0473a(C6129C c10) {
                this.f30797a = c10;
            }

            public void b() {
                this.f30797a.f();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6129C c10) {
            super(1);
            this.f30796c = c10;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new C0473a(this.f30796c);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.D$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f30798c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f30799d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6131E f30800e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f30801f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f30802g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object obj, int i10, C6131E e10, p<? super C4889m, ? super Integer, C16807N> pVar, int i11) {
            super(2);
            this.f30798c = obj;
            this.f30799d = i10;
            this.f30800e = e10;
            this.f30801f = pVar;
            this.f30802g = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C6130D.a(this.f30798c, this.f30799d, this.f30800e, this.f30801f, mVar, M0.a(this.f30802g | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(Object obj, int i10, C6131E e10, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i11) {
        int i12;
        C4889m k10 = mVar.k(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (k10.F(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= k10.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= k10.F(e10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= k10.F(pVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2079116560, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean V10 = k10.V(obj) | k10.V(e10);
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new C6129C(obj, e10);
                k10.u(D10);
            }
            C6129C c10 = (C6129C) D10;
            c10.g(i10);
            c10.i((Y) k10.Q(Z.a()));
            boolean V11 = k10.V(c10);
            Object D11 = k10.D();
            if (V11 || D11 == C4889m.f14007a.a()) {
                D11 = new a(c10);
                k10.u(D11);
            }
            P.c(c10, (C17642l) D11, k10, 0);
            C4910x.a(Z.a().d(c10), pVar, k10, ((i12 >> 6) & 112) | J0.f13770i);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(obj, i10, e10, pVar, i11));
        }
    }
}
