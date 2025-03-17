package xF;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kF.C14689J;
import kotlin.Metadata;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: xF.b  reason: case insensitive filesystem */
public final class C15228b {

    /* renamed from: a  reason: collision with root package name */
    public static final C15228b f131984a = new C15228b();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f131985b = c.c(-1956669564, false, a.f131986a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xF.b$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131986a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1956669564, i10, -1, "com.sugarcube.app.base.ui.gallery.ComposableSingletons$GalleryHomeFragmentKt.lambda-1.<anonymous> (GalleryHomeFragment.kt:340)");
                }
                C14689J.b((d) null, mVar, 0, 1);
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
        return f131985b;
    }
}
