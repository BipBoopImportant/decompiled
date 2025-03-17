package Fh;

import A0.g;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.i1;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LFh/b;", "", "<init>", "()V", "LGh/a;", "framing", "Lp1/i1;", "a", "(LGh/a;)Lp1/i1;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f60509a = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60510a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Gh.a[] r0 = Gh.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Gh.a r1 = Gh.a.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Gh.a r1 = Gh.a.HOUSE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Gh.a r1 = Gh.a.HALF_PILL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Gh.a r1 = Gh.a.SQUARE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Gh.a r1 = Gh.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f60510a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Fh.b.a.<clinit>():void");
        }
    }

    private b() {
    }

    public final i1 a(Gh.a aVar) {
        C17542s.j(aVar, "framing");
        int i10 = a.f60510a[aVar.ordinal()];
        if (i10 == 1) {
            return g.h();
        }
        if (i10 == 2) {
            return new a();
        }
        if (i10 == 3) {
            return g.d(100, 100, 0, 0, 12, (Object) null);
        }
        if (i10 == 4) {
            return g.a(0);
        }
        if (i10 == 5) {
            return g.h();
        }
        throw new t();
    }
}
