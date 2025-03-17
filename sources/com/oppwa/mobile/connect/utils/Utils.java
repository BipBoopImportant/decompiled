package com.oppwa.mobile.connect.utils;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Utils {
    public static int bundleHashCode(Bundle bundle) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        bundle.keySet().forEach(new w(atomicInteger, bundle));
        return atomicInteger.get();
    }

    public static byte[] bytesFromString(String str) {
        if (str != null) {
            return str.getBytes();
        }
        return null;
    }

    public static boolean compare(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static boolean equals(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null || bundle2 == null || bundle.keySet().size() != bundle2.keySet().size()) {
            return false;
        }
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            Object obj2 = bundle2.get(next);
            if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle)) {
                if (!Objects.equals(obj, obj2)) {
                    return false;
                }
            } else if (!equals((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
        }
        return true;
    }

    public static String normalizeCardNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        StringUtils.replaceAll(sb2, "-", "");
        StringUtils.replaceAll(sb2, " ", "");
        return sb2.toString();
    }

    public static String normalizeHolder(String str) {
        return TextUtils.isEmpty(str) ? str : str.trim();
    }

    public static byte[] readByteArray(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new PaymentException(PaymentError.getPaymentProviderInternalError(str));
    }

    public static String stringFromBytes(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    public static void writeByteArray(Parcel parcel, byte[] bArr) {
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            return;
        }
        parcel.writeInt(-1);
    }
}
