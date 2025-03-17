package RH;

import XH.C16824o;
import XH.C16825p;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u001d\u0010\t\u001a\u0004\u0018\u00010\u00058BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b*\n\u0010\u000b\"\u00020\n2\u00020\n¨\u0006\f"}, d2 = {"", "other", "LXH/N;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "Ljava/lang/reflect/Method;", "LXH/o;", "b", "()Ljava/lang/reflect/Method;", "AddSuppressedMethod", "Ljava/io/Closeable;", "Closeable", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final C16824o f137968a = C16825p.b(a.f137969c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Method> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f137969c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final Method invoke() {
            Class<Throwable> cls = Throwable.class;
            try {
                return cls.getMethod("addSuppressed", new Class[]{cls});
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static final void a(Throwable th2, Throwable th3) {
        C17542s.j(th2, "<this>");
        C17542s.j(th3, "other");
        Method b10 = b();
        if (b10 != null) {
            b10.invoke(th2, new Object[]{th3});
        }
    }

    private static final Method b() {
        return (Method) f137968a.getValue();
    }
}
