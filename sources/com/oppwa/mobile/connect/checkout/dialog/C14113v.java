package com.oppwa.mobile.connect.checkout.dialog;

import android.text.Editable;
import com.oppwa.mobile.connect.utils.StringUtils;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.v  reason: case insensitive filesystem */
class C14113v extends C14096p {

    /* renamed from: d  reason: collision with root package name */
    private final String f121334d;

    /* renamed from: e  reason: collision with root package name */
    private final String f121335e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f121336f = false;

    C14113v(Character ch2, String str) {
        this.f121334d = String.valueOf(ch2);
        if (str != null) {
            this.f121335e = str;
        } else {
            this.f121335e = "#### #### #### #### ###";
        }
    }

    /* access modifiers changed from: protected */
    public void a(Editable editable) {
    }

    /* access modifiers changed from: protected */
    public Editable b(Editable editable) {
        if (this.f121336f && StringUtils.stringHasNonstandardDigits(editable)) {
            return editable;
        }
        int i10 = 0;
        while (i10 < editable.length()) {
            if (editable.charAt(i10) == this.f121334d.charAt(0)) {
                this.f121281a = true;
                editable.replace(i10, i10 + 1, "");
            }
            if (i10 < this.f121335e.length() && this.f121335e.charAt(i10) == this.f121334d.charAt(0)) {
                this.f121281a = true;
                editable.insert(i10, this.f121334d);
                i10++;
            }
            i10++;
        }
        return editable;
    }

    public String a() {
        return this.f121334d;
    }

    public void a(boolean z10) {
        this.f121336f = z10;
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        return str.replace(this.f121334d, "");
    }
}
