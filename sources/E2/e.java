package E2;

import H2.i;
import android.util.Base64;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f5970a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5971b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5972c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f5973d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5974e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f5975f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f5970a = (String) i.g(str);
        this.f5971b = (String) i.g(str2);
        this.f5972c = (String) i.g(str3);
        this.f5973d = (List) i.g(list);
        this.f5975f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f5973d;
    }

    public int c() {
        return this.f5974e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f5975f;
    }

    public String e() {
        return this.f5970a;
    }

    public String f() {
        return this.f5971b;
    }

    public String g() {
        return this.f5972c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f5970a + ", mProviderPackage: " + this.f5971b + ", mQuery: " + this.f5972c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f5973d.size(); i10++) {
            sb2.append(" [");
            List list = this.f5973d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f5974e);
        return sb2.toString();
    }
}
