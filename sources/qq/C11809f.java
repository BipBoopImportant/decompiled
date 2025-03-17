package qq;

import HJ.C15854t;
import XH.C16807N;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.product.InformationValue;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import nq.C11665a;
import nq.C11666b;
import nq.C11667c;
import nq.C11668d;
import nq.C11669e;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000@\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\t\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0010\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "Lnq/d;", "", "Lcom/ingka/ikea/core/model/Image;", "images", "Lkotlin/Function2;", "", "LXH/N;", "onEnergyLabelClicked", "h", "(Ljava/util/List;[Lcom/ingka/ikea/core/model/Image;LnI/p;)V", "Lcom/ingka/ikea/core/model/Link;", "infoSheet", "Lkotlin/Function1;", "", "onProductSheetClicked", "l", "(Ljava/util/List;Lcom/ingka/ikea/core/model/Link;LnI/l;)V", "", "Lcom/ingka/ikea/core/model/product/InformationValue;", "infoValues", "n", "(Ljava/util/List;Ljava/util/List;)V", "energylabel-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: qq.f  reason: case insensitive filesystem */
public final class C11809f {
    /* access modifiers changed from: private */
    public static final void h(List<C11668d> list, Image[] imageArr, p<? super Image[], ? super Integer, C16807N> pVar) {
        if (imageArr.length > 1) {
            list.add(new C11665a(new C11666b(imageArr[0].getUrl(), imageArr[0].A0(), new C11805b(pVar, imageArr)), new C11666b(imageArr[1].getUrl(), imageArr[1].A0(), new C11806c(pVar, imageArr))));
        } else if (imageArr.length == 1) {
            list.add(new C11666b(imageArr[0].getUrl(), imageArr[0].A0(), new C11807d(pVar, imageArr)));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Empty array of images, should not happen");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = list.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, illegalStateException, str);
                str2 = str3;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(p pVar, Image[] imageArr) {
        pVar.invoke(imageArr, 0);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(p pVar, Image[] imageArr) {
        pVar.invoke(imageArr, 1);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(p pVar, Image[] imageArr) {
        pVar.invoke(imageArr, 0);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void l(List<C11668d> list, Link link, C17642l<? super String, C16807N> lVar) {
        if (link != null) {
            String d10 = link.d();
            if (d10 == null) {
                d10 = "";
            }
            list.add(new C11667c(d10, link.e(), (String) null, new C11808e(lVar, link), 4, (DefaultConstructorMarker) null));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar, Link link) {
        lVar.invoke(link.e());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void n(List<C11668d> list, List<InformationValue> list2) {
        for (InformationValue informationValue : list2) {
            list.add(new C11669e(informationValue.a(), informationValue.b()));
        }
    }
}
