package F4;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f35398e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f35399f;

    /* renamed from: g  reason: collision with root package name */
    public static final c f35400g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f35401h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f35402i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f35403j;

    /* renamed from: a  reason: collision with root package name */
    final float[] f35404a;

    /* renamed from: b  reason: collision with root package name */
    final float[] f35405b;

    /* renamed from: c  reason: collision with root package name */
    final float[] f35406c = new float[3];

    /* renamed from: d  reason: collision with root package name */
    boolean f35407d = true;

    static {
        c cVar = new c();
        f35398e = cVar;
        m(cVar);
        p(cVar);
        c cVar2 = new c();
        f35399f = cVar2;
        o(cVar2);
        p(cVar2);
        c cVar3 = new c();
        f35400g = cVar3;
        l(cVar3);
        p(cVar3);
        c cVar4 = new c();
        f35401h = cVar4;
        m(cVar4);
        n(cVar4);
        c cVar5 = new c();
        f35402i = cVar5;
        o(cVar5);
        n(cVar5);
        c cVar6 = new c();
        f35403j = cVar6;
        l(cVar6);
        n(cVar6);
    }

    c() {
        float[] fArr = new float[3];
        this.f35404a = fArr;
        float[] fArr2 = new float[3];
        this.f35405b = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    private static void l(c cVar) {
        float[] fArr = cVar.f35405b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void m(c cVar) {
        float[] fArr = cVar.f35405b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void n(c cVar) {
        float[] fArr = cVar.f35404a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void o(c cVar) {
        float[] fArr = cVar.f35405b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void p(c cVar) {
        float[] fArr = cVar.f35404a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void q() {
        float[] fArr = this.f35406c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f35406c[1];
    }

    public float b() {
        return this.f35405b[2];
    }

    public float c() {
        return this.f35404a[2];
    }

    public float d() {
        return this.f35405b[0];
    }

    public float e() {
        return this.f35404a[0];
    }

    public float f() {
        return this.f35406c[2];
    }

    public float g() {
        return this.f35406c[0];
    }

    public float h() {
        return this.f35405b[1];
    }

    public float i() {
        return this.f35404a[1];
    }

    public boolean j() {
        return this.f35407d;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        float f10 = 0.0f;
        for (float f11 : this.f35406c) {
            if (f11 > 0.0f) {
                f10 += f11;
            }
        }
        if (f10 != 0.0f) {
            int length = this.f35406c.length;
            for (int i10 = 0; i10 < length; i10++) {
                float[] fArr = this.f35406c;
                float f12 = fArr[i10];
                if (f12 > 0.0f) {
                    fArr[i10] = f12 / f10;
                }
            }
        }
    }
}
