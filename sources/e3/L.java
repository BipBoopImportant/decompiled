package E3;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jb.C9892c;
import kb.C9967v;
import q3.A;
import q3.C5807s;
import t3.C5954e;
import t3.N;
import t3.q;

@SuppressLint({"InlinedApi"})
public final class L {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<b, List<t>> f34747a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static int f34748b = -1;

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f34749a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f34750b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f34751c;

        public b(String str, boolean z10, boolean z11) {
            this.f34749a = str;
            this.f34750b = z10;
            this.f34751c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f34749a, bVar.f34749a) && this.f34750b == bVar.f34750b && this.f34751c == bVar.f34751c;
        }

        public int hashCode() {
            int i10 = 1237;
            int hashCode = (((this.f34749a.hashCode() + 31) * 31) + (this.f34750b ? 1231 : 1237)) * 31;
            if (this.f34751c) {
                i10 = 1231;
            }
            return hashCode + i10;
        }
    }

    public static class c extends Exception {
        private c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    private interface d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class e implements d {
        private e() {
        }

        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        public int d() {
            return MediaCodecList.getCodecCount();
        }

        public boolean e() {
            return false;
        }
    }

    private static final class f implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f34752a;

        /* renamed from: b  reason: collision with root package name */
        private MediaCodecInfo[] f34753b;

        public f(boolean z10, boolean z11) {
            this.f34752a = (z10 || z11) ? 1 : 0;
        }

        private void f() {
            if (this.f34753b == null) {
                this.f34753b = new MediaCodecList(this.f34752a).getCodecInfos();
            }
        }

        public MediaCodecInfo a(int i10) {
            f();
            return this.f34753b[i10];
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        public int d() {
            f();
            return this.f34753b.length;
        }

        public boolean e() {
            return true;
        }
    }

    private interface g<T> {
        int a(T t10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int A(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    private static <T> void B(List<T> list, g<T> gVar) {
        Collections.sort(list, new K(gVar));
    }

    private static void d(String str, List<t> list) {
        if ("audio/raw".equals(str)) {
            if (N.f29462a < 26 && N.f29463b.equals("R9") && list.size() == 1 && list.get(0).f34823a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(t.B("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            B(list, new I());
        }
        if (N.f29462a < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f34823a)) {
            list.add(list.remove(0));
        }
    }

    public static String e(C5807s sVar) {
        Pair<Integer, Integer> h10;
        if ("audio/eac3-joc".equals(sVar.f28244o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(sVar.f28244o) && (h10 = h(sVar)) != null) {
            int intValue = ((Integer) h10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(sVar.f28244o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<t> f(D d10, C5807s sVar, boolean z10, boolean z11) {
        String e10 = e(sVar);
        return e10 == null ? C9967v.E() : d10.a(e10, z10, z11);
    }

    private static String g(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (!str2.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(str)) {
                return null;
            }
            return "audio/lg-ac3";
        }
    }

    @Deprecated
    public static Pair<Integer, Integer> h(C5807s sVar) {
        return C5954e.n(sVar);
    }

    public static t i(String str, boolean z10, boolean z11) {
        List<t> j10 = j(str, z10, z11);
        if (j10.isEmpty()) {
            return null;
        }
        return j10.get(0);
    }

    public static synchronized List<t> j(String str, boolean z10, boolean z11) {
        synchronized (L.class) {
            try {
                b bVar = new b(str, z10, z11);
                HashMap<b, List<t>> hashMap = f34747a;
                List<t> list = hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                ArrayList<t> k10 = k(bVar, new f(z10, z11));
                if (z10 && k10.isEmpty() && N.f29462a <= 23) {
                    k10 = k(bVar, new e());
                    if (!k10.isEmpty()) {
                        q.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + k10.get(0).f34823a);
                    }
                }
                d(str, k10);
                C9967v<t> A10 = C9967v.A(k10);
                hashMap.put(bVar, A10);
                return A10;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (r1.f34750b == false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0105 A[SYNTHETIC, Splitter:B:60:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0130 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<E3.t> k(E3.L.b r24, E3.L.d r25) {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x012e }
            r5.<init>()     // Catch:{ Exception -> 0x012e }
            java.lang.String r15 = r1.f34749a     // Catch:{ Exception -> 0x012e }
            int r14 = r25.d()     // Catch:{ Exception -> 0x012e }
            boolean r13 = r25.e()     // Catch:{ Exception -> 0x012e }
            r0 = 0
            r12 = r0
        L_0x0019:
            if (r12 >= r14) goto L_0x0154
            android.media.MediaCodecInfo r0 = r2.a(r12)     // Catch:{ Exception -> 0x012e }
            boolean r6 = p(r0)     // Catch:{ Exception -> 0x012e }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x0124
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x012e }
            boolean r6 = r(r0, r11, r13, r15)     // Catch:{ Exception -> 0x012e }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = g(r0, r11, r15)     // Catch:{ Exception -> 0x012e }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x007c }
            boolean r6 = r2.b(r4, r10, r9)     // Catch:{ Exception -> 0x007c }
            boolean r7 = r2.c(r4, r10, r9)     // Catch:{ Exception -> 0x007c }
            boolean r8 = r1.f34751c     // Catch:{ Exception -> 0x007c }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            if (r8 == 0) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            goto L_0x0025
        L_0x0056:
            boolean r6 = r2.b(r3, r10, r9)     // Catch:{ Exception -> 0x007c }
            boolean r7 = r2.c(r3, r10, r9)     // Catch:{ Exception -> 0x007c }
            boolean r8 = r1.f34750b     // Catch:{ Exception -> 0x007c }
            if (r8 != 0) goto L_0x0064
            if (r7 != 0) goto L_0x0025
        L_0x0064:
            if (r8 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0069
            goto L_0x0025
        L_0x0069:
            boolean r16 = s(r0, r15)     // Catch:{ Exception -> 0x007c }
            boolean r17 = u(r0, r15)     // Catch:{ Exception -> 0x007c }
            boolean r0 = w(r0)     // Catch:{ Exception -> 0x007c }
            if (r13 == 0) goto L_0x0088
            boolean r7 = r1.f34750b     // Catch:{ Exception -> 0x007c }
            if (r7 == r6) goto L_0x008e
            goto L_0x0088
        L_0x007c:
            r0 = move-exception
            r20 = r10
            r1 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x00fd
        L_0x0088:
            if (r13 != 0) goto L_0x00b5
            boolean r7 = r1.f34750b     // Catch:{ Exception -> 0x00c0 }
            if (r7 != 0) goto L_0x00b5
        L_0x008e:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            E3.t r0 = E3.t.B(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00b1 }
            r5.add(r0)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x0124
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            r1 = r21
            goto L_0x00fd
        L_0x00b5:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x00cc
        L_0x00c0:
            r0 = move-exception
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x00b2
        L_0x00cc:
            if (r23 != 0) goto L_0x0124
            if (r6 == 0) goto L_0x0124
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1 }
            r6.<init>()     // Catch:{ Exception -> 0x00b1 }
            r14 = r21
            r6.append(r14)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00fb }
            r13 = 0
            r19 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r1 = r14
            r14 = r19
            E3.t r0 = E3.t.B(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00f9 }
            r5.add(r0)     // Catch:{ Exception -> 0x00f9 }
            return r5
        L_0x00f9:
            r0 = move-exception
            goto L_0x00fd
        L_0x00fb:
            r0 = move-exception
            r1 = r14
        L_0x00fd:
            int r6 = t3.N.f29462a     // Catch:{ Exception -> 0x012e }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x0130
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x012e }
            if (r6 != 0) goto L_0x0130
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e }
            r0.<init>()     // Catch:{ Exception -> 0x012e }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x012e }
            r0.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012e }
            t3.q.c(r8, r0)     // Catch:{ Exception -> 0x012e }
        L_0x0124:
            int r12 = r22 + 1
            r1 = r24
            r14 = r18
            r13 = r23
            goto L_0x0019
        L_0x012e:
            r0 = move-exception
            goto L_0x0155
        L_0x0130:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e }
            r2.<init>()     // Catch:{ Exception -> 0x012e }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x012e }
            r2.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x012e }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x012e }
            t3.q.c(r8, r1)     // Catch:{ Exception -> 0x012e }
            throw r0     // Catch:{ Exception -> 0x012e }
        L_0x0154:
            return r5
        L_0x0155:
            E3.L$c r1 = new E3.L$c
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.L.k(E3.L$b, E3.L$d):java.util.ArrayList");
    }

    public static List<t> l(D d10, C5807s sVar, boolean z10, boolean z11) {
        List<t> a10 = d10.a(sVar.f28244o, z10, z11);
        return C9967v.t().j(a10).j(f(d10, sVar, z10, z11)).k();
    }

    public static List<t> m(List<t> list, C5807s sVar) {
        ArrayList arrayList = new ArrayList(list);
        B(arrayList, new J(sVar));
        return arrayList;
    }

    public static t n() {
        return i("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> o(C5807s sVar) {
        String h10 = u3.e.h(sVar.f28247r);
        if (h10 == null) {
            return null;
        }
        return C5954e.q(h10, N.h1(h10.trim(), "\\."), sVar.f28218C);
    }

    private static boolean p(MediaCodecInfo mediaCodecInfo) {
        return N.f29462a >= 29 && q(mediaCodecInfo);
    }

    private static boolean q(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = N.f29462a;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(N.f29464c))) {
            String str3 = N.f29463b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return i10 > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo, String str) {
        return N.f29462a >= 29 ? t(mediaCodecInfo) : !u(mediaCodecInfo, str);
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        if (N.f29462a >= 29) {
            return v(mediaCodecInfo);
        }
        if (A.n(str)) {
            return true;
        }
        String e10 = C9892c.e(mediaCodecInfo.getName());
        if (e10.startsWith("arc.")) {
            return false;
        }
        if (e10.startsWith("omx.google.") || e10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((!e10.startsWith("omx.sec.") || !e10.contains(".sw.")) && !e10.equals("omx.qcom.video.decoder.hevcswvdec") && !e10.startsWith("c2.android.") && !e10.startsWith("c2.google.")) {
            return !e10.startsWith("omx.") && !e10.startsWith("c2.");
        }
        return true;
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo) {
        if (N.f29462a >= 29) {
            return x(mediaCodecInfo);
        }
        String e10 = C9892c.e(mediaCodecInfo.getName());
        return !e10.startsWith("omx.google.") && !e10.startsWith("c2.android.") && !e10.startsWith("c2.google.");
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int y(t tVar) {
        String str = tVar.f34823a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (N.f29462a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int z(C5807s sVar, t tVar) {
        return tVar.m(sVar) ? 1 : 0;
    }
}
