package com.oppwa.mobile.connect.core.nfc.ui;

import com.oppwa.mobile.connect.core.nfc.exception.EmvCardParserException;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NfcCardReaderActivity f121596a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EmvCardParserException f121597b;

    public /* synthetic */ c(NfcCardReaderActivity nfcCardReaderActivity, EmvCardParserException emvCardParserException) {
        this.f121596a = nfcCardReaderActivity;
        this.f121597b = emvCardParserException;
    }

    public final void run() {
        this.f121596a.a(this.f121597b);
    }
}
