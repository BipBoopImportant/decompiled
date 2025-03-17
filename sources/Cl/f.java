package CL;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class f<L> extends b<L> {

    /* renamed from: i  reason: collision with root package name */
    private final float f133614i;

    /* renamed from: j  reason: collision with root package name */
    private float f133615j;

    /* renamed from: k  reason: collision with root package name */
    private final h f133616k = new h();

    /* renamed from: l  reason: collision with root package name */
    final List<Integer> f133617l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    final HashMap<i, e> f133618m = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private PointF f133619n = new PointF();

    /* renamed from: o  reason: collision with root package name */
    private DisplayMetrics f133620o;

    public f(Context context, C15522a aVar) {
        super(context, aVar);
        this.f133614i = (float) ViewConfiguration.get(context).getScaledEdgeSlop();
        s();
    }

    private void k() {
        this.f133618m.clear();
        int i10 = 0;
        while (i10 < this.f133617l.size() - 1) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f133617l.size(); i12++) {
                Integer num = this.f133617l.get(i10);
                int intValue = num.intValue();
                Integer num2 = this.f133617l.get(i12);
                int intValue2 = num2.intValue();
                float x10 = f().getX(f().findPointerIndex(intValue));
                float y10 = f().getY(f().findPointerIndex(intValue));
                float x11 = f().getX(f().findPointerIndex(intValue2)) - x10;
                float y11 = f().getY(f().findPointerIndex(intValue2)) - y10;
                float x12 = d().getX(d().findPointerIndex(intValue));
                float y12 = d().getY(d().findPointerIndex(intValue));
                this.f133618m.put(new i(num, num2), new e(x11, y11, d().getX(d().findPointerIndex(intValue2)) - x12, d().getY(d().findPointerIndex(intValue2)) - y12));
            }
            i10 = i11;
        }
    }

    private boolean m() {
        for (e b10 : this.f133618m.values()) {
            if (b10.b() < this.f133615j) {
                return true;
            }
        }
        return false;
    }

    private boolean q(MotionEvent motionEvent) {
        for (Integer intValue : this.f133617l) {
            if (motionEvent.findPointerIndex(intValue.intValue()) == -1) {
                return true;
            }
        }
        return false;
    }

    private void s() {
        if (this.f133583b != null) {
            this.f133620o = new DisplayMetrics();
            this.f133583b.getDefaultDisplay().getRealMetrics(this.f133620o);
            return;
        }
        this.f133620o = this.f133582a.getResources().getDisplayMetrics();
    }

    private void w(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            this.f133617l.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        } else if (actionMasked == 1 || actionMasked == 6) {
            this.f133617l.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s();
        }
        boolean z10 = this.f133616k.a(actionMasked, motionEvent.getPointerCount(), this.f133617l.size()) || (actionMasked == 2 && q(motionEvent));
        if (z10) {
            if (this instanceof j) {
                j jVar = (j) this;
                if (jVar.B()) {
                    jVar.y();
                }
            }
            this.f133617l.clear();
            this.f133618m.clear();
        }
        if (!z10 || actionMasked == 0) {
            w(motionEvent);
        }
        this.f133619n = q.a(motionEvent);
        if (z10) {
            Log.w("MultiFingerGesture", "Some MotionEvents were not passed to the library or events from different view trees are merged.");
            return false;
        }
        if (actionMasked == 2 && this.f133617l.size() >= p() && l()) {
            k();
            if (!r()) {
                return j();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean c(int i10) {
        return super.c(i10) && !r();
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return d().getPressure() / f().getPressure() > 0.67f;
    }

    public PointF n() {
        return this.f133619n;
    }

    public int o() {
        return this.f133617l.size();
    }

    /* access modifiers changed from: protected */
    public int p() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r() {
        /*
            r7 = this;
            android.util.DisplayMetrics r0 = r7.f133620o
            int r1 = r0.widthPixels
            float r1 = (float) r1
            float r2 = r7.f133614i
            float r1 = r1 - r2
            int r0 = r0.heightPixels
            float r0 = (float) r0
            float r0 = r0 - r2
            java.util.List<java.lang.Integer> r3 = r7.f133617l
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            android.view.MotionEvent r5 = r7.d()
            int r4 = r5.findPointerIndex(r4)
            android.view.MotionEvent r5 = r7.d()
            float r5 = CL.q.b(r5, r4)
            android.view.MotionEvent r6 = r7.d()
            float r4 = CL.q.c(r6, r4)
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x004a
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x004a
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x004a
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0012
        L_0x004a:
            r0 = 1
            return r0
        L_0x004c:
            boolean r0 = r7.m()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: CL.f.r():boolean");
    }

    /* access modifiers changed from: protected */
    public void t() {
    }

    public void u(float f10) {
        this.f133615j = f10;
    }

    public void v(int i10) {
        u(this.f133582a.getResources().getDimension(i10));
    }
}
