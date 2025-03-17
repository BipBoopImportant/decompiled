package com.google.android.material.timepicker;

import Ea.C9072f;
import Ea.C9074h;
import I2.C4600b0;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.r;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Chip f67558a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f67559b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f67560c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f67561d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f67562e;

    private class b extends r {
        private b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f67558a.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String a10 = ChipTextInputComboView.this.c(editable);
            Chip b10 = ChipTextInputComboView.this.f67558a;
            if (TextUtils.isEmpty(a10)) {
                a10 = ChipTextInputComboView.this.c("00");
            }
            b10.setText(a10);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return d.a(getResources(), charSequence);
    }

    private void d() {
        this.f67560c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public boolean isChecked() {
        return this.f67558a.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    public void setChecked(boolean z10) {
        this.f67558a.setChecked(z10);
        this.f67560c.setVisibility(z10 ? 0 : 4);
        this.f67558a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            v.o(this.f67560c, false);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f67558a.setOnClickListener(onClickListener);
    }

    public void setTag(int i10, Object obj) {
        this.f67558a.setTag(i10, obj);
    }

    public void toggle() {
        this.f67558a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C9074h.f59533q, this, false);
        this.f67558a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C9074h.f59534r, this, false);
        this.f67559b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f67560c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f67561d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f67562e = (TextView) findViewById(C9072f.f59498p);
        editText.setId(C4600b0.k());
        C4600b0.C0(this.f67562e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
