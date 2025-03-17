package MA;

import Ae.r;
import XH.C16796C;
import YH.X;
import androidx.lifecycle.U;
import com.sugarcube.core.logger.DslKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LMA/e;", "LAe/r;", "<init>", "()V", "", "", "Lkotlin/Function1;", "Landroidx/lifecycle/U;", "a", "()Ljava/util/Map;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: MA.e  reason: case insensitive filesystem */
public final class C13193e implements r {
    /* access modifiers changed from: private */
    public static final String c(U u10) {
        C17542s.j(u10, "handle");
        Object f10 = u10.f("shoppableImageId");
        if (f10 != null) {
            String str = (String) f10;
            Object f11 = u10.f("shoppableImageType");
            if (f11 != null) {
                return "shoppable_image|" + ((String) f11) + DslKt.INDICATOR_SEPARATOR + str;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public Map<String, C17642l<U, String>> a() {
        return X.f(C16796C.a("shoppable_image?shoppableImageId={shoppableImageId}&shoppableImageType={shoppableImageType}", new C13192d()));
    }
}
