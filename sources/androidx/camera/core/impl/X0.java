package androidx.camera.core.impl;

import C.C4391e0;
import C.C4417z;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C5030k;
import androidx.camera.core.impl.V;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class X0 {

    /* renamed from: j  reason: collision with root package name */
    private static final List<Integer> f16804j = Arrays.asList(new Integer[]{1, 5, 3});

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f16805a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final f f16806b;

    /* renamed from: c  reason: collision with root package name */
    private final List<CameraDevice.StateCallback> f16807c;

    /* renamed from: d  reason: collision with root package name */
    private final List<CameraCaptureSession.StateCallback> f16808d;

    /* renamed from: e  reason: collision with root package name */
    private final List<C5040p> f16809e;

    /* renamed from: f  reason: collision with root package name */
    private final d f16810f;

    /* renamed from: g  reason: collision with root package name */
    private final V f16811g;

    /* renamed from: h  reason: collision with root package name */
    private final int f16812h;

    /* renamed from: i  reason: collision with root package name */
    private InputConfiguration f16813i;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Set<f> f16814a = new LinkedHashSet();

        /* renamed from: b  reason: collision with root package name */
        final V.a f16815b = new V.a();

        /* renamed from: c  reason: collision with root package name */
        final List<CameraDevice.StateCallback> f16816c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        final List<CameraCaptureSession.StateCallback> f16817d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        final List<C5040p> f16818e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        d f16819f;

        /* renamed from: g  reason: collision with root package name */
        InputConfiguration f16820g;

        /* renamed from: h  reason: collision with root package name */
        int f16821h = 0;

        /* renamed from: i  reason: collision with root package name */
        f f16822i;

        a() {
        }
    }

    public static class b extends a {
        public static b q(o1<?> o1Var, Size size) {
            e U10 = o1Var.U((e) null);
            if (U10 != null) {
                b bVar = new b();
                U10.a(size, o1Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o1Var.t(o1Var.toString()));
        }

        public b A(int i10) {
            if (i10 != 0) {
                this.f16815b.x(i10);
            }
            return this;
        }

        public b a(Collection<C5040p> collection) {
            for (C5040p next : collection) {
                this.f16815b.c(next);
                if (!this.f16818e.contains(next)) {
                    this.f16818e.add(next);
                }
            }
            return this;
        }

        public b b(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback f10 : collection) {
                f(f10);
            }
            return this;
        }

        public b c(Collection<C5040p> collection) {
            this.f16815b.a(collection);
            return this;
        }

        public b d(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback k10 : list) {
                k(k10);
            }
            return this;
        }

        public b e(C5040p pVar) {
            this.f16815b.c(pVar);
            if (!this.f16818e.contains(pVar)) {
                this.f16818e.add(pVar);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f16816c.contains(stateCallback)) {
                return this;
            }
            this.f16816c.add(stateCallback);
            return this;
        }

        public b g(X x10) {
            this.f16815b.e(x10);
            return this;
        }

        public b h(C5019e0 e0Var) {
            return i(e0Var, C4417z.f5465d);
        }

        public b i(C5019e0 e0Var, C4417z zVar) {
            this.f16814a.add(f.a(e0Var).b(zVar).a());
            return this;
        }

        public b j(C5040p pVar) {
            this.f16815b.c(pVar);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f16817d.contains(stateCallback)) {
                return this;
            }
            this.f16817d.add(stateCallback);
            return this;
        }

        public b l(C5019e0 e0Var) {
            return m(e0Var, C4417z.f5465d, (String) null, -1);
        }

        public b m(C5019e0 e0Var, C4417z zVar, String str, int i10) {
            this.f16814a.add(f.a(e0Var).d(str).b(zVar).c(i10).a());
            this.f16815b.f(e0Var);
            return this;
        }

        public b n(String str, Object obj) {
            this.f16815b.g(str, obj);
            return this;
        }

        public X0 o() {
            return new X0(new ArrayList(this.f16814a), new ArrayList(this.f16816c), new ArrayList(this.f16817d), new ArrayList(this.f16818e), this.f16815b.h(), this.f16819f, this.f16820g, this.f16821h, this.f16822i);
        }

        public b p() {
            this.f16814a.clear();
            this.f16815b.i();
            return this;
        }

        public List<C5040p> r() {
            return Collections.unmodifiableList(this.f16818e);
        }

        public boolean s(C5040p pVar) {
            return this.f16815b.o(pVar) || this.f16818e.remove(pVar);
        }

        public b t(d dVar) {
            this.f16819f = dVar;
            return this;
        }

        public b u(Range<Integer> range) {
            this.f16815b.q(range);
            return this;
        }

        public b v(X x10) {
            this.f16815b.s(x10);
            return this;
        }

        public b w(InputConfiguration inputConfiguration) {
            this.f16820g = inputConfiguration;
            return this;
        }

        public b x(C5019e0 e0Var) {
            this.f16822i = f.a(e0Var).a();
            return this;
        }

        public b y(int i10) {
            if (i10 != 0) {
                this.f16815b.u(i10);
            }
            return this;
        }

        public b z(int i10) {
            this.f16815b.v(i10);
            return this;
        }
    }

    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicBoolean f16823a = new AtomicBoolean(false);

        /* renamed from: b  reason: collision with root package name */
        private final d f16824b;

        public c(d dVar) {
            this.f16824b = dVar;
        }

        public void a(X0 x02, g gVar) {
            if (!this.f16823a.get()) {
                this.f16824b.a(x02, gVar);
            }
        }

        public void b() {
            this.f16823a.set(true);
        }
    }

    public interface d {
        void a(X0 x02, g gVar);
    }

    public interface e {
        void a(Size size, o1<?> o1Var, b bVar);
    }

    public static abstract class f {

        public static abstract class a {
            public abstract f a();

            public abstract a b(C4417z zVar);

            public abstract a c(int i10);

            public abstract a d(String str);

            public abstract a e(List<C5019e0> list);

            public abstract a f(int i10);
        }

        public static a a(C5019e0 e0Var) {
            return new C5030k.b().g(e0Var).e(Collections.emptyList()).d((String) null).c(-1).f(-1).b(C4417z.f5465d);
        }

        public abstract C4417z b();

        public abstract int c();

        public abstract String d();

        public abstract List<C5019e0> e();

        public abstract C5019e0 f();

        public abstract int g();
    }

    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class h extends a {

        /* renamed from: j  reason: collision with root package name */
        private final M.f f16825j = new M.f();

        /* renamed from: k  reason: collision with root package name */
        private boolean f16826k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f16827l = false;

        /* renamed from: m  reason: collision with root package name */
        private List<d> f16828m = new ArrayList();

        private List<C5019e0> e() {
            ArrayList arrayList = new ArrayList();
            for (f next : this.f16814a) {
                arrayList.add(next.f());
                for (C5019e0 add : next.e()) {
                    arrayList.add(add);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g(X0 x02, g gVar) {
            for (d a10 : this.f16828m) {
                a10.a(x02, gVar);
            }
        }

        private void h(Range<Integer> range) {
            Range<Integer> range2 = c1.f16864a;
            if (!range.equals(range2)) {
                if (this.f16815b.l().equals(range2)) {
                    this.f16815b.q(range);
                } else if (!this.f16815b.l().equals(range)) {
                    this.f16826k = false;
                    C4391e0.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                }
            }
        }

        private void i(int i10) {
            if (i10 != 0) {
                this.f16815b.u(i10);
            }
        }

        private void j(int i10) {
            if (i10 != 0) {
                this.f16815b.x(i10);
            }
        }

        public void b(X0 x02) {
            V k10 = x02.k();
            if (k10.k() != -1) {
                this.f16827l = true;
                this.f16815b.v(X0.e(k10.k(), this.f16815b.n()));
            }
            h(k10.e());
            i(k10.h());
            j(k10.l());
            this.f16815b.b(x02.k().j());
            this.f16816c.addAll(x02.c());
            this.f16817d.addAll(x02.l());
            this.f16815b.a(x02.j());
            this.f16818e.addAll(x02.n());
            if (x02.d() != null) {
                this.f16828m.add(x02.d());
            }
            if (x02.g() != null) {
                this.f16820g = x02.g();
            }
            this.f16814a.addAll(x02.h());
            this.f16815b.m().addAll(k10.i());
            if (!e().containsAll(this.f16815b.m())) {
                C4391e0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f16826k = false;
            }
            if (x02.m() != this.f16821h && x02.m() != 0 && this.f16821h != 0) {
                C4391e0.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f16826k = false;
            } else if (x02.m() != 0) {
                this.f16821h = x02.m();
            }
            if (x02.f16806b != null) {
                if (this.f16822i == x02.f16806b || this.f16822i == null) {
                    this.f16822i = x02.f16806b;
                } else {
                    C4391e0.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f16826k = false;
                }
            }
            this.f16815b.e(k10.g());
        }

        public X0 c() {
            if (this.f16826k) {
                ArrayList arrayList = new ArrayList(this.f16814a);
                this.f16825j.d(arrayList);
                return new X0(arrayList, new ArrayList(this.f16816c), new ArrayList(this.f16817d), new ArrayList(this.f16818e), this.f16815b.h(), !this.f16828m.isEmpty() ? new Y0(this) : null, this.f16820g, this.f16821h, this.f16822i);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        public void d() {
            this.f16814a.clear();
            this.f16815b.i();
        }

        public boolean f() {
            return this.f16827l && this.f16826k;
        }
    }

    X0(List<f> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<C5040p> list4, V v10, d dVar, InputConfiguration inputConfiguration, int i10, f fVar) {
        this.f16805a = list;
        this.f16807c = Collections.unmodifiableList(list2);
        this.f16808d = Collections.unmodifiableList(list3);
        this.f16809e = Collections.unmodifiableList(list4);
        this.f16810f = dVar;
        this.f16811g = v10;
        this.f16813i = inputConfiguration;
        this.f16812h = i10;
        this.f16806b = fVar;
    }

    public static X0 b() {
        return new X0(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new V.a().h(), (d) null, (InputConfiguration) null, 0, (f) null);
    }

    public static int e(int i10, int i11) {
        List<Integer> list = f16804j;
        return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
    }

    public List<CameraDevice.StateCallback> c() {
        return this.f16807c;
    }

    public d d() {
        return this.f16810f;
    }

    public X f() {
        return this.f16811g.g();
    }

    public InputConfiguration g() {
        return this.f16813i;
    }

    public List<f> h() {
        return this.f16805a;
    }

    public f i() {
        return this.f16806b;
    }

    public List<C5040p> j() {
        return this.f16811g.c();
    }

    public V k() {
        return this.f16811g;
    }

    public List<CameraCaptureSession.StateCallback> l() {
        return this.f16808d;
    }

    public int m() {
        return this.f16812h;
    }

    public List<C5040p> n() {
        return this.f16809e;
    }

    public List<C5019e0> o() {
        ArrayList arrayList = new ArrayList();
        for (f next : this.f16805a) {
            arrayList.add(next.f());
            for (C5019e0 add : next.e()) {
                arrayList.add(add);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int p() {
        return this.f16811g.k();
    }
}
