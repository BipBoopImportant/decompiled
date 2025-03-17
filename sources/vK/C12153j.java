package vk;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: vk.j  reason: case insensitive filesystem */
public final class C12153j {

    /* renamed from: a  reason: collision with root package name */
    public static final C12153j f104815a = new C12153j();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f104816b = c.c(1510345914, false, a.f104818a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f104817c = c.c(172028309, false, b.f104819a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.j$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104818a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1510345914, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ComposableSingletons$RenameListContentKt.lambda-1.<anonymous> (RenameListContent.kt:44)");
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
    /* renamed from: vk.j$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104819a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N e(String str) {
            C17542s.j(str, "it");
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f() {
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(172028309, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ComposableSingletons$RenameListContentKt.lambda-2.<anonymous> (RenameListContent.kt:72)");
                }
                mVar.W(-157480806);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = new C12155k();
                    mVar.u(D10);
                }
                C17642l lVar = (C17642l) D10;
                mVar.P();
                mVar.W(-157479846);
                Object D11 = mVar.D();
                if (D11 == aVar.a()) {
                    D11 = new C12157l();
                    mVar.u(D11);
                }
                mVar.P();
                e1.f("Kitchen shopping list", lVar, (C17631a) D11, (d) null, mVar, 438, 8);
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
        return f104816b;
    }
}
