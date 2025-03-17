package BD;

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
import c1.c;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tD.C15064a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: BD.j  reason: case insensitive filesystem */
public final class C12632j {

    /* renamed from: a  reason: collision with root package name */
    public static final C12632j f108017a = new C12632j();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f108018b = c.c(-2091416736, false, a.f108020a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f108019c = c.c(-1969897215, false, b.f108021a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BD.j$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108020a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2091416736, i11, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.ComposableSingletons$ConfirmDetachPromptKt.lambda-1.<anonymous> (ConfirmDetachPrompt.kt:39)");
                }
                C13607l.j(j.b(C15064a.f131086f, mVar, 0), C13679b.a.C2855a.f116679a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BD.j$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f108021a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N e() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f() {
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1969897215, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.ComposableSingletons$ConfirmDetachPromptKt.lambda-2.<anonymous> (ConfirmDetachPrompt.kt:51)");
                }
                mVar.W(-237016784);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = new C12633k();
                    mVar.u(D10);
                }
                C17631a aVar2 = (C17631a) D10;
                mVar.P();
                mVar.W(-237015792);
                Object D11 = mVar.D();
                if (D11 == aVar.a()) {
                    D11 = new C12634l();
                    mVar.u(D11);
                }
                mVar.P();
                C12645x.b(aVar2, (C17631a) D11, (d) null, mVar, 54, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final p<C4889m, Integer, C16807N> a() {
        return f108018b;
    }
}
