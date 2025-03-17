package G3;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import w3.k;

/* renamed from: G3.x  reason: case insensitive filesystem */
public final class C6503x {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f35999h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f36000a;

    /* renamed from: b  reason: collision with root package name */
    public final k f36001b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f36002c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, List<String>> f36003d;

    /* renamed from: e  reason: collision with root package name */
    public final long f36004e;

    /* renamed from: f  reason: collision with root package name */
    public final long f36005f;

    /* renamed from: g  reason: collision with root package name */
    public final long f36006g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6503x(long r13, w3.k r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f31433a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.C6503x.<init>(long, w3.k, long):void");
    }

    public static long a() {
        return f35999h.getAndIncrement();
    }

    public C6503x(long j10, k kVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f36000a = j10;
        this.f36001b = kVar;
        this.f36002c = uri;
        this.f36003d = map;
        this.f36004e = j11;
        this.f36005f = j12;
        this.f36006g = j13;
    }
}
