package o2;

import h2.C5414d;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p2.e;
import p2.f;
import p2.l;

public class b extends l {

    /* renamed from: a1  reason: collision with root package name */
    f f26726a1;

    /* renamed from: b1  reason: collision with root package name */
    private e[] f26727b1;

    /* renamed from: c1  reason: collision with root package name */
    private boolean f26728c1 = false;

    /* renamed from: d1  reason: collision with root package name */
    private int f26729d1;

    /* renamed from: e1  reason: collision with root package name */
    private int f26730e1;

    /* renamed from: f1  reason: collision with root package name */
    private int f26731f1;

    /* renamed from: g1  reason: collision with root package name */
    private int f26732g1;

    /* renamed from: h1  reason: collision with root package name */
    private float f26733h1;

    /* renamed from: i1  reason: collision with root package name */
    private float f26734i1;

    /* renamed from: j1  reason: collision with root package name */
    private String f26735j1;

    /* renamed from: k1  reason: collision with root package name */
    private String f26736k1;

    /* renamed from: l1  reason: collision with root package name */
    private String f26737l1;

    /* renamed from: m1  reason: collision with root package name */
    private String f26738m1;

    /* renamed from: n1  reason: collision with root package name */
    private int f26739n1;

    /* renamed from: o1  reason: collision with root package name */
    private int f26740o1 = 0;

    /* renamed from: p1  reason: collision with root package name */
    private boolean[][] f26741p1;

    /* renamed from: q1  reason: collision with root package name */
    Set<String> f26742q1 = new HashSet();

    /* renamed from: r1  reason: collision with root package name */
    private int[][] f26743r1;

    /* renamed from: s1  reason: collision with root package name */
    private int f26744s1;

    /* renamed from: t1  reason: collision with root package name */
    private int[][] f26745t1;

    /* renamed from: u1  reason: collision with root package name */
    private int f26746u1 = 0;

    public b() {
        C2();
        g2();
    }

