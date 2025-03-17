package I0;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import G1.C4505h;
import G1.C4506i;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import pI.C17752b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"LI0/i0;", "Landroidx/compose/ui/d$c;", "LG1/h;", "LG1/B;", "<init>", "()V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.i0  reason: case insensitive filesystem */
public final class C4563i0 extends d.c implements C4505h, B {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.i0$a */
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8123c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a0 f8124d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f8125e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, a0 a0Var, int i11) {
            super(1);
            this.f8123c = i10;
            this.f8124d = a0Var;
            this.f8125e = i11;
        }

        public final void a(a0.a aVar) {
            a0.a aVar2 = aVar;
            a0.a.i(aVar2, this.f8124d, C17752b.e(((float) (this.f8123c - this.f8124d.E0())) / 2.0f), C17752b.e(((float) (this.f8125e - this.f8124d.z0())) / 2.0f), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public J h(K k10, H h10, long j10) {
        boolean z10 = j2() && ((Boolean) C4506i.a(this, C4547a0.b())).booleanValue();
        long a10 = C4547a0.f7851c;
        a0 i02 = h10.i0(j10);
        int max = z10 ? Math.max(i02.E0(), k10.K0(k.h(a10))) : i02.E0();
        int max2 = z10 ? Math.max(i02.z0(), k10.K0(k.g(a10))) : i02.z0();
        return K.v0(k10, max, max2, (Map) null, new a(max, i02, max2), 4, (Object) null);
    }
}
