package iz;

import YH.C16877v;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.AddToCartButtonDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.AvailabilityCardDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.AvailabilityNoticeDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.AvailabilityWarningDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemNoticeDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationSectionDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FullServeNoticeDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardProductDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShopAndGoImageDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShopAndGoItemReferenceDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShopAndGoOptionDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShopAndGoOptionValueDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel;
import gz.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15008a;
import rz.C15011d;
import rz.C15012e;
import rz.C15013f;
import rz.C15016i;
import rz.C15017j;
import rz.C15024q;
import rz.C15025s;
import rz.C15026t;
import rz.C15027u;
import rz.Q;
import rz.S;
import rz.T;
import rz.V;
import rz.Y;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\bH\u0002¢\u0006\u0004\b \u0010\rJ\u0015\u0010#\u001a\u00020\"*\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020+*\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020/*\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u000203*\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u000207*\u0004\u0018\u000106H\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u00020;*\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J'\u0010B\u001a\u00020A2\b\u0010\u0014\u001a\u0004\u0018\u00010>2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\bH\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010H\u001a\u00020G2\u0006\u0010\u0014\u001a\u00020D2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bH\u0010IJ\u0013\u0010L\u001a\u00020K*\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010P\u001a\u00020O*\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ%\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\b2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010\bH\u0002¢\u0006\u0004\bU\u0010\rJ'\u0010X\u001a\u00020E2\b\u0010W\u001a\u0004\u0018\u00010V2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\bH\u0002¢\u0006\u0004\bX\u0010YJ;\u0010]\u001a\u00020\\2\u0006\u0010W\u001a\u00020V2\u0006\u0010Z\u001a\u00020V2\u0006\u0010F\u001a\u00020E2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\b2\u0006\u0010[\u001a\u00020N¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010_R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010`¨\u0006a"}, d2 = {"Liz/m;", "", "Liz/r;", "stockInfoMapper", "Liz/g;", "salesLocationMapper", "<init>", "(Liz/r;Liz/g;)V", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoImageDataModel;", "images", "Lrz/Q;", "e", "(Ljava/util/List;)Ljava/util/List;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "info", "Lrz/Y;", "q", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;)Lrz/Y;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "model", "Lrz/t;", "k", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;)Lrz/t;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoOptionDataModel;", "variant", "Lrz/V;", "p", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoOptionDataModel;)Lrz/V;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoOptionValueDataModel;", "options", "Lrz/T;", "s", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/BuyingInstructionSectionDataModel;", "Lrz/s;", "j", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/BuyingInstructionSectionDataModel;)Lrz/s;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoItemReferenceDataModel;", "reference", "Lrz/S;", "l", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoItemReferenceDataModel;)Lrz/S;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/FullServeNoticeDataModel;", "Lrz/q;", "i", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/FullServeNoticeDataModel;)Lrz/q;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemNoticeDataModel;", "Lrz/j;", "g", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemNoticeDataModel;)Lrz/j;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AvailabilityNoticeDataModel;", "Lrz/e;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AvailabilityNoticeDataModel;)Lrz/e;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AvailabilityWarningDataModel;", "Lrz/f;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AvailabilityWarningDataModel;)Lrz/f;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AvailabilityCardDataModel;", "Lrz/d;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AvailabilityCardDataModel;)Lrz/d;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemPresentationDataModel;", "Lgz/c;", "itemsInCart", "Lrz/i;", "h", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemPresentationDataModel;Ljava/util/List;)Lrz/i;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemPresentationSectionDataModel;", "", "quantityInCart", "Lrz/h;", "f", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemPresentationSectionDataModel;I)Lrz/h;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel;", "Lrz/a;", "r", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel;)Lrz/a;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "Lrz/v;", "n", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;)Lrz/v;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/MustHaveCardProductDataModel;", "items", "Lrz/u;", "m", "", "barcode", "o", "(Ljava/lang/String;Ljava/util/List;)I", "price", "response", "Lrz/I;", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;)Lrz/I;", "Liz/r;", "Liz/g;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.m  reason: case insensitive filesystem */
public final class C14599m {

    /* renamed from: a  reason: collision with root package name */
    private final C14604r f127782a;

    /* renamed from: b  reason: collision with root package name */
    private final C14593g f127783b;

    public C14599m(C14604r rVar, C14593g gVar) {
        C17542s.j(rVar, "stockInfoMapper");
        C17542s.j(gVar, "salesLocationMapper");
        this.f127782a = rVar;
        this.f127783b = gVar;
    }

