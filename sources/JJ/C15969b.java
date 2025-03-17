package JJ;

import HJ.C15840f;
import HJ.C15841g;
import HJ.C15854t;
import XH.C16801H;
import com.sugarcube.core.logger.DslKt;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"LJJ/b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "b", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JJ.b  reason: case insensitive filesystem */
public final class C15969b implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f135806c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C15969b f135807d = new C15969b(0, 0);

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<C15969b> f135808e = new C15968a();

    /* renamed from: a  reason: collision with root package name */
    private final long f135809a;

    /* renamed from: b  reason: collision with root package name */
    private final long f135810b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"LJJ/b$a;", "", "<init>", "()V", "", "mostSignificantBits", "leastSignificantBits", "LJJ/b;", "a", "(JJ)LJJ/b;", "", "uuidString", "c", "(Ljava/lang/String;)LJJ/b;", "NIL", "LJJ/b;", "b", "()LJJ/b;", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JJ.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15969b a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? b() : new C15969b(j10, j11);
        }

        public final C15969b b() {
            return C15969b.f135807d;
        }

        public final C15969b c(String str) {
            String str2 = str;
            C17542s.j(str2, "uuidString");
            if (str.length() == 36) {
                long k10 = C15840f.k(str, 0, 8, (C15841g) null, 4, (Object) null);
                C15971d.c(str2, 8);
                long k11 = C15840f.k(str, 9, 13, (C15841g) null, 4, (Object) null);
                C15971d.c(str2, 13);
                long k12 = C15840f.k(str, 14, 18, (C15841g) null, 4, (Object) null);
                C15971d.c(str2, 18);
                long k13 = C15840f.k(str, 19, 23, (C15841g) null, 4, (Object) null);
                C15971d.c(str2, 23);
                return a((k10 << 32) | (k11 << 16) | k12, C15840f.k(str, 24, 36, (C15841g) null, 4, (Object) null) | (k13 << 48));
            }
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }

        private a() {
        }
    }

    public C15969b(long j10, long j11) {
        this.f135809a = j10;
        this.f135810b = j11;
    }

    /* access modifiers changed from: private */
    public static final int b(C15969b bVar, C15969b bVar2) {
        C17542s.j(bVar, "a");
        C17542s.j(bVar2, DslKt.INDICATOR_BACKGROUND);
        long j10 = bVar.f135809a;
        return j10 != bVar2.f135809a ? Long.compareUnsigned(C16801H.b(j10), C16801H.b(bVar2.f135809a)) : Long.compareUnsigned(C16801H.b(bVar.f135810b), C16801H.b(bVar2.f135810b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15969b)) {
            return false;
        }
        C15969b bVar = (C15969b) obj;
        return this.f135809a == bVar.f135809a && this.f135810b == bVar.f135810b;
    }

    public int hashCode() {
        long j10 = this.f135809a ^ this.f135810b;
        return ((int) j10) ^ ((int) (j10 >> 32));
    }

    public String toString() {
        byte[] bArr = new byte[36];
        C15971d.d(this.f135810b, bArr, 24, 6);
        bArr[23] = 45;
        C15971d.d(this.f135810b >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        C15971d.d(this.f135809a, bArr, 14, 2);
        bArr[13] = 45;
        C15971d.d(this.f135809a >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        C15971d.d(this.f135809a >>> 32, bArr, 0, 4);
        return C15854t.B(bArr);
    }
}
