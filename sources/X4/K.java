package x4;

import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import YH.C16877v;
import YH.g0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001a\u0010\bR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010!R*\u0010,\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00118G@GX\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0-8\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b \u0010/R#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0-8\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b$\u0010/¨\u00062"}, d2 = {"Lx4/K;", "", "<init>", "()V", "Lx4/l;", "backStackEntry", "LXH/N;", "k", "(Lx4/l;)V", "l", "Lx4/v;", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Lx4/v;Landroid/os/Bundle;)Lx4/l;", "popUpTo", "", "saveState", "h", "(Lx4/l;Z)V", "i", "f", "g", "entry", "e", "j", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "LTJ/B;", "", "b", "LTJ/B;", "_backStack", "", "c", "_transitionsInProgress", "<set-?>", "d", "Z", "()Z", "m", "(Z)V", "isNavigating", "LTJ/P;", "LTJ/P;", "()LTJ/P;", "backStack", "transitionsInProgress", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f57464a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    private final C16505B<List<C8948l>> f57465b;

    /* renamed from: c  reason: collision with root package name */
    private final C16505B<Set<C8948l>> f57466c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57467d;

    /* renamed from: e  reason: collision with root package name */
    private final C16519P<List<C8948l>> f57468e;

    /* renamed from: f  reason: collision with root package name */
    private final C16519P<Set<C8948l>> f57469f;

    public K() {
        C16505B<List<C8948l>> a10 = C16521S.a(C16877v.n());
        this.f57465b = a10;
        C16505B<Set<C8948l>> a11 = C16521S.a(g0.d());
        this.f57466c = a11;
        this.f57468e = C16534i.c(a10);
        this.f57469f = C16534i.c(a11);
    }

    public abstract C8948l a(v vVar, Bundle bundle);

    public final C16519P<List<C8948l>> b() {
        return this.f57468e;
    }

    public final C16519P<Set<C8948l>> c() {
        return this.f57469f;
    }

    public final boolean d() {
        return this.f57467d;
    }

    public void e(C8948l lVar) {
        C17542s.j(lVar, "entry");
        C16505B<Set<C8948l>> b10 = this.f57466c;
        b10.setValue(g0.j(b10.getValue(), lVar));
    }

    public void f(C8948l lVar) {
        int i10;
        C17542s.j(lVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f57464a;
        reentrantLock.lock();
        try {
            List w12 = C16877v.w1(this.f57468e.getValue());
            ListIterator listIterator = w12.listIterator(w12.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (C17542s.e(((C8948l) listIterator.previous()).f(), lVar.f())) {
                        i10 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            w12.set(i10, lVar);
            this.f57465b.setValue(w12);
            C16807N n10 = C16807N.f139792a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void g(C8948l lVar) {
        C17542s.j(lVar, "backStackEntry");
        List value = this.f57468e.getValue();
        ListIterator listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            C8948l lVar2 = (C8948l) listIterator.previous();
            if (C17542s.e(lVar2.f(), lVar.f())) {
                C16505B<Set<C8948l>> b10 = this.f57466c;
                b10.setValue(g0.l(g0.l(b10.getValue(), lVar2), lVar));
                f(lVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void h(C8948l lVar, boolean z10) {
        C17542s.j(lVar, "popUpTo");
        ReentrantLock reentrantLock = this.f57464a;
        reentrantLock.lock();
        try {
            C16505B<List<C8948l>> b10 = this.f57465b;
            ArrayList arrayList = new ArrayList();
            Iterator it = b10.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C17542s.e((C8948l) next, lVar)) {
                    break;
                }
                arrayList.add(next);
            }
            b10.setValue(arrayList);
            C16807N n10 = C16807N.f139792a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void i(C8948l lVar, boolean z10) {
        Object obj;
        C17542s.j(lVar, "popUpTo");
        Iterable value = this.f57466c.getValue();
        if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
            Iterator it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C8948l) it.next()) == lVar) {
                    Iterable<C8948l> value2 = this.f57468e.getValue();
                    if (!(value2 instanceof Collection) || !((Collection) value2).isEmpty()) {
                        for (C8948l lVar2 : value2) {
                            if (lVar2 == lVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        C16505B<Set<C8948l>> b10 = this.f57466c;
        b10.setValue(g0.l(b10.getValue(), lVar));
        List value3 = this.f57468e.getValue();
        ListIterator listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C8948l lVar3 = (C8948l) obj;
            if (!C17542s.e(lVar3, lVar) && this.f57468e.getValue().lastIndexOf(lVar3) < this.f57468e.getValue().lastIndexOf(lVar)) {
                break;
            }
        }
        C8948l lVar4 = (C8948l) obj;
        if (lVar4 != null) {
            C16505B<Set<C8948l>> b11 = this.f57466c;
            b11.setValue(g0.l(b11.getValue(), lVar4));
        }
        h(lVar, z10);
    }

    public void j(C8948l lVar) {
        C17542s.j(lVar, "entry");
        C16505B<Set<C8948l>> b10 = this.f57466c;
        b10.setValue(g0.l(b10.getValue(), lVar));
    }

    public void k(C8948l lVar) {
        C17542s.j(lVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f57464a;
        reentrantLock.lock();
        try {
            C16505B<List<C8948l>> b10 = this.f57465b;
            b10.setValue(C16877v.W0(b10.getValue(), lVar));
            C16807N n10 = C16807N.f139792a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void l(C8948l lVar) {
        C17542s.j(lVar, "backStackEntry");
        Iterable value = this.f57466c.getValue();
        if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
            Iterator it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C8948l) it.next()) == lVar) {
                    Iterable<C8948l> value2 = this.f57468e.getValue();
                    if (!(value2 instanceof Collection) || !((Collection) value2).isEmpty()) {
                        for (C8948l lVar2 : value2) {
                            if (lVar2 == lVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C8948l lVar3 = (C8948l) C16877v.K0(this.f57468e.getValue());
        if (lVar3 != null) {
            C16505B<Set<C8948l>> b10 = this.f57466c;
            b10.setValue(g0.l(b10.getValue(), lVar3));
        }
        C16505B<Set<C8948l>> b11 = this.f57466c;
        b11.setValue(g0.l(b11.getValue(), lVar));
        k(lVar);
    }

    public final void m(boolean z10) {
        this.f57467d = z10;
    }
}
