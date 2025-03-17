package Bn;

import PA.C13331a;
import android.content.Context;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import kotlin.Metadata;
import kp.C11519a;
import on.C11687b;
import rx.C15004a;
import x4.C8951o;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004H&¢\u0006\u0004\b)\u0010\u001cJ\u001f\u0010+\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0004H&¢\u0006\u0004\b+\u0010\u001cJ'\u0010-\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000eH&¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H&¢\u0006\u0004\b1\u00102J'\u00105\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00042\u0006\u00104\u001a\u000203H&¢\u0006\u0004\b5\u00106J'\u00109\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"LBn/k;", "", "Lx4/o;", "navController", "", "categoryId", "categoryTitle", "LXH/N;", "m", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "id", "fallbackTitle", "Lon/b$e;", "type", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "k", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Lon/b$e;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "f", "(Lx4/o;)V", "Lkp/a;", "campaign", "Landroid/content/Context;", "context", "n", "(Lx4/o;Lkp/a;Landroid/content/Context;)V", "storyId", "d", "(Lx4/o;Ljava/lang/String;)V", "shoppableImageId", "LPA/a$b;", "j", "(Lx4/o;Ljava/lang/String;LPA/a$b;)V", "", "Lcom/ingka/ikea/core/model/Media;", "images", "", "index", "e", "(Lx4/o;[Lcom/ingka/ikea/core/model/Media;I)V", "listId", "i", "itemNo", "c", "sourceComponent", "g", "(Lx4/o;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "operation", "l", "(Lx4/o;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;)V", "Lrx/a;", "mode", "h", "(Lx4/o;Ljava/lang/String;Lrx/a;)V", "Lcom/ingka/ikea/core/model/Link;", "link", "b", "(Lx4/o;Lcom/ingka/ikea/core/model/Link;Landroid/content/Context;)V", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k {
    void b(C8951o oVar, Link link, Context context);

    void c(C8951o oVar, String str);

    void d(C8951o oVar, String str);

    void e(C8951o oVar, Media[] mediaArr, int i10);

    void f(C8951o oVar);

    void g(C8951o oVar, String str, Interaction$Component interaction$Component);

    void h(C8951o oVar, String str, C15004a aVar);

    void i(C8951o oVar, String str);

    void j(C8951o oVar, String str, C13331a.b bVar);

    void k(C8951o oVar, String str, String str2, C11687b.e eVar, Interaction$Component interaction$Component);

    void l(C8951o oVar, ListPickerNavigation.Operation operation);

    void m(C8951o oVar, String str, String str2);

    void n(C8951o oVar, C11519a aVar, Context context);
}
