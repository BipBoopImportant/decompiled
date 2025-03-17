package com.oppwa.mobile.connect.checkout.uicomponent.util.filter;

import android.text.InputFilter;
import android.text.Spanned;

public class AlphaNumericInputFilter implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f121545a;

    public AlphaNumericInputFilter(boolean z10) {
        this.f121545a = z10;
    }

    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (!this.f121545a && charAt == ' ') {
                return "";
            }
            if (charAt != ' ' && !Character.isLetterOrDigit(charAt)) {
                return "";
            }
            i10++;
        }
        return null;
    }
}
