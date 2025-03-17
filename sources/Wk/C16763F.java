package WK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"LWK/F;", "LWK/N;", "LWK/g;", "upstream", "<init>", "(LWK/g;)V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LWK/O;", "y", "()LWK/O;", "LXH/N;", "close", "()V", "a", "LWK/g;", "b", "LWK/e;", "buffer", "LWK/I;", "c", "LWK/I;", "expectedSegment", "", "d", "I", "expectedPos", "", "e", "Z", "closed", "f", "J", "pos", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.F  reason: case insensitive filesystem */
public final class C16763F implements N {

    /* renamed from: a  reason: collision with root package name */
    private final C16772g f139595a;

    /* renamed from: b  reason: collision with root package name */
    private final C16770e f139596b;

    /* renamed from: c  reason: collision with root package name */
    private I f139597c;

    /* renamed from: d  reason: collision with root package name */
    private int f139598d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f139599e;

    /* renamed from: f  reason: collision with root package name */
    private long f139600f;

    public C16763F(C16772g gVar) {
        C17542s.j(gVar, "upstream");
        this.f139595a = gVar;
        C16770e p10 = gVar.p();
        this.f139596b = p10;
        I i10 = p10.f139653a;
        this.f139597c = i10;
        this.f139598d = i10 != null ? i10.f139611b : -1;
    }

    public void close() {
        this.f139599e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r3 == r4.f139611b) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long u0(WK.C16770e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0075
            boolean r3 = r8.f139599e
            if (r3 != 0) goto L_0x006d
            WK.I r3 = r8.f139597c
            if (r3 == 0) goto L_0x002b
            WK.e r4 = r8.f139596b
            WK.I r4 = r4.f139653a
            if (r3 != r4) goto L_0x0023
            int r3 = r8.f139598d
            kotlin.jvm.internal.C17542s.g(r4)
            int r4 = r4.f139611b
            if (r3 != r4) goto L_0x0023
            goto L_0x002b
        L_0x0023:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L_0x002b:
            if (r2 != 0) goto L_0x002e
            return r0
        L_0x002e:
            WK.g r0 = r8.f139595a
            long r1 = r8.f139600f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.V0(r1)
            if (r0 != 0) goto L_0x003e
            r9 = -1
            return r9
        L_0x003e:
            WK.I r0 = r8.f139597c
            if (r0 != 0) goto L_0x0051
            WK.e r0 = r8.f139596b
            WK.I r0 = r0.f139653a
            if (r0 == 0) goto L_0x0051
            r8.f139597c = r0
            kotlin.jvm.internal.C17542s.g(r0)
            int r0 = r0.f139611b
            r8.f139598d = r0
        L_0x0051:
            WK.e r0 = r8.f139596b
            long r0 = r0.size()
            long r2 = r8.f139600f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            WK.e r2 = r8.f139596b
            long r4 = r8.f139600f
            r3 = r9
            r6 = r10
            r2.l(r3, r4, r6)
            long r0 = r8.f139600f
            long r0 = r0 + r10
            r8.f139600f = r0
            return r10
        L_0x006d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L_0x0075:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: WK.C16763F.u0(WK.e, long):long");
    }

    public O y() {
        return this.f139595a.y();
    }
}
