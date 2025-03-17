package h4;

import N3.O;
import t3.C5950a;
import t3.q;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f51604a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51605b;

    /* renamed from: c  reason: collision with root package name */
    public final O.a f51606c;

    /* renamed from: d  reason: collision with root package name */
    public final int f51607d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f51608e;

    public t(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11 = false;
        C5950a.a((bArr2 == null ? true : z11) ^ (i10 == 0));
        this.f51604a = z10;
        this.f51605b = str;
        this.f51607d = i10;
        this.f51608e = bArr2;
        this.f51606c = new O.a(a(str), bArr, i11, i12);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                q.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
