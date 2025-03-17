package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

final class b extends ViewPager2.i {

    /* renamed from: a  reason: collision with root package name */
    private final List<ViewPager2.i> f45002a;

    b(int i10) {
        this.f45002a = new ArrayList(i10);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    public void a(int i10) {
        try {
            for (ViewPager2.i a10 : this.f45002a) {
                a10.a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    public void b(int i10, float f10, int i11) {
        try {
            for (ViewPager2.i b10 : this.f45002a) {
                b10.b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    public void c(int i10) {
        try {
            for (ViewPager2.i c10 : this.f45002a) {
                c10.c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(ViewPager2.i iVar) {
        this.f45002a.add(iVar);
    }

    /* access modifiers changed from: package-private */
    public void e(ViewPager2.i iVar) {
        this.f45002a.remove(iVar);
    }
}
