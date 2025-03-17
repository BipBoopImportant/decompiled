package q7;

import java.time.Instant;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, d2 = {"Lq7/e;", "", "Lq7/f;", "sctVersion", "Lq7/d;", "id", "Ljava/time/Instant;", "timestamp", "Lq7/a;", "signature", "", "extensions", "<init>", "(Lq7/f;Lq7/d;Ljava/time/Instant;Lq7/a;[B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lq7/f;", "c", "()Lq7/f;", "b", "Lq7/d;", "()Lq7/d;", "Ljava/time/Instant;", "e", "()Ljava/time/Instant;", "d", "Lq7/a;", "()Lq7/a;", "[B", "()[B", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: q7.e  reason: case insensitive filesystem */
public final class C8683e {

    /* renamed from: a  reason: collision with root package name */
    private final C8684f f55575a;

    /* renamed from: b  reason: collision with root package name */
    private final C8682d f55576b;

    /* renamed from: c  reason: collision with root package name */
    private final Instant f55577c;

    /* renamed from: d  reason: collision with root package name */
    private final C8679a f55578d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f55579e;

    public C8683e(C8684f fVar, C8682d dVar, Instant instant, C8679a aVar, byte[] bArr) {
        C17542s.j(fVar, "sctVersion");
        C17542s.j(dVar, "id");
        C17542s.j(instant, "timestamp");
        C17542s.j(aVar, "signature");
        C17542s.j(bArr, "extensions");
        this.f55575a = fVar;
        this.f55576b = dVar;
        this.f55577c = instant;
        this.f55578d = aVar;
        this.f55579e = bArr;
    }

    public final byte[] a() {
        return this.f55579e;
    }

    public final C8682d b() {
        return this.f55576b;
    }

    public final C8684f c() {
        return this.f55575a;
    }

    public final C8679a d() {
        return this.f55578d;
    }

    public final Instant e() {
        return this.f55577c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C8683e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.verifier.model.SignedCertificateTimestamp");
        C8683e eVar = (C8683e) obj;
        return this.f55575a == eVar.f55575a && C17542s.e(this.f55576b, eVar.f55576b) && C17542s.e(this.f55577c, eVar.f55577c) && C17542s.e(this.f55578d, eVar.f55578d) && Arrays.equals(this.f55579e, eVar.f55579e);
    }

    public int hashCode() {
        return (((((((this.f55575a.hashCode() * 31) + this.f55576b.hashCode()) * 31) + this.f55577c.hashCode()) * 31) + this.f55578d.hashCode()) * 31) + Arrays.hashCode(this.f55579e);
    }

    public String toString() {
        return "SignedCertificateTimestamp(sctVersion=" + this.f55575a + ", id=" + this.f55576b + ", timestamp=" + this.f55577c + ", signature=" + this.f55578d + ", extensions=" + Arrays.toString(this.f55579e) + ')';
    }
}
