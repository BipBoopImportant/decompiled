package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\b\u0018\u0000 B2\u00020\u0001:\u0002C&B\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010'\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010)R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010'\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010)R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010'\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010)R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b6\u0010+\u001a\u0004\b5\u0010 R \u0010\u000f\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00104\u0012\u0004\b9\u0010+\u001a\u0004\b8\u0010 R \u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010+\u001a\u0004\b<\u0010=R \u0010\u0012\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u00104\u0012\u0004\bA\u0010+\u001a\u0004\b@\u0010 ¨\u0006D"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ApiBadRequestErrorRemoteModel;", "", "", "seen1", "", "Lcom/ingka/ikea/app/caasremote/models/ApiErrorRemoteModel;", "errors", "Lcom/ingka/ikea/app/caasremote/models/ApiInputFieldErrorRemoteModel;", "fields", "Lcom/ingka/ikea/app/caasremote/models/ApiInputItemErrorRemoteModel;", "items", "Lcom/ingka/ikea/app/caasremote/models/ApiInputPlanErrorRemoteModel;", "plans", "", "reference", "title", "", "success", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/caasremote/models/ApiBadRequestErrorRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getErrors$annotations", "()V", "getFields", "getFields$annotations", "getItems", "getItems$annotations", "d", "getPlans", "getPlans$annotations", "e", "Ljava/lang/String;", "getReference", "getReference$annotations", "f", "getTitle", "getTitle$annotations", "g", "Z", "getSuccess", "()Z", "getSuccess$annotations", "h", "getType", "getType$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ApiBadRequestErrorRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f71026i = {new C17451f(ApiErrorRemoteModel$$serializer.INSTANCE), new C17451f(ApiInputFieldErrorRemoteModel$$serializer.INSTANCE), new C17451f(ApiInputItemErrorRemoteModel$$serializer.INSTANCE), new C17451f(ApiInputPlanErrorRemoteModel$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<ApiErrorRemoteModel> f71027a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ApiInputFieldErrorRemoteModel> f71028b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ApiInputItemErrorRemoteModel> f71029c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ApiInputPlanErrorRemoteModel> f71030d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71031e;

    /* renamed from: f  reason: collision with root package name */
    private final String f71032f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f71033g;

    /* renamed from: h  reason: collision with root package name */
    private final String f71034h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ApiBadRequestErrorRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/ApiBadRequestErrorRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApiBadRequestErrorRemoteModel> serializer() {
            return ApiBadRequestErrorRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ ApiBadRequestErrorRemoteModel(int i10, List list, List list2, List list3, List list4, String str, String str2, boolean z10, String str3, T0 t02) {
        if (255 != (i10 & 255)) {
            E0.b(i10, 255, ApiBadRequestErrorRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71027a = list;
        this.f71028b = list2;
        this.f71029c = list3;
        this.f71030d = list4;
        this.f71031e = str;
        this.f71032f = str2;
        this.f71033g = z10;
        this.f71034h = str3;
    }

    public static final /* synthetic */ void c(ApiBadRequestErrorRemoteModel apiBadRequestErrorRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71026i;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], apiBadRequestErrorRemoteModel.f71027a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], apiBadRequestErrorRemoteModel.f71028b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], apiBadRequestErrorRemoteModel.f71029c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], apiBadRequestErrorRemoteModel.f71030d);
        dVar.y(serialDescriptor, 4, apiBadRequestErrorRemoteModel.f71031e);
        dVar.y(serialDescriptor, 5, apiBadRequestErrorRemoteModel.f71032f);
        dVar.x(serialDescriptor, 6, apiBadRequestErrorRemoteModel.f71033g);
        dVar.y(serialDescriptor, 7, apiBadRequestErrorRemoteModel.f71034h);
    }

    public final List<ApiErrorRemoteModel> b() {
        return this.f71027a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiBadRequestErrorRemoteModel)) {
            return false;
        }
        ApiBadRequestErrorRemoteModel apiBadRequestErrorRemoteModel = (ApiBadRequestErrorRemoteModel) obj;
        return C17542s.e(this.f71027a, apiBadRequestErrorRemoteModel.f71027a) && C17542s.e(this.f71028b, apiBadRequestErrorRemoteModel.f71028b) && C17542s.e(this.f71029c, apiBadRequestErrorRemoteModel.f71029c) && C17542s.e(this.f71030d, apiBadRequestErrorRemoteModel.f71030d) && C17542s.e(this.f71031e, apiBadRequestErrorRemoteModel.f71031e) && C17542s.e(this.f71032f, apiBadRequestErrorRemoteModel.f71032f) && this.f71033g == apiBadRequestErrorRemoteModel.f71033g && C17542s.e(this.f71034h, apiBadRequestErrorRemoteModel.f71034h);
    }

    public int hashCode() {
        return (((((((((((((this.f71027a.hashCode() * 31) + this.f71028b.hashCode()) * 31) + this.f71029c.hashCode()) * 31) + this.f71030d.hashCode()) * 31) + this.f71031e.hashCode()) * 31) + this.f71032f.hashCode()) * 31) + Boolean.hashCode(this.f71033g)) * 31) + this.f71034h.hashCode();
    }

    public String toString() {
        List<ApiErrorRemoteModel> list = this.f71027a;
        List<ApiInputFieldErrorRemoteModel> list2 = this.f71028b;
        List<ApiInputItemErrorRemoteModel> list3 = this.f71029c;
        List<ApiInputPlanErrorRemoteModel> list4 = this.f71030d;
        String str = this.f71031e;
        String str2 = this.f71032f;
        boolean z10 = this.f71033g;
        String str3 = this.f71034h;
        return "ApiBadRequestErrorRemoteModel(errors=" + list + ", fields=" + list2 + ", items=" + list3 + ", plans=" + list4 + ", reference=" + str + ", title=" + str2 + ", success=" + z10 + ", type=" + str3 + ")";
    }
}
