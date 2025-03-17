package com.google.android.material.navigation;

import Ea.C9068b;
import Ea.C9077k;
import Ea.C9078l;
import Fa.C9081a;
import I2.C0;
import I2.C4600b0;
import I2.C4632s;
import Qa.C9235b;
import Qa.C9236c;
import Qa.C9241h;
import Ua.C9286g;
import Ua.h;
import Ua.k;
import Ua.o;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.C4987b;
import androidx.appcompat.view.g;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.M;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.j;
import com.google.android.material.internal.k;
import com.google.android.material.internal.w;
import com.sugarcube.app.base.data.source.CatalogRepository;
import i.C5421a;
import j.C5443a;
import java.util.Objects;
import u2.C6012a;

public class NavigationView extends ScrimInsetsFrameLayout implements C9235b {

    /* renamed from: x  reason: collision with root package name */
    private static final int[] f67032x = {16842912};

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f67033y = {-16842910};

    /* renamed from: z  reason: collision with root package name */
    private static final int f67034z = C9077k.f59602l;

    /* renamed from: h  reason: collision with root package name */
    private final j f67035h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final k f67036i;

    /* renamed from: j  reason: collision with root package name */
    d f67037j;

    /* renamed from: k  reason: collision with root package name */
    private final int f67038k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final int[] f67039l;

    /* renamed from: m  reason: collision with root package name */
    private MenuInflater f67040m;

    /* renamed from: n  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f67041n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f67042o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f67043p;

    /* renamed from: q  reason: collision with root package name */
    private int f67044q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f67045r;

    /* renamed from: s  reason: collision with root package name */
    private final int f67046s;

    /* renamed from: t  reason: collision with root package name */
    private final o f67047t;

    /* renamed from: u  reason: collision with root package name */
    private final C9241h f67048u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C9236c f67049v;

    /* renamed from: w  reason: collision with root package name */
    private final DrawerLayout.e f67050w;

    class a extends DrawerLayout.h {
        a() {
        }

        public void a(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                C9236c g10 = navigationView.f67049v;
                Objects.requireNonNull(g10);
                view.post(new d(g10));
            }
        }

