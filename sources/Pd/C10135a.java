package pd;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: pd.a  reason: case insensitive filesystem */
public final class C10135a {

    /* renamed from: h  reason: collision with root package name */
    public static final C10135a f75834h = new C10135a(4201, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final C10135a f75835i = new C10135a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final C10135a f75836j;

    /* renamed from: k  reason: collision with root package name */
    public static final C10135a f75837k = new C10135a(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final C10135a f75838l = new C10135a(285, 256, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final C10135a f75839m;

    /* renamed from: n  reason: collision with root package name */
    public static final C10135a f75840n;

    /* renamed from: o  reason: collision with root package name */
    public static final C10135a f75841o;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f75842a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f75843b;

    /* renamed from: c  reason: collision with root package name */
    private final C10136b f75844c;

    /* renamed from: d  reason: collision with root package name */
    private final C10136b f75845d;

    /* renamed from: e  reason: collision with root package name */
    private final int f75846e;

    /* renamed from: f  reason: collision with root package name */
    private final int f75847f;

    /* renamed from: g  reason: collision with root package name */
    private final int f75848g;

    static {
        C10135a aVar = new C10135a(67, 64, 1);
        f75836j = aVar;
        C10135a aVar2 = new C10135a(301, 256, 1);
        f75839m = aVar2;
        f75840n = aVar2;
        f75841o = aVar;
    }

    public C10135a(int i10, int i11, int i12) {
        this.f75847f = i10;
        this.f75846e = i11;
        this.f75848g = i12;
        this.f75842a = new int[i11];
        this.f75843b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f75842a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f75843b[this.f75842a[i15]] = i15;
        }
        this.f75844c = new C10136b(this, new int[]{0});
        this.f75845d = new C10136b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* access modifiers changed from: package-private */
    public C10136b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f75844c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new C10136b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f75842a[i10];
    }

    public int d() {
        return this.f75848g;
    }

    /* access modifiers changed from: package-private */
    public C10136b e() {
        return this.f75844c;
    }

    /* access modifiers changed from: package-private */
    public int f(int i10) {
        if (i10 != 0) {
            return this.f75842a[(this.f75846e - this.f75843b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        if (i10 != 0) {
            return this.f75843b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f75842a;
        int[] iArr2 = this.f75843b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f75846e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f75847f) + ',' + this.f75846e + ')';
    }
}
