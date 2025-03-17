package h2;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: h2.i  reason: case insensitive filesystem */
public class C5419i implements Comparable<C5419i> {

    /* renamed from: r  reason: collision with root package name */
    private static int f23834r = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23835a;

    /* renamed from: b  reason: collision with root package name */
    private String f23836b;

    /* renamed from: c  reason: collision with root package name */
    public int f23837c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f23838d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f23839e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f23840f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23841g = false;

    /* renamed from: h  reason: collision with root package name */
    float[] f23842h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    float[] f23843i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    a f23844j;

    /* renamed from: k  reason: collision with root package name */
    C5412b[] f23845k = new C5412b[16];

    /* renamed from: l  reason: collision with root package name */
    int f23846l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f23847m = 0;

    /* renamed from: n  reason: collision with root package name */
    boolean f23848n = false;

    /* renamed from: o  reason: collision with root package name */
    int f23849o = -1;

    /* renamed from: p  reason: collision with root package name */
    float f23850p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    HashSet<C5412b> f23851q = null;

    /* renamed from: h2.i$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C5419i(a aVar, String str) {
        this.f23844j = aVar;
    }

    static void j() {
        f23834r++;
    }

    public void B(a aVar, String str) {
        this.f23844j = aVar;
    }

    public final void C(C5414d dVar, C5412b bVar) {
        int i10 = this.f23846l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f23845k[i11].B(dVar, bVar, false);
        }
        this.f23846l = 0;
    }

    public final void a(C5412b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f23846l;
            if (i10 >= i11) {
                C5412b[] bVarArr = this.f23845k;
                if (i11 >= bVarArr.length) {
                    this.f23845k = (C5412b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C5412b[] bVarArr2 = this.f23845k;
                int i12 = this.f23846l;
                bVarArr2[i12] = bVar;
                this.f23846l = i12 + 1;
                return;
            } else if (this.f23845k[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public int compareTo(C5419i iVar) {
        return this.f23837c - iVar.f23837c;
    }

    public final void m(C5412b bVar) {
        int i10 = this.f23846l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f23845k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    C5412b[] bVarArr = this.f23845k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f23846l--;
                return;
            }
            i11++;
        }
    }

    public void n() {
        this.f23836b = null;
        this.f23844j = a.UNKNOWN;
        this.f23839e = 0;
        this.f23837c = -1;
        this.f23838d = -1;
        this.f23840f = 0.0f;
        this.f23841g = false;
        this.f23848n = false;
        this.f23849o = -1;
        this.f23850p = 0.0f;
        int i10 = this.f23846l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f23845k[i11] = null;
        }
        this.f23846l = 0;
        this.f23847m = 0;
        this.f23835a = false;
        Arrays.fill(this.f23843i, 0.0f);
    }

    public String toString() {
        if (this.f23836b != null) {
            return "" + this.f23836b;
        }
        return "" + this.f23837c;
    }

    public void v(C5414d dVar, float f10) {
        this.f23840f = f10;
        this.f23841g = true;
        this.f23848n = false;
        this.f23849o = -1;
        this.f23850p = 0.0f;
        int i10 = this.f23846l;
        this.f23838d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f23845k[i11].A(dVar, this, false);
        }
        this.f23846l = 0;
    }
}
