package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
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
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b/\b\b\u0018\u0000 T2\u00020\u0001:\u0002U*B\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b \u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010#R \u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00100\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010#R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010/\u001a\u0004\b8\u00109R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010/\u001a\u0004\b=\u0010>R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u00107\u0012\u0004\bB\u0010/\u001a\u0004\bA\u00109R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u00100\u0012\u0004\bE\u0010/\u001a\u0004\bD\u0010#R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010/\u001a\u0004\bH\u0010IR \u0010\u0013\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bN\u0010/\u001a\u0004\bM\u0010%R \u0010\u0015\u001a\u00020\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010/\u001a\u0004\bQ\u0010R¨\u0006V"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/PlanResponseRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseAssemblyServiceRemoteModel;", "assemblyService", "", "code", "deepLink", "", "Lcom/ingka/ikea/app/caasremote/models/PlanImageRemoteModel;", "images", "Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseInstallationServiceRemoteModel;", "installationService", "Lcom/ingka/ikea/app/caasremote/models/PlanItemResponseRemoteModel;", "items", "name", "Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponsePriceRemoteModel;", "price", "quantity", "Lcom/ingka/ikea/app/caasremote/models/l;", "shoppingProfile", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullablePlanResponseAssemblyServiceRemoteModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseInstallationServiceRemoteModel;Ljava/util/List;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponsePriceRemoteModel;ILcom/ingka/ikea/app/caasremote/models/l;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/PlanResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseAssemblyServiceRemoteModel;", "getAssemblyService", "()Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseAssemblyServiceRemoteModel;", "getAssemblyService$annotations", "()V", "Ljava/lang/String;", "getCode", "getCode$annotations", "c", "getDeepLink", "getDeepLink$annotations", "d", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getImages$annotations", "e", "Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseInstallationServiceRemoteModel;", "getInstallationService", "()Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseInstallationServiceRemoteModel;", "getInstallationService$annotations", "f", "getItems", "getItems$annotations", "g", "getName", "getName$annotations", "h", "Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponsePriceRemoteModel;", "getPrice", "()Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponsePriceRemoteModel;", "getPrice$annotations", "i", "I", "getQuantity", "getQuantity$annotations", "j", "Lcom/ingka/ikea/app/caasremote/models/l;", "getShoppingProfile", "()Lcom/ingka/ikea/app/caasremote/models/l;", "getShoppingProfile$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlanResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f71478k = {null, null, null, new C17451f(PlanImageRemoteModel$$serializer.INSTANCE), null, new C17451f(PlanItemResponseRemoteModel$$serializer.INSTANCE), null, null, null, new C17250c(P.b(l.class), l.Companion.serializer(), new KSerializer[0])};

    /* renamed from: a  reason: collision with root package name */
    private final NullablePlanResponseAssemblyServiceRemoteModel f71479a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71480b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71481c;

    /* renamed from: d  reason: collision with root package name */
    private final List<PlanImageRemoteModel> f71482d;

    /* renamed from: e  reason: collision with root package name */
    private final NullablePlanResponseInstallationServiceRemoteModel f71483e;

    /* renamed from: f  reason: collision with root package name */
    private final List<PlanItemResponseRemoteModel> f71484f;

    /* renamed from: g  reason: collision with root package name */
    private final String f71485g;

    /* renamed from: h  reason: collision with root package name */
    private final NullablePlanResponsePriceRemoteModel f71486h;

    /* renamed from: i  reason: collision with root package name */
    private final int f71487i;

    /* renamed from: j  reason: collision with root package name */
    private final l f71488j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/PlanResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/PlanResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanResponseRemoteModel> serializer() {
            return PlanResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ PlanResponseRemoteModel(int i10, NullablePlanResponseAssemblyServiceRemoteModel nullablePlanResponseAssemblyServiceRemoteModel, String str, String str2, List list, NullablePlanResponseInstallationServiceRemoteModel nullablePlanResponseInstallationServiceRemoteModel, List list2, String str3, NullablePlanResponsePriceRemoteModel nullablePlanResponsePriceRemoteModel, int i11, l lVar, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, PlanResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71479a = nullablePlanResponseAssemblyServiceRemoteModel;
        this.f71480b = str;
        this.f71481c = str2;
        this.f71482d = list;
        this.f71483e = nullablePlanResponseInstallationServiceRemoteModel;
        this.f71484f = list2;
        this.f71485g = str3;
        this.f71486h = nullablePlanResponsePriceRemoteModel;
        this.f71487i = i11;
        this.f71488j = lVar;
    }

    public static final /* synthetic */ void b(PlanResponseRemoteModel planResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71478k;
        dVar.B(serialDescriptor, 0, NullablePlanResponseAssemblyServiceRemoteModel$$serializer.INSTANCE, planResponseRemoteModel.f71479a);
        dVar.y(serialDescriptor, 1, planResponseRemoteModel.f71480b);
        dVar.y(serialDescriptor, 2, planResponseRemoteModel.f71481c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], planResponseRemoteModel.f71482d);
        dVar.B(serialDescriptor, 4, NullablePlanResponseInstallationServiceRemoteModel$$serializer.INSTANCE, planResponseRemoteModel.f71483e);
        dVar.i(serialDescriptor, 5, kSerializerArr[5], planResponseRemoteModel.f71484f);
        dVar.B(serialDescriptor, 6, Y0.f144077a, planResponseRemoteModel.f71485g);
        dVar.B(serialDescriptor, 7, NullablePlanResponsePriceRemoteModel$$serializer.INSTANCE, planResponseRemoteModel.f71486h);
        dVar.w(serialDescriptor, 8, planResponseRemoteModel.f71487i);
        dVar.i(serialDescriptor, 9, kSerializerArr[9], planResponseRemoteModel.f71488j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanResponseRemoteModel)) {
            return false;
        }
        PlanResponseRemoteModel planResponseRemoteModel = (PlanResponseRemoteModel) obj;
        return C17542s.e(this.f71479a, planResponseRemoteModel.f71479a) && C17542s.e(this.f71480b, planResponseRemoteModel.f71480b) && C17542s.e(this.f71481c, planResponseRemoteModel.f71481c) && C17542s.e(this.f71482d, planResponseRemoteModel.f71482d) && C17542s.e(this.f71483e, planResponseRemoteModel.f71483e) && C17542s.e(this.f71484f, planResponseRemoteModel.f71484f) && C17542s.e(this.f71485g, planResponseRemoteModel.f71485g) && C17542s.e(this.f71486h, planResponseRemoteModel.f71486h) && this.f71487i == planResponseRemoteModel.f71487i && this.f71488j == planResponseRemoteModel.f71488j;
    }

    public int hashCode() {
        NullablePlanResponseAssemblyServiceRemoteModel nullablePlanResponseAssemblyServiceRemoteModel = this.f71479a;
        int i10 = 0;
        int hashCode = (((((nullablePlanResponseAssemblyServiceRemoteModel == null ? 0 : nullablePlanResponseAssemblyServiceRemoteModel.hashCode()) * 31) + this.f71480b.hashCode()) * 31) + this.f71481c.hashCode()) * 31;
        List<PlanImageRemoteModel> list = this.f71482d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        NullablePlanResponseInstallationServiceRemoteModel nullablePlanResponseInstallationServiceRemoteModel = this.f71483e;
        int hashCode3 = (((hashCode2 + (nullablePlanResponseInstallationServiceRemoteModel == null ? 0 : nullablePlanResponseInstallationServiceRemoteModel.hashCode())) * 31) + this.f71484f.hashCode()) * 31;
        String str = this.f71485g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        NullablePlanResponsePriceRemoteModel nullablePlanResponsePriceRemoteModel = this.f71486h;
        if (nullablePlanResponsePriceRemoteModel != null) {
            i10 = nullablePlanResponsePriceRemoteModel.hashCode();
        }
        return ((((hashCode4 + i10) * 31) + Integer.hashCode(this.f71487i)) * 31) + this.f71488j.hashCode();
    }

    public String toString() {
        NullablePlanResponseAssemblyServiceRemoteModel nullablePlanResponseAssemblyServiceRemoteModel = this.f71479a;
        String str = this.f71480b;
        String str2 = this.f71481c;
        List<PlanImageRemoteModel> list = this.f71482d;
        NullablePlanResponseInstallationServiceRemoteModel nullablePlanResponseInstallationServiceRemoteModel = this.f71483e;
        List<PlanItemResponseRemoteModel> list2 = this.f71484f;
        String str3 = this.f71485g;
        NullablePlanResponsePriceRemoteModel nullablePlanResponsePriceRemoteModel = this.f71486h;
        int i10 = this.f71487i;
        l lVar = this.f71488j;
        return "PlanResponseRemoteModel(assemblyService=" + nullablePlanResponseAssemblyServiceRemoteModel + ", code=" + str + ", deepLink=" + str2 + ", images=" + list + ", installationService=" + nullablePlanResponseInstallationServiceRemoteModel + ", items=" + list2 + ", name=" + str3 + ", price=" + nullablePlanResponsePriceRemoteModel + ", quantity=" + i10 + ", shoppingProfile=" + lVar + ")";
    }
}
