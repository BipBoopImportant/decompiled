package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.C14099q;

public class CardNumberInputLayout extends InputLayout {

    /* renamed from: i  reason: collision with root package name */
    private String f120876i;

    /* renamed from: j  reason: collision with root package name */
    private C14113v f120877j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f120878k;

    public CardNumberInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f120878k = true;
        b();
    }

    private C14113v a(String str) {
        C14113v vVar = new C14113v(' ', str);
        vVar.a(true);
        return vVar;
    }

    private void b() {
        getEditText().setInputType(ImageMetadata.LENS_OPTICAL_STABILIZATION_MODE);
        getEditText().setCustomSelectionActionModeCallback(new C14075i());
    }

    private void setLengthFilter(String str) {
        getEditText().setFilters(new InputFilter[]{a(str == null ? getResources().getInteger(R.integer.cardNumberMaxLength) : str.length())});
    }

    private void setNumberInputFormatter(String str) {
        if (this.f120877j != null) {
            getEditText().removeTextChangedListener(this.f120877j);
        }
        this.f120877j = a(str);
        getEditText().addTextChangedListener(this.f120877j);
        getEditText().setText(getEditText().getText().toString());
        setSelectionAtTheEnd();
    }

    private void setNumberPattern(String str) {
        String a10 = a(getEditText().getText(), str);
        setLengthFilter(a10);
        setNumberInputFormatter(a10);
    }

    private void setNumberValidator(C14099q.n nVar) {
        setInputValidator(C14099q.a(this.f120877j, nVar));
    }

    public void setBrandDetected(boolean z10) {
        this.f120878k = z10;
    }

    public void setCardBrand(String str) {
        this.f120876i = str;
    }

    public void setNumberPatternAndValidator(String str, C14099q.n nVar) {
        setNumberPattern(str);
        setNumberValidator(nVar);
    }

    public boolean validate() {
        String str = this.f120876i;
        if (str != null && !"CARD".equals(str) && this.f120878k) {
            return super.validate();
        }
        showError(getContext().getString(R.string.checkout_error_card_number_invalid));
        return false;
    }

    private String a(CharSequence charSequence, String str) {
        if (charSequence.length() <= str.length()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length() - str.length(); i10++) {
            sb2.append("#");
        }
        return str + sb2.toString();
    }

    public CardNumberInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CardNumberInputLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet);
    }

    public CardNumberInputLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet);
    }

    private InputFilter a(int i10) {
        return new InputFilter.LengthFilter(i10);
    }
}
