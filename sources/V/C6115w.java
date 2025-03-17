package v;

import C.C4391e0;
import C.C4409q;
import D.a;
import android.content.Context;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w.C6172g;
import w.O;

/* renamed from: v.w  reason: case insensitive filesystem */
public final class C6115w implements H {

    /* renamed from: a  reason: collision with root package name */
    private final Context f30730a;

    /* renamed from: b  reason: collision with root package name */
    private final a f30731b;

    /* renamed from: c  reason: collision with root package name */
    private final S f30732c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f30733d;

    /* renamed from: e  reason: collision with root package name */
    private final O f30734e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f30735f;

    /* renamed from: g  reason: collision with root package name */
    private final C6072h1 f30736g;

    /* renamed from: h  reason: collision with root package name */
    private final long f30737h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, C6042T> f30738i = new HashMap();

    public C6115w(Context context, S s10, C4409q qVar, long j10) {
        this.f30730a = context;
        this.f30732c = s10;
        O b10 = O.b(context, s10.c());
        this.f30734e = b10;
        this.f30736g = C6072h1.c(context);
        this.f30735f = e(P0.b(this, qVar));
        A.a aVar = new A.a(b10);
        this.f30731b = aVar;
        Q q10 = new Q(aVar, 1);
        this.f30733d = q10;
        aVar.b(q10);
        this.f30737h = j10;
    }

    private List<String> e(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (next.equals("0") || next.equals("1")) {
                arrayList.add(next);
            } else if (O0.a(this.f30734e, next)) {
                arrayList.add(next);
            } else {
                C4391e0.a("Camera2CameraFactory", "Camera " + next + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public J a(String str) {
        if (this.f30735f.contains(str)) {
            return new C6036M(this.f30730a, this.f30734e, str, f(str), this.f30731b, this.f30733d, this.f30732c.b(), this.f30732c.c(), this.f30736g, this.f30737h);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public Set<String> b() {
        return new LinkedHashSet(this.f30735f);
    }

    public a d() {
        return this.f30731b;
    }

    /* access modifiers changed from: package-private */
    public C6042T f(String str) {
        try {
            C6042T t10 = this.f30738i.get(str);
            if (t10 != null) {
                return t10;
            }
            C6042T t11 = new C6042T(str, this.f30734e);
            this.f30738i.put(str, t11);
            return t11;
        } catch (C6172g e10) {
            throw R0.a(e10);
        }
    }

    /* renamed from: g */
    public O c() {
        return this.f30734e;
    }
}
