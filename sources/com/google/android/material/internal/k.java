package com.google.android.material.internal;

import Ea.C9070d;
import Ea.C9074h;
import I2.C0;
import I2.C4597a;
import I2.C4600b0;
import J2.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import java.util.ArrayList;

public class k implements androidx.appcompat.view.menu.k {

    /* renamed from: A  reason: collision with root package name */
    private int f66949A;

    /* renamed from: B  reason: collision with root package name */
    int f66950B;

    /* renamed from: C  reason: collision with root package name */
    private int f66951C = -1;

    /* renamed from: D  reason: collision with root package name */
    final View.OnClickListener f66952D = new a();

    /* renamed from: a  reason: collision with root package name */
    private NavigationMenuView f66953a;

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f66954b;

    /* renamed from: c  reason: collision with root package name */
    private k.a f66955c;

    /* renamed from: d  reason: collision with root package name */
    androidx.appcompat.view.menu.f f66956d;

    /* renamed from: e  reason: collision with root package name */
    private int f66957e;

    /* renamed from: f  reason: collision with root package name */
    c f66958f;

    /* renamed from: g  reason: collision with root package name */
    LayoutInflater f66959g;

    /* renamed from: h  reason: collision with root package name */
    int f66960h = 0;

    /* renamed from: i  reason: collision with root package name */
    ColorStateList f66961i;

    /* renamed from: j  reason: collision with root package name */
    int f66962j = 0;

    /* renamed from: k  reason: collision with root package name */
    boolean f66963k = true;

    /* renamed from: l  reason: collision with root package name */
    ColorStateList f66964l;

    /* renamed from: m  reason: collision with root package name */
    ColorStateList f66965m;

    /* renamed from: n  reason: collision with root package name */
    Drawable f66966n;

    /* renamed from: o  reason: collision with root package name */
    RippleDrawable f66967o;

    /* renamed from: p  reason: collision with root package name */
    int f66968p;

    /* renamed from: q  reason: collision with root package name */
    int f66969q;

    /* renamed from: r  reason: collision with root package name */
    int f66970r;

    /* renamed from: s  reason: collision with root package name */
    int f66971s;

    /* renamed from: t  reason: collision with root package name */
    int f66972t;

    /* renamed from: u  reason: collision with root package name */
    int f66973u;

    /* renamed from: v  reason: collision with root package name */
    int f66974v;

    /* renamed from: w  reason: collision with root package name */
    int f66975w;

    /* renamed from: x  reason: collision with root package name */
    boolean f66976x;

