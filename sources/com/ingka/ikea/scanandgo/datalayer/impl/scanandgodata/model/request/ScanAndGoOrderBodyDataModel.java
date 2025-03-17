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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\b\u0018\u0000 92\u00020\u0001:\u0002:\"BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBm\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010'\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010)R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010'\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010)R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010'\u0012\u0004\b3\u0010&\u001a\u0004\b2\u0010)R \u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010&\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel;", "", "", "familyCardId", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/BarcodeAndQuantityDataModel;", "barcodes", "pickingList", "salesOrder", "coupons", "", "applyCoWorkerDiscount", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFamilyCardId", "getFamilyCardId$annotations", "()V", "Ljava/util/List;", "getBarcodes", "()Ljava/util/List;", "getBarcodes$annotations", "c", "getPickingList", "getPickingList$annotations", "d", "getSalesOrder", "getSalesOrder$annotations", "e", "getCoupons", "getCoupons$annotations", "f", "Z", "getApplyCoWorkerDiscount", "()Z", "getApplyCoWorkerDiscount$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoOrderBodyDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f119936g;

    /* renamed from: a  reason: collision with root package name */
    private final String f119937a;

    /* renamed from: b  reason: collision with root package name */
    private final List<BarcodeAndQuantityDataModel> f119938b;

    /* renamed from: c  reason: collision with root package name */
    private final List<BarcodeAndQuantityDataModel> f119939c;

    /* renamed from: d  reason: collision with root package name */
    private final List<BarcodeAndQuantityDataModel> f119940d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f119941e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f119942f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ScanAndGoOrderBodyDataModel> serializer() {
            return ScanAndGoOrderBodyDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        BarcodeAndQuantityDataModel$$serializer barcodeAndQuantityDataModel$$serializer = BarcodeAndQuantityDataModel$$serializer.INSTANCE;
        f119936g = new KSerializer[]{null, new C17451f(barcodeAndQuantityDataModel$$serializer), new C17451f(barcodeAndQuantityDataModel$$serializer), new C17451f(barcodeAndQuantityDataModel$$serializer), new C17451f(Y0.f144077a), null};
    }

    public /* synthetic */ ScanAndGoOrderBodyDataModel(int i10, String str, List list, List list2, List list3, List list4, boolean z10, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, ScanAndGoOrderBodyDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f119937a = str;
        this.f119938b = list;
        this.f119939c = list2;
        this.f119940d = list3;
        if ((i10 & 16) == 0) {
            this.f119941e = null;
        } else {
            this.f119941e = list4;
        }
        if ((i10 & 32) == 0) {
            this.f119942f = false;
        } else {
            this.f119942f = z10;
        }
    }

    public static final /* synthetic */ void b(ScanAndGoOrderBodyDataModel scanAndGoOrderBodyDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119936g;
        dVar.y(serialDescriptor, 0, scanAndGoOrderBodyDataModel.f119937a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], scanAndGoOrderBodyDataModel.f119938b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], scanAndGoOrderBodyDataModel.f119939c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], scanAndGoOrderBodyDataModel.f119940d);
        if (dVar.z(serialDescriptor, 4) || scanAndGoOrderBodyDataModel.f119941e != null) {
            dVar.B(serialDescriptor, 4, kSerializerArr[4], scanAndGoOrderBodyDataModel.f119941e);
        }
        if (dVar.z(serialDescriptor, 5) || scanAndGoOrderBodyDataModel.f119942f) {
            dVar.x(serialDescriptor, 5, scanAndGoOrderBodyDataModel.f119942f);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoOrderBodyDataModel)) {
            return false;
        }
        ScanAndGoOrderBodyDataModel scanAndGoOrderBodyDataModel = (ScanAndGoOrderBodyDataModel) obj;
        return C17542s.e(this.f119937a, scanAndGoOrderBodyDataModel.f119937a) && C17542s.e(this.f119938b, scanAndGoOrderBodyDataModel.f119938b) && C17542s.e(this.f119939c, scanAndGoOrderBodyDataModel.f119939c) && C17542s.e(this.f119940d, scanAndGoOrderBodyDataModel.f119940d) && C17542s.e(this.f119941e, scanAndGoOrderBodyDataModel.f119941e) && this.f119942f == scanAndGoOrderBodyDataModel.f119942f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f119937a.hashCode() * 31) + this.f119938b.hashCode()) * 31) + this.f119939c.hashCode()) * 31) + this.f119940d.hashCode()) * 31;
        List<String> list = this.f119941e;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.f119942f);
    }

    public String toString() {
        String str = this.f119937a;
        List<BarcodeAndQuantityDataModel> list = this.f119938b;
        List<BarcodeAndQuantityDataModel> list2 = this.f119939c;
        List<BarcodeAndQuantityDataModel> list3 = this.f119940d;
        List<String> list4 = this.f119941e;
        boolean z10 = this.f119942f;
        return "ScanAndGoOrderBodyDataModel(familyCardId=" + str + ", barcodes=" + list + ", pickingList=" + list2 + ", salesOrder=" + list3 + ", coupons=" + list4 + ", applyCoWorkerDiscount=" + z10 + ")";
    }

    public ScanAndGoOrderBodyDataModel(String str, List<BarcodeAndQuantityDataModel> list, List<BarcodeAndQuantityDataModel> list2, List<BarcodeAndQuantityDataModel> list3, List<String> list4, boolean z10) {
        C17542s.j(str, "familyCardId");
        C17542s.j(list, "barcodes");
        C17542s.j(list2, "pickingList");
        C17542s.j(list3, "salesOrder");
        this.f119937a = str;
        this.f119938b = list;
        this.f119939c = list2;
        this.f119940d = list3;
        this.f119941e = list4;
        this.f119942f = z10;
    }
}
