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
import w2.l;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: I  reason: collision with root package name */
    private final a f43482I;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!CheckBoxPreference.this.a(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                CheckBoxPreference.this.b0(z10);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    private void g0(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f43568D);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f43482I);
        }
    }

    private void h0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            g0(view.findViewById(16908289));
            f0(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    public void T(View view) {
        super.T(view);
        h0(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f43482I = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36096b, i10, i11);
        e0(l.m(obtainStyledAttributes, g.f36112h, g.f36099c));
        d0(l.m(obtainStyledAttributes, g.f36110g, g.f36102d));
        c0(l.b(obtainStyledAttributes, g.f36108f, g.f36105e, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, c.f36028a, 16842895));
    }
}
