package G3;

import A3.v1;
import C3.t;
import G3.C6479C;
import G3.J;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t3.C5950a;
import w3.C;

/* renamed from: G3.a  reason: case insensitive filesystem */
public abstract class C6481a implements C6479C {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<C6479C.c> f35821a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<C6479C.c> f35822b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    private final J.a f35823c = new J.a();

    /* renamed from: d  reason: collision with root package name */
    private final t.a f35824d = new t.a();

    /* renamed from: e  reason: collision with root package name */
    private Looper f35825e;

    /* renamed from: f  reason: collision with root package name */
    private q3.J f35826f;

    /* renamed from: g  reason: collision with root package name */
    private v1 f35827g;

    /* access modifiers changed from: protected */
    public abstract void A();

    public final void b(C6479C.c cVar) {
        this.f35821a.remove(cVar);
        if (this.f35821a.isEmpty()) {
            this.f35825e = null;
            this.f35826f = null;
            this.f35827g = null;
            this.f35822b.clear();
            A();
            return;
        }
        d(cVar);
    }

    public final void c(t tVar) {
        this.f35824d.t(tVar);
    }

    public final void d(C6479C.c cVar) {
        boolean isEmpty = this.f35822b.isEmpty();
        this.f35822b.remove(cVar);
        if (!isEmpty && this.f35822b.isEmpty()) {
            u();
        }
    }

    public final void f(C6479C.c cVar, C c10, v1 v1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f35825e;
        C5950a.a(looper == null || looper == myLooper);
        this.f35827g = v1Var;
        q3.J j10 = this.f35826f;
        this.f35821a.add(cVar);
        if (this.f35825e == null) {
            this.f35825e = myLooper;
            this.f35822b.add(cVar);
            y(c10);
        } else if (j10 != null) {
            p(cVar);
            cVar.a(this, j10);
        }
    }

    public final void g(Handler handler, J j10) {
        C5950a.e(handler);
        C5950a.e(j10);
        this.f35823c.g(handler, j10);
    }

    public final void h(J j10) {
        this.f35823c.y(j10);
    }

    public final void n(Handler handler, t tVar) {
        C5950a.e(handler);
        C5950a.e(tVar);
        this.f35824d.g(handler, tVar);
    }

    public final void p(C6479C.c cVar) {
        C5950a.e(this.f35825e);
        boolean isEmpty = this.f35822b.isEmpty();
        this.f35822b.add(cVar);
        if (isEmpty) {
            v();
        }
    }

    /* access modifiers changed from: protected */
    public final t.a q(int i10, C6479C.b bVar) {
        return this.f35824d.u(i10, bVar);
    }

    /* access modifiers changed from: protected */
    public final t.a r(C6479C.b bVar) {
        return this.f35824d.u(0, bVar);
    }

    /* access modifiers changed from: protected */
    public final J.a s(int i10, C6479C.b bVar) {
        return this.f35823c.z(i10, bVar);
    }

    /* access modifiers changed from: protected */
    public final J.a t(C6479C.b bVar) {
        return this.f35823c.z(0, bVar);
    }

    /* access modifiers changed from: protected */
    public void u() {
    }

    /* access modifiers changed from: protected */
    public void v() {
    }

    /* access modifiers changed from: protected */
    public final v1 w() {
        return (v1) C5950a.i(this.f35827g);
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return !this.f35822b.isEmpty();
    }

    /* access modifiers changed from: protected */
    public abstract void y(C c10);

    /* access modifiers changed from: protected */
    public final void z(q3.J j10) {
        this.f35826f = j10;
        Iterator<C6479C.c> it = this.f35821a.iterator();
        while (it.hasNext()) {
            it.next().a(this, j10);
        }
    }
}
