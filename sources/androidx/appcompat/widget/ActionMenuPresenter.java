package androidx.appcompat.widget;

import I2.C4599b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import i.C5421a;
import i.C5427g;
import java.util.ArrayList;
import n.C5577b;
import y2.C6260a;

class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements C4599b.a {

    /* renamed from: A  reason: collision with root package name */
    c f16010A;

    /* renamed from: B  reason: collision with root package name */
    private b f16011B;

    /* renamed from: C  reason: collision with root package name */
    final e f16012C = new e();

    /* renamed from: D  reason: collision with root package name */
    int f16013D;

    /* renamed from: k  reason: collision with root package name */
    OverflowMenuButton f16014k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f16015l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f16016m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16017n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f16018o;

    /* renamed from: p  reason: collision with root package name */
    private int f16019p;

    /* renamed from: q  reason: collision with root package name */
    private int f16020q;

    /* renamed from: r  reason: collision with root package name */
    private int f16021r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f16022s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f16023t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f16024u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f16025v;

    /* renamed from: w  reason: collision with root package name */
    private int f16026w;

    /* renamed from: x  reason: collision with root package name */
    private final SparseBooleanArray f16027x = new SparseBooleanArray();

    /* renamed from: y  reason: collision with root package name */
    d f16028y;

    /* renamed from: z  reason: collision with root package name */
    a f16029z;

    private class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.a {

        class a extends A {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f16031j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f16031j = actionMenuPresenter;
            }

            public C5577b b() {
                d dVar = ActionMenuPresenter.this.f16028y;
                if (dVar == null) {
                    return null;
                }
                return dVar.c();
            }

