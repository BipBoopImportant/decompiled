package B0;

import N1.Y;
import N1.Z;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import c2.h;
import c2.r;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "LN1/Y;", "textStyle", "", "minLines", "maxLines", "a", "(Landroidx/compose/ui/d;LN1/Y;II)Landroidx/compose/ui/d;", "LXH/N;", "b", "(II)V", "", "typeface", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: B0.o  reason: case insensitive filesystem */
public final class C4371o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.o$a */
    public static final class a extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5105c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5106d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y f5107e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, Y y10) {
            super(1);
            this.f5105c = i10;
            this.f5106d = i11;
            this.f5107e = y10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("heightInLines");
            v0Var.a().c("minLines", Integer.valueOf(this.f5105c));
            v0Var.a().c("maxLines", Integer.valueOf(this.f5106d));
            v0Var.a().c("textStyle", this.f5107e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.o$b */
    static final class b extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5108c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5109d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y f5110e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, Y y10) {
            super(3);
            this.f5108c = i10;
            this.f5109d = i11;
            this.f5110e = y10;
        }

        private static final Object b(A1<? extends Object> a12) {
            return a12.getValue();
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            mVar.W(408240218);
            if (C4895p.J()) {
                C4895p.S(408240218, i10, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            C4371o.b(this.f5108c, this.f5109d);
            if (this.f5108c == 1 && this.f5109d == Integer.MAX_VALUE) {
                d.a aVar = d.f18749a;
                if (C4895p.J()) {
                    C4895p.R();
                }
                mVar.P();
                return aVar;
            }
            c2.d dVar2 = (c2.d) mVar.Q(C5100f0.e());
            C4820m.b bVar = (C4820m.b) mVar.Q(C5100f0.g());
            t tVar = (t) mVar.Q(C5100f0.k());
            boolean V10 = mVar.V(this.f5110e) | mVar.V(tVar);
            Y y10 = this.f5110e;
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = Z.d(y10, tVar);
                mVar.u(D10);
            }
            Y y11 = (Y) D10;
            boolean V11 = mVar.V(bVar) | mVar.V(y11);
            Object D11 = mVar.D();
            if (V11 || D11 == C4889m.f14007a.a()) {
                C4820m j10 = y11.j();
                C o10 = y11.o();
                if (o10 == null) {
                    o10 = C.f13316b.d();
                }
                C4830x m10 = y11.m();
                int i11 = m10 != null ? m10.i() : C4830x.f13449b.b();
                C4831y n10 = y11.n();
                D11 = bVar.a(j10, o10, i11, n10 != null ? n10.m() : C4831y.f13453b.a());
                mVar.u(D11);
            }
            A1 a12 = (A1) D11;
            boolean V12 = mVar.V(b(a12)) | mVar.V(dVar2) | mVar.V(bVar) | mVar.V(this.f5110e) | mVar.V(tVar);
            Object D12 = mVar.D();
            if (V12 || D12 == C4889m.f14007a.a()) {
                D12 = Integer.valueOf(r.g(Q.a(y11, dVar2, bVar, Q.c(), 1)));
                mVar.u(D12);
            }
            int intValue = ((Number) D12).intValue();
            boolean V13 = mVar.V(tVar) | mVar.V(dVar2) | mVar.V(bVar) | mVar.V(this.f5110e) | mVar.V(b(a12));
            Object D13 = mVar.D();
            if (V13 || D13 == C4889m.f14007a.a()) {
                D13 = Integer.valueOf(r.g(Q.a(y11, dVar2, bVar, Q.c() + 10 + Q.c(), 2)));
                mVar.u(D13);
            }
            int intValue2 = ((Number) D13).intValue() - intValue;
            int i12 = this.f5108c;
            Integer num = null;
            Integer valueOf = i12 == 1 ? null : Integer.valueOf(((i12 - 1) * intValue2) + intValue);
            int i13 = this.f5109d;
            if (i13 != Integer.MAX_VALUE) {
                num = Integer.valueOf(intValue + (intValue2 * (i13 - 1)));
            }
            d j11 = J.j(d.f18749a, valueOf != null ? dVar2.H(valueOf.intValue()) : h.f23031b.c(), num != null ? dVar2.H(num.intValue()) : h.f23031b.c());
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return j11;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final d a(d dVar, Y y10, int i10, int i11) {
        return c.b(dVar, C5133t0.b() ? new a(i10, i11, y10) : C5133t0.a(), new b(i10, i11, y10));
    }

    public static final void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero").toString());
        } else if (i10 > i11) {
            throw new IllegalArgumentException(("minLines " + i10 + " must be less than or equal to maxLines " + i11).toString());
        }
    }
}
