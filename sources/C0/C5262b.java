package c0;

import android.util.Size;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5031k0;
import androidx.camera.core.impl.R0;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: c0.b  reason: case insensitive filesystem */
public class C5262b implements C5029j0 {

    /* renamed from: c  reason: collision with root package name */
    private final C5029j0 f22966c;

    /* renamed from: d  reason: collision with root package name */
    private final R0 f22967d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, C5031k0> f22968e = new HashMap();

    public C5262b(C5029j0 j0Var, R0 r02) {
        this.f22966c = j0Var;
        this.f22967d = r02;
    }

    private C5031k0 c(C5031k0 k0Var, Size size) {
        ArrayList arrayList = new ArrayList();
        for (C5031k0.c d10 : k0Var.b()) {
            arrayList.add(d(d10, size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return C5031k0.b.h(k0Var.a(), k0Var.e(), k0Var.f(), arrayList);
    }

    private static C5031k0.c d(C5031k0.c cVar, Size size) {
        return C5031k0.c.a(cVar.e(), cVar.i(), cVar.c(), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private Size e(int i10) {
        for (StretchedVideoResolutionQuirk next : this.f22967d.c(StretchedVideoResolutionQuirk.class)) {
            if (next != null) {
                return next.f(i10);
            }
        }
        return null;
    }

    private C5031k0 f(int i10) {
        C5031k0 k0Var;
        if (this.f22968e.containsKey(Integer.valueOf(i10))) {
            return this.f22968e.get(Integer.valueOf(i10));
        }
        if (this.f22966c.a(i10)) {
            C5031k0 b10 = this.f22966c.b(i10);
            Objects.requireNonNull(b10);
            k0Var = b10;
            Size e10 = e(i10);
            if (e10 != null) {
                k0Var = c(k0Var, e10);
            }
        } else {
            k0Var = null;
        }
        this.f22968e.put(Integer.valueOf(i10), k0Var);
        return k0Var;
    }

    public boolean a(int i10) {
        return this.f22966c.a(i10) && f(i10) != null;
    }

    public C5031k0 b(int i10) {
        return f(i10);
    }
}
