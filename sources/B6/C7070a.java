package b6;

import WK.C16770e;
import WK.C16773h;
import WK.C16780o;
import WK.N;
import XH.C16797D;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lb6/a;", "LWK/o;", "LWK/N;", "delegate", "<init>", "(LWK/N;)V", "LWK/h;", "bytes", "", "S1", "(LWK/h;)J", "LWK/e;", "sink", "byteCount", "d", "(LWK/e;J)J", "", "V0", "(J)Z", "u0", "b", "LWK/e;", "buffer", "c", "a", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: b6.a  reason: case insensitive filesystem */
public final class C7070a extends C16780o {

    /* renamed from: c  reason: collision with root package name */
    private static final C0785a f45490c = new C0785a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final C16773h f45491d = C16773h.f139664d.b("0021F904");

    /* renamed from: b  reason: collision with root package name */
    private final C16770e f45492b = new C16770e();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lb6/a$a;", "", "<init>", "()V", "LWK/h;", "FRAME_DELAY_START_MARKER", "LWK/h;", "", "FRAME_DELAY_START_MARKER_SIZE_BYTES", "I", "MINIMUM_FRAME_DELAY", "DEFAULT_FRAME_DELAY", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: b6.a$a  reason: collision with other inner class name */
    private static final class C0785a {
        public /* synthetic */ C0785a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0785a() {
        }
    }

    public C7070a(N n10) {
        super(n10);
    }

    private final long S1(C16773h hVar) {
        long j10 = -1;
        while (true) {
            j10 = this.f45492b.v(hVar.B(0), j10 + 1);
            if (j10 == -1 || (V0((long) hVar.W()) && this.f45492b.h3(j10, hVar))) {
                return j10;
            }
        }
        return j10;
    }

    private final boolean V0(long j10) {
        if (this.f45492b.size() >= j10) {
            return true;
        }
        long size = j10 - this.f45492b.size();
        return super.u0(this.f45492b, size) == size;
    }

    private final long d(C16770e eVar, long j10) {
        return C17978n.f(this.f45492b.u0(eVar, j10), 0);
    }

    public long u0(C16770e eVar, long j10) {
        V0(j10);
        if (this.f45492b.size() == 0) {
            return j10 == 0 ? 0 : -1;
        }
        long j11 = 0;
        while (true) {
            long S12 = S1(f45491d);
            if (S12 == -1) {
                break;
            }
            j11 += d(eVar, S12 + ((long) 4));
            if (V0(5) && this.f45492b.u(4) == 0 && (((C16797D.b(this.f45492b.u(2)) & 255) << 8) | (C16797D.b(this.f45492b.u(1)) & 255)) < 2) {
                eVar.Z1(this.f45492b.u(0));
                eVar.Z1(10);
                eVar.Z1(0);
                this.f45492b.M(3);
            }
        }
        if (j11 < j10) {
            j11 += d(eVar, j10 - j11);
        }
        if (j11 == 0) {
            return -1;
        }
        return j11;
    }
}
