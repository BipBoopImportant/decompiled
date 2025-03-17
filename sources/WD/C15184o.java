package wD;

import GD.C12932e;
import GD.C12935h;
import O0.C4725e0;
import O0.G0;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: wD.o  reason: case insensitive filesystem */
public final class C15184o {

    /* renamed from: a  reason: collision with root package name */
    public static final C15184o f131744a = new C15184o();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f131745b = c.c(653345253, false, a.f131747a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f131746c = c.c(-971112811, false, b.f131748a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wD.o$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131747a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(653345253, i10, -1, "com.ingka.ikea.wallet.impl.compose.attach.ComposableSingletons$AttachCardBottomSheetKt.lambda-1.<anonymous> (AttachCardBottomSheet.kt:87)");
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wD.o$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f131748a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C12935h.a aVar) {
            C17542s.j(aVar, "it");
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-971112811, i10, -1, "com.ingka.ikea.wallet.impl.compose.attach.ComposableSingletons$AttachCardBottomSheetKt.lambda-2.<anonymous> (AttachCardBottomSheet.kt:307)");
                }
                C12932e.c cVar = new C12932e.c("12345");
                mVar.W(-947317572);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C15185p();
                    mVar.u(D10);
                }
                mVar.P();
                C15183n.r(cVar, (C17642l) D10, C4725e0.l(true, (C17642l<? super G0, Boolean>) null, mVar, 6, 2), mVar, 54);
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

    public final p<C4889m, Integer, C16807N> a() {
        return f131745b;
    }
}
