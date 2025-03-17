package CL;

import android.content.Context;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Iterator;

public class g extends f<a> {

    /* renamed from: p  reason: collision with root package name */
    private long f133621p;

    /* renamed from: q  reason: collision with root package name */
    private float f133622q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f133623r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f133624s;

    /* renamed from: t  reason: collision with root package name */
    private int f133625t;

    public interface a {
        boolean a(g gVar, int i10);
    }

    public g(Context context, C15522a aVar) {
        super(context, aVar);
    }

    public void A(long j10) {
        this.f133621p = j10;
    }

    /* access modifiers changed from: protected */
    public boolean b(MotionEvent motionEvent) {
        super.b(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 5) {
                    if (this.f133624s) {
                        this.f133623r = true;
                    }
                    this.f133625t = this.f133617l.size();
                } else if (actionMasked == 6) {
                    this.f133624s = true;
                }
            } else if (!this.f133623r) {
                this.f133623r = x(this.f133618m);
            }
            return false;
        }
        if (c(4)) {
            z10 = ((a) this.f133589h).a(this, this.f133625t);
        }
        t();
        return z10;
    }

    /* access modifiers changed from: protected */
    public boolean c(int i10) {
        return this.f133625t > 1 && !this.f133623r && e() < this.f133621p && super.c(i10);
    }

    /* access modifiers changed from: protected */
    public void t() {
        super.t();
        this.f133625t = 0;
        this.f133623r = false;
        this.f133624s = false;
    }

    /* access modifiers changed from: package-private */
    public boolean x(HashMap<i, e> hashMap) {
        boolean z10;
        Iterator<e> it = hashMap.values().iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            e next = it.next();
            float abs = Math.abs(next.a() - next.d());
            float abs2 = Math.abs(next.c() - next.e());
            float f10 = this.f133622q;
            if (abs > f10 || abs2 > f10) {
                z10 = true;
            }
            this.f133623r = z10;
        } while (!z10);
        return true;
    }

    public void y(float f10) {
        this.f133622q = f10;
    }

    public void z(int i10) {
        y(this.f133582a.getResources().getDimension(i10));
    }
}
