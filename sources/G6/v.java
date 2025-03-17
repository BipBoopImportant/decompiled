package G6;

import C6.b;
import C6.j;
import C6.k;
import C6.l;
import D6.h;
import E6.e;
import H6.c;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w6.C8927i;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36220a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f36221b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f36222c = c.a.a("ty", "nm");

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36223a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                E6.e$b[] r0 = E6.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36223a = r0
                E6.e$b r1 = E6.e.b.LUMA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36223a     // Catch:{ NoSuchFieldError -> 0x001d }
                E6.e$b r1 = E6.e.b.LUMA_INVERTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G6.v.a.<clinit>():void");
        }
    }

    public static e a(c cVar, C8927i iVar) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        c cVar2 = cVar;
        C8927i iVar2 = iVar;
        e.b bVar = e.b.NONE;
        h hVar = h.NORMAL;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        cVar.e();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        e.b bVar2 = bVar;
        h hVar2 = hVar;
        e.a aVar = null;
        String str = null;
        j jVar = null;
        k kVar = null;
        b bVar3 = null;
        D6.a aVar2 = null;
        C6515j jVar2 = null;
        long j10 = 0;
        boolean z11 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        long j11 = -1;
        float f16 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        l lVar = null;
        while (cVar.hasNext()) {
            switch (cVar2.n(f36220a)) {
                case 0:
                    str2 = cVar.C1();
                    break;
                case 1:
                    j10 = (long) cVar.G0();
                    break;
                case 2:
                    str = cVar.C1();
                    break;
                case 3:
                    int G02 = cVar.G0();
                    aVar = e.a.UNKNOWN;
                    if (G02 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[G02];
                        break;
                    }
                case 4:
                    j11 = (long) cVar.G0();
                    break;
                case 5:
                    i10 = (int) (((float) cVar.G0()) * I6.j.e());
                    break;
                case 6:
                    i11 = (int) (((float) cVar.G0()) * I6.j.e());
                    break;
                case 7:
                    i12 = Color.parseColor(cVar.C1());
                    break;
                case 8:
                    lVar = C6508c.g(cVar, iVar);
                    break;
                case 9:
                    int G03 = cVar.G0();
                    if (G03 < e.b.values().length) {
                        bVar2 = e.b.values()[G03];
                        int i13 = a.f36223a[bVar2.ordinal()];
                        if (i13 == 1) {
                            iVar2.a("Unsupported matte type: Luma");
                        } else if (i13 == 2) {
                            iVar2.a("Unsupported matte type: Luma Inverted");
                        }
                        iVar2.r(1);
                        break;
                    } else {
                        iVar2.a("Unsupported matte type: " + G03);
                        break;
                    }
                case 10:
                    cVar.d();
                    while (cVar.hasNext()) {
                        arrayList2.add(x.a(cVar, iVar));
                    }
                    iVar2.r(arrayList2.size());
                    cVar.f();
                    break;
                case 11:
                    cVar.d();
                    while (cVar.hasNext()) {
                        D6.c a10 = C6513h.a(cVar, iVar);
                        if (a10 != null) {
                            arrayList3.add(a10);
                        }
                    }
                    cVar.f();
                    break;
                case 12:
                    cVar.e();
                    while (cVar.hasNext()) {
                        int n10 = cVar2.n(f36221b);
                        if (n10 == 0) {
                            jVar = C6509d.d(cVar, iVar);
                        } else if (n10 != 1) {
                            cVar.o();
                            cVar.a0();
                        } else {
                            cVar.d();
                            if (cVar.hasNext()) {
                                kVar = C6507b.a(cVar, iVar);
                            }
                            while (cVar.hasNext()) {
                                cVar.a0();
                            }
                            cVar.f();
                        }
                    }
                    cVar.g();
                    break;
                case 13:
                    cVar.d();
                    ArrayList arrayList4 = new ArrayList();
                    while (cVar.hasNext()) {
                        cVar.e();
                        while (cVar.hasNext()) {
                            int n11 = cVar2.n(f36222c);
                            if (n11 == 0) {
                                int G04 = cVar.G0();
                                if (G04 == 29) {
                                    aVar2 = C6510e.b(cVar, iVar);
                                } else if (G04 == 25) {
                                    jVar2 = new C6516k().b(cVar2, iVar2);
                                }
                            } else if (n11 != 1) {
                                cVar.o();
                                cVar.a0();
                            } else {
                                arrayList4.add(cVar.C1());
                            }
                        }
                        cVar.g();
                    }
                    cVar.f();
                    iVar2.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    f16 = (float) cVar.d2();
                    break;
                case 15:
                    f12 = (float) cVar.d2();
                    break;
                case 16:
                    f13 = (float) (cVar.d2() * ((double) I6.j.e()));
                    break;
                case 17:
                    f14 = (float) (cVar.d2() * ((double) I6.j.e()));
                    break;
                case 18:
                    f11 = (float) cVar.d2();
                    break;
                case 19:
                    f15 = (float) cVar.d2();
                    break;
                case 20:
                    bVar3 = C6509d.f(cVar2, iVar2, false);
                    break;
                case 21:
                    str3 = cVar.C1();
                    break;
                case 22:
                    z12 = cVar.w1();
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                    if (cVar.G0() != 1) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                case BuildConfig.MIN_SDK_VERSION /*24*/:
                    int G05 = cVar.G0();
                    if (G05 < h.values().length) {
                        hVar2 = h.values()[G05];
                        break;
                    } else {
                        iVar2.a("Unsupported Blend Mode: " + G05);
                        hVar2 = h.NORMAL;
                        break;
                    }
                default:
                    cVar.o();
                    cVar.a0();
                    break;
            }
        }
        cVar.g();
        ArrayList arrayList5 = new ArrayList();
        if (f11 > 0.0f) {
            J6.a aVar3 = r0;
            arrayList = arrayList2;
            z10 = z11;
            J6.a aVar4 = new J6.a(iVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(f11));
            arrayList5.add(aVar3);
            f10 = 0.0f;
        } else {
            arrayList = arrayList2;
            z10 = z11;
            f10 = 0.0f;
        }
        if (f15 <= f10) {
            f15 = iVar.f();
        }
        C8927i iVar3 = iVar;
        arrayList5.add(new J6.a(iVar3, valueOf2, valueOf2, (Interpolator) null, f11, Float.valueOf(f15)));
        arrayList5.add(new J6.a(iVar3, valueOf, valueOf, (Interpolator) null, f15, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            iVar2.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (lVar == null) {
                lVar = new l();
            }
            lVar.m(z10);
        }
        return new e(arrayList3, iVar, str2, j10, aVar, j11, str, arrayList, lVar, i10, i11, i12, f16, f12, f13, f14, jVar, kVar, arrayList5, bVar2, bVar3, z12, aVar2, jVar2, hVar2);
    }

    public static e b(C8927i iVar) {
        Rect b10 = iVar.b();
        List emptyList = Collections.emptyList();
        e.a aVar = e.a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        l lVar = r4;
        l lVar2 = new l();
        return new e(emptyList, iVar, "__container", -1, aVar, -1, (String) null, emptyList2, lVar, 0, 0, 0, 0.0f, 0.0f, (float) b10.width(), (float) b10.height(), (j) null, (k) null, Collections.emptyList(), e.b.NONE, (b) null, false, (D6.a) null, (C6515j) null, h.NORMAL);
    }
}
