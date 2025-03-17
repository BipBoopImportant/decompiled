package J2;

import J2.w;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.network.models.UploadKt;
import java.util.ArrayList;
import java.util.List;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f8809a;

    /* renamed from: b  reason: collision with root package name */
    public int f8810b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f8811c = -1;

    public static class a {

        /* renamed from: A  reason: collision with root package name */
        public static final a f8812A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (w) null, (Class<? extends w.a>) null);

        /* renamed from: B  reason: collision with root package name */
        public static final a f8813B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (w) null, w.e.class);

        /* renamed from: C  reason: collision with root package name */
        public static final a f8814C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (w) null, (Class<? extends w.a>) null);

        /* renamed from: D  reason: collision with root package name */
        public static final a f8815D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (w) null, (Class<? extends w.a>) null);

        /* renamed from: E  reason: collision with root package name */
        public static final a f8816E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (w) null, (Class<? extends w.a>) null);

        /* renamed from: F  reason: collision with root package name */
        public static final a f8817F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (w) null, (Class<? extends w.a>) null);

        /* renamed from: G  reason: collision with root package name */
        public static final a f8818G;

        /* renamed from: H  reason: collision with root package name */
        public static final a f8819H;

        /* renamed from: I  reason: collision with root package name */
        public static final a f8820I;

        /* renamed from: J  reason: collision with root package name */
        public static final a f8821J;

        /* renamed from: K  reason: collision with root package name */
        public static final a f8822K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (w) null, (Class<? extends w.a>) null);

        /* renamed from: L  reason: collision with root package name */
        public static final a f8823L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (w) null, w.f.class);

        /* renamed from: M  reason: collision with root package name */
        public static final a f8824M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (CharSequence) null, (w) null, w.d.class);

        /* renamed from: N  reason: collision with root package name */
        public static final a f8825N;

        /* renamed from: O  reason: collision with root package name */
        public static final a f8826O;

        /* renamed from: P  reason: collision with root package name */
        public static final a f8827P;

        /* renamed from: Q  reason: collision with root package name */
        public static final a f8828Q;

        /* renamed from: R  reason: collision with root package name */
        public static final a f8829R;

        /* renamed from: S  reason: collision with root package name */
        public static final a f8830S;

        /* renamed from: T  reason: collision with root package name */
        public static final a f8831T;

        /* renamed from: U  reason: collision with root package name */
        public static final a f8832U;

        /* renamed from: V  reason: collision with root package name */
        public static final a f8833V;

        /* renamed from: e  reason: collision with root package name */
        public static final a f8834e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f8835f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f8836g = new a(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f8837h = new a(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f8838i = new a(16, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f8839j = new a(32, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f8840k = new a(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f8841l = new a(128, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f8842m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f8843n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f8844o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f8845p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f8846q = new a(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f8847r = new a(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f8848s = new a(16384, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f8849t = new a(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f8850u = new a(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f8851v = new a(131072, (CharSequence) null, (Class<? extends w.a>) w.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f8852w = new a(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f8853x = new a(ImageMetadata.LENS_APERTURE, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f8854y = new a(ImageMetadata.SHADING_MODE, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f8855z = new a((int) UploadKt.MAX_CHUNK_SIZE, (CharSequence) null, (Class<? extends w.a>) w.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f8856a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8857b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends w.a> f8858c;

        /* renamed from: d  reason: collision with root package name */
        protected final w f8859d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            Class<w.b> cls = w.b.class;
            f8842m = new a(256, (CharSequence) null, (Class<? extends w.a>) cls);
            f8843n = new a(512, (CharSequence) null, (Class<? extends w.a>) cls);
            Class<w.c> cls2 = w.c.class;
            f8844o = new a(1024, (CharSequence) null, (Class<? extends w.a>) cls2);
            f8845p = new a((int) RecyclerView.n.FLAG_MOVED, (CharSequence) null, (Class<? extends w.a>) cls2);
            int i10 = Build.VERSION.SDK_INT;
            f8818G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8819H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8820I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8821J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8825N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8826O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8827P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8828Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8829R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8830S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8831T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            f8832U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
            if (i10 >= 34) {
                accessibilityAction = d.a();
            }
            f8833V = new a(accessibilityAction, 16908382, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
        }

        public a(int i10, CharSequence charSequence) {
            this((Object) null, i10, charSequence, (w) null, (Class<? extends w.a>) null);
        }

        public a a(CharSequence charSequence, w wVar) {
            return new a((Object) null, this.f8857b, charSequence, wVar, this.f8858c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f8856a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f8856a).getLabel();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0020  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                J2.w r0 = r4.f8859d
                if (r0 == 0) goto L_0x0044
                java.lang.Class<? extends J2.w$a> r0 = r4.f8858c
                r1 = 0
                if (r0 == 0) goto L_0x003d
                java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x001b }
                java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ Exception -> 0x001b }
                J2.w$a r0 = (J2.w.a) r0     // Catch:{ Exception -> 0x001b }
                r0.a(r6)     // Catch:{ Exception -> 0x0018 }
                r1 = r0
                goto L_0x003d
            L_0x0018:
                r6 = move-exception
                r1 = r0
                goto L_0x001c
            L_0x001b:
                r6 = move-exception
            L_0x001c:
                java.lang.Class<? extends J2.w$a> r0 = r4.f8858c
                if (r0 != 0) goto L_0x0023
                java.lang.String r0 = "null"
                goto L_0x0027
            L_0x0023:
                java.lang.String r0 = r0.getName()
            L_0x0027:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r0, r6)
            L_0x003d:
                J2.w r6 = r4.f8859d
                boolean r5 = r6.a(r5, r1)
                return r5
            L_0x0044:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: J2.t.a.d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f8856a;
            return obj2 == null ? aVar.f8856a == null : obj2.equals(aVar.f8856a);
        }

        public int hashCode() {
            Object obj = this.f8856a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String h10 = t.h(this.f8857b);
            if (h10.equals("ACTION_UNKNOWN") && c() != null) {
                h10 = c().toString();
            }
            sb2.append(h10);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, w wVar) {
            this((Object) null, i10, charSequence, wVar, (Class<? extends w.a>) null);
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (w) null, (Class<? extends w.a>) null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends w.a> cls) {
            this((Object) null, i10, charSequence, (w) null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, w wVar, Class<? extends w.a> cls) {
            this.f8857b = i10;
            this.f8859d = wVar;
            if (obj == null) {
                this.f8856a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f8856a = obj;
            }
            this.f8858c = cls;
        }
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        final Object f8860a;

        e(Object obj) {
            this.f8860a = obj;
        }

        public static e a(int i10, int i11, boolean z10) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static e b(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final Object f8861a;

        f(Object obj) {
            this.f8861a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        final Object f8862a;

        g(Object obj) {
            this.f8862a = obj;
        }

        public static g a(int i10, float f10, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }
    }

    private t(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f8809a = accessibilityNodeInfo;
    }

    private boolean C() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static t V() {
        return a1(AccessibilityNodeInfo.obtain());
    }

    public static t W(t tVar) {
        return a1(AccessibilityNodeInfo.obtain(tVar.f8809a));
    }

    public static t X(View view) {
        return a1(AccessibilityNodeInfo.obtain(view));
    }

    public static t a1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new t(accessibilityNodeInfo);
    }

    private void d0(int i10, boolean z10) {
        Bundle t10 = t();
        if (t10 != null) {
            int i11 = t10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            t10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private List<Integer> f(String str) {
        ArrayList<Integer> integerArrayList = this.f8809a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f8809a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String h(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.n.FLAG_MOVED /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case ImageMetadata.CONTROL_AE_ANTIBANDING_MODE /*65536*/:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case ImageMetadata.LENS_APERTURE /*524288*/:
                return "ACTION_COLLAPSE";
            case UploadKt.MAX_CHUNK_SIZE /*2097152*/:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean j(int i10) {
        Bundle t10 = t();
        return t10 != null && (t10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public String A() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f8809a) : this.f8809a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void A0(boolean z10) {
        this.f8809a.setLongClickable(z10);
    }

    public String B() {
        return this.f8809a.getViewIdResourceName();
    }

    public void B0(int i10) {
        this.f8809a.setMaxTextLength(i10);
    }

    public void C0(int i10) {
        this.f8809a.setMovementGranularities(i10);
    }

    public boolean D() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f8809a) : j(64);
    }

    public void D0(CharSequence charSequence) {
        this.f8809a.setPackageName(charSequence);
    }

    public boolean E() {
        return this.f8809a.isAccessibilityFocused();
    }

    public void E0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8809a.setPaneTitle(charSequence);
        } else {
            this.f8809a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean F() {
        return this.f8809a.isCheckable();
    }

    public void F0(View view) {
        this.f8810b = -1;
        this.f8809a.setParent(view);
    }

    public boolean G() {
        return this.f8809a.isChecked();
    }

    public void G0(View view, int i10) {
        this.f8810b = i10;
        this.f8809a.setParent(view, i10);
    }

    public boolean H() {
        return this.f8809a.isClickable();
    }

    public void H0(boolean z10) {
        this.f8809a.setPassword(z10);
    }

    public boolean I() {
        return this.f8809a.isContextClickable();
    }

    public void I0(g gVar) {
        this.f8809a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f8862a);
    }

    public boolean J() {
        return this.f8809a.isEnabled();
    }

    public void J0(CharSequence charSequence) {
        this.f8809a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean K() {
        return this.f8809a.isFocusable();
    }

    public void K0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8809a.setScreenReaderFocusable(z10);
        } else {
            d0(1, z10);
        }
    }

    public boolean L() {
        return this.f8809a.isFocused();
    }

    public void L0(boolean z10) {
        this.f8809a.setScrollable(z10);
    }

    public boolean M() {
        return j(67108864);
    }

    public void M0(boolean z10) {
        this.f8809a.setSelected(z10);
    }

    public boolean N() {
        return this.f8809a.isImportantForAccessibility();
    }

    public void N0(boolean z10) {
        this.f8809a.setShowingHintText(z10);
    }

    public boolean O() {
        return this.f8809a.isLongClickable();
    }

    public void O0(View view) {
        this.f8811c = -1;
        this.f8809a.setSource(view);
    }

    public boolean P() {
        return this.f8809a.isPassword();
    }

    public void P0(View view, int i10) {
        this.f8811c = i10;
        this.f8809a.setSource(view, i10);
    }

    public boolean Q() {
        return this.f8809a.isScrollable();
    }

    public void Q0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f8809a, charSequence);
        } else {
            this.f8809a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean R() {
        return this.f8809a.isSelected();
    }

    public void R0(CharSequence charSequence) {
        this.f8809a.setText(charSequence);
    }

    public boolean S() {
        return this.f8809a.isShowingHintText();
    }

    public void S0(int i10, int i11) {
        this.f8809a.setTextSelection(i10, i11);
    }

    public boolean T() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f8809a) : j(8388608);
    }

    public void T0(View view) {
        this.f8809a.setTraversalAfter(view);
    }

    public boolean U() {
        return this.f8809a.isVisibleToUser();
    }

    public void U0(View view, int i10) {
        this.f8809a.setTraversalAfter(view, i10);
    }

    public void V0(View view) {
        this.f8809a.setTraversalBefore(view);
    }

    public void W0(View view, int i10) {
        this.f8809a.setTraversalBefore(view, i10);
    }

    public void X0(String str) {
        this.f8809a.setViewIdResourceName(str);
    }

    public boolean Y(int i10, Bundle bundle) {
        return this.f8809a.performAction(i10, bundle);
    }

    public void Y0(boolean z10) {
        this.f8809a.setVisibleToUser(z10);
    }

    @Deprecated
    public void Z() {
    }

    public AccessibilityNodeInfo Z0() {
        return this.f8809a;
    }

    public void a(int i10) {
        this.f8809a.addAction(i10);
    }

    public boolean a0(a aVar) {
        return this.f8809a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f8856a);
    }

    public void b(a aVar) {
        this.f8809a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f8856a);
    }

    public void b0(boolean z10) {
        this.f8809a.setAccessibilityFocused(z10);
    }

    public void c(View view) {
        this.f8809a.addChild(view);
    }

    public void c0(List<String> list) {
        this.f8809a.setAvailableExtraData(list);
    }

    public void d(View view, int i10) {
        this.f8809a.addChild(view, i10);
    }

    public void e(CharSequence charSequence, View view) {
    }

    @Deprecated
    public void e0(Rect rect) {
        this.f8809a.setBoundsInParent(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8809a;
        if (accessibilityNodeInfo == null) {
            if (tVar.f8809a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(tVar.f8809a)) {
            return false;
        }
        return this.f8811c == tVar.f8811c && this.f8810b == tVar.f8810b;
    }

    public void f0(Rect rect) {
        this.f8809a.setBoundsInScreen(rect);
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f8809a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void g0(boolean z10) {
        this.f8809a.setCheckable(z10);
    }

    public void h0(boolean z10) {
        this.f8809a.setChecked(z10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8809a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f8809a.getActions();
    }

    public void i0(CharSequence charSequence) {
        this.f8809a.setClassName(charSequence);
    }

    public void j0(boolean z10) {
        this.f8809a.setClickable(z10);
    }

    @Deprecated
    public void k(Rect rect) {
        this.f8809a.getBoundsInParent(rect);
    }

    public void k0(Object obj) {
        this.f8809a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f8860a);
    }

    public void l(Rect rect) {
        this.f8809a.getBoundsInScreen(rect);
    }

    public void l0(Object obj) {
        this.f8809a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f8861a);
    }

    public void m(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f8809a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f8809a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void m0(CharSequence charSequence) {
        this.f8809a.setContentDescription(charSequence);
    }

    public int n() {
        return this.f8809a.getChildCount();
    }

    public void n0(boolean z10) {
        this.f8809a.setContentInvalid(z10);
    }

    public CharSequence o() {
        return this.f8809a.getClassName();
    }

    public void o0(boolean z10) {
        this.f8809a.setDismissable(z10);
    }

    public void p0(boolean z10) {
        this.f8809a.setEditable(z10);
    }

    public CharSequence q() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f8809a) : this.f8809a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void q0(boolean z10) {
        this.f8809a.setEnabled(z10);
    }

    public CharSequence r() {
        return this.f8809a.getContentDescription();
    }

    public void r0(CharSequence charSequence) {
        this.f8809a.setError(charSequence);
    }

    public CharSequence s() {
        return this.f8809a.getError();
    }

    public void s0(boolean z10) {
        this.f8809a.setFocusable(z10);
    }

    public Bundle t() {
        return this.f8809a.getExtras();
    }

    public void t0(boolean z10) {
        this.f8809a.setFocused(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb2.append("; boundsInParent: " + rect);
        l(rect);
        sb2.append("; boundsInScreen: " + rect);
        m(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(w());
        sb2.append("; className: ");
        sb2.append(o());
        sb2.append("; text: ");
        sb2.append(y());
        sb2.append("; error: ");
        sb2.append(s());
        sb2.append("; maxTextLength: ");
        sb2.append(u());
        sb2.append("; stateDescription: ");
        sb2.append(x());
        sb2.append("; contentDescription: ");
        sb2.append(r());
        sb2.append("; tooltipText: ");
        sb2.append(z());
        sb2.append("; viewIdResName: ");
        sb2.append(B());
        sb2.append("; uniqueId: ");
        sb2.append(A());
        sb2.append("; checkable: ");
        sb2.append(F());
        sb2.append("; checked: ");
        sb2.append(G());
        sb2.append("; focusable: ");
        sb2.append(K());
        sb2.append("; focused: ");
        sb2.append(L());
        sb2.append("; selected: ");
        sb2.append(R());
        sb2.append("; clickable: ");
        sb2.append(H());
        sb2.append("; longClickable: ");
        sb2.append(O());
        sb2.append("; contextClickable: ");
        sb2.append(I());
        sb2.append("; enabled: ");
        sb2.append(J());
        sb2.append("; password: ");
        sb2.append(P());
        sb2.append("; scrollable: " + Q());
        sb2.append("; containerTitle: ");
        sb2.append(q());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(M());
        sb2.append("; importantForAccessibility: ");
        sb2.append(N());
        sb2.append("; visible: ");
        sb2.append(U());
        sb2.append("; isTextSelectable: ");
        sb2.append(T());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(D());
        sb2.append("; [");
        List<a> g10 = g();
        for (int i10 = 0; i10 < g10.size(); i10++) {
            a aVar = g10.get(i10);
            String h10 = h(aVar.b());
            if (h10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                h10 = aVar.c().toString();
            }
            sb2.append(h10);
            if (i10 != g10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int u() {
        return this.f8809a.getMaxTextLength();
    }

    public void u0(boolean z10) {
        d0(67108864, z10);
    }

    public int v() {
        return this.f8809a.getMovementGranularities();
    }

    public void v0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8809a.setHeading(z10);
        } else {
            d0(2, z10);
        }
    }

    public CharSequence w() {
        return this.f8809a.getPackageName();
    }

    public void w0(CharSequence charSequence) {
        this.f8809a.setHintText(charSequence);
    }

    public CharSequence x() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f8809a) : this.f8809a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void x0(boolean z10) {
        this.f8809a.setImportantForAccessibility(z10);
    }

    public CharSequence y() {
        if (!C()) {
            return this.f8809a.getText();
        }
        List<Integer> f10 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> f11 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> f12 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> f13 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f8809a.getText(), 0, this.f8809a.getText().length()));
        for (int i10 = 0; i10 < f10.size(); i10++) {
            spannableString.setSpan(new a(f13.get(i10).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), f10.get(i10).intValue(), f11.get(i10).intValue(), f12.get(i10).intValue());
        }
        return spannableString;
    }

    public void y0(View view) {
        this.f8809a.setLabelFor(view);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 28 ? this.f8809a.getTooltipText() : this.f8809a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void z0(int i10) {
        this.f8809a.setLiveRegion(i10);
    }
}
