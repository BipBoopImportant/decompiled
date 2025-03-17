package y3;

import com.sugarcube.app.base.data.source.CatalogRepository;
import java.nio.ByteBuffer;
import q3.C5807s;
import q3.x;

public class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public C5807s f32277b;

    /* renamed from: c  reason: collision with root package name */
    public final c f32278c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f32279d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32280e;

    /* renamed from: f  reason: collision with root package name */
    public long f32281f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f32282g;

    /* renamed from: h  reason: collision with root package name */
    private final int f32283h;

    /* renamed from: i  reason: collision with root package name */
    private final int f32284i;

    public static final class a extends IllegalStateException {

        /* renamed from: a  reason: collision with root package name */
        public final int f32285a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32286b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f32285a = i10;
            this.f32286b = i11;
        }
    }

    static {
        x.a("media3.decoder");
    }

    public f(int i10) {
        this(i10, 0);
    }

    private ByteBuffer J(int i10) {
        int i11 = this.f32283h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f32279d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static f N() {
        return new f(0);
    }

    public void K(int i10) {
        int i11 = i10 + this.f32284i;
        ByteBuffer byteBuffer = this.f32279d;
        if (byteBuffer == null) {
            this.f32279d = J(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f32279d = byteBuffer;
            return;
        }
        ByteBuffer J10 = J(i12);
        J10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            J10.put(byteBuffer);
        }
        this.f32279d = J10;
    }

    public final void L() {
        ByteBuffer byteBuffer = this.f32279d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f32282g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean M() {
        return B(CatalogRepository.FETCH_FLAG_SDB);
    }

    public void O(int i10) {
        ByteBuffer byteBuffer = this.f32282g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f32282g = ByteBuffer.allocate(i10);
        } else {
            this.f32282g.clear();
        }
    }

    public void v() {
        super.v();
        ByteBuffer byteBuffer = this.f32279d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f32282g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f32280e = false;
    }

    public f(int i10, int i11) {
        this.f32278c = new c();
        this.f32283h = i10;
        this.f32284i = i11;
    }
}
