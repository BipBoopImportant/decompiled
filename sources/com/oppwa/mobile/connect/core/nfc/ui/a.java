package com.oppwa.mobile.connect.core.nfc.ui;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NfcCardReaderActivity f121594a;

    public /* synthetic */ a(NfcCardReaderActivity nfcCardReaderActivity) {
        this.f121594a = nfcCardReaderActivity;
    }

    public final void run() {
        this.f121594a.finish();
    }
}
