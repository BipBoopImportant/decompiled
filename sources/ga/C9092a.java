package Ga;

import Ea.C9068b;
import Ea.C9072f;
import Ea.C9076j;
import Ea.C9077k;
import Fa.C9081a;
import Ga.C9093b;
import I2.C4600b0;
import Ra.c;
import Ra.d;
import Ua.C9286g;
import Ua.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;

/* renamed from: Ga.a  reason: case insensitive filesystem */
public class C9092a extends Drawable implements q.b {

    /* renamed from: n  reason: collision with root package name */
    private static final int f60511n = C9077k.f59610t;

    /* renamed from: o  reason: collision with root package name */
    private static final int f60512o = C9068b.f59327d;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f60513a;

    /* renamed from: b  reason: collision with root package name */
    private final C9286g f60514b;

    /* renamed from: c  reason: collision with root package name */
    private final q f60515c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f60516d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final C9093b f60517e;

    /* renamed from: f  reason: collision with root package name */
    private float f60518f;

    /* renamed from: g  reason: collision with root package name */
    private float f60519g;

    /* renamed from: h  reason: collision with root package name */
    private int f60520h;

    /* renamed from: i  reason: collision with root package name */
    private float f60521i;

    /* renamed from: j  reason: collision with root package name */
    private float f60522j;

    /* renamed from: k  reason: collision with root package name */
    private float f60523k;

    /* renamed from: l  reason: collision with root package name */
    private WeakReference<View> f60524l;

    /* renamed from: m  reason: collision with root package name */
    private WeakReference<FrameLayout> f60525m;

    /* renamed from: Ga.a$a  reason: collision with other inner class name */
    class C0991a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f60526a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout f60527b;

        C0991a(View view, FrameLayout frameLayout) {
            this.f60526a = view;
            this.f60527b = frameLayout;
        }

