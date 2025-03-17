package r7;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lr7/j;", "", "b", "a", "Lr7/j$a;", "Lr7/j$b;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: r7.j  reason: case insensitive filesystem */
public interface C8708j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr7/j$a;", "Lr7/j;", "<init>", "()V", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.j$a */
    public static class a implements C8708j {
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, d2 = {"Lr7/j$b;", "Lr7/j;", "", "logList", "signature", "<init>", "([B[B)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "()[B", "b", "", "toString", "()Ljava/lang/String;", "[B", "c", "d", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.j$b */
    public static final class b implements C8708j {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f55775a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f55776b;

        public b(byte[] bArr, byte[] bArr2) {
            C17542s.j(bArr, "logList");
            C17542s.j(bArr2, "signature");
            this.f55775a = bArr;
            this.f55776b = bArr2;
        }

        public final byte[] a() {
            return this.f55775a;
        }

        public final byte[] b() {
            return this.f55776b;
        }

        public final byte[] c() {
            return this.f55775a;
        }

        public final byte[] d() {
            return this.f55776b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C17542s.e(b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C17542s.h(obj, "null cannot be cast to non-null type com.appmattus.certificatetransparency.loglist.RawLogListResult.Success");
            b bVar = (b) obj;
            return Arrays.equals(this.f55775a, bVar.f55775a) && Arrays.equals(this.f55776b, bVar.f55776b);
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f55775a) * 31) + Arrays.hashCode(this.f55776b);
        }

        public String toString() {
            return "Success(logList=" + Arrays.toString(this.f55775a) + ", signature=" + Arrays.toString(this.f55776b) + ')';
        }
    }
}
