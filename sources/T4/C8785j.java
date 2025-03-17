package t4;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import kb.C9967v;
import q3.C5807s;
import t3.B;
import t3.C5954e;
import t4.L;

/* renamed from: t4.j  reason: case insensitive filesystem */
public final class C8785j implements L.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f56318a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C5807s> f56319b;

    public C8785j(int i10) {
        this(i10, C9967v.E());
    }

    private G c(L.b bVar) {
        return new G(e(bVar));
    }

    private N d(L.b bVar) {
        return new N(e(bVar));
    }

    private List<C5807s> e(L.b bVar) {
        String str;
        int i10;
        List<byte[]> list;
        if (f(32)) {
            return this.f56319b;
        }
        B b10 = new B(bVar.f56239e);
        List<C5807s> list2 = this.f56319b;
        while (b10.a() > 0) {
            int H10 = b10.H();
            int f10 = b10.f() + b10.H();
            if (H10 == 134) {
                list2 = new ArrayList<>();
                int H11 = b10.H() & 31;
                for (int i11 = 0; i11 < H11; i11++) {
                    String E10 = b10.E(3);
                    int H12 = b10.H();
                    boolean z10 = true;
                    boolean z11 = (H12 & 128) != 0;
                    if (z11) {
                        i10 = H12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte H13 = (byte) b10.H();
                    b10.X(1);
                    if (z11) {
                        if ((H13 & 64) == 0) {
                            z10 = false;
                        }
                        list = C5954e.e(z10);
                    } else {
                        list = null;
                    }
                    list2.add(new C5807s.b().s0(str).i0(E10).N(i10).f0(list).M());
                }
            }
            b10.W(f10);
        }
        return list2;
    }

    private boolean f(int i10) {
        return (i10 & this.f56318a) != 0;
    }

    public SparseArray<L> a() {
        return new SparseArray<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        return new t4.y(new t4.C8778c(r6.f56236b, r6.a()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t4.L b(int r5, t4.L.b r6) {
        /*
            r4 = this;
            r0 = 2
            if (r5 == r0) goto L_0x0150
            r1 = 3
            if (r5 == r1) goto L_0x013f
            r1 = 4
            if (r5 == r1) goto L_0x013f
            r2 = 21
            if (r5 == r2) goto L_0x0134
            r2 = 27
            r3 = 0
            if (r5 == r2) goto L_0x0113
            r1 = 36
            if (r5 == r1) goto L_0x0104
            r1 = 45
            if (r5 == r1) goto L_0x00f9
            r1 = 89
            if (r5 == r1) goto L_0x00ec
            r1 = 172(0xac, float:2.41E-43)
            if (r5 == r1) goto L_0x00db
            r1 = 257(0x101, float:3.6E-43)
            if (r5 == r1) goto L_0x00ce
            r1 = 138(0x8a, float:1.93E-43)
            if (r5 == r1) goto L_0x00bb
            r1 = 139(0x8b, float:1.95E-43)
            if (r5 == r1) goto L_0x00a8
            switch(r5) {
                case 15: goto L_0x008f;
                case 16: goto L_0x0080;
                case 17: goto L_0x0068;
                default: goto L_0x0031;
            }
        L_0x0031:
            switch(r5) {
                case 128: goto L_0x0150;
                case 129: goto L_0x0057;
                case 130: goto L_0x004e;
                default: goto L_0x0034;
            }
        L_0x0034:
            switch(r5) {
                case 134: goto L_0x0038;
                case 135: goto L_0x0057;
                case 136: goto L_0x00bb;
                default: goto L_0x0037;
            }
        L_0x0037:
            return r3
        L_0x0038:
            r5 = 16
            boolean r5 = r4.f(r5)
            if (r5 == 0) goto L_0x0041
            goto L_0x004d
        L_0x0041:
            t4.E r3 = new t4.E
            t4.x r5 = new t4.x
            java.lang.String r6 = "application/x-scte35"
            r5.<init>(r6)
            r3.<init>(r5)
        L_0x004d:
            return r3
        L_0x004e:
            r5 = 64
            boolean r5 = r4.f(r5)
            if (r5 != 0) goto L_0x00bb
            return r3
        L_0x0057:
            t4.y r5 = new t4.y
            t4.c r0 = new t4.c
            java.lang.String r1 = r6.f56236b
            int r6 = r6.a()
            r0.<init>(r1, r6)
            r5.<init>(r0)
            return r5
        L_0x0068:
            boolean r5 = r4.f(r0)
            if (r5 == 0) goto L_0x006f
            goto L_0x007f
        L_0x006f:
            t4.y r3 = new t4.y
            t4.s r5 = new t4.s
            java.lang.String r0 = r6.f56236b
            int r6 = r6.a()
            r5.<init>(r0, r6)
            r3.<init>(r5)
        L_0x007f:
            return r3
        L_0x0080:
            t4.y r5 = new t4.y
            t4.o r0 = new t4.o
            t4.N r6 = r4.d(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L_0x008f:
            boolean r5 = r4.f(r0)
            if (r5 == 0) goto L_0x0096
            goto L_0x00a7
        L_0x0096:
            t4.y r3 = new t4.y
            t4.i r5 = new t4.i
            java.lang.String r0 = r6.f56236b
            int r6 = r6.a()
            r1 = 0
            r5.<init>(r1, r0, r6)
            r3.<init>(r5)
        L_0x00a7:
            return r3
        L_0x00a8:
            t4.y r5 = new t4.y
            t4.k r0 = new t4.k
            java.lang.String r1 = r6.f56236b
            int r6 = r6.a()
            r2 = 5408(0x1520, float:7.578E-42)
            r0.<init>(r1, r6, r2)
            r5.<init>(r0)
            return r5
        L_0x00bb:
            t4.y r5 = new t4.y
            t4.k r0 = new t4.k
            java.lang.String r1 = r6.f56236b
            int r6 = r6.a()
            r2 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1, r6, r2)
            r5.<init>(r0)
            return r5
        L_0x00ce:
            t4.E r5 = new t4.E
            t4.x r6 = new t4.x
            java.lang.String r0 = "application/vnd.dvb.ait"
            r6.<init>(r0)
            r5.<init>(r6)
            return r5
        L_0x00db:
            t4.y r5 = new t4.y
            t4.f r0 = new t4.f
            java.lang.String r1 = r6.f56236b
            int r6 = r6.a()
            r0.<init>(r1, r6)
            r5.<init>(r0)
            return r5
        L_0x00ec:
            t4.y r5 = new t4.y
            t4.l r0 = new t4.l
            java.util.List<t4.L$a> r6 = r6.f56238d
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L_0x00f9:
            t4.y r5 = new t4.y
            t4.u r6 = new t4.u
            r6.<init>()
            r5.<init>(r6)
            return r5
        L_0x0104:
            t4.y r5 = new t4.y
            t4.q r0 = new t4.q
            t4.G r6 = r4.c(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L_0x0113:
            boolean r5 = r4.f(r1)
            if (r5 == 0) goto L_0x011a
            goto L_0x0133
        L_0x011a:
            t4.y r3 = new t4.y
            t4.p r5 = new t4.p
            t4.G r6 = r4.c(r6)
            r0 = 1
            boolean r0 = r4.f(r0)
            r1 = 8
            boolean r1 = r4.f(r1)
            r5.<init>(r6, r0, r1)
            r3.<init>(r5)
        L_0x0133:
            return r3
        L_0x0134:
            t4.y r5 = new t4.y
            t4.r r6 = new t4.r
            r6.<init>()
            r5.<init>(r6)
            return r5
        L_0x013f:
            t4.y r5 = new t4.y
            t4.t r0 = new t4.t
            java.lang.String r1 = r6.f56236b
            int r6 = r6.a()
            r0.<init>(r1, r6)
            r5.<init>(r0)
            return r5
        L_0x0150:
            t4.y r5 = new t4.y
            t4.n r0 = new t4.n
            t4.N r6 = r4.d(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C8785j.b(int, t4.L$b):t4.L");
    }

    public C8785j(int i10, List<C5807s> list) {
        this.f56318a = i10;
        this.f56319b = list;
    }
}
