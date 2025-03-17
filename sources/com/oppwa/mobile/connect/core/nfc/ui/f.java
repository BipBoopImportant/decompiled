package com.oppwa.mobile.connect.core.nfc.ui;

import android.content.Intent;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NfcCardReaderActivity f121600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f121601b;

    public /* synthetic */ f(NfcCardReaderActivity nfcCardReaderActivity, Intent intent) {
        this.f121600a = nfcCardReaderActivity;
        this.f121601b = intent;
    }

    public final void run() {
        this.f121600a.a(this.f121601b);
    }
}
