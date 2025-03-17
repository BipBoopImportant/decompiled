package androidx.appcompat.widget;

import I2.B;
import I2.C4600b0;
import I2.C4632s;
import I2.C4640w;
import I2.C4646z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.sugarcube.app.base.data.source.CatalogRepository;
import i.C5421a;
import i.C5430j;
import j.C5443a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Toolbar extends ViewGroup implements C4640w {

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f16427A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f16428B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f16429C;

    /* renamed from: D  reason: collision with root package name */
    private final ArrayList<View> f16430D;

    /* renamed from: E  reason: collision with root package name */
    private final ArrayList<View> f16431E;

    /* renamed from: F  reason: collision with root package name */
    private final int[] f16432F;

    /* renamed from: G  reason: collision with root package name */
    final C4646z f16433G;

    /* renamed from: H  reason: collision with root package name */
    private ArrayList<MenuItem> f16434H;

    /* renamed from: I  reason: collision with root package name */
    h f16435I;

    /* renamed from: J  reason: collision with root package name */
    private final ActionMenuView.e f16436J;

    /* renamed from: K  reason: collision with root package name */
    private Q f16437K;

    /* renamed from: L  reason: collision with root package name */
    private ActionMenuPresenter f16438L;

    /* renamed from: M  reason: collision with root package name */
    private f f16439M;

    /* renamed from: N  reason: collision with root package name */
    private k.a f16440N;

    /* renamed from: O  reason: collision with root package name */
    f.a f16441O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f16442P;

    /* renamed from: Q  reason: collision with root package name */
    private OnBackInvokedCallback f16443Q;

    /* renamed from: R  reason: collision with root package name */
    private OnBackInvokedDispatcher f16444R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f16445S;

    /* renamed from: T  reason: collision with root package name */
    private final Runnable f16446T;

    /* renamed from: a  reason: collision with root package name */
    ActionMenuView f16447a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f16448b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f16449c;

    /* renamed from: d  reason: collision with root package name */
    private ImageButton f16450d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f16451e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f16452f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f16453g;

    /* renamed from: h  reason: collision with root package name */
    ImageButton f16454h;

    /* renamed from: i  reason: collision with root package name */
    View f16455i;

    /* renamed from: j  reason: collision with root package name */
    private Context f16456j;

    /* renamed from: k  reason: collision with root package name */
    private int f16457k;

    /* renamed from: l  reason: collision with root package name */
    private int f16458l;

    /* renamed from: m  reason: collision with root package name */
    private int f16459m;

    /* renamed from: n  reason: collision with root package name */
    int f16460n;

    /* renamed from: o  reason: collision with root package name */
    private int f16461o;

    /* renamed from: p  reason: collision with root package name */
    private int f16462p;

    /* renamed from: q  reason: collision with root package name */
    private int f16463q;

    /* renamed from: r  reason: collision with root package name */
    private int f16464r;

    /* renamed from: s  reason: collision with root package name */
    private int f16465s;

    /* renamed from: t  reason: collision with root package name */
    private F f16466t;

    /* renamed from: u  reason: collision with root package name */
    private int f16467u;

    /* renamed from: v  reason: collision with root package name */
    private int f16468v;

    /* renamed from: w  reason: collision with root package name */
    private int f16469w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f16470x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f16471y;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f16472z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f16433G.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f16435I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements f.a {
        c() {
        }

        public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            f.a aVar = Toolbar.this.f16441O;
            return aVar != null && aVar.a(fVar, menuItem);
        }

        public void b(androidx.appcompat.view.menu.f fVar) {
            if (!Toolbar.this.f16447a.J()) {
                Toolbar.this.f16433G.k(fVar);
            }
            f.a aVar = Toolbar.this.f16441O;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new P(runnable);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements k {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.view.menu.f f16477a;

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.h f16478b;

        f() {
        }

        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        public boolean d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f16454h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f16454h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f16454h);
            }
            Toolbar.this.f16455i = hVar.getActionView();
            this.f16478b = hVar;
            ViewParent parent2 = Toolbar.this.f16455i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f16455i);
                }
                g m10 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m10.f15537a = (toolbar4.f16460n & 112) | 8388611;
                m10.f16480b = 2;
                toolbar4.f16455i.setLayoutParams(m10);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f16455i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            hVar.r(true);
            View view = Toolbar.this.f16455i;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).b();
            }
            Toolbar.this.R();
            return true;
        }

        public void f(Parcelable parcelable) {
        }

        public boolean g(o oVar) {
            return false;
        }

        public int getId() {
            return 0;
        }

        public Parcelable h() {
            return null;
        }

        public void i(boolean z10) {
            if (this.f16478b != null) {
                androidx.appcompat.view.menu.f fVar = this.f16477a;
                if (fVar != null) {
                    int size = fVar.size();
                    int i10 = 0;
                    while (i10 < size) {
                        if (this.f16477a.getItem(i10) != this.f16478b) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                k(this.f16477a, this.f16478b);
            }
        }

        public boolean j() {
            return false;
        }

        public boolean k(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
            View view = Toolbar.this.f16455i;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f16455i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f16454h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f16455i = null;
            toolbar3.a();
            this.f16478b = null;
            Toolbar.this.requestLayout();
            hVar.r(false);
            Toolbar.this.R();
            return true;
        }

        public void l(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f16477a;
            if (!(fVar2 == null || (hVar = this.f16478b) == null)) {
                fVar2.f(hVar);
            }
            this.f16477a = fVar;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23885O);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + gVar.rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + gVar.leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, CatalogRepository.FETCH_FLAG_SDB);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f16433G.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f16434H = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f16446T);
        post(this.f16446T);
    }

    private boolean O() {
        if (!this.f16442P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int b10 = C4632s.b(i10, getLayoutDirection());
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f16480b == 0 && P(childAt) && p(gVar.f15537a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f16480b == 0 && P(childAt2) && p(gVar2.f15537a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g m10 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        m10.f16480b = 1;
        if (!z10 || this.f16455i == null) {
            addView(view, m10);
            return;
        }
        view.setLayoutParams(m10);
        this.f16431E.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f16466t == null) {
            this.f16466t = new F();
        }
    }

    private void i() {
        if (this.f16451e == null) {
            this.f16451e = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f16447a.N() == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) this.f16447a.getMenu();
            if (this.f16439M == null) {
                this.f16439M = new f();
            }
            this.f16447a.setExpandedActionViewsExclusive(true);
            fVar.c(this.f16439M, this.f16456j);
            R();
        }
    }

    private void k() {
        if (this.f16447a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f16447a = actionMenuView;
            actionMenuView.setPopupTheme(this.f16457k);
            this.f16447a.setOnMenuItemClickListener(this.f16436J);
            this.f16447a.O(this.f16440N, new c());
            g m10 = generateDefaultLayoutParams();
            m10.f15537a = (this.f16460n & 112) | 8388613;
            this.f16447a.setLayoutParams(m10);
            c(this.f16447a, false);
        }
    }

    private void l() {
        if (this.f16450d == null) {
            this.f16450d = new AppCompatImageButton(getContext(), (AttributeSet) null, C5421a.f23884N);
            g m10 = generateDefaultLayoutParams();
            m10.f15537a = (this.f16460n & 112) | 8388611;
            this.f16450d.setLayoutParams(m10);
        }
    }

    private int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int b10 = C4632s.b(i10, layoutDirection) & 7;
        return (b10 == 1 || b10 == 3 || b10 == 5) ? b10 : layoutDirection == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(gVar.f15537a);
        if (r10 == 48) {
            return getPaddingTop() - i11;
        }
        if (r10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = gVar.topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = gVar.bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f16469w & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = gVar.leftMargin - i10;
            int i15 = gVar.rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.f16431E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f16447a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f16447a;
        return actionMenuView != null && actionMenuView.J();
    }

    /* access modifiers changed from: package-private */
    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((g) childAt.getLayoutParams()).f16480b == 2 || childAt == this.f16447a)) {
                removeViewAt(childCount);
                this.f16431E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f16466t.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.f fVar, ActionMenuPresenter actionMenuPresenter) {
        if (fVar != null || this.f16447a != null) {
            k();
            androidx.appcompat.view.menu.f N10 = this.f16447a.N();
            if (N10 != fVar) {
                if (N10 != null) {
                    N10.R(this.f16438L);
                    N10.R(this.f16439M);
                }
                if (this.f16439M == null) {
                    this.f16439M = new f();
                }
                actionMenuPresenter.I(true);
                if (fVar != null) {
                    fVar.c(actionMenuPresenter, this.f16456j);
                    fVar.c(this.f16439M, this.f16456j);
                } else {
                    actionMenuPresenter.l(this.f16456j, (androidx.appcompat.view.menu.f) null);
                    this.f16439M.l(this.f16456j, (androidx.appcompat.view.menu.f) null);
                    actionMenuPresenter.i(true);
                    this.f16439M.i(true);
                }
                this.f16447a.setPopupTheme(this.f16457k);
                this.f16447a.setPresenter(actionMenuPresenter);
                this.f16438L = actionMenuPresenter;
                R();
            }
        }
    }

    public void L(k.a aVar, f.a aVar2) {
        this.f16440N = aVar;
        this.f16441O = aVar2;
        ActionMenuView actionMenuView = this.f16447a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f16459m = i10;
        TextView textView = this.f16449c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f16458l = i10;
        TextView textView = this.f16448b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f16447a;
        return actionMenuView != null && actionMenuView.P();
    }

    /* access modifiers changed from: package-private */
    public void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            boolean z10 = v() && a10 != null && isAttachedToWindow() && this.f16445S;
            if (z10 && this.f16444R == null) {
                if (this.f16443Q == null) {
                    this.f16443Q = e.b(new N(this));
                }
                e.c(a10, this.f16443Q);
                this.f16444R = a10;
            } else if (!z10 && (onBackInvokedDispatcher = this.f16444R) != null) {
                e.d(onBackInvokedDispatcher, this.f16443Q);
                this.f16444R = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.f16431E.size() - 1; size >= 0; size--) {
            addView(this.f16431E.get(size));
        }
        this.f16431E.clear();
    }

    public void addMenuProvider(B b10) {
        this.f16433G.c(b10);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f16447a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f16447a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        f fVar = this.f16439M;
        androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f16478b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f16447a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f16454h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, C5421a.f23884N);
            this.f16454h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f16452f);
            this.f16454h.setContentDescription(this.f16453g);
            g m10 = generateDefaultLayoutParams();
            m10.f15537a = (this.f16460n & 112) | 8388611;
            m10.f16480b = 2;
            this.f16454h.setLayoutParams(m10);
            this.f16454h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f16454h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f16454h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        F f10 = this.f16466t;
        if (f10 != null) {
            return f10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f16468v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        F f10 = this.f16466t;
        if (f10 != null) {
            return f10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        F f10 = this.f16466t;
        if (f10 != null) {
            return f10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        F f10 = this.f16466t;
        if (f10 != null) {
            return f10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f16467u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f16447a
            if (r0 == 0) goto L_0x0020
            androidx.appcompat.view.menu.f r0 = r0.N()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0020
            int r0 = r3.getContentInsetEnd()
            int r1 = r3.f16468v
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0024
        L_0x0020:
            int r0 = r3.getContentInsetEnd()
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f16467u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f16451e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f16451e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f16447a.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.f16450d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f16450d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f16450d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f16438L;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f16447a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f16456j;
    }

    public int getPopupTheme() {
        return this.f16457k;
    }

    public CharSequence getSubtitle() {
        return this.f16471y;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f16449c;
    }

    public CharSequence getTitle() {
        return this.f16470x;
    }

    public int getTitleMarginBottom() {
        return this.f16465s;
    }

    public int getTitleMarginEnd() {
        return this.f16463q;
    }

    public int getTitleMarginStart() {
        return this.f16462p;
    }

    public int getTitleMarginTop() {
        return this.f16464r;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f16448b;
    }

    public C5007t getWrapper() {
        if (this.f16437K == null) {
            this.f16437K = new Q(this, true);
        }
        return this.f16437K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    /* renamed from: n */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0226a ? new g((a.C0226a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f16446T);
        R();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f16429C = false;
        }
        if (!this.f16429C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f16429C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f16429C = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a1 A[LOOP:0: B:103:0x029f->B:104:0x02a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02c3 A[LOOP:1: B:106:0x02c1->B:107:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fc A[LOOP:2: B:114:0x02fa->B:115:0x02fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r19.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f16432F
            r11[r3] = r2
            r11[r2] = r2
            int r12 = I2.C4600b0.A(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r2
        L_0x003b:
            android.widget.ImageButton r13 = r0.f16450d
            boolean r13 = r0.P(r13)
            if (r13 == 0) goto L_0x0056
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f16450d
            int r13 = r0.D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0058
        L_0x004e:
            android.widget.ImageButton r13 = r0.f16450d
            int r13 = r0.C(r13, r6, r11, r12)
        L_0x0054:
            r14 = r10
            goto L_0x0058
        L_0x0056:
            r13 = r6
            goto L_0x0054
        L_0x0058:
            android.widget.ImageButton r15 = r0.f16454h
            boolean r15 = r0.P(r15)
            if (r15 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x0069
            android.widget.ImageButton r15 = r0.f16454h
            int r14 = r0.D(r15, r14, r11, r12)
            goto L_0x006f
        L_0x0069:
            android.widget.ImageButton r15 = r0.f16454h
            int r13 = r0.C(r15, r13, r11, r12)
        L_0x006f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f16447a
            boolean r15 = r0.P(r15)
            if (r15 == 0) goto L_0x0086
            if (r1 == 0) goto L_0x0080
            androidx.appcompat.widget.ActionMenuView r15 = r0.f16447a
            int r13 = r0.C(r15, r13, r11, r12)
            goto L_0x0086
        L_0x0080:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f16447a
            int r14 = r0.D(r15, r14, r11, r12)
        L_0x0086:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f16455i
            boolean r13 = r0.P(r13)
            if (r13 == 0) goto L_0x00c3
            if (r1 == 0) goto L_0x00bd
            android.view.View r13 = r0.f16455i
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00c3
        L_0x00bd:
            android.view.View r13 = r0.f16455i
            int r3 = r0.C(r13, r3, r11, r12)
        L_0x00c3:
            android.widget.ImageView r13 = r0.f16451e
            boolean r13 = r0.P(r13)
            if (r13 == 0) goto L_0x00da
            if (r1 == 0) goto L_0x00d4
            android.widget.ImageView r13 = r0.f16451e
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00da
        L_0x00d4:
            android.widget.ImageView r13 = r0.f16451e
            int r3 = r0.C(r13, r3, r11, r12)
        L_0x00da:
            android.widget.TextView r13 = r0.f16448b
            boolean r13 = r0.P(r13)
            android.widget.TextView r14 = r0.f16449c
            boolean r14 = r0.P(r14)
            if (r13 == 0) goto L_0x00ff
            android.widget.TextView r15 = r0.f16448b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            int r2 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f16448b
            int r7 = r7.getMeasuredHeight()
            int r2 = r2 + r7
            int r7 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x0102
        L_0x00ff:
            r23 = r7
            r2 = 0
        L_0x0102:
            if (r14 == 0) goto L_0x011c
            android.widget.TextView r7 = r0.f16449c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f16449c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r2 = r2 + r15
            goto L_0x011e
        L_0x011c:
            r16 = r4
        L_0x011e:
            if (r13 != 0) goto L_0x012a
            if (r14 == 0) goto L_0x0123
            goto L_0x012a
        L_0x0123:
            r18 = r6
            r22 = r12
        L_0x0127:
            r2 = 0
            goto L_0x0291
        L_0x012a:
            if (r13 == 0) goto L_0x012f
            android.widget.TextView r4 = r0.f16448b
            goto L_0x0131
        L_0x012f:
            android.widget.TextView r4 = r0.f16449c
        L_0x0131:
            if (r14 == 0) goto L_0x0136
            android.widget.TextView r7 = r0.f16449c
            goto L_0x0138
        L_0x0136:
            android.widget.TextView r7 = r0.f16448b
        L_0x0138:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.g) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            if (r13 == 0) goto L_0x014e
            android.widget.TextView r15 = r0.f16448b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0158
        L_0x014e:
            if (r14 == 0) goto L_0x015b
            android.widget.TextView r15 = r0.f16449c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015b
        L_0x0158:
            r17 = 1
            goto L_0x015d
        L_0x015b:
            r17 = 0
        L_0x015d:
            int r15 = r0.f16469w
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a5
            r6 = 80
            if (r15 == r6) goto L_0x0197
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f16464r
            r24 = r3
            int r3 = r15 + r12
            if (r6 >= r3) goto L_0x0180
            int r6 = r15 + r12
            goto L_0x0195
        L_0x0180:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f16465s
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0195
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0195:
            int r8 = r8 + r6
            goto L_0x01b4
        L_0x0197:
            r24 = r3
            r22 = r12
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f16465s
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01b4
        L_0x01a5:
            r24 = r3
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f16464r
            int r8 = r2 + r3
        L_0x01b4:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f16462p
        L_0x01ba:
            r2 = 1
            goto L_0x01be
        L_0x01bc:
            r1 = 0
            goto L_0x01ba
        L_0x01be:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f16448b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            android.widget.TextView r2 = r0.f16448b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f16448b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f16448b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f16463q
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f16449c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f16449c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f16449c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f16449c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f16463q
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r3 = r24
            goto L_0x0127
        L_0x0227:
            if (r17 == 0) goto L_0x022e
            int r2 = r0.f16462p
            r1 = r2
        L_0x022c:
            r2 = 0
            goto L_0x0230
        L_0x022e:
            r1 = 0
            goto L_0x022c
        L_0x0230:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r24 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0265
            android.widget.TextView r1 = r0.f16448b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            android.widget.TextView r4 = r0.f16448b
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.f16448b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f16448b
            r6.layout(r3, r8, r4, r5)
            int r6 = r0.f16463q
            int r4 = r4 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x0266
        L_0x0265:
            r4 = r3
        L_0x0266:
            if (r14 == 0) goto L_0x028a
            android.widget.TextView r1 = r0.f16449c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f16449c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r5 = r0.f16449c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f16449c
            r6.layout(r3, r8, r1, r5)
            int r5 = r0.f16463q
            int r1 = r1 + r5
            goto L_0x028b
        L_0x028a:
            r1 = r3
        L_0x028b:
            if (r17 == 0) goto L_0x0291
            int r3 = java.lang.Math.max(r4, r1)
        L_0x0291:
            java.util.ArrayList<android.view.View> r1 = r0.f16430D
            r4 = 3
            r0.b(r1, r4)
            java.util.ArrayList<android.view.View> r1 = r0.f16430D
            int r1 = r1.size()
            r4 = r3
            r3 = r2
        L_0x029f:
            if (r3 >= r1) goto L_0x02b2
            java.util.ArrayList<android.view.View> r5 = r0.f16430D
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.C(r5, r4, r11, r12)
            int r3 = r3 + 1
            goto L_0x029f
        L_0x02b2:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f16430D
            r3 = 5
            r0.b(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f16430D
            int r1 = r1.size()
            r3 = r2
        L_0x02c1:
            if (r3 >= r1) goto L_0x02d2
            java.util.ArrayList<android.view.View> r5 = r0.f16430D
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.D(r5, r10, r11, r12)
            int r3 = r3 + 1
            goto L_0x02c1
        L_0x02d2:
            java.util.ArrayList<android.view.View> r1 = r0.f16430D
            r3 = 1
            r0.b(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f16430D
            int r1 = r0.u(r1, r11)
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r6 = r18 + r3
            int r3 = r1 / 2
            int r6 = r6 - r3
            int r1 = r1 + r6
            if (r6 >= r4) goto L_0x02ed
            goto L_0x02f4
        L_0x02ed:
            if (r1 <= r10) goto L_0x02f3
            int r1 = r1 - r10
            int r4 = r6 - r1
            goto L_0x02f4
        L_0x02f3:
            r4 = r6
        L_0x02f4:
            java.util.ArrayList<android.view.View> r1 = r0.f16430D
            int r1 = r1.size()
        L_0x02fa:
            if (r2 >= r1) goto L_0x030b
            java.util.ArrayList<android.view.View> r3 = r0.f16430D
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.C(r3, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x02fa
        L_0x030b:
            java.util.ArrayList<android.view.View> r1 = r0.f16430D
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.f16432F;
        char b10 = U.b(this);
        int i19 = 0;
        char c10 = b10 ^ 1;
        if (P(this.f16450d)) {
            F(this.f16450d, i10, 0, i11, 0, this.f16461o);
            i14 = this.f16450d.getMeasuredWidth() + s(this.f16450d);
            i13 = Math.max(0, this.f16450d.getMeasuredHeight() + t(this.f16450d));
            i12 = View.combineMeasuredStates(0, this.f16450d.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (P(this.f16454h)) {
            F(this.f16454h, i10, 0, i11, 0, this.f16461o);
            i14 = this.f16454h.getMeasuredWidth() + s(this.f16454h);
            i13 = Math.max(i13, this.f16454h.getMeasuredHeight() + t(this.f16454h));
            i12 = View.combineMeasuredStates(i12, this.f16454h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i14);
        iArr[b10] = Math.max(0, currentContentInsetStart - i14);
        if (P(this.f16447a)) {
            F(this.f16447a, i10, max, i11, 0, this.f16461o);
            i15 = this.f16447a.getMeasuredWidth() + s(this.f16447a);
            i13 = Math.max(i13, this.f16447a.getMeasuredHeight() + t(this.f16447a));
            i12 = View.combineMeasuredStates(i12, this.f16447a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (P(this.f16455i)) {
            max2 += E(this.f16455i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f16455i.getMeasuredHeight() + t(this.f16455i));
            i12 = View.combineMeasuredStates(i12, this.f16455i.getMeasuredState());
        }
        if (P(this.f16451e)) {
            max2 += E(this.f16451e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f16451e.getMeasuredHeight() + t(this.f16451e));
            i12 = View.combineMeasuredStates(i12, this.f16451e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f16480b == 0 && P(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.f16464r + this.f16465s;
        int i22 = this.f16462p + this.f16463q;
        if (P(this.f16448b)) {
            E(this.f16448b, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f16448b.getMeasuredWidth() + s(this.f16448b);
            i16 = this.f16448b.getMeasuredHeight() + t(this.f16448b);
            i18 = View.combineMeasuredStates(i12, this.f16448b.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = 0;
            i18 = i12;
            i17 = 0;
        }
        if (P(this.f16449c)) {
            i17 = Math.max(i17, E(this.f16449c, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += this.f16449c.getMeasuredHeight() + t(this.f16449c);
            i18 = View.combineMeasuredStates(i18, this.f16449c.getMeasuredState());
        } else {
            int i23 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (!O()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f16447a;
        androidx.appcompat.view.menu.f N10 = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = iVar.f16481c;
        if (!(i10 == 0 || this.f16439M == null || N10 == null || (findItem = N10.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (iVar.f16482d) {
            H();
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        F f10 = this.f16466t;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        f10.f(z10);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f16439M;
        if (!(fVar == null || (hVar = fVar.f16478b) == null)) {
            iVar.f16481c = hVar.getItemId();
        }
        iVar.f16482d = B();
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16428B = false;
        }
        if (!this.f16428B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f16428B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f16428B = false;
        }
        return true;
    }

    public void removeMenuProvider(B b10) {
        this.f16433G.l(b10);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f16445S != z10) {
            this.f16445S = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(C5443a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f16442P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f16468v) {
            this.f16468v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f16467u) {
            this.f16467u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(C5443a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(C5443a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f16450d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f16435I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f16447a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f16457k != i10) {
            this.f16457k = i10;
            if (i10 == 0) {
                this.f16456j = getContext();
            } else {
                this.f16456j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f16465s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f16463q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f16462p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f16464r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        f fVar = this.f16439M;
        return (fVar == null || fVar.f16478b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f16447a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.f16434H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }

    public static class g extends a.C0226a {

        /* renamed from: b  reason: collision with root package name */
        int f16480b = 0;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f15537a = 8388627;
        }

        public g(g gVar) {
            super((a.C0226a) gVar);
            this.f16480b = gVar.f16480b;
        }

        public g(a.C0226a aVar) {
            super(aVar);
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16469w = 8388627;
        this.f16430D = new ArrayList<>();
        this.f16431E = new ArrayList<>();
        this.f16432F = new int[2];
        this.f16433G = new C4646z(new O(this));
        this.f16434H = new ArrayList<>();
        this.f16436J = new a();
        this.f16446T = new b();
        M v10 = M.v(getContext(), attributeSet, C5430j.f24092M2, i10, 0);
        C4600b0.n0(this, context, C5430j.f24092M2, attributeSet, v10.r(), i10, 0);
        this.f16458l = v10.n(C5430j.f24219o3, 0);
        this.f16459m = v10.n(C5430j.f24174f3, 0);
        this.f16469w = v10.l(C5430j.f24096N2, this.f16469w);
        this.f16460n = v10.l(C5430j.f24100O2, 48);
        int e10 = v10.e(C5430j.f24189i3, 0);
        e10 = v10.s(C5430j.f24214n3) ? v10.e(C5430j.f24214n3, e10) : e10;
        this.f16465s = e10;
        this.f16464r = e10;
        this.f16463q = e10;
        this.f16462p = e10;
        int e11 = v10.e(C5430j.f24204l3, -1);
        if (e11 >= 0) {
            this.f16462p = e11;
        }
        int e12 = v10.e(C5430j.f24199k3, -1);
        if (e12 >= 0) {
            this.f16463q = e12;
        }
        int e13 = v10.e(C5430j.f24209m3, -1);
        if (e13 >= 0) {
            this.f16464r = e13;
        }
        int e14 = v10.e(C5430j.f24194j3, -1);
        if (e14 >= 0) {
            this.f16465s = e14;
        }
        this.f16461o = v10.f(C5430j.f24144Z2, -1);
        int e15 = v10.e(C5430j.f24128V2, Integer.MIN_VALUE);
        int e16 = v10.e(C5430j.f24112R2, Integer.MIN_VALUE);
        int f10 = v10.f(C5430j.f24120T2, 0);
        int f11 = v10.f(C5430j.f24124U2, 0);
        h();
        this.f16466t.e(f10, f11);
        if (!(e15 == Integer.MIN_VALUE && e16 == Integer.MIN_VALUE)) {
            this.f16466t.g(e15, e16);
        }
        this.f16467u = v10.e(C5430j.f24132W2, Integer.MIN_VALUE);
        this.f16468v = v10.e(C5430j.f24116S2, Integer.MIN_VALUE);
        this.f16452f = v10.g(C5430j.f24108Q2);
        this.f16453g = v10.p(C5430j.f24104P2);
        CharSequence p10 = v10.p(C5430j.f24184h3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(C5430j.f24169e3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.f16456j = getContext();
        setPopupTheme(v10.n(C5430j.f24164d3, 0));
        Drawable g10 = v10.g(C5430j.f24159c3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(C5430j.f24154b3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(C5430j.f24136X2);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(C5430j.f24140Y2);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        if (v10.s(C5430j.f24224p3)) {
            setTitleTextColor(v10.c(C5430j.f24224p3));
        }
        if (v10.s(C5430j.f24179g3)) {
            setSubtitleTextColor(v10.c(C5430j.f24179g3));
        }
        if (v10.s(C5430j.f24149a3)) {
            x(v10.n(C5430j.f24149a3, 0));
        }
        v10.x();
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(B b10, C5221y yVar, r.b bVar) {
        this.f16433G.e(b10, yVar, bVar);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f16454h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f16454h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f16454h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f16452f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f16451e)) {
                c(this.f16451e, true);
            }
        } else {
            ImageView imageView = this.f16451e;
            if (imageView != null && z(imageView)) {
                removeView(this.f16451e);
                this.f16431E.remove(this.f16451e);
            }
        }
        ImageView imageView2 = this.f16451e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f16451e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f16450d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            S.a(this.f16450d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f16450d)) {
                c(this.f16450d, true);
            }
        } else {
            ImageButton imageButton = this.f16450d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f16450d);
                this.f16431E.remove(this.f16450d);
            }
        }
        ImageButton imageButton2 = this.f16450d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f16449c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f16449c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f16449c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f16459m;
                if (i10 != 0) {
                    this.f16449c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f16427A;
                if (colorStateList != null) {
                    this.f16449c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f16449c)) {
                c(this.f16449c, true);
            }
        } else {
            TextView textView = this.f16449c;
            if (textView != null && z(textView)) {
                removeView(this.f16449c);
                this.f16431E.remove(this.f16449c);
            }
        }
        TextView textView2 = this.f16449c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f16471y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f16427A = colorStateList;
        TextView textView = this.f16449c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f16448b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f16448b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f16448b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f16458l;
                if (i10 != 0) {
                    this.f16448b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f16472z;
                if (colorStateList != null) {
                    this.f16448b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f16448b)) {
                c(this.f16448b, true);
            }
        } else {
            TextView textView = this.f16448b;
            if (textView != null && z(textView)) {
                removeView(this.f16448b);
                this.f16431E.remove(this.f16448b);
            }
        }
        TextView textView2 = this.f16448b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f16470x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f16472z = colorStateList;
        TextView textView = this.f16448b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends O2.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f16481c;

        /* renamed from: d  reason: collision with root package name */
        boolean f16482d;

        class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            /* renamed from: c */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16481c = parcel.readInt();
            this.f16482d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f16481c);
            parcel.writeInt(this.f16482d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
