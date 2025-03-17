package K6;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;

final class P {
    static int a(String str) {
        if (str == null || str.trim().equalsIgnoreCase("")) {
            return -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            try {
                char charAt = str.charAt(i10);
                if (charAt < 128) {
                    i11 += charAt;
                }
                i10++;
            } catch (Exception unused) {
                return -2;
            }
        }
        return i11;
    }

    public static long b(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    static String c(String str) {
        try {
            byte[] bytes = str.getBytes(Constants.ENCODING);
            StringBuffer stringBuffer = new StringBuffer(bytes.length);
            for (byte b10 : bytes) {
                if (!(b10 < 33 || b10 > 126 || b10 == 34 || b10 == 37 || b10 == 39 || b10 == 44)) {
                    if (b10 != 92) {
                        stringBuffer.append((char) b10);
                    }
                }
                stringBuffer.append('%');
                char forDigit = Character.forDigit((b10 >> 4) & 15, 16);
                if (Character.isLetter(forDigit)) {
                    forDigit = (char) (forDigit - ' ');
                }
                stringBuffer.append(forDigit);
                char forDigit2 = Character.forDigit(b10 & 15, 16);
                if (Character.isLetter(forDigit2)) {
                    forDigit2 = (char) (forDigit2 - ' ');
                }
                stringBuffer.append(forDigit2);
            }
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException unused) {
            return "utf8-encode-err";
        }
    }
}
