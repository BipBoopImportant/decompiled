package com.ingka.ikea.pushnotification.analytics.implementation.data.model;

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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b$\b\b\u0018\u0000 H2\u00020\u0001:\u0002I)B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013B¥\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\"R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010*\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\"R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010*\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\"R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\"R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010*\u0012\u0004\b6\u0010-\u001a\u0004\b1\u0010\"R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010*\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010\"R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010*\u0012\u0004\b:\u0010-\u001a\u0004\b9\u0010\"R \u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010*\u0012\u0004\b=\u0010-\u001a\u0004\b<\u0010\"R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010>\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@R \u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010*\u0012\u0004\bB\u0010-\u001a\u0004\b;\u0010\"R \u0010\u000e\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010*\u0012\u0004\bC\u0010-\u001a\u0004\b.\u0010\"R4\u0010\u0011\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010D\u0012\u0004\bG\u0010-\u001a\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData;", "", "", "dispatchId", "eventId", "messageRequestId", "transmissionId", "customerId", "market", "token", "type", "Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/BounceInfo;", "bounceInfo", "platform", "appVersion", "", "", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/BounceInfo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/BounceInfo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "l", "(Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "getDispatchId$annotations", "()V", "b", "e", "getEventId$annotations", "c", "g", "getMessageRequestId$annotations", "j", "getTransmissionId$annotations", "getCustomerId$annotations", "f", "getMarket$annotations", "i", "getToken$annotations", "h", "k", "getType$annotations", "Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/BounceInfo;", "getBounceInfo", "()Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/BounceInfo;", "getBounceInfo$annotations", "getPlatform$annotations", "getAppVersion$annotations", "Ljava/util/List;", "getAdditionalData", "()Ljava/util/List;", "getAdditionalData$annotations", "Companion", "$serializer", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PushAnalyticPostData {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final KSerializer<Object>[] f119591m;

    /* renamed from: a  reason: collision with root package name */
    private final String f119592a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119593b;

    /* renamed from: c  reason: collision with root package name */
    private final String f119594c;

    /* renamed from: d  reason: collision with root package name */
    private final String f119595d;

    /* renamed from: e  reason: collision with root package name */
    private final String f119596e;

    /* renamed from: f  reason: collision with root package name */
    private final String f119597f;

    /* renamed from: g  reason: collision with root package name */
    private final String f119598g;

    /* renamed from: h  reason: collision with root package name */
    private final String f119599h;

    /* renamed from: i  reason: collision with root package name */
    private final BounceInfo f119600i;

    /* renamed from: j  reason: collision with root package name */
    private final String f119601j;

    /* renamed from: k  reason: collision with root package name */
    private final String f119602k;

    /* renamed from: l  reason: collision with root package name */
    private final List<Map<String, String>> f119603l;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PushAnalyticPostData> serializer() {
            return PushAnalyticPostData$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        f119591m = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, new C17451f(new C17446c0(y02, y02))};
    }

    public /* synthetic */ PushAnalyticPostData(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BounceInfo bounceInfo, String str9, String str10, List list, T0 t02) {
        if (4095 != (i10 & 4095)) {
            E0.b(i10, 4095, PushAnalyticPostData$$serializer.INSTANCE.getDescriptor());
        }
        this.f119592a = str;
        this.f119593b = str2;
        this.f119594c = str3;
        this.f119595d = str4;
        this.f119596e = str5;
        this.f119597f = str6;
        this.f119598g = str7;
        this.f119599h = str8;
        this.f119600i = bounceInfo;
        this.f119601j = str9;
        this.f119602k = str10;
        this.f119603l = list;
    }

    public static final /* synthetic */ void l(PushAnalyticPostData pushAnalyticPostData, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119591m;
        dVar.y(serialDescriptor, 0, pushAnalyticPostData.f119592a);
        dVar.y(serialDescriptor, 1, pushAnalyticPostData.f119593b);
        dVar.y(serialDescriptor, 2, pushAnalyticPostData.f119594c);
        dVar.y(serialDescriptor, 3, pushAnalyticPostData.f119595d);
        dVar.y(serialDescriptor, 4, pushAnalyticPostData.f119596e);
        dVar.y(serialDescriptor, 5, pushAnalyticPostData.f119597f);
        dVar.y(serialDescriptor, 6, pushAnalyticPostData.f119598g);
        dVar.y(serialDescriptor, 7, pushAnalyticPostData.f119599h);
        dVar.B(serialDescriptor, 8, BounceInfo$$serializer.INSTANCE, pushAnalyticPostData.f119600i);
        dVar.y(serialDescriptor, 9, pushAnalyticPostData.f119601j);
        dVar.y(serialDescriptor, 10, pushAnalyticPostData.f119602k);
        dVar.B(serialDescriptor, 11, kSerializerArr[11], pushAnalyticPostData.f119603l);
    }

    public final String b() {
        return this.f119602k;
    }

    public final String c() {
        return this.f119596e;
    }

    public final String d() {
        return this.f119592a;
    }

    public final String e() {
        return this.f119593b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushAnalyticPostData)) {
            return false;
        }
        PushAnalyticPostData pushAnalyticPostData = (PushAnalyticPostData) obj;
        return C17542s.e(this.f119592a, pushAnalyticPostData.f119592a) && C17542s.e(this.f119593b, pushAnalyticPostData.f119593b) && C17542s.e(this.f119594c, pushAnalyticPostData.f119594c) && C17542s.e(this.f119595d, pushAnalyticPostData.f119595d) && C17542s.e(this.f119596e, pushAnalyticPostData.f119596e) && C17542s.e(this.f119597f, pushAnalyticPostData.f119597f) && C17542s.e(this.f119598g, pushAnalyticPostData.f119598g) && C17542s.e(this.f119599h, pushAnalyticPostData.f119599h) && C17542s.e(this.f119600i, pushAnalyticPostData.f119600i) && C17542s.e(this.f119601j, pushAnalyticPostData.f119601j) && C17542s.e(this.f119602k, pushAnalyticPostData.f119602k) && C17542s.e(this.f119603l, pushAnalyticPostData.f119603l);
    }

    public final String f() {
        return this.f119597f;
    }

    public final String g() {
        return this.f119594c;
    }

    public final String h() {
        return this.f119601j;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f119592a.hashCode() * 31) + this.f119593b.hashCode()) * 31) + this.f119594c.hashCode()) * 31) + this.f119595d.hashCode()) * 31) + this.f119596e.hashCode()) * 31) + this.f119597f.hashCode()) * 31) + this.f119598g.hashCode()) * 31) + this.f119599h.hashCode()) * 31;
        BounceInfo bounceInfo = this.f119600i;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (bounceInfo == null ? 0 : bounceInfo.hashCode())) * 31) + this.f119601j.hashCode()) * 31) + this.f119602k.hashCode()) * 31;
        List<Map<String, String>> list = this.f119603l;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String i() {
        return this.f119598g;
    }

    public final String j() {
        return this.f119595d;
    }

    public final String k() {
        return this.f119599h;
    }

    public String toString() {
        String str = this.f119592a;
        String str2 = this.f119593b;
        String str3 = this.f119594c;
        String str4 = this.f119595d;
        String str5 = this.f119596e;
        String str6 = this.f119597f;
        String str7 = this.f119598g;
        String str8 = this.f119599h;
        BounceInfo bounceInfo = this.f119600i;
        String str9 = this.f119601j;
        String str10 = this.f119602k;
        List<Map<String, String>> list = this.f119603l;
        return "PushAnalyticPostData(dispatchId=" + str + ", eventId=" + str2 + ", messageRequestId=" + str3 + ", transmissionId=" + str4 + ", customerId=" + str5 + ", market=" + str6 + ", token=" + str7 + ", type=" + str8 + ", bounceInfo=" + bounceInfo + ", platform=" + str9 + ", appVersion=" + str10 + ", additionalData=" + list + ")";
    }

    public PushAnalyticPostData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BounceInfo bounceInfo, String str9, String str10, List<? extends Map<String, String>> list) {
        C17542s.j(str, "dispatchId");
        C17542s.j(str2, "eventId");
        C17542s.j(str3, "messageRequestId");
        C17542s.j(str4, "transmissionId");
        C17542s.j(str5, "customerId");
        C17542s.j(str6, "market");
        C17542s.j(str7, "token");
        C17542s.j(str8, "type");
        C17542s.j(str9, "platform");
        C17542s.j(str10, "appVersion");
        this.f119592a = str;
        this.f119593b = str2;
        this.f119594c = str3;
        this.f119595d = str4;
        this.f119596e = str5;
        this.f119597f = str6;
        this.f119598g = str7;
        this.f119599h = str8;
        this.f119600i = bounceInfo;
        this.f119601j = str9;
        this.f119602k = str10;
        this.f119603l = list;
    }
}
