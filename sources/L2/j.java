package l2;

public class j extends C5519c {

    /* renamed from: f  reason: collision with root package name */
    int f25480f = 0;

    /* renamed from: g  reason: collision with root package name */
    a f25481g = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    char[] f25482h = "true".toCharArray();

    /* renamed from: i  reason: collision with root package name */
    char[] f25483i = "false".toCharArray();

    /* renamed from: j  reason: collision with root package name */
    char[] f25484j = "null".toCharArray();

    enum a {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public j(char[] cArr) {
        super(cArr);
    }

    public static C5519c L(char[] cArr) {
        return new j(cArr);
    }

    /* access modifiers changed from: protected */
    public String K() {
        if (!g.f25473d) {
            return j();
        }
        return "<" + j() + ">";
    }

    public boolean M(char c10, long j10) {
        int ordinal = this.f25481g.ordinal();
        boolean z10 = false;
        if (ordinal == 0) {
            char[] cArr = this.f25482h;
            int i10 = this.f25480f;
            if (cArr[i10] == c10) {
                this.f25481g = a.TRUE;
            } else if (this.f25483i[i10] == c10) {
                this.f25481g = a.FALSE;
            } else if (this.f25484j[i10] == c10) {
                this.f25481g = a.NULL;
            }
            z10 = true;
        } else if (ordinal == 1) {
            char[] cArr2 = this.f25482h;
            int i11 = this.f25480f;
            if (cArr2[i11] == c10) {
                z10 = true;
            }
            if (z10 && i11 + 1 == cArr2.length) {
                G(j10);
            }
        } else if (ordinal == 2) {
            char[] cArr3 = this.f25483i;
            int i12 = this.f25480f;
            if (cArr3[i12] == c10) {
                z10 = true;
            }
            if (z10 && i12 + 1 == cArr3.length) {
                G(j10);
            }
        } else if (ordinal == 3) {
            char[] cArr4 = this.f25484j;
            int i13 = this.f25480f;
            if (cArr4[i13] == c10) {
                z10 = true;
            }
            if (z10 && i13 + 1 == cArr4.length) {
                G(j10);
            }
        }
        this.f25480f++;
        return z10;
    }
}
