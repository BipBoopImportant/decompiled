package com.google.android.material.internal;

import Ea.C9070d;
import Ea.C9071e;
import Ea.C9072f;
import Ea.C9074h;
import I2.C4597a;
import I2.C4600b0;
import J2.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.S;
import androidx.core.widget.i;
import androidx.recyclerview.widget.RecyclerView;
import i.C5421a;
import w2.C6214h;
import y2.C6260a;

public class NavigationMenuItemView extends ForegroundLinearLayout implements l.a {

    /* renamed from: G  reason: collision with root package name */
    private static final int[] f66840G = {16842912};

    /* renamed from: A  reason: collision with root package name */
    private FrameLayout f66841A;

    /* renamed from: B  reason: collision with root package name */
    private h f66842B;

    /* renamed from: C  reason: collision with root package name */
    private ColorStateList f66843C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f66844D;

    /* renamed from: E  reason: collision with root package name */
    private Drawable f66845E;

    /* renamed from: F  reason: collision with root package name */
    private final C4597a f66846F;

    /* renamed from: v  reason: collision with root package name */
    private int f66847v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f66848w;

    /* renamed from: x  reason: collision with root package name */
    boolean f66849x;

    /* renamed from: y  reason: collision with root package name */
    boolean f66850y;

    /* renamed from: z  reason: collision with root package name */
    private final CheckedTextView f66851z;

    class a extends C4597a {
        a() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.g0(NavigationMenuItemView.this.f66849x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (F()) {
            this.f66851z.setVisibility(8);
            FrameLayout frameLayout = this.f66841A;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f66841A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f66851z.setVisibility(0);
        FrameLayout frameLayout2 = this.f66841A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f66841A.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C5421a.f23908w, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f66840G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean F() {
        return this.f66842B.getTitle() == null && this.f66842B.getIcon() == null && this.f66842B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f66841A == null) {
                this.f66841A = (FrameLayout) ((ViewStub) findViewById(C9072f.f59489g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f66841A.removeAllViews();
            this.f66841A.addView(view);
        }
    }

    public void D(h hVar, boolean z10) {
        this.f66850y = z10;
        c(hVar, 0);
    }

    public void E() {
        FrameLayout frameLayout = this.f66841A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f66851z.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void c(h hVar, int i10) {
        this.f66842B = hVar;
        if (hVar.getItemId() > 0) {
            setId(hVar.getItemId());
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C4600b0.t0(this, C());
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.getTitle());
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.getContentDescription());
        S.a(this, hVar.getTooltipText());
        B();
    }

    public boolean e() {
        return false;
    }

    public h getItemData() {
        return this.f66842B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.f66842B;
        if (hVar != null && hVar.isCheckable() && this.f66842B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f66840G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f66849x != z10) {
            this.f66849x = z10;
            this.f66846F.l(this.f66851z, RecyclerView.n.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f66851z.setChecked(z10);
        CheckedTextView checkedTextView = this.f66851z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (!z10 || !this.f66850y) ? 0 : 1);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f66844D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C6260a.r(drawable).mutate();
                C6260a.o(drawable, this.f66843C);
            }
            int i10 = this.f66847v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f66848w) {
            if (this.f66845E == null) {
                Drawable e10 = C6214h.e(getResources(), C9071e.f59457l, getContext().getTheme());
                this.f66845E = e10;
                if (e10 != null) {
                    int i11 = this.f66847v;
                    e10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f66845E;
        }
        i.j(this.f66851z, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.f66851z.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f66847v = i10;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f66843C = colorStateList;
        this.f66844D = colorStateList != null;
        h hVar = this.f66842B;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f66851z.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f66848w = z10;
    }

    public void setTextAppearance(int i10) {
        i.p(this.f66851z, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f66851z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f66851z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66850y = true;
        a aVar = new a();
        this.f66846F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C9074h.f59527k, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C9070d.f59406e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C9072f.f59490h);
        this.f66851z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C4600b0.p0(checkedTextView, aVar);
    }
}
