package androidx.preference;

import G4.c;
import G4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import w2.l;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: I  reason: collision with root package name */
    private final a f43560I;

    /* renamed from: J  reason: collision with root package name */
    private CharSequence f43561J;

    /* renamed from: K  reason: collision with root package name */
    private CharSequence f43562K;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!SwitchPreference.this.a(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                SwitchPreference.this.b0(z10);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f43560I = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36060J0, i10, i11);
        e0(l.m(obtainStyledAttributes, g.f36076R0, g.f36062K0));
        d0(l.m(obtainStyledAttributes, g.f36074Q0, g.f36064L0));
        h0(l.m(obtainStyledAttributes, g.f36080T0, g.f36068N0));
        g0(l.m(obtainStyledAttributes, g.f36078S0, g.f36070O0));
        c0(l.b(obtainStyledAttributes, g.f36072P0, g.f36066M0, false));
        obtainStyledAttributes.recycle();
    }

    private void i0(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f43568D);
        }
        if (z10) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f43561J);
            switchR.setTextOff(this.f43562K);
            switchR.setOnCheckedChangeListener(this.f43560I);
        }
    }

    private void j0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            i0(view.findViewById(16908352));
            f0(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    public void T(View view) {
        super.T(view);
        j0(view);
    }

    public void g0(CharSequence charSequence) {
        this.f43562K = charSequence;
        M();
    }

    public void h0(CharSequence charSequence) {
        this.f43561J = charSequence;
        M();
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, c.f36037j, 16843629));
    }
}
