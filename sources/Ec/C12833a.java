package EC;

import J1.j;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.f;
import Y1.k;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;
import sC.C15036a;
import t0.C5938c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: EC.a  reason: case insensitive filesystem */
public final class C12833a {

    /* renamed from: a  reason: collision with root package name */
    public static final C12833a f109339a = new C12833a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f109340b = c.c(-1434475920, false, C2613a.f109341a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EC.a$a  reason: collision with other inner class name */
    static final class C2613a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2613a f109341a = new C2613a();

        C2613a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1434475920, i11, -1, "com.ingka.ikea.timeslot.impl.feature.presentation.ui.compose.ComposableSingletons$TimeslotPickerScreenKt.lambda-1.<anonymous> (TimeslotPickerScreen.kt:209)");
                }
                C13607l.j(j.b(C15036a.f130934c, mVar, 0), C13679b.C2857b.C2858b.f116684a, C5116k1.a(d.f18749a, "TimeslotPickerScreen.Text.Title"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 432, 0, 262136);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5938c, C4889m, Integer, C16807N> a() {
        return f109340b;
    }
}
