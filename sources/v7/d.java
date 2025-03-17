package V7;

import Y7.k;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class d<T extends View, Z> implements i<Z> {

    /* renamed from: f  reason: collision with root package name */
    private static final int f40458f = h.f46507a;

    /* renamed from: a  reason: collision with root package name */
    private final a f40459a;

    /* renamed from: b  reason: collision with root package name */
    protected final T f40460b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnAttachStateChangeListener f40461c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f40462d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40463e;

    static final class a {

        /* renamed from: e  reason: collision with root package name */
        static Integer f40464e;

        /* renamed from: a  reason: collision with root package name */
        private final View f40465a;

        /* renamed from: b  reason: collision with root package name */
        private final List<h> f40466b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        boolean f40467c;

        /* renamed from: d  reason: collision with root package name */
        private C0666a f40468d;

        /* renamed from: V7.d$a$a  reason: collision with other inner class name */
        private static final class C0666a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f40469a;

            C0666a(a aVar) {
                this.f40469a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f40469a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f40465a = view;
        }

        private static int c(Context context) {
            if (f40464e == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f40464e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f40464e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f40467c && this.f40465a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f40465a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f40465a.getContext());
        }

        private int f() {
            int paddingTop = this.f40465a.getPaddingTop() + this.f40465a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f40465a.getLayoutParams();
            return e(this.f40465a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f40465a.getPaddingLeft() + this.f40465a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f40465a.getLayoutParams();
            return e(this.f40465a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f40466b).iterator();
            while (it.hasNext()) {
                ((h) it.next()).e(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.f40466b.isEmpty()) {
                int g10 = g();
                int f10 = f();
                if (i(g10, f10)) {
                    j(g10, f10);
                    b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            ViewTreeObserver viewTreeObserver = this.f40465a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f40468d);
            }
            this.f40468d = null;
            this.f40466b.clear();
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                hVar.e(g10, f10);
                return;
            }
            if (!this.f40466b.contains(hVar)) {
                this.f40466b.add(hVar);
            }
            if (this.f40468d == null) {
                ViewTreeObserver viewTreeObserver = this.f40465a.getViewTreeObserver();
                C0666a aVar = new C0666a(this);
                this.f40468d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(h hVar) {
            this.f40466b.remove(hVar);
        }
    }

    public d(T t10) {
        this.f40460b = (View) k.d(t10);
        this.f40459a = new a(t10);
    }

    private Object a() {
        return this.f40460b.getTag(f40458f);
    }

    private void d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f40461c;
        if (onAttachStateChangeListener != null && !this.f40463e) {
            this.f40460b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f40463e = true;
        }
    }

    private void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f40461c;
        if (onAttachStateChangeListener != null && this.f40463e) {
            this.f40460b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f40463e = false;
        }
    }

    private void q(Object obj) {
        this.f40460b.setTag(f40458f, obj);
    }

    public final U7.d b() {
        Object a10 = a();
        if (a10 == null) {
            return null;
        }
        if (a10 instanceof U7.d) {
            return (U7.d) a10;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public final void c(h hVar) {
        this.f40459a.k(hVar);
    }

    public final void e(Drawable drawable) {
        d();
        p(drawable);
    }

    public final void f(Drawable drawable) {
        this.f40459a.b();
        o(drawable);
        if (!this.f40462d) {
            n();
        }
    }

    public void g() {
    }

    public final void h(h hVar) {
        this.f40459a.d(hVar);
    }

    public final void i(U7.d dVar) {
        q(dVar);
    }

    public void k() {
    }

    public void l() {
    }

    /* access modifiers changed from: protected */
    public abstract void o(Drawable drawable);

    /* access modifiers changed from: protected */
    public void p(Drawable drawable) {
    }

    public String toString() {
        return "Target for: " + this.f40460b;
    }
}
