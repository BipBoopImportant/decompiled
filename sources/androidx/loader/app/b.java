package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.loader.app.a;
import j0.c0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import o3.b;

class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f22348c = false;

    /* renamed from: a  reason: collision with root package name */
    private final C5221y f22349a;

    /* renamed from: b  reason: collision with root package name */
    private final c f22350b;

    public static class a<D> extends K<D> implements b.a<D> {

        /* renamed from: c  reason: collision with root package name */
        private final int f22351c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f22352d;

        /* renamed from: e  reason: collision with root package name */
        private final o3.b<D> f22353e;

        /* renamed from: f  reason: collision with root package name */
        private C5221y f22354f;

        /* renamed from: g  reason: collision with root package name */
        private C0351b<D> f22355g;

        /* renamed from: h  reason: collision with root package name */
        private o3.b<D> f22356h;

        a(int i10, Bundle bundle, o3.b<D> bVar, o3.b<D> bVar2) {
            this.f22351c = i10;
            this.f22352d = bundle;
            this.f22353e = bVar;
            this.f22356h = bVar2;
            bVar.r(i10, this);
        }

        public void a(o3.b<D> bVar, D d10) {
            if (b.f22348c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d10);
                return;
            }
            if (b.f22348c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d10);
        }

        /* access modifiers changed from: package-private */
        public o3.b<D> b(boolean z10) {
            if (b.f22348c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f22353e.b();
            this.f22353e.a();
            C0351b<D> bVar = this.f22355g;
            if (bVar != null) {
                removeObserver(bVar);
                if (z10) {
                    bVar.c();
                }
            }
            this.f22353e.w(this);
            if ((bVar == null || bVar.b()) && !z10) {
                return this.f22353e;
            }
            this.f22353e.s();
            return this.f22356h;
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f22351c);
            printWriter.print(" mArgs=");
            printWriter.println(this.f22352d);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f22353e);
            o3.b<D> bVar = this.f22353e;
            bVar.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f22355g != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f22355g);
                C0351b<D> bVar2 = this.f22355g;
                bVar2.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(d().d(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        /* access modifiers changed from: package-private */
        public o3.b<D> d() {
            return this.f22353e;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            C5221y yVar = this.f22354f;
            C0351b<D> bVar = this.f22355g;
            if (yVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(yVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        public o3.b<D> f(C5221y yVar, a.C0350a<D> aVar) {
            C0351b<D> bVar = new C0351b<>(this.f22353e, aVar);
            observe(yVar, bVar);
            C0351b<D> bVar2 = this.f22355g;
            if (bVar2 != null) {
                removeObserver(bVar2);
            }
            this.f22354f = yVar;
            this.f22355g = bVar;
            return this.f22353e;
        }

        /* access modifiers changed from: protected */
        public void onActive() {
            if (b.f22348c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f22353e.u();
        }

        /* access modifiers changed from: protected */
        public void onInactive() {
            if (b.f22348c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f22353e.v();
        }

        public void removeObserver(L<? super D> l10) {
            super.removeObserver(l10);
            this.f22354f = null;
            this.f22355g = null;
        }

        public void setValue(D d10) {
            super.setValue(d10);
            o3.b<D> bVar = this.f22356h;
            if (bVar != null) {
                bVar.s();
                this.f22356h = null;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f22351c);
            sb2.append(" : ");
            Class<?> cls = this.f22353e.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    static class C0351b<D> implements L<D> {

        /* renamed from: a  reason: collision with root package name */
        private final o3.b<D> f22357a;

        /* renamed from: b  reason: collision with root package name */
        private final a.C0350a<D> f22358b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f22359c = false;

        C0351b(o3.b<D> bVar, a.C0350a<D> aVar) {
            this.f22357a = bVar;
            this.f22358b = aVar;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f22359c);
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f22359c;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f22359c) {
                if (b.f22348c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f22357a);
                }
                this.f22358b.a(this.f22357a);
            }
        }

        public void onChanged(D d10) {
            if (b.f22348c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f22357a + ": " + this.f22357a.d(d10));
            }
            this.f22359c = true;
            this.f22358b.c(this.f22357a, d10);
        }

        public String toString() {
            return this.f22358b.toString();
        }
    }

    static class c extends f0 {

        /* renamed from: o  reason: collision with root package name */
        private static final i0.c f22360o = new a();

        /* renamed from: m  reason: collision with root package name */
        private c0<a> f22361m = new c0<>();

        /* renamed from: n  reason: collision with root package name */
        private boolean f22362n = false;

        static class a implements i0.c {
            a() {
            }

            public <T extends f0> T create(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c D(j0 j0Var) {
            return (c) new i0(j0Var, f22360o).a(c.class);
        }

        /* access modifiers changed from: package-private */
        public void C() {
            this.f22362n = false;
        }

        /* access modifiers changed from: package-private */
        public <D> a<D> E(int i10) {
            return this.f22361m.e(i10);
        }

        /* access modifiers changed from: package-private */
        public boolean F() {
            return this.f22362n;
        }

        /* access modifiers changed from: package-private */
        public void G() {
            int o10 = this.f22361m.o();
            for (int i10 = 0; i10 < o10; i10++) {
                this.f22361m.p(i10).e();
            }
        }

        /* access modifiers changed from: package-private */
        public void H(int i10, a aVar) {
            this.f22361m.l(i10, aVar);
        }

        /* access modifiers changed from: package-private */
        public void I() {
            this.f22362n = true;
        }

        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f22361m.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f22361m.o(); i10++) {
                    a p10 = this.f22361m.p(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f22361m.k(i10));
                    printWriter.print(": ");
                    printWriter.println(p10.toString());
                    p10.c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onCleared() {
            super.onCleared();
            int o10 = this.f22361m.o();
            for (int i10 = 0; i10 < o10; i10++) {
                this.f22361m.p(i10).b(true);
            }
            this.f22361m.b();
        }
    }

    b(C5221y yVar, j0 j0Var) {
        this.f22349a = yVar;
        this.f22350b = c.D(j0Var);
    }

    private <D> o3.b<D> e(int i10, Bundle bundle, a.C0350a<D> aVar, o3.b<D> bVar) {
        try {
            this.f22350b.I();
            o3.b<D> b10 = aVar.b(i10, bundle);
            if (b10 != null) {
                if (b10.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(b10.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b10);
                    }
                }
                a aVar2 = new a(i10, bundle, b10, bVar);
                if (f22348c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f22350b.H(i10, aVar2);
                this.f22350b.C();
                return aVar2.f(this.f22349a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f22350b.C();
            throw th2;
        }
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f22350b.h(str, fileDescriptor, printWriter, strArr);
    }

    public <D> o3.b<D> c(int i10, Bundle bundle, a.C0350a<D> aVar) {
        if (this.f22350b.F()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a E10 = this.f22350b.E(i10);
            if (f22348c) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (E10 == null) {
                return e(i10, bundle, aVar, (o3.b) null);
            }
            if (f22348c) {
                Log.v("LoaderManager", "  Re-using existing loader " + E10);
            }
            return E10.f(this.f22349a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public void d() {
        this.f22350b.G();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f22349a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
