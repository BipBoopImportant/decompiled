package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.adjust.sdk.sig.KeystoreHelper;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.util.Map;

public class SignerInstance {
    static final int MAX_SIGNER_RETRIES = 2;
    private static final int PAYLOAD_SIZE = 96;
    private static final String TAG = "SignerInstance";
    private static boolean didEnableSigning = true;
    private static boolean didReceiveError = false;

    private void initMap(Map<String, String> map, String str, String str2) {
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
    }

    private void restoreMap(Map<String, String> map) {
        map.remove("activity_kind");
        map.remove("client_sdk");
    }

    public void disableSigning() {
        didEnableSigning = false;
    }

    public void enableSigning() {
        didEnableSigning = true;
    }

    public void onResume(INativeLibHelper iNativeLibHelper) {
        if (!didReceiveError && didEnableSigning) {
            iNativeLibHelper.onResume();
        }
    }

    public void resetLibrary(Context context, IKeystoreHelper iKeystoreHelper) {
        didReceiveError = false;
        iKeystoreHelper.deleteKeys(context);
    }

    public void sign(Context context, IKeystoreHelper iKeystoreHelper, INativeLibHelper iNativeLibHelper, Map<String, String> map, String str, String str2) {
        byte[] bArr;
        if (didReceiveError || !didEnableSigning) {
            Log.e(TAG, "sign: library received error. It has locked down");
        } else if (map == null || map.size() == 0 || str == null || str2 == null) {
            Log.e(TAG, "sign: One or more parameters are null");
        } else {
            initMap(map, str, str2);
            int i10 = 2;
            while (true) {
                if (i10 <= 0) {
                    bArr = null;
                    break;
                }
                try {
                    iKeystoreHelper.initKeys(context);
                    bArr = iKeystoreHelper.getHmac(context, map.toString().getBytes(Constants.ENCODING));
                    break;
                } catch (KeystoreHelper.UnsupportedApiException e10) {
                    Log.e(TAG, "sign: Api is less than JellyBean-4-18");
                    didReceiveError = true;
                    restoreMap(map);
                    throw e10;
                } catch (InvalidKeyException | UnrecoverableKeyException e11) {
                    Log.e(TAG, "sign: Received a retriable exception: " + e11.getMessage(), e11);
                    Log.e(TAG, "sign: Attempting retry #" + i10);
                    i10 += -1;
                    iKeystoreHelper.deleteKeys(context);
                } catch (Exception e12) {
                    Log.e(TAG, "sign: Received an Exception: " + e12.getMessage(), e12);
                    restoreMap(map);
                    throw e12;
                }
            }
            if (i10 == 0) {
                didReceiveError = true;
                restoreMap(map);
                return;
            }
            byte[] sign = iNativeLibHelper.sign(context, map, bArr, iKeystoreHelper.getApiLevel());
            if (sign == null) {
                Log.e(TAG, "sign: Returned an null signature. Exiting...");
                restoreMap(map);
            } else if (sign.length != PAYLOAD_SIZE) {
                Log.e(TAG, "sign: Output bytes length is invalid. Exiting...");
                restoreMap(map);
            } else {
                map.put("signature", Util.bytesToHex(sign, PAYLOAD_SIZE));
                restoreMap(map);
            }
        }
    }
}
