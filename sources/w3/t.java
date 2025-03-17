package w3;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class t extends r {

    /* renamed from: d  reason: collision with root package name */
    public final int f31502d;

    /* renamed from: e  reason: collision with root package name */
    public final String f31503e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, List<String>> f31504f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f31505g;

    public t(int i10, String str, IOException iOException, Map<String, List<String>> map, k kVar, byte[] bArr) {
        super("Response code: " + i10, iOException, kVar, 2004, 1);
        this.f31502d = i10;
        this.f31503e = str;
        this.f31504f = map;
        this.f31505g = bArr;
    }
}
