package com.oppwa.mobile.connect.core.nfc.ui;

import android.content.DialogInterface;

public final /* synthetic */ class e implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NfcCardReaderActivity f121599a;

    public /* synthetic */ e(NfcCardReaderActivity nfcCardReaderActivity) {
        this.f121599a = nfcCardReaderActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f121599a.a(dialogInterface);
    }
}
