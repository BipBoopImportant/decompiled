package E3;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import q3.A;
import q3.C5798i;
import q3.C5807s;
import t3.C5950a;
import t3.N;
import t3.q;
import z3.C6280c;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f34823a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34824b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34825c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f34826d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f34827e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f34828f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f34829g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f34830h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f34831i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f34832j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f34833k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f34834l;

    t(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f34823a = (String) C5950a.e(str);
        this.f34824b = str2;
        this.f34825c = str3;
        this.f34826d = codecCapabilities;
        this.f34830h = z10;
        this.f34831i = z11;
        this.f34832j = z12;
        this.f34827e = z13;
        this.f34828f = z14;
        this.f34829g = z15;
        this.f34833k = z16;
        this.f34834l = A.q(str2);
    }

    private static boolean A(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(N.f29463b);
    }

    public static t B(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new t(str, str2, str3, codecCapabilities, z10, z11, z12, !z13 && codecCapabilities != null && h(codecCapabilities) && !y(str), codecCapabilities != null && s(codecCapabilities), z14 || (codecCapabilities != null && r(codecCapabilities)), l(codecCapabilities));
    }

    private static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((N.f29462a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        q.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(N.k(i10, widthAlignment) * widthAlignment, N.k(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point b10 = b(videoCapabilities, i10, i11);
        int i12 = b10.x;
        int i13 = b10.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.media.MediaCodecInfo.CodecProfileLevel[] f(android.media.MediaCodecInfo.CodecCapabilities r2) {
        /*
            if (r2 == 0) goto L_0x0017
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()
            if (r2 == 0) goto L_0x0017
            android.util.Range r2 = r2.getBitrateRange()
            java.lang.Comparable r2 = r2.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r0 = 180000000(0xaba9500, float:1.7967196E-32)
            r1 = 1
            if (r2 < r0) goto L_0x0021
            r2 = 1024(0x400, float:1.435E-42)
            goto L_0x0068
        L_0x0021:
            r0 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r2 < r0) goto L_0x0029
            r2 = 512(0x200, float:7.175E-43)
            goto L_0x0068
        L_0x0029:
            r0 = 60000000(0x3938700, float:8.670878E-37)
            if (r2 < r0) goto L_0x0031
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0031:
            r0 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r2 < r0) goto L_0x0039
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x0068
        L_0x0039:
            r0 = 18000000(0x112a880, float:2.6936858E-38)
            if (r2 < r0) goto L_0x0041
            r2 = 64
            goto L_0x0068
        L_0x0041:
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r2 < r0) goto L_0x0049
            r2 = 32
            goto L_0x0068
        L_0x0049:
            r0 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r2 < r0) goto L_0x0051
            r2 = 16
            goto L_0x0068
        L_0x0051:
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            if (r2 < r0) goto L_0x0059
            r2 = 8
            goto L_0x0068
        L_0x0059:
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r2 < r0) goto L_0x0060
            r2 = 4
            goto L_0x0068
        L_0x0060:
            r0 = 800000(0xc3500, float:1.121039E-39)
            if (r2 < r0) goto L_0x0067
            r2 = 2
            goto L_0x0068
        L_0x0067:
            r2 = r1
        L_0x0068:
            android.media.MediaCodecInfo$CodecProfileLevel r0 = new android.media.MediaCodecInfo$CodecProfileLevel
            r0.<init>()
            r0.profile = r1
            r0.level = r2
            android.media.MediaCodecInfo$CodecProfileLevel[] r2 = new android.media.MediaCodecInfo.CodecProfileLevel[]{r0}
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.t.f(android.media.MediaCodecInfo$CodecCapabilities):android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean k(C5807s sVar, boolean z10) {
        Pair<Integer, Integer> h10 = L.h(sVar);
        String str = sVar.f28244o;
        if (str != null && str.equals("video/mv-hevc")) {
            String r10 = A.r(this.f34825c);
            if (r10.equals("video/mv-hevc")) {
                return true;
            }
            if (r10.equals("video/hevc")) {
                h10 = L.o(sVar);
            }
        }
        if (h10 == null) {
            return true;
        }
        int intValue = ((Integer) h10.first).intValue();
        int intValue2 = ((Integer) h10.second).intValue();
        if ("video/dolby-vision".equals(sVar.f28244o)) {
            if ("video/avc".equals(this.f34824b)) {
                intValue = 8;
            } else if ("video/hevc".equals(this.f34824b)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (!this.f34834l && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g10 = g();
        if (N.f29462a <= 23 && "video/x-vnd.on2.vp9".equals(this.f34824b) && g10.length == 0) {
            g10 = f(this.f34826d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g10) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z10) && !z(this.f34824b, intValue))) {
                return true;
            }
        }
        v("codec.profileLevel, " + sVar.f28240k + ", " + this.f34825c);
        return false;
    }

    private static boolean l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return N.f29462a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface");
    }

    private boolean p(C5807s sVar) {
        return this.f34824b.equals(sVar.f28244o) || this.f34824b.equals(L.e(sVar));
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void u(String str) {
        q.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f34823a + ", " + this.f34824b + "] [" + N.f29466e + "]");
    }

    private void v(String str) {
        q.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f34823a + ", " + this.f34824b + "] [" + N.f29466e + "]");
    }

    private static boolean w(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean x(String str) {
        return N.f29465d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean y(String str) {
        if (N.f29462a <= 22) {
            String str2 = N.f29465d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean z(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = N.f29463b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34826d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public C6280c e(C5807s sVar, C5807s sVar2) {
        int i10 = !N.d(sVar.f28244o, sVar2.f28244o) ? 8 : 0;
        if (this.f34834l) {
            if (sVar.f28254y != sVar2.f28254y) {
                i10 |= 1024;
            }
            if (!this.f34827e && !(sVar.f28251v == sVar2.f28251v && sVar.f28252w == sVar2.f28252w)) {
                i10 |= 512;
            }
            if ((!C5798i.h(sVar.f28218C) || !C5798i.h(sVar2.f28218C)) && !N.d(sVar.f28218C, sVar2.f28218C)) {
                i10 |= RecyclerView.n.FLAG_MOVED;
            }
            if (x(this.f34823a) && !sVar.f(sVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C6280c(this.f34823a, sVar, sVar2, sVar.f(sVar2) ? 3 : 2, 0);
            }
        } else {
            if (sVar.f28219D != sVar2.f28219D) {
                i10 |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (sVar.f28220E != sVar2.f28220E) {
                i10 |= 8192;
            }
            if (sVar.f28221F != sVar2.f28221F) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f34824b)) {
                Pair<Integer, Integer> h10 = L.h(sVar);
                Pair<Integer, Integer> h11 = L.h(sVar2);
                if (!(h10 == null || h11 == null)) {
                    int intValue = ((Integer) h10.first).intValue();
                    int intValue2 = ((Integer) h11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C6280c(this.f34823a, sVar, sVar2, 3, 0);
                    }
                }
            }
            if (!sVar.f(sVar2)) {
                i10 |= 32;
            }
            if (w(this.f34824b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C6280c(this.f34823a, sVar, sVar2, 1, 0);
            }
        }
        return new C6280c(this.f34823a, sVar, sVar2, 0, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f34826d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.t.g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    public boolean i(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34826d;
        if (codecCapabilities == null) {
            v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("channelCount.aCaps");
            return false;
        } else if (a(this.f34823a, this.f34824b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        } else {
            v("channelCount.support, " + i10);
            return false;
        }
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34826d;
        if (codecCapabilities == null) {
            v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            v("sampleRate.support, " + i10);
            return false;
        }
    }

    public boolean m(C5807s sVar) {
        return p(sVar) && k(sVar, false);
    }

    public boolean n(C5807s sVar) {
        int i10;
        if (!p(sVar) || !k(sVar, true)) {
            return false;
        }
        if (this.f34834l) {
            int i11 = sVar.f28251v;
            if (i11 <= 0 || (i10 = sVar.f28252w) <= 0) {
                return true;
            }
            return t(i11, i10, (double) sVar.f28253x);
        }
        int i12 = sVar.f28220E;
        if (i12 != -1 && !j(i12)) {
            return false;
        }
        int i13 = sVar.f28219D;
        return i13 == -1 || i(i13);
    }

    public boolean o() {
        if (N.f29462a >= 29 && "video/x-vnd.on2.vp9".equals(this.f34824b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean q(C5807s sVar) {
        if (this.f34834l) {
            return this.f34827e;
        }
        Pair<Integer, Integer> h10 = L.h(sVar);
        return h10 != null && ((Integer) h10.first).intValue() == 42;
    }

    public boolean t(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34826d;
        if (codecCapabilities == null) {
            v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            v("sizeAndRate.vCaps");
            return false;
        }
        if (N.f29462a >= 29) {
            int c10 = z.c(videoCapabilities, i10, i11, d10);
            if (c10 == 2) {
                return true;
            }
            if (c10 == 1) {
                v("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !A(this.f34823a) || !d(videoCapabilities, i11, i10, d10)) {
                v("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            u("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }

    public String toString() {
        return this.f34823a;
    }
}
