package I3;

import G3.C6479C;
import I3.x;
import J3.C6571d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kb.C9924D;
import kb.C9929I;
import kb.C9967v;
import q3.J;
import q3.K;
import t3.C5953d;
import t3.q;

/* renamed from: I3.a  reason: case insensitive filesystem */
public class C6553a extends C6555c {

    /* renamed from: i  reason: collision with root package name */
    private final C6571d f36670i;

    /* renamed from: j  reason: collision with root package name */
    private final long f36671j;

    /* renamed from: k  reason: collision with root package name */
    private final long f36672k;

    /* renamed from: l  reason: collision with root package name */
    private final long f36673l;

    /* renamed from: m  reason: collision with root package name */
    private final int f36674m;

    /* renamed from: n  reason: collision with root package name */
    private final int f36675n;

    /* renamed from: o  reason: collision with root package name */
    private final float f36676o;

    /* renamed from: p  reason: collision with root package name */
    private final float f36677p;

    /* renamed from: q  reason: collision with root package name */
    private final C9967v<C0580a> f36678q;

    /* renamed from: r  reason: collision with root package name */
    private final C5953d f36679r;

    /* renamed from: s  reason: collision with root package name */
    private float f36680s;

    /* renamed from: t  reason: collision with root package name */
    private int f36681t;

    /* renamed from: u  reason: collision with root package name */
    private int f36682u;

    /* renamed from: v  reason: collision with root package name */
    private long f36683v;

    /* renamed from: w  reason: collision with root package name */
    private long f36684w;

    /* renamed from: I3.a$a  reason: collision with other inner class name */
    public static final class C0580a {

        /* renamed from: a  reason: collision with root package name */
        public final long f36685a;

        /* renamed from: b  reason: collision with root package name */
        public final long f36686b;

        public C0580a(long j10, long j11) {
            this.f36685a = j10;
            this.f36686b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0580a)) {
                return false;
            }
            C0580a aVar = (C0580a) obj;
            return this.f36685a == aVar.f36685a && this.f36686b == aVar.f36686b;
        }

        public int hashCode() {
            return (((int) this.f36685a) * 31) + ((int) this.f36686b);
        }
    }

    /* renamed from: I3.a$b */
    public static class b implements x.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f36687a;

        /* renamed from: b  reason: collision with root package name */
        private final int f36688b;

        /* renamed from: c  reason: collision with root package name */
        private final int f36689c;

        /* renamed from: d  reason: collision with root package name */
        private final int f36690d;

        /* renamed from: e  reason: collision with root package name */
        private final int f36691e;

        /* renamed from: f  reason: collision with root package name */
        private final float f36692f;

        /* renamed from: g  reason: collision with root package name */
        private final float f36693g;

        /* renamed from: h  reason: collision with root package name */
        private final C5953d f36694h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public final x[] a(x.a[] aVarArr, C6571d dVar, C6479C.b bVar, J j10) {
            x xVar;
            C9967v p10 = C6553a.r(aVarArr);
            x[] xVarArr = new x[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                x.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f36841b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            xVar = new y(aVar.f36840a, iArr[0], aVar.f36842c);
                        } else {
                            xVar = b(aVar.f36840a, iArr, aVar.f36842c, dVar, (C9967v) p10.get(i10));
                        }
                        xVarArr[i10] = xVar;
                    }
                }
            }
            return xVarArr;
        }

        /* access modifiers changed from: protected */
        public C6553a b(K k10, int[] iArr, int i10, C6571d dVar, C9967v<C0580a> vVar) {
            return new C6553a(k10, iArr, i10, dVar, (long) this.f36687a, (long) this.f36688b, (long) this.f36689c, this.f36690d, this.f36691e, this.f36692f, this.f36693g, vVar, this.f36694h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, C5953d.f29483a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, C5953d dVar) {
            this.f36687a = i10;
            this.f36688b = i11;
            this.f36689c = i12;
            this.f36690d = i13;
            this.f36691e = i14;
            this.f36692f = f10;
            this.f36693g = f11;
            this.f36694h = dVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C6553a(K k10, int[] iArr, int i10, C6571d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0580a> list, C5953d dVar2) {
        super(k10, iArr, i10);
        C6571d dVar3;
        long j13;
        if (j12 < j10) {
            q.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            dVar3 = dVar;
            j13 = j10;
        } else {
            dVar3 = dVar;
            j13 = j12;
        }
        this.f36670i = dVar3;
        this.f36671j = j10 * 1000;
        this.f36672k = j11 * 1000;
        this.f36673l = j13 * 1000;
        this.f36674m = i11;
        this.f36675n = i12;
        this.f36676o = f10;
        this.f36677p = f11;
        this.f36678q = C9967v.A(list);
        this.f36679r = dVar2;
        this.f36680s = 1.0f;
        this.f36682u = 0;
        this.f36683v = -9223372036854775807L;
        this.f36684w = -2147483647L;
    }

    private static void q(List<C9967v.a<C0580a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            C9967v.a aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0580a(j10, jArr[i10]));
            }
        }
    }

    /* access modifiers changed from: private */
    public static C9967v<C9967v<C0580a>> r(x.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (x.a aVar : aVarArr) {
            if (aVar == null || aVar.f36841b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                C9967v.a t10 = C9967v.t();
                t10.a(new C0580a(0, 0));
                arrayList.add(t10);
            }
        }
        long[][] s10 = s(aVarArr);
        int[] iArr = new int[s10.length];
        long[] jArr = new long[s10.length];
        for (int i10 = 0; i10 < s10.length; i10++) {
            long[] jArr2 = s10[i10];
            jArr[i10] = jArr2.length == 0 ? 0 : jArr2[0];
        }
        q(arrayList, jArr);
        C9967v<Integer> t11 = t(s10);
        for (int i11 = 0; i11 < t11.size(); i11++) {
            int intValue = t11.get(i11).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr[intValue] = s10[intValue][i12];
            q(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        q(arrayList, jArr);
        C9967v.a t12 = C9967v.t();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            C9967v.a aVar2 = (C9967v.a) arrayList.get(i14);
            t12.a(aVar2 == null ? C9967v.E() : aVar2.k());
        }
        return t12.k();
    }

    private static long[][] s(x.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            x.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f36841b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f36841b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = (long) aVar.f36840a.a(iArr[i11]).f28239j;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static C9967v<Integer> t(long[][] jArr) {
        C9924D<K, V> e10 = C9929I.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double d10 = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        d10 = Math.log((double) j10);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    e10.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return C9967v.A(e10.values());
    }

    public void c() {
    }

    public int d() {
        return this.f36681t;
    }

    public void e(float f10) {
        this.f36680s = f10;
    }

    public void j() {
        this.f36683v = -9223372036854775807L;
    }
}
