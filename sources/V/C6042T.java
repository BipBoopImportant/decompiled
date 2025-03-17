package v;

import B.h;
import C.C4391e0;
import C.C4417z;
import C.K0;
import C.r;
import G.c;
import H2.i;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.h1;
import androidx.lifecycle.F;
import androidx.lifecycle.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import w.B;
import w.O;
import x.C6227g;

/* renamed from: v.T  reason: case insensitive filesystem */
public final class C6042T implements I {

    /* renamed from: a  reason: collision with root package name */
    private final String f30381a;

    /* renamed from: b  reason: collision with root package name */
    private final B f30382b;

    /* renamed from: c  reason: collision with root package name */
    private final h f30383c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f30384d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private C6109u f30385e;

    /* renamed from: f  reason: collision with root package name */
    private a<Integer> f30386f = null;

    /* renamed from: g  reason: collision with root package name */
    private a<K0> f30387g = null;

    /* renamed from: h  reason: collision with root package name */
    private final a<r> f30388h;

    /* renamed from: i  reason: collision with root package name */
    private List<Pair<C5040p, Executor>> f30389i = null;

    /* renamed from: j  reason: collision with root package name */
    private final R0 f30390j;

    /* renamed from: k  reason: collision with root package name */
    private final C5029j0 f30391k;

    /* renamed from: l  reason: collision with root package name */
    private final O f30392l;

    /* renamed from: v.T$a */
    static class a<T> extends androidx.lifecycle.I<T> {

        /* renamed from: d  reason: collision with root package name */
        private F<T> f30393d;

        /* renamed from: e  reason: collision with root package name */
        private final T f30394e;

        a(T t10) {
            this.f30394e = t10;
        }

        public <S> void b(F<S> f10, L<? super S> l10) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: package-private */
        public void d(F<T> f10) {
            F<T> f11 = this.f30393d;
            if (f11 != null) {
                super.c(f11);
            }
            this.f30393d = f10;
            super.b(f10, new C6041S(this));
        }

        public T getValue() {
            F<T> f10 = this.f30393d;
            return f10 == null ? this.f30394e : f10.getValue();
        }
    }

    public C6042T(String str, O o10) {
        String str2 = (String) i.g(str);
        this.f30381a = str2;
        this.f30392l = o10;
        B c10 = o10.c(str2);
        this.f30382b = c10;
        this.f30383c = new h(this);
        R0 a10 = androidx.camera.camera2.internal.compat.quirk.a.a(str, c10);
        this.f30390j = a10;
        this.f30391k = new C6028G0(str, a10);
        this.f30388h = new a<>(r.a(r.b.CLOSED));
    }

    private void w() {
        x();
    }

    private void x() {
        String str;
        int u10 = u();
        if (u10 == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (u10 == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (u10 == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (u10 == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (u10 != 4) {
            str = "Unknown value: " + u10;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        C4391e0.e("Camera2CameraInfo", "Device Level: " + str);
    }

    public Set<C4417z> b() {
        return C6227g.a(this.f30382b).c();
    }

    public int c() {
        return o(0);
    }

    public String d() {
        return this.f30381a;
    }

    public void e(Executor executor, C5040p pVar) {
        synchronized (this.f30384d) {
            try {
                C6109u uVar = this.f30385e;
                if (uVar == null) {
                    if (this.f30389i == null) {
                        this.f30389i = new ArrayList();
                    }
                    this.f30389i.add(new Pair(pVar, executor));
                    return;
                }
                uVar.B(executor, pVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int f() {
        Integer num = (Integer) this.f30382b.a(CameraCharacteristics.LENS_FACING);
        i.b(num != null, "Unable to get the lens facing of the camera.");
        return B1.a(num.intValue());
    }

    public List<Size> g(int i10) {
        Size[] a10 = this.f30382b.b().a(i10);
        return a10 != null ? Arrays.asList(a10) : Collections.emptyList();
    }

    public R0 h() {
        return this.f30390j;
    }

    public List<Size> i(int i10) {
        Size[] c10 = this.f30382b.b().c(i10);
        return c10 != null ? Arrays.asList(c10) : Collections.emptyList();
    }

    public void j(C5040p pVar) {
        synchronized (this.f30384d) {
            try {
                C6109u uVar = this.f30385e;
                if (uVar == null) {
                    List<Pair<C5040p, Executor>> list = this.f30389i;
                    if (list != null) {
                        Iterator<Pair<C5040p, Executor>> it = list.iterator();
                        while (it.hasNext()) {
                            if (it.next().first == pVar) {
                                it.remove();
                            }
                        }
                        return;
                    }
                    return;
                }
                uVar.n0(pVar);
            } finally {
            }
        }
    }

    public boolean k() {
        int[] iArr = (int[]) this.f30382b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public F<Integer> l() {
        synchronized (this.f30384d) {
            try {
                C6109u uVar = this.f30385e;
                if (uVar == null) {
                    if (this.f30386f == null) {
                        this.f30386f = new a<>(0);
                    }
                    a<Integer> aVar = this.f30386f;
                    return aVar;
                }
                a<Integer> aVar2 = this.f30386f;
                if (aVar2 != null) {
                    return aVar2;
                }
                F<Integer> f10 = uVar.S().f();
                return f10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h1 m() {
        Integer num = (Integer) this.f30382b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        i.g(num);
        return num.intValue() != 1 ? h1.UPTIME : h1.REALTIME;
    }

    public String n() {
        return u() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    public int o(int i10) {
        int t10 = t();
        int b10 = c.b(i10);
        boolean z10 = true;
        if (1 != f()) {
            z10 = false;
        }
        return c.a(b10, t10, z10);
    }

    public C5029j0 p() {
        return this.f30391k;
    }

    public F<K0> q() {
        synchronized (this.f30384d) {
            try {
                C6109u uVar = this.f30385e;
                if (uVar == null) {
                    if (this.f30387g == null) {
                        this.f30387g = new a<>(o2.h(this.f30382b));
                    }
                    a<K0> aVar = this.f30387g;
                    return aVar;
                }
                a<K0> aVar2 = this.f30387g;
                if (aVar2 != null) {
                    return aVar2;
                }
                F<K0> j10 = uVar.U().j();
                return j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h r() {
        return this.f30383c;
    }

    public B s() {
        return this.f30382b;
    }

    /* access modifiers changed from: package-private */
    public int t() {
        Integer num = (Integer) this.f30382b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        i.g(num);
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public int u() {
        Integer num = (Integer) this.f30382b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        i.g(num);
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public void v(C6109u uVar) {
        synchronized (this.f30384d) {
            try {
                this.f30385e = uVar;
                a<K0> aVar = this.f30387g;
                if (aVar != null) {
                    aVar.d(uVar.U().j());
                }
                a<Integer> aVar2 = this.f30386f;
                if (aVar2 != null) {
                    aVar2.d(this.f30385e.S().f());
                }
                List<Pair<C5040p, Executor>> list = this.f30389i;
                if (list != null) {
                    for (Pair next : list) {
                        this.f30385e.B((Executor) next.second, (C5040p) next.first);
                    }
                    this.f30389i = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        w();
    }

    /* access modifiers changed from: package-private */
    public void y(F<r> f10) {
        this.f30388h.d(f10);
    }
}
