package o7;

import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import java.math.BigInteger;
import java.util.Locale;
import k7.f;
import k7.g;
import k7.o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C8533b;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lo7/c;", "Lk7/o;", "Lk7/f;", "integer", "<init>", "(Lk7/f;)V", "", "toString", "()Ljava/lang/String;", "e", "Lk7/f;", "Ljava/math/BigInteger;", "f", "LXH/o;", "o", "()Ljava/math/BigInteger;", "serialNumber", "Lm7/c;", "i", "()Lm7/c;", "tag", "Ll7/b;", "g", "()Ll7/b;", "encoded", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends o {

    /* renamed from: g  reason: collision with root package name */
    public static final a f55252g = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final f f55253e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o f55254f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo7/c$a;", "", "<init>", "()V", "Lk7/f;", "sequence", "Lo7/c;", "a", "(Lk7/f;)Lo7/c;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(f fVar) {
            C17542s.j(fVar, "sequence");
            return new c(fVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ c(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    /* access modifiers changed from: private */
    public static final BigInteger p(c cVar) {
        return cVar.f55253e.p();
    }

    public C8533b g() {
        return this.f55253e.g();
    }

    public m7.c i() {
        return this.f55253e.i();
    }

    public final BigInteger o() {
        return (BigInteger) this.f55254f.getValue();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Serial Number ");
        byte[] byteArray = o().toByteArray();
        C17542s.i(byteArray, "toByteArray(...)");
        String upperCase = g.h(byteArray).toUpperCase(Locale.ROOT);
        C17542s.i(upperCase, "toUpperCase(...)");
        sb2.append(C16877v.G0(C15854t.D1(upperCase, 2), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
        return sb2.toString();
    }

    private c(f fVar) {
        this.f55253e = fVar;
        this.f55254f = C16825p.b(new C8609b(this));
    }
}
