package dC;

import IB.C13018a;
import IC.C13023e;
import IC.C13026h;
import SB.C13561a;
import TB.C13677a;
import XH.t;
import YH.C16877v;
import gC.C14508a;
import gC.C14509b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LdC/a;", "LgC/a;", "LgC/b;", "openingHoursLabelMapper", "<init>", "(LgC/b;)V", "LIB/a$a$a;", "storeOpeningHours", "LgC/a$a;", "c", "(LIB/a$a$a;)LgC/a$a;", "b", "domainOpeningHours", "a", "LgC/b;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dC.a  reason: case insensitive filesystem */
public final class C14337a implements C14508a {

    /* renamed from: a  reason: collision with root package name */
    private final C14509b f126183a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dC.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C3082a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f126184a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                gC.b$a$a[] r0 = gC.C14509b.a.C3118a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                gC.b$a$a r1 = gC.C14509b.a.C3118a.CLOSED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                gC.b$a$a r1 = gC.C14509b.a.C3118a.OPENS_SOON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f126184a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dC.C14337a.C3082a.<clinit>():void");
        }
    }

    public C14337a(C14509b bVar) {
        C17542s.j(bVar, "openingHoursLabelMapper");
        this.f126183a = bVar;
    }

    private final C14508a.C3116a b(C13018a.C2677a.C2678a aVar) {
        C13023e eVar;
        C13023e eVar2;
        C14508a.C3116a.C3117a aVar2;
        C14509b.a a10 = this.f126183a.a(aVar);
        C14509b.a.C3118a aVar3 = null;
        C14509b.a.C3118a b10 = a10 != null ? a10.b() : null;
        int i10 = b10 == null ? -1 : C3082a.f126184a[b10.ordinal()];
        if (i10 == -1 || i10 == 1) {
            eVar = C13026h.a(C13561a.f115643f);
        } else if (i10 == 2) {
            eVar = C13026h.a(C13561a.f115650m);
        } else {
            throw new t();
        }
        int i11 = C13677a.f116660a;
        if (a10 == null || (eVar2 = a10.a()) == null) {
            eVar2 = C13026h.c("");
        }
        C13023e e10 = C13026h.e(i11, C16877v.q(eVar, eVar2));
        if (a10 != null) {
            aVar3 = a10.b();
        }
        int i12 = aVar3 == null ? -1 : C3082a.f126184a[aVar3.ordinal()];
        if (i12 == -1 || i12 == 1) {
            aVar2 = C14508a.C3116a.C3117a.CLOSED;
        } else if (i12 == 2) {
            aVar2 = C14508a.C3116a.C3117a.OPENS_SOON;
        } else {
            throw new t();
        }
        return new C14508a.C3116a(e10, eVar, aVar2);
    }

    private final C14508a.C3116a c(C13018a.C2677a.C2678a aVar) {
        C13023e a10 = C13026h.a(C13561a.f115645h);
        int i10 = C13561a.f115646i;
        String a11 = aVar.a();
        if (a11 == null) {
            a11 = "";
        }
        return new C14508a.C3116a(C13026h.e(C13677a.f116660a, C16877v.q(a10, C13026h.b(i10, a11))), a10, C14508a.C3116a.C3117a.OPEN);
    }

    public C14508a.C3116a a(C13018a.C2677a.C2678a aVar) {
        C17542s.j(aVar, "domainOpeningHours");
        return C17542s.e(aVar.e(), Boolean.TRUE) ? c(aVar) : b(aVar);
    }
}
