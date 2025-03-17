package hF;

import com.sugarcube.core.analytics.ActionType;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"LhF/d;", "", "Lcom/sugarcube/core/analytics/ActionType;", "type", "<init>", "(Ljava/lang/String;ILcom/sugarcube/core/analytics/ActionType;)V", "Lcom/sugarcube/core/analytics/ActionType;", "b", "()Lcom/sugarcube/core/analytics/ActionType;", "Start", "End", "Exit", "Continue", "Allow", "DontAllow", "GoBack", "KitchenPlanner", "LearnMore", "Next", "Retry", "Selected", "Skip", "Target", "Login", "Signup", "MaybeLater", "GoToRooms", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hF.d  reason: case insensitive filesystem */
public enum C14542d {
    Start(r1),
    End(r2),
    Exit(r2),
    Continue(r2),
    Allow(r2),
    DontAllow(r2),
    GoBack(r2),
    KitchenPlanner(r2),
    LearnMore(r2),
    Next(r2),
    Retry(r2),
    Selected(r1),
    Skip(r1),
    Target(r1),
    Login(r2),
    Signup(r2),
    MaybeLater(r2),
    GoToRooms(r2);
    
    private final ActionType type;

    static {
        C14542d[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C14542d(ActionType actionType) {
        this.type = actionType;
    }

    public final ActionType b() {
        return this.type;
    }
}