    private void B2(boolean z10) {
        int[][] n22;
        if (this.f26729d1 >= 1 && this.f26731f1 >= 1) {
            if (z10) {
                for (int i10 = 0; i10 < this.f26741p1.length; i10++) {
                    int i11 = 0;
                    while (true) {
                        boolean[][] zArr = this.f26741p1;
                        if (i11 >= zArr[0].length) {
                            break;
                        }
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
                this.f26742q1.clear();
            }
            this.f26740o1 = 0;
            String str = this.f26738m1;
            if (!(str == null || str.trim().isEmpty() || (n22 = n2(this.f26738m1, false)) == null)) {
                e2(n22);
            }
            String str2 = this.f26737l1;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f26745t1 = n2(this.f26737l1, true);
            }
            Z1();
            int[][] iArr = this.f26745t1;
            if (iArr != null) {
                f2(iArr);
            }
        }
    }

    private void C2() {
        int i10;
        int i11 = this.f26730e1;
        if (i11 == 0 || (i10 = this.f26732g1) == 0) {
            int i12 = this.f26732g1;
            if (i12 > 0) {
                this.f26731f1 = i12;
                this.f26729d1 = ((this.f27576M0 + i12) - 1) / i12;
            } else if (i11 > 0) {
                this.f26729d1 = i11;
                this.f26731f1 = ((this.f27576M0 + i11) - 1) / i11;
            } else {
                int sqrt = (int) (Math.sqrt((double) this.f27576M0) + 1.5d);
                this.f26729d1 = sqrt;
                this.f26731f1 = ((this.f27576M0 + sqrt) - 1) / sqrt;
            }
        } else {
            this.f26729d1 = i11;
            this.f26731f1 = i10;
        }
    }

    private void U1() {
        q2();
        p2();
        V1();
    }

    private void V1() {
        int[][] iArr;
        int i10;
        for (int i11 = 0; i11 < this.f27576M0; i11++) {
            if (!this.f26742q1.contains(this.f27575L0[i11].f27468o)) {
                int c22 = c2();
                int d22 = d2(c22);
                int b22 = b2(c22);
                if (c22 != -1) {
                    if (j2() && (iArr = this.f26745t1) != null && (i10 = this.f26746u1) < iArr.length) {
                        int[] iArr2 = iArr[i10];
                        if (iArr2[0] == c22) {
                            this.f26741p1[d22][b22] = true;
                            if (i2(d22, b22, iArr2[1], iArr2[2])) {
                                e eVar = this.f27575L0[i11];
                                int[] iArr3 = this.f26745t1[this.f26746u1];
                                Y1(eVar, d22, b22, iArr3[1], iArr3[2]);
                                this.f26746u1++;
                            }
                        }
                    }
                    Y1(this.f27575L0[i11], d22, b22, 1, 1);
                } else {
                    return;
                }
            }
        }
    }

    private void W1(e eVar) {
        eVar.V0(-1.0f);
        eVar.f27428O.q();
        eVar.f27430Q.q();
    }

    private void X1(e eVar) {
        eVar.m1(-1.0f);
        eVar.f27429P.q();
        eVar.f27431R.q();
        eVar.f27432S.q();
    }

    private void Y1(e eVar, int i10, int i11, int i12, int i13) {
        eVar.f27428O.a(this.f26727b1[i11].f27428O, 0);
        eVar.f27429P.a(this.f26727b1[i10].f27429P, 0);
        eVar.f27430Q.a(this.f26727b1[(i11 + i13) - 1].f27430Q, 0);
        eVar.f27431R.a(this.f26727b1[(i10 + i12) - 1].f27431R, 0);
    }

    private void Z1() {
        int max = Math.max(this.f26729d1, this.f26731f1);
        e[] eVarArr = this.f26727b1;
        int i10 = 0;
        if (eVarArr == null) {
            this.f26727b1 = new e[max];
            while (true) {
                e[] eVarArr2 = this.f26727b1;
                if (i10 < eVarArr2.length) {
                    eVarArr2[i10] = m2();
                    i10++;
                } else {
                    return;
                }
            }
        } else if (max != eVarArr.length) {
            e[] eVarArr3 = new e[max];
            while (i10 < max) {
                e[] eVarArr4 = this.f26727b1;
                if (i10 < eVarArr4.length) {
                    eVarArr3[i10] = eVarArr4[i10];
                } else {
                    eVarArr3[i10] = m2();
                }
                i10++;
            }
            while (true) {
                e[] eVarArr5 = this.f26727b1;
                if (max < eVarArr5.length) {
                    this.f26726a1.y1(eVarArr5[max]);
                    max++;
                } else {
                    this.f26727b1 = eVarArr3;
                    return;
                }
            }
        }
    }

    private void a2(boolean z10) {
        int[][] n22;
        int[][] n23;
        if (z10) {
            for (int i10 = 0; i10 < this.f26741p1.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f26741p1;
                    if (i11 >= zArr[0].length) {
                        break;
                    }
                    zArr[i10][i11] = true;
                    i11++;
                }
            }
            for (int i12 = 0; i12 < this.f26743r1.length; i12++) {
                int i13 = 0;
                while (true) {
                    int[][] iArr = this.f26743r1;
                    if (i13 >= iArr[0].length) {
                        break;
                    }
                    iArr[i12][i13] = -1;
                    i13++;
                }
            }
        }
        this.f26740o1 = 0;
        String str = this.f26738m1;
        if (!(str == null || str.trim().isEmpty() || (n23 = n2(this.f26738m1, false)) == null)) {
            e2(n23);
        }
        String str2 = this.f26737l1;
        if (str2 != null && !str2.trim().isEmpty() && (n22 = n2(this.f26737l1, true)) != null) {
            f2(n22);
        }
    }

    private int b2(int i10) {
        return this.f26739n1 == 1 ? i10 / this.f26729d1 : i10 % this.f26731f1;
    }

