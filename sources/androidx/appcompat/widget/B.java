package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity;
import i.C5421a;
import i.C5430j;
import java.lang.reflect.Method;
import n.C5577b;

public class B implements C5577b {

    /* renamed from: G  reason: collision with root package name */
    private static Method f16124G;

    /* renamed from: H  reason: collision with root package name */
    private static Method f16125H;

    /* renamed from: A  reason: collision with root package name */
    private Runnable f16126A;

    /* renamed from: B  reason: collision with root package name */
    final Handler f16127B;

    /* renamed from: C  reason: collision with root package name */
    private final Rect f16128C;

    /* renamed from: D  reason: collision with root package name */
    private Rect f16129D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f16130E;

    /* renamed from: F  reason: collision with root package name */
    PopupWindow f16131F;

    /* renamed from: a  reason: collision with root package name */
    private Context f16132a;

    /* renamed from: b  reason: collision with root package name */
    private ListAdapter f16133b;

    /* renamed from: c  reason: collision with root package name */
    DropDownListView f16134c;

    /* renamed from: d  reason: collision with root package name */
    private int f16135d;

    /* renamed from: e  reason: collision with root package name */
    private int f16136e;

    /* renamed from: f  reason: collision with root package name */
    private int f16137f;

    /* renamed from: g  reason: collision with root package name */
    private int f16138g;

    /* renamed from: h  reason: collision with root package name */
    private int f16139h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16140i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16141j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16142k;

    /* renamed from: l  reason: collision with root package name */
    private int f16143l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f16144m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16145n;

    /* renamed from: o  reason: collision with root package name */
    int f16146o;

    /* renamed from: p  reason: collision with root package name */
    private View f16147p;

    /* renamed from: q  reason: collision with root package name */
    private int f16148q;

    /* renamed from: r  reason: collision with root package name */
    private DataSetObserver f16149r;

    /* renamed from: s  reason: collision with root package name */
    private View f16150s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f16151t;

    /* renamed from: u  reason: collision with root package name */
    private AdapterView.OnItemClickListener f16152u;

    /* renamed from: v  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f16153v;

    /* renamed from: w  reason: collision with root package name */
    final i f16154w;

    /* renamed from: x  reason: collision with root package name */
    private final h f16155x;

    /* renamed from: y  reason: collision with root package name */
    private final g f16156y;

