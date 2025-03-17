package com.oppwa.mobile.connect.core.nfc.ui;

import android.content.Context;
import android.content.Intent;
import com.oppwa.mobile.connect.core.nfc.model.CardDetails;
import h.C5403a;

public class NfcCardReaderActivityResultContract extends C5403a<Void, CardDetails> {
    public Intent createIntent(Context context, Void voidR) {
        return new Intent(context, NfcCardReaderActivity.class);
    }

    public CardDetails parseResult(int i10, Intent intent) {
        if (intent != null) {
            return (CardDetails) intent.getParcelableExtra("com.oppwa.mobile.connect.core.nfc.ui.EXTRA_CARD_DETAILS");
        }
        return null;
    }
}
