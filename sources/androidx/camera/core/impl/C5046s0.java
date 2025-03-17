package androidx.camera.core.impl;

import C.C4382a;
import R.c;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.X;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.core.impl.s0  reason: case insensitive filesystem */
public interface C5046s0 extends S0 {

    /* renamed from: n  reason: collision with root package name */
    public static final X.a<Integer> f17010n = X.a.a("camerax.core.imageOutput.targetAspectRatio", C4382a.class);

    /* renamed from: o  reason: collision with root package name */
    public static final X.a<Integer> f17011o;

    /* renamed from: p  reason: collision with root package name */
    public static final X.a<Integer> f17012p;

    /* renamed from: q  reason: collision with root package name */
    public static final X.a<Integer> f17013q;

    /* renamed from: r  reason: collision with root package name */
    public static final X.a<Size> f17014r;

    /* renamed from: s  reason: collision with root package name */
    public static final X.a<Size> f17015s;

    /* renamed from: t  reason: collision with root package name */
    public static final X.a<Size> f17016t;

    /* renamed from: u  reason: collision with root package name */
    public static final X.a<List<Pair<Integer, Size[]>>> f17017u;

    /* renamed from: v  reason: collision with root package name */
    public static final X.a<c> f17018v = X.a.a("camerax.core.imageOutput.resolutionSelector", c.class);

    /* renamed from: w  reason: collision with root package name */
    public static final X.a<List<Size>> f17019w;

    /* renamed from: androidx.camera.core.impl.s0$a */
    public interface a<B> {
        B b(int i10);

        B c(c cVar);

        B d(Size size);
    }

    static {
        Class cls = Integer.TYPE;
        f17011o = X.a.a("camerax.core.imageOutput.targetRotation", cls);
        f17012p = X.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f17013q = X.a.a("camerax.core.imageOutput.mirrorMode", cls);
        Class<Size> cls2 = Size.class;
        f17014r = X.a.a("camerax.core.imageOutput.targetResolution", cls2);
        f17015s = X.a.a("camerax.core.imageOutput.defaultResolution", cls2);
        f17016t = X.a.a("camerax.core.imageOutput.maxResolution", cls2);
        Class<List> cls3 = List.class;
        f17017u = X.a.a("camerax.core.imageOutput.supportedResolutions", cls3);
        f17019w = X.a.a("camerax.core.imageOutput.customOrderedResolutions", cls3);
    }

    static void v(C5046s0 s0Var) {
        boolean y10 = s0Var.y();
        boolean z10 = s0Var.N((Size) null) != null;
        if (y10 && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (s0Var.C((c) null) == null) {
        } else {
            if (y10 || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    int B() {
        return ((Integer) a(f17010n)).intValue();
    }

    c C(c cVar) {
        return (c) g(f17018v, cVar);
    }

    int E(int i10) {
        return ((Integer) g(f17011o, Integer.valueOf(i10))).intValue();
    }

    List<Size> H(List<Size> list) {
        List list2 = (List) g(f17019w, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    Size J(Size size) {
        return (Size) g(f17015s, size);
    }

    Size N(Size size) {
        return (Size) g(f17014r, size);
    }

    int V(int i10) {
        return ((Integer) g(f17013q, Integer.valueOf(i10))).intValue();
    }

    Size i(Size size) {
        return (Size) g(f17016t, size);
    }

    List<Pair<Integer, Size[]>> k(List<Pair<Integer, Size[]>> list) {
        return (List) g(f17017u, list);
    }

    c l() {
        return (c) a(f17018v);
    }

    int s(int i10) {
        return ((Integer) g(f17012p, Integer.valueOf(i10))).intValue();
    }

    boolean y() {
        return b(f17010n);
    }
}
