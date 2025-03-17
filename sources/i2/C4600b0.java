package I2;

import I2.C4597a;
import I2.C4628p0;
import J2.t;
import J2.w;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import t2.C5947e;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: I2.b0  reason: case insensitive filesystem */
public class C4600b0 {

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap<View, C4618k0> f8626a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Field f8627b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f8628c = false;

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f8629d = {C5947e.f29359b, C5947e.f29360c, C5947e.f29371n, C5947e.f29382y, C5947e.f29340B, C5947e.f29341C, C5947e.f29342D, C5947e.f29343E, C5947e.f29344F, C5947e.f29345G, C5947e.f29361d, C5947e.f29362e, C5947e.f29363f, C5947e.f29364g, C5947e.f29365h, C5947e.f29366i, C5947e.f29367j, C5947e.f29368k, C5947e.f29369l, C5947e.f29370m, C5947e.f29372o, C5947e.f29373p, C5947e.f29374q, C5947e.f29375r, C5947e.f29376s, C5947e.f29377t, C5947e.f29378u, C5947e.f29379v, C5947e.f29380w, C5947e.f29381x, C5947e.f29383z, C5947e.f29339A};

    /* renamed from: e  reason: collision with root package name */
    private static final K f8630e = new C4598a0();

    /* renamed from: f  reason: collision with root package name */
    private static final e f8631f = new e();

