package com.oppwa.mobile.connect.checkout.dialog;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.a  reason: case insensitive filesystem */
class C14048a implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f121116a;

    C14048a(boolean z10) {
        this.f121116a = z10;
    }

    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (!this.f121116a && charAt == ' ') {
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
