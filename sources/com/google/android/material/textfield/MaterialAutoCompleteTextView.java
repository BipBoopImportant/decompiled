package com.google.android.material.textfield;

import Ea.C9068b;
import Ea.C9070d;
import Ea.C9074h;
import Ea.C9077k;
import Ea.C9078l;
import I2.C4600b0;
import La.C9138a;
import Ra.c;
import Ua.C9286g;
import Xa.C9359a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.B;
import com.google.android.material.internal.h;
import com.google.android.material.internal.s;
import java.util.List;
import y2.C6260a;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final B f67365e;

    /* renamed from: f  reason: collision with root package name */
    private final AccessibilityManager f67366f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f67367g;

    /* renamed from: h  reason: collision with root package name */
    private final int f67368h;

    /* renamed from: i  reason: collision with root package name */
    private final float f67369i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f67370j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f67371k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f67372l;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.l(i10 < 0 ? materialAutoCompleteTextView.f67365e.v() : materialAutoCompleteTextView.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.f67365e.y();
                    i10 = MaterialAutoCompleteTextView.this.f67365e.x();
                    j10 = MaterialAutoCompleteTextView.this.f67365e.w();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f67365e.p(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f67365e.dismiss();
        }
    }

    private class b<T> extends ArrayAdapter<String> {

        /* renamed from: a  reason: collision with root package name */
        private ColorStateList f67374a;

        /* renamed from: b  reason: collision with root package name */
        private ColorStateList f67375b;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {16843623, -16842919};
            int[] iArr2 = {16842913, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.f67372l.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.f67372l.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{C9138a.i(MaterialAutoCompleteTextView.this.f67371k, colorForState), C9138a.i(MaterialAutoCompleteTextView.this.f67371k, colorForState2), MaterialAutoCompleteTextView.this.f67371k});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f67371k);
            if (this.f67375b == null) {
                return colorDrawable;
            }
            C6260a.o(colorDrawable, this.f67374a);
            return new RippleDrawable(this.f67375b, colorDrawable, (Drawable) null);
        }

        private boolean c() {
            return MaterialAutoCompleteTextView.this.f67371k != 0;
        }

        private boolean d() {
            return MaterialAutoCompleteTextView.this.f67372l != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f67372l.getColorForState(iArr, 0), 0});
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f67375b = e();
            this.f67374a = a();
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                C4600b0.t0(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59325c);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f67366f;
        if (!(accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = this.f67366f.getEnabledAccessibilityServiceList(16)) == null)) {
            for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
                if (next.getSettingsActivityName() != null && next.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f67366f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f10 = f();
        int i10 = 0;
        if (adapter == null || f10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f67365e.x()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, f10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable h10 = this.f67365e.h();
        if (h10 != null) {
            h10.getPadding(this.f67367g);
            Rect rect = this.f67367g;
            i11 += rect.left + rect.right;
        }
        return i11 + f10.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout f10 = f();
        if (f10 != null) {
            f10.s0();
        }
    }

    /* access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public void dismissDropDown() {
        if (g()) {
            this.f67365e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f67370j;
    }

    public CharSequence getHint() {
        TextInputLayout f10 = f();
        return (f10 == null || !f10.S()) ? super.getHint() : f10.getHint();
    }

    public float getPopupElevation() {
        return this.f67369i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f67371k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f67372l;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f10 = f();
        if (f10 != null && f10.S() && super.getHint() == null && h.d()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f67365e.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        if (!g()) {
            super.onWindowFocusChanged(z10);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f67365e.n(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        B b10 = this.f67365e;
        if (b10 != null) {
            b10.c(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f67370j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C9286g) {
            ((C9286g) dropDownBackground).b0(this.f67370j);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f67365e.M(getOnItemSelectedListener());
    }

    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f67371k = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f67372l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void showDropDown() {
        if (g()) {
            this.f67365e.a();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(C9359a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f67367g = new Rect();
        Context context2 = getContext();
        TypedArray i11 = s.i(context2, attributeSet, C9078l.f59993j3, i10, C9077k.f59598h, new int[0]);
        if (i11.hasValue(C9078l.f60004k3) && i11.getInt(C9078l.f60004k3, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f67368h = i11.getResourceId(C9078l.f60037n3, C9074h.f59536t);
        this.f67369i = (float) i11.getDimensionPixelOffset(C9078l.f60015l3, C9070d.f59423m0);
        if (i11.hasValue(C9078l.f60026m3)) {
            this.f67370j = ColorStateList.valueOf(i11.getColor(C9078l.f60026m3, 0));
        }
        this.f67371k = i11.getColor(C9078l.f60048o3, 0);
        this.f67372l = c.a(context2, i11, C9078l.f60059p3);
        this.f67366f = (AccessibilityManager) context2.getSystemService("accessibility");
        B b10 = new B(context2);
        this.f67365e = b10;
        b10.J(true);
        b10.D(this);
        b10.I(2);
        b10.n(getAdapter());
        b10.L(new a());
        if (i11.hasValue(C9078l.f60070q3)) {
            setSimpleItems(i11.getResourceId(C9078l.f60070q3, 0));
        }
        i11.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f67368h, strArr));
    }
}
