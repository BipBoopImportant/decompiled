package X;

import H2.i;
import androidx.camera.core.impl.C5031k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class g implements C5031k0 {
    public static g h(int i10, int i11, List<C5031k0.a> list, List<C5031k0.c> list2) {
        i.b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new a(i10, i11, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), !list.isEmpty() ? list.get(0) : null, list2.get(0));
    }

    public static g i(C5031k0 k0Var) {
        return h(k0Var.a(), k0Var.e(), k0Var.f(), k0Var.b());
    }

    public abstract C5031k0.a j();

    public abstract C5031k0.c k();
}
