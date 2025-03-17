package UK;

import WK.C16770e;
import WK.C16773h;
import WK.C16774i;
import WK.L;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001c"}, d2 = {"LUK/a;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "LWK/e;", "LWK/h;", "suffix", "d", "(LWK/e;LWK/h;)Z", "buffer", "LXH/N;", "c", "(LWK/e;)V", "close", "()V", "a", "Z", "b", "LWK/e;", "deflatedBytes", "Ljava/util/zip/Deflater;", "Ljava/util/zip/Deflater;", "deflater", "LWK/i;", "LWK/i;", "deflaterSink", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: UK.a  reason: case insensitive filesystem */
public final class C16634a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f139175a;

    /* renamed from: b  reason: collision with root package name */
    private final C16770e f139176b;

    /* renamed from: c  reason: collision with root package name */
    private final Deflater f139177c;

    /* renamed from: d  reason: collision with root package name */
    private final C16774i f139178d;

    public C16634a(boolean z10) {
        this.f139175a = z10;
        C16770e eVar = new C16770e();
        this.f139176b = eVar;
        Deflater deflater = new Deflater(-1, true);
        this.f139177c = deflater;
        this.f139178d = new C16774i((L) eVar, deflater);
    }

    private final boolean d(C16770e eVar, C16773h hVar) {
        return eVar.h3(eVar.size() - ((long) hVar.W()), hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        jI.C17416c.a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(WK.C16770e r6) {
        /*
            r5 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            WK.e r0 = r5.f139176b
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            boolean r0 = r5.f139175a
            if (r0 == 0) goto L_0x001a
            java.util.zip.Deflater r0 = r5.f139177c
            r0.reset()
        L_0x001a:
            WK.i r0 = r5.f139178d
            long r1 = r6.size()
            r0.s3(r6, r1)
            WK.i r0 = r5.f139178d
            r0.flush()
            WK.e r0 = r5.f139176b
            WK.h r1 = UK.C16635b.f139179a
            boolean r0 = r5.d(r0, r1)
            if (r0 == 0) goto L_0x0053
            WK.e r0 = r5.f139176b
            long r0 = r0.size()
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 - r2
            WK.e r2 = r5.f139176b
            r3 = 1
            r4 = 0
            WK.e$a r2 = WK.C16770e.h0(r2, r4, r3, r4)
            r2.e(r0)     // Catch:{ all -> 0x004c }
            jI.C17416c.a(r2, r4)
            goto L_0x0059
        L_0x004c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            jI.C17416c.a(r2, r6)
            throw r0
        L_0x0053:
            WK.e r0 = r5.f139176b
            r1 = 0
            r0.Z1(r1)
        L_0x0059:
            WK.e r0 = r5.f139176b
            long r1 = r0.size()
            r6.s3(r0, r1)
            return
        L_0x0063:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: UK.C16634a.c(WK.e):void");
    }

    public void close() {
        this.f139178d.close();
    }
}
