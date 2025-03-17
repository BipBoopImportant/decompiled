package Cn;

import Cn.i;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vn.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvn/g;", "selectedToggle", "", "allowSwipeImageNudge", "LCn/i;", "a", "(Lvn/g;Z)LCn/i;", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f79614a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                vn.g[] r0 = vn.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                vn.g r1 = vn.g.SINGLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                vn.g r1 = vn.g.MULTI     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f79614a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Cn.j.a.<clinit>():void");
        }
    }

    public static final i a(g gVar, boolean z10) {
        C17542s.j(gVar, "selectedToggle");
        int i10 = a.f79614a[gVar.ordinal()];
        if (i10 == 1) {
            return i.c.f79613a;
        }
        if (i10 == 2) {
            return z10 ? i.b.f79612a : i.a.f79611a;
        }
        throw new t();
    }
}
