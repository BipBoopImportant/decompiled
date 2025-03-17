package com.ingka.ikea.pushnotification.analytics.implementation.data.mapper;

import fK.p;
import iK.C17395d;
import jK.C17446c0;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\b\b\u0018\u0000 52\u00020\u0001:\u00026\"Bs\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001bR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010#\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010#\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u001bR \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010#\u0012\u0004\b-\u0010&\u001a\u0004\b*\u0010\u001bR \u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010#\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010\u001bR \u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b1\u0010&\u001a\u0004\b0\u0010\u001bR4\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00102\u0012\u0004\b4\u0010&\u001a\u0004\b'\u00103¨\u00067"}, d2 = {"Lcom/ingka/ikea/pushnotification/analytics/implementation/data/mapper/MetaData;", "", "", "seen0", "", "dispatchId", "messageRequestId", "transmissionId", "customerId", "market", "token", "", "", "additionalData", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "i", "(Lcom/ingka/ikea/pushnotification/analytics/implementation/data/mapper/MetaData;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "getDispatchId$annotations", "()V", "b", "f", "getMessageRequestId$annotations", "c", "h", "getTransmissionId$annotations", "getCustomerId$annotations", "e", "getMarket$annotations", "g", "getToken$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getAdditionalData$annotations", "Companion", "$serializer", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MetaData {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f119580h;

    /* renamed from: a  reason: collision with root package name */
    private final String f119581a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119582b;

    /* renamed from: c  reason: collision with root package name */
    private final String f119583c;

    /* renamed from: d  reason: collision with root package name */
    private final String f119584d;

    /* renamed from: e  reason: collision with root package name */
    private final String f119585e;

    /* renamed from: f  reason: collision with root package name */
    private final String f119586f;

    /* renamed from: g  reason: collision with root package name */
    private final List<Map<String, String>> f119587g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/pushnotification/analytics/implementation/data/mapper/MetaData$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/pushnotification/analytics/implementation/data/mapper/MetaData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MetaData> serializer() {
            return MetaData$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        f119580h = new KSerializer[]{null, null, null, null, null, null, new C17451f(new C17446c0(y02, y02))};
    }

    public /* synthetic */ MetaData(int i10, String str, String str2, String str3, String str4, String str5, String str6, List list, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, MetaData$$serializer.INSTANCE.getDescriptor());
        }
        this.f119581a = str;
        this.f119582b = str2;
        this.f119583c = str3;
        this.f119584d = str4;
        this.f119585e = str5;
        this.f119586f = str6;
        this.f119587g = list;
    }

    public static final /* synthetic */ void i(MetaData metaData, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119580h;
        dVar.y(serialDescriptor, 0, metaData.f119581a);
        dVar.y(serialDescriptor, 1, metaData.f119582b);
        dVar.y(serialDescriptor, 2, metaData.f119583c);
        dVar.y(serialDescriptor, 3, metaData.f119584d);
        dVar.y(serialDescriptor, 4, metaData.f119585e);
        dVar.y(serialDescriptor, 5, metaData.f119586f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], metaData.f119587g);
    }

    public final List<Map<String, String>> b() {
        return this.f119587g;
    }

    public final String c() {
        return this.f119584d;
    }

    public final String d() {
        return this.f119581a;
    }

    public final String e() {
        return this.f119585e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaData)) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        return C17542s.e(this.f119581a, metaData.f119581a) && C17542s.e(this.f119582b, metaData.f119582b) && C17542s.e(this.f119583c, metaData.f119583c) && C17542s.e(this.f119584d, metaData.f119584d) && C17542s.e(this.f119585e, metaData.f119585e) && C17542s.e(this.f119586f, metaData.f119586f) && C17542s.e(this.f119587g, metaData.f119587g);
    }

    public final String f() {
        return this.f119582b;
    }

    public final String g() {
        return this.f119586f;
    }

    public final String h() {
        return this.f119583c;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f119581a.hashCode() * 31) + this.f119582b.hashCode()) * 31) + this.f119583c.hashCode()) * 31) + this.f119584d.hashCode()) * 31) + this.f119585e.hashCode()) * 31) + this.f119586f.hashCode()) * 31;
        List<Map<String, String>> list = this.f119587g;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.f119581a;
        String str2 = this.f119582b;
        String str3 = this.f119583c;
        String str4 = this.f119584d;
        String str5 = this.f119585e;
        String str6 = this.f119586f;
        List<Map<String, String>> list = this.f119587g;
        return "MetaData(dispatchId=" + str + ", messageRequestId=" + str2 + ", transmissionId=" + str3 + ", customerId=" + str4 + ", market=" + str5 + ", token=" + str6 + ", additionalData=" + list + ")";
    }
}
