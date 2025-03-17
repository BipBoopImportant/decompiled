package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b!\b\b\u0018\u0000 A2\u00020\u0001:\u0002B%Bu\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010*\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00101\u0012\u0004\b5\u0010*\u001a\u0004\b+\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u00106\u0012\u0004\b9\u0010*\u001a\u0004\b7\u00108R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00106\u0012\u0004\b:\u0010*\u001a\u0004\b4\u00108R\"\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00101\u0012\u0004\b;\u0010*\u001a\u0004\b%\u0010\u001eR\"\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u00101\u0012\u0004\b=\u0010*\u001a\u0004\b0\u0010\u001eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010>\u0012\u0004\b@\u0010*\u001a\u0004\b<\u0010?¨\u0006C"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemProductCardDataModel;", "", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "product", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "stock", "", "productType", "formattedItemNumber", "quantity", "maxQuantity", "disclaimer", "itemNumber", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "salesLocation", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "j", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemProductCardDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "e", "()Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "getProduct$annotations", "()V", "b", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "i", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "getStock$annotations", "c", "Ljava/lang/String;", "f", "getProductType$annotations", "d", "getFormattedItemNumber$annotations", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "getQuantity$annotations", "getMaxQuantity$annotations", "getDisclaimer$annotations", "h", "getItemNumber$annotations", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "getSalesLocation$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChildItemProductCardDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ProductLiteRemote f119977a;

    /* renamed from: b  reason: collision with root package name */
    private final StockInfoDataModel f119978b;

    /* renamed from: c  reason: collision with root package name */
    private final String f119979c;

    /* renamed from: d  reason: collision with root package name */
    private final String f119980d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f119981e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f119982f;

    /* renamed from: g  reason: collision with root package name */
    private final String f119983g;

    /* renamed from: h  reason: collision with root package name */
    private final String f119984h;

    /* renamed from: i  reason: collision with root package name */
    private final SalesLocationDataModel f119985i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemProductCardDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemProductCardDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ChildItemProductCardDataModel> serializer() {
            return ChildItemProductCardDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChildItemProductCardDataModel(int i10, ProductLiteRemote productLiteRemote, StockInfoDataModel stockInfoDataModel, String str, String str2, Integer num, Integer num2, String str3, String str4, SalesLocationDataModel salesLocationDataModel, T0 t02) {
        if (510 != (i10 & 510)) {
            E0.b(i10, 510, ChildItemProductCardDataModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f119977a = null;
        } else {
            this.f119977a = productLiteRemote;
        }
        this.f119978b = stockInfoDataModel;
        this.f119979c = str;
        this.f119980d = str2;
        this.f119981e = num;
        this.f119982f = num2;
        this.f119983g = str3;
        this.f119984h = str4;
        this.f119985i = salesLocationDataModel;
    }

    public static final /* synthetic */ void j(ChildItemProductCardDataModel childItemProductCardDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.z(serialDescriptor, 0) || childItemProductCardDataModel.f119977a != null) {
            dVar.B(serialDescriptor, 0, ProductLiteRemote$$serializer.INSTANCE, childItemProductCardDataModel.f119977a);
        }
        dVar.B(serialDescriptor, 1, StockInfoDataModel$$serializer.INSTANCE, childItemProductCardDataModel.f119978b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, childItemProductCardDataModel.f119979c);
        dVar.B(serialDescriptor, 3, y02, childItemProductCardDataModel.f119980d);
        X x10 = X.f144073a;
        dVar.B(serialDescriptor, 4, x10, childItemProductCardDataModel.f119981e);
        dVar.B(serialDescriptor, 5, x10, childItemProductCardDataModel.f119982f);
        dVar.B(serialDescriptor, 6, y02, childItemProductCardDataModel.f119983g);
        dVar.B(serialDescriptor, 7, y02, childItemProductCardDataModel.f119984h);
        dVar.B(serialDescriptor, 8, SalesLocationDataModel$$serializer.INSTANCE, childItemProductCardDataModel.f119985i);
    }

    public final String a() {
        return this.f119983g;
    }

    public final String b() {
        return this.f119980d;
    }

    public final String c() {
        return this.f119984h;
    }

    public final Integer d() {
        return this.f119982f;
    }

    public final ProductLiteRemote e() {
        return this.f119977a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildItemProductCardDataModel)) {
            return false;
        }
        ChildItemProductCardDataModel childItemProductCardDataModel = (ChildItemProductCardDataModel) obj;
        return C17542s.e(this.f119977a, childItemProductCardDataModel.f119977a) && C17542s.e(this.f119978b, childItemProductCardDataModel.f119978b) && C17542s.e(this.f119979c, childItemProductCardDataModel.f119979c) && C17542s.e(this.f119980d, childItemProductCardDataModel.f119980d) && C17542s.e(this.f119981e, childItemProductCardDataModel.f119981e) && C17542s.e(this.f119982f, childItemProductCardDataModel.f119982f) && C17542s.e(this.f119983g, childItemProductCardDataModel.f119983g) && C17542s.e(this.f119984h, childItemProductCardDataModel.f119984h) && C17542s.e(this.f119985i, childItemProductCardDataModel.f119985i);
    }

    public final String f() {
        return this.f119979c;
    }

    public final Integer g() {
        return this.f119981e;
    }

    public final SalesLocationDataModel h() {
        return this.f119985i;
    }

    public int hashCode() {
        ProductLiteRemote productLiteRemote = this.f119977a;
        int i10 = 0;
        int hashCode = (productLiteRemote == null ? 0 : productLiteRemote.hashCode()) * 31;
        StockInfoDataModel stockInfoDataModel = this.f119978b;
        int hashCode2 = (hashCode + (stockInfoDataModel == null ? 0 : stockInfoDataModel.hashCode())) * 31;
        String str = this.f119979c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f119980d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f119981e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f119982f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f119983g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f119984h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SalesLocationDataModel salesLocationDataModel = this.f119985i;
        if (salesLocationDataModel != null) {
            i10 = salesLocationDataModel.hashCode();
        }
        return hashCode8 + i10;
    }

    public final StockInfoDataModel i() {
        return this.f119978b;
    }

    public String toString() {
        ProductLiteRemote productLiteRemote = this.f119977a;
        StockInfoDataModel stockInfoDataModel = this.f119978b;
        String str = this.f119979c;
        String str2 = this.f119980d;
        Integer num = this.f119981e;
        Integer num2 = this.f119982f;
        String str3 = this.f119983g;
        String str4 = this.f119984h;
        SalesLocationDataModel salesLocationDataModel = this.f119985i;
        return "ChildItemProductCardDataModel(product=" + productLiteRemote + ", stock=" + stockInfoDataModel + ", productType=" + str + ", formattedItemNumber=" + str2 + ", quantity=" + num + ", maxQuantity=" + num2 + ", disclaimer=" + str3 + ", itemNumber=" + str4 + ", salesLocation=" + salesLocationDataModel + ")";
    }
}
