package I7;

import C7.i;
import I7.o;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b<Data> implements o<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    private final C0584b<Data> f36982a;

    public static class a implements p<byte[], ByteBuffer> {

        /* renamed from: I7.b$a$a  reason: collision with other inner class name */
        class C0583a implements C0584b<ByteBuffer> {
            C0583a() {
            }

            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public o<byte[], ByteBuffer> d(s sVar) {
            return new b(new C0583a());
        }

        public void teardown() {
        }
    }

    /* renamed from: I7.b$b  reason: collision with other inner class name */
    public interface C0584b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f36984a;

        /* renamed from: b  reason: collision with root package name */
        private final C0584b<Data> f36985b;

        c(byte[] bArr, C0584b<Data> bVar) {
            this.f36984a = bArr;
            this.f36985b = bVar;
        }

        public Class<Data> a() {
            return this.f36985b.a();
        }

        public void b() {
        }

        public void cancel() {
        }

        public C7.a d() {
            return C7.a.LOCAL;
        }

        public void f(g gVar, d.a<? super Data> aVar) {
            aVar.e(this.f36985b.b(this.f36984a));
        }
    }

    public static class d implements p<byte[], InputStream> {

        class a implements C0584b<InputStream> {
            a() {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public o<byte[], InputStream> d(s sVar) {
            return new b(new a());
        }

        public void teardown() {
        }
    }

    public b(C0584b<Data> bVar) {
        this.f36982a = bVar;
    }

    /* renamed from: c */
    public o.a<Data> b(byte[] bArr, int i10, int i11, i iVar) {
        return new o.a<>(new X7.d(bArr), new c(bArr, this.f36982a));
    }

    /* renamed from: d */
    public boolean a(byte[] bArr) {
        return true;
    }
}
