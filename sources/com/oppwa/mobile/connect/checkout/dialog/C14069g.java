package com.oppwa.mobile.connect.checkout.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.oppwa.mobile.connect.utils.Logger;
import com.optimizely.ab.config.FeatureVariable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.g  reason: case insensitive filesystem */
class C14069g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f121240a = "com.oppwa.mobile.connect.checkout.dialog.g";

    @SuppressLint({"DiscouragedApi"})
    static int a(Context context, String str) {
        return context.getResources().getIdentifier(str.toLowerCase(), "drawable", context.getPackageName());
    }

    static String b(Context context, String str) {
        int c10 = c(context, str);
        return c10 != 0 ? context.getString(c10) : Utils.formatPaymentBrandString(str);
    }

    @SuppressLint({"DiscouragedApi"})
    static int c(Context context, String str) {
        return context.getResources().getIdentifier(str.toLowerCase(), FeatureVariable.STRING_TYPE, context.getPackageName());
    }

    static String a(Context context, int i10) {
        InputStream openRawResource = context.getResources().openRawResource(i10);
        if (openRawResource == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    try {
                        break;
                    } catch (IOException e10) {
                        Log.e(f121240a, e10.getMessage());
                    }
                }
            } catch (IOException e11) {
                Logger.error(e11.getMessage());
                openRawResource.close();
            } catch (Throwable th2) {
                try {
                    openRawResource.close();
                } catch (IOException e12) {
                    Log.e(f121240a, e12.getMessage());
                }
                throw th2;
            }
        }
        openRawResource.close();
        return sb2.toString();
    }
}
