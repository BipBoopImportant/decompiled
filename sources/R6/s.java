package r6;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\fJ3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lr6/s;", "", "", "tag", "Lr6/s$a;", "level", "message", "", "throwable", "LXH/N;", "b", "(Ljava/lang/String;Lr6/s$a;Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "()Lr6/s$a;", "setMinLevel", "(Lr6/s$a;)V", "minLevel", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lr6/s$a;", "", "<init>", "(Ljava/lang/String;I)V", "Verbose", "Debug", "Info", "Warn", "Error", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        Verbose,
        Debug,
        Info,
        Warn,
        Error;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    a a();

    void b(String str, a aVar, String str2, Throwable th2);
}
