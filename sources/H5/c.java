package H5;

import B5.h;
import E5.e;
import E5.r;
import H5.i;
import N5.m;
import WK.C16770e;
import dI.C17164e;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LH5/c;", "LH5/i;", "Ljava/nio/ByteBuffer;", "data", "LN5/m;", "options", "<init>", "(Ljava/nio/ByteBuffer;LN5/m;)V", "LH5/h;", "a", "(LdI/e;)Ljava/lang/Object;", "Ljava/nio/ByteBuffer;", "b", "LN5/m;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f36407a;

    /* renamed from: b  reason: collision with root package name */
    private final m f36408b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LH5/c$a;", "LH5/i$a;", "Ljava/nio/ByteBuffer;", "<init>", "()V", "data", "LN5/m;", "options", "LB5/h;", "imageLoader", "LH5/i;", "b", "(Ljava/nio/ByteBuffer;LN5/m;LB5/h;)LH5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<ByteBuffer> {
        /* renamed from: b */
        public i a(ByteBuffer byteBuffer, m mVar, h hVar) {
            return new c(byteBuffer, mVar);
        }
    }

    public c(ByteBuffer byteBuffer, m mVar) {
        this.f36407a = byteBuffer;
        this.f36408b = mVar;
    }

    /* JADX INFO: finally extract failed */
    public Object a(C17164e<? super h> eVar) {
        try {
            C16770e eVar2 = new C16770e();
            eVar2.write(this.f36407a);
            this.f36407a.position(0);
            return new m(r.e(eVar2, this.f36408b.g()), (String) null, e.MEMORY);
        } catch (Throwable th2) {
            this.f36407a.position(0);
            throw th2;
        }
    }
}
