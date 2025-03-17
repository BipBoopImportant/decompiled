package r7;

import YH.C16877v;
import bI.C17035a;
import j7.C8413g;
import java.security.PublicKey;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0006\b\b\u0018\u0000 *2\u00020\u0001:\u0001\u0019B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\u0011R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0019\u0010(¨\u0006+"}, d2 = {"Lr7/g;", "", "Ljava/security/PublicKey;", "key", "Ljava/time/Instant;", "validUntil", "", "operator", "", "Lr7/i;", "previousOperators", "<init>", "(Ljava/security/PublicKey;Ljava/time/Instant;Ljava/lang/String;Ljava/util/List;)V", "timestamp", "d", "(Ljava/time/Instant;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/PublicKey;", "b", "()Ljava/security/PublicKey;", "Ljava/time/Instant;", "c", "()Ljava/time/Instant;", "Ljava/lang/String;", "getOperator", "Ljava/util/List;", "getPreviousOperators", "()Ljava/util/List;", "", "e", "[B", "()[B", "id", "f", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: r7.g  reason: case insensitive filesystem */
public final class C8705g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f55761f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final PublicKey f55762a;

    /* renamed from: b  reason: collision with root package name */
    private final Instant f55763b;

    /* renamed from: c  reason: collision with root package name */
    private final String f55764c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C8707i> f55765d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f55766e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr7/g$a;", "", "<init>", "()V", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.g$b */
    public static final class b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((C8707i) t10).a(), ((C8707i) t11).a());
        }
    }

    public C8705g(PublicKey publicKey, Instant instant, String str, List<C8707i> list) {
        C17542s.j(publicKey, "key");
        C17542s.j(str, "operator");
        C17542s.j(list, "previousOperators");
        this.f55762a = publicKey;
        this.f55763b = instant;
        this.f55764c = str;
        this.f55765d = list;
        this.f55766e = C8413g.a(publicKey);
    }

    public final byte[] a() {
        return this.f55766e;
    }

    public final PublicKey b() {
        return this.f55762a;
    }

    public final Instant c() {
        return this.f55763b;
    }

    public final String d(Instant instant) {
        C17542s.j(instant, "timestamp");
        for (C8707i iVar : C16877v.g1(this.f55765d, new b())) {
            if (instant.compareTo(iVar.a()) < 0) {
                return iVar.b();
            }
        }
        return this.f55764c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8705g)) {
            return false;
        }
        C8705g gVar = (C8705g) obj;
        return C17542s.e(this.f55762a, gVar.f55762a) && C17542s.e(this.f55763b, gVar.f55763b) && C17542s.e(this.f55764c, gVar.f55764c) && C17542s.e(this.f55765d, gVar.f55765d);
    }

    public int hashCode() {
        int hashCode = this.f55762a.hashCode() * 31;
        Instant instant = this.f55763b;
        return ((((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f55764c.hashCode()) * 31) + this.f55765d.hashCode();
    }

    public String toString() {
        return "LogServer(key=" + this.f55762a + ", validUntil=" + this.f55763b + ", operator=" + this.f55764c + ", previousOperators=" + this.f55765d + ')';
    }
}
