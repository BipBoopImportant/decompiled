package Zq;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90143a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f90144b = c.c(-324994956, false, C1942a.f90145a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zq.a$a  reason: collision with other inner class name */
    static final class C1942a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1942a f90145a = new C1942a();

        C1942a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-324994956, i10, -1, "com.ingka.ikea.familyrewards.implementation.compose.history.ComposableSingletons$FamilyRewardsHistoryScreenKt.lambda-1.<anonymous> (FamilyRewardsHistoryScreen.kt:129)");
                }
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
        return f90144b;
    }
}
