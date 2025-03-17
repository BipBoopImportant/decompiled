package I3;

import java.util.Arrays;
import q3.C5807s;
import q3.K;
import t3.C5950a;

/* renamed from: I3.c  reason: case insensitive filesystem */
public abstract class C6555c implements x {

    /* renamed from: a  reason: collision with root package name */
    protected final K f36695a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f36696b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f36697c;

    /* renamed from: d  reason: collision with root package name */
    private final int f36698d;

    /* renamed from: e  reason: collision with root package name */
    private final C5807s[] f36699e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f36700f;

    /* renamed from: g  reason: collision with root package name */
    private int f36701g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f36702h;

    public C6555c(K k10, int[] iArr, int i10) {
        C5950a.g(iArr.length > 0);
        this.f36698d = i10;
        this.f36695a = (K) C5950a.e(k10);
        int length = iArr.length;
        this.f36696b = length;
        this.f36699e = new C5807s[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f36699e[i11] = k10.a(iArr[i11]);
        }
        Arrays.sort(this.f36699e, new C6554b());
        this.f36697c = new int[this.f36696b];
        int i12 = 0;
        while (true) {
            int i13 = this.f36696b;
            if (i12 < i13) {
                this.f36697c[i12] = k10.b(this.f36699e[i12]);
                i12++;
            } else {
                this.f36700f = new long[i13];
                this.f36702h = false;
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int o(C5807s sVar, C5807s sVar2) {
        return sVar2.f28239j - sVar.f28239j;
    }

    public final C5807s a(int i10) {
        return this.f36699e[i10];
    }

    public final int b(int i10) {
        return this.f36697c[i10];
    }

    public void c() {
    }

    public void e(float f10) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6555c cVar = (C6555c) obj;
        return this.f36695a.equals(cVar.f36695a) && Arrays.equals(this.f36697c, cVar.f36697c);
    }

    public final int g(int i10) {
        for (int i11 = 0; i11 < this.f36696b; i11++) {
            if (this.f36697c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final K h() {
        return this.f36695a;
    }

    public int hashCode() {
        if (this.f36701g == 0) {
            this.f36701g = (System.identityHashCode(this.f36695a) * 31) + Arrays.hashCode(this.f36697c);
        }
        return this.f36701g;
    }

    public void i(boolean z10) {
        this.f36702h = z10;
    }

    public void j() {
    }

    public final int k() {
        return this.f36697c[d()];
    }

    public final C5807s l() {
        return this.f36699e[d()];
    }

    public final int length() {
        return this.f36697c.length;
    }
}
