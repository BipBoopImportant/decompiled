package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u001eBK\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001f\u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010!¨\u0006*"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/UpptackaResponse;", "", "", "seen0", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemPresentationSectionDataModel;", "pickingList", "salesOrder", "skippedItems", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/UpptackaResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getPickingList$annotations", "()V", "c", "getSalesOrder$annotations", "d", "getSkippedItems$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpptackaResponse {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f120122d;

    /* renamed from: a  reason: collision with root package name */
    private final List<ChildItemPresentationSectionDataModel> f120123a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ChildItemPresentationSectionDataModel> f120124b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ChildItemPresentationSectionDataModel> f120125c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/UpptackaResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/UpptackaResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<UpptackaResponse> serializer() {
            return UpptackaResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ChildItemPresentationSectionDataModel$$serializer childItemPresentationSectionDataModel$$serializer = ChildItemPresentationSectionDataModel$$serializer.INSTANCE;
        f120122d = new KSerializer[]{new C17451f(childItemPresentationSectionDataModel$$serializer), new C17451f(childItemPresentationSectionDataModel$$serializer), new C17451f(childItemPresentationSectionDataModel$$serializer)};
    }

    public /* synthetic */ UpptackaResponse(int i10, List list, List list2, List list3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, UpptackaResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f120123a = list;
        this.f120124b = list2;
        this.f120125c = list3;
    }

    public static final /* synthetic */ void e(UpptackaResponse upptackaResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120122d;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], upptackaResponse.f120123a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], upptackaResponse.f120124b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], upptackaResponse.f120125c);
    }

    public final List<ChildItemPresentationSectionDataModel> b() {
        return this.f120123a;
    }

    public final List<ChildItemPresentationSectionDataModel> c() {
        return this.f120124b;
    }

    public final List<ChildItemPresentationSectionDataModel> d() {
        return this.f120125c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpptackaResponse)) {
            return false;
        }
        UpptackaResponse upptackaResponse = (UpptackaResponse) obj;
        return C17542s.e(this.f120123a, upptackaResponse.f120123a) && C17542s.e(this.f120124b, upptackaResponse.f120124b) && C17542s.e(this.f120125c, upptackaResponse.f120125c);
    }

    public int hashCode() {
        List<ChildItemPresentationSectionDataModel> list = this.f120123a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ChildItemPresentationSectionDataModel> list2 = this.f120124b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ChildItemPresentationSectionDataModel> list3 = this.f120125c;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        List<ChildItemPresentationSectionDataModel> list = this.f120123a;
        List<ChildItemPresentationSectionDataModel> list2 = this.f120124b;
        List<ChildItemPresentationSectionDataModel> list3 = this.f120125c;
        return "UpptackaResponse(pickingList=" + list + ", salesOrder=" + list2 + ", skippedItems=" + list3 + ")";
    }
}
