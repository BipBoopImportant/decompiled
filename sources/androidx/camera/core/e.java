package androidx.camera.core;

import C.W;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n;
import java.util.HashSet;
import java.util.Set;

public abstract class e implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Object f16664a = new Object();

    /* renamed from: b  reason: collision with root package name */
    protected final n f16665b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<a> f16666c = new HashSet();

    public interface a {
        void a(n nVar);
    }

    protected e(n nVar) {
        this.f16665b = nVar;
    }

    public n.a[] A1() {
        return this.f16665b.A1();
    }

    public W F2() {
        return this.f16665b.F2();
    }

    public void c(a aVar) {
        synchronized (this.f16664a) {
            this.f16666c.add(aVar);
        }
    }

    public void close() {
        this.f16665b.close();
        d();
    }

    /* access modifiers changed from: protected */
    public void d() {
        HashSet<a> hashSet;
        synchronized (this.f16664a) {
            hashSet = new HashSet<>(this.f16666c);
        }
        for (a a10 : hashSet) {
            a10.a(this);
        }
    }

    public Rect getCropRect() {
        return this.f16665b.getCropRect();
    }

    public int getFormat() {
        return this.f16665b.getFormat();
    }

    public int getHeight() {
        return this.f16665b.getHeight();
    }

    public int getWidth() {
        return this.f16665b.getWidth();
    }

    public Image k() {
        return this.f16665b.k();
    }

    public void setCropRect(Rect rect) {
        this.f16665b.setCropRect(rect);
    }
}
