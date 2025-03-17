package Jf;

import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kK.C17514c;
import kK.C17516e;
import kK.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import mK.C17611d;
import mK.C17612e;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR!\u0010\u0010\u001a\u00020\u000b8FX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, d2 = {"LJf/k;", "", "<init>", "()V", "LmK/d;", "b", "LmK/d;", "a", "()LmK/d;", "getKotlinxSerializationAdapters$annotations", "kotlinxSerializationAdapters", "LkK/c;", "c", "LXH/o;", "()LkK/c;", "getKotlinxSerializationJson$annotations", "kotlinxSerializationJson", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f61305a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final C17611d f61306b;

    /* renamed from: c  reason: collision with root package name */
    private static final C16824o f61307c = C16825p.b(a.f61308c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LkK/c;", "b", "()LkK/c;"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17631a<C17514c> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f61308c = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LkK/e;", "LXH/N;", "invoke", "(LkK/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: Jf.k$a$a  reason: collision with other inner class name */
        static final class C1015a extends C17544u implements C17642l<C17516e, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final C1015a f61309c = new C1015a();

            C1015a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C17516e) obj);
                return C16807N.f139792a;
            }

            public final void invoke(C17516e eVar) {
                C17542s.j(eVar, "$this$Json");
                eVar.k(k.a());
                eVar.e(true);
                eVar.g(true);
                eVar.h(true);
            }
        }

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C17514c invoke() {
            return v.b((C17514c) null, C1015a.f61309c, 1, (Object) null);
        }
    }

    static {
        C17612e eVar = new C17612e();
        eVar.f(P.b(BigDecimal.class), f.f61295a);
        eVar.f(P.b(BigInteger.class), g.f61297a);
        eVar.f(P.b(LocalDate.class), h.f61299a);
        eVar.f(P.b(LocalDateTime.class), i.f61301a);
        eVar.f(P.b(OffsetDateTime.class), j.f61303a);
        eVar.f(P.b(UUID.class), o.f61316a);
        eVar.f(P.b(AtomicInteger.class), d.f61291a);
        eVar.f(P.b(AtomicLong.class), e.f61293a);
        eVar.f(P.b(AtomicBoolean.class), c.f61289a);
        eVar.f(P.b(URI.class), m.f61312a);
        eVar.f(P.b(URL.class), n.f61314a);
        eVar.f(P.b(StringBuilder.class), l.f61310a);
        f61306b = eVar.h();
    }

    private k() {
    }

    public static final C17611d a() {
        return f61306b;
    }

    public static final C17514c b() {
        return (C17514c) f61307c.getValue();
    }
}
