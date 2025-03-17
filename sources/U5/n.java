package U5;

import T5.C6697a;
import T5.C6705i;
import T5.u;
import android.content.Context;
import android.graphics.Canvas;
import g9.C7897a;
import kotlin.Metadata;
import p1.C5702H;
import p1.C5732n0;
import p1.O;
import r1.f;
import t1.C5941b;
import t1.C5942c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001c\u0010\u000e\u001a\u00060\nj\u0002`\u000b*\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LT5/n;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lp1/E0;", "filterQuality", "Lt1/c;", "a", "(LT5/n;Landroid/content/Context;I)Lt1/c;", "Lp1/n0;", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "c", "(Lp1/n0;)Landroid/graphics/Canvas;", "nativeCanvas", "coil-compose-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {
    public static final C5942c a(T5.n nVar, Context context, int i10) {
        return nVar instanceof C6697a ? C5941b.b(O.c(((C6697a) nVar).d()), 0, 0, i10, 6, (Object) null) : nVar instanceof C6705i ? new C7897a(u.a(nVar, context.getResources()).mutate()) : new m(nVar);
    }

    public static /* synthetic */ C5942c b(T5.n nVar, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = f.f28623w0.b();
        }
        return a(nVar, context, i10);
    }

    public static final Canvas c(C5732n0 n0Var) {
        return C5702H.d(n0Var);
    }
}
