package PH;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\f\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"LPH/b;", "LPH/a;", "<init>", "()V", "", "size", "LPH/c;", "b", "(I)Ljava/nio/ByteBuffer;", "instance", "LXH/N;", "a", "(Ljava/nio/ByteBuffer;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: PH.b  reason: case insensitive filesystem */
public final class C16188b implements C16187a {

    /* renamed from: a  reason: collision with root package name */
    public static final C16188b f137147a = new C16188b();

    private C16188b() {
    }

    public void a(ByteBuffer byteBuffer) {
        C17542s.j(byteBuffer, "instance");
    }

    public ByteBuffer b(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        C17542s.i(allocate, "allocate(size)");
        return C16189c.b(allocate);
    }
}
