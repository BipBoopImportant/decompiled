package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.j  reason: case insensitive filesystem */
class C14078j extends URLSpan {

    /* renamed from: a  reason: collision with root package name */
    Context f121258a;

    C14078j(Context context, String str) {
        super(str);
        this.f121258a = context;
    }

    public void onClick(View view) {
        Utils.showCustomTabs(this.f121258a, getURL());
    }
}
