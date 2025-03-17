package p1;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import G1.C4498c0;
import G1.C4502e0;
import G1.C4508k;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\bR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lp1/k0;", "LG1/B;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "LXH/N;", "layerBlock", "<init>", "(LnI/l;)V", "D2", "()V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "", "toString", "()Ljava/lang/String;", "n", "LnI/l;", "C2", "()LnI/l;", "E2", "", "h2", "()Z", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.k0  reason: case insensitive filesystem */
public final class C5726k0 extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C17642l<? super c, C16807N> f27317n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: p1.k0$a */
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f27318c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5726k0 f27319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var, C5726k0 k0Var) {
            super(1);
            this.f27318c = a0Var;
            this.f27319d = k0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.w(aVar, this.f27318c, 0, 0, 0.0f, this.f27319d.C2(), 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public C5726k0(C17642l<? super c, C16807N> lVar) {
        this.f27317n = lVar;
    }

    public final C17642l<c, C16807N> C2() {
        return this.f27317n;
    }

    public final void D2() {
        C4498c0 J22 = C4508k.h(this, C4502e0.a(2)).J2();
        if (J22 != null) {
            J22.y3(this.f27317n, true);
        }
    }

    public final void E2(C17642l<? super c, C16807N> lVar) {
        this.f27317n = lVar;
    }

    public J h(K k10, H h10, long j10) {
        a0 i02 = h10.i0(j10);
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(i02, this), 4, (Object) null);
    }

    public boolean h2() {
        return false;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f27317n + ')';
    }
}