        public void run() {
            C9092a.this.Q(this.f60526a, this.f60527b);
        }
    }

    private C9092a(Context context, int i10, int i11, int i12, C9093b.a aVar) {
        this.f60513a = new WeakReference<>(context);
        s.c(context);
        q qVar = new q(this);
        this.f60515c = qVar;
        qVar.g().setTextAlign(Paint.Align.CENTER);
        C9093b bVar = new C9093b(context, i10, i11, i12, aVar);
        this.f60517e = bVar;
        this.f60514b = new C9286g(k.b(context, x() ? bVar.m() : bVar.i(), x() ? bVar.l() : bVar.h()).m());
        L();
    }

    private boolean A() {
        FrameLayout i10 = i();
        return i10 != null && i10.getId() == C9072f.f59506x;
    }

    private void B() {
        this.f60515c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void C() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f60517e.e());
        if (this.f60514b.x() != valueOf) {
            this.f60514b.b0(valueOf);
            invalidateSelf();
        }
    }

    private void D() {
        this.f60515c.l(true);
        F();
        R();
        invalidateSelf();
    }

    private void E() {
        WeakReference<View> weakReference = this.f60524l;
        if (weakReference != null && weakReference.get() != null) {
            View view = this.f60524l.get();
            WeakReference<FrameLayout> weakReference2 = this.f60525m;
            Q(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    private void F() {
        Context context = this.f60513a.get();
        if (context != null) {
            this.f60514b.setShapeAppearanceModel(k.b(context, x() ? this.f60517e.m() : this.f60517e.i(), x() ? this.f60517e.l() : this.f60517e.h()).m());
            invalidateSelf();
        }
    }

    private void G() {
        d dVar;
        Context context = this.f60513a.get();
        if (context != null && this.f60515c.e() != (dVar = new d(context, this.f60517e.z()))) {
            this.f60515c.k(dVar, context);
            H();
            R();
            invalidateSelf();
        }
    }

    private void H() {
        this.f60515c.g().setColor(this.f60517e.j());
        invalidateSelf();
    }

    private void I() {
        S();
        this.f60515c.l(true);
        R();
        invalidateSelf();
    }

    private void J() {
        if (!z()) {
            D();
        }
    }

    private void K() {
        boolean F10 = this.f60517e.F();
        setVisible(F10, false);
        if (C9094c.f60570a && i() != null && !F10) {
            ((ViewGroup) i().getParent()).invalidate();
        }
    }

    private void L() {
        F();
        G();
        I();
        D();
        B();
        C();
        H();
        E();
        R();
        K();
    }

    private void O(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C9072f.f59506x) {
            WeakReference<FrameLayout> weakReference = this.f60525m;
            if (weakReference == null || weakReference.get() != viewGroup) {
                P(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C9072f.f59506x);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f60525m = new WeakReference<>(frameLayout);
                frameLayout.post(new C0991a(view, frameLayout));
            }
        }
    }

    private static void P(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void R() {
        Context context = this.f60513a.get();
        WeakReference<View> weakReference = this.f60524l;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f60516d);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f60525m;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null || C9094c.f60570a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            c(rect2, view);
            C9094c.d(this.f60516d, this.f60518f, this.f60519g, this.f60522j, this.f60523k);
            float f10 = this.f60521i;
            if (f10 != -1.0f) {
                this.f60514b.Y(f10);
            }
            if (!rect.equals(this.f60516d)) {
                this.f60514b.setBounds(this.f60516d);
            }
        }
    }

    private void S() {
        if (l() != -2) {
            this.f60520h = ((int) Math.pow(10.0d, ((double) l()) - 1.0d)) - 1;
        } else {
            this.f60520h = m();
        }
    }

    private void b(View view) {
        float f10;
        float f11;
        View i10 = i();
        if (i10 == null) {
            if (view.getParent() instanceof View) {
                float y10 = view.getY();
                f11 = view.getX();
                float f12 = y10;
                i10 = (View) view.getParent();
                f10 = f12;
            } else {
                return;
            }
        } else if (!A()) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else if (i10.getParent() instanceof View) {
            f10 = i10.getY();
            f11 = i10.getX();
            i10 = (View) i10.getParent();
        } else {
            return;
        }
        float u10 = u(i10, f10);
        float k10 = k(i10, f11);
        float g10 = g(i10, f10);
        float q10 = q(i10, f11);
        if (u10 < 0.0f) {
            this.f60519g += Math.abs(u10);
        }
        if (k10 < 0.0f) {
            this.f60518f += Math.abs(k10);
        }
        if (g10 > 0.0f) {
            this.f60519g -= Math.abs(g10);
        }
        if (q10 > 0.0f) {
            this.f60518f -= Math.abs(q10);
        }
    }

    private void c(Rect rect, View view) {
        float f10 = x() ? this.f60517e.f60532d : this.f60517e.f60531c;
        this.f60521i = f10;
        if (f10 != -1.0f) {
            this.f60522j = f10;
            this.f60523k = f10;
        } else {
            this.f60522j = (float) Math.round((x() ? this.f60517e.f60535g : this.f60517e.f60533e) / 2.0f);
            this.f60523k = (float) Math.round((x() ? this.f60517e.f60536h : this.f60517e.f60534f) / 2.0f);
        }
        if (x()) {
            String f11 = f();
            this.f60522j = Math.max(this.f60522j, (this.f60515c.h(f11) / 2.0f) + ((float) this.f60517e.g()));
            float max = Math.max(this.f60523k, (this.f60515c.f(f11) / 2.0f) + ((float) this.f60517e.k()));
            this.f60523k = max;
            this.f60522j = Math.max(this.f60522j, max);
        }
        int w10 = w();
        int f12 = this.f60517e.f();
        if (f12 == 8388691 || f12 == 8388693) {
            this.f60519g = (float) (rect.bottom - w10);
        } else {
            this.f60519g = (float) (rect.top + w10);
        }
        int v10 = v();
        int f13 = this.f60517e.f();
        if (f13 == 8388659 || f13 == 8388691) {
            this.f60518f = C4600b0.z(view) == 0 ? (((float) rect.left) - this.f60522j) + ((float) v10) : (((float) rect.right) + this.f60522j) - ((float) v10);
        } else {
            this.f60518f = C4600b0.z(view) == 0 ? (((float) rect.right) + this.f60522j) - ((float) v10) : (((float) rect.left) - this.f60522j) + ((float) v10);
        }
        if (this.f60517e.E()) {
            b(view);
        }
    }

    public static C9092a d(Context context) {
        return new C9092a(context, 0, f60512o, f60511n, (C9093b.a) null);
    }

    private void e(Canvas canvas) {
        String f10 = f();
        if (f10 != null) {
            Rect rect = new Rect();
            this.f60515c.g().getTextBounds(f10, 0, f10.length(), rect);
            float exactCenterY = this.f60519g - rect.exactCenterY();
            canvas.drawText(f10, this.f60518f, (float) (rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY)), this.f60515c.g());
        }
    }

    private String f() {
        if (z()) {
            return s();
        }
        if (y()) {
            return o();
        }
        return null;
    }

    private float g(View view, float f10) {
        if (view.getParent() instanceof View) {
            return ((this.f60519g + this.f60523k) - (((float) ((View) view.getParent()).getHeight()) - view.getY())) + f10;
        }
        return 0.0f;
    }

    private CharSequence j() {
        return this.f60517e.p();
    }

    private float k(View view, float f10) {
        return (this.f60518f - this.f60522j) + view.getX() + f10;
    }

    private String o() {
        if (this.f60520h == -2 || n() <= this.f60520h) {
            return NumberFormat.getInstance(this.f60517e.x()).format((long) n());
        }
        Context context = this.f60513a.get();
        return context == null ? "" : String.format(this.f60517e.x(), context.getString(C9076j.f59573p), new Object[]{Integer.valueOf(this.f60520h), Marker.ANY_NON_NULL_MARKER});
    }

    private String p() {
        Context context;
        if (this.f60517e.q() == 0 || (context = this.f60513a.get()) == null) {
            return null;
        }
        return (this.f60520h == -2 || n() <= this.f60520h) ? context.getResources().getQuantityString(this.f60517e.q(), n(), new Object[]{Integer.valueOf(n())}) : context.getString(this.f60517e.n(), new Object[]{Integer.valueOf(this.f60520h)});
    }

    private float q(View view, float f10) {
        if (view.getParent() instanceof View) {
            return ((this.f60518f + this.f60522j) - (((float) ((View) view.getParent()).getWidth()) - view.getX())) + f10;
        }
        return 0.0f;
    }

    private String s() {
        String r10 = r();
        int l10 = l();
        if (l10 == -2 || r10 == null || r10.length() <= l10) {
            return r10;
        }
        Context context = this.f60513a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(C9076j.f59566i), new Object[]{r10.substring(0, l10 - 1), "…"});
    }

    private CharSequence t() {
        CharSequence o10 = this.f60517e.o();
        return o10 != null ? o10 : r();
    }

    private float u(View view, float f10) {
        return (this.f60519g - this.f60523k) + view.getY() + f10;
    }

    private int v() {
        int r10 = x() ? this.f60517e.r() : this.f60517e.s();
        if (this.f60517e.f60539k == 1) {
            r10 += x() ? this.f60517e.f60538j : this.f60517e.f60537i;
        }
        return r10 + this.f60517e.b();
    }

    private int w() {
        int B10 = this.f60517e.B();
        if (x()) {
            B10 = this.f60517e.A();
            Context context = this.f60513a.get();
            if (context != null) {
                B10 = C9081a.c(B10, B10 - this.f60517e.t(), C9081a.b(0.0f, 1.0f, 0.3f, 1.0f, c.e(context) - 1.0f));
            }
        }
        if (this.f60517e.f60539k == 0) {
            B10 -= Math.round(this.f60523k);
        }
        return B10 + this.f60517e.c();
    }

    private boolean x() {
        return z() || y();
    }

    public void M(int i10) {
        int max = Math.max(0, i10);
        if (this.f60517e.w() != max) {
            this.f60517e.I(max);
            J();
        }
    }

    public void N(boolean z10) {
        this.f60517e.J(z10);
        K();
    }

    public void Q(View view, FrameLayout frameLayout) {
        this.f60524l = new WeakReference<>(view);
        boolean z10 = C9094c.f60570a;
        if (!z10 || frameLayout != null) {
            this.f60525m = new WeakReference<>(frameLayout);
        } else {
            O(view);
        }
        if (!z10) {
            P(view);
        }
        R();
        invalidateSelf();
    }

    public void a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f60514b.draw(canvas);
            if (x()) {
                e(canvas);
            }
        }
    }

    public int getAlpha() {
        return this.f60517e.d();
    }

    public int getIntrinsicHeight() {
        return this.f60516d.height();
    }

    public int getIntrinsicWidth() {
        return this.f60516d.width();
    }

    public int getOpacity() {
        return -3;
    }

    public CharSequence h() {
        if (!isVisible()) {
            return null;
        }
        return z() ? t() : y() ? p() : j();
    }

    public FrameLayout i() {
        WeakReference<FrameLayout> weakReference = this.f60525m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean isStateful() {
        return false;
    }

    public int l() {
        return this.f60517e.u();
    }

    public int m() {
        return this.f60517e.v();
    }

    public int n() {
        if (this.f60517e.C()) {
            return this.f60517e.w();
        }
        return 0;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public String r() {
        return this.f60517e.y();
    }

    public void setAlpha(int i10) {
        this.f60517e.H(i10);
        B();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean y() {
        return !this.f60517e.D() && this.f60517e.C();
    }

    public boolean z() {
        return this.f60517e.D();
    }
}
