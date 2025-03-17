package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u0015R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001d\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u0015R \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedCouponsDataModel;", "", "", "seen0", "", "coupon", "couponEnum", "message", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedCouponsDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCoupon$annotations", "()V", "b", "getCouponEnum$annotations", "getMessage", "getMessage$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoSkippedCouponsDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120096a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120097b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120098c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedCouponsDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoSkippedCouponsDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ScanAndGoSkippedCouponsDataModel> serializer() {
            return ScanAndGoSkippedCouponsDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ScanAndGoSkippedCouponsDataModel(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ScanAndGoSkippedCouponsDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120096a = str;
        this.f120097b = str2;
        this.f120098c = str3;
    }

    public static final /* synthetic */ void c(ScanAndGoSkippedCouponsDataModel scanAndGoSkippedCouponsDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, scanAndGoSkippedCouponsDataModel.f120096a);
        dVar.y(serialDescriptor, 1, scanAndGoSkippedCouponsDataModel.f120097b);
        dVar.y(serialDescriptor, 2, scanAndGoSkippedCouponsDataModel.f120098c);
    }

    public final String a() {
        return this.f120096a;
    }

    public final String b() {
        return this.f120097b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoSkippedCouponsDataModel)) {
            return false;
        }
        ScanAndGoSkippedCouponsDataModel scanAndGoSkippedCouponsDataModel = (ScanAndGoSkippedCouponsDataModel) obj;
        return C17542s.e(this.f120096a, scanAndGoSkippedCouponsDataModel.f120096a) && C17542s.e(this.f120097b, scanAndGoSkippedCouponsDataModel.f120097b) && C17542s.e(this.f120098c, scanAndGoSkippedCouponsDataModel.f120098c);
    }

    public int hashCode() {
        return (((this.f120096a.hashCode() * 31) + this.f120097b.hashCode()) * 31) + this.f120098c.hashCode();
    }

    public String toString() {
        String str = this.f120096a;
        String str2 = this.f120097b;
        String str3 = this.f120098c;
        return "ScanAndGoSkippedCouponsDataModel(coupon=" + str + ", couponEnum=" + str2 + ", message=" + str3 + ")";
    }
}
