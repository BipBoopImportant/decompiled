package CL;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public class n extends j<a> {

    /* renamed from: z  reason: collision with root package name */
    private static final Set<Integer> f133645z;

    /* renamed from: v  reason: collision with root package name */
    private float f133646v;

    /* renamed from: w  reason: collision with root package name */
    private float f133647w;

    /* renamed from: x  reason: collision with root package name */
    float f133648x;

    /* renamed from: y  reason: collision with root package name */
    float f133649y;

    public interface a {
        boolean a(n nVar, float f10, float f11);

        void b(n nVar, float f10, float f11);

        boolean c(n nVar);
    }

    static {
        HashSet hashSet = new HashSet();
        f133645z = hashSet;
        hashSet.add(14);
    }

    public n(Context context, C15522a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    public Set<Integer> C() {
        return f133645z;
    }

    /* access modifiers changed from: package-private */
    public float D() {
        return ((d().getX(d().findPointerIndex(this.f133617l.get(0).intValue())) + d().getX(d().findPointerIndex(this.f133617l.get(1).intValue()))) / 2.0f) - ((f().getX(f().findPointerIndex(this.f133617l.get(0).intValue())) + f().getX(f().findPointerIndex(this.f133617l.get(1).intValue()))) / 2.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        e eVar = this.f133618m.get(new i(this.f133617l.get(0), this.f133617l.get(1)));
        return Math.abs(Math.toDegrees(Math.abs(Math.atan2((double) eVar.c(), (double) eVar.a()))) - 90.0d) <= ((double) this.f133646v);
    }

    public void F(float f10) {
        this.f133646v = f10;
    }

    public void G(float f10) {
        this.f133647w = f10;
    }

    public void H(int i10) {
        G(this.f133582a.getResources().getDimension(i10));
    }

    /* access modifiers changed from: protected */
    public boolean c(int i10) {
        return Math.abs(this.f133648x) >= this.f133647w && super.c(i10);
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        super.j();
        float D10 = D();
        this.f133649y = D10;
        this.f133648x += D10;
        if (B()) {
            float f10 = this.f133649y;
            if (f10 != 0.0f) {
                return ((a) this.f133589h).a(this, f10, this.f133648x);
            }
        }
        if (!c(14) || !((a) this.f133589h).c(this)) {
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
        this.f133648x = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        ((a) this.f133589h).b(this, this.f133630t, this.f133631u);
    }
}
