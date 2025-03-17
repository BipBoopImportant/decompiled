package com.google.android.libraries.places.internal;

public final class zznj {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static String zzb(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        } else if (zzc(str.charAt(0))) {
            int i10 = 1;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if (zzc(charAt) || ((charAt >= '0' && charAt <= '9') || charAt == '_')) {
                    i10++;
                } else {
                    throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                }
            }
            return str;
        } else {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
    }

    private static boolean zzc(char c10) {
        if (c10 >= 'a' && c10 <= 'z') {
            return true;
        }
        if (c10 >= 'A') {
            return c10 <= 'Z';
        }
        return false;
    }
}
