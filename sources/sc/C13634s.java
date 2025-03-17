package SC;

import XH.t;
import fI.C17221b;
import kotlin.Metadata;
import wK.C18401m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LSC/s;", "", "<init>", "(Ljava/lang/String;I)V", "LwK/m;", "b", "()LwK/m;", "Emphasised", "Subtle", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.s  reason: case insensitive filesystem */
public enum C13634s {
    Emphasised,
    Subtle;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.s$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f116422a = null;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                SC.s[] r0 = SC.C13634s.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.s r1 = SC.C13634s.Emphasised     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.s r1 = SC.C13634s.Subtle     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f116422a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: SC.C13634s.a.<clinit>():void");
        }
    }

    static {
        C13634s[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final C18401m b() {
        int i10 = a.f116422a[ordinal()];
        if (i10 == 1) {
            return C18401m.Emphasised;
        }
        if (i10 == 2) {
            return C18401m.Subtle;
        }
        throw new t();
    }
}
