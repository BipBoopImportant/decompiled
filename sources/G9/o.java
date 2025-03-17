package G9;

import K9.C0;
import K9.C6620s;
import K9.X;
import T9.b;
import T9.d;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class o extends C0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f36324a;

    protected o(byte[] bArr) {
        C6620s.a(bArr.length == 25);
        this.f36324a = Arrays.hashCode(bArr);
    }

    protected static byte[] K3(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] L3();

    public final boolean equals(Object obj) {
        b zzd;
        if (obj != null && (obj instanceof X)) {
            try {
                X x10 = (X) obj;
                if (x10.zzc() != this.f36324a || (zzd = x10.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(L3(), (byte[]) d.K3(zzd));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36324a;
    }

    public final int zzc() {
        return this.f36324a;
    }

    public final b zzd() {
        return d.L3(L3());
    }
}
