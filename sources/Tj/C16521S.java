package TJ;

import SJ.C16428d;
import UJ.C16627t;
import WJ.C16735D;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "value", "LTJ/B;", "a", "(Ljava/lang/Object;)LTJ/B;", "LTJ/P;", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "LTJ/g;", "d", "(LTJ/P;LdI/i;ILSJ/d;)LTJ/g;", "LWJ/D;", "LWJ/D;", "NONE", "b", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.S  reason: case insensitive filesystem */
public final class C16521S {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16735D f138600a = new C16735D("NONE");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C16735D f138601b = new C16735D("PENDING");

    public static final <T> C16505B<T> a(T t10) {
        if (t10 == null) {
            t10 = C16627t.f139163a;
        }
        return new C16520Q(t10);
    }

    public static final <T> C16532g<T> d(C16519P<? extends T> p10, C17168i iVar, int i10, C16428d dVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || dVar != C16428d.DROP_OLDEST) ? C16511H.e(p10, iVar, i10, dVar) : p10;
    }
}
