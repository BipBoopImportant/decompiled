package com.adjust.sdk.sig;

import android.content.Context;

public interface IKeystoreHelper {
    void deleteKeys(Context context);

    int getApiLevel();

    byte[] getHmac(Context context, byte[] bArr);

    void initKeys(Context context);
}
