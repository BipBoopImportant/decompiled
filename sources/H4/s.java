package h4;

import q3.C5807s;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final int f51592a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51593b;

    /* renamed from: c  reason: collision with root package name */
    public final long f51594c;

    /* renamed from: d  reason: collision with root package name */
    public final long f51595d;

    /* renamed from: e  reason: collision with root package name */
    public final long f51596e;

    /* renamed from: f  reason: collision with root package name */
    public final long f51597f;

    /* renamed from: g  reason: collision with root package name */
    public final C5807s f51598g;

    /* renamed from: h  reason: collision with root package name */
    public final int f51599h;

    /* renamed from: i  reason: collision with root package name */
    public final long[] f51600i;

    /* renamed from: j  reason: collision with root package name */
    public final long[] f51601j;

    /* renamed from: k  reason: collision with root package name */
    public final int f51602k;

    /* renamed from: l  reason: collision with root package name */
    private final t[] f51603l;

    public s(int i10, int i11, long j10, long j11, long j12, long j13, C5807s sVar, int i12, t[] tVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f51592a = i10;
        this.f51593b = i11;
        this.f51594c = j10;
        this.f51595d = j11;
        this.f51596e = j12;
        this.f51597f = j13;
        this.f51598g = sVar;
        this.f51599h = i12;
        this.f51603l = tVarArr;
        this.f51602k = i13;
        this.f51600i = jArr;
        this.f51601j = jArr2;
    }

    public s a(C5807s sVar) {
        return new s(this.f51592a, this.f51593b, this.f51594c, this.f51595d, this.f51596e, this.f51597f, sVar, this.f51599h, this.f51603l, this.f51602k, this.f51600i, this.f51601j);
    }

    public t b(int i10) {
        t[] tVarArr = this.f51603l;
        if (tVarArr == null) {
            return null;
        }
        return tVarArr[i10];
    }
}
