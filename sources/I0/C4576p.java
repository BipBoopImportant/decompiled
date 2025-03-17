package I0;

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
/* renamed from: I0.p  reason: case insensitive filesystem */
public final class C4576p {

    /* renamed from: a  reason: collision with root package name */
    public static final C4576p f8283a = new C4576p();

    /* renamed from: b  reason: collision with root package name */
    public static q<C0, C4889m, Integer, C16807N> f8284b = c.c(996639038, false, a.f8285c);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI0/C0;", "it", "LXH/N;", "a", "(LI0/C0;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.p$a */
    static final class a extends C17544u implements q<C0, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f8285c = new a();

        a() {
            super(3);
        }

        public final void a(C0 c02, C4889m mVar, int i10) {
            int i11;
            C0 c03 = c02;
            C4889m mVar2 = mVar;
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? mVar2.V(c02) : mVar2.F(c02) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(996639038, i11, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:156)");
                }
                H0.d(c02, (d) null, false, (i1) null, 0, 0, 0, 0.0f, mVar, i11 & 14, 254);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C0) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C0, C4889m, Integer, C16807N> a() {
        return f8284b;
    }
}
