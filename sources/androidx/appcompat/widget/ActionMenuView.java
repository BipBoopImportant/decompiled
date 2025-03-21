package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sugarcube.app.base.data.source.CatalogRepository;

public class ActionMenuView extends LinearLayoutCompat implements f.b, l {

    /* renamed from: A  reason: collision with root package name */
    e f16040A;

    /* renamed from: p  reason: collision with root package name */
    private f f16041p;

    /* renamed from: q  reason: collision with root package name */
    private Context f16042q;

    /* renamed from: r  reason: collision with root package name */
    private int f16043r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f16044s;

    /* renamed from: t  reason: collision with root package name */
    private ActionMenuPresenter f16045t;

    /* renamed from: u  reason: collision with root package name */
    private k.a f16046u;

    /* renamed from: v  reason: collision with root package name */
    f.a f16047v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f16048w;

    /* renamed from: x  reason: collision with root package name */
    private int f16049x;

    /* renamed from: y  reason: collision with root package name */
    private int f16050y;

    /* renamed from: z  reason: collision with root package name */
    private int f16051z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements k.a {
        b() {
        }

        public void c(f fVar, boolean z10) {
        }

        public boolean d(f fVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f16052a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f16053b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f16054c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f16055d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f16056e;

        /* renamed from: f  reason: collision with root package name */
        boolean f16057f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f16052a = cVar.f16052a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f16052a = false;
        }
    }

    private class d implements f.a {
        d() {
        }

