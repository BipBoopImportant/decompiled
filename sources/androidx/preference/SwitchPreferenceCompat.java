package androidx.preference;

import G4.c;
import G4.d;
import G4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import w2.l;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: I  reason: collision with root package name */
    private final a f43564I;

    /* renamed from: J  reason: collision with root package name */
    private CharSequence f43565J;

    /* renamed from: K  reason: collision with root package name */
    private CharSequence f43566K;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!SwitchPreferenceCompat.this.a(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                SwitchPreferenceCompat.this.b0(z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f43564I = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36082U0, i10, i11);
        e0(l.m(obtainStyledAttributes, g.f36101c1, g.f36084V0));
        d0(l.m(obtainStyledAttributes, g.f36098b1, g.f36086W0));
        h0(l.m(obtainStyledAttributes, g.f36107e1, g.f36090Y0));
        g0(l.m(obtainStyledAttributes, g.f36104d1, g.f36092Z0));
        c0(l.b(obtainStyledAttributes, g.f36095a1, g.f36088X0, false));
        obtainStyledAttributes.recycle();
    }

    private void i0(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f43568D);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f43565J);
            switchCompat.setTextOff(this.f43566K);
            switchCompat.setOnCheckedChangeListener(this.f43564I);
        }
    }

    private void j0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            i0(view.findViewById(d.f36038a));
            f0(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    public void T(View view) {
        super.T(view);
        j0(view);
    }

    public void g0(CharSequence charSequence) {
        this.f43566K = charSequence;
        M();
    }

    public void h0(CharSequence charSequence) {
        this.f43565J = charSequence;
        M();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f36036i);
    }
}