    private int c2() {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10 = this.f26740o1;
            if (i10 >= this.f26729d1 * this.f26731f1) {
                return -1;
            }
            int d22 = d2(i10);
            int b22 = b2(this.f26740o1);
            boolean[] zArr = this.f26741p1[d22];
            if (zArr[b22]) {
                zArr[b22] = false;
                z10 = true;
            }
            this.f26740o1++;
        }
        return i10;
    }

    private int d2(int i10) {
        return this.f26739n1 == 1 ? i10 % this.f26729d1 : i10 / this.f26731f1;
    }

    private void e2(int[][] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            int[] iArr2 = iArr[i10];
            if (i2(d2(iArr2[0]), b2(iArr2[0]), iArr2[1], iArr2[2])) {
                i10++;
            } else {
                return;
            }
        }
    }

    private void f2(int[][] iArr) {
        if (!j2()) {
            int i10 = 0;
            while (i10 < iArr.length) {
                int d22 = d2(iArr[i10][0]);
                int b22 = b2(iArr[i10][0]);
                int[] iArr2 = iArr[i10];
                if (i2(d22, b22, iArr2[1], iArr2[2])) {
                    e eVar = this.f27575L0[i10];
                    int[] iArr3 = iArr[i10];
                    Y1(eVar, d22, b22, iArr3[1], iArr3[2]);
                    this.f26742q1.add(this.f27575L0[i10].f27468o);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private void g2() {
        boolean[][] zArr;
        int[][] iArr = this.f26743r1;
        boolean z10 = false;
        if (iArr != null && iArr.length == this.f27576M0 && (zArr = this.f26741p1) != null && zArr.length == this.f26729d1 && zArr[0].length == this.f26731f1) {
            z10 = true;
        }
        if (!z10) {
            h2();
        }
        a2(z10);
    }

    private void h2() {
        int i10 = this.f26729d1;
        int[] iArr = new int[2];
        iArr[1] = this.f26731f1;
        iArr[0] = i10;
        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, iArr);
        this.f26741p1 = zArr;
        for (boolean[] fill : zArr) {
            Arrays.fill(fill, true);
        }
        int i11 = this.f27576M0;
        if (i11 > 0) {
            int[] iArr2 = new int[2];
            iArr2[1] = 4;
            iArr2[0] = i11;
            int[][] iArr3 = (int[][]) Array.newInstance(Integer.TYPE, iArr2);
            this.f26743r1 = iArr3;
            for (int[] fill2 : iArr3) {
                Arrays.fill(fill2, -1);
            }
        }
    }

    private boolean i2(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            int i15 = i11;
            while (i15 < i11 + i13) {
                boolean[][] zArr = this.f26741p1;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                        i15++;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean j2() {
        return (this.f26744s1 & 2) > 0;
    }

    private boolean k2() {
        return (this.f26744s1 & 1) > 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int l2(String str, String str2) {
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    private e m2() {
        e eVar = new e();
        e.b[] bVarArr = eVar.f27439Z;
        e.b bVar = e.b.MATCH_CONSTRAINT;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        eVar.f27468o = String.valueOf(eVar.hashCode());
        return eVar;
    }

    private int[][] n2(String str, boolean z10) {
        try {
            String[] split = str.split(",");
            Arrays.sort(split, new C5675a());
            int length = split.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
            if (this.f26729d1 != 1) {
                if (this.f26731f1 != 1) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        String[] split2 = split[i10].trim().split(":");
                        String[] split3 = split2[1].split("x");
                        iArr2[i10][0] = Integer.parseInt(split2[0]);
                        if (k2()) {
                            iArr2[i10][1] = Integer.parseInt(split3[1]);
                            iArr2[i10][2] = Integer.parseInt(split3[0]);
                        } else {
                            iArr2[i10][1] = Integer.parseInt(split3[0]);
                            iArr2[i10][2] = Integer.parseInt(split3[1]);
                        }
                    }
                    return iArr2;
                }
            }
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < split.length; i13++) {
                String[] split4 = split[i13].trim().split(":");
                iArr2[i13][0] = Integer.parseInt(split4[0]);
                int[] iArr3 = iArr2[i13];
                iArr3[1] = 1;
                iArr3[2] = 1;
                if (this.f26731f1 == 1) {
                    iArr3[1] = Integer.parseInt(split4[1]);
                    i11 += iArr2[i13][1];
                    if (z10) {
                        i11--;
                    }
                }
                if (this.f26729d1 == 1) {
                    iArr2[i13][2] = Integer.parseInt(split4[1]);
                    i12 += iArr2[i13][2];
                    if (z10) {
                        i12--;
                    }
                }
            }
            if (i11 != 0 && !this.f26728c1) {
                x2(this.f26729d1 + i11);
            }
            if (i12 != 0 && !this.f26728c1) {
                s2(this.f26731f1 + i12);
            }
            this.f26728c1 = true;
            return iArr2;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] o2(int i10, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] split = str.split(",");
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < split.length) {
                try {
                    fArr[i11] = Float.parseFloat(split[i11]);
                } catch (Exception e10) {
                    PrintStream printStream = System.err;
                    printStream.println("Error parsing `" + split[i11] + "`: " + e10.getMessage());
                    fArr[i11] = 1.0f;
                }
            } else {
                fArr[i11] = 1.0f;
            }
        }
        return fArr;
    }

    private void p2() {
        int i10;
        int max = Math.max(this.f26729d1, this.f26731f1);
        e eVar = this.f26727b1[0];
        float[] o22 = o2(this.f26731f1, this.f26736k1);
        if (this.f26731f1 == 1) {
            W1(eVar);
            eVar.f27428O.a(this.f27428O, 0);
            eVar.f27430Q.a(this.f27430Q, 0);
            return;
        }
        int i11 = 0;
        while (true) {
            i10 = this.f26731f1;
            if (i11 >= i10) {
                break;
            }
            e eVar2 = this.f26727b1[i11];
            W1(eVar2);
            if (o22 != null) {
                eVar2.V0(o22[i11]);
            }
            if (i11 > 0) {
                eVar2.f27428O.a(this.f26727b1[i11 - 1].f27430Q, 0);
            } else {
                eVar2.f27428O.a(this.f27428O, 0);
            }
            if (i11 < this.f26731f1 - 1) {
                eVar2.f27430Q.a(this.f26727b1[i11 + 1].f27428O, 0);
            } else {
                eVar2.f27430Q.a(this.f27430Q, 0);
            }
            if (i11 > 0) {
                eVar2.f27428O.f27400g = (int) this.f26733h1;
            }
            i11++;
        }
        while (i10 < max) {
            e eVar3 = this.f26727b1[i10];
            W1(eVar3);
            eVar3.f27428O.a(this.f27428O, 0);
            eVar3.f27430Q.a(this.f27430Q, 0);
            i10++;
        }
    }

    private void q2() {
        int i10;
        int max = Math.max(this.f26729d1, this.f26731f1);
        e eVar = this.f26727b1[0];
        float[] o22 = o2(this.f26729d1, this.f26735j1);
        if (this.f26729d1 == 1) {
            X1(eVar);
            eVar.f27429P.a(this.f27429P, 0);
            eVar.f27431R.a(this.f27431R, 0);
            return;
        }
        int i11 = 0;
        while (true) {
            i10 = this.f26729d1;
            if (i11 >= i10) {
                break;
            }
            e eVar2 = this.f26727b1[i11];
            X1(eVar2);
            if (o22 != null) {
                eVar2.m1(o22[i11]);
            }
            if (i11 > 0) {
                eVar2.f27429P.a(this.f26727b1[i11 - 1].f27431R, 0);
            } else {
                eVar2.f27429P.a(this.f27429P, 0);
            }
            if (i11 < this.f26729d1 - 1) {
                eVar2.f27431R.a(this.f26727b1[i11 + 1].f27429P, 0);
            } else {
                eVar2.f27431R.a(this.f27431R, 0);
            }
            if (i11 > 0) {
                eVar2.f27429P.f27400g = (int) this.f26734i1;
            }
            i11++;
        }
        while (i10 < max) {
            e eVar3 = this.f26727b1[i10];
            X1(eVar3);
            eVar3.f27429P.a(this.f27429P, 0);
            eVar3.f27431R.a(this.f27431R, 0);
            i10++;
        }
    }

    public void A2(float f10) {
        if (f10 >= 0.0f && this.f26734i1 != f10) {
            this.f26734i1 = f10;
        }
    }

    public void G1(int i10, int i11, int i12, int i13) {
        super.G1(i10, i11, i12, i13);
        this.f26726a1 = (f) L();
        B2(false);
        this.f26726a1.v1(this.f26727b1);
    }

    public void g(C5414d dVar, boolean z10) {
        super.g(dVar, z10);
        U1();
    }

    public void r2(String str) {
        String str2 = this.f26736k1;
        if (str2 == null || !str2.equals(str)) {
            this.f26736k1 = str;
        }
    }

    public void s2(int i10) {
        if (i10 <= 50 && this.f26732g1 != i10) {
            this.f26732g1 = i10;
            C2();
            h2();
        }
    }

    public void t2(int i10) {
        this.f26744s1 = i10;
    }

    public void u2(float f10) {
        if (f10 >= 0.0f && this.f26733h1 != f10) {
            this.f26733h1 = f10;
        }
    }

    public void v2(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f26739n1 != i10) {
            this.f26739n1 = i10;
        }
    }

    public void w2(String str) {
        String str2 = this.f26735j1;
        if (str2 == null || !str2.equals(str)) {
            this.f26735j1 = str;
        }
    }

    public void x2(int i10) {
        if (i10 <= 50 && this.f26730e1 != i10) {
            this.f26730e1 = i10;
            C2();
            h2();
        }
    }

    public void y2(String str) {
        String str2 = this.f26738m1;
        if (str2 == null || !str2.equals(str)) {
            this.f26728c1 = false;
            this.f26738m1 = str;
        }
    }

    public void z2(CharSequence charSequence) {
        String str = this.f26737l1;
        if (str == null || !str.equals(charSequence.toString())) {
            this.f26728c1 = false;
            this.f26737l1 = charSequence.toString();
        }
    }
}
