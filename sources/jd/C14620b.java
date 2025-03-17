package jD;

import XH.t;
import jD.C14619a;
import kD.C14674a;
import kD.C14675b;
import kD.d;
import kD.e;
import kD.l;
import kD.m;
import kD.n;
import kD.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LjD/b;", "LjD/a;", "<init>", "()V", "LkD/l;", "state", "LjD/a$a;", "a", "(LkD/l;)LjD/a$a;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jD.b  reason: case insensitive filesystem */
public final class C14620b implements C14619a {
    public C14619a.C3153a a(l lVar) {
        C14619a.C3153a.C3154a aVar;
        C17542s.j(lVar, "state");
        if (lVar instanceof e) {
            return C14619a.C3153a.b.f127886a;
        }
        if (lVar instanceof m) {
            return C14619a.C3153a.c.f127887a;
        }
        if (lVar instanceof n) {
            n nVar = (n) lVar;
            String a10 = nVar.a();
            aVar = new C14619a.C3153a.C3154a("UnspecifiedFailure Message: " + a10, nVar.b());
        } else if (lVar instanceof d) {
            d dVar = (d) lVar;
            String b10 = dVar.b();
            String a11 = dVar.a();
            aVar = new C14619a.C3153a.C3154a("HttpFailure Code: " + b10 + " Message: " + a11, (Throwable) null, 2, (DefaultConstructorMarker) null);
        } else if (lVar instanceof p) {
            return new C14619a.C3153a.C3154a("User not logged in", (Throwable) null, 2, (DefaultConstructorMarker) null);
        } else {
            if (lVar instanceof C14674a) {
                return new C14619a.C3153a.C3154a("Email verification needed", (Throwable) null, 2, (DefaultConstructorMarker) null);
            }
            if (lVar instanceof C14675b) {
                aVar = new C14619a.C3153a.C3154a("Unknown failure: " + lVar, (Throwable) null, 2, (DefaultConstructorMarker) null);
            } else {
                throw new t();
            }
        }
        return aVar;
    }
}
