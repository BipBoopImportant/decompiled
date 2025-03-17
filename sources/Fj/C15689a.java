package FJ;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

/* renamed from: FJ.a  reason: case insensitive filesystem */
public final class C15689a {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<C17631a<?>, Object> f134405a = new ConcurrentHashMap<>();

    public static final Void a(String str) {
        C17542s.j(str, "message");
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void b(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}
