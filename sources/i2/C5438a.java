package i2;

/* renamed from: i2.a  reason: case insensitive filesystem */
public class C5438a {

    /* renamed from: a  reason: collision with root package name */
    String f24394a;

    /* renamed from: b  reason: collision with root package name */
    private int f24395b;

    /* renamed from: c  reason: collision with root package name */
    private int f24396c;

    /* renamed from: d  reason: collision with root package name */
    private float f24397d;

    /* renamed from: e  reason: collision with root package name */
    private String f24398e;

    /* renamed from: f  reason: collision with root package name */
    boolean f24399f;

    public C5438a(C5438a aVar) {
        this.f24396c = Integer.MIN_VALUE;
        this.f24397d = Float.NaN;
        this.f24398e = null;
        this.f24394a = aVar.f24394a;
        this.f24395b = aVar.f24395b;
        this.f24396c = aVar.f24396c;
        this.f24397d = aVar.f24397d;
        this.f24398e = aVar.f24398e;
        this.f24399f = aVar.f24399f;
    }

    private static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static String b(int i10) {
        String str = "00000000" + Integer.toHexString(i10);
        return "#" + str.substring(str.length() - 8);
    }

    public C5438a c() {
        return new C5438a(this);
    }

    public boolean d() {
        return this.f24399f;
    }

    public float e() {
        return this.f24397d;
    }

    public int f() {
        return this.f24396c;
    }

    public String g() {
        return this.f24394a;
    }

    public String h() {
        return this.f24398e;
    }

    public int i() {
        return this.f24395b;
    }

    public float j() {
        switch (this.f24395b) {
            case 900:
                return (float) this.f24396c;
            case 901:
                return this.f24397d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                return this.f24399f ? 1.0f : 0.0f;
            case 905:
                return this.f24397d;
            default:
                return Float.NaN;
        }
    }

    public void k(float[] fArr) {
        switch (this.f24395b) {
            case 900:
                fArr[0] = (float) this.f24396c;
                return;
            case 901:
                fArr[0] = this.f24397d;
                return;
            case 902:
                int i10 = this.f24396c;
                float pow = (float) Math.pow((double) (((float) ((i10 >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i10 >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i10 & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i10 >> 24) & 255)) / 255.0f;
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                fArr[0] = this.f24399f ? 1.0f : 0.0f;
                return;
            case 905:
                fArr[0] = this.f24397d;
                return;
            default:
                return;
        }
    }

    public boolean l() {
        int i10 = this.f24395b;
        return (i10 == 903 || i10 == 904 || i10 == 906) ? false : true;
    }

    public int m() {
        return this.f24395b != 902 ? 1 : 4;
    }

    public void n(boolean z10) {
        this.f24399f = z10;
    }

    public void o(float f10) {
        this.f24397d = f10;
    }

    public void p(int i10) {
        this.f24396c = i10;
    }

    public void q(C5442e eVar, float[] fArr) {
        int i10 = this.f24395b;
        boolean z10 = true;
        switch (i10) {
            case 900:
                eVar.H(this.f24394a, i10, (int) fArr[0]);
                return;
            case 901:
            case 905:
                eVar.G(this.f24394a, i10, fArr[0]);
                return;
            case 902:
                int a10 = a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                int a11 = a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                eVar.H(this.f24394a, this.f24395b, (a((int) (fArr[3] * 255.0f)) << 24) | (a10 << 16) | (a11 << 8) | a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case 903:
            case 906:
                throw new RuntimeException("unable to interpolate " + this.f24394a);
            case 904:
                String str = this.f24394a;
                if (fArr[0] <= 0.5f) {
                    z10 = false;
                }
                eVar.I(str, i10, z10);
                return;
            default:
                return;
        }
    }

    public void r(Object obj) {
        switch (this.f24395b) {
            case 900:
            case 906:
                this.f24396c = ((Integer) obj).intValue();
                return;
            case 901:
                this.f24397d = ((Float) obj).floatValue();
                return;
            case 902:
                this.f24396c = ((Integer) obj).intValue();
                return;
            case 903:
                this.f24398e = (String) obj;
                return;
            case 904:
                this.f24399f = ((Boolean) obj).booleanValue();
                return;
            case 905:
                this.f24397d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void s(float[] fArr) {
        boolean z10 = true;
        switch (this.f24395b) {
            case 900:
            case 906:
                this.f24396c = (int) fArr[0];
                return;
            case 901:
            case 905:
                this.f24397d = fArr[0];
                return;
            case 902:
                this.f24396c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow((double) fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow((double) fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow((double) fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                if (((double) fArr[0]) <= 0.5d) {
                    z10 = false;
                }
                this.f24399f = z10;
                return;
            default:
                return;
        }
    }

    public String toString() {
        String str = this.f24394a + ':';
        switch (this.f24395b) {
            case 900:
                return str + this.f24396c;
            case 901:
                return str + this.f24397d;
            case 902:
                return str + b(this.f24396c);
            case 903:
                return str + this.f24398e;
            case 904:
                return str + Boolean.valueOf(this.f24399f);
            case 905:
                return str + this.f24397d;
            default:
                return str + "????";
        }
    }

    public C5438a(String str, int i10, int i11) {
        this.f24396c = Integer.MIN_VALUE;
        this.f24397d = Float.NaN;
        this.f24398e = null;
        this.f24394a = str;
        this.f24395b = i10;
        if (i10 == 901) {
            this.f24397d = (float) i11;
        } else {
            this.f24396c = i11;
        }
    }

    public C5438a(String str, int i10, float f10) {
        this.f24396c = Integer.MIN_VALUE;
        this.f24398e = null;
        this.f24394a = str;
        this.f24395b = i10;
        this.f24397d = f10;
    }

    public C5438a(String str, int i10, boolean z10) {
        this.f24396c = Integer.MIN_VALUE;
        this.f24397d = Float.NaN;
        this.f24398e = null;
        this.f24394a = str;
        this.f24395b = i10;
        this.f24399f = z10;
    }
}
