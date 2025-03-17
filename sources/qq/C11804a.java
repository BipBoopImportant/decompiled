package qq;

import Lg.a;
import Lg.d;
import XH.C16807N;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.product.TechnicalCompliance;
import iq.C11412b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mq.b;
import mq.e;
import mq.f;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lqq/a;", "", "a", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qq.a  reason: case insensitive filesystem */
public final class C11804a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2420a f101922a = new C2420a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqq/a$a;", "", "<init>", "()V", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "technicalInformation", "Lkotlin/Function1;", "", "LXH/N;", "onProductSheetClicked", "Lkotlin/Function2;", "", "Lcom/ingka/ikea/core/model/Image;", "", "onEnergyLabelClicked", "Liq/b;", "viewFilter", "LLg/d;", "a", "(Lcom/ingka/ikea/core/model/product/TechnicalCompliance;LnI/l;LnI/p;Liq/b;)LLg/d;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qq.a$a  reason: collision with other inner class name */
    public static final class C2420a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qq.a$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2421a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f101923a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    iq.b[] r0 = iq.C11412b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    iq.b r1 = iq.C11412b.ALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    iq.b r1 = iq.C11412b.ENERGY_LABEL     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f101923a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: qq.C11804a.C2420a.C2421a.<clinit>():void");
            }
        }

        public /* synthetic */ C2420a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ d b(C2420a aVar, TechnicalCompliance technicalCompliance, C17642l lVar, p pVar, C11412b bVar, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                bVar = C11412b.ALL;
            }
            return aVar.a(technicalCompliance, lVar, pVar, bVar);
        }

        public final d a(TechnicalCompliance technicalCompliance, C17642l<? super String, C16807N> lVar, p<? super Image[], ? super Integer, C16807N> pVar, C11412b bVar) {
            C17542s.j(technicalCompliance, "technicalInformation");
            C17542s.j(lVar, "onProductSheetClicked");
            C17542s.j(pVar, "onEnergyLabelClicked");
            C17542s.j(bVar, "viewFilter");
            ArrayList arrayList = new ArrayList();
            int i10 = C2421a.f101923a[bVar.ordinal()];
            if (i10 == 1) {
                if (!technicalCompliance.b().isEmpty()) {
                    C11809f.h(arrayList, (Image[]) technicalCompliance.b().toArray(new Image[0]), pVar);
                }
                C11809f.l(arrayList, technicalCompliance.c(), lVar);
                C11809f.n(arrayList, technicalCompliance.d());
            } else if (i10 != 2) {
                C11809f.n(arrayList, technicalCompliance.d());
            } else if (!technicalCompliance.b().isEmpty()) {
                C11809f.h(arrayList, (Image[]) technicalCompliance.b().toArray(new Image[0]), pVar);
            } else {
                C11809f.n(arrayList, technicalCompliance.d());
            }
            d dVar = new d((a<?>[]) new a[]{new mq.d(), new b(), new e(), new f()});
            d.q(dVar, arrayList, false, (C17642l) null, 6, (Object) null);
            return dVar;
        }

        private C2420a() {
        }
    }
}
