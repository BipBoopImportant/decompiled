package QJ;

import WJ.C16735D;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "LWJ/D;", "a", "LWJ/D;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", "d", "TOO_LATE_TO_CANCEL", "e", "SEALED", "LQJ/n0;", "f", "LQJ/n0;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class M0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16735D f137586a = new C16735D("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final C16735D f137587b = new C16735D("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C16735D f137588c = new C16735D("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C16735D f137589d = new C16735D("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C16735D f137590e = new C16735D("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C16321n0 f137591f = new C16321n0(false);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C16321n0 f137592g = new C16321n0(true);

    public static final Object g(Object obj) {
        return obj instanceof A0 ? new B0((A0) obj) : obj;
    }

    public static final Object h(Object obj) {
        A0 a02;
        B0 b02 = obj instanceof B0 ? (B0) obj : null;
        return (b02 == null || (a02 = b02.f137553a) == null) ? obj : a02;
    }
}
