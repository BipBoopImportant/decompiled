package z3;

import t3.N;

/* renamed from: z3.b  reason: case insensitive filesystem */
public final class C6279b {

    /* renamed from: a  reason: collision with root package name */
    public int f32406a;

    /* renamed from: b  reason: collision with root package name */
    public int f32407b;

    /* renamed from: c  reason: collision with root package name */
    public int f32408c;

    /* renamed from: d  reason: collision with root package name */
    public int f32409d;

    /* renamed from: e  reason: collision with root package name */
    public int f32410e;

    /* renamed from: f  reason: collision with root package name */
    public int f32411f;

    /* renamed from: g  reason: collision with root package name */
    public int f32412g;

    /* renamed from: h  reason: collision with root package name */
    public int f32413h;

    /* renamed from: i  reason: collision with root package name */
    public int f32414i;

    /* renamed from: j  reason: collision with root package name */
    public int f32415j;

    /* renamed from: k  reason: collision with root package name */
    public long f32416k;

    /* renamed from: l  reason: collision with root package name */
    public int f32417l;

    private void b(long j10, int i10) {
        this.f32416k += j10;
        this.f32417l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return N.G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f32406a), Integer.valueOf(this.f32407b), Integer.valueOf(this.f32408c), Integer.valueOf(this.f32409d), Integer.valueOf(this.f32410e), Integer.valueOf(this.f32411f), Integer.valueOf(this.f32412g), Integer.valueOf(this.f32413h), Integer.valueOf(this.f32414i), Integer.valueOf(this.f32415j), Long.valueOf(this.f32416k), Integer.valueOf(this.f32417l));
    }
}
