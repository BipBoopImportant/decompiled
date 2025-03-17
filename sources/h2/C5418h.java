package h2;

import h2.C5412b;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: h2.h  reason: case insensitive filesystem */
public class C5418h extends C5412b {

    /* renamed from: g  reason: collision with root package name */
    private int f23824g = 128;

    /* renamed from: h  reason: collision with root package name */
    private C5419i[] f23825h = new C5419i[128];

    /* renamed from: i  reason: collision with root package name */
    private C5419i[] f23826i = new C5419i[128];

    /* renamed from: j  reason: collision with root package name */
    private int f23827j = 0;

    /* renamed from: k  reason: collision with root package name */
    b f23828k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    C5413c f23829l;

    /* renamed from: h2.h$a */
    class a implements Comparator<C5419i> {
        a() {
        }

        /* renamed from: a */
        public int compare(C5419i iVar, C5419i iVar2) {
            return iVar.f23837c - iVar2.f23837c;
        }
    }

    /* renamed from: h2.h$b */
    class b {

        /* renamed from: a  reason: collision with root package name */
        C5419i f23831a;

        /* renamed from: b  reason: collision with root package name */
        C5418h f23832b;

        b(C5418h hVar) {
            this.f23832b = hVar;
        }

        public boolean a(C5419i iVar, float f10) {
            boolean z10 = true;
            if (this.f23831a.f23835a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr = this.f23831a.f23843i;
                    float f11 = fArr[i10] + (iVar.f23843i[i10] * f10);
                    fArr[i10] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        this.f23831a.f23843i[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    C5418h.this.G(this.f23831a);
                }
                return false;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float f12 = iVar.f23843i[i11];
                if (f12 != 0.0f) {
                    float f13 = f12 * f10;
                    if (Math.abs(f13) < 1.0E-4f) {
                        f13 = 0.0f;
                    }
                    this.f23831a.f23843i[i11] = f13;
                } else {
                    this.f23831a.f23843i[i11] = 0.0f;
                }
            }
            return true;
        }

        public void b(C5419i iVar) {
            this.f23831a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f23831a.f23843i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(C5419i iVar) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = iVar.f23843i[i10];
                float f11 = this.f23831a.f23843i[i10];
                if (f11 != f10) {
                    return f11 < f10;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f23831a.f23843i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f23831a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f23831a.f23843i[i10] + " ";
                }
            }
            return str + "] " + this.f23831a;
        }
    }

    public C5418h(C5413c cVar) {
        super(cVar);
        this.f23829l = cVar;
    }

    private void F(C5419i iVar) {
        int i10;
        int i11 = this.f23827j + 1;
        C5419i[] iVarArr = this.f23825h;
        if (i11 > iVarArr.length) {
            C5419i[] iVarArr2 = (C5419i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f23825h = iVarArr2;
            this.f23826i = (C5419i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        C5419i[] iVarArr3 = this.f23825h;
        int i12 = this.f23827j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f23827j = i13;
        if (i13 > 1 && iVarArr3[i12].f23837c > iVar.f23837c) {
            int i14 = 0;
            while (true) {
                i10 = this.f23827j;
                if (i14 >= i10) {
                    break;
                }
                this.f23826i[i14] = this.f23825h[i14];
                i14++;
            }
            Arrays.sort(this.f23826i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f23827j; i15++) {
                this.f23825h[i15] = this.f23826i[i15];
            }
        }
        iVar.f23835a = true;
        iVar.a(this);
    }

    /* access modifiers changed from: private */
    public void G(C5419i iVar) {
        int i10 = 0;
        while (i10 < this.f23827j) {
            if (this.f23825h[i10] == iVar) {
                while (true) {
                    int i11 = this.f23827j;
                    if (i10 < i11 - 1) {
                        C5419i[] iVarArr = this.f23825h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f23827j = i11 - 1;
                        iVar.f23835a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public void B(C5414d dVar, C5412b bVar, boolean z10) {
        C5419i iVar = bVar.f23787a;
        if (iVar != null) {
            C5412b.a aVar = bVar.f23791e;
            int g10 = aVar.g();
            for (int i10 = 0; i10 < g10; i10++) {
                C5419i b10 = aVar.b(i10);
                float h10 = aVar.h(i10);
                this.f23828k.b(b10);
                if (this.f23828k.a(iVar, h10)) {
                    F(b10);
                }
                this.f23788b += bVar.f23788b * h10;
            }
            G(iVar);
        }
    }

    public C5419i b(C5414d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f23827j; i11++) {
            C5419i iVar = this.f23825h[i11];
            if (!zArr[iVar.f23837c]) {
                this.f23828k.b(iVar);
                if (i10 == -1) {
                    if (!this.f23828k.c()) {
                    }
                } else if (!this.f23828k.d(this.f23825h[i10])) {
                }
                i10 = i11;
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f23825h[i10];
    }

    public void c(C5419i iVar) {
        this.f23828k.b(iVar);
        this.f23828k.e();
        iVar.f23843i[iVar.f23839e] = 1.0f;
        F(iVar);
    }

    public void clear() {
        this.f23827j = 0;
        this.f23788b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f23827j == 0;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f23788b + ") : ";
        for (int i10 = 0; i10 < this.f23827j; i10++) {
            this.f23828k.b(this.f23825h[i10]);
            str = str + this.f23828k + " ";
        }
        return str;
    }
}
