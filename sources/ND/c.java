package Nd;

import Nd.a;
import YH.X;
import fI.C17221b;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\"J)\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJC\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\fH&¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0014H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0001H&¢\u0006\u0004\b \u0010!¨\u0006#"}, d2 = {"LNd/c;", "", "LNd/a$a;", "T", "LNd/a;", "abTest", "", "bucketUser", "c", "(LNd/a;Z)LNd/a$a;", "", "eventName", "", "customAttributes", "eventTags", "LXH/N;", "f", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "", "totalPrice", "", "uniqueItemsSold", "transactionId", "LNd/c$b;", "purchaseMethod", "a", "(DILjava/lang/String;LNd/c$b;)V", "value", "e", "(Ljava/lang/String;I)V", "LNd/b;", "parameter", "d", "(LNd/b;Ljava/lang/Object;)V", "b", "abtesting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(c cVar, String str, Map map, Map map2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    map = X.j();
                }
                if ((i10 & 4) != 0) {
                    map2 = X.j();
                }
                cVar.f(str, map, map2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LNd/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "ONLINE", "SHOP_GO", "abtesting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        ONLINE,
        SHOP_GO;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    void a(double d10, int i10, String str, b bVar);

    <T extends a.C1042a> T c(a aVar, boolean z10);

    void d(b bVar, Object obj);

    void e(String str, int i10);

    void f(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2);
}
