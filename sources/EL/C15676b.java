package EL;

/* renamed from: EL.b  reason: case insensitive filesystem */
public class C15676b {

    /* renamed from: a  reason: collision with root package name */
    private final long f134286a;

    /* renamed from: b  reason: collision with root package name */
    private final int f134287b;

    /* renamed from: c  reason: collision with root package name */
    private final float f134288c;

    /* renamed from: d  reason: collision with root package name */
    private final long f134289d;

    /* renamed from: e  reason: collision with root package name */
    private final long f134290e;

    /* renamed from: EL.b$a */
    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f134291a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f134292b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f134293c = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public long f134294d = 0;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public long f134295e = 0;

        public a(long j10) {
            this.f134291a = j10;
        }

        public C15676b f() {
            return new C15676b(this);
        }

        public a g(long j10) {
            this.f134295e = j10;
            return this;
        }

        public a h(int i10) {
            this.f134292b = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15676b bVar = (C15676b) obj;
        if (this.f134286a == bVar.f134286a && this.f134287b == bVar.f134287b && Float.compare(bVar.f134288c, this.f134288c) == 0 && this.f134289d == bVar.f134289d) {
            return this.f134290e == bVar.f134290e;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f134286a;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + this.f134287b) * 31;
        float f10 = this.f134288c;
        int floatToIntBits = f10 != 0.0f ? Float.floatToIntBits(f10) : 0;
        long j11 = this.f134289d;
        long j12 = this.f134290e;
        return ((((i10 + floatToIntBits) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    private C15676b(a aVar) {
        this.f134286a = aVar.f134291a;
        this.f134287b = aVar.f134292b;
        this.f134288c = aVar.f134293c;
        this.f134289d = aVar.f134294d;
        this.f134290e = aVar.f134295e;
    }
}
