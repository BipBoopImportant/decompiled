package CL;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class d extends j<a> {

    /* renamed from: C  reason: collision with root package name */
    private static final Set<Integer> f133600C;

    /* renamed from: A  reason: collision with root package name */
    private float f133601A;

    /* renamed from: B  reason: collision with root package name */
    private final Map<Integer, c> f133602B = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    private PointF f133603v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f133604w;

    /* renamed from: x  reason: collision with root package name */
    float f133605x;

    /* renamed from: y  reason: collision with root package name */
    float f133606y;

    /* renamed from: z  reason: collision with root package name */
    private RectF f133607z;

    public interface a {
        boolean a(d dVar);

        void b(d dVar, float f10, float f11);

        boolean c(d dVar, float f10, float f11);
    }

    public static class b implements a {
    }

    static {
        HashSet hashSet = new HashSet();
        f133600C = hashSet;
        hashSet.add(13);
    }

    public d(Context context, C15522a aVar) {
        super(context, aVar);
    }

    private void F() {
        for (Integer next : this.f133617l) {
            int intValue = next.intValue();
            this.f133602B.get(next).a(d().getX(d().findPointerIndex(intValue)), d().getY(d().findPointerIndex(intValue)));
        }
    }

    /* access modifiers changed from: protected */
    public Set<Integer> C() {
        return f133600C;
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        Iterator<c> it = this.f133602B.values().iterator();
        if (!it.hasNext()) {
            return false;
        }
        c next = it.next();
        boolean z10 = Math.abs(next.d()) >= this.f133601A || Math.abs(next.e()) >= this.f133601A;
        RectF rectF = this.f133607z;
        return (rectF == null || !rectF.contains(n().x, n().y)) && z10;
    }

    public c E(int i10) {
        if (!B() || i10 < 0 || i10 >= o()) {
            return null;
        }
        return this.f133602B.get(this.f133617l.get(i10));
    }

    /* access modifiers changed from: protected */
    public boolean b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f133602B.clear();
            } else if (actionMasked == 3) {
                this.f133602B.clear();
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f133604w = true;
                    this.f133602B.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                }
            }
            return super.b(motionEvent);
        }
        this.f133604w = true;
        this.f133602B.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new c(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        return super.b(motionEvent);
    }

    /* access modifiers changed from: protected */
    public boolean c(int i10) {
        return super.c(i10) && D();
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        super.j();
        F();
        if (B()) {
            PointF n10 = n();
            PointF pointF = this.f133603v;
            float f10 = pointF.x - n10.x;
            this.f133605x = f10;
            float f11 = pointF.y - n10.y;
            this.f133606y = f11;
            this.f133603v = n10;
            if (!this.f133604w) {
                return ((a) this.f133589h).c(this, f10, f11);
            }
            this.f133604w = false;
            return ((a) this.f133589h).c(this, 0.0f, 0.0f);
        } else if (!c(13) || !((a) this.f133589h).a(this)) {
            return false;
        } else {
            x();
            this.f133603v = n();
            this.f133604w = false;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int p() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void t() {
        super.t();
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        ((a) this.f133589h).b(this, this.f133630t, this.f133631u);
    }
}
