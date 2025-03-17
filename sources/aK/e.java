package AK;

import DK.C15581a;
import android.util.Base64;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.regex.Pattern;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f133164a = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    public static void a(String str) {
        boolean z10 = false;
        g.a(43 <= str.length(), "codeVerifier length is shorter than allowed by the PKCE specification");
        if (str.length() <= 128) {
            z10 = true;
        }
        g.a(z10, "codeVerifier length is longer than allowed by the PKCE specification");
        g.a(f133164a.matcher(str).matches(), "codeVerifier string contains illegal characters");
    }

    public static String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.SHA256);
            instance.update(str.getBytes("ISO_8859_1"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e10) {
            C15581a.g("SHA-256 is not supported on this device! Using plain challenge", e10);
            return str;
        } catch (UnsupportedEncodingException e11) {
            C15581a.c("ISO-8859-1 encoding not supported on this device!", e11);
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e11);
        }
    }

    public static String c() {
        return d(new SecureRandom(), 64);
    }

    public static String d(SecureRandom secureRandom, int i10) {
        g.e(secureRandom, "entropySource cannot be null");
        boolean z10 = false;
        g.a(32 <= i10, "entropyBytes is less than the minimum permitted");
        if (i10 <= 96) {
            z10 = true;
        }
        g.a(z10, "entropyBytes is greater than the maximum permitted");
        byte[] bArr = new byte[i10];
        secureRandom.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public static String e() {
        try {
            MessageDigest.getInstance(Constants.SHA256);
            return "S256";
        } catch (NoSuchAlgorithmException unused) {
            return "plain";
        }
    }
}
