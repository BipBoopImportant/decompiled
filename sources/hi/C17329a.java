package hI;

import gI.C17267a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LhI/a;", "LgI/a;", "<init>", "()V", "", "version", "", "c", "(I)Z", "", "cause", "exception", "LXH/N;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hI.a  reason: case insensitive filesystem */
public class C17329a extends C17267a {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LhI/a$a;", "", "<init>", "()V", "", "b", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hI.a$a  reason: collision with other inner class name */
    private static final class C3498a {

        /* renamed from: a  reason: collision with root package name */
        public static final C3498a f143417a = new C3498a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f143418b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                    if (num != null && num.intValue() > 0) {
                        num2 = num;
                    }
                    f143418b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f143418b = num2;
        }

        private C3498a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C3498a.f143418b;
        return num == null || num.intValue() >= i10;
    }

    public void a(Throwable th2, Throwable th3) {
        C17542s.j(th2, "cause");
        C17542s.j(th3, "exception");
        if (c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }
}
