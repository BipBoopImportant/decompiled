package CL;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.Set;

public abstract class b<L> {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f133582a;

    /* renamed from: b  reason: collision with root package name */
    protected final WindowManager f133583b;

    /* renamed from: c  reason: collision with root package name */
    private final C15522a f133584c;

    /* renamed from: d  reason: collision with root package name */
    private MotionEvent f133585d;

    /* renamed from: e  reason: collision with root package name */
    private MotionEvent f133586e;

    /* renamed from: f  reason: collision with root package name */
    private long f133587f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f133588g = true;

    /* renamed from: h  reason: collision with root package name */
    protected L f133589h;

    public b(Context context, C15522a aVar) {
        this.f133582a = context;
        this.f133583b = (WindowManager) context.getSystemService("window");
        this.f133584c = aVar;
    }

    private boolean a(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        MotionEvent motionEvent2 = this.f133586e;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.f133586e = null;
        }
        MotionEvent motionEvent3 = this.f133585d;
        if (motionEvent3 != null) {
            this.f133586e = MotionEvent.obtain(motionEvent3);
            this.f133585d.recycle();
            this.f133585d = null;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        this.f133585d = obtain;
        this.f133587f = obtain.getEventTime() - this.f133585d.getDownTime();
        return b(motionEvent);
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    public boolean c(int i10) {
        if (this.f133589h == null || !this.f133588g) {
            return false;
        }
        for (Set<Integer> next : this.f133584c.c()) {
            if (next.contains(Integer.valueOf(i10))) {
                for (Integer num : next) {
                    num.intValue();
                    Iterator<b> it = this.f133584c.a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            b next2 = it.next();
                            if (next2 instanceof j) {
                                j jVar = (j) next2;
                                if (jVar.z().contains(num) && jVar.B()) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                continue;
            }
        }
        return true;
    }

    public MotionEvent d() {
        return this.f133585d;
    }

    public long e() {
        return this.f133587f;
    }

    public MotionEvent f() {
        return this.f133586e;
    }

    /* access modifiers changed from: protected */
    public boolean g(MotionEvent motionEvent) {
        return a(motionEvent);
    }

    public void h(boolean z10) {
        this.f133588g = z10;
    }

    /* access modifiers changed from: protected */
    public void i(L l10) {
        this.f133589h = l10;
    }
}
