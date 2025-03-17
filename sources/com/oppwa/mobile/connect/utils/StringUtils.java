package com.oppwa.mobile.connect.utils;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f122173a = Pattern.compile("\\d{2,}");

    private static boolean a(char c10) {
        return Character.isDigit(c10) && (c10 < '0' || c10 > '9');
    }

    public static boolean compareStringBuilders(StringBuilder sb2, StringBuilder sb3) {
        if (sb2.length() != sb3.length()) {
            return false;
        }
        for (int i10 = 0; i10 < sb2.length(); i10++) {
            if (sb2.charAt(i10) != sb3.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static String convertFromBase64(String str) {
        return new String(Base64.decode(str, 0)).trim();
    }

    public static byte[] getBytes(CharSequence charSequence) {
        ByteBuffer encode = StandardCharsets.UTF_8.encode(CharBuffer.wrap(charSequence));
        byte[] copyOfRange = Arrays.copyOfRange(encode.array(), encode.position(), encode.limit());
        Arrays.fill(encode.array(), (byte) 0);
        return copyOfRange;
    }

    public static String inputStreamToString(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static void removeSubstring(StringBuilder sb2, String str) {
        replaceAll(sb2, str, "");
    }

    public static void replaceAll(StringBuilder sb2, String str, String str2) {
        int indexOf = sb2.indexOf(str);
        while (indexOf != -1) {
            sb2.replace(indexOf, str.length() + indexOf, str2);
            indexOf = sb2.indexOf(str, indexOf + str2.length());
        }
    }

    public static String replaceNonstandardDigits(String str) {
        if (!stringHasNonstandardDigits(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        replaceNonstandardDigits(sb2);
        return sb2.toString();
    }

    public static boolean stringHasNonstandardDigits(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (a(charSequence.charAt(i10))) {
                return true;
            }
        }
        return false;
    }

    public static String unmaskNumbers(String str) {
        Matcher matcher = f122173a.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(0);
            if (group != null) {
                str = str.replaceFirst(group, a(group));
            }
        }
        return str;
    }

    public static void wipeString(StringBuilder sb2) {
        for (int i10 = 0; i10 < sb2.length(); i10++) {
            sb2.setCharAt(i10, 0);
        }
    }

    private static String a(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (i10 > 0) {
                sb2.append("_");
            }
            sb2.append(charArray[i10]);
        }
        return sb2.toString();
    }

    public static void replaceNonstandardDigits(StringBuilder sb2) {
        int numericValue;
        if (!TextUtils.isEmpty(sb2)) {
            for (int i10 = 0; i10 < sb2.length(); i10++) {
                char charAt = sb2.charAt(i10);
                if (a(charAt) && (numericValue = Character.getNumericValue(charAt)) >= 0) {
                    sb2.setCharAt(i10, (char) (numericValue + 48));
                }
            }
        }
    }
}
