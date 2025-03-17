package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\b\u0018\u0000 =2\u00020\u0001:\u0002>#B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBq\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010(\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010*R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010$\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010\u001dR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010(\u0012\u0004\b4\u0010'\u001a\u0004\b3\u0010*R \u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010'\u001a\u0004\b7\u00108R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010$\u0012\u0004\b<\u0010'\u001a\u0004\b;\u0010\u001d¨\u0006?"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;", "", "", "familyCardId", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/BarcodeAndQuantityDataModel;", "barcodes", "salesOrder", "email", "coupons", "", "applyCoWorkerDiscount", "fullserveTimeWindowId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFamilyCardId", "getFamilyCardId$annotations", "()V", "Ljava/util/List;", "getBarcodes", "()Ljava/util/List;", "getBarcodes$annotations", "c", "getSalesOrder", "getSalesOrder$annotations", "d", "getEmail", "getEmail$annotations", "e", "getCoupons", "getCoupons$annotations", "f", "Z", "getApplyCoWorkerDiscount", "()Z", "getApplyCoWorkerDiscount$annotations", "g", "getFullserveTimeWindowId", "getFullserveTimeWindowId$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoCheckoutBodyDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f119926h;

    /* renamed from: a  reason: collision with root package name */
    private final String f119927a;

    /* renamed from: b  reason: collision with root package name */
    private final List<BarcodeAndQuantityDataModel> f119928b;

    /* renamed from: c  reason: collision with root package name */
    private final List<BarcodeAndQuantityDataModel> f119929c;

    /* renamed from: d  reason: collision with root package name */
    private final String f119930d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f119931e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f119932f;

    /* renamed from: g  reason: collision with root package name */
    private final String f119933g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ScanAndGoCheckoutBodyDataModel> serializer() {
            return ScanAndGoCheckoutBodyDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        BarcodeAndQuantityDataModel$$serializer barcodeAndQuantityDataModel$$serializer = BarcodeAndQuantityDataModel$$serializer.INSTANCE;
        f119926h = new KSerializer[]{null, new C17451f(barcodeAndQuantityDataModel$$serializer), new C17451f(barcodeAndQuantityDataModel$$serializer), null, new C17451f(Y0.f144077a), null, null};
    }

    public /* synthetic */ ScanAndGoCheckoutBodyDataModel(int i10, String str, List list, List list2, String str2, List list3, boolean z10, String str3, T0 t02) {
        if (95 != (i10 & 95)) {
            E0.b(i10, 95, ScanAndGoCheckoutBodyDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f119927a = str;
        this.f119928b = list;
        this.f119929c = list2;
        this.f119930d = str2;
        this.f119931e = list3;
        if ((i10 & 32) == 0) {
            this.f119932f = false;
        } else {
            this.f119932f = z10;
        }
        this.f119933g = str3;
    }

    public static final /* synthetic */ void b(ScanAndGoCheckoutBodyDataModel scanAndGoCheckoutBodyDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119926h;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, scanAndGoCheckoutBodyDataModel.f119927a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], scanAndGoCheckoutBodyDataModel.f119928b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], scanAndGoCheckoutBodyDataModel.f119929c);
        dVar.B(serialDescriptor, 3, y02, scanAndGoCheckoutBodyDataModel.f119930d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], scanAndGoCheckoutBodyDataModel.f119931e);
        if (dVar.z(serialDescriptor, 5) || scanAndGoCheckoutBodyDataModel.f119932f) {
            dVar.x(serialDescriptor, 5, scanAndGoCheckoutBodyDataModel.f119932f);
        }
        dVar.B(serialDescriptor, 6, y02, scanAndGoCheckoutBodyDataModel.f119933g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoCheckoutBodyDataModel)) {
            return false;
        }
        ScanAndGoCheckoutBodyDataModel scanAndGoCheckoutBodyDataModel = (ScanAndGoCheckoutBodyDataModel) obj;
        return C17542s.e(this.f119927a, scanAndGoCheckoutBodyDataModel.f119927a) && C17542s.e(this.f119928b, scanAndGoCheckoutBodyDataModel.f119928b) && C17542s.e(this.f119929c, scanAndGoCheckoutBodyDataModel.f119929c) && C17542s.e(this.f119930d, scanAndGoCheckoutBodyDataModel.f119930d) && C17542s.e(this.f119931e, scanAndGoCheckoutBodyDataModel.f119931e) && this.f119932f == scanAndGoCheckoutBodyDataModel.f119932f && C17542s.e(this.f119933g, scanAndGoCheckoutBodyDataModel.f119933g);
    }

    public int hashCode() {
        String str = this.f119927a;
        int i10 = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f119928b.hashCode()) * 31) + this.f119929c.hashCode()) * 31;
        String str2 = this.f119930d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.f119931e;
        int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.f119932f)) * 31;
        String str3 = this.f119933g;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f119927a;
        List<BarcodeAndQuantityDataModel> list = this.f119928b;
        List<BarcodeAndQuantityDataModel> list2 = this.f119929c;
        String str2 = this.f119930d;
        List<String> list3 = this.f119931e;
        boolean z10 = this.f119932f;
        String str3 = this.f119933g;
        return "ScanAndGoCheckoutBodyDataModel(familyCardId=" + str + ", barcodes=" + list + ", salesOrder=" + list2 + ", email=" + str2 + ", coupons=" + list3 + ", applyCoWorkerDiscount=" + z10 + ", fullserveTimeWindowId=" + str3 + ")";
    }

    public ScanAndGoCheckoutBodyDataModel(String str, List<BarcodeAndQuantityDataModel> list, List<BarcodeAndQuantityDataModel> list2, String str2, List<String> list3, boolean z10, String str3) {
        C17542s.j(list, "barcodes");
        C17542s.j(list2, "salesOrder");
        this.f119927a = str;
        this.f119928b = list;
        this.f119929c = list2;
        this.f119930d = str2;
        this.f119931e = list3;
        this.f119932f = z10;
        this.f119933g = str3;
    }
}