    /* renamed from: I2.b0$a */
    class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: I2.b0$b */
    class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            l.f(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: I2.b0$c */
    class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public CharSequence c(View view) {
            return n.a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            n.c(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: I2.b0$d */
    class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            l.e(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: I2.b0$e */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f8632a = new WeakHashMap<>();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
            if (booleanValue != z10) {
                C4600b0.X(key, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            this.f8632a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            this.f8632a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> b10 : this.f8632a.entrySet()) {
                    b(b10);
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: I2.b0$f */
    static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f8633a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f8634b;

        /* renamed from: c  reason: collision with root package name */
        private final int f8635c;

        /* renamed from: d  reason: collision with root package name */
        private final int f8636d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f8635c;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        public abstract T c(View view);

        /* access modifiers changed from: package-private */
        public abstract void d(View view, T t10);

        /* access modifiers changed from: package-private */
        public T e(View view) {
            if (b()) {
                return c(view);
            }
            T tag = view.getTag(this.f8633a);
            if (this.f8634b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void f(View view, T t10) {
            if (b()) {
                d(view, t10);
            } else if (g(e(view), t10)) {
                C4600b0.j(view);
                view.setTag(this.f8633a, t10);
                C4600b0.X(view, this.f8636d);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean g(T t10, T t11);

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f8633a = i10;
            this.f8634b = cls;
            this.f8636d = i11;
            this.f8635c = i12;
        }
    }

    /* renamed from: I2.b0$g */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: I2.b0$h */
    private static class h {

        /* renamed from: I2.b0$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            C0 f8637a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f8638b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ I f8639c;

            a(View view, I i10) {
                this.f8638b = view;
                this.f8639c = i10;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0 z10 = C0.z(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f8638b);
                    if (z10.equals(this.f8637a)) {
                        return this.f8639c.a(view, z10).x();
                    }
                }
                this.f8637a = z10;
                C0 a10 = this.f8639c.a(view, z10);
                if (i10 >= 30) {
                    return a10.x();
                }
                C4600b0.l0(view);
                return a10.x();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C5947e.f29357S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C0 b(View view, C0 c02, Rect rect) {
            WindowInsets x10 = c02.x();
            if (x10 != null) {
                return C0.z(view.computeSystemWindowInsets(x10, rect), view);
            }
            rect.setEmpty();
            return c02;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getTranslationZ();
        }

        static float h(View view) {
            return view.getZ();
        }

        static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void l(View view, float f10) {
            view.setElevation(f10);
        }

        static void m(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void n(View view, I i10) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C5947e.f29350L, i10);
            }
            if (i10 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C5947e.f29357S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, i10));
            }
        }

        static void o(View view, String str) {
            view.setTransitionName(str);
        }

        static void p(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void q(View view, float f10) {
            view.setZ(f10);
        }

        static void r(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: I2.b0$i */
    private static class i {
        public static C0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0 y10 = C0.y(rootWindowInsets);
            y10.v(y10);
            y10.d(view.getRootView());
            return y10;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* renamed from: I2.b0$j */
    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* renamed from: I2.b0$k */
    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* renamed from: I2.b0$l */
    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static <T> T d(View view, int i10) {
            return view.requireViewById(i10);
        }

        static void e(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void f(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void g(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* renamed from: I2.b0$m */
    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* renamed from: I2.b0$n */
    private static class n {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static b1 b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return b1.g(windowInsetsController);
            }
            return null;
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: I2.b0$o */
    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C4603d b(View view, C4603d dVar) {
            ContentInfo f10 = dVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f10 ? dVar : C4603d.g(performReceiveContent);
        }
    }

    /* renamed from: I2.b0$p */
    public interface p {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* renamed from: I2.b0$q */
    static class q {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f8640d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f8641a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f8642b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f8643c = null;

        q() {
        }

        static q a(View view) {
            q qVar = (q) view.getTag(C5947e.f29355Q);
            if (qVar != null) {
                return qVar;
            }
            q qVar2 = new q();
            view.setTag(C5947e.f29355Q, qVar2);
            return qVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f8641a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f8642b == null) {
                this.f8642b = new SparseArray<>();
            }
            return this.f8642b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C5947e.f29356R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((p) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f8641a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f8640d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.f8641a == null) {
                            this.f8641a = new WeakHashMap<>();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList2 = f8640d;
                            View view = (View) arrayList2.get(size).get();
                            if (view == null) {
                                arrayList2.remove(size);
                            } else {
                                this.f8641a.put(view, Boolean.TRUE);
                                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.f8641a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c10));
                }
            }
            return c10 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f8643c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f8643c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d10 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = d10.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    @Deprecated
    public static int A(View view) {
        return view.getMinimumHeight();
    }

    private static void A0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    public static int B(View view) {
        return view.getMinimumWidth();
    }

    public static void B0(View view, int i10) {
        k.b(view, i10);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(C5947e.f29352N);
    }

    @Deprecated
    public static void C0(View view, int i10) {
        view.setLabelFor(i10);
    }

    @Deprecated
    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, boolean z10) {
        h.m(view, z10);
    }

    @Deprecated
    public static int E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, I i10) {
        h.n(view, i10);
    }

    @Deprecated
    public static ViewParent F(View view) {
        return view.getParentForAccessibility();
    }

    @Deprecated
    public static void F0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static C0 G(View view) {
        return i.a(view);
    }

    public static void G0(View view, M m10) {
        j.a(view, (PointerIcon) (m10 != null ? m10.a() : null));
    }

    public static CharSequence H(View view) {
        return O0().e(view);
    }

    public static void H0(View view, boolean z10) {
        o0().f(view, Boolean.valueOf(z10));
    }

    public static String I(View view) {
        return h.f(view);
    }

    public static void I0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static float J(View view) {
        return h.g(view);
    }

    public static void J0(View view, CharSequence charSequence) {
        O0().f(view, charSequence);
    }

    @Deprecated
    public static b1 K(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C4626o0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void K0(View view, String str) {
        h.o(view, str);
    }

    @Deprecated
    public static int L(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void L0(View view, float f10) {
        h.p(view, f10);
    }

    public static float M(View view) {
        return h.h(view);
    }

    public static void M0(View view, C4628p0.b bVar) {
        C4628p0.d(view, bVar);
    }

    public static boolean N(View view) {
        return m(view) != null;
    }

    public static void N0(View view, float f10) {
        h.q(view, f10);
    }

    @Deprecated
    public static boolean O(View view) {
        return view.hasOnClickListeners();
    }

    private static f<CharSequence> O0() {
        return new c(C5947e.f29354P, CharSequence.class, 64, 30);
    }

    @Deprecated
    public static boolean P(View view) {
        return view.hasTransientState();
    }

    public static void P0(View view) {
        h.r(view);
    }

    public static boolean Q(View view) {
        Boolean e10 = b().e(view);
        return e10 != null && e10.booleanValue();
    }

    @Deprecated
    public static boolean R(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean S(View view) {
        return view.isLaidOut();
    }

    public static boolean T(View view) {
        return h.i(view);
    }

    @Deprecated
    public static boolean U(View view) {
        return view.isPaddingRelative();
    }

    public static boolean V(View view) {
        Boolean e10 = o0().e(view);
        return e10 != null && e10.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C4603d W(C4603d dVar) {
        return dVar;
    }

    static void X(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i11 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = RecyclerView.n.FLAG_MOVED;
                }
                obtain.setEventType(i11);
                obtain.setContentChangeTypes(i10);
                if (z10) {
                    obtain.getText().add(o(view));
                    A0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void Y(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void Z(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static C0 a0(View view, C0 c02) {
        WindowInsets x10 = c02.x();
        if (x10 != null) {
            WindowInsets b10 = g.b(view, x10);
            if (!b10.equals(x10)) {
                return C0.z(b10, view);
            }
        }
        return c02;
    }

    private static f<Boolean> b() {
        return new d(C5947e.f29348J, Boolean.class, 28);
    }

    @Deprecated
    public static void b0(View view, t tVar) {
        view.onInitializeAccessibilityNodeInfo(tVar.Z0());
    }

    public static int c(View view, CharSequence charSequence, w wVar) {
        int q10 = q(view, charSequence);
        if (q10 != -1) {
            d(view, new t.a(q10, charSequence, wVar));
        }
        return q10;
    }

    private static f<CharSequence> c0() {
        return new b(C5947e.f29349K, CharSequence.class, 8, 28);
    }

    private static void d(View view, t.a aVar) {
        j(view);
        j0(aVar.b(), view);
        p(view).add(aVar);
        X(view, 0);
    }

    @Deprecated
    public static boolean d0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    @Deprecated
    public static C4618k0 e(View view) {
        if (f8626a == null) {
            f8626a = new WeakHashMap<>();
        }
        C4618k0 k0Var = f8626a.get(view);
        if (k0Var != null) {
            return k0Var;
        }
        C4618k0 k0Var2 = new C4618k0(view);
        f8626a.put(view, k0Var2);
        return k0Var2;
    }

    public static C4603d e0(View view, C4603d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, dVar);
        }
        J j10 = (J) view.getTag(C5947e.f29351M);
        if (j10 == null) {
            return v(view).onReceiveContent(dVar);
        }
        C4603d a10 = j10.a(view, dVar);
        if (a10 == null) {
            return null;
        }
        return v(view).onReceiveContent(a10);
    }

    public static C0 f(View view, C0 c02, Rect rect) {
        return h.b(view, c02, rect);
    }

    @Deprecated
    public static void f0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static C0 g(View view, C0 c02) {
        WindowInsets x10 = c02.x();
        if (x10 != null) {
            WindowInsets a10 = g.a(view, x10);
            if (!a10.equals(x10)) {
                return C0.z(a10, view);
            }
        }
        return c02;
    }

    @Deprecated
    public static void g0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).b(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void h0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).f(keyEvent);
    }

    public static void i0(View view, int i10) {
        j0(i10, view);
        X(view, 0);
    }

    static void j(View view) {
        C4597a l10 = l(view);
        if (l10 == null) {
            l10 = new C4597a();
        }
        p0(view, l10);
    }

    private static void j0(int i10, View view) {
        List<t.a> p10 = p(view);
        for (int i11 = 0; i11 < p10.size(); i11++) {
            if (p10.get(i11).b() == i10) {
                p10.remove(i11);
                return;
            }
        }
    }

    @Deprecated
    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view, t.a aVar, CharSequence charSequence, w wVar) {
        if (wVar == null && charSequence == null) {
            i0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, wVar));
        }
    }

    public static C4597a l(View view) {
        View.AccessibilityDelegate m10 = m(view);
        if (m10 == null) {
            return null;
        }
        return m10 instanceof C4597a.C0118a ? ((C4597a.C0118a) m10).f8622a : new C4597a(m10);
    }

    public static void l0(View view) {
        g.c(view);
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    public static <T extends View> T m0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) l.d(view, i10);
        }
        T findViewById = view.findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f8628c) {
            return null;
        }
        if (f8627b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f8627b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f8628c = true;
                return null;
            }
        }
        try {
            Object obj = f8627b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f8628c = true;
            return null;
        }
    }

    public static void n0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static CharSequence o(View view) {
        return c0().e(view);
    }

    private static f<Boolean> o0() {
        return new a(C5947e.f29353O, Boolean.class, 28);
    }

    private static List<t.a> p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C5947e.f29346H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C5947e.f29346H, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, C4597a aVar) {
        if (aVar == null && (m(view) instanceof C4597a.C0118a)) {
            aVar = new C4597a();
        }
        A0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    private static int q(View view, CharSequence charSequence) {
        List<t.a> p10 = p(view);
        for (int i10 = 0; i10 < p10.size(); i10++) {
            if (TextUtils.equals(charSequence, p10.get(i10).c())) {
                return p10.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f8629d;
            if (i12 >= iArr.length || i11 != -1) {
                return i11;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < p10.size(); i14++) {
                z10 &= p10.get(i14).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void q0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    @Deprecated
    public static void r0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, CharSequence charSequence) {
        c0().f(view, charSequence);
        if (charSequence != null) {
            f8631f.a(view);
        } else {
            f8631f.d(view);
        }
    }

    @Deprecated
    public static Display t(View view) {
        return view.getDisplay();
    }

    @Deprecated
    public static void t0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static float u(View view) {
        return h.e(view);
    }

    public static void u0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    private static K v(View view) {
        return view instanceof K ? (K) view : f8630e;
    }

    public static void v0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    @Deprecated
    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static void w0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    @Deprecated
    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    public static void x0(View view, float f10) {
        h.l(view, f10);
    }

    @SuppressLint({"InlinedApi"})
    public static int y(View view) {
        return k.a(view);
    }

    @Deprecated
    public static void y0(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    @Deprecated
    public static int z(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static void z0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }
}
