package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.C14099q;
import com.oppwa.mobile.connect.utils.StringUtils;

public class DateInputLayout extends InputLayout {

    /* renamed from: i  reason: collision with root package name */
    private C14081k f120911i;

    public DateInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    private void b() {
        this.f120911i = new C14081k('/', 2);
        getEditText().addTextChangedListener(this.f120911i);
        getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.cardExpirationDateMaxLength))});
        getEditText().setInputType(ImageMetadata.LENS_OPTICAL_STABILIZATION_MODE);
    }

    public String getMonth() {
        if (!isEmpty()) {
            return StringUtils.replaceNonstandardDigits(this.f120911i.a());
        }
        return null;
    }

    public String getYear() {
        if (!isEmpty()) {
            return StringUtils.replaceNonstandardDigits(this.f120911i.b());
        }
        return null;
    }

    public void setInputValidator(C14099q.o oVar) {
        setInputValidator(C14099q.a(this.f120911i, oVar));
    }

    public DateInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public DateInputLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet);
    }

    public DateInputLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet);
    }
}
