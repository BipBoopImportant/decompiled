package Z;

import C.C4391e0;
import C.C4417z;
import H2.i;
import V.C4926k;
import V.i0;
import X.g;
import Z.f;
import a0.j0;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C5031k0;
import androidx.camera.core.impl.h1;
import androidx.recyclerview.widget.RecyclerView;
import b0.C5252b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Map<Integer, j0>> f14894a;

    /* renamed from: b  reason: collision with root package name */
    private static final h1 f14895b = h1.UPTIME;

    static {
        HashMap hashMap = new HashMap();
        f14894a = hashMap;
        HashMap hashMap2 = new HashMap();
        j0 j0Var = j0.f15111a;
        hashMap2.put(1, j0Var);
        j0 j0Var2 = j0.f15113c;
        hashMap2.put(2, j0Var2);
        Integer valueOf = Integer.valueOf(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
        j0 j0Var3 = j0.f15114d;
        hashMap2.put(valueOf, j0Var3);
        hashMap2.put(8192, j0Var3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, j0Var);
        hashMap3.put(2, j0Var2);
        hashMap3.put(valueOf, j0Var3);
        hashMap3.put(8192, j0Var3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, j0Var);
        hashMap4.put(4, j0Var2);
        hashMap4.put(valueOf, j0Var3);
        hashMap4.put(16384, j0Var3);
        hashMap4.put(2, j0Var);
        hashMap4.put(8, j0Var2);
        hashMap4.put(8192, j0Var3);
        hashMap4.put(32768, j0Var3);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(256, j0Var2);
        hashMap5.put(512, j0.f15112b);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    private static String a(C4417z zVar) {
        int b10 = zVar.b();
        if (b10 == 1) {
            return "video/avc";
        }
        if (b10 == 3 || b10 == 4 || b10 == 5) {
            return "video/hevc";
        }
        if (b10 == 6) {
            return "video/dolby-vision";
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + zVar + "\nNo supported default mime type available.");
    }

    public static j0 b(String str, int i10) {
        j0 j0Var;
        Map map = f14894a.get(str);
        if (map != null && (j0Var = (j0) map.get(Integer.valueOf(i10))) != null) {
            return j0Var;
        }
        C4391e0.l("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", new Object[]{str, Integer.valueOf(i10)}));
        return j0.f15111a;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [H2.l] */
    /* JADX WARNING: type inference failed for: r9v1, types: [Z.d] */
    /* JADX WARNING: type inference failed for: r0v3, types: [Z.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a0.i0 c(Z.f r16, androidx.camera.core.impl.h1 r17, V.i0 r18, android.util.Size r19, C.C4417z r20, android.util.Range<java.lang.Integer> r21) {
        /*
            androidx.camera.core.impl.k0$c r5 = r16.d()
            if (r5 == 0) goto L_0x001b
            Z.e r8 = new Z.e
            java.lang.String r1 = r16.a()
            r0 = r8
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r20
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x002f
        L_0x001b:
            Z.d r8 = new Z.d
            java.lang.String r10 = r16.a()
            r9 = r8
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            r9.<init>(r10, r11, r12, r13, r14, r15)
        L_0x002f:
            java.lang.Object r0 = r8.get()
            a0.i0 r0 = (a0.i0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.c.c(Z.f, androidx.camera.core.impl.h1, V.i0, android.util.Size, C.z, android.util.Range):a0.i0");
    }

    public static f d(C4926k kVar, C4417z zVar, g gVar) {
        C5031k0.c cVar;
        boolean e10 = zVar.e();
        i.j(e10, "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + zVar + "]");
        String f10 = C4926k.f(kVar.c());
        if (gVar != null) {
            Set<Integer> c10 = C5252b.c(zVar);
            Set<Integer> b10 = C5252b.b(zVar);
            Iterator<C5031k0.c> it = gVar.b().iterator();
            while (it.hasNext()) {
                cVar = it.next();
                if (c10.contains(Integer.valueOf(cVar.g())) && b10.contains(Integer.valueOf(cVar.b()))) {
                    String i10 = cVar.i();
                    if (Objects.equals(f10, i10)) {
                        C4391e0.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + f10 + "]");
                    } else if (kVar.c() == -1) {
                        C4391e0.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + f10 + ", dynamic range: " + zVar + "]");
                    }
                    f10 = i10;
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            if (kVar.c() == -1) {
                f10 = a(zVar);
            }
            if (gVar == null) {
                C4391e0.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + f10 + ", dynamic range: " + zVar + "]");
            } else {
                C4391e0.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + f10 + ", dynamic range: " + zVar + "]");
            }
        }
        f.a c11 = f.c(f10);
        if (cVar != null) {
            c11.c(cVar);
        }
        return c11.b();
    }

    public static int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Range<Integer> range) {
        String str;
        Range<Integer> range2 = range;
        int doubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue() * new Rational(i15, i16).doubleValue() * new Rational(i17, i18).doubleValue());
        if (C4391e0.f("VideoConfigUtil")) {
            str = String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(doubleValue)});
        } else {
            str = "";
        }
        if (!i0.f14456b.equals(range2)) {
            Integer clamp = range2.clamp(Integer.valueOf(doubleValue));
            int intValue = clamp.intValue();
            if (C4391e0.f("VideoConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", new Object[]{range2, clamp});
            }
            doubleValue = intValue;
        }
        C4391e0.a("VideoConfigUtil", str);
        return doubleValue;
    }

    public static a0.i0 f(C5031k0.c cVar) {
        return a0.i0.d().h(cVar.i()).i(cVar.j()).j(new Size(cVar.k(), cVar.h())).e(cVar.f()).b(cVar.c()).g(f14895b).a();
    }
}
