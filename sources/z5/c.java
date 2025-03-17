package Z5;

import T5.r;
import WK.C16770e;
import X5.C6721f;
import X5.s;
import X5.t;
import Z5.j;
import dI.C17164e;
import k6.C8450q;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LZ5/c;", "LZ5/j;", "", "byteArray", "Lk6/q;", "options", "<init>", "([BLk6/q;)V", "LZ5/i;", "a", "(LdI/e;)Ljava/lang/Object;", "[B", "b", "Lk6/q;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f41372a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f41373b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LZ5/c$a;", "LZ5/j$a;", "", "<init>", "()V", "data", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LZ5/j;", "b", "([BLk6/q;LT5/r;)LZ5/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<byte[]> {
        /* renamed from: b */
        public j a(byte[] bArr, C8450q qVar, r rVar) {
            return new c(bArr, qVar);
        }
    }

    public c(byte[] bArr, C8450q qVar) {
        this.f41372a = bArr;
        this.f41373b = qVar;
    }

    public Object a(C17164e<? super i> eVar) {
        C16770e eVar2 = new C16770e();
        eVar2.f1(this.f41372a);
        return new o(t.c(eVar2, this.f41373b.g(), (s.a) null, 4, (Object) null), (String) null, C6721f.MEMORY);
    }
}
