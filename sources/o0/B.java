package O0;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.q;
import p1.i1;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public static final B f9685a = new B();

    /* renamed from: b  reason: collision with root package name */
    public static q<H0, C4889m, Integer, C16807N> f9686b = c.c(818736383, false, a.f9687c);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LO0/H0;", "it", "LXH/N;", "a", "(LO0/H0;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<H0, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f9687c = new a();

        a() {
            super(3);
        }

        public final void a(H0 h02, C4889m mVar, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar.V(h02) ? 4 : 2);
            } else {
                H0 h03 = h02;
                C4889m mVar2 = mVar;
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(818736383, i11, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:220)");
                }
                M0.d(h02, (d) null, false, (i1) null, 0, 0, 0, 0, 0, mVar, i11 & 14, 510);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((H0) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<H0, C4889m, Integer, C16807N> a() {
        return f9686b;
    }
}
