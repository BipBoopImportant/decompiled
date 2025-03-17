package g4;

import N3.C6660F;
import N3.C6670h;

/* renamed from: g4.a  reason: case insensitive filesystem */
final class C7865a extends C6670h implements C7871g {

    /* renamed from: h  reason: collision with root package name */
    private final long f51216h;

    /* renamed from: i  reason: collision with root package name */
    private final int f51217i;

    /* renamed from: j  reason: collision with root package name */
    private final int f51218j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f51219k;

    /* renamed from: l  reason: collision with root package name */
    private final long f51220l;

    public C7865a(long j10, long j11, C6660F.a aVar, boolean z10) {
        this(j10, j11, aVar.f38758f, aVar.f38755c, z10);
    }

    public long e() {
        return this.f51220l;
    }

    public long g(long j10) {
        return b(j10);
    }

    public C7865a h(long j10) {
        return new C7865a(j10, this.f51216h, this.f51217i, this.f51218j, this.f51219k);
    }

    public int k() {
        return this.f51217i;
    }

    public C7865a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        this.f51216h = j11;
        this.f51217i = i10;
        this.f51218j = i11;
        this.f51219k = z10;
        this.f51220l = j10 == -1 ? -1 : j10;
    }
}
