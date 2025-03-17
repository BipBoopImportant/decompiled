package CL;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Set;

public abstract class j<L> extends f<L> {

    /* renamed from: p  reason: collision with root package name */
    private final Set<Integer> f133626p = C();

    /* renamed from: q  reason: collision with root package name */
    private boolean f133627q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f133628r;

    /* renamed from: s  reason: collision with root package name */
    VelocityTracker f133629s;

    /* renamed from: t  reason: collision with root package name */
    float f133630t;

    /* renamed from: u  reason: collision with root package name */
    float f133631u;

    public j(Context context, C15522a aVar) {
        super(context, aVar);
    }

    public void A() {
        if (B()) {
            this.f133628r = true;
        }
    }

    public boolean B() {
        return this.f133627q;
    }

    /* access modifiers changed from: protected */
    public abstract Set<Integer> C();

    /* access modifiers changed from: protected */
    public boolean b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5 || actionMasked == 6 || actionMasked == 3) {
            t();
        }
        if (this.f133628r) {
            this.f133628r = false;
            t();
            y();
        }
        VelocityTracker velocityTracker = this.f133629s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(d());
        }
        boolean b10 = super.b(motionEvent);
        if (actionMasked == 1 || actionMasked == 6) {
            if (this.f133617l.size() < p() && this.f133627q) {
                y();
                return true;
            }
        } else if (actionMasked == 3 && this.f133627q) {
            y();
            return true;
        }
        return b10;
    }

    public void h(boolean z10) {
        super.h(z10);
        if (!z10) {
            A();
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        this.f133627q = true;
        if (this.f133629s == null) {
            this.f133629s = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        this.f133627q = false;
        VelocityTracker velocityTracker = this.f133629s;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            this.f133630t = this.f133629s.getXVelocity();
            this.f133631u = this.f133629s.getYVelocity();
            this.f133629s.recycle();
            this.f133629s = null;
        }
        t();
    }

    /* access modifiers changed from: package-private */
    public Set<Integer> z() {
        return this.f133626p;
    }
}
