package zy;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import sy.e;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: zy.a  reason: case insensitive filesystem */
public final class C15385a {

    /* renamed from: a  reason: collision with root package name */
    public static final C15385a f132761a = new C15385a();

    /* renamed from: b  reason: collision with root package name */
    private static q<e, C4889m, Integer, C16807N> f132762b = c.c(2016776772, false, C3280a.f132763a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zy.a$a  reason: collision with other inner class name */
    static final class C3280a implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3280a f132763a = new C3280a();

        C3280a() {
        }

        public final void a(e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "uniqueSellingPointsSlotModel");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(eVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2016776772, i10, -1, "com.ingka.ikea.room.impl.presentation.composables.uniquesellingpoints.ComposableSingletons$UniqueSellingPointsSlotFactoryKt.lambda-1.<anonymous> (UniqueSellingPointsSlotFactory.kt:22)");
                }
                i.h(eVar.a(), (d) null, mVar, 0, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<e, C4889m, Integer, C16807N> a() {
        return f132762b;
    }
}
