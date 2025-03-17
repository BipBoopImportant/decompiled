package tF;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: tF.g  reason: case insensitive filesystem */
public final class C15082g {

    /* renamed from: a  reason: collision with root package name */
    public static final C15082g f131166a = new C15082g();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f131167b = c.c(-2122263849, false, a.f131168a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tF.g$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131168a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2122263849, i10, -1, "com.sugarcube.app.base.ui.dialog.ComposableSingletons$BottomSheetDialogKt.lambda-1.<anonymous> (BottomSheetDialog.kt:132)");
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
        return f131167b;
    }
}
