package o7;

import XH.C16824o;
import XH.C16825p;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import k7.x;
import k7.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C8533b;
import m7.c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001d"}, d2 = {"Lo7/o;", "Lk7/o;", "Lk7/x;", "sequence", "<init>", "(Lk7/x;)V", "", "toString", "()Ljava/lang/String;", "e", "Lk7/x;", "Lk7/z;", "f", "LXH/o;", "q", "()Lk7/z;", "notValidBefore", "g", "p", "notValidAfter", "Lm7/c;", "i", "()Lm7/c;", "tag", "Ll7/b;", "()Ll7/b;", "encoded", "h", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends k7.o {

    /* renamed from: h  reason: collision with root package name */
    public static final a f55283h = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final x f55284e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o f55285f;

    /* renamed from: g  reason: collision with root package name */
    private final C16824o f55286g;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo7/o$a;", "", "<init>", "()V", "Lk7/x;", "sequence", "Lo7/o;", "a", "(Lk7/x;)Lo7/o;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(x xVar) {
            C17542s.j(xVar, "sequence");
            return new o(xVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ o(x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar);
    }

    /* access modifiers changed from: private */
    public static final z r(o oVar) {
        k7.o oVar2 = oVar.f55284e.q().get(1);
        C17542s.h(oVar2, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Time");
        return (z) oVar2;
    }

    /* access modifiers changed from: private */
    public static final z s(o oVar) {
        k7.o oVar2 = oVar.f55284e.q().get(0);
        C17542s.h(oVar2, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Time");
        return (z) oVar2;
    }

    public C8533b g() {
        return this.f55284e.g();
    }

    public c i() {
        return this.f55284e.i();
    }

    public final z p() {
        return (z) this.f55286g.getValue();
    }

    public final z q() {
        return (z) this.f55285f.getValue();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Not Valid Before ");
        ZonedDateTime atZone = q().o().atZone(ZoneId.systemDefault());
        FormatStyle formatStyle = FormatStyle.FULL;
        sb2.append(atZone.format(DateTimeFormatter.ofLocalizedDateTime(formatStyle)));
        sb2.append("\nNot Valid After ");
        sb2.append(p().o().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofLocalizedDateTime(formatStyle)));
        return sb2.toString();
    }

    private o(x xVar) {
        this.f55284e = xVar;
        this.f55285f = C16825p.b(new m(this));
        this.f55286g = C16825p.b(new n(this));
    }
}
