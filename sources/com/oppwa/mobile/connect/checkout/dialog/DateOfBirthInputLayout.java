package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.oppwa.mobile.connect.R;
import java.util.Date;

public class DateOfBirthInputLayout extends InputLayout {

    /* renamed from: i  reason: collision with root package name */
    private C14084l f120912i;

    public DateOfBirthInputLayout(Context context) {
        super(context);
        b();
    }

    private void b() {
        this.f120912i = new C14084l();
        getEditText().addTextChangedListener(this.f120912i);
        getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.dateOfBirthMaxLength))});
        getEditText().setInputType(524308);
    }

    public Date getDateOfBirth() {
        return this.f120912i.a();
    }

    public void setInputValidator() {
        setInputValidator(C14099q.d());
    }

    public DateOfBirthInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public DateOfBirthInputLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }

    public DateOfBirthInputLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b();
    }
}
