package QJ;

import XH.t;
import XJ.C16832a;
import XJ.C16833b;
import dI.C17164e;
import dI.C17166g;
import fI.C17221b;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8FX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"LQJ/T;", "", "<init>", "(Ljava/lang/String;I)V", "R", "T", "Lkotlin/Function2;", "LdI/e;", "", "block", "receiver", "completion", "LXH/N;", "b", "(LnI/p;Ljava/lang/Object;LdI/e;)V", "", "j", "()Z", "isLazy$annotations", "()V", "isLazy", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum T {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f137601a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                QJ.T[] r0 = QJ.T.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                QJ.T r1 = QJ.T.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                QJ.T r1 = QJ.T.ATOMIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                QJ.T r1 = QJ.T.UNDISPATCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                QJ.T r1 = QJ.T.LAZY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f137601a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QJ.T.a.<clinit>():void");
        }
    }

    static {
        T[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final <R, T> void b(p<? super R, ? super C17164e<? super T>, ? extends Object> pVar, R r10, C17164e<? super T> eVar) {
        int i10 = a.f137601a[ordinal()];
        if (i10 == 1) {
            C16832a.c(pVar, r10, eVar);
        } else if (i10 == 2) {
            C17166g.b(pVar, r10, eVar);
        } else if (i10 == 3) {
            C16833b.a(pVar, r10, eVar);
        } else if (i10 != 4) {
            throw new t();
        }
    }

    public final boolean j() {
        return this == LAZY;
    }
}