    /* renamed from: z  reason: collision with root package name */
    private final e f16157z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            View t10 = B.this.t();
            if (t10 != null && t10.getWindowToken() != null) {
                B.this.a();
            }
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            DropDownListView dropDownListView;
            if (i10 != -1 && (dropDownListView = B.this.f16134c) != null) {
                dropDownListView.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class e implements Runnable {
        e() {
        }

        public void run() {
            B.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        public void onChanged() {
            if (B.this.b()) {
                B.this.a();
            }
        }

        public void onInvalidated() {
            B.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !B.this.A() && B.this.f16131F.getContentView() != null) {
                B b10 = B.this;
                b10.f16127B.removeCallbacks(b10.f16154w);
                B.this.f16154w.run();
            }
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = B.this.f16131F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < B.this.f16131F.getWidth() && y10 >= 0 && y10 < B.this.f16131F.getHeight()) {
                B b10 = B.this;
                b10.f16127B.postDelayed(b10.f16154w, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                B b11 = B.this;
                b11.f16127B.removeCallbacks(b11.f16154w);
                return false;
            }
        }
    }

    private class i implements Runnable {
        i() {
        }

        public void run() {
            DropDownListView dropDownListView = B.this.f16134c;
            if (dropDownListView != null && dropDownListView.isAttachedToWindow() && B.this.f16134c.getCount() > B.this.f16134c.getChildCount()) {
                int childCount = B.this.f16134c.getChildCount();
                B b10 = B.this;
                if (childCount <= b10.f16146o) {
                    b10.f16131F.setInputMethodMode(2);
                    B.this.a();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f16124G = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f16125H = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public B(Context context) {
        this(context, (AttributeSet) null, C5421a.f23876F);
    }

    private void C() {
        View view = this.f16147p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f16147p);
            }
        }
    }

    private void O(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f16124G;
            if (method != null) {
                try {
                    method.invoke(this.f16131F, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            d.b(this.f16131F, z10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.DropDownListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.DropDownListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.DropDownListView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int q() {
        /*
            r12 = this;
            androidx.appcompat.widget.DropDownListView r0 = r12.f16134c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00be
            android.content.Context r0 = r12.f16132a
            androidx.appcompat.widget.B$a r5 = new androidx.appcompat.widget.B$a
            r5.<init>()
            r12.f16126A = r5
            boolean r5 = r12.f16130E
            r5 = r5 ^ r3
            androidx.appcompat.widget.DropDownListView r5 = r12.s(r0, r5)
            r12.f16134c = r5
            android.graphics.drawable.Drawable r6 = r12.f16151t
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.DropDownListView r5 = r12.f16134c
            android.widget.ListAdapter r6 = r12.f16133b
            r5.setAdapter(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.f16134c
            android.widget.AdapterView$OnItemClickListener r6 = r12.f16152u
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.f16134c
            r5.setFocusable(r3)
            androidx.appcompat.widget.DropDownListView r5 = r12.f16134c
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.DropDownListView r5 = r12.f16134c
            androidx.appcompat.widget.B$b r6 = new androidx.appcompat.widget.B$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.f16134c
            androidx.appcompat.widget.B$g r6 = r12.f16156y
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f16153v
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.DropDownListView r6 = r12.f16134c
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.DropDownListView r5 = r12.f16134c
            android.view.View r6 = r12.f16147p
            if (r6 == 0) goto L_0x00b7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f16148q
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f16148q
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f16136e
            if (r0 < 0) goto L_0x009b
            r5 = r1
            goto L_0x009d
        L_0x009b:
            r0 = r4
            r5 = r0
        L_0x009d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b8
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            android.widget.PopupWindow r6 = r12.f16131F
            r6.setContentView(r5)
            goto L_0x00dc
        L_0x00be:
            android.widget.PopupWindow r0 = r12.f16131F
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f16147p
            if (r0 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dc
        L_0x00db:
            r0 = r4
        L_0x00dc:
            android.widget.PopupWindow r5 = r12.f16131F
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f8
            android.graphics.Rect r6 = r12.f16128C
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f16128C
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f16140i
            if (r7 != 0) goto L_0x00fe
            int r6 = -r6
            r12.f16138g = r6
            goto L_0x00fe
        L_0x00f8:
            android.graphics.Rect r5 = r12.f16128C
            r5.setEmpty()
            r5 = r4
        L_0x00fe:
            android.widget.PopupWindow r6 = r12.f16131F
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r3 = r4
        L_0x0109:
            android.view.View r4 = r12.t()
            int r6 = r12.f16138g
            int r3 = r12.u(r4, r6, r3)
            boolean r4 = r12.f16144m
            if (r4 != 0) goto L_0x017b
            int r4 = r12.f16135d
            if (r4 != r2) goto L_0x011c
            goto L_0x017b
        L_0x011c:
            int r4 = r12.f16136e
            r6 = -2
            if (r4 == r6) goto L_0x0144
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x0129:
            r7 = r1
            goto L_0x015d
        L_0x012b:
            android.content.Context r2 = r12.f16132a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f16128C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x0144:
            android.content.Context r2 = r12.f16132a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f16128C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x015d:
            androidx.appcompat.widget.DropDownListView r6 = r12.f16134c
            int r10 = r3 - r0
            r11 = -1
            r8 = 0
            r9 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0179
            androidx.appcompat.widget.DropDownListView r2 = r12.f16134c
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.DropDownListView r3 = r12.f16134c
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0179:
            int r1 = r1 + r0
            return r1
        L_0x017b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.B.q():int");
    }

    private int u(View view, int i10, boolean z10) {
        return c.a(this.f16131F, view, i10, z10);
    }

    public boolean A() {
        return this.f16131F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f16130E;
    }

    public void D(View view) {
        this.f16150s = view;
    }

    public void E(int i10) {
        this.f16131F.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f16131F.getBackground();
        if (background != null) {
            background.getPadding(this.f16128C);
            Rect rect = this.f16128C;
            this.f16136e = rect.left + rect.right + i10;
            return;
        }
        R(i10);
    }

    public void G(int i10) {
        this.f16143l = i10;
    }

    public void H(Rect rect) {
        this.f16129D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.f16131F.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.f16130E = z10;
        this.f16131F.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f16131F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f16152u = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f16153v = onItemSelectedListener;
    }

    public void N(boolean z10) {
        this.f16142k = true;
        this.f16141j = z10;
    }

    public void P(int i10) {
        this.f16148q = i10;
    }

    public void Q(int i10) {
        DropDownListView dropDownListView = this.f16134c;
        if (b() && dropDownListView != null) {
            dropDownListView.setListSelectionHidden(false);
            dropDownListView.setSelection(i10);
            if (dropDownListView.getChoiceMode() != 0) {
                dropDownListView.setItemChecked(i10, true);
            }
        }
    }

    public void R(int i10) {
        this.f16136e = i10;
    }

    public void a() {
        int q10 = q();
        boolean A10 = A();
        androidx.core.widget.h.b(this.f16131F, this.f16139h);
        boolean z10 = true;
        if (!this.f16131F.isShowing()) {
            int i10 = this.f16136e;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = t().getWidth();
            }
            int i11 = this.f16135d;
            if (i11 == -1) {
                q10 = -1;
            } else if (i11 != -2) {
                q10 = i11;
            }
            this.f16131F.setWidth(i10);
            this.f16131F.setHeight(q10);
            O(true);
            PopupWindow popupWindow = this.f16131F;
            if (this.f16145n || this.f16144m) {
                z10 = false;
            }
            popupWindow.setOutsideTouchable(z10);
            this.f16131F.setTouchInterceptor(this.f16155x);
            if (this.f16142k) {
                androidx.core.widget.h.a(this.f16131F, this.f16141j);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f16125H;
                if (method != null) {
                    try {
                        method.invoke(this.f16131F, new Object[]{this.f16129D});
                    } catch (Exception e10) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                    }
                }
            } else {
                d.a(this.f16131F, this.f16129D);
            }
            androidx.core.widget.h.c(this.f16131F, t(), this.f16137f, this.f16138g, this.f16143l);
            this.f16134c.setSelection(-1);
            if (!this.f16130E || this.f16134c.isInTouchMode()) {
                r();
            }
            if (!this.f16130E) {
                this.f16127B.post(this.f16157z);
            }
        } else if (t().isAttachedToWindow()) {
            int i12 = this.f16136e;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = t().getWidth();
            }
            int i13 = this.f16135d;
            if (i13 == -1) {
                if (!A10) {
                    q10 = -1;
                }
                if (A10) {
                    this.f16131F.setWidth(this.f16136e == -1 ? -1 : 0);
                    this.f16131F.setHeight(0);
                } else {
                    this.f16131F.setWidth(this.f16136e == -1 ? -1 : 0);
                    this.f16131F.setHeight(-1);
                }
            } else if (i13 != -2) {
                q10 = i13;
            }
            PopupWindow popupWindow2 = this.f16131F;
            if (this.f16145n || this.f16144m) {
                z10 = false;
            }
            popupWindow2.setOutsideTouchable(z10);
            this.f16131F.update(t(), this.f16137f, this.f16138g, i12 < 0 ? -1 : i12, q10 < 0 ? -1 : q10);
        }
    }

    public boolean b() {
        return this.f16131F.isShowing();
    }

    public void c(Drawable drawable) {
        this.f16131F.setBackgroundDrawable(drawable);
    }

    public int d() {
        return this.f16137f;
    }

    public void dismiss() {
        this.f16131F.dismiss();
        C();
        this.f16131F.setContentView((View) null);
        this.f16134c = null;
        this.f16127B.removeCallbacks(this.f16154w);
    }

    public void f(int i10) {
        this.f16137f = i10;
    }

    public Drawable h() {
        return this.f16131F.getBackground();
    }

    public void j(int i10) {
        this.f16138g = i10;
        this.f16140i = true;
    }

    public int m() {
        if (!this.f16140i) {
            return 0;
        }
        return this.f16138g;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f16149r;
        if (dataSetObserver == null) {
            this.f16149r = new f();
        } else {
            ListAdapter listAdapter2 = this.f16133b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f16133b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f16149r);
        }
        DropDownListView dropDownListView = this.f16134c;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f16133b);
        }
    }

    public ListView p() {
        return this.f16134c;
    }

    public void r() {
        DropDownListView dropDownListView = this.f16134c;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public DropDownListView s(Context context, boolean z10) {
        return new DropDownListView(context, z10);
    }

    public View t() {
        return this.f16150s;
    }

    public Object v() {
        if (!b()) {
            return null;
        }
        return this.f16134c.getSelectedItem();
    }

    public long w() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.f16134c.getSelectedItemId();
    }

    public int x() {
        if (!b()) {
            return -1;
        }
        return this.f16134c.getSelectedItemPosition();
    }

    public View y() {
        if (!b()) {
            return null;
        }
        return this.f16134c.getSelectedView();
    }

    public int z() {
        return this.f16136e;
    }

    public B(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public B(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f16135d = -2;
        this.f16136e = -2;
        this.f16139h = CashAppPayProcessorActivity.RESULT_ERROR;
        this.f16143l = 0;
        this.f16144m = false;
        this.f16145n = false;
        this.f16146o = Integer.MAX_VALUE;
        this.f16148q = 0;
        this.f16154w = new i();
        this.f16155x = new h();
        this.f16156y = new g();
        this.f16157z = new e();
        this.f16128C = new Rect();
        this.f16132a = context;
        this.f16127B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5430j.f24202l1, i10, i11);
        this.f16137f = obtainStyledAttributes.getDimensionPixelOffset(C5430j.f24207m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C5430j.f24212n1, 0);
        this.f16138g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f16140i = true;
        }
        obtainStyledAttributes.recycle();
        C4998j jVar = new C4998j(context, attributeSet, i10, i11);
        this.f16131F = jVar;
        jVar.setInputMethodMode(1);
    }
}
