package com.oppwa.mobile.connect.core.nfc;

import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;

public class NfcUtils {
    public static Intent getNfcSettingsIntent() {
        return new Intent("android.settings.NFC_SETTINGS");
    }

    public static boolean isNfcAvailable(Context context) {
        return NfcAdapter.getDefaultAdapter(context) != null;
    }

    public static boolean isNfcEnabled(NfcAdapter nfcAdapter) {
        return nfcAdapter.isEnabled();
    }
}
