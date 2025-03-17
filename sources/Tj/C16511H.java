package TJ;

import SJ.C16428d;
import UJ.C16615h;
import WJ.C16735D;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\r\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001d"}, d2 = {"T", "", "replay", "extraBufferCapacity", "LSJ/d;", "onBufferOverflow", "LTJ/A;", "a", "(IILSJ/d;)LTJ/A;", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "LXH/N;", "g", "([Ljava/lang/Object;JLjava/lang/Object;)V", "LTJ/F;", "LdI/i;", "context", "capacity", "LTJ/g;", "e", "(LTJ/F;LdI/i;ILSJ/d;)LTJ/g;", "LWJ/D;", "LWJ/D;", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.H  reason: case insensitive filesystem */
public final class C16511H {

    /* renamed from: a  reason: collision with root package name */
    public static final C16735D f138563a = new C16735D("NO_VALUE");

    public static final <T> C16504A<T> a(int i10, int i11, C16428d dVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        } else if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        } else if (i10 > 0 || i11 > 0 || dVar == C16428d.SUSPEND) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new C16510G(i10, i12, dVar);
        } else {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + dVar).toString());
        }
    }

    public static /* synthetic */ C16504A b(int i10, int i11, C16428d dVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            dVar = C16428d.SUSPEND;
        }
        return a(i10, i11, dVar);
    }

    public static final <T> C16532g<T> e(C16509F<? extends T> f10, C17168i iVar, int i10, C16428d dVar) {
        return ((i10 == 0 || i10 == -3) && dVar == C16428d.SUSPEND) ? f10 : new C16615h(f10, iVar, i10, dVar);
    }

    /* access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
