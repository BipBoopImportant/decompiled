package XH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "LXH/o;", "b", "(LnI/a;)LXH/o;", "LXH/s;", "mode", "a", "(LXH/s;LnI/a;)LXH/o;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/LazyKt")
/* renamed from: XH.q  reason: case insensitive filesystem */
class C16826q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XH.q$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f139809a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                XH.s[] r0 = XH.s.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                XH.s r1 = XH.s.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                XH.s r1 = XH.s.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                XH.s r1 = XH.s.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f139809a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: XH.C16826q.a.<clinit>():void");
        }
    }

    public static <T> C16824o<T> a(s sVar, C17631a<? extends T> aVar) {
        C17542s.j(sVar, "mode");
        C17542s.j(aVar, "initializer");
        int i10 = a.f139809a[sVar.ordinal()];
        if (i10 == 1) {
            return new C16794A(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
        }
        if (i10 == 2) {
            return new z(aVar);
        }
        if (i10 == 3) {
            return new C16808O(aVar);
        }
        throw new t();
    }

    public static <T> C16824o<T> b(C17631a<? extends T> aVar) {
        C17542s.j(aVar, "initializer");
        return new C16794A(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
    }
}
