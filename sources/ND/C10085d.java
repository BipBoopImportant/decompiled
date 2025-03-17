package nd;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: nd.d  reason: case insensitive filesystem */
public final class C10085d {

    /* renamed from: c  reason: collision with root package name */
    static final String[] f75534c = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: d  reason: collision with root package name */
    static final int[][] f75535d = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: e  reason: collision with root package name */
    private static final int[][] f75536e;

    /* renamed from: f  reason: collision with root package name */
    static final int[][] f75537f;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f75538a;

    /* renamed from: b  reason: collision with root package name */
    private final Charset f75539b;

    /* renamed from: nd.d$a */
    class a implements Comparator<C10087f> {
        a() {
        }

        /* renamed from: a */
        public int compare(C10087f fVar, C10087f fVar2) {
            return fVar.f() - fVar2.f();
        }
    }

    static {
        int[] iArr = new int[2];
        iArr[1] = 256;
        iArr[0] = 5;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        f75536e = iArr2;
        iArr2[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f75536e[0][i10] = i10 - 63;
        }
        f75536e[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f75536e[1][i11] = i11 - 95;
        }
        f75536e[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f75536e[2][i12] = i12 - 46;
        }
        int[] iArr3 = f75536e[2];
        iArr3[44] = 12;
        iArr3[46] = 13;
        int[] iArr4 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f75536e[3][iArr4[i13]] = i13;
        }
        int[] iArr5 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr5[i14];
            if (i15 > 0) {
                f75536e[4][i15] = i14;
            }
        }
        int[] iArr6 = new int[2];
        iArr6[1] = 6;
        iArr6[0] = 6;
        int[][] iArr7 = (int[][]) Array.newInstance(Integer.TYPE, iArr6);
        f75537f = iArr7;
        for (int[] fill : iArr7) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr8 = f75537f;
        iArr8[0][4] = 0;
        int[] iArr9 = iArr8[1];
        iArr9[4] = 0;
        iArr9[0] = 28;
        iArr8[3][4] = 0;
        int[] iArr10 = iArr8[2];
        iArr10[4] = 0;
        iArr10[0] = 15;
    }

    public C10085d(byte[] bArr, Charset charset) {
        this.f75538a = bArr;
        this.f75539b = charset;
    }

    private static Collection<C10087f> b(Iterable<C10087f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C10087f next : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.addFirst(next);
                    break;
                }
                C10087f fVar = (C10087f) it.next();
                if (fVar.h(next)) {
                    break;
                } else if (next.h(fVar)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    private void c(C10087f fVar, int i10, Collection<C10087f> collection) {
        char c10 = (char) (this.f75538a[i10] & 255);
        boolean z10 = f75536e[fVar.g()][c10] > 0;
        C10087f fVar2 = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f75536e[i11][c10];
            if (i12 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.d(i10);
                }
                if (!z10 || i11 == fVar.g() || i11 == 2) {
                    collection.add(fVar2.i(i11, i12));
                }
                if (!z10 && f75537f[fVar.g()][i11] >= 0) {
                    collection.add(fVar2.j(i11, i12));
                }
            }
        }
        if (fVar.e() > 0 || f75536e[fVar.g()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    private static void d(C10087f fVar, int i10, int i11, Collection<C10087f> collection) {
        C10087f d10 = fVar.d(i10);
        collection.add(d10.i(4, i11));
        if (fVar.g() != 4) {
            collection.add(d10.j(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(d10.i(2, 16 - i11).i(2, 1));
        }
        if (fVar.e() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }

    private Collection<C10087f> e(Iterable<C10087f> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        for (C10087f c10 : iterable) {
            c(c10, i10, linkedList);
        }
        return b(linkedList);
    }

    private static Collection<C10087f> f(Iterable<C10087f> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        for (C10087f d10 : iterable) {
            d(d10, i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public od.C10104a a() {
        /*
            r8 = this;
            nd.f r0 = nd.C10087f.f75543f
            java.nio.charset.Charset r1 = r8.f75539b
            if (r1 == 0) goto L_0x002e
            od.c r1 = od.C10106c.b(r1)
            if (r1 == 0) goto L_0x0015
            int r1 = r1.m()
            nd.f r0 = r0.b(r1)
            goto L_0x002e
        L_0x0015:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No ECI code for character set "
            r1.append(r2)
            java.nio.charset.Charset r2 = r8.f75539b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L_0x0034:
            byte[] r3 = r8.f75538a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0078
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0041
            byte r5 = r3[r4]
            goto L_0x0042
        L_0x0041:
            r5 = r1
        L_0x0042:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0064
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0060
            r6 = 46
            if (r3 == r6) goto L_0x005c
            r6 = 58
            if (r3 == r6) goto L_0x0058
        L_0x0056:
            r3 = r1
            goto L_0x0069
        L_0x0058:
            if (r5 != r7) goto L_0x0056
            r3 = 5
            goto L_0x0069
        L_0x005c:
            if (r5 != r7) goto L_0x0056
            r3 = 3
            goto L_0x0069
        L_0x0060:
            if (r5 != r7) goto L_0x0056
            r3 = 4
            goto L_0x0069
        L_0x0064:
            r3 = 10
            if (r5 != r3) goto L_0x0056
            r3 = 2
        L_0x0069:
            if (r3 <= 0) goto L_0x0071
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L_0x0075
        L_0x0071:
            java.util.Collection r0 = r8.e(r0, r2)
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0078:
            nd.d$a r1 = new nd.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            nd.f r0 = (nd.C10087f) r0
            byte[] r1 = r8.f75538a
            od.a r0 = r0.k(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.C10085d.a():od.a");
    }
}
