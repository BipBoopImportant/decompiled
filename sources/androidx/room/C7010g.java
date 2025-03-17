package androidx.room;

import QJ.C16340x0;
import QJ.M;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/room/x;", "LQJ/M;", "a", "(Landroidx/room/x;)LQJ/M;", "b", "transactionDispatcher", "room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.g  reason: case insensitive filesystem */
public final class C7010g {
    public static final M a(x xVar) {
        Map<String, Object> backingFieldMap = xVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = C16340x0.b(xVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (M) obj;
    }

    public static final M b(x xVar) {
        Map<String, Object> backingFieldMap = xVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = C16340x0.b(xVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (M) obj;
    }
}
