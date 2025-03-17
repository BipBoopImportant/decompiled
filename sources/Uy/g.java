package uy;

import Ae.r;
import XH.C16796C;
import YH.X;
import androidx.lifecycle.U;
import com.ingka.ikea.room.impl.navigation.RoomRoute;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.O;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luy/g;", "LAe/r;", "<init>", "()V", "", "", "Lkotlin/Function1;", "Landroidx/lifecycle/U;", "a", "()Ljava/util/Map;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements r {
    /* access modifiers changed from: private */
    public static final String c(U u10) {
        C17542s.j(u10, "savedStateHandle");
        String a10 = ((RoomRoute) O.a(u10, P.b(RoomRoute.class), X.j())).a();
        return "room|" + a10;
    }

    public Map<String, C17642l<U, String>> a() {
        return X.f(C16796C.a(r.f58688a.a(P.b(RoomRoute.class)), new f()));
    }
}
