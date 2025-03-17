package androidx.camera.core;

import C.W;
import android.graphics.Rect;
import android.util.Size;

public final class r extends e {

    /* renamed from: d  reason: collision with root package name */
    private final Object f17071d;

    /* renamed from: e  reason: collision with root package name */
    private final W f17072e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f17073f;

    /* renamed from: g  reason: collision with root package name */
    private final int f17074g;

    /* renamed from: h  reason: collision with root package name */
    private final int f17075h;

    r(n nVar, W w10) {
        this(nVar, (Size) null, w10);
    }

    public W F2() {
        return this.f17072e;
    }

    public Rect getCropRect() {
        synchronized (this.f17071d) {
            try {
                if (this.f17073f == null) {
                    Rect rect = new Rect(0, 0, getWidth(), getHeight());
                    return rect;
                }
                Rect rect2 = new Rect(this.f17073f);
                return rect2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getHeight() {
        return this.f17075h;
    }

    public int getWidth() {
        return this.f17074g;
    }

    public void setCropRect(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f17071d) {
            this.f17073f = rect;
        }
    }

    public r(n nVar, Size size, W w10) {
        super(nVar);
        this.f17071d = new Object();
        if (size == null) {
            this.f17074g = super.getWidth();
            this.f17075h = super.getHeight();
        } else {
            this.f17074g = size.getWidth();
            this.f17075h = size.getHeight();
        }
        this.f17072e = w10;
    }
}
