package com.google.android.material.search;

import Ea.C9070d;
import Ea.C9071e;
import Ea.C9077k;
import I2.C4600b0;
import Na.C9152a;
import Qa.C9235b;
import Qa.C9236c;
import Qa.C9240g;
import Ua.h;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.C4987b;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.f;
import com.google.android.material.internal.t;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import k.C5488b;
import y2.C6260a;

public class SearchView extends FrameLayout implements CoordinatorLayout.b, C9235b {

    /* renamed from: x  reason: collision with root package name */
    private static final int f67080x = C9077k.f59608r;

    /* renamed from: a  reason: collision with root package name */
    final ClippableRoundedCornerLayout f67081a;

    /* renamed from: b  reason: collision with root package name */
    final View f67082b;

    /* renamed from: c  reason: collision with root package name */
    final View f67083c;

    /* renamed from: d  reason: collision with root package name */
    final FrameLayout f67084d;

    /* renamed from: e  reason: collision with root package name */
    final MaterialToolbar f67085e;

    /* renamed from: f  reason: collision with root package name */
    final TextView f67086f;

    /* renamed from: g  reason: collision with root package name */
    final EditText f67087g;

    /* renamed from: h  reason: collision with root package name */
    final TouchObserverFrameLayout f67088h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f67089i;

    /* renamed from: j  reason: collision with root package name */
    private final C9236c f67090j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f67091k;

    /* renamed from: l  reason: collision with root package name */
    private final C9152a f67092l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<b> f67093m;

    /* renamed from: n  reason: collision with root package name */
    private SearchBar f67094n;

    /* renamed from: o  reason: collision with root package name */
    private int f67095o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f67096p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f67097q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f67098r;

    /* renamed from: s  reason: collision with root package name */
    private final int f67099s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f67100t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f67101u;

    /* renamed from: v  reason: collision with root package name */
    private c f67102v;

    /* renamed from: w  reason: collision with root package name */
    private Map<View, Integer> f67103w;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.g() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static class a extends O2.a {
        public static final Parcelable.Creator<a> CREATOR = new C1171a();

        /* renamed from: c  reason: collision with root package name */
        String f67104c;

        /* renamed from: d  reason: collision with root package name */
        int f67105d;

        /* renamed from: com.google.android.material.search.SearchView$a$a  reason: collision with other inner class name */
        class C1171a implements Parcelable.ClassLoaderCreator<a> {
            C1171a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            /* renamed from: c */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f67104c);
            parcel.writeInt(this.f67105d);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f67104c = parcel.readString();
            this.f67105d = parcel.readInt();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface b {
        void a(SearchView searchView, c cVar, c cVar2);
    }

    public enum c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    private boolean f() {
        return this.f67102v.equals(c.HIDDEN) || this.f67102v.equals(c.HIDING);
    }

    private Window getActivityWindow() {
        Activity a10 = com.google.android.material.internal.c.a(getContext());
        if (a10 == null) {
            return null;
        }
        return a10.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f67094n;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(C9070d.f59374C);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void h(c cVar, boolean z10) {
        if (!this.f67102v.equals(cVar)) {
            if (z10) {
                if (cVar == c.SHOWN) {
                    setModalForAccessibility(true);
                } else if (cVar == c.HIDDEN) {
                    setModalForAccessibility(false);
                }
            }
            c cVar2 = this.f67102v;
            this.f67102v = cVar;
            for (b a10 : new LinkedHashSet(this.f67093m)) {
                a10.a(this, cVar2, cVar);
            }
            j(cVar);
        }
    }

    @SuppressLint({"InlinedApi"})
    private void i(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f67081a.getId()) != null) {
                    i((ViewGroup) childAt, z10);
                } else if (!z10) {
                    Map<View, Integer> map = this.f67103w;
                    if (map != null && map.containsKey(childAt)) {
                        C4600b0.z0(childAt, this.f67103w.get(childAt).intValue());
                    }
                } else {
                    this.f67103w.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    C4600b0.z0(childAt, 4);
                }
            }
        }
    }

    private void j(c cVar) {
        if (this.f67094n != null && this.f67091k) {
            if (cVar.equals(c.SHOWN)) {
                this.f67090j.c();
            } else if (cVar.equals(c.HIDDEN)) {
                this.f67090j.f();
            }
        }
    }

    private void k() {
        ImageButton d10 = t.d(this.f67085e);
        if (d10 != null) {
            int i10 = this.f67081a.getVisibility() == 0 ? 1 : 0;
            Drawable q10 = C6260a.q(d10.getDrawable());
            if (q10 instanceof C5488b) {
                ((C5488b) q10).setProgress((float) i10);
            }
            if (q10 instanceof f) {
                ((f) q10).a((float) i10);
            }
        }
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f67083c.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        C9152a aVar = this.f67092l;
        if (aVar != null && this.f67082b != null) {
            this.f67082b.setBackgroundColor(aVar.c(this.f67099s, f10));
        }
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            e(LayoutInflater.from(getContext()).inflate(i10, this.f67084d, false));
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f67083c.getLayoutParams().height != i10) {
            this.f67083c.getLayoutParams().height = i10;
            this.f67083c.requestLayout();
        }
    }

    public void a() {
        if (!f() && this.f67094n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f67089i) {
            this.f67088h.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public void b(C4987b bVar) {
        if (!f() && this.f67094n != null) {
            throw null;
        }
    }

    public void c(C4987b bVar) {
        if (!f() && this.f67094n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    public void d() {
        if (!f()) {
            throw null;
        }
    }

    public void e(View view) {
        this.f67084d.addView(view);
        this.f67084d.setVisibility(0);
    }

    public boolean g() {
        return this.f67094n != null;
    }

    /* access modifiers changed from: package-private */
    public C9240g getBackHelper() {
        throw null;
    }

    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.f67102v;
    }

    /* access modifiers changed from: protected */
    public int getDefaultNavigationIconResource() {
        return C9071e.f59447b;
    }

    public EditText getEditText() {
        return this.f67087g;
    }

    public CharSequence getHint() {
        return this.f67087g.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f67086f;
    }

    public CharSequence getSearchPrefixText() {
        return this.f67086f.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f67095o;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f67087g.getText();
    }

    public Toolbar getToolbar() {
        return this.f67085e;
    }

    public void l() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f67095o = activityWindow.getAttributes().softInputMode;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText((CharSequence) aVar.f67104c);
        setVisible(aVar.f67105d == 0);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        Editable text = getText();
        aVar.f67104c = text == null ? null : text.toString();
        aVar.f67105d = this.f67081a.getVisibility();
        return aVar;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f67096p = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f67098r = z10;
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        this.f67087g.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f67097q = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.f67103w = new HashMap(viewGroup.getChildCount());
        }
        i(viewGroup, z10);
        if (!z10) {
            this.f67103w = null;
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f67085e.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f67086f.setText(charSequence);
        this.f67086f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f67101u = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f67087g.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f67085e.setTouchscreenBlocksFocus(z10);
    }

    /* access modifiers changed from: package-private */
    public void setTransitionState(c cVar) {
        h(cVar, true);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.f67100t = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = true;
        boolean z12 = this.f67081a.getVisibility() == 0;
        this.f67081a.setVisibility(z10 ? 0 : 8);
        k();
        c cVar = z10 ? c.SHOWN : c.HIDDEN;
        if (z12 == z10) {
            z11 = false;
        }
        h(cVar, z11);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f67094n = searchBar;
        throw null;
    }

    public void setHint(int i10) {
        this.f67087g.setHint(i10);
    }

    public void setText(int i10) {
        this.f67087g.setText(i10);
    }
}