        public boolean a(f fVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f16040A;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        public void b(f fVar) {
            f.a aVar = ActionMenuView.this.f16047v;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    static int L(View view, int i10, int i11, int i12, int i13) {
        int i14;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.d();
        if (i11 > 0) {
            i14 = 2;
            if (!z11 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z11 || i15 >= 2) {
                    i14 = i15;
                }
                if (!cVar.f16052a && z11) {
                    z10 = true;
                }
                cVar.f16055d = z10;
                cVar.f16053b = i14;
                view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, CatalogRepository.FETCH_FLAG_SDB), makeMeasureSpec);
                return i14;
            }
        }
        i14 = 0;
        z10 = true;
        cVar.f16055d = z10;
        cVar.f16053b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, CatalogRepository.FETCH_FLAG_SDB), makeMeasureSpec);
        return i14;
    }

    private void M(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        boolean z13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.f16050y;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = i18 + (i20 / i19);
        int childCount = getChildCount();
        int i22 = 0;
        int i23 = 0;
        boolean z14 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j10 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            int i27 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i28 = i24 + 1;
                if (z15) {
                    int i29 = this.f16051z;
                    i16 = i28;
                    z13 = false;
                    childAt.setPadding(i29, 0, i29, 0);
                } else {
                    i16 = i28;
                    z13 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f16057f = z13;
                cVar.f16054c = z13 ? 1 : 0;
                cVar.f16053b = z13;
                cVar.f16055d = z13;
                cVar.leftMargin = z13;
                cVar.rightMargin = z13;
                cVar.f16056e = z15 && ((ActionMenuItemView) childAt).d();
                int L10 = L(childAt, i21, cVar.f16052a ? 1 : i19, childMeasureSpec, paddingTop);
                i25 = Math.max(i25, L10);
                if (cVar.f16055d) {
                    i26++;
                }
                if (cVar.f16052a) {
                    z14 = true;
                }
                i19 -= L10;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (L10 == 1) {
                    j10 |= (long) (1 << i23);
                    i22 = i22;
                } else {
                    int i30 = i22;
                }
                i24 = i16;
            }
            i23++;
            size2 = i27;
        }
        int i31 = size2;
        boolean z16 = z14 && i24 == 2;
        boolean z17 = false;
        while (true) {
            if (i26 <= 0 || i19 <= 0) {
                i14 = mode;
                i12 = i17;
                z10 = z17;
                i13 = i22;
            } else {
                int i32 = Integer.MAX_VALUE;
                int i33 = 0;
                int i34 = 0;
                long j11 = 0;
                while (i34 < childCount) {
                    boolean z18 = z17;
                    c cVar2 = (c) getChildAt(i34).getLayoutParams();
                    int i35 = i22;
                    if (cVar2.f16055d) {
                        int i36 = cVar2.f16053b;
                        if (i36 < i32) {
                            j11 = 1 << i34;
                            i32 = i36;
                            i33 = 1;
                        } else if (i36 == i32) {
                            i33++;
                            j11 |= 1 << i34;
                        }
                    }
                    i34++;
                    i22 = i35;
                    z17 = z18;
                }
                z10 = z17;
                i13 = i22;
                j10 |= j11;
                if (i33 > i19) {
                    i14 = mode;
                    i12 = i17;
                    break;
                }
                int i37 = i32 + 1;
                int i38 = 0;
                while (i38 < childCount) {
                    View childAt2 = getChildAt(i38);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i39 = i17;
                    int i40 = mode;
                    long j12 = (long) (1 << i38);
                    if ((j11 & j12) == 0) {
                        if (cVar3.f16053b == i37) {
                            j10 |= j12;
                        }
                        z12 = z16;
                    } else {
                        if (!z16 || !cVar3.f16056e || i19 != 1) {
                            z12 = z16;
                        } else {
                            int i41 = this.f16051z;
                            z12 = z16;
                            childAt2.setPadding(i41 + i21, 0, i41, 0);
                        }
                        cVar3.f16053b++;
                        cVar3.f16057f = true;
                        i19--;
                    }
                    i38++;
                    mode = i40;
                    i17 = i39;
                    z16 = z12;
                }
                i22 = i13;
                z17 = true;
            }
        }
        boolean z19 = !z14 && i24 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i24 - 1 && !z19 && i25 <= 1)) {
            i15 = 0;
            z11 = z10;
        } else {
            float bitCount = (float) Long.bitCount(j10);
            if (!z19) {
                i15 = 0;
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f16056e) {
                    bitCount -= 0.5f;
                }
                int i42 = childCount - 1;
                if ((j10 & ((long) (1 << i42))) != 0 && !((c) getChildAt(i42).getLayoutParams()).f16056e) {
                    bitCount -= 0.5f;
                }
            } else {
                i15 = 0;
            }
            int i43 = bitCount > 0.0f ? (int) (((float) (i19 * i21)) / bitCount) : i15;
            z11 = z10;
            for (int i44 = i15; i44 < childCount; i44++) {
                if ((j10 & ((long) (1 << i44))) != 0) {
                    View childAt3 = getChildAt(i44);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f16054c = i43;
                        cVar4.f16057f = true;
                        if (i44 == 0 && !cVar4.f16056e) {
                            cVar4.leftMargin = (-i43) / 2;
                        }
                        z11 = true;
                    } else if (cVar4.f16052a) {
                        cVar4.f16054c = i43;
                        cVar4.f16057f = true;
                        cVar4.rightMargin = (-i43) / 2;
                        z11 = true;
                    } else {
                        if (i44 != 0) {
                            cVar4.leftMargin = i43 / 2;
                        }
                        if (i44 != childCount - 1) {
                            cVar4.rightMargin = i43 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i45 = i15; i45 < childCount; i45++) {
                View childAt4 = getChildAt(i45);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f16057f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f16053b * i21) + cVar5.f16054c, CatalogRepository.FETCH_FLAG_SDB), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, i14 != 1073741824 ? i13 : i31);
    }

    public void B() {
        ActionMenuPresenter actionMenuPresenter = this.f16045t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c C10 = m();
        C10.f16052a = true;
        return C10;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    public boolean H() {
        ActionMenuPresenter actionMenuPresenter = this.f16045t;
        return actionMenuPresenter != null && actionMenuPresenter.D();
    }

    public boolean I() {
        ActionMenuPresenter actionMenuPresenter = this.f16045t;
        return actionMenuPresenter != null && actionMenuPresenter.F();
    }

    public boolean J() {
        ActionMenuPresenter actionMenuPresenter = this.f16045t;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean K() {
        return this.f16044s;
    }

    public f N() {
        return this.f16041p;
    }

    public void O(k.a aVar, f.a aVar2) {
        this.f16046u = aVar;
        this.f16047v = aVar2;
    }

    public boolean P() {
        ActionMenuPresenter actionMenuPresenter = this.f16045t;
        return actionMenuPresenter != null && actionMenuPresenter.M();
    }

    public void a(f fVar) {
        this.f16041p = fVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean d(h hVar) {
        return this.f16041p.O(hVar, 0);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f16041p == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.f16041p = fVar;
            fVar.W(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f16045t = actionMenuPresenter;
            actionMenuPresenter.L(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f16045t;
            k.a aVar = this.f16046u;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.e(aVar);
            this.f16041p.c(this.f16045t, this.f16042q);
            this.f16045t.J(this);
        }
        return this.f16041p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f16045t.C();
    }

    public int getPopupTheme() {
        return this.f16043r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f16045t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.i(false);
            if (this.f16045t.G()) {
                this.f16045t.D();
                this.f16045t.M();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.f16048w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = U.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f16052a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + cVar.leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    G(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f16052a) {
                    int i26 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f16052a) {
                int i29 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = i29 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        f fVar;
        boolean z10 = this.f16048w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f16048w = z11;
        if (z10 != z11) {
            this.f16049x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.f16048w || (fVar = this.f16041p) == null || size == this.f16049x)) {
            this.f16049x = size;
            fVar.N(true);
        }
        int childCount = getChildCount();
        if (!this.f16048w || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                c cVar = (c) getChildAt(i12).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        M(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f16045t.I(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f16040A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f16045t.K(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f16044s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f16043r != i10) {
            this.f16043r = i10;
            if (i10 == 0) {
                this.f16042q = getContext();
            } else {
                this.f16042q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f16045t = actionMenuPresenter;
        actionMenuPresenter.J(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f16050y = (int) (56.0f * f10);
        this.f16051z = (int) (f10 * 4.0f);
        this.f16042q = context;
        this.f16043r = 0;
    }
}