        public void b(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.f67049v.f();
                NavigationView.this.t();
            }
        }
    }

    class b implements f.a {
        b() {
        }

        public boolean a(f fVar, MenuItem menuItem) {
            d dVar = NavigationView.this.f67037j;
            return dVar != null && dVar.a(menuItem);
        }

        public void b(f fVar) {
        }
    }

    class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f67039l);
            boolean z10 = true;
            boolean z11 = NavigationView.this.f67039l[1] == 0;
            NavigationView.this.f67036i.D(z11);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z11 && navigationView2.r());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.f67039l[0] == 0 || NavigationView.this.f67039l[0] + NavigationView.this.getWidth() == 0);
            Activity a10 = com.google.android.material.internal.c.a(NavigationView.this.getContext());
            if (a10 != null) {
                Rect a11 = w.a(a10);
                boolean z12 = a11.height() - NavigationView.this.getHeight() == NavigationView.this.f67039l[1];
                boolean z13 = Color.alpha(a10.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z12 && z13 && navigationView3.q());
                if (!(a11.width() == NavigationView.this.f67039l[0] || a11.width() - NavigationView.this.getWidth() == NavigationView.this.f67039l[0])) {
                    z10 = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z10);
            }
        }
    }

    public interface d {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59316V);
    }

    private MenuInflater getMenuInflater() {
        if (this.f67040m == null) {
            this.f67040m = new g(getContext());
        }
        return this.f67040m;
    }

    private ColorStateList k(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList a10 = C5443a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C5421a.f23910y, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = a10.getDefaultColor();
        int[] iArr = f67033y;
        return new ColorStateList(new int[][]{iArr, f67032x, FrameLayout.EMPTY_STATE_SET}, new int[]{a10.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    private Drawable l(M m10) {
        return m(m10, Ra.c.b(getContext(), m10, C9078l.f59744L5));
    }

    private Drawable m(M m10, ColorStateList colorStateList) {
        C9286g gVar = new C9286g(Ua.k.b(getContext(), m10.n(C9078l.f59722J5, 0), m10.n(C9078l.f59733K5, 0)).m());
        gVar.b0(colorStateList);
        return new InsetDrawable(gVar, m10.f(C9078l.f59776O5, 0), m10.f(C9078l.f59786P5, 0), m10.f(C9078l.f59766N5, 0), m10.f(C9078l.f59755M5, 0));
    }

    private boolean n(M m10) {
        return m10.s(C9078l.f59722J5) || m10.s(C9078l.f59733K5);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: private */
    public void t() {
        if (this.f67045r && this.f67044q != 0) {
            this.f67044q = 0;
            u(getWidth(), getHeight());
        }
    }

    private void u(int i10, int i11) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.f)) {
            if ((this.f67044q > 0 || this.f67045r) && (getBackground() instanceof C9286g)) {
                boolean z10 = C4632s.b(((DrawerLayout.f) getLayoutParams()).f21520a, C4600b0.z(this)) == 3;
                C9286g gVar = (C9286g) getBackground();
                k.b o10 = gVar.E().v().o((float) this.f67044q);
                if (z10) {
                    o10.A(0.0f);
                    o10.s(0.0f);
                } else {
                    o10.E(0.0f);
                    o10.w(0.0f);
                }
                Ua.k m10 = o10.m();
                gVar.setShapeAppearanceModel(m10);
                this.f67047t.f(this, m10);
                this.f67047t.e(this, new RectF(0.0f, 0.0f, (float) i10, (float) i11));
                this.f67047t.h(this, true);
            }
        }
    }

    private Pair<DrawerLayout, DrawerLayout.f> v() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.f)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.f) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void w() {
        this.f67041n = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f67041n);
    }

    public void a() {
        v();
        this.f67048u.f();
        t();
    }

    public void b(C4987b bVar) {
        v();
        this.f67048u.j(bVar);
    }

    public void c(C4987b bVar) {
        this.f67048u.l(bVar, ((DrawerLayout.f) v().second).f21520a);
        if (this.f67045r) {
            this.f67044q = C9081a.c(0, this.f67046s, this.f67048u.a(bVar.a()));
            u(getWidth(), getHeight());
        }
    }

    public void d() {
        Pair<DrawerLayout, DrawerLayout.f> v10 = v();
        DrawerLayout drawerLayout = (DrawerLayout) v10.first;
        C4987b c10 = this.f67048u.c();
        if (c10 == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.d(this);
            return;
        }
        this.f67048u.h(c10, ((DrawerLayout.f) v10.second).f21520a, b.b(drawerLayout, this), b.c(drawerLayout));
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        this.f67047t.d(canvas, new c(this));
    }

    /* access modifiers changed from: protected */
    public void e(C0 c02) {
        this.f67036i.m(c02);
    }

    /* access modifiers changed from: package-private */
    public C9241h getBackHelper() {
        return this.f67048u;
    }

    public MenuItem getCheckedItem() {
        return this.f67036i.n();
    }

    public int getDividerInsetEnd() {
        return this.f67036i.o();
    }

    public int getDividerInsetStart() {
        return this.f67036i.p();
    }

    public int getHeaderCount() {
        return this.f67036i.q();
    }

    public Drawable getItemBackground() {
        return this.f67036i.r();
    }

    public int getItemHorizontalPadding() {
        return this.f67036i.s();
    }

    public int getItemIconPadding() {
        return this.f67036i.t();
    }

    public ColorStateList getItemIconTintList() {
        return this.f67036i.w();
    }

    public int getItemMaxLines() {
        return this.f67036i.u();
    }

    public ColorStateList getItemTextColor() {
        return this.f67036i.v();
    }

    public int getItemVerticalPadding() {
        return this.f67036i.x();
    }

    public Menu getMenu() {
        return this.f67035h;
    }

    public int getSubheaderInsetEnd() {
        return this.f67036i.z();
    }

    public int getSubheaderInsetStart() {
        return this.f67036i.A();
    }

    public View o(int i10) {
        return this.f67036i.C(i10);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f67049v.b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.M(this.f67050w);
            drawerLayout.a(this.f67050w);
            if (drawerLayout.B(this)) {
                this.f67049v.e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f67041n);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).M(this.f67050w);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f67038k), CatalogRepository.FETCH_FLAG_SDB);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f67038k, CatalogRepository.FETCH_FLAG_SDB);
        }
        super.onMeasure(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        this.f67035h.T(eVar.f67054c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.f67054c = bundle;
        this.f67035h.V(bundle);
        return eVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        u(i10, i11);
    }

    public void p(int i10) {
        this.f67036i.Y(true);
        getMenuInflater().inflate(i10, this.f67035h);
        this.f67036i.Y(false);
        this.f67036i.i(false);
    }

    public boolean q() {
        return this.f67043p;
    }

    public boolean r() {
        return this.f67042o;
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f67043p = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem findItem = this.f67035h.findItem(i10);
        if (findItem != null) {
            this.f67036i.E((androidx.appcompat.view.menu.h) findItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        this.f67036i.F(i10);
    }

    public void setDividerInsetStart(int i10) {
        this.f67036i.G(i10);
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setForceCompatClippingEnabled(boolean z10) {
        this.f67047t.g(this, z10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f67036i.I(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(C6012a.e(getContext(), i10));
    }

    public void setItemHorizontalPadding(int i10) {
        this.f67036i.K(i10);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        this.f67036i.K(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(int i10) {
        this.f67036i.L(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f67036i.L(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(int i10) {
        this.f67036i.M(i10);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f67036i.N(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f67036i.O(i10);
    }

    public void setItemTextAppearance(int i10) {
        this.f67036i.P(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f67036i.Q(z10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f67036i.R(colorStateList);
    }

    public void setItemVerticalPadding(int i10) {
        this.f67036i.S(i10);
    }

    public void setItemVerticalPaddingResource(int i10) {
        this.f67036i.S(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(d dVar) {
        this.f67037j = dVar;
    }

    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        com.google.android.material.internal.k kVar = this.f67036i;
        if (kVar != null) {
            kVar.T(i10);
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        this.f67036i.V(i10);
    }

    public void setSubheaderInsetStart(int i10) {
        this.f67036i.W(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f67042o = z10;
    }

    public static class e extends O2.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f67054c;

        class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            /* renamed from: c */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f67054c = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f67054c);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f67034z
            r1 = r17
            android.content.Context r1 = Xa.C9359a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.internal.k r10 = new com.google.android.material.internal.k
            r10.<init>()
            r0.f67036i = r10
            r1 = 2
            int[] r1 = new int[r1]
            r0.f67039l = r1
            r11 = 1
            r0.f67042o = r11
            r0.f67043p = r11
            r12 = 0
            r0.f67044q = r12
            Ua.o r1 = Ua.o.a(r16)
            r0.f67047t = r1
            Qa.h r1 = new Qa.h
            r1.<init>(r0)
            r0.f67048u = r1
            Qa.c r1 = new Qa.c
            r1.<init>(r0)
            r0.f67049v = r1
            com.google.android.material.navigation.NavigationView$a r1 = new com.google.android.material.navigation.NavigationView$a
            r1.<init>()
            r0.f67050w = r1
            android.content.Context r13 = r16.getContext()
            com.google.android.material.internal.j r14 = new com.google.android.material.internal.j
            r14.<init>(r13)
            r0.f67035h = r14
            int[] r3 = Ea.C9078l.f60094s5
            int[] r6 = new int[r12]
            r1 = r13
            r2 = r18
            r4 = r19
            r5 = r9
            androidx.appcompat.widget.M r1 = com.google.android.material.internal.s.j(r1, r2, r3, r4, r5, r6)
            int r2 = Ea.C9078l.f60105t5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x006a
            int r2 = Ea.C9078l.f60105t5
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            I2.C4600b0.t0(r0, r2)
        L_0x006a:
            int r2 = Ea.C9078l.f60171z5
            int r2 = r1.f(r2, r12)
            r0.f67044q = r2
            if (r2 != 0) goto L_0x0076
            r2 = r11
            goto L_0x0077
        L_0x0076:
            r2 = r12
        L_0x0077:
            r0.f67045r = r2
            android.content.res.Resources r2 = r16.getResources()
            int r3 = Ea.C9070d.f59445z
            int r2 = r2.getDimensionPixelSize(r3)
            r0.f67046s = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            android.content.res.ColorStateList r3 = com.google.android.material.drawable.d.f(r2)
            if (r2 == 0) goto L_0x0091
            if (r3 == 0) goto L_0x00a9
        L_0x0091:
            Ua.k$b r2 = Ua.k.e(r13, r7, r8, r9)
            Ua.k r2 = r2.m()
            Ua.g r4 = new Ua.g
            r4.<init>((Ua.k) r2)
            if (r3 == 0) goto L_0x00a3
            r4.b0(r3)
        L_0x00a3:
            r4.Q(r13)
            I2.C4600b0.t0(r0, r4)
        L_0x00a9:
            int r2 = Ea.C9078l.f59623A5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x00bb
            int r2 = Ea.C9078l.f59623A5
            int r2 = r1.f(r2, r12)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00bb:
            int r2 = Ea.C9078l.f60116u5
            boolean r2 = r1.a(r2, r12)
            r0.setFitsSystemWindows(r2)
            int r2 = Ea.C9078l.f60127v5
            int r2 = r1.f(r2, r12)
            r0.f67038k = r2
            int r2 = Ea.C9078l.f59846V5
            boolean r2 = r1.s(r2)
            r3 = 0
            if (r2 == 0) goto L_0x00dc
            int r2 = Ea.C9078l.f59846V5
            android.content.res.ColorStateList r2 = r1.c(r2)
            goto L_0x00dd
        L_0x00dc:
            r2 = r3
        L_0x00dd:
            int r4 = Ea.C9078l.f59876Y5
            boolean r4 = r1.s(r4)
            if (r4 == 0) goto L_0x00ec
            int r4 = Ea.C9078l.f59876Y5
            int r4 = r1.n(r4, r12)
            goto L_0x00ed
        L_0x00ec:
            r4 = r12
        L_0x00ed:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r4 != 0) goto L_0x00f8
            if (r2 != 0) goto L_0x00f8
            android.content.res.ColorStateList r2 = r0.k(r5)
        L_0x00f8:
            int r6 = Ea.C9078l.f59689G5
            boolean r6 = r1.s(r6)
            if (r6 == 0) goto L_0x0107
            int r5 = Ea.C9078l.f59689G5
            android.content.res.ColorStateList r5 = r1.c(r5)
            goto L_0x010b
        L_0x0107:
            android.content.res.ColorStateList r5 = r0.k(r5)
        L_0x010b:
            int r6 = Ea.C9078l.f59796Q5
            boolean r6 = r1.s(r6)
            if (r6 == 0) goto L_0x011a
            int r6 = Ea.C9078l.f59796Q5
            int r6 = r1.n(r6, r12)
            goto L_0x011b
        L_0x011a:
            r6 = r12
        L_0x011b:
            int r7 = Ea.C9078l.f59806R5
            boolean r7 = r1.a(r7, r11)
            int r8 = Ea.C9078l.f59678F5
            boolean r8 = r1.s(r8)
            if (r8 == 0) goto L_0x0132
            int r8 = Ea.C9078l.f59678F5
            int r8 = r1.f(r8, r12)
            r0.setItemIconSize(r8)
        L_0x0132:
            int r8 = Ea.C9078l.f59816S5
            boolean r8 = r1.s(r8)
            if (r8 == 0) goto L_0x0141
            int r8 = Ea.C9078l.f59816S5
            android.content.res.ColorStateList r8 = r1.c(r8)
            goto L_0x0142
        L_0x0141:
            r8 = r3
        L_0x0142:
            if (r6 != 0) goto L_0x014d
            if (r8 != 0) goto L_0x014d
            r8 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r8 = r0.k(r8)
        L_0x014d:
            int r9 = Ea.C9078l.f59645C5
            android.graphics.drawable.Drawable r9 = r1.g(r9)
            if (r9 != 0) goto L_0x0177
            boolean r15 = r0.n(r1)
            if (r15 == 0) goto L_0x0177
            android.graphics.drawable.Drawable r9 = r0.l(r1)
            int r15 = Ea.C9078l.f59711I5
            android.content.res.ColorStateList r15 = Ra.c.b(r13, r1, r15)
            if (r15 == 0) goto L_0x0177
            android.graphics.drawable.Drawable r11 = r0.m(r1, r3)
            android.graphics.drawable.RippleDrawable r12 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r15 = Sa.C9270b.d(r15)
            r12.<init>(r15, r3, r11)
            r10.J(r12)
        L_0x0177:
            int r3 = Ea.C9078l.f59656D5
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x018a
            int r3 = Ea.C9078l.f59656D5
            r11 = 0
            int r3 = r1.f(r3, r11)
            r0.setItemHorizontalPadding(r3)
            goto L_0x018b
        L_0x018a:
            r11 = 0
        L_0x018b:
            int r3 = Ea.C9078l.f59826T5
            boolean r3 = r1.s(r3)
            if (r3 == 0) goto L_0x019c
            int r3 = Ea.C9078l.f59826T5
            int r3 = r1.f(r3, r11)
            r0.setItemVerticalPadding(r3)
        L_0x019c:
            int r3 = Ea.C9078l.f60160y5
            int r3 = r1.f(r3, r11)
            r0.setDividerInsetStart(r3)
            int r3 = Ea.C9078l.f60149x5
            int r3 = r1.f(r3, r11)
            r0.setDividerInsetEnd(r3)
            int r3 = Ea.C9078l.f59866X5
            int r3 = r1.f(r3, r11)
            r0.setSubheaderInsetStart(r3)
            int r3 = Ea.C9078l.f59856W5
            int r3 = r1.f(r3, r11)
            r0.setSubheaderInsetEnd(r3)
            int r3 = Ea.C9078l.f59886Z5
            boolean r12 = r0.f67042o
            boolean r3 = r1.a(r3, r12)
            r0.setTopInsetScrimEnabled(r3)
            int r3 = Ea.C9078l.f60138w5
            boolean r12 = r0.f67043p
            boolean r3 = r1.a(r3, r12)
            r0.setBottomInsetScrimEnabled(r3)
            int r3 = Ea.C9078l.f59667E5
            int r3 = r1.f(r3, r11)
            int r11 = Ea.C9078l.f59700H5
            r12 = 1
            int r11 = r1.k(r11, r12)
            r0.setItemMaxLines(r11)
            com.google.android.material.navigation.NavigationView$b r11 = new com.google.android.material.navigation.NavigationView$b
            r11.<init>()
            r14.W(r11)
            r10.H(r12)
            r10.l(r13, r14)
            if (r4 == 0) goto L_0x01f9
            r10.X(r4)
        L_0x01f9:
            r10.U(r2)
            r10.N(r5)
            int r2 = r16.getOverScrollMode()
            r10.T(r2)
            if (r6 == 0) goto L_0x020b
            r10.P(r6)
        L_0x020b:
            r10.Q(r7)
            r10.R(r8)
            r10.I(r9)
            r10.L(r3)
            r14.b(r10)
            androidx.appcompat.view.menu.l r2 = r10.y(r0)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            int r2 = Ea.C9078l.f59836U5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0236
            int r2 = Ea.C9078l.f59836U5
            r3 = 0
            int r2 = r1.n(r2, r3)
            r0.p(r2)
            goto L_0x0237
        L_0x0236:
            r3 = 0
        L_0x0237:
            int r2 = Ea.C9078l.f59634B5
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L_0x0248
            int r2 = Ea.C9078l.f59634B5
            int r2 = r1.n(r2, r3)
            r0.o(r2)
        L_0x0248:
            r1.x()
            r16.w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f67035h.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f67036i.E((androidx.appcompat.view.menu.h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
