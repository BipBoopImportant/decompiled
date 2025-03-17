package zk;

import android.content.Context;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import lm.C11550a;
import x4.C8951o;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001/J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010(J7\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010\u000bJ\u001f\u0010/\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b/\u0010-J\u001f\u00101\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0004H&¢\u0006\u0004\b1\u0010-J\u0017\u00102\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b2\u0010\u000bJ\u0017\u00103\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b3\u0010\u000bJ'\u00106\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020 H&¢\u0006\u0004\b6\u00107J'\u0010<\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H&¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lzk/b;", "", "Lx4/o;", "navController", "", "itemNo", "requestKey", "LXH/N;", "i", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "l", "(Lx4/o;)V", "g", "LDe/a;", "sourceComponent", "f", "(Lx4/o;Ljava/lang/String;LDe/a;)V", "id", "fallbackTitle", "", "includedItemNos", "e", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "productName", "", "quantity", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "p", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "division", "storeId", "", "fromProductModal", "q", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Llm/a$c;", "fulfilmentOption", "itemType", "k", "(Lx4/o;Llm/a$c;Ljava/lang/String;Ljava/lang/String;)V", "productTitle", "m", "(Lx4/o;Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "c", "(Lx4/o;Ljava/lang/String;)V", "d", "a", "inspirationId", "o", "n", "h", "listId", "selectInStoreMode", "j", "(Lx4/o;Ljava/lang/String;Z)V", "Lcom/ingka/ikea/core/model/Link;", "link", "Landroid/content/Context;", "context", "b", "(Lx4/o;Lcom/ingka/ikea/core/model/Link;Landroid/content/Context;)V", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zk.b  reason: case insensitive filesystem */
public interface C12529b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzk/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "SALES", "DISPLAY", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zk.b$a */
    public enum a {
        SALES,
        DISPLAY;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    void a(C8951o oVar, String str);

    void b(C8951o oVar, Link link, Context context);

    void c(C8951o oVar, String str);

    void d(C8951o oVar);

    void e(C8951o oVar, String str, String str2, List<String> list);

    void f(C8951o oVar, String str, De.a aVar);

    void g(C8951o oVar);

    void h(C8951o oVar);

    void i(C8951o oVar, String str, String str2);

    void j(C8951o oVar, String str, boolean z10);

    void k(C8951o oVar, C11550a.c cVar, String str, String str2);

    void l(C8951o oVar);

    void m(C8951o oVar, C11550a.c cVar, String str, String str2, String str3);

    void n(C8951o oVar);

    void o(C8951o oVar, String str);

    void p(C8951o oVar, String str, String str2, int i10, String str3, Interaction$Component interaction$Component);

    void q(C8951o oVar, String str, String str2, String str3, boolean z10);
}
