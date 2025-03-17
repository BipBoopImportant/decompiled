package a9;

import YH.C16877v;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import w8.C8933a;

/* renamed from: a9.v0  reason: case insensitive filesystem */
public final class C6949v0 implements E0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<E0> f42893a = C16877v.q(new C6927s2(), new C6836g6((C8933a) C6976y3.f42973c.getValue()));

    public final boolean a(View view, ViewGroup viewGroup) {
        C17542s.j(view, "thisView");
        C17542s.j(viewGroup, "withThisParent");
        List<E0> list = this.f42893a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (E0 a10 : list) {
                if (a10.a(view, viewGroup)) {
                    return true;
                }
            }
        }
        return false;
    }
}
