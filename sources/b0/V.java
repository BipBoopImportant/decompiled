package B0;

import H0.Q;
import H0.U;
import T1.H;
import T1.P;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.view.KeyEvent;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;
import uI.C18059h;
import y1.C6254b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/d;", "LB0/B;", "state", "LH0/Q;", "manager", "LT1/P;", "value", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "", "editable", "singleLine", "LT1/H;", "offsetMapping", "LB0/o0;", "undoManager", "LT1/r;", "imeAction", "a", "(Landroidx/compose/ui/d;LB0/B;LH0/Q;LT1/P;LnI/l;ZZLT1/H;LB0/o0;I)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class V {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f4629c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Q f4630d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ P f4631e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f4632f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f4633g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ H f4634h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ o0 f4635i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<P, C16807N> f4636j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f4637k;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: B0.V$a$a  reason: collision with other inner class name */
        /* synthetic */ class C0007a extends C17540p implements C17642l<C6254b, Boolean> {
            C0007a(Object obj) {
                super(1, obj, U.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return t(((C6254b) obj).f());
            }

            public final Boolean t(KeyEvent keyEvent) {
                return Boolean.valueOf(((U) this.receiver).l(keyEvent));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(B b10, Q q10, P p10, boolean z10, boolean z11, H h10, o0 o0Var, C17642l<? super P, C16807N> lVar, int i10) {
            super(3);
            this.f4629c = b10;
            this.f4630d = q10;
            this.f4631e = p10;
            this.f4632f = z10;
            this.f4633g = z11;
            this.f4634h = h10;
            this.f4635i = o0Var;
            this.f4636j = lVar;
            this.f4637k = i10;
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            mVar2.W(851809892);
            if (C4895p.J()) {
                C4895p.S(851809892, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
            }
            Object D10 = mVar.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = new U();
                mVar2.u(D10);
            }
            U u10 = (U) D10;
            Object D11 = mVar.D();
            if (D11 == aVar.a()) {
                D11 = new C4367k();
                mVar2.u(D11);
            }
            U u11 = new U(this.f4629c, this.f4630d, this.f4631e, this.f4632f, this.f4633g, u10, this.f4634h, this.f4635i, (C4367k) D11, (C4376u) null, this.f4636j, this.f4637k, 512, (DefaultConstructorMarker) null);
            d.a aVar2 = d.f18749a;
            boolean F10 = mVar2.F(u11);
            Object D12 = mVar.D();
            if (F10 || D12 == aVar.a()) {
                D12 = new C0007a(u11);
                mVar2.u(D12);
            }
            d a10 = androidx.compose.ui.input.key.a.a(aVar2, (C17642l) ((C18059h) D12));
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return a10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final d a(d dVar, B b10, Q q10, P p10, C17642l<? super P, C16807N> lVar, boolean z10, boolean z11, H h10, o0 o0Var, int i10) {
        d dVar2 = dVar;
        return c.c(dVar, (C17642l) null, new a(b10, q10, p10, z10, z11, h10, o0Var, lVar, i10), 1, (Object) null);
    }
}
