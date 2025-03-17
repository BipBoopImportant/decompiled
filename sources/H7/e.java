package h7;

import HJ.C15838d;
import XH.t;
import e7.C7802i;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r7.C8703e;
import r7.C8706h;
import r7.C8708j;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u0019"}, d2 = {"Lh7/e;", "", "Ljava/security/PublicKey;", "publicKey", "Lh7/d;", "logListVerifier", "Lh7/a;", "logListJsonParser", "<init>", "(Ljava/security/PublicKey;Lh7/d;Lh7/a;)V", "Lr7/j$a;", "rawLogListResult", "Lr7/e$b;", "b", "(Lr7/j$a;)Lr7/e$b;", "Lr7/j$b;", "Lr7/e;", "c", "(Lr7/j$b;)Lr7/e;", "Lr7/j;", "a", "(Lr7/j;)Lr7/e;", "Ljava/security/PublicKey;", "Lh7/d;", "Lh7/a;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final PublicKey f51660a;

    /* renamed from: b  reason: collision with root package name */
    private final d f51661b;

    /* renamed from: c  reason: collision with root package name */
    private final C7937a f51662c;

    public e(PublicKey publicKey, d dVar, C7937a aVar) {
        C17542s.j(publicKey, "publicKey");
        C17542s.j(dVar, "logListVerifier");
        C17542s.j(aVar, "logListJsonParser");
        this.f51660a = publicKey;
        this.f51661b = dVar;
        this.f51662c = aVar;
    }

    private final C8703e.b b(C8708j.a aVar) {
        return aVar instanceof C7802i ? new C8703e.b.d(((C7802i) aVar).a()) : C8703e.b.C0900b.f55747a;
    }

    private final C8703e c(C8708j.b bVar) {
        byte[] a10 = bVar.a();
        C8706h a11 = this.f51661b.a(a10, bVar.b());
        if (a11 instanceof C8706h.b) {
            return this.f51662c.a(new String(a10, C15838d.f135279b));
        }
        if (a11 instanceof C8706h.a) {
            return new C8703e.b.g((C8706h.a) a11);
        }
        throw new t();
    }

    public final C8703e a(C8708j jVar) {
        C17542s.j(jVar, "rawLogListResult");
        if (jVar instanceof C8708j.b) {
            return c((C8708j.b) jVar);
        }
        if (jVar instanceof C8708j.a) {
            return b((C8708j.a) jVar);
        }
        throw new t();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PublicKey publicKey, d dVar, C7937a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(publicKey, (i10 & 2) != 0 ? new d(publicKey) : dVar, (i10 & 4) != 0 ? new c() : aVar);
    }
}
