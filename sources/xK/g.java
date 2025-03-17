package XK;

import WK.C16770e;
import WK.C16780o;
import WK.N;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0018"}, d2 = {"LXK/g;", "LWK/o;", "LWK/N;", "delegate", "", "size", "", "truncate", "<init>", "(LWK/N;JZ)V", "LWK/e;", "newSize", "LXH/N;", "d", "(LWK/e;J)V", "sink", "byteCount", "u0", "(LWK/e;J)J", "b", "J", "c", "Z", "bytesReceived", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends C16780o {

    /* renamed from: b  reason: collision with root package name */
    private final long f140292b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f140293c;

    /* renamed from: d  reason: collision with root package name */
    private long f140294d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(N n10, long j10, boolean z10) {
        super(n10);
        C17542s.j(n10, "delegate");
        this.f140292b = j10;
        this.f140293c = z10;
    }

    private final void d(C16770e eVar, long j10) {
        C16770e eVar2 = new C16770e();
        eVar2.Y(eVar);
        eVar.s3(eVar2, j10);
        eVar2.c();
    }

    public long u0(C16770e eVar, long j10) {
        C17542s.j(eVar, "sink");
        long j11 = this.f140294d;
        long j12 = this.f140292b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f140293c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1;
            }
            j10 = Math.min(j10, j13);
        }
        long u02 = super.u0(eVar, j10);
        int i10 = (u02 > -1 ? 1 : (u02 == -1 ? 0 : -1));
        if (i10 != 0) {
            this.f140294d += u02;
        }
        long j14 = this.f140294d;
        long j15 = this.f140292b;
        if ((j14 >= j15 || i10 != 0) && j14 <= j15) {
            return u02;
        }
        if (u02 > 0 && j14 > j15) {
            d(eVar, eVar.size() - (this.f140294d - this.f140292b));
        }
        throw new IOException("expected " + this.f140292b + " bytes but got " + this.f140294d);
    }
}
