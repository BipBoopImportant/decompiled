package V7;

import U7.d;
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

@Deprecated
public abstract class j<T extends View, Z> extends a<Z> {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f40471f;

    /* renamed from: g  reason: collision with root package name */
    private static int f40472g = h.f46507a;

    /* renamed from: a  reason: collision with root package name */
    protected final T f40473a;

    /* renamed from: b  reason: collision with root package name */
    private final a f40474b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnAttachStateChangeListener f40475c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f40476d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40477e;

    static final class a {

        /* renamed from: e  reason: collision with root package name */
        static Integer f40478e;

        /* renamed from: a  reason: collision with root package name */
        private final View f40479a;

        /* renamed from: b  reason: collision with root package name */
        private final List<h> f40480b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        boolean f40481c;

        /* renamed from: d  reason: collision with root package name */
        private C0667a f40482d;

        /* renamed from: V7.j$a$a  reason: collision with other inner class name */
        private static final class C0667a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f40483a;

            C0667a(a aVar) {
                this.f40483a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f40483a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f40479a = view;
        }

        private static int c(Context context) {
            if (f40478e == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f40478e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f40478e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f40481c && this.f40479a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f40479a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f40479a.getContext());
        }

        private int f() {
            int paddingTop = this.f40479a.getPaddingTop() + this.f40479a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f40479a.getLayoutParams();
            return e(this.f40479a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f40479a.getPaddingLeft() + this.f40479a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f40479a.getLayoutParams();
            return e(this.f40479a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f40480b).iterator();
            while (it.hasNext()) {
                ((h) it.next()).e(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.f40480b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f40479a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f40482d);
            }
            this.f40482d = null;
            this.f40480b.clear();
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                hVar.e(g10, f10);
                return;
            }
            if (!this.f40480b.contains(hVar)) {
                this.f40480b.add(hVar);
            }
            if (this.f40482d == null) {
                ViewTreeObserver viewTreeObserver = this.f40479a.getViewTreeObserver();
                C0667a aVar = new C0667a(this);
                this.f40482d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(h hVar) {
            this.f40480b.remove(hVar);
        }
    }

    public j(T t10) {
        this.f40473a = (View) k.d(t10);
        this.f40474b = new a(t10);
    }

    private Object n() {
        return this.f40473a.getTag(f40472g);
    }

    private void o() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f40475c;
        if (onAttachStateChangeListener != null && !this.f40477e) {
            this.f40473a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f40477e = true;
        }
    }

    private void p() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f40475c;
        if (onAttachStateChangeListener != null && this.f40477e) {
            this.f40473a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f40477e = false;
        }
    }

    private void q(Object obj) {
        f40471f = true;
        this.f40473a.setTag(f40472g, obj);
    }

    public d b() {
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        if (n10 instanceof d) {
            return (d) n10;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void c(h hVar) {
        this.f40474b.k(hVar);
    }

    public void e(Drawable drawable) {
        super.e(drawable);
        o();
    }

    public void f(Drawable drawable) {
        super.f(drawable);
        this.f40474b.b();
        if (!this.f40476d) {
            p();
        }
    }

    public void h(h hVar) {
        this.f40474b.d(hVar);
    }

    public void i(d dVar) {
        q(dVar);
    }

    public String toString() {
        return "Target for: " + this.f40473a;
    }
}