            public boolean c() {
                ActionMenuPresenter.this.M();
                return true;
            }

            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f16010A != null) {
                    return false;
                }
                actionMenuPresenter.D();
                return true;
            }
        }

        public OverflowMenuButton(Context context) {
            super(context, (AttributeSet) null, C5421a.f23896k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            S.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.M();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C6260a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class a extends j {
        public a(Context context, o oVar, View view) {
            super(context, oVar, view, false, C5421a.f23897l);
            if (!((h) oVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.f16014k;
                f(view2 == null ? (View) ActionMenuPresenter.this.f15762i : view2);
            }
            j(ActionMenuPresenter.this.f16012C);
        }

        /* access modifiers changed from: protected */
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f16029z = null;
            actionMenuPresenter.f16013D = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        public C5577b a() {
            a aVar = ActionMenuPresenter.this.f16029z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private d f16035a;

        public c(d dVar) {
            this.f16035a = dVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f15756c != null) {
                ActionMenuPresenter.this.f15756c.d();
            }
            View view = (View) ActionMenuPresenter.this.f15762i;
            if (!(view == null || view.getWindowToken() == null || !this.f16035a.m())) {
                ActionMenuPresenter.this.f16028y = this.f16035a;
            }
            ActionMenuPresenter.this.f16010A = null;
        }
    }

    private class d extends j {
        public d(Context context, androidx.appcompat.view.menu.f fVar, View view, boolean z10) {
            super(context, fVar, view, z10, C5421a.f23897l);
            h(8388613);
            j(ActionMenuPresenter.this.f16012C);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (ActionMenuPresenter.this.f15756c != null) {
                ActionMenuPresenter.this.f15756c.close();
            }
            ActionMenuPresenter.this.f16028y = null;
            super.e();
        }
    }

    private class e implements k.a {
        e() {
        }

        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof o) {
                fVar.F().e(false);
            }
            k.a o10 = ActionMenuPresenter.this.o();
            if (o10 != null) {
                o10.c(fVar, z10);
            }
        }

        public boolean d(androidx.appcompat.view.menu.f fVar) {
            if (fVar == ActionMenuPresenter.this.f15756c) {
                return false;
            }
            ActionMenuPresenter.this.f16013D = ((o) fVar).getItem().getItemId();
            k.a o10 = ActionMenuPresenter.this.o();
            if (o10 != null) {
                return o10.d(fVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    private static class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f16039a;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f16039a);
        }

        f(Parcel parcel) {
            this.f16039a = parcel.readInt();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C5427g.f24009c, C5427g.f24008b);
    }

    private View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f15762i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof l.a) && ((l.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        return D() | E();
    }

    public Drawable C() {
        OverflowMenuButton overflowMenuButton = this.f16014k;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.f16016m) {
            return this.f16015l;
        }
        return null;
    }

    public boolean D() {
        l lVar;
        c cVar = this.f16010A;
        if (cVar == null || (lVar = this.f15762i) == null) {
            d dVar = this.f16028y;
            if (dVar == null) {
                return false;
            }
            dVar.b();
            return true;
        }
        ((View) lVar).removeCallbacks(cVar);
        this.f16010A = null;
        return true;
    }

    public boolean E() {
        a aVar = this.f16029z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.f16010A != null || G();
    }

    public boolean G() {
        d dVar = this.f16028y;
        return dVar != null && dVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f16022s) {
            this.f16021r = androidx.appcompat.view.a.b(this.f15755b).d();
        }
        androidx.appcompat.view.menu.f fVar = this.f15756c;
        if (fVar != null) {
            fVar.N(true);
        }
    }

    public void I(boolean z10) {
        this.f16025v = z10;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f15762i = actionMenuView;
        actionMenuView.a(this.f15756c);
    }

    public void K(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.f16014k;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
            return;
        }
        this.f16016m = true;
        this.f16015l = drawable;
    }

    public void L(boolean z10) {
        this.f16017n = z10;
        this.f16018o = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.f16017n || G() || (fVar = this.f15756c) == null || this.f15762i == null || this.f16010A != null || fVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new d(this.f15755b, this.f15756c, this.f16014k, true));
        this.f16010A = cVar;
        ((View) this.f15762i).post(cVar);
        return true;
    }

    public void b(h hVar, l.a aVar) {
        aVar.c(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f15762i);
        if (this.f16011B == null) {
            this.f16011B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f16011B);
    }

    public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        A();
        super.c(fVar, z10);
    }

    public void f(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof f) && (i10 = ((f) parcelable).f16039a) > 0 && (findItem = this.f15756c.findItem(i10)) != null) {
            g((o) findItem.getSubMenu());
        }
    }

    public boolean g(o oVar) {
        boolean z10 = false;
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        o oVar2 = oVar;
        while (oVar2.j0() != this.f15756c) {
            oVar2 = (o) oVar2.j0();
        }
        View B10 = B(oVar2.getItem());
        if (B10 == null) {
            return false;
        }
        this.f16013D = oVar.getItem().getItemId();
        int size = oVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = oVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f15755b, oVar, B10);
        this.f16029z = aVar;
        aVar.g(z10);
        this.f16029z.k();
        super.g(oVar);
        return true;
    }

    public Parcelable h() {
        f fVar = new f();
        fVar.f16039a = this.f16013D;
        return fVar;
    }

    public void i(boolean z10) {
        l lVar;
        super.i(z10);
        ((View) this.f15762i).requestLayout();
        androidx.appcompat.view.menu.f fVar = this.f15756c;
        boolean z11 = false;
        if (fVar != null) {
            ArrayList<h> u10 = fVar.u();
            int size = u10.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4599b a10 = u10.get(i10).a();
                if (a10 != null) {
                    a10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.f fVar2 = this.f15756c;
        ArrayList<h> B10 = fVar2 != null ? fVar2.B() : null;
        if (this.f16017n && B10 != null) {
            int size2 = B10.size();
            if (size2 == 1) {
                z11 = !B10.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f16014k == null) {
                this.f16014k = new OverflowMenuButton(this.f15754a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f16014k.getParent();
            if (viewGroup != this.f15762i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f16014k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f15762i;
                actionMenuView.addView(this.f16014k, actionMenuView.F());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.f16014k;
            if (overflowMenuButton != null && overflowMenuButton.getParent() == (lVar = this.f15762i)) {
                ((ViewGroup) lVar).removeView(this.f16014k);
            }
        }
        ((ActionMenuView) this.f15762i).setOverflowReserved(this.f16017n);
    }

    public boolean j() {
        int i10;
        ArrayList<h> arrayList;
        int i11;
        int i12;
        int i13;
        boolean z10;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.f fVar = actionMenuPresenter.f15756c;
        View view = null;
        boolean z11 = false;
        if (fVar != null) {
            arrayList = fVar.G();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = actionMenuPresenter.f16021r;
        int i15 = actionMenuPresenter.f16020q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f15762i;
        boolean z12 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            h hVar = arrayList.get(i18);
            if (hVar.o()) {
                i16++;
            } else if (hVar.n()) {
                i17++;
            } else {
                z12 = true;
            }
            if (actionMenuPresenter.f16025v && hVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (actionMenuPresenter.f16017n && (z12 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f16027x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f16023t) {
            int i20 = actionMenuPresenter.f16026w;
            i11 = i15 / i20;
            i12 = i20 + ((i15 % i20) / i11);
        } else {
            i12 = 0;
            i11 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            h hVar2 = arrayList.get(i21);
            if (hVar2.o()) {
                View p10 = actionMenuPresenter.p(hVar2, view, viewGroup);
                if (actionMenuPresenter.f16023t) {
                    i11 -= ActionMenuView.L(p10, i12, i11, makeMeasureSpec, z11 ? 1 : 0);
                } else {
                    p10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = p10.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = hVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                hVar2.u(true);
                z10 = z11;
                i13 = i10;
            } else if (hVar2.n()) {
                int groupId2 = hVar2.getGroupId();
                boolean z13 = sparseBooleanArray.get(groupId2);
                boolean z14 = (i19 > 0 || z13) && i15 > 0 && (!actionMenuPresenter.f16023t || i11 > 0);
                boolean z15 = z14;
                i13 = i10;
                if (z14) {
                    View p11 = actionMenuPresenter.p(hVar2, (View) null, viewGroup);
                    if (actionMenuPresenter.f16023t) {
                        int L10 = ActionMenuView.L(p11, i12, i11, makeMeasureSpec, 0);
                        i11 -= L10;
                        if (L10 == 0) {
                            z15 = false;
                        }
                    } else {
                        p11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z16 = z15;
                    int measuredWidth2 = p11.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z14 = z16 & (!actionMenuPresenter.f16023t ? i15 + i22 > 0 : i15 >= 0);
                }
                if (z14 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z13) {
                    sparseBooleanArray.put(groupId2, false);
                    int i23 = 0;
                    while (i23 < i21) {
                        h hVar3 = arrayList.get(i23);
                        if (hVar3.getGroupId() == groupId2) {
                            if (hVar3.l()) {
                                i19++;
                            }
                            hVar3.u(false);
                        }
                        i23++;
                    }
                }
                if (z14) {
                    i19--;
                }
                hVar2.u(z14);
                z10 = false;
            } else {
                z10 = z11;
                i13 = i10;
                hVar2.u(z10);
            }
            i21++;
            z11 = z10;
            i10 = i13;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    public void l(Context context, androidx.appcompat.view.menu.f fVar) {
        super.l(context, fVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(context);
        if (!this.f16018o) {
            this.f16017n = b10.h();
        }
        if (!this.f16024u) {
            this.f16019p = b10.c();
        }
        if (!this.f16022s) {
            this.f16021r = b10.d();
        }
        int i10 = this.f16019p;
        if (this.f16017n) {
            if (this.f16014k == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f15754a);
                this.f16014k = overflowMenuButton;
                if (this.f16016m) {
                    overflowMenuButton.setImageDrawable(this.f16015l);
                    this.f16015l = null;
                    this.f16016m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f16014k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f16014k.getMeasuredWidth();
        } else {
            this.f16014k = null;
        }
        this.f16020q = i10;
        this.f16026w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean n(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f16014k) {
            return false;
        }
        return super.n(viewGroup, i10);
    }

    public View p(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.j()) {
            actionView = super.p(hVar, view, viewGroup);
        }
        actionView.setVisibility(hVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public l q(ViewGroup viewGroup) {
        l lVar = this.f15762i;
        l q10 = super.q(viewGroup);
        if (lVar != q10) {
            ((ActionMenuView) q10).setPresenter(this);
        }
        return q10;
    }

    public boolean s(int i10, h hVar) {
        return hVar.l();
    }
}
