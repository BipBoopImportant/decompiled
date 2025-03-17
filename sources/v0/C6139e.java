package v0;

import W0.b;
import kotlin.Metadata;
import v0.C6138d;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "LW0/b;", "Lv0/d$a;", "", "itemIndex", "b", "(LW0/b;I)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.e  reason: case insensitive filesystem */
public final class C6139e {
    /* access modifiers changed from: private */
    public static final <T> int b(b<C6138d.a<T>> bVar, int i10) {
        int r10 = bVar.r() - 1;
        int i11 = 0;
        while (i11 < r10) {
            int i12 = ((r10 - i11) / 2) + i11;
            int b10 = ((C6138d.a) bVar.q()[i12]).b();
            if (b10 == i10) {
                return i12;
            }
            if (b10 < i10) {
                i11 = i12 + 1;
                if (i10 < ((C6138d.a) bVar.q()[i11]).b()) {
                    return i12;
                }
            } else {
                r10 = i12 - 1;
            }
        }
        return i11;
    }
}
