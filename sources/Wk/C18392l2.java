package wK;

import O0.C4732i;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import nI.p;
import tK.C18013d;
import tK.C18030v;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.l2  reason: case insensitive filesystem */
public final class C18392l2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C18392l2 f151173a = new C18392l2();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f151174b = c.c(-582339910, false, a.f151175a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.l2$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f151175a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-582339910, i10, -1, "net.ikea.skapa.ui.components.ComposableSingletons$SheetM3Kt.lambda-1.<anonymous> (SheetM3.kt:69)");
                }
                C4732i iVar = C4732i.f10831a;
                W5 w52 = W5.f150318a;
                iVar.a((d) null, w52.b(), w52.a(), C18013d.f147437a.a(), C18030v.f147664a.a(mVar, C18030v.f147665b).J0(), mVar, 197040, 1);
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
        return f151174b;
    }
}