    private final C15011d b(AvailabilityCardDataModel availabilityCardDataModel) {
        String str = null;
        String b10 = availabilityCardDataModel != null ? availabilityCardDataModel.b() : null;
        if (availabilityCardDataModel != null) {
            str = availabilityCardDataModel.a();
        }
        return (b10 == null || b10.length() == 0 || str == null || str.length() == 0) ? C15011d.a.f130831a : new C15011d.b(b10, str);
    }

    private final C15012e c(AvailabilityNoticeDataModel availabilityNoticeDataModel) {
        String a10;
        if (!(availabilityNoticeDataModel == null || (a10 = availabilityNoticeDataModel.a()) == null)) {
            C15012e aVar = a10.length() == 0 ? C15012e.b.f130835a : new C15012e.a(a10);
            if (aVar != null) {
                return aVar;
            }
        }
        return C15012e.b.f130835a;
    }

    private final C15013f d(AvailabilityWarningDataModel availabilityWarningDataModel) {
        String a10;
        if (!(availabilityWarningDataModel == null || (a10 = availabilityWarningDataModel.a()) == null)) {
            C15013f aVar = a10.length() == 0 ? C15013f.b.f130837a : new C15013f.a(a10);
            if (aVar != null) {
                return aVar;
            }
        }
        return C15013f.b.f130837a;
    }

