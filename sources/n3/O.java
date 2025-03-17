package N3;

import java.util.Arrays;
import q3.C5799j;
import q3.C5807s;
import t3.B;

public interface O {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f38777a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f38778b;

        /* renamed from: c  reason: collision with root package name */
        public final int f38779c;

        /* renamed from: d  reason: collision with root package name */
        public final int f38780d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f38777a = i10;
            this.f38778b = bArr;
            this.f38779c = i11;
            this.f38780d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f38777a == aVar.f38777a && this.f38779c == aVar.f38779c && this.f38780d == aVar.f38780d && Arrays.equals(this.f38778b, aVar.f38778b);
        }

        public int hashCode() {
            return (((((this.f38777a * 31) + Arrays.hashCode(this.f38778b)) * 31) + this.f38779c) * 31) + this.f38780d;
        }
    }

    void a(B b10, int i10) {
        b(b10, i10, 0);
    }

    void b(B b10, int i10, int i11);

    void c(long j10, int i10, int i11, int i12, a aVar);

    int d(C5799j jVar, int i10, boolean z10) {
        return f(jVar, i10, z10, 0);
    }

    void e(C5807s sVar);

    int f(C5799j jVar, int i10, boolean z10, int i11);
}
