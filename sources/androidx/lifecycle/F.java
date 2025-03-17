package androidx.lifecycle;

import androidx.lifecycle.r;
import java.util.Iterator;
import java.util.Map;
import o.C5647c;
import p.C5677b;

public abstract class F<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C5677b<L<? super T>, F<T>.defpackage.d> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (F.this.mDataLock) {
                obj = F.this.mPendingData;
                F.this.mPendingData = F.NOT_SET;
            }
            F.this.setValue(obj);
        }
    }

    private class b extends F<T>.defpackage.d {
        b(L<? super T> l10) {
            super(l10);
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }
    }

    class c extends F<T>.defpackage.d implements C5218v {

        /* renamed from: e  reason: collision with root package name */
        final C5221y f22143e;

        c(C5221y yVar, L<? super T> l10) {
            super(l10);
            this.f22143e = yVar;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f22143e.getLifecycle().g(this);
        }

        /* access modifiers changed from: package-private */
        public boolean d(C5221y yVar) {
            return this.f22143e == yVar;
        }

        public void e(C5221y yVar, r.a aVar) {
            r.b d10 = this.f22143e.getLifecycle().d();
            if (d10 == r.b.DESTROYED) {
                F.this.removeObserver(this.f22145a);
                return;
            }
            r.b bVar = null;
            while (bVar != d10) {
                a(f());
                bVar = d10;
                d10 = this.f22143e.getLifecycle().d();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f22143e.getLifecycle().d().b(r.b.STARTED);
        }
    }

    private abstract class d {

        /* renamed from: a  reason: collision with root package name */
        final L<? super T> f22145a;

        /* renamed from: b  reason: collision with root package name */
        boolean f22146b;

        /* renamed from: c  reason: collision with root package name */
        int f22147c = -1;

        d(L<? super T> l10) {
            this.f22145a = l10;
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z10) {
            if (z10 != this.f22146b) {
                this.f22146b = z10;
                F.this.changeActiveCounter(z10 ? 1 : -1);
                if (this.f22146b) {
                    F.this.dispatchingValue(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
        }

        /* access modifiers changed from: package-private */
        public boolean d(C5221y yVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean f();
    }

    public F(T t10) {
        this.mDataLock = new Object();
        this.mObservers = new C5677b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t10;
        this.mVersion = 0;
    }

    static void assertMainThread(String str) {
        if (!C5647c.h().c()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void considerNotify(F<T>.defpackage.d dVar) {
        if (dVar.f22146b) {
            if (!dVar.f()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f22147c;
            int i11 = this.mVersion;
            if (i10 < i11) {
                dVar.f22147c = i11;
                dVar.f22145a.onChanged(this.mData);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void changeActiveCounter(int i10) {
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (!this.mChangingActiveState) {
            this.mChangingActiveState = true;
            while (true) {
                try {
                    int i12 = this.mActiveCount;
                    if (i11 != i12) {
                        boolean z10 = i11 == 0 && i12 > 0;
                        boolean z11 = i11 > 0 && i12 == 0;
                        if (z10) {
                            onActive();
                        } else if (z11) {
                            onInactive();
                        }
                        i11 = i12;
                    } else {
                        this.mChangingActiveState = false;
                        return;
                    }
                } catch (Throwable th2) {
                    this.mChangingActiveState = false;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchingValue(F<T>.defpackage.d dVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (dVar == null) {
                C5677b<K, V>.defpackage.d j10 = this.mObservers.j();
                while (j10.hasNext()) {
                    considerNotify((d) ((Map.Entry) j10.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(dVar);
                dVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t10 = this.mData;
        if (t10 != NOT_SET) {
            return t10;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(C5221y yVar, L<? super T> l10) {
        assertMainThread("observe");
        if (yVar.getLifecycle().d() != r.b.DESTROYED) {
            c cVar = new c(yVar, l10);
            d p10 = this.mObservers.p(l10, cVar);
            if (p10 != null && !p10.d(yVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (p10 == null) {
                yVar.getLifecycle().c(cVar);
            }
        }
    }

    public void observeForever(L<? super T> l10) {
        assertMainThread("observeForever");
        b bVar = new b(l10);
        d p10 = this.mObservers.p(l10, bVar);
        if (p10 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (p10 == null) {
            bVar.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
    }

    /* access modifiers changed from: protected */
    public void postValue(T t10) {
        boolean z10;
        synchronized (this.mDataLock) {
            z10 = this.mPendingData == NOT_SET;
            this.mPendingData = t10;
        }
        if (z10) {
            C5647c.h().d(this.mPostValueRunnable);
        }
    }

    public void removeObserver(L<? super T> l10) {
        assertMainThread("removeObserver");
        d q10 = this.mObservers.q(l10);
        if (q10 != null) {
            q10.b();
            q10.a(false);
        }
    }

    public void removeObservers(C5221y yVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<L<? super T>, F<T>.defpackage.d>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((d) next.getValue()).d(yVar)) {
                removeObserver((L) next.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(T t10) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t10;
        dispatchingValue((F<T>.defpackage.d) null);
    }

    public F() {
        this.mDataLock = new Object();
        this.mObservers = new C5677b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
