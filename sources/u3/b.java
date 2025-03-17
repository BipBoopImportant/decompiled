package u3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t3.B;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f30066a;

    /* renamed from: u3.b$b  reason: collision with other inner class name */
    public static final class C0471b extends b {

        /* renamed from: b  reason: collision with root package name */
        public final long f30067b;

        /* renamed from: c  reason: collision with root package name */
        public final List<c> f30068c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List<C0471b> f30069d = new ArrayList();

        public C0471b(int i10, long j10) {
            super(i10);
            this.f30067b = j10;
        }

        public void b(C0471b bVar) {
            this.f30069d.add(bVar);
        }

        public void c(c cVar) {
            this.f30068c.add(cVar);
        }

        public C0471b d(int i10) {
            int size = this.f30069d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0471b bVar = this.f30069d.get(i11);
                if (bVar.f30066a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public c e(int i10) {
            int size = this.f30068c.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = this.f30068c.get(i11);
                if (cVar.f30066a == i10) {
                    return cVar;
                }
            }
            return null;
        }

        public String toString() {
            return b.a(this.f30066a) + " leaves: " + Arrays.toString(this.f30068c.toArray()) + " containers: " + Arrays.toString(this.f30069d.toArray());
        }
    }

    public static final class c extends b {

        /* renamed from: b  reason: collision with root package name */
        public final B f30070b;

        public c(int i10, B b10) {
            super(i10);
            this.f30070b = b10;
        }
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f30066a);
    }

    private b(int i10) {
        this.f30066a = i10;
    }
}