    /* renamed from: y  reason: collision with root package name */
    boolean f66977y = true;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public int f66978z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            boolean z10 = true;
            k.this.Y(true);
            androidx.appcompat.view.menu.h itemData = ((NavigationMenuItemView) view).getItemData();
            k kVar = k.this;
            boolean P10 = kVar.f66956d.P(itemData, kVar, 0);
            if (itemData == null || !itemData.isCheckable() || !P10) {
                z10 = false;
            } else {
                k.this.f66958f.o(itemData);
            }
            k.this.Y(false);
            if (z10) {
                k.this.i(false);
            }
        }
    }

    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    private class c extends RecyclerView.h<l> {

        /* renamed from: h  reason: collision with root package name */
        private final ArrayList<e> f66980h = new ArrayList<>();

        /* renamed from: i  reason: collision with root package name */
        private androidx.appcompat.view.menu.h f66981i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f66982j;

        class a extends C4597a {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f66984d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f66985e;

            a(int i10, boolean z10) {
                this.f66984d = i10;
                this.f66985e = z10;
            }

            public void g(View view, t tVar) {
                super.g(view, tVar);
                tVar.l0(t.f.a(c.this.d(this.f66984d), 1, 1, 1, this.f66985e, view.isSelected()));
            }
        }

        c() {
            l();
        }

        /* access modifiers changed from: private */
        public int d(int i10) {
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                if (k.this.f66958f.getItemViewType(i12) == 2 || k.this.f66958f.getItemViewType(i12) == 3) {
                    i11--;
                }
            }
            return i11;
        }

        private void e(int i10, int i11) {
            while (i10 < i11) {
                ((g) this.f66980h.get(i10)).f66990b = true;
                i10++;
            }
        }

        private void l() {
            if (!this.f66982j) {
                boolean z10 = true;
                this.f66982j = true;
                this.f66980h.clear();
                this.f66980h.add(new d());
                int size = k.this.f66956d.G().size();
                int i10 = -1;
                int i11 = 0;
                boolean z11 = false;
                int i12 = 0;
                while (i11 < size) {
                    androidx.appcompat.view.menu.h hVar = k.this.f66956d.G().get(i11);
                    if (hVar.isChecked()) {
                        o(hVar);
                    }
                    if (hVar.isCheckable()) {
                        hVar.t(false);
                    }
                    if (hVar.hasSubMenu()) {
                        SubMenu subMenu = hVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i11 != 0) {
                                this.f66980h.add(new f(k.this.f66950B, 0));
                            }
                            this.f66980h.add(new g(hVar));
                            int size2 = this.f66980h.size();
                            int size3 = subMenu.size();
                            int i13 = 0;
                            boolean z12 = false;
                            while (i13 < size3) {
                                androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) subMenu.getItem(i13);
                                if (hVar2.isVisible()) {
                                    if (!z12 && hVar2.getIcon() != null) {
                                        z12 = z10;
                                    }
                                    if (hVar2.isCheckable()) {
                                        hVar2.t(false);
                                    }
                                    if (hVar.isChecked()) {
                                        o(hVar);
                                    }
                                    this.f66980h.add(new g(hVar2));
                                }
                                i13++;
                                z10 = true;
                            }
                            if (z12) {
                                e(size2, this.f66980h.size());
                            }
                        }
                    } else {
                        int groupId = hVar.getGroupId();
                        if (groupId != i10) {
                            i12 = this.f66980h.size();
                            z11 = hVar.getIcon() != null;
                            if (i11 != 0) {
                                i12++;
                                ArrayList<e> arrayList = this.f66980h;
                                int i14 = k.this.f66950B;
                                arrayList.add(new f(i14, i14));
                            }
                        } else if (!z11 && hVar.getIcon() != null) {
                            e(i12, this.f66980h.size());
                            z11 = true;
                        }
                        g gVar = new g(hVar);
                        gVar.f66990b = z11;
                        this.f66980h.add(gVar);
                        i10 = groupId;
                    }
                    i11++;
                    z10 = true;
                }
                this.f66982j = false;
            }
        }

        private void n(View view, int i10, boolean z10) {
            C4600b0.p0(view, new a(i10, z10));
        }

        public Bundle f() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.h hVar = this.f66981i;
            if (hVar != null) {
                bundle.putInt("android:menu:checked", hVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f66980h.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f66980h.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.h a10 = ((g) eVar).a();
                    View actionView = a10 != null ? a10.getActionView() : null;
                    if (actionView != null) {
                        m mVar = new m();
                        actionView.saveHierarchyState(mVar);
                        sparseArray.put(a10.getItemId(), mVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.h g() {
            return this.f66981i;
        }

        public int getItemCount() {
            return this.f66980h.size();
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public int getItemViewType(int i10) {
            e eVar = this.f66980h.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* access modifiers changed from: package-private */
        public int h() {
            int i10 = 0;
            for (int i11 = 0; i11 < k.this.f66958f.getItemCount(); i11++) {
                int itemViewType = k.this.f66958f.getItemViewType(i11);
                if (itemViewType == 0 || itemViewType == 1) {
                    i10++;
                }
            }
            return i10;
        }

        /* renamed from: i */
        public void onBindViewHolder(l lVar, int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                navigationMenuItemView.setIconTintList(k.this.f66965m);
                navigationMenuItemView.setTextAppearance(k.this.f66962j);
                ColorStateList colorStateList = k.this.f66964l;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = k.this.f66966n;
                C4600b0.t0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                RippleDrawable rippleDrawable = k.this.f66967o;
                if (rippleDrawable != null) {
                    navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
                }
                g gVar = (g) this.f66980h.get(i10);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f66990b);
                k kVar = k.this;
                int i11 = kVar.f66968p;
                int i12 = kVar.f66969q;
                navigationMenuItemView.setPadding(i11, i12, i11, i12);
                navigationMenuItemView.setIconPadding(k.this.f66970r);
                k kVar2 = k.this;
                if (kVar2.f66976x) {
                    navigationMenuItemView.setIconSize(kVar2.f66971s);
                }
                navigationMenuItemView.setMaxLines(k.this.f66978z);
                navigationMenuItemView.D(gVar.a(), k.this.f66963k);
                n(navigationMenuItemView, i10, false);
            } else if (itemViewType == 1) {
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f66980h.get(i10)).a().getTitle());
                androidx.core.widget.i.p(textView, k.this.f66960h);
                textView.setPadding(k.this.f66974v, textView.getPaddingTop(), k.this.f66975w, textView.getPaddingBottom());
                ColorStateList colorStateList2 = k.this.f66961i;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
                n(textView, i10, true);
            } else if (itemViewType == 2) {
                f fVar = (f) this.f66980h.get(i10);
                lVar.itemView.setPadding(k.this.f66972t, fVar.b(), k.this.f66973u, fVar.a());
            }
        }

        /* renamed from: j */
        public l onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                k kVar = k.this;
                return new i(kVar.f66959g, viewGroup, kVar.f66952D);
            } else if (i10 == 1) {
                return new C1169k(k.this.f66959g, viewGroup);
            } else {
                if (i10 == 2) {
                    return new j(k.this.f66959g, viewGroup);
                }
                if (i10 != 3) {
                    return null;
                }
                return new b(k.this.f66954b);
            }
        }

        /* renamed from: k */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).E();
            }
        }

        public void m(Bundle bundle) {
            androidx.appcompat.view.menu.h a10;
            View actionView;
            m mVar;
            androidx.appcompat.view.menu.h a11;
            int i10 = bundle.getInt("android:menu:checked", 0);
            if (i10 != 0) {
                this.f66982j = true;
                int size = this.f66980h.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    e eVar = this.f66980h.get(i11);
                    if ((eVar instanceof g) && (a11 = ((g) eVar).a()) != null && a11.getItemId() == i10) {
                        o(a11);
                        break;
                    }
                    i11++;
                }
                this.f66982j = false;
                l();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f66980h.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    e eVar2 = this.f66980h.get(i12);
                    if (!(!(eVar2 instanceof g) || (a10 = ((g) eVar2).a()) == null || (actionView = a10.getActionView()) == null || (mVar = (m) sparseParcelableArray.get(a10.getItemId())) == null)) {
                        actionView.restoreHierarchyState(mVar);
                    }
                }
            }
        }

        public void o(androidx.appcompat.view.menu.h hVar) {
            if (this.f66981i != hVar && hVar.isCheckable()) {
                androidx.appcompat.view.menu.h hVar2 = this.f66981i;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.f66981i = hVar;
                hVar.setChecked(true);
            }
        }

        public void p(boolean z10) {
            this.f66982j = z10;
        }

        public void q() {
            l();
            notifyDataSetChanged();
        }
    }

    private static class d implements e {
        d() {
        }
    }

    private interface e {
    }

    private static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        private final int f66987a;

        /* renamed from: b  reason: collision with root package name */
        private final int f66988b;

        public f(int i10, int i11) {
            this.f66987a = i10;
            this.f66988b = i11;
        }

        public int a() {
            return this.f66988b;
        }

        public int b() {
            return this.f66987a;
        }
    }

    private static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.appcompat.view.menu.h f66989a;

        /* renamed from: b  reason: collision with root package name */
        boolean f66990b;

        g(androidx.appcompat.view.menu.h hVar) {
            this.f66989a = hVar;
        }

        public androidx.appcompat.view.menu.h a() {
            return this.f66989a;
        }
    }

    private class h extends v {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.k0(t.e.a(k.this.f66958f.h(), 1, false));
        }
    }

    private static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C9074h.f59522f, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C9074h.f59524h, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.k$k  reason: collision with other inner class name */
    private static class C1169k extends l {
        public C1169k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C9074h.f59525i, viewGroup, false));
        }
    }

    private static abstract class l extends RecyclerView.G {
        public l(View view) {
            super(view);
        }
    }

    private boolean B() {
        return q() > 0;
    }

    private void Z() {
        int i10 = (B() || !this.f66977y) ? 0 : this.f66949A;
        NavigationMenuView navigationMenuView = this.f66953a;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    public int A() {
        return this.f66974v;
    }

    public View C(int i10) {
        View inflate = this.f66959g.inflate(i10, this.f66954b, false);
        b(inflate);
        return inflate;
    }

    public void D(boolean z10) {
        if (this.f66977y != z10) {
            this.f66977y = z10;
            Z();
        }
    }

    public void E(androidx.appcompat.view.menu.h hVar) {
        this.f66958f.o(hVar);
    }

    public void F(int i10) {
        this.f66973u = i10;
        i(false);
    }

    public void G(int i10) {
        this.f66972t = i10;
        i(false);
    }

    public void H(int i10) {
        this.f66957e = i10;
    }

    public void I(Drawable drawable) {
        this.f66966n = drawable;
        i(false);
    }

    public void J(RippleDrawable rippleDrawable) {
        this.f66967o = rippleDrawable;
        i(false);
    }

    public void K(int i10) {
        this.f66968p = i10;
        i(false);
    }

    public void L(int i10) {
        this.f66970r = i10;
        i(false);
    }

    public void M(int i10) {
        if (this.f66971s != i10) {
            this.f66971s = i10;
            this.f66976x = true;
            i(false);
        }
    }

    public void N(ColorStateList colorStateList) {
        this.f66965m = colorStateList;
        i(false);
    }

    public void O(int i10) {
        this.f66978z = i10;
        i(false);
    }

    public void P(int i10) {
        this.f66962j = i10;
        i(false);
    }

    public void Q(boolean z10) {
        this.f66963k = z10;
        i(false);
    }

    public void R(ColorStateList colorStateList) {
        this.f66964l = colorStateList;
        i(false);
    }

    public void S(int i10) {
        this.f66969q = i10;
        i(false);
    }

    public void T(int i10) {
        this.f66951C = i10;
        NavigationMenuView navigationMenuView = this.f66953a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void U(ColorStateList colorStateList) {
        this.f66961i = colorStateList;
        i(false);
    }

    public void V(int i10) {
        this.f66975w = i10;
        i(false);
    }

    public void W(int i10) {
        this.f66974v = i10;
        i(false);
    }

    public void X(int i10) {
        this.f66960h = i10;
        i(false);
    }

    public void Y(boolean z10) {
        c cVar = this.f66958f;
        if (cVar != null) {
            cVar.p(z10);
        }
    }

    public void b(View view) {
        this.f66954b.addView(view);
        NavigationMenuView navigationMenuView = this.f66953a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        k.a aVar = this.f66955c;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    public boolean d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public void f(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f66953a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f66958f.m(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f66954b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public boolean g(o oVar) {
        return false;
    }

    public int getId() {
        return this.f66957e;
    }

    public Parcelable h() {
        Bundle bundle = new Bundle();
        if (this.f66953a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f66953a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f66958f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.f());
        }
        if (this.f66954b != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f66954b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public void i(boolean z10) {
        c cVar = this.f66958f;
        if (cVar != null) {
            cVar.q();
        }
    }

    public boolean j() {
        return false;
    }

    public boolean k(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public void l(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f66959g = LayoutInflater.from(context);
        this.f66956d = fVar;
        this.f66950B = context.getResources().getDimensionPixelOffset(C9070d.f59408f);
    }

    public void m(C0 c02) {
        int m10 = c02.m();
        if (this.f66949A != m10) {
            this.f66949A = m10;
            Z();
        }
        NavigationMenuView navigationMenuView = this.f66953a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c02.j());
        C4600b0.g(this.f66954b, c02);
    }

    public androidx.appcompat.view.menu.h n() {
        return this.f66958f.g();
    }

    public int o() {
        return this.f66973u;
    }

    public int p() {
        return this.f66972t;
    }

    public int q() {
        return this.f66954b.getChildCount();
    }

    public Drawable r() {
        return this.f66966n;
    }

    public int s() {
        return this.f66968p;
    }

    public int t() {
        return this.f66970r;
    }

    public int u() {
        return this.f66978z;
    }

    public ColorStateList v() {
        return this.f66964l;
    }

    public ColorStateList w() {
        return this.f66965m;
    }

    public int x() {
        return this.f66969q;
    }

    public androidx.appcompat.view.menu.l y(ViewGroup viewGroup) {
        if (this.f66953a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f66959g.inflate(C9074h.f59526j, viewGroup, false);
            this.f66953a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f66953a));
            if (this.f66958f == null) {
                c cVar = new c();
                this.f66958f = cVar;
                cVar.setHasStableIds(true);
            }
            int i10 = this.f66951C;
            if (i10 != -1) {
                this.f66953a.setOverScrollMode(i10);
            }
            LinearLayout linearLayout = (LinearLayout) this.f66959g.inflate(C9074h.f59523g, this.f66953a, false);
            this.f66954b = linearLayout;
            C4600b0.z0(linearLayout, 2);
            this.f66953a.setAdapter(this.f66958f);
        }
        return this.f66953a;
    }

    public int z() {
        return this.f66975w;
    }
}
