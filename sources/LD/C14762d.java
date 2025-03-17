package lD;

import dI.C17164e;
import kD.h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦B¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LlD/d;", "", "", "forceRefresh", "LkD/h;", "a", "(ZLdI/e;)Ljava/lang/Object;", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lD.d  reason: case insensitive filesystem */
public interface C14762d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lD.d$a */
    public static final class a {
        public static /* synthetic */ Object a(C14762d dVar, boolean z10, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                return dVar.a(z10, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object a(boolean z10, C17164e<? super h> eVar);
}
