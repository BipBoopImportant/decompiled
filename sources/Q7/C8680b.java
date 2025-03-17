package q7;

import HJ.C15854t;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001b"}, d2 = {"Lq7/b;", "", "", "hostname", "", "b", "(Ljava/lang/String;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "pattern", "canonicalHostname", "c", "Z", "getStartsWithWildcard", "()Z", "startsWithWildcard", "d", "matchAll", "e", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: q7.b  reason: case insensitive filesystem */
public final class C8680b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f55565e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f55566a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55567b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f55568c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f55569d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq7/b$a;", "", "<init>", "()V", "", "WILDCARD", "Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: q7.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final boolean a() {
        return this.f55569d;
    }

    public final boolean b(String str) {
        C17542s.j(str, "hostname");
        if (!this.f55568c) {
            return C17542s.e(str, this.f55567b);
        }
        int r02 = C15854t.r0(str, '.', 0, false, 6, (Object) null);
        if (this.f55569d) {
            return true;
        }
        if ((str.length() - r02) - 1 == this.f55567b.length()) {
            String str2 = this.f55567b;
            if (C15854t.K(str, r02 + 1, str2, 0, str2.length(), false)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8680b) {
            C8680b bVar = (C8680b) obj;
            return C17542s.e(this.f55567b, bVar.f55567b) && this.f55568c == bVar.f55568c;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55567b, Boolean.valueOf(this.f55568c)});
    }

    public String toString() {
        return "Host(pattern=" + this.f55566a + ')';
    }
}
