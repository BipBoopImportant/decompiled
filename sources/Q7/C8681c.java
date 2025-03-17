package q7;

import k7.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0018"}, d2 = {"Lq7/c;", "", "Lk7/x;", "name", "", "keyHash", "Lo7/g;", "x509authorityKeyIdentifier", "", "issuedByPreCertificateSigningCert", "<init>", "(Lk7/x;[BLo7/g;Z)V", "a", "Lk7/x;", "c", "()Lk7/x;", "b", "[B", "()[B", "Lo7/g;", "d", "()Lo7/g;", "Z", "()Z", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: q7.c  reason: case insensitive filesystem */
public final class C8681c {

    /* renamed from: a  reason: collision with root package name */
    private final x f55570a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f55571b;

    /* renamed from: c  reason: collision with root package name */
    private final g f55572c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f55573d;

    public C8681c(x xVar, byte[] bArr, g gVar, boolean z10) {
        C17542s.j(bArr, "keyHash");
        this.f55570a = xVar;
        this.f55571b = bArr;
        this.f55572c = gVar;
        this.f55573d = z10;
    }

    public final boolean a() {
        return this.f55573d;
    }

    public final byte[] b() {
        return this.f55571b;
    }

    public final x c() {
        return this.f55570a;
    }

    public final g d() {
        return this.f55572c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8681c(x xVar, byte[] bArr, g gVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : xVar, bArr, (i10 & 4) != 0 ? null : gVar, z10);
    }
}