    private final List<Q> e(List<ShopAndGoImageDataModel> list) {
        Iterable<ShopAndGoImageDataModel> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ShopAndGoImageDataModel shopAndGoImageDataModel : iterable) {
            String b10 = shopAndGoImageDataModel.b();
            if (b10 != null) {
                String a10 = shopAndGoImageDataModel.a();
                if (a10 != null) {
                    arrayList.add(new Q(b10, a10));
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final rz.C15015h f(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationSectionDataModel r13, int r14) {
        /*
            r12 = this;
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r0 = r13.a()
            r1 = 0
            if (r0 == 0) goto L_0x0013
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r0 = r0.e()
            if (r0 == 0) goto L_0x0013
            rz.w r0 = rz.C15030x.a(r0)
            r4 = r0
            goto L_0x0014
        L_0x0013:
            r4 = r1
        L_0x0014:
            if (r4 == 0) goto L_0x00ad
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r0 = r13.a()
            if (r0 == 0) goto L_0x0021
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel r0 = r0.i()
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            if (r0 == 0) goto L_0x00a5
            rz.Y r5 = r12.q(r0)
            rz.h r0 = new rz.h
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r2 = r13.a()
            if (r2 == 0) goto L_0x0036
            java.lang.String r2 = r2.c()
            r3 = r2
            goto L_0x0037
        L_0x0036:
            r3 = r1
        L_0x0037:
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x009f
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r6 = r13.a()
            if (r6 == 0) goto L_0x0046
            java.lang.String r6 = r6.b()
            goto L_0x0047
        L_0x0046:
            r6 = r1
        L_0x0047:
            if (r6 == 0) goto L_0x0099
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r7 = r13.a()
            if (r7 == 0) goto L_0x0054
            java.lang.Integer r7 = r7.g()
            goto L_0x0055
        L_0x0054:
            r7 = r1
        L_0x0055:
            if (r7 == 0) goto L_0x0093
            int r7 = r7.intValue()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r8 = r13.a()
            if (r8 == 0) goto L_0x0066
            java.lang.Integer r8 = r8.d()
            goto L_0x0067
        L_0x0066:
            r8 = r1
        L_0x0067:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r14 = r13.a()
            if (r14 == 0) goto L_0x0077
            java.lang.String r14 = r14.a()
            r10 = r14
            goto L_0x0078
        L_0x0077:
            r10 = r1
        L_0x0078:
            if (r10 == 0) goto L_0x008d
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r13 = r13.a()
            if (r13 == 0) goto L_0x0084
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel r1 = r13.h()
        L_0x0084:
            rz.t r11 = r12.k(r1)
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x008d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r2)
            throw r13
        L_0x0093:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r2)
            throw r13
        L_0x0099:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r2)
            throw r13
        L_0x009f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r2)
            throw r13
        L_0x00a5:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Stock info for combination item is null"
            r13.<init>(r14)
            throw r13
        L_0x00ad:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Product info for combination item is null"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: iz.C14599m.f(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationSectionDataModel, int):rz.h");
    }

    private final C15017j g(ChildItemNoticeDataModel childItemNoticeDataModel) {
        String a10;
        if (!(childItemNoticeDataModel == null || (a10 = childItemNoticeDataModel.a()) == null)) {
            C15017j aVar = a10.length() == 0 ? C15017j.b.f130861a : new C15017j.a(a10);
            if (aVar != null) {
                return aVar;
            }
        }
        return C15017j.b.f130861a;
    }

    private final C15016i h(ChildItemPresentationDataModel childItemPresentationDataModel, List<c> list) {
        List list2;
        List list3;
        Collection c10;
        if (childItemPresentationDataModel == null) {
            return C15016i.b.f130859a;
        }
        Collection b10 = childItemPresentationDataModel.b();
        if ((b10 == null || b10.isEmpty()) && ((c10 = childItemPresentationDataModel.c()) == null || c10.isEmpty())) {
            return C15016i.b.f130859a;
        }
        List<ChildItemPresentationSectionDataModel> b11 = childItemPresentationDataModel.b();
        if (b11 != null) {
            Iterable<ChildItemPresentationSectionDataModel> iterable = b11;
            list2 = new ArrayList(C16877v.y(iterable, 10));
            for (ChildItemPresentationSectionDataModel childItemPresentationSectionDataModel : iterable) {
                ChildItemProductCardDataModel a10 = childItemPresentationSectionDataModel.a();
                list2.add(f(childItemPresentationSectionDataModel, o(a10 != null ? a10.c() : null, list)));
            }
        } else {
            list2 = C16877v.n();
        }
        List<ChildItemPresentationSectionDataModel> c11 = childItemPresentationDataModel.c();
        if (c11 != null) {
            Iterable<ChildItemPresentationSectionDataModel> iterable2 = c11;
            list3 = new ArrayList(C16877v.y(iterable2, 10));
            for (ChildItemPresentationSectionDataModel childItemPresentationSectionDataModel2 : iterable2) {
                ChildItemProductCardDataModel a11 = childItemPresentationSectionDataModel2.a();
                list3.add(f(childItemPresentationSectionDataModel2, o(a11 != null ? a11.c() : null, list)));
            }
        } else {
            list3 = C16877v.n();
        }
        return new C15016i.a(list2, list3);
    }

    private final C15024q i(FullServeNoticeDataModel fullServeNoticeDataModel) {
        String a10;
        if (!(fullServeNoticeDataModel == null || (a10 = fullServeNoticeDataModel.a()) == null)) {
            C15024q aVar = a10.length() == 0 ? C15024q.b.f130883a : new C15024q.a(a10);
            if (aVar != null) {
                return aVar;
            }
        }
        return C15024q.b.f130883a;
    }

    private final C15025s j(BuyingInstructionSectionDataModel buyingInstructionSectionDataModel) {
        AvailabilityCardDataModel availabilityCardDataModel = null;
        C15012e c10 = c(buyingInstructionSectionDataModel != null ? buyingInstructionSectionDataModel.b() : null);
        C15013f d10 = d(buyingInstructionSectionDataModel != null ? buyingInstructionSectionDataModel.c() : null);
        if (buyingInstructionSectionDataModel != null) {
            availabilityCardDataModel = buyingInstructionSectionDataModel.a();
        }
        return new C15025s(c10, d10, b(availabilityCardDataModel));
    }

    private final C15026t k(SalesLocationDataModel salesLocationDataModel) {
        return this.f127783b.a(salesLocationDataModel);
    }

    private final S l(ShopAndGoItemReferenceDataModel shopAndGoItemReferenceDataModel) {
        String a10 = shopAndGoItemReferenceDataModel.a();
        if (a10 != null) {
            Integer b10 = shopAndGoItemReferenceDataModel.b();
            if (b10 != null) {
                return new S(a10, b10.intValue());
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final List<C15027u> m(List<MustHaveCardProductDataModel> list) {
        if (list == null) {
            return C16877v.n();
        }
        Iterable<MustHaveCardProductDataModel> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (MustHaveCardProductDataModel mustHaveCardProductDataModel : iterable) {
            String b10 = mustHaveCardProductDataModel.b();
            if (b10 != null) {
                String a10 = mustHaveCardProductDataModel.a();
                if (a10 != null) {
                    arrayList.add(new C15027u(b10, a10));
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = (r0 = (r0 = r0.a()).a()).a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final rz.C15028v n(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r3) {
        /*
            r2 = this;
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel r0 = r3.h()
            if (r0 == 0) goto L_0x001d
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ProductCardDataModel r0 = r0.a()
            if (r0 == 0) goto L_0x001d
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PackageMeasurementsDataModel r0 = r0.a()
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r0 = r0.a()
            if (r0 == 0) goto L_0x001d
            int r0 = r0.intValue()
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel r3 = r3.g()
            if (r3 == 0) goto L_0x0029
            java.util.List r3 = r3.b()
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            java.util.List r3 = r2.m(r3)
            rz.v r1 = new rz.v
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iz.C14599m.n(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel):rz.v");
    }

    private final int o(String str, List<c> list) {
        Object obj;
        QuantityPickerDataModel i10;
        Integer d10;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((c) obj).c(), str)) {
                break;
            }
        }
        c cVar = (c) obj;
        if (cVar == null || (i10 = cVar.i()) == null || (d10 = i10.d()) == null) {
            return 0;
        }
        return d10.intValue();
    }

    private final V p(ShopAndGoOptionDataModel shopAndGoOptionDataModel) {
        if (shopAndGoOptionDataModel == null) {
            return V.b.f130787a;
        }
        String d10 = shopAndGoOptionDataModel.d();
        if (d10 != null) {
            Locale locale = Locale.ENGLISH;
            C17542s.i(locale, "ENGLISH");
            String upperCase = d10.toUpperCase(locale);
            C17542s.i(upperCase, "toUpperCase(...)");
            V.a.C3234a valueOf = V.a.C3234a.valueOf(upperCase);
            List<T> s10 = shopAndGoOptionDataModel.b() != null ? s(shopAndGoOptionDataModel.b()) : C16877v.n();
            String c10 = shopAndGoOptionDataModel.c();
            if (c10 != null) {
                return new V.a(c10, valueOf, s10);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Y q(StockInfoDataModel stockInfoDataModel) {
        return this.f127782a.a(stockInfoDataModel);
    }

    private final C15008a r(AddToCartButtonDataModel addToCartButtonDataModel) {
        String b10 = addToCartButtonDataModel.b();
        if (b10 == null) {
            b10 = "";
        }
        return new C15008a(b10, addToCartButtonDataModel.a());
    }

    private final List<T> s(List<ShopAndGoOptionValueDataModel> list) {
        Iterable<ShopAndGoOptionValueDataModel> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ShopAndGoOptionValueDataModel shopAndGoOptionValueDataModel : iterable) {
            String b10 = shopAndGoOptionValueDataModel.b();
            if (b10 != null) {
                String d10 = shopAndGoOptionValueDataModel.d();
                if (d10 != null) {
                    String a10 = shopAndGoOptionValueDataModel.a();
                    if (a10 != null) {
                        Boolean c10 = shopAndGoOptionValueDataModel.c();
                        arrayList.add(new T(b10, d10, a10, c10 != null ? c10.booleanValue() : false));
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0024, code lost:
        r3 = r3.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rz.I a(java.lang.String r23, java.lang.String r24, int r25, java.util.List<gz.c> r26, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r26
            r2 = r27
            java.lang.String r3 = "barcode"
            r15 = r23
            kotlin.jvm.internal.C17542s.j(r15, r3)
            java.lang.String r3 = "price"
            r14 = r24
            kotlin.jvm.internal.C17542s.j(r14, r3)
            java.lang.String r3 = "itemsInCart"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "response"
            kotlin.jvm.internal.C17542s.j(r2, r3)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.InspirationSectionDataModel r3 = r27.f()
            if (r3 == 0) goto L_0x002f
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MediaCardDataModel r3 = r3.a()
            if (r3 == 0) goto L_0x002f
            java.util.List r3 = r3.b()
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            java.lang.String r5 = "Required value was null."
            if (r3 == 0) goto L_0x018d
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel r6 = r27.h()
            if (r6 == 0) goto L_0x0045
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ProductCardDataModel r6 = r6.a()
            if (r6 == 0) goto L_0x0045
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r6 = r6.b()
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            if (r6 == 0) goto L_0x0187
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel r7 = r27.h()
            if (r7 == 0) goto L_0x0059
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ProductCardDataModel r7 = r7.a()
            if (r7 == 0) goto L_0x0059
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel r7 = r7.e()
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel r8 = r27.d()
            r9 = 10
            if (r8 == 0) goto L_0x008d
            java.util.List r8 = r8.c()
            if (r8 == 0) goto L_0x008d
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = YH.C16877v.y(r8, r9)
            r10.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
        L_0x0077:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x008b
            java.lang.Object r11 = r8.next()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShopAndGoItemReferenceDataModel r11 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShopAndGoItemReferenceDataModel) r11
            rz.S r11 = r0.l(r11)
            r10.add(r11)
            goto L_0x0077
        L_0x008b:
            r12 = r10
            goto L_0x0092
        L_0x008d:
            java.util.List r8 = YH.C16877v.n()
            r12 = r8
        L_0x0092:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel r8 = r27.d()
            if (r8 == 0) goto L_0x00c3
            java.util.List r8 = r8.b()
            if (r8 == 0) goto L_0x00c3
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            int r9 = YH.C16877v.y(r8, r9)
            r10.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x00ad:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c1
            java.lang.Object r9 = r8.next()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShopAndGoItemReferenceDataModel r9 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShopAndGoItemReferenceDataModel) r9
            rz.S r9 = r0.l(r9)
            r10.add(r9)
            goto L_0x00ad
        L_0x00c1:
            r13 = r10
            goto L_0x00c8
        L_0x00c3:
            java.util.List r8 = YH.C16877v.n()
            r13 = r8
        L_0x00c8:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel r8 = r27.c()
            rz.i r1 = r0.h(r8, r1)
            java.util.List r3 = r0.e(r3)
            com.ingka.ikea.core.model.product.ProductItem r19 = r6.s()
            if (r19 == 0) goto L_0x0181
            rz.Y r6 = r0.q(r7)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel r7 = r27.e()
            if (r7 == 0) goto L_0x00e9
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShopAndGoOptionDataModel r7 = r7.a()
            goto L_0x00ea
        L_0x00e9:
            r7 = 0
        L_0x00ea:
            rz.V r7 = r0.p(r7)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel r8 = r27.b()
            if (r8 == 0) goto L_0x00f9
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FullServeNoticeDataModel r8 = r8.e()
            goto L_0x00fa
        L_0x00f9:
            r8 = 0
        L_0x00fa:
            rz.q r8 = r0.i(r8)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel r9 = r27.b()
            if (r9 == 0) goto L_0x0109
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemNoticeDataModel r9 = r9.d()
            goto L_0x010a
        L_0x0109:
            r9 = 0
        L_0x010a:
            rz.j r9 = r0.g(r9)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel r10 = r27.b()
            rz.s r10 = r0.j(r10)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel r11 = r27.a()
            if (r11 == 0) goto L_0x0123
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel r11 = r11.b()
            r4 = r25
            goto L_0x0126
        L_0x0123:
            r4 = r25
            r11 = 0
        L_0x0126:
            rz.U r18 = iz.C14590d.b(r11, r4)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel r4 = r27.a()
            if (r4 == 0) goto L_0x0135
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.AddToCartButtonDataModel r4 = r4.a()
            goto L_0x0136
        L_0x0135:
            r4 = 0
        L_0x0136:
            if (r4 == 0) goto L_0x017b
            rz.a r11 = r0.r(r4)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel r4 = r27.h()
            if (r4 == 0) goto L_0x014d
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ProductCardDataModel r4 = r4.a()
            if (r4 == 0) goto L_0x014d
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel r4 = r4.d()
            goto L_0x014e
        L_0x014d:
            r4 = 0
        L_0x014e:
            rz.t r17 = iz.C14590d.a(r4)
            rz.v r20 = r0.n(r2)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel r2 = r27.h()
            if (r2 == 0) goto L_0x0167
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ProductCardDataModel r2 = r2.a()
            if (r2 == 0) goto L_0x0167
            java.lang.String r4 = r2.c()
            goto L_0x0168
        L_0x0167:
            r4 = 0
        L_0x0168:
            rz.y r21 = iz.C14590d.c(r4)
            rz.I r2 = new rz.I
            r4 = r2
            r5 = r3
            r14 = r1
            r15 = r17
            r16 = r24
            r17 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r2
        L_0x017b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r5)
            throw r1
        L_0x0181:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r5)
            throw r1
        L_0x0187:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r5)
            throw r1
        L_0x018d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iz.C14599m.a(java.lang.String, java.lang.String, int, java.util.List, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel):rz.I");
    }
}
