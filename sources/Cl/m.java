package CL;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public class m extends j<a> {

    /* renamed from: z  reason: collision with root package name */
    private static final Set<Integer> f133640z;

    /* renamed from: v  reason: collision with root package name */
    private float f133641v;

    /* renamed from: w  reason: collision with root package name */
    private float f133642w;

    /* renamed from: x  reason: collision with root package name */
    float f133643x;

    /* renamed from: y  reason: collision with root package name */
    float f133644y;

    public interface a {
        boolean a(m mVar);

        void b(m mVar, float f10, float f11);

        boolean c(m mVar, float f10, float f11);
    }

    public static class b implements a {
    }

    static {
        HashSet hashSet = new HashSet();
        f133640z = hashSet;
        hashSet.add(3);
    }

    public m(Context context, C15522a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    public Set<Integer> C() {
        return f133640z;
    }

    /* access modifiers changed from: package-private */
    public float D() {
        return ((d().getY(d().findPointerIndex(this.f133617l.get(0).intValue())) + d().getY(d().findPointerIndex(this.f133617l.get(1).intValue()))) / 2.0f) - ((f().getY(f().findPointerIndex(this.f133617l.get(0).intValue())) + f().getY(f().findPointerIndex(this.f133617l.get(1).intValue()))) / 2.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        e eVar = this.f133618m.get(new i(this.f133617l.get(0), this.f133617l.get(1)));
        double degrees = Math.toDegrees(Math.abs(Math.atan2((double) eVar.c(), (double) eVar.a())));
        float f10 = this.f133641v;
        return degrees <= ((double) f10) || 180.0d - degrees <= ((double) f10);
    }

    public void F(float f10) {
        this.f133641v = f10;
    }

    public void G(float f10) {
        this.f133642w = f10;
    }

    public void H(int i10) {
        G(this.f133582a.getResources().getDimension(i10));
    }

    /* access modifiers changed from: protected */
    public boolean c(int i10) {
        return Math.abs(this.f133643x) >= this.f133642w && super.c(i10);
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        super.j();
        float D10 = D();
        this.f133644y = D10;
        this.f133643x += D10;
        if (B()) {
            float f10 = this.f133644y;
            if (f10 != 0.0f) {
                return ((a) this.f133589h).c(this, f10, this.f133643x);
            }
        }
        if (!c(3) || !((a) this.f133589h).a(this)) {
            return false;
        }
        x();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        return super.r() || !E();
    }

    /* access modifiers changed from: protected */
    public void t() {
        super.t();
        this.f133643x = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        ((a) this.f133589h).b(this, this.f133630t, this.f133631u);
    }
}
