package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010 \u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel;", "", "", "salesOrderId", "", "timeStamp", "<init>", "(Ljava/lang/String;J)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;JLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSalesOrderId", "getSalesOrderId$annotations", "()V", "b", "J", "getTimeStamp", "()J", "getTimeStamp$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoCheckoutStatusBodyDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f119934a;

    /* renamed from: b  reason: collision with root package name */
    private final long f119935b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ScanAndGoCheckoutStatusBodyDataModel> serializer() {
            return ScanAndGoCheckoutStatusBodyDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ScanAndGoCheckoutStatusBodyDataModel(int i10, String str, long j10, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ScanAndGoCheckoutStatusBodyDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f119934a = str;
        this.f119935b = j10;
    }

    public static final /* synthetic */ void a(ScanAndGoCheckoutStatusBodyDataModel scanAndGoCheckoutStatusBodyDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, scanAndGoCheckoutStatusBodyDataModel.f119934a);
        dVar.F(serialDescriptor, 1, scanAndGoCheckoutStatusBodyDataModel.f119935b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoCheckoutStatusBodyDataModel)) {
            return false;
        }
        ScanAndGoCheckoutStatusBodyDataModel scanAndGoCheckoutStatusBodyDataModel = (ScanAndGoCheckoutStatusBodyDataModel) obj;
        return C17542s.e(this.f119934a, scanAndGoCheckoutStatusBodyDataModel.f119934a) && this.f119935b == scanAndGoCheckoutStatusBodyDataModel.f119935b;
    }

    public int hashCode() {
        return (this.f119934a.hashCode() * 31) + Long.hashCode(this.f119935b);
    }

    public String toString() {
        String str = this.f119934a;
        long j10 = this.f119935b;
        return "ScanAndGoCheckoutStatusBodyDataModel(salesOrderId=" + str + ", timeStamp=" + j10 + ")";
    }

    public ScanAndGoCheckoutStatusBodyDataModel(String str, long j10) {
        C17542s.j(str, "salesOrderId");
        this.f119934a = str;
        this.f119935b = j10;
    }
}
