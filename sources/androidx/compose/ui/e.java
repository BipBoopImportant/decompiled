package androidx.compose.ui;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import XH.C16807N;
import androidx.compose.ui.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0006\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/e;", "LG1/B;", "Landroidx/compose/ui/d$c;", "", "zIndex", "<init>", "(F)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "", "toString", "()Ljava/lang/String;", "n", "F", "C2", "()F", "D2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private float f18796n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f18797c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f18798d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var, e eVar) {
            super(1);
            this.f18797c = a0Var;
            this.f18798d = eVar;
        }

        public final void a(a0.a aVar) {
            aVar.h(this.f18797c, 0, 0, this.f18798d.C2());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public e(float f10) {
        this.f18796n = f10;
    }

    public final float C2() {
        return this.f18796n;
    }

    public final void D2(float f10) {
        this.f18796n = f10;
    }

    public J h(K k10, H h10, long j10) {
        a0 i02 = h10.i0(j10);
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(i02, this), 4, (Object) null);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.f18796n + ')';
    }
}
