package C0;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import XH.C16807N;
import c2.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"LC0/b;", "LC0/a;", "LG1/B;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(LnI/a;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "O1", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends a implements B {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f5487c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5488d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f5489e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var, int i10, int i11) {
            super(1);
            this.f5487c = a0Var;
            this.f5488d = i10;
            this.f5489e = i11;
        }

        public final void a(a0.a aVar) {
            a0.a.i(aVar, this.f5487c, -this.f5488d, -this.f5489e, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public b(C17631a<Boolean> aVar) {
        super(aVar);
    }

    public boolean O1() {
        return true;
    }

    public J h(K k10, H h10, long j10) {
        int K02 = k10.K0(androidx.compose.foundation.text.handwriting.a.b());
        int K03 = k10.K0(androidx.compose.foundation.text.handwriting.a.a());
        int i10 = K03 * 2;
        int i11 = K02 * 2;
        a0 i02 = h10.i0(c.o(j10, i10, i11));
        return K.v0(k10, i02.E0() - i10, i02.z0() - i11, (Map) null, new a(i02, K03, K02), 4, (Object) null);
    }
}
