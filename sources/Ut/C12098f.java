package ut;

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

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ut.f  reason: case insensitive filesystem */
public final class C12098f {

    /* renamed from: a  reason: collision with root package name */
    public static final C12098f f104264a = new C12098f();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f104265b = c.c(-1659451937, false, a.f104267a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f104266c = c.c(-182879991, false, b.f104268a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ut.f$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104267a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1659451937, i11, -1, "com.ingka.ikea.instore.impl.composables.ComposableSingletons$DisableStoreModePromptKt.lambda-1.<anonymous> (DisableStoreModePrompt.kt:37)");
                }
                C13607l.j(j.b(st.c.f102760d, mVar, 0), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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
    /* renamed from: ut.f$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104268a = new b();

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
                    C4895p.S(-182879991, i10, -1, "com.ingka.ikea.instore.impl.composables.ComposableSingletons$DisableStoreModePromptKt.lambda-2.<anonymous> (DisableStoreModePrompt.kt:58)");
                }
                mVar.W(1176332890);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = new C12100g();
                    mVar.u(D10);
                }
                C17631a aVar2 = (C17631a) D10;
                mVar.P();
                mVar.W(1176334074);
                Object D11 = mVar.D();
                if (D11 == aVar.a()) {
                    D11 = new C12102h();
                    mVar.u(D11);
                }
                mVar.P();
                C12120v.c(aVar2, (C17631a) D11, mVar, 54);
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
        return f104265b;
    }
}
