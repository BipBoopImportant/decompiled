package MG;

import J1.j;
import N1.E;
import N1.P;
import N1.Y;
import O0.V;
import O0.d1;
import OE.n;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4889m;
import U0.C4895p;
import U1.e;
import XH.C16807N;
import Y1.a;
import Y1.h;
import Y1.k;
import Y1.o;
import Y1.s;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.g1;
import r1.g;
import s0.C5842M;
import tK.C18030v;
import uK.C18148c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: MG.a  reason: case insensitive filesystem */
public final class C16032a {

    /* renamed from: a  reason: collision with root package name */
    public static final C16032a f136222a = new C16032a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5842M, C4889m, Integer, C16807N> f136223b = c.c(962947990, false, C3348a.f136225a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f136224c = c.c(-1351237043, false, b.f136226a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MG.a$a  reason: collision with other inner class name */
    static final class C3348a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3348a f136225a = new C3348a();

        C3348a() {
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(m10, "$this$TextButton");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(962947990, i11, -1, "com.sugarcube.decorate.v2.internal.ui.status.ComposableSingletons$StatusDialogKt.lambda-1.<anonymous> (StatusDialog.kt:123)");
                }
                String b10 = j.b(n.f113373h0, mVar2, 0);
                C18030v vVar = C18030v.f147664a;
                int i12 = C18030v.f147665b;
                d1.b(b10, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, Y.c(vVar.b(mVar2, i12).a().c(), vVar.a(mVar2, i12).u0(), 0, C.f13316b.a(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (Y1.q) null, (E) null, (h) null, 0, 0, (s) null, 16777210, (Object) null), mVar, 0, 0, 65534);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MG.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f136226a = new b();

        b() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1351237043, i10, -1, "com.sugarcube.decorate.v2.internal.ui.status.ComposableSingletons$StatusDialogKt.lambda-2.<anonymous> (StatusDialog.kt:138)");
                }
                V.a(J1.e.c(C18148c.Cross.m(), mVar, 0), j.b(n.f113176B2, mVar, 0), (d) null, C18030v.f147664a.a(mVar, C18030v.f147665b).F0(), mVar, 0, 4);
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

    public final q<C5842M, C4889m, Integer, C16807N> a() {
        return f136223b;
    }

    public final p<C4889m, Integer, C16807N> b() {
        return f136224c;
    }
}
