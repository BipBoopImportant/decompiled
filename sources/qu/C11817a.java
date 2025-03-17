package qu;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0003\u000b\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lqu/a;", "", "LXH/N;", "c", "()V", "", "nearbyStoreId", "e", "(Ljava/lang/String;)V", "Lqu/a$c;", "disableOrigin", "b", "(Lqu/a$c;)V", "d", "a", "h", "Lqu/a$b;", "dialogType", "f", "(Lqu/a$b;)V", "Lqu/a$a;", "actionType", "g", "(Lqu/a$b;Lqu/a$a;)V", "instore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qu.a  reason: case insensitive filesystem */
public interface C11817a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lqu/a$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "CHANGE_STORE", "DISMISS", "instore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qu.a$a  reason: collision with other inner class name */
    public enum C2422a {
        CHANGE_STORE("change_store"),
        DISMISS("dismiss");
        
        private final String rawValue;

        static {
            C2422a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private C2422a(String str) {
            this.rawValue = str;
        }

        public final String b() {
            return this.rawValue;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lqu/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_STORE", "CHANGE_STORE_CLEAR_SCAN_AND_GO", "instore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qu.a$b */
    public enum b {
        CHANGE_STORE,
        CHANGE_STORE_CLEAR_SCAN_AND_GO;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lqu/a$c;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "AUTOMATIC", "BUTTON", "CHANGED_STORE", "instore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qu.a$c */
    public enum c {
        AUTOMATIC("automatic"),
        BUTTON("used_toggle"),
        CHANGED_STORE("changed_store");
        
        private final String rawValue;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private c(String str) {
            this.rawValue = str;
        }

        public final String b() {
            return this.rawValue;
        }
    }

    void a();

    void b(c cVar);

    void c();

    void d();

    void e(String str);

    void f(b bVar);

    void g(b bVar, C2422a aVar);

    void h();
}
