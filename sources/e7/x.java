package E7;

import C7.f;
import C7.i;
import C7.m;
import F7.b;
import Y7.h;
import Y7.l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class x implements f {

    /* renamed from: j  reason: collision with root package name */
    private static final h<Class<?>, byte[]> f35217j = new h<>(50);

    /* renamed from: b  reason: collision with root package name */
    private final b f35218b;

    /* renamed from: c  reason: collision with root package name */
    private final f f35219c;

    /* renamed from: d  reason: collision with root package name */
    private final f f35220d;

    /* renamed from: e  reason: collision with root package name */
    private final int f35221e;

    /* renamed from: f  reason: collision with root package name */
    private final int f35222f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f35223g;

    /* renamed from: h  reason: collision with root package name */
    private final i f35224h;

    /* renamed from: i  reason: collision with root package name */
    private final m<?> f35225i;

    x(b bVar, f fVar, f fVar2, int i10, int i11, m<?> mVar, Class<?> cls, i iVar) {
        this.f35218b = bVar;
        this.f35219c = fVar;
        this.f35220d = fVar2;
        this.f35221e = i10;
        this.f35222f = i11;
        this.f35225i = mVar;
        this.f35223g = cls;
        this.f35224h = iVar;
    }

    private byte[] c() {
        h<Class<?>, byte[]> hVar = f35217j;
        byte[] g10 = hVar.g(this.f35223g);
        if (g10 != null) {
            return g10;
        }
        byte[] bytes = this.f35223g.getName().getBytes(f.f33749a);
        hVar.k(this.f35223g, bytes);
        return bytes;
    }

    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f35218b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f35221e).putInt(this.f35222f).array();
        this.f35220d.b(messageDigest);
        this.f35219c.b(messageDigest);
        messageDigest.update(bArr);
        m<?> mVar = this.f35225i;
        if (mVar != null) {
            mVar.b(messageDigest);
        }
        this.f35224h.b(messageDigest);
        messageDigest.update(c());
        this.f35218b.e(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f35222f == xVar.f35222f && this.f35221e == xVar.f35221e && l.d(this.f35225i, xVar.f35225i) && this.f35223g.equals(xVar.f35223g) && this.f35219c.equals(xVar.f35219c) && this.f35220d.equals(xVar.f35220d) && this.f35224h.equals(xVar.f35224h);
    }

    public int hashCode() {
        int hashCode = (((((this.f35219c.hashCode() * 31) + this.f35220d.hashCode()) * 31) + this.f35221e) * 31) + this.f35222f;
        m<?> mVar = this.f35225i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f35223g.hashCode()) * 31) + this.f35224h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f35219c + ", signature=" + this.f35220d + ", width=" + this.f35221e + ", height=" + this.f35222f + ", decodedResourceClass=" + this.f35223g + ", transformation='" + this.f35225i + '\'' + ", options=" + this.f35224h + '}';
    }
}
