package Qv;

import KJ.C15987c;
import Pv.r;
import Rv.j;
import Rv.m;
import Rv.n;
import Rv.o;
import Vv.l;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LQv/b;", "", "<init>", "()V", "LRv/o;", "state", "LRv/m$b;", "a", "(LRv/o;)LRv/m$b;", "LRv/n$c;", "user", "LRv/m;", "b", "(LRv/o;LRv/n$c;)LRv/m;", "LRv/j;", "c", "(LRv/o;)LRv/j;", "d", "(LRv/o;)LRv/m;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39646a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f39647b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        static {
            /*
                aA.b[] r0 = aA.C13910b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                aA.b r2 = aA.C13910b.GUEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                aA.b r3 = aA.C13910b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                aA.b r4 = aA.C13910b.FAMILY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f39646a = r0
                Rv.l[] r0 = Rv.l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Rv.l r4 = Rv.l.Overview     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                Rv.l r1 = Rv.l.YourHome     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                Rv.l r1 = Rv.l.Settings     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                f39647b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Qv.b.a.<clinit>():void");
        }
    }

    private final m.b a(o oVar) {
        Es.a d10 = oVar.h().d();
        return new m.b(oVar.f(), d10, oVar.k(), oVar.d(), c(oVar), oVar.l());
    }

    private final m b(o oVar, n.c cVar) {
        if (!oVar.n()) {
            return new m.c(oVar.f());
        }
        Es.a d10 = oVar.h().d();
        l f10 = oVar.f();
        C15987c<r> b10 = oVar.h().b();
        return new m.d(f10, oVar.k(), oVar.d(), d10, cVar, oVar.h().c().b(), b10, c(oVar), oVar.l());
    }

    private final j c(o oVar) {
        int i10 = a.f39647b[oVar.i().ordinal()];
        if (i10 == 1) {
            return new j.a(oVar.g().a());
        }
        if (i10 == 2) {
            return new j.c(oVar.e().a());
        }
        if (i10 == 3) {
            return new j.b(oVar.j().a());
        }
        throw new t();
    }

    public final m d(o oVar) {
        C17542s.j(oVar, "state");
        int i10 = a.f39646a[oVar.m().ordinal()];
        if (i10 == 1) {
            return a(oVar);
        }
        if (i10 == 2) {
            return b(oVar, c.b(n.d.f39830d, oVar.h().e()));
        }
        if (i10 == 3) {
            return b(oVar, c.a(n.a.f39824e, oVar.h().e()));
        }
        throw new t();
    }
}
