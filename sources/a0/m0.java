package a0;

import C.C4391e0;
import android.media.MediaCodecInfo;
import android.util.Range;
import android.util.Size;
import b0.C5251a;
import c0.d;
import java.util.Objects;
import q.C5759a;

public class m0 extends Z implements k0 {

    /* renamed from: d  reason: collision with root package name */
    public static final C5759a<i0, k0> f15116d = new l0();

    /* renamed from: c  reason: collision with root package name */
    private final MediaCodecInfo.VideoCapabilities f15117c;

    m0(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f15068b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f15117c = videoCapabilities;
    }

    public static m0 l(i0 i0Var) {
        return new m0(C5251a.c(i0Var), i0Var.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k0 m(i0 i0Var) {
        try {
            return d.l(l(i0Var), (Size) null);
        } catch (d0 e10) {
            C4391e0.m("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e10);
            return null;
        }
    }

    private static IllegalArgumentException n(Throwable th2) {
        return th2 instanceof IllegalArgumentException ? (IllegalArgumentException) th2 : new IllegalArgumentException(th2);
    }

    public boolean a() {
        return true;
    }

    public Range<Integer> b(int i10) {
        try {
            return this.f15117c.getSupportedWidthsFor(i10);
        } catch (Throwable th2) {
            throw n(th2);
        }
    }

    public int c() {
        return this.f15117c.getHeightAlignment();
    }

    public boolean d(int i10, int i11) {
        return this.f15117c.isSizeSupported(i10, i11);
    }

    public int f() {
        return this.f15117c.getWidthAlignment();
    }

    public Range<Integer> g() {
        return this.f15117c.getBitrateRange();
    }

    public Range<Integer> h(int i10) {
        try {
            return this.f15117c.getSupportedHeightsFor(i10);
        } catch (Throwable th2) {
            throw n(th2);
        }
    }

    public Range<Integer> i() {
        return this.f15117c.getSupportedWidths();
    }

    public Range<Integer> j() {
        return this.f15117c.getSupportedHeights();
    }
}
