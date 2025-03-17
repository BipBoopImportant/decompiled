package O0;

import J0.a;
import Q0.t;
import Q0.u;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.p;
import u1.C6006d;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public static final C f9694a = new C();

    /* renamed from: b  reason: collision with root package name */
    public static p<C4889m, Integer, C16807N> f9695b = c.c(-505750804, false, a.f9696c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f9696c = new a();

        a() {
            super(2);
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-505750804, i10, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda-1.<anonymous> (Snackbar.kt:231)");
                }
                C6006d a10 = L0.a.a(a.b.f8797a);
                t.a aVar = t.f12046a;
                V.b(a10, u.a(t.a(C4749q0.f11449g), mVar, 0), (d) null, 0, mVar, 0, 12);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final p<C4889m, Integer, C16807N> a() {
        return f9695b;
    }
}
