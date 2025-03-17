package Pt;

import It.C10749l;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0001\u0019J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"LPt/a;", "", "", "storeId", "eventId", "LPt/a$a;", "location", "LXH/N;", "d", "(Ljava/lang/String;Ljava/lang/String;LPt/a$a;)V", "LIt/l$h$a;", "origin", "b", "(Ljava/lang/String;LIt/l$h$a;)V", "f", "()V", "h", "(Ljava/lang/String;)V", "e", "", "isSuccess", "g", "(Ljava/lang/String;Z)V", "isConfirmationStep", "c", "a", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LPt/a$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "CAROUSEL_INSTORE_PAGE", "STORE_EVENT_LIST_PAGE", "STORE_EVENT", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pt.a$a  reason: collision with other inner class name */
    public enum C1743a {
        CAROUSEL_INSTORE_PAGE("store_event_carousel_instore_page"),
        STORE_EVENT_LIST_PAGE("store_event_list_page"),
        STORE_EVENT("store_event");
        
        private final String rawValue;

        static {
            C1743a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private C1743a(String str) {
            this.rawValue = str;
        }

        public final String b() {
            return this.rawValue;
        }
    }

    void a(String str, boolean z10);

    void b(String str, C10749l.h.a aVar);

    void c(String str, boolean z10);

    void d(String str, String str2, C1743a aVar);

    void e(String str);

    void f();

    void g(String str, boolean z10);

    void h(String str);
}
