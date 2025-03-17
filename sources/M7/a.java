package M7;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

public class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f38619a;

    /* renamed from: M7.a$a  reason: collision with other inner class name */
    public static class C0607a implements e.a<ByteBuffer> {
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f38619a = byteBuffer;
    }

    public void b() {
    }

    /* renamed from: c */
    public ByteBuffer a() {
        this.f38619a.position(0);
        return this.f38619a;
    }
}
