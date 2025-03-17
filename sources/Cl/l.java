package CL;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public class l extends j<a> {

    /* renamed from: y  reason: collision with root package name */
    private static final Set<Integer> f133636y;

    /* renamed from: v  reason: collision with root package name */
    private float f133637v;

    /* renamed from: w  reason: collision with root package name */
    float f133638w;

    /* renamed from: x  reason: collision with root package name */
    float f133639x;

    public interface a {
        boolean a(l lVar);

        void b(l lVar, float f10, float f11, float f12);

        boolean c(l lVar, float f10, float f11);
    }

    public static class b implements a {
    }

    static {
        HashSet hashSet = new HashSet();
        f133636y = hashSet;
        hashSet.add(2);
    }

    public l(Context context, C15522a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    public Set<Integer> C() {
        return f133636y;
    }

    /* access modifiers changed from: package-private */
    public float D(float f10, float f11) {
        float abs = Math.abs((float) (((double) ((n().x * f11) + (n().y * f10))) / (Math.pow((double) n().x, 2.0d) + Math.pow((double) n().y, 2.0d))));
        return this.f133639x < 0.0f ? -abs : abs;
    }

    public float E() {
        return this.f133639x;
    }

    public float F() {
        return this.f133638w;
    }

    /* access modifiers changed from: package-private */
    public float G() {
        e eVar = this.f133618m.get(new i(this.f133617l.get(0), this.f133617l.get(1)));
        return (float) Math.toDegrees(Math.atan2((double) eVar.e(), (double) eVar.d()) - Math.atan2((double) eVar.c(), (double) eVar.a()));
    }

    public void H(float f10) {
        this.f133637v = f10;
    }

    /* access modifiers changed from: protected */
    public boolean c(int i10) {
        return Math.abs(this.f133638w) >= this.f133637v && super.c(i10);
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        super.j();
        float G10 = G();
        this.f133639x = G10;
        this.f133638w += G10;
        if (B()) {
            float f10 = this.f133639x;
            if (f10 != 0.0f) {
                return ((a) this.f133589h).c(this, f10, this.f133638w);
            }
        }
        if (!c(2) || !((a) this.f133589h).a(this)) {
            return false;
        }
        x();
        return true;
    }

    /* access modifiers changed from: protected */
    public void t() {
        super.t();
        this.f133638w = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        if (this.f133639x == 0.0f) {
            this.f133630t = 0.0f;
            this.f133631u = 0.0f;
        }
        ((a) this.f133589h).b(this, this.f133630t, this.f133631u, D(this.f133630t, this.f133631u));
    }
}
