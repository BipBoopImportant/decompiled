package P2;

import I2.C4597a;
import I2.C4600b0;
import J2.t;
import J2.u;
import J2.v;
import P2.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.ar.core.ImageMetadata;
import d9.M;
import j0.c0;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends C4597a {

    /* renamed from: n  reason: collision with root package name */
    private static final Rect f11847n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    private static final b.a<t> f11848o = new C0177a();

    /* renamed from: p  reason: collision with root package name */
    private static final b.C0178b<c0<t>, t> f11849p = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f11850d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f11851e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f11852f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f11853g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f11854h;

    /* renamed from: i  reason: collision with root package name */
    private final View f11855i;

    /* renamed from: j  reason: collision with root package name */
    private c f11856j;

    /* renamed from: k  reason: collision with root package name */
    int f11857k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    int f11858l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private int f11859m = Integer.MIN_VALUE;

    /* renamed from: P2.a$a  reason: collision with other inner class name */
    class C0177a implements b.a<t> {
        C0177a() {
        }

        /* renamed from: b */
        public void a(t tVar, Rect rect) {
            tVar.k(rect);
        }
    }

    class b implements b.C0178b<c0<t>, t> {
        b() {
        }

        /* renamed from: c */
        public t a(c0<t> c0Var, int i10) {
            return c0Var.p(i10);
        }

        /* renamed from: d */
        public int b(c0<t> c0Var) {
            return c0Var.o();
        }
    }

    private class c extends u {
        c() {
        }

        public t b(int i10) {
            return t.W(a.this.H(i10));
        }

        public t d(int i10) {
            int i11 = i10 == 2 ? a.this.f11857k : a.this.f11858l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f11855i = view;
            this.f11854h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C4600b0.x(view) == 0) {
                C4600b0.z0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f11855i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f11855i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i10, Rect rect) {
        t tVar;
        c0<t> y10 = y();
        int i11 = this.f11858l;
        int i12 = Integer.MIN_VALUE;
        t e10 = i11 == Integer.MIN_VALUE ? null : y10.e(i11);
        if (i10 == 1 || i10 == 2) {
            tVar = (t) b.d(y10, f11849p, f11848o, e10, i10, C4600b0.z(this.f11855i) == 1, false);
        } else if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
            Rect rect2 = new Rect();
            int i13 = this.f11858l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f11855i, i10, rect2);
            }
            tVar = (t) b.c(y10, f11849p, f11848o, e10, rect2, i10);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (tVar != null) {
            i12 = y10.k(y10.j(tVar));
        }
        return T(i12);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return C4600b0.d0(this.f11855i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f11854h.isEnabled() || !this.f11854h.isTouchExplorationEnabled() || (i11 = this.f11857k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f11857k = i10;
        this.f11855i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f11859m;
        if (i11 != i10) {
            this.f11859m = i10;
            U(i10, 128);
            U(i11, 256);
        }
    }

    private boolean n(int i10) {
        if (this.f11857k != i10) {
            return false;
        }
        this.f11857k = Integer.MIN_VALUE;
        this.f11855i.invalidate();
        U(i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        return true;
    }

    private boolean p() {
        int i10 = this.f11858l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, (Bundle) null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        t H10 = H(i10);
        obtain.getText().add(H10.y());
        obtain.setContentDescription(H10.r());
        obtain.setScrollable(H10.Q());
        obtain.setPassword(H10.P());
        obtain.setEnabled(H10.J());
        obtain.setChecked(H10.G());
        L(i10, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H10.o());
            v.c(obtain, this.f11855i, i10);
            obtain.setPackageName(this.f11855i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f11855i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private t t(int i10) {
        t V10 = t.V();
        V10.q0(true);
        V10.s0(true);
        V10.i0("android.view.View");
        Rect rect = f11847n;
        V10.e0(rect);
        V10.f0(rect);
        V10.F0(this.f11855i);
        N(i10, V10);
        if (V10.y() == null && V10.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        V10.k(this.f11851e);
        if (!this.f11851e.equals(rect)) {
            int i11 = V10.i();
            if ((i11 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((i11 & 128) == 0) {
                V10.D0(this.f11855i.getContext().getPackageName());
                V10.P0(this.f11855i, i10);
                if (this.f11857k == i10) {
                    V10.b0(true);
                    V10.a(128);
                } else {
                    V10.b0(false);
                    V10.a(64);
                }
                boolean z10 = this.f11858l == i10;
                if (z10) {
                    V10.a(2);
                } else if (V10.K()) {
                    V10.a(1);
                }
                V10.t0(z10);
                this.f11855i.getLocationOnScreen(this.f11853g);
                V10.l(this.f11850d);
                if (this.f11850d.equals(rect)) {
                    V10.k(this.f11850d);
                    if (V10.f8810b != -1) {
                        t V11 = t.V();
                        for (int i12 = V10.f8810b; i12 != -1; i12 = V11.f8810b) {
                            V11.G0(this.f11855i, -1);
                            V11.e0(f11847n);
                            N(i12, V11);
                            V11.k(this.f11851e);
                            Rect rect2 = this.f11850d;
                            Rect rect3 = this.f11851e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        V11.Z();
                    }
                    this.f11850d.offset(this.f11853g[0] - this.f11855i.getScrollX(), this.f11853g[1] - this.f11855i.getScrollY());
                }
                if (this.f11855i.getLocalVisibleRect(this.f11852f)) {
                    this.f11852f.offset(this.f11853g[0] - this.f11855i.getScrollX(), this.f11853g[1] - this.f11855i.getScrollY());
                    if (this.f11850d.intersect(this.f11852f)) {
                        V10.f0(this.f11850d);
                        if (E(this.f11850d)) {
                            V10.Y0(true);
                        }
                    }
                }
                return V10;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private t u() {
        t X10 = t.X(this.f11855i);
        C4600b0.b0(this.f11855i, X10);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (X10.n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                X10.d(this.f11855i, ((Integer) arrayList.get(i10)).intValue());
            }
            return X10;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private c0<t> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        c0<t> c0Var = new c0<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c0Var.l(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return c0Var;
    }

    private void z(int i10, Rect rect) {
        H(i10).k(rect);
    }

    public final int A() {
        return this.f11858l;
    }

    /* access modifiers changed from: protected */
    public abstract int B(float f10, float f11);

    /* access modifiers changed from: protected */
    public abstract void C(List<Integer> list);

    /* access modifiers changed from: package-private */
    public t H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f11858l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean J(int i10, int i11, Bundle bundle);

    /* access modifiers changed from: protected */
    public void K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public abstract void M(t tVar);

    /* access modifiers changed from: protected */
    public abstract void N(int i10, t tVar);

    /* access modifiers changed from: protected */
    public abstract void O(int i10, boolean z10);

    /* access modifiers changed from: package-private */
    public boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f11855i.isFocused() && !this.f11855i.requestFocus()) || (i11 = this.f11858l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f11858l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f11854h.isEnabled() || (parent = this.f11855i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f11855i, q(i10, i11));
    }

    public u b(View view) {
        if (this.f11856j == null) {
            this.f11856j = new c();
        }
        return this.f11856j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    public void g(View view, t tVar) {
        super.g(view, tVar);
        M(tVar);
    }

    public final boolean o(int i10) {
        if (this.f11858l != i10) {
            return false;
        }
        this.f11858l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f11854h.isEnabled() || !this.f11854h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B10 = B(motionEvent.getX(), motionEvent.getY());
            V(B10);
            return B10 != Integer.MIN_VALUE;
        } else if (action != 10 || this.f11859m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F10 = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z10 = false;
                        while (i10 < repeatCount && G(F10, (Rect) null)) {
                            i10++;
                            z10 = true;
                        }
                        return z10;
                    case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return G(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.f11857k;
    }
}
