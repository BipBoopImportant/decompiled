package bK;

import WJ.C16735D;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u001a"}, d2 = {"", "permits", "acquiredPermits", "LbK/h;", "a", "(II)LbK/h;", "", "id", "LbK/m;", "prev", "j", "(JLbK/m;)LbK/m;", "I", "MAX_SPIN_CYCLES", "LWJ/D;", "b", "LWJ/D;", "PERMIT", "c", "TAKEN", "d", "BROKEN", "e", "CANCELLED", "f", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final int f141217a = C16738G.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C16735D f141218b = new C16735D("PERMIT");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C16735D f141219c = new C16735D("TAKEN");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C16735D f141220d = new C16735D("BROKEN");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C16735D f141221e = new C16735D("CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f141222f = C16738G.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    public static final h a(int i10, int i11) {
        return new k(i10, i11);
    }

    public static /* synthetic */ h b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    /* access modifiers changed from: private */
    public static final m j(long j10, m mVar) {
        return new m(j10, mVar, 0);
    }
}
