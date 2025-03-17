package iI;

import hI.C17329a;
import kotlin.Metadata;
import rI.C17853c;
import sI.C17904a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LiI/a;", "LhI/a;", "<init>", "()V", "", "version", "", "c", "(I)Z", "LrI/c;", "b", "()LrI/c;", "a", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iI.a  reason: case insensitive filesystem */
public class C17360a extends C17329a {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LiI/a$a;", "", "<init>", "()V", "", "b", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iI.a$a  reason: collision with other inner class name */
    private static final class C3503a {

        /* renamed from: a  reason: collision with root package name */
        public static final C3503a f143496a = new C3503a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f143497b;

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
                    f143497b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f143497b = num2;
        }

        private C3503a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C3503a.f143497b;
        return num == null || num.intValue() >= i10;
    }

    public C17853c b() {
        return c(34) ? new C17904a() : super.b();
    }
}
