package a9;

import GJ.C15765h;
import GJ.C15768k;
import I2.C4610g0;
import YH.C16877v;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.f4  reason: case insensitive filesystem */
public final class C6826f4 extends C17544u implements C17642l<View, List<? extends SurfaceView>> {

    /* renamed from: c  reason: collision with root package name */
    public static final C6826f4 f42562c = new C6826f4();

    public C6826f4() {
        super(1);
    }

    public final Object invoke(Object obj) {
        C15765h<View> b10;
        C15765h<R> S10;
        C15765h<R> p10;
        View view = (View) obj;
        C17542s.j(view, "child");
        if ((view instanceof SurfaceView) && view.getWidth() > 0 && ((SurfaceView) view).getHeight() > 0) {
            return C16877v.e(view);
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        List<R> a02 = (viewGroup == null || (b10 = C4610g0.b(viewGroup)) == null || (S10 = C15768k.S(b10, f42562c)) == null || (p10 = C15768k.p(S10)) == null) ? null : C15768k.a0(p10);
        return a02 == null ? C16877v.n() : a02;
    }
}
