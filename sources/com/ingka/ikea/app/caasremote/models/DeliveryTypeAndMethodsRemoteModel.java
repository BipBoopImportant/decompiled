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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 -2\u00020\u0001:\u0002.\u001fBE\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0018R \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/DeliveryTypeAndMethodsRemoteModel;", "", "", "seen1", "", "Lcom/ingka/ikea/app/caasremote/models/DeliveryMethodRemoteModel;", "deliveryMethods", "", "leadTime", "Lcom/ingka/ikea/app/caasremote/models/c;", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/c;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/DeliveryTypeAndMethodsRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getDeliveryMethods", "()Ljava/util/List;", "getDeliveryMethods$annotations", "()V", "Ljava/lang/String;", "getLeadTime", "getLeadTime$annotations", "c", "Lcom/ingka/ikea/app/caasremote/models/c;", "getType", "()Lcom/ingka/ikea/app/caasremote/models/c;", "getType$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeliveryTypeAndMethodsRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f71135d = {new C17451f(DeliveryMethodRemoteModel$$serializer.INSTANCE), null, new C17250c(P.b(c.class), c.Companion.serializer(), new KSerializer[0])};

    /* renamed from: a  reason: collision with root package name */
    private final List<DeliveryMethodRemoteModel> f71136a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71137b;

    /* renamed from: c  reason: collision with root package name */
    private final c f71138c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/DeliveryTypeAndMethodsRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/DeliveryTypeAndMethodsRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeliveryTypeAndMethodsRemoteModel> serializer() {
            return DeliveryTypeAndMethodsRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ DeliveryTypeAndMethodsRemoteModel(int i10, List list, String str, c cVar, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, DeliveryTypeAndMethodsRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71136a = list;
        this.f71137b = str;
        this.f71138c = cVar;
    }

    public static final /* synthetic */ void b(DeliveryTypeAndMethodsRemoteModel deliveryTypeAndMethodsRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71135d;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], deliveryTypeAndMethodsRemoteModel.f71136a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, deliveryTypeAndMethodsRemoteModel.f71137b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], deliveryTypeAndMethodsRemoteModel.f71138c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTypeAndMethodsRemoteModel)) {
            return false;
        }
        DeliveryTypeAndMethodsRemoteModel deliveryTypeAndMethodsRemoteModel = (DeliveryTypeAndMethodsRemoteModel) obj;
        return C17542s.e(this.f71136a, deliveryTypeAndMethodsRemoteModel.f71136a) && C17542s.e(this.f71137b, deliveryTypeAndMethodsRemoteModel.f71137b) && this.f71138c == deliveryTypeAndMethodsRemoteModel.f71138c;
    }

    public int hashCode() {
        int hashCode = this.f71136a.hashCode() * 31;
        String str = this.f71137b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f71138c.hashCode();
    }

    public String toString() {
        List<DeliveryMethodRemoteModel> list = this.f71136a;
        String str = this.f71137b;
        c cVar = this.f71138c;
        return "DeliveryTypeAndMethodsRemoteModel(deliveryMethods=" + list + ", leadTime=" + str + ", type=" + cVar + ")";
    }
}
