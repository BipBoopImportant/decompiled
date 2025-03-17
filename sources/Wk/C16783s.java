package WK;

import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001e"}, d2 = {"LWK/s;", "LWK/n;", "LWK/L;", "sink", "Ljava/security/MessageDigest;", "digest", "<init>", "(LWK/L;Ljava/security/MessageDigest;)V", "", "algorithm", "(LWK/L;Ljava/lang/String;)V", "LWK/e;", "source", "", "byteCount", "LXH/N;", "s3", "(LWK/e;J)V", "b", "Ljava/security/MessageDigest;", "messageDigest", "Ljavax/crypto/Mac;", "c", "Ljavax/crypto/Mac;", "mac", "LWK/h;", "()LWK/h;", "hash", "d", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.s  reason: case insensitive filesystem */
public final class C16783s extends C16779n implements L {

    /* renamed from: d  reason: collision with root package name */
    public static final a f139708d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final MessageDigest f139709b;

    /* renamed from: c  reason: collision with root package name */
    private final Mac f139710c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"LWK/s$a;", "", "<init>", "()V", "LWK/L;", "sink", "LWK/s;", "a", "(LWK/L;)LWK/s;", "b", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16783s a(L l10) {
            C17542s.j(l10, "sink");
            return new C16783s(l10, "MD5");
        }

        public final C16783s b(L l10) {
            C17542s.j(l10, "sink");
            return new C16783s(l10, Constants.SHA256);
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16783s(L l10, MessageDigest messageDigest) {
        super(l10);
        C17542s.j(l10, "sink");
        C17542s.j(messageDigest, "digest");
        this.f139709b = messageDigest;
        this.f139710c = null;
    }

    public final C16773h c() {
        byte[] bArr;
        MessageDigest messageDigest = this.f139709b;
        if (messageDigest != null) {
            bArr = messageDigest.digest();
        } else {
            Mac mac = this.f139710c;
            C17542s.g(mac);
            bArr = mac.doFinal();
        }
        C17542s.g(bArr);
        return new C16773h(bArr);
    }

    public void s3(C16770e eVar, long j10) {
        C17542s.j(eVar, "source");
        C16767b.b(eVar.size(), 0, j10);
        I i10 = eVar.f139653a;
        C17542s.g(i10);
        long j11 = 0;
        while (j11 < j10) {
            int min = (int) Math.min(j10 - j11, (long) (i10.f139612c - i10.f139611b));
            MessageDigest messageDigest = this.f139709b;
            if (messageDigest != null) {
                messageDigest.update(i10.f139610a, i10.f139611b, min);
            } else {
                Mac mac = this.f139710c;
                C17542s.g(mac);
                mac.update(i10.f139610a, i10.f139611b, min);
            }
            j11 += (long) min;
            i10 = i10.f139615f;
            C17542s.g(i10);
        }
        super.s3(eVar, j10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16783s(WK.L r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "getInstance(...)"
            kotlin.jvm.internal.C17542s.i(r3, r0)
            r1.<init>((WK.L) r2, (java.security.MessageDigest) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WK.C16783s.<init>(WK.L, java.lang.String):void");
    }
}
