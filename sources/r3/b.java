package r3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import jb.j;
import q3.C5807s;
import t3.N;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f28643a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f28644e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f28645a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28646b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28647c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28648d;

        public a(C5807s sVar) {
            this(sVar.f28220E, sVar.f28219D, sVar.f28221F);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28645a == aVar.f28645a && this.f28646b == aVar.f28646b && this.f28647c == aVar.f28647c;
        }

        public int hashCode() {
            return j.b(Integer.valueOf(this.f28645a), Integer.valueOf(this.f28646b), Integer.valueOf(this.f28647c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f28645a + ", channelCount=" + this.f28646b + ", encoding=" + this.f28647c + ']';
        }

        public a(int i10, int i11, int i12) {
            this.f28645a = i10;
            this.f28646b = i11;
            this.f28647c = i12;
            this.f28648d = N.E0(i12) ? N.h0(i12, i11) : -1;
        }
    }

    /* renamed from: r3.b$b  reason: collision with other inner class name */
    public static final class C0454b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final a f28649a;

        public C0454b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public C0454b(String str, a aVar) {
            super(str + " " + aVar);
            this.f28649a = aVar;
        }
    }

    void a();

    ByteBuffer b();

    boolean c();

    boolean d();

    void e(ByteBuffer byteBuffer);

    a f(a aVar);

    void flush();

    void g();
}
