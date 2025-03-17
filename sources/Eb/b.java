package Eb;

import qb.C10180y;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f60177a;

    private b(a aVar) {
        this.f60177a = aVar;
    }

    public static b a(byte[] bArr, C10180y yVar) {
        if (yVar != null) {
            return new b(a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int b() {
        return this.f60177a.c();
    }
}
