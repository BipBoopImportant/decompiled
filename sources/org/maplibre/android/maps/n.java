package org.maplibre.android.maps;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import d9.M;

final class n {

    /* renamed from: a  reason: collision with root package name */
    private final G f145926a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final H f145927b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f145928c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public a f145929d;

    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f145930a = false;

        a() {
        }

        public void a() {
            this.f145930a = true;
        }

        public void run() {
            if (!this.f145930a) {
                n.this.f145928c.Y(new PointF(n.this.f145927b.g() / 2.0f, n.this.f145927b.e() / 2.0f), true);
                n.this.f145929d = null;
            }
        }
    }

    n(G g10, H h10, l lVar) {
        this.f145926a = g10;
        this.f145927b = h10;
        this.f145928c = lVar;
    }

    /* access modifiers changed from: package-private */
    public boolean d(int i10, KeyEvent keyEvent) {
        int i11 = i10;
        double d10 = keyEvent.getRepeatCount() >= 5 ? 50.0d : 10.0d;
        if (i11 != 66) {
            switch (i11) {
                case 19:
                    if (!this.f145927b.x()) {
                        return false;
                    }
                    this.f145926a.c();
                    this.f145926a.l(0.0d, d10, 0);
                    return true;
                case 20:
                    if (!this.f145927b.x()) {
                        return false;
                    }
                    this.f145926a.c();
                    this.f145926a.l(0.0d, -d10, 0);
                    return true;
                case 21:
                    if (!this.f145927b.x()) {
                        return false;
                    }
                    this.f145926a.c();
                    this.f145926a.l(d10, 0.0d, 0);
                    return true;
                case 22:
                    if (!this.f145927b.x()) {
                        return false;
                    }
                    this.f145926a.c();
                    this.f145926a.l(-d10, 0.0d, 0);
                    return true;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                    break;
                default:
                    return false;
            }
        }
        keyEvent.startTracking();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean e(int i10, KeyEvent keyEvent) {
        if ((i10 != 23 && i10 != 66) || !this.f145927b.z()) {
            return false;
        }
        this.f145928c.Y(new PointF(this.f145927b.g() / 2.0f, this.f145927b.e() / 2.0f), true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean f(int i10, KeyEvent keyEvent) {
        if (keyEvent.isCanceled()) {
            return false;
        }
        if ((i10 != 23 && i10 != 66) || !this.f145927b.z()) {
            return false;
        }
        this.f145928c.X(new PointF(this.f145927b.g() / 2.0f, this.f145927b.e() / 2.0f), true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean g(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a aVar = this.f145929d;
            if (aVar != null) {
                aVar.a();
                this.f145929d = null;
            }
            this.f145929d = new a();
            new Handler(Looper.getMainLooper()).postDelayed(this.f145929d, (long) ViewConfiguration.getLongPressTimeout());
            return true;
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return false;
                }
                a aVar2 = this.f145929d;
                if (aVar2 != null) {
                    aVar2.a();
                    this.f145929d = null;
                }
                return true;
            } else if (!this.f145927b.x()) {
                return false;
            } else {
                this.f145926a.c();
                this.f145926a.l(((double) motionEvent.getX()) * -10.0d, ((double) motionEvent.getY()) * -10.0d, 0);
                return true;
            }
        } else if (!this.f145927b.z()) {
            return false;
        } else {
            if (this.f145929d != null) {
                this.f145928c.X(new PointF(this.f145927b.g() / 2.0f, this.f145927b.e() / 2.0f), true);
            }
            return true;
        }
    }
}
