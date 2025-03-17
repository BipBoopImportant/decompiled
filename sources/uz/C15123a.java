package uz;

import Ez.f;
import IC.C13023e;
import IC.C13026h;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.j;
import Y1.k;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import nI.C17642l;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: uz.a  reason: case insensitive filesystem */
public final class C15123a {

    /* renamed from: a  reason: collision with root package name */
    public static final C15123a f131395a = new C15123a();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f131396b = c.c(1046841833, false, C3255a.f131397a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uz.a$a  reason: collision with other inner class name */
    static final class C3255a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3255a f131397a = new C3255a();

        C3255a() {
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1046841833, i11, -1, "com.ingka.ikea.scanandgo.deeplinkerrorscreens.ComposableSingletons$DeeplinkWrongStoreFragmentKt.lambda-1.<anonymous> (DeeplinkWrongStoreFragment.kt:73)");
                }
                C13607l.j(C13026h.a(f.f109724s0).a(mVar, C13023e.f110931a), C13679b.a.C2855a.f116679a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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
        return f131396b;
    }
}
