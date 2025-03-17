package com.google.android.gms.wallet.button;

import Ba.C6389m;
import Ba.C6390n;
import Ba.C6391o;
import Ba.C6392p;
import Ba.C6393q;
import Ba.r;
import Ca.e;
import Ca.f;
import K9.C6620s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.common.a;
import com.google.android.gms.common.util.l;
import com.google.android.gms.wallet.button.ButtonOptions;

public final class PayButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private View.OnClickListener f50624a;

    /* renamed from: b  reason: collision with root package name */
    private ButtonOptions.a f50625b;

    /* renamed from: c  reason: collision with root package name */
    private View f50626c;

    /* renamed from: d  reason: collision with root package name */
    private final e f50627d;

    public PayButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void b(ButtonOptions buttonOptions) {
        Drawable drawable;
        removeAllViews();
        zzg zzg = new zzg(new ContextThemeWrapper(getContext(), buttonOptions.B() == 2 ? C6393q.f33370b : C6393q.f33369a), (AttributeSet) null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(zzg.getContext()).inflate(C6391o.f33367a, zzg, true).findViewById(C6390n.f33366a);
        Context context = zzg.getContext();
        int J10 = buttonOptions.J();
        GradientDrawable gradientDrawable = (GradientDrawable) f.a(context, C6389m.f33363a).mutate();
        float f10 = (float) J10;
        gradientDrawable.setCornerRadius(f10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{C6389m.f33364b});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        ColorStateList valueOf = ColorStateList.valueOf(color);
        if (l.c()) {
            drawable = new RippleDrawable(valueOf, gradientDrawable, (Drawable) null);
        } else {
            GradientDrawable gradientDrawable2 = (GradientDrawable) f.a(context, C6389m.f33365c).mutate();
            gradientDrawable2.setCornerRadius(f10);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, layerDrawable);
            stateListDrawable.addState(new int[0], gradientDrawable);
            drawable = stateListDrawable;
        }
        linearLayout.setBackground(drawable);
        zzg.setContentDescription(zzg.getContext().getString(C6392p.f33368a));
        this.f50626c = zzg;
        addView(zzg);
        this.f50626c.setOnClickListener(this);
    }

    public void a(ButtonOptions buttonOptions) {
        ButtonOptions.a aVar = this.f50625b;
        if (buttonOptions.F() != 0) {
            ButtonOptions.this.f50618a = buttonOptions.F();
        }
        if (buttonOptions.B() != 0) {
            ButtonOptions.this.f50619b = buttonOptions.B();
        }
        if (buttonOptions.f50622e) {
            aVar.e(buttonOptions.J());
        }
        if (buttonOptions.x() != null) {
            ButtonOptions.this.f50621d = buttonOptions.x();
        }
        if (!isInEditMode()) {
            removeAllViews();
            ButtonOptions a10 = this.f50625b.a();
            if (a.n().h(getContext(), 232100000) != 0) {
                b(a10);
                Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
            } else if (TextUtils.isEmpty(a10.x())) {
                Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
            } else {
                View a11 = e.a((Context) C6620s.l(getContext()), a10);
                this.f50626c = a11;
                if (a11 == null) {
                    Log.e("PayButton", "Failed to create buttonView");
                    return;
                }
                addView(a11);
                this.f50626c.setOnClickListener(this);
            }
        } else {
            b(this.f50625b.a());
        }
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f50624a;
        if (onClickListener != null && view == this.f50626c) {
            onClickListener.onClick(this);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f50624a = onClickListener;
    }

    public PayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ButtonOptions.a U10 = ButtonOptions.U();
        this.f50625b = U10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f33372b);
        int i11 = obtainStyledAttributes.getInt(r.f33373c, 1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(r.f33374d, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.f50619b = i11;
        buttonOptions.f50620c = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(r.f33374d)) {
            ButtonOptions.this.f50622e = true;
        }
        obtainStyledAttributes.recycle();
        U10.d(1);
        this.f50627d = new e();
        if (isInEditMode()) {
            b(this.f50625b.a());
        }
    }
}
