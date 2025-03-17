package q7;

import fI.C17221b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0018B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0014\u0010\u001e¨\u0006\u001f"}, d2 = {"Lq7/a;", "", "Lq7/a$a;", "hashAlgorithm", "Lq7/a$b;", "signatureAlgorithm", "", "signature", "<init>", "(Lq7/a$a;Lq7/a$b;[B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lq7/a$a;", "getHashAlgorithm", "()Lq7/a$a;", "b", "Lq7/a$b;", "getSignatureAlgorithm", "()Lq7/a$b;", "c", "[B", "()[B", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: q7.a  reason: case insensitive filesystem */
public final class C8679a {

    /* renamed from: a  reason: collision with root package name */
    private final C0893a f55562a;

    /* renamed from: b  reason: collision with root package name */
    private final b f55563b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f55564c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lq7/a$a;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "I", "d", "()I", "Companion", "a", "NONE", "MD5", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: q7.a$a  reason: collision with other inner class name */
    public enum C0893a {
        NONE(0),
        MD5(1),
        SHA1(2),
        SHA224(3),
        SHA256(4),
        SHA384(5),
        SHA512(6);
        
        public static final C0894a Companion = null;
        private final int number;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq7/a$a$a;", "", "<init>", "()V", "", "number", "Lq7/a$a;", "a", "(I)Lq7/a$a;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: q7.a$a$a  reason: collision with other inner class name */
        public static final class C0894a {
            public /* synthetic */ C0894a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C0893a a(int i10) {
                for (C0893a aVar : C0893a.values()) {
                    if (aVar.d() == i10) {
                        return aVar;
                    }
                }
                return null;
            }

            private C0894a() {
            }
        }

        static {
            C0893a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C0894a((DefaultConstructorMarker) null);
        }

        private C0893a(int i10) {
            this.number = i10;
        }

        public final int d() {
            return this.number;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lq7/a$b;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "I", "d", "()I", "Companion", "a", "ANONYMOUS", "RSA", "DSA", "ECDSA", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: q7.a$b */
    public enum b {
        ANONYMOUS(0),
        RSA(1),
        DSA(2),
        ECDSA(3);
        
        public static final C0895a Companion = null;
        private final int number;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq7/a$b$a;", "", "<init>", "()V", "", "number", "Lq7/a$b;", "a", "(I)Lq7/a$b;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: q7.a$b$a  reason: collision with other inner class name */
        public static final class C0895a {
            public /* synthetic */ C0895a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(int i10) {
                for (b bVar : b.values()) {
                    if (bVar.d() == i10) {
                        return bVar;
                    }
                }
                return null;
            }

            private C0895a() {
            }
        }

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C0895a((DefaultConstructorMarker) null);
        }

        private b(int i10) {
            this.number = i10;
        }

        public final int d() {
            return this.number;
        }
    }

    public C8679a(C0893a aVar, b bVar, byte[] bArr) {
        C17542s.j(aVar, "hashAlgorithm");
        C17542s.j(bVar, "signatureAlgorithm");
        C17542s.j(bArr, "signature");
        this.f55562a = aVar;
        this.f55563b = bVar;
        this.f55564c = bArr;
    }

    public final byte[] a() {
        return this.f55564c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C8679a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.verifier.model.DigitallySigned");
        C8679a aVar = (C8679a) obj;
        return this.f55562a == aVar.f55562a && this.f55563b == aVar.f55563b && Arrays.equals(this.f55564c, aVar.f55564c);
    }

    public int hashCode() {
        return (((this.f55562a.hashCode() * 31) + this.f55563b.hashCode()) * 31) + Arrays.hashCode(this.f55564c);
    }

    public String toString() {
        return "DigitallySigned(hashAlgorithm=" + this.f55562a + ", signatureAlgorithm=" + this.f55563b + ", signature=" + Arrays.toString(this.f55564c) + ')';
    }
}
