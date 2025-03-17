package FE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: FE.i  reason: case insensitive filesystem */
public class C12877i {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f109761a = LoggerFactory.getLogger((Class<?>) C12877i.class);

    public static void a(Object obj) {
        if (obj instanceof AutoCloseable) {
            try {
                ((AutoCloseable) obj).close();
            } catch (Exception unused) {
                f109761a.warn("Unexpected exception on trying to close {}.", obj);
            }
        }
    }
}
