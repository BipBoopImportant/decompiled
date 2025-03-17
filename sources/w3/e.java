package w3;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import q3.B;
import t3.C5950a;
import t3.N;

public final class e extends C6218b {

    /* renamed from: e  reason: collision with root package name */
    private k f31422e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f31423f;

    /* renamed from: g  reason: collision with root package name */
    private int f31424g;

    /* renamed from: h  reason: collision with root package name */
    private int f31425h;

    public e() {
        super(false);
    }

    public long b(k kVar) {
        r(kVar);
        this.f31422e = kVar;
        Uri normalizeScheme = kVar.f31433a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        C5950a.b(equals, "Unsupported scheme: " + scheme);
        String[] h12 = N.h1(normalizeScheme.getSchemeSpecificPart(), ",");
        if (h12.length == 2) {
            String str = h12[1];
            if (h12[0].contains(";base64")) {
                try {
                    this.f31423f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw B.b("Error while parsing Base64 encoded string: " + str, e10);
                }
            } else {
                this.f31423f = N.s0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
            }
            long j10 = kVar.f31439g;
            byte[] bArr = this.f31423f;
            if (j10 <= ((long) bArr.length)) {
                int i10 = (int) j10;
                this.f31424g = i10;
                int length = bArr.length - i10;
                this.f31425h = length;
                long j11 = kVar.f31440h;
                if (j11 != -1) {
                    this.f31425h = (int) Math.min((long) length, j11);
                }
                s(kVar);
                long j12 = kVar.f31440h;
                return j12 != -1 ? j12 : (long) this.f31425h;
            }
            this.f31423f = null;
            throw new h(2008);
        }
        throw B.b("Unexpected URI format: " + normalizeScheme, (Throwable) null);
    }

    public int c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f31425h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(N.i(this.f31423f), this.f31424g, bArr, i10, min);
        this.f31424g += min;
        this.f31425h -= min;
        p(min);
        return min;
    }

    public void close() {
        if (this.f31423f != null) {
            this.f31423f = null;
            q();
        }
        this.f31422e = null;
    }

    public Uri n() {
        k kVar = this.f31422e;
        if (kVar != null) {
            return kVar.f31433a;
        }
        return null;
    }
}
