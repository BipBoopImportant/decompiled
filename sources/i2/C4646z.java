package I2;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: I2.z  reason: case insensitive filesystem */
public class C4646z {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f8736a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<B> f8737b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<B, a> f8738c = new HashMap();

    /* renamed from: I2.z$a */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final r f8739a;

        /* renamed from: b  reason: collision with root package name */
        private C5218v f8740b;

        a(r rVar, C5218v vVar) {
            this.f8739a = rVar;
            this.f8740b = vVar;
            rVar.c(vVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f8739a.g(this.f8740b);
            this.f8740b = null;
        }
    }

    public C4646z(Runnable runnable) {
        this.f8736a = runnable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(B b10, C5221y yVar, r.a aVar) {
        if (aVar == r.a.ON_DESTROY) {
            l(b10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(r.b bVar, B b10, C5221y yVar, r.a aVar) {
        if (aVar == r.a.m(bVar)) {
            c(b10);
        } else if (aVar == r.a.ON_DESTROY) {
            l(b10);
        } else if (aVar == r.a.b(bVar)) {
            this.f8737b.remove(b10);
            this.f8736a.run();
        }
    }

    public void c(B b10) {
        this.f8737b.add(b10);
        this.f8736a.run();
    }

    public void d(B b10, C5221y yVar) {
        c(b10);
        r lifecycle = yVar.getLifecycle();
        a remove = this.f8738c.remove(b10);
        if (remove != null) {
            remove.a();
        }
        this.f8738c.put(b10, new a(lifecycle, new C4644y(this, b10)));
    }

    @SuppressLint({"LambdaLast"})
    public void e(B b10, C5221y yVar, r.b bVar) {
        r lifecycle = yVar.getLifecycle();
        a remove = this.f8738c.remove(b10);
        if (remove != null) {
            remove.a();
        }
        this.f8738c.put(b10, new a(lifecycle, new C4642x(this, bVar, b10)));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<B> it = this.f8737b.iterator();
        while (it.hasNext()) {
            it.next().o(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<B> it = this.f8737b.iterator();
        while (it.hasNext()) {
            it.next().g(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<B> it = this.f8737b.iterator();
        while (it.hasNext()) {
            if (it.next().k(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<B> it = this.f8737b.iterator();
        while (it.hasNext()) {
            it.next().i(menu);
        }
    }

    public void l(B b10) {
        this.f8737b.remove(b10);
        a remove = this.f8738c.remove(b10);
        if (remove != null) {
            remove.a();
        }
        this.f8736a.run();
    }
}
