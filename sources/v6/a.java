package V6;

import XH.C16824o;
import XH.C16825p;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001b\u0010\u0007\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "a", "()J", "Ljava/text/SimpleDateFormat;", "LXH/o;", "getSimpleDateFormat", "()Ljava/text/SimpleDateFormat;", "simpleDateFormat", "apollo-mpp-utils"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final C16824o f40453a = C16825p.b(C0665a.f40454c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "b", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: V6.a$a  reason: collision with other inner class name */
    static final class C0665a extends C17544u implements C17631a<SimpleDateFormat> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0665a f40454c = new C0665a();

        C0665a() {
            super(0);
        }

        /* renamed from: b */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("HH:mm:ss.SSS", Locale.ROOT);
        }
    }

    public static final long a() {
        return System.currentTimeMillis();
    }
}
