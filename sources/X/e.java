package X;

import C.C4417z;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5031k0;
import b0.C5252b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class e implements C5029j0 {

    /* renamed from: c  reason: collision with root package name */
    private final C5029j0 f14674c;

    /* renamed from: d  reason: collision with root package name */
    private final C4417z f14675d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, C5031k0> f14676e = new HashMap();

    public e(C5029j0 j0Var, C4417z zVar) {
        this.f14674c = j0Var;
        this.f14675d = zVar;
    }

    private static C5031k0 c(C5031k0 k0Var, C4417z zVar) {
        if (k0Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C5031k0.c next : k0Var.b()) {
            if (C5252b.f(next, zVar)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return C5031k0.b.h(k0Var.a(), k0Var.e(), k0Var.f(), arrayList);
    }

    private C5031k0 d(int i10) {
        if (this.f14676e.containsKey(Integer.valueOf(i10))) {
            return this.f14676e.get(Integer.valueOf(i10));
        }
        if (!this.f14674c.a(i10)) {
            return null;
        }
        C5031k0 c10 = c(this.f14674c.b(i10), this.f14675d);
        this.f14676e.put(Integer.valueOf(i10), c10);
        return c10;
    }

    public boolean a(int i10) {
        return this.f14674c.a(i10) && d(i10) != null;
    }

    public C5031k0 b(int i10) {
        return d(i10);
    }
}
