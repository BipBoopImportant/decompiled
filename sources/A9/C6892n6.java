package a9;

import YH.C16877v;
import a9.C6984z3;
import android.view.View;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.b1;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.p;
import w8.C8933a;
import w8.e;

/* renamed from: a9.n6  reason: case insensitive filesystem */
public class C6892n6 implements p<View, W3, C6984z3> {

    /* renamed from: a  reason: collision with root package name */
    public final M3<C8933a> f42743a;

    public C6892n6(M3<C8933a> m32) {
        C17542s.j(m32, "composeInterfaceProvider");
        this.f42743a = m32;
    }

    public void a(e eVar) {
        C17542s.j(eVar, "rootNode");
    }

    public final Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        W3 w32 = (W3) obj2;
        C17542s.j(view, "group");
        C17542s.j(w32, "viewBitmapProviderResult");
        C8933a aVar = this.f42743a.get();
        if (aVar == null) {
            return C6984z3.a.f42983a;
        }
        if (!aVar.a(view)) {
            return C6984z3.a.f42983a;
        }
        e c10 = aVar.c(view, false, new C6844h6(w32));
        if (c10 != null) {
            a(c10);
        }
        List list = null;
        if (c10 != null) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                C6854j0 j0Var = new C6854j0(new C6949v0());
                C17542s.j(viewGroup, "group");
                C17542s.j(c10, "rootNode");
                C17542s.j(j0Var, "pathDescriptor");
                list = C16877v.e(b1.a(c10, j0Var.a(viewGroup)));
            }
        }
        if (list == null) {
            list = C16877v.n();
        }
        return new C6984z3.b(list);
    }
}
