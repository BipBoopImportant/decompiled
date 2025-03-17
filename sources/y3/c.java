package y3;

import android.media.MediaCodec;
import t3.C5950a;
import t3.N;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f32265a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f32266b;

    /* renamed from: c  reason: collision with root package name */
    public int f32267c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f32268d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f32269e;

    /* renamed from: f  reason: collision with root package name */
    public int f32270f;

    /* renamed from: g  reason: collision with root package name */
    public int f32271g;

    /* renamed from: h  reason: collision with root package name */
    public int f32272h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f32273i;

    /* renamed from: j  reason: collision with root package name */
    private final b f32274j;

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f32275a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f32276b;

        /* access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f32276b.set(i10, i11);
            this.f32275a.setPattern(this.f32276b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f32275a = cryptoInfo;
            this.f32276b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f32273i = cryptoInfo;
        this.f32274j = N.f29462a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f32273i;
    }

    public void b(int i10) {
        if (i10 != 0) {
            if (this.f32268d == null) {
                int[] iArr = new int[1];
                this.f32268d = iArr;
                this.f32273i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f32268d;
            iArr2[0] = iArr2[0] + i10;
        }
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f32270f = i10;
        this.f32268d = iArr;
        this.f32269e = iArr2;
        this.f32266b = bArr;
        this.f32265a = bArr2;
        this.f32267c = i11;
        this.f32271g = i12;
        this.f32272h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f32273i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (N.f29462a >= 24) {
            ((b) C5950a.e(this.f32274j)).b(i12, i13);
        }
    }
}
