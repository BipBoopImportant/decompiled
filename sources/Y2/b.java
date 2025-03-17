package Y2;

import I2.C4600b0;
import Y2.a;
import Y2.b;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;

public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: m  reason: collision with root package name */
    public static final s f14843m = new g("translationX");

    /* renamed from: n  reason: collision with root package name */
    public static final s f14844n = new h("translationY");

    /* renamed from: o  reason: collision with root package name */
    public static final s f14845o = new i("translationZ");

    /* renamed from: p  reason: collision with root package name */
    public static final s f14846p = new j("scaleX");

    /* renamed from: q  reason: collision with root package name */
    public static final s f14847q = new k("scaleY");

    /* renamed from: r  reason: collision with root package name */
    public static final s f14848r = new l("rotation");

    /* renamed from: s  reason: collision with root package name */
    public static final s f14849s = new m("rotationX");

    /* renamed from: t  reason: collision with root package name */
    public static final s f14850t = new n("rotationY");

    /* renamed from: u  reason: collision with root package name */
    public static final s f14851u = new o("x");

    /* renamed from: v  reason: collision with root package name */
    public static final s f14852v = new a("y");

    /* renamed from: w  reason: collision with root package name */
    public static final s f14853w = new C0217b("z");

    /* renamed from: x  reason: collision with root package name */
    public static final s f14854x = new c("alpha");

    /* renamed from: y  reason: collision with root package name */
    public static final s f14855y = new d("scrollX");

    /* renamed from: z  reason: collision with root package name */
    public static final s f14856z = new e("scrollY");

    /* renamed from: a  reason: collision with root package name */
    float f14857a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    float f14858b = Float.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    boolean f14859c = false;

    /* renamed from: d  reason: collision with root package name */
    final Object f14860d = null;

    /* renamed from: e  reason: collision with root package name */
    final c f14861e;

    /* renamed from: f  reason: collision with root package name */
    boolean f14862f = false;

    /* renamed from: g  reason: collision with root package name */
    float f14863g = Float.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    float f14864h = (-Float.MAX_VALUE);

    /* renamed from: i  reason: collision with root package name */
    private long f14865i = 0;

    /* renamed from: j  reason: collision with root package name */
    private float f14866j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<q> f14867k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<r> f14868l = new ArrayList<>();

    static class a extends s {
        a(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getY();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* renamed from: Y2.b$b  reason: collision with other inner class name */
    static class C0217b extends s {
        C0217b(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return C4600b0.M(view);
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            C4600b0.N0(view, f10);
        }
    }

    static class c extends s {
        c(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getAlpha();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    static class d extends s {
        d(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return (float) view.getScrollX();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    static class e extends s {
        e(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return (float) view.getScrollY();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    class f extends c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f14869b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, d dVar) {
            super(str);
            this.f14869b = dVar;
        }

        public float a(Object obj) {
            return this.f14869b.a();
        }

        public void b(Object obj, float f10) {
            this.f14869b.b(f10);
        }
    }

    static class g extends s {
        g(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getTranslationX();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    static class h extends s {
        h(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getTranslationY();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    static class i extends s {
        i(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return C4600b0.J(view);
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            C4600b0.L0(view, f10);
        }
    }

    static class j extends s {
        j(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getScaleX();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    static class k extends s {
        k(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getScaleY();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    static class l extends s {
        l(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getRotation();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    static class m extends s {
        m(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getRotationX();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    static class n extends s {
        n(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getRotationY();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    static class o extends s {
        o(String str) {
            super(str, (g) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getX();
        }

        /* renamed from: d */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    static class p {

        /* renamed from: a  reason: collision with root package name */
        float f14871a;

        /* renamed from: b  reason: collision with root package name */
        float f14872b;

        p() {
        }
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void a(b bVar, float f10, float f11);
    }

    public static abstract class s extends c<View> {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    b(d dVar) {
        this.f14861e = new f("FloatValueHolder", dVar);
        this.f14866j = 1.0f;
    }

    private void d(boolean z10) {
        this.f14862f = false;
        a.d().g(this);
        this.f14865i = 0;
        this.f14859c = false;
        for (int i10 = 0; i10 < this.f14867k.size(); i10++) {
            if (this.f14867k.get(i10) != null) {
                this.f14867k.get(i10).a(this, z10, this.f14858b, this.f14857a);
            }
        }
        h(this.f14867k);
    }

    private float e() {
        return this.f14861e.a(this.f14860d);
    }

    private static <T> void h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void q() {
        if (!this.f14862f) {
            this.f14862f = true;
            if (!this.f14859c) {
                this.f14858b = e();
            }
            float f10 = this.f14858b;
            if (f10 > this.f14863g || f10 < this.f14864h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            a.d().a(this, 0);
        }
    }

    public boolean a(long j10) {
        long j11 = this.f14865i;
        if (j11 == 0) {
            this.f14865i = j10;
            l(this.f14858b);
            return false;
        }
        this.f14865i = j10;
        boolean r10 = r(j10 - j11);
        float min = Math.min(this.f14858b, this.f14863g);
        this.f14858b = min;
        float max = Math.max(min, this.f14864h);
        this.f14858b = max;
        l(max);
        if (r10) {
            d(false);
        }
        return r10;
    }

    public T b(q qVar) {
        if (!this.f14867k.contains(qVar)) {
            this.f14867k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (!g()) {
            if (!this.f14868l.contains(rVar)) {
                this.f14868l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f14866j * 0.75f;
    }

    public boolean g() {
        return this.f14862f;
    }

    public T i(float f10) {
        this.f14863g = f10;
        return this;
    }

    public T j(float f10) {
        this.f14864h = f10;
        return this;
    }

    public T k(float f10) {
        if (f10 > 0.0f) {
            this.f14866j = f10;
            o(f10 * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    /* access modifiers changed from: package-private */
    public void l(float f10) {
        this.f14861e.b(this.f14860d, f10);
        for (int i10 = 0; i10 < this.f14868l.size(); i10++) {
            if (this.f14868l.get(i10) != null) {
                this.f14868l.get(i10).a(this, this.f14858b, this.f14857a);
            }
        }
        h(this.f14868l);
    }

    public T m(float f10) {
        this.f14858b = f10;
        this.f14859c = true;
        return this;
    }

    public T n(float f10) {
        this.f14857a = f10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public abstract void o(float f10);

    public void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f14862f) {
            q();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean r(long j10);
}
