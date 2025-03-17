package androidx.fragment.app;

import XH.C16807N;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0013J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0013J%\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0018J\u001d\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0013J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*¨\u0006,"}, d2 = {"Landroidx/fragment/app/B;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/FragmentManager$m;", "cb", "", "recursive", "LXH/N;", "o", "(Landroidx/fragment/app/FragmentManager$m;Z)V", "p", "(Landroidx/fragment/app/FragmentManager$m;)V", "Landroidx/fragment/app/o;", "f", "onlyRecursive", "g", "(Landroidx/fragment/app/o;Z)V", "b", "Landroid/os/Bundle;", "savedInstanceState", "h", "(Landroidx/fragment/app/o;Landroid/os/Bundle;Z)V", "c", "a", "Landroid/view/View;", "v", "m", "(Landroidx/fragment/app/o;Landroid/view/View;Landroid/os/Bundle;Z)V", "k", "i", "l", "outState", "j", "n", "d", "e", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/B$a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final FragmentManager f21735a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f21736b = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/B$a;", "", "Landroidx/fragment/app/FragmentManager$m;", "callback", "", "recursive", "<init>", "(Landroidx/fragment/app/FragmentManager$m;Z)V", "a", "Landroidx/fragment/app/FragmentManager$m;", "()Landroidx/fragment/app/FragmentManager$m;", "b", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final FragmentManager.m f21737a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f21738b;

        public a(FragmentManager.m mVar, boolean z10) {
            C17542s.j(mVar, "callback");
            this.f21737a = mVar;
            this.f21738b = z10;
        }

        public final FragmentManager.m a() {
            return this.f21737a;
        }

        public final boolean b() {
            return this.f21738b;
        }
    }

    public B(FragmentManager fragmentManager) {
        C17542s.j(fragmentManager, "fragmentManager");
        this.f21735a = fragmentManager;
    }

    public final void a(C5187o oVar, Bundle bundle, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().a(oVar, bundle, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentActivityCreated(this.f21735a, oVar, bundle);
            }
        }
    }

    public final void b(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "f");
        Context f10 = this.f21735a.H0().f();
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().b(oVar, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentAttached(this.f21735a, oVar, f10);
            }
        }
    }

    public final void c(C5187o oVar, Bundle bundle, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().c(oVar, bundle, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentCreated(this.f21735a, oVar, bundle);
            }
        }
    }

    public final void d(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().d(oVar, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentDestroyed(this.f21735a, oVar);
            }
        }
    }

    public final void e(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().e(oVar, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentDetached(this.f21735a, oVar);
            }
        }
    }

    public final void f(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().f(oVar, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentPaused(this.f21735a, oVar);
            }
        }
    }

    public final void g(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "f");
        Context f10 = this.f21735a.H0().f();
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().g(oVar, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentPreAttached(this.f21735a, oVar, f10);
            }
        }
    }

    public final void h(C5187o oVar, Bundle bundle, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().h(oVar, bundle, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentPreCreated(this.f21735a, oVar, bundle);
            }
        }
    }

    public final void i(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().i(oVar, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentResumed(this.f21735a, oVar);
            }
        }
    }

    public final void j(C5187o oVar, Bundle bundle, boolean z10) {
        C17542s.j(oVar, "f");
        C17542s.j(bundle, "outState");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().j(oVar, bundle, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentSaveInstanceState(this.f21735a, oVar, bundle);
            }
        }
    }

    public final void k(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().k(oVar, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentStarted(this.f21735a, oVar);
            }
        }
    }

    public final void l(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().l(oVar, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentStopped(this.f21735a, oVar);
            }
        }
    }

    public final void m(C5187o oVar, View view, Bundle bundle, boolean z10) {
        C17542s.j(oVar, "f");
        C17542s.j(view, "v");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().m(oVar, view, bundle, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentViewCreated(this.f21735a, oVar, view, bundle);
            }
        }
    }

    public final void n(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "f");
        C5187o K02 = this.f21735a.K0();
        if (K02 != null) {
            FragmentManager parentFragmentManager = K02.getParentFragmentManager();
            C17542s.i(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.J0().n(oVar, true);
        }
        Iterator<a> it = this.f21736b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.b()) {
                next.a().onFragmentViewDestroyed(this.f21735a, oVar);
            }
        }
    }

    public final void o(FragmentManager.m mVar, boolean z10) {
        C17542s.j(mVar, "cb");
        this.f21736b.add(new a(mVar, z10));
    }

    public final void p(FragmentManager.m mVar) {
        C17542s.j(mVar, "cb");
        synchronized (this.f21736b) {
            try {
                int size = this.f21736b.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if (this.f21736b.get(i10).a() == mVar) {
                        this.f21736b.remove(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
