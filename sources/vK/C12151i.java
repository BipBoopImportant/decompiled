package vk;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import u0.C5991o;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: vk.i  reason: case insensitive filesystem */
public final class C12151i {

    /* renamed from: a  reason: collision with root package name */
    public static final C12151i f104805a = new C12151i();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5991o, C4889m, Integer, C16807N> f104806b = c.c(660228951, false, a.f104807a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.i$a */
    static final class a implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104807a = new a();

        a() {
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(660228951, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ComposableSingletons$FrontLayerContentKt.lambda-1.<anonymous> (FrontLayerContent.kt:164)");
                }
                G0.b(J.f(d.f18749a, 0.0f, 1, (Object) null), mVar, 6, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5991o, C4889m, Integer, C16807N> a() {
        return f104806b;
    }
}
