package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;

public class NativeLibHelper implements INativeLibHelper {
    private static final String TAG = "NativeLibHelper";

    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e10) {
            Log.e(TAG, "Signer Library could not be loaded: " + e10.getMessage());
        }
    }

    private native void nOnResume();

    private native byte[] nSign(Context context, Object obj, byte[] bArr, int i10);

    public void onResume() {
        nOnResume();
    }

    public byte[] sign(Context context, Object obj, byte[] bArr, int i10) {
        return nSign(context, obj, bArr, i10);
    }
}
