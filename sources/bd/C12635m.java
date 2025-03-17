package BD;

import GD.C12935h;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.v;
import s0.C5857c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: BD.m  reason: case insensitive filesystem */
public final class C12635m {

    /* renamed from: a  reason: collision with root package name */
    public static final C12635m f108022a = new C12635m();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5857c, C4889m, Integer, C16807N> f108023b = c1.c.c(908655285, false, a.f108026a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f108024c = c1.c.c(-213672848, false, b.f108027a);

    /* renamed from: d  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f108025d = c1.c.c(363305464, false, c.f108028a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BD.m$a */
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108026a = new a();

        a() {
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$FlippableCard");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(908655285, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.ComposableSingletons$ErrorCardKt.lambda-1.<anonymous> (ErrorCard.kt:50)");
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BD.m$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f108027a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C12935h hVar) {
            C17542s.j(hVar, "it");
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-213672848, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.ComposableSingletons$ErrorCardKt.lambda-2.<anonymous> (ErrorCard.kt:96)");
                }
                v vVar = v.Vertical;
                mVar.W(-1743011729);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C12636n();
                    mVar.u(D10);
                }
                mVar.P();
                C12619B.c(vVar, (C17642l) D10, D.i(d.f18749a, h.B((float) 32)), mVar, 438, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BD.m$c */
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f108028a = new c();

        c() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C12935h hVar) {
            C17542s.j(hVar, "it");
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(363305464, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.ComposableSingletons$ErrorCardKt.lambda-3.<anonymous> (ErrorCard.kt:109)");
                }
                v vVar = v.Horizontal;
                mVar.W(-235450256);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C12637o();
                    mVar.u(D10);
                }
                mVar.P();
                C12619B.c(vVar, (C17642l) D10, D.i(J.f(d.f18749a, 0.0f, 1, (Object) null), h.B((float) 32)), mVar, 438, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5857c, C4889m, Integer, C16807N> a() {
        return f108023b;
    }
}
