package WJ;

import WJ.C16732A;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0001\u0004\u0001\u0004\u0018\u00010\u0003¨\u0006\u0010"}, d2 = {"LWJ/B;", "LWJ/A;", "S", "", "value", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "(Ljava/lang/Object;)Z", "isClosed", "b", "(Ljava/lang/Object;)LWJ/A;", "getSegment$annotations", "()V", "segment", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C17604b
/* renamed from: WJ.B  reason: case insensitive filesystem */
public final class C16733B<S extends C16732A<S>> {
    public static <S extends C16732A<S>> Object a(Object obj) {
        return obj;
    }

    public static final S b(Object obj) {
        if (obj != C16740a.f139544a) {
            C17542s.h(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (C16732A) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean c(Object obj) {
        return obj == C16740a.f139544a;
    }
}
