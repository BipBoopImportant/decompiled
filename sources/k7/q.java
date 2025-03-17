package k7;

import XH.C16824o;
import XH.C16825p;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C8533b;
import m7.c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\"B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013¨\u0006#"}, d2 = {"Lk7/q;", "Lk7/o;", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "<init>", "(Lm7/c;Ll7/b;Lk7/h;)V", "", "r", "(Ll7/b;)Ljava/lang/String;", "", "i", "LXH/N;", "o", "(Ll7/b;I)V", "toString", "()Ljava/lang/String;", "e", "Lm7/c;", "()Lm7/c;", "f", "Ll7/b;", "g", "()Ll7/b;", "Lk7/h;", "p", "()Lk7/h;", "h", "LXH/o;", "q", "value", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends o {

    /* renamed from: i  reason: collision with root package name */
    public static final a f54323i = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final c f54324e;

    /* renamed from: f  reason: collision with root package name */
    private final C8533b f54325f;

    /* renamed from: g  reason: collision with root package name */
    private final h f54326g;

    /* renamed from: h  reason: collision with root package name */
    private final C16824o f54327h;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lk7/q$a;", "", "<init>", "()V", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "Lk7/q;", "a", "(Lm7/c;Ll7/b;Lk7/h;)Lk7/q;", "", "LONG_LIMIT", "J", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(c cVar, C8533b bVar, h hVar) {
            C17542s.j(cVar, "tag");
            C17542s.j(bVar, "encoded");
            C17542s.j(hVar, "logger");
            return new q(cVar, bVar, hVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ q(c cVar, C8533b bVar, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, bVar, hVar);
    }

    private final void o(C8533b bVar, int i10) {
        int i11 = i10 + 1;
        if (i11 < bVar.a() && (bVar.get(i10) & 255) == 128 && (bVar.get(i11) & 255) == 128) {
            p().a("ASN1ObjectIdentifier", "Needlessly long format of SID encoding");
        }
    }

    private final String r(C8533b bVar) {
        int i10;
        char c10;
        char c11;
        int i11;
        C8533b bVar2 = bVar;
        StringBuilder sb2 = new StringBuilder();
        o(bVar2, 0);
        int a10 = bVar.a();
        boolean z10 = true;
        int i12 = 0;
        BigInteger bigInteger = null;
        long j10 = 0;
        while (i12 < a10) {
            byte b10 = bVar2.get(i12);
            if (j10 <= 72057594037927808L) {
                i10 = a10;
                long j11 = j10 + ((long) (b10 & Byte.MAX_VALUE));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        if (j11 < 40) {
                            sb2.append('0');
                        } else {
                            if (j11 < 80) {
                                sb2.append('1');
                                i11 = 40;
                            } else {
                                sb2.append('2');
                                i11 = 80;
                            }
                            j11 -= (long) i11;
                        }
                        c11 = '.';
                        z10 = false;
                    } else {
                        c11 = '.';
                    }
                    sb2.append(c11);
                    sb2.append(j11);
                    o(bVar2, i12 + 1);
                } else {
                    j10 = j11 << 7;
                    i12++;
                    a10 = i10;
                }
            } else {
                i10 = a10;
                if (bigInteger == null) {
                    bigInteger = BigInteger.valueOf(j10);
                }
                C17542s.g(bigInteger);
                BigInteger or2 = bigInteger.or(BigInteger.valueOf((long) (b10 & Byte.MAX_VALUE)));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        sb2.append('2');
                        or2 = or2.subtract(BigInteger.valueOf(80));
                        c10 = '.';
                        z10 = false;
                    } else {
                        c10 = '.';
                    }
                    sb2.append(c10);
                    sb2.append(or2);
                    o(bVar2, i12 + 1);
                    bigInteger = null;
                } else {
                    bigInteger = or2.shiftLeft(7);
                    i12++;
                    a10 = i10;
                }
            }
            j10 = 0;
            i12++;
            a10 = i10;
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }

    /* access modifiers changed from: private */
    public static final String s(q qVar) {
        try {
            return qVar.r(qVar.g());
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new IllegalStateException("End of input reached before message was fully decoded", e10);
        }
    }

    public C8533b g() {
        return this.f54325f;
    }

    public c i() {
        return this.f54324e;
    }

    public h p() {
        return this.f54326g;
    }

    public final String q() {
        return (String) this.f54327h.getValue();
    }

    public String toString() {
        return "OBJECT IDENTIFIER " + q();
    }

    private q(c cVar, C8533b bVar, h hVar) {
        this.f54324e = cVar;
        this.f54325f = bVar;
        this.f54326g = hVar;
        this.f54327h = C16825p.b(new p(this));
    }
}
