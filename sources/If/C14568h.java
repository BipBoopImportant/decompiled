package iF;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import s0.C5834E;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: iF.h  reason: case insensitive filesystem */
public final class C14568h {

    /* renamed from: a  reason: collision with root package name */
    public static final C14568h f127679a = new C14568h();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f127680b = c1.c.c(-804445960, false, a.f127684a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f127681c = c1.c.c(1761582525, false, b.f127685a);

    /* renamed from: d  reason: collision with root package name */
    private static q<C5834E, C4889m, Integer, C16807N> f127682d = c1.c.c(-273707932, false, c.f127686a);

    /* renamed from: e  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f127683e = c1.c.c(-940023862, false, d.f127687a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iF.h$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f127684a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-804445960, i10, -1, "com.sugarcube.app.base.ui.compose.ComposableSingletons$HorizontalModalSheetKt.lambda-1.<anonymous> (HorizontalModalSheet.kt:31)");
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
    /* renamed from: iF.h$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f127685a = new b();

        b() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1761582525, i10, -1, "com.sugarcube.app.base.ui.compose.ComposableSingletons$HorizontalModalSheetKt.lambda-2.<anonymous> (HorizontalModalSheet.kt:44)");
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
    /* renamed from: iF.h$c */
    static final class c implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f127686a = new c();

        c() {
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "innerPadding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-273707932, i10, -1, "com.sugarcube.app.base.ui.compose.ComposableSingletons$HorizontalModalSheetKt.lambda-3.<anonymous> (HorizontalModalSheet.kt:53)");
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
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iF.h$d */
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f127687a = new d();

        d() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-940023862, i10, -1, "com.sugarcube.app.base.ui.compose.ComposableSingletons$HorizontalModalSheetKt.lambda-4.<anonymous> (HorizontalModalSheet.kt:65)");
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
        return f127680b;
    }

    public final p<C4889m, Integer, C16807N> b() {
        return f127681c;
    }

    public final q<C5834E, C4889m, Integer, C16807N> c() {
        return f127682d;
    }

    public final p<C4889m, Integer, C16807N> d() {
        return f127683e;
    }
}
