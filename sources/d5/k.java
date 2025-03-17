package d5;

import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Ld5/k;", "", "", "major", "minor", "patch", "", "description", "<init>", "(IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "b", "(Ld5/k;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "m", "n", "c", "v", "d", "Ljava/lang/String;", "getDescription", "Ljava/math/BigInteger;", "e", "LXH/o;", "j", "()Ljava/math/BigInteger;", "bigInteger", "f", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k implements Comparable<k> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f50750f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final k f50751g = new k(0, 0, 0, "");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final k f50752h = new k(0, 1, 0, "");

    /* renamed from: i  reason: collision with root package name */
    private static final k f50753i;

    /* renamed from: j  reason: collision with root package name */
    private static final k f50754j;

    /* renamed from: a  reason: collision with root package name */
    private final int f50755a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50756b;

    /* renamed from: c  reason: collision with root package name */
    private final int f50757c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50758d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f50759e;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld5/k$a;", "", "<init>", "()V", "", "versionString", "Ld5/k;", "b", "(Ljava/lang/String;)Ld5/k;", "VERSION_0_1", "Ld5/k;", "a", "()Ld5/k;", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f50752h;
        }

        public final k b(String str) {
            String group;
            if (str != null && !C15854t.v0(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    if (group2 != null) {
                        int parseInt2 = Integer.parseInt(group2);
                        String group3 = matcher.group(3);
                        if (group3 != null) {
                            int parseInt3 = Integer.parseInt(group3);
                            String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                            C17542s.i(group4, "description");
                            return new k(parseInt, parseInt2, parseInt3, group4, (DefaultConstructorMarker) null);
                        }
                    }
                }
            }
            return null;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "b", "()Ljava/math/BigInteger;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<BigInteger> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f50760c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(0);
            this.f50760c = kVar;
        }

        /* renamed from: b */
        public final BigInteger invoke() {
            return BigInteger.valueOf((long) this.f50760c.m()).shiftLeft(32).or(BigInteger.valueOf((long) this.f50760c.n())).shiftLeft(32).or(BigInteger.valueOf((long) this.f50760c.v()));
        }
    }

    static {
        k kVar = new k(1, 0, 0, "");
        f50753i = kVar;
        f50754j = kVar;
    }

    public /* synthetic */ k(int i10, int i11, int i12, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str);
    }

    private final BigInteger j() {
        Object value = this.f50759e.getValue();
        C17542s.i(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    /* renamed from: b */
    public int compareTo(k kVar) {
        C17542s.j(kVar, "other");
        return j().compareTo(kVar.j());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f50755a == kVar.f50755a && this.f50756b == kVar.f50756b && this.f50757c == kVar.f50757c;
    }

    public int hashCode() {
        return ((((527 + this.f50755a) * 31) + this.f50756b) * 31) + this.f50757c;
    }

    public final int m() {
        return this.f50755a;
    }

    public final int n() {
        return this.f50756b;
    }

    public String toString() {
        String str;
        if (!C15854t.v0(this.f50758d)) {
            str = '-' + this.f50758d;
        } else {
            str = "";
        }
        return this.f50755a + '.' + this.f50756b + '.' + this.f50757c + str;
    }

    public final int v() {
        return this.f50757c;
    }

    private k(int i10, int i11, int i12, String str) {
        this.f50755a = i10;
        this.f50756b = i11;
        this.f50757c = i12;
        this.f50758d = str;
        this.f50759e = C16825p.b(new b(this));
    }
}
