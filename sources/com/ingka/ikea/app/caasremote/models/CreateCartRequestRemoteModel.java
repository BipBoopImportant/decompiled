package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u001eB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CreateCartRequestRemoteModel;", "", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "populateCart", "Lcom/ingka/ikea/app/caasremote/models/h;", "shoppingProfile", "<init>", "(Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;Lcom/ingka/ikea/app/caasremote/models/h;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;Lcom/ingka/ikea/app/caasremote/models/h;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/CreateCartRequestRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "getPopulateCart", "()Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "getPopulateCart$annotations", "()V", "Lcom/ingka/ikea/app/caasremote/models/h;", "getShoppingProfile", "()Lcom/ingka/ikea/app/caasremote/models/h;", "getShoppingProfile$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CreateCartRequestRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f71118c = {null, new C17250c(P.b(h.class), C17294a.u(h.Companion.serializer()), new KSerializer[0])};

    /* renamed from: a  reason: collision with root package name */
    private final NullablePopulateCartRemoteModel f71119a;

    /* renamed from: b  reason: collision with root package name */
    private final h f71120b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CreateCartRequestRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/CreateCartRequestRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateCartRequestRemoteModel> serializer() {
            return CreateCartRequestRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public CreateCartRequestRemoteModel() {
        this((NullablePopulateCartRemoteModel) null, (h) null, 3, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void b(CreateCartRequestRemoteModel createCartRequestRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71118c;
        if (dVar.z(serialDescriptor, 0) || createCartRequestRemoteModel.f71119a != null) {
            dVar.B(serialDescriptor, 0, NullablePopulateCartRemoteModel$$serializer.INSTANCE, createCartRequestRemoteModel.f71119a);
        }
        if (dVar.z(serialDescriptor, 1) || createCartRequestRemoteModel.f71120b != null) {
            dVar.B(serialDescriptor, 1, kSerializerArr[1], createCartRequestRemoteModel.f71120b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCartRequestRemoteModel)) {
            return false;
        }
        CreateCartRequestRemoteModel createCartRequestRemoteModel = (CreateCartRequestRemoteModel) obj;
        return C17542s.e(this.f71119a, createCartRequestRemoteModel.f71119a) && this.f71120b == createCartRequestRemoteModel.f71120b;
    }

    public int hashCode() {
        NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel = this.f71119a;
        int i10 = 0;
        int hashCode = (nullablePopulateCartRemoteModel == null ? 0 : nullablePopulateCartRemoteModel.hashCode()) * 31;
        h hVar = this.f71120b;
        if (hVar != null) {
            i10 = hVar.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel = this.f71119a;
        h hVar = this.f71120b;
        return "CreateCartRequestRemoteModel(populateCart=" + nullablePopulateCartRemoteModel + ", shoppingProfile=" + hVar + ")";
    }

    @C16814e
    public /* synthetic */ CreateCartRequestRemoteModel(int i10, NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel, h hVar, T0 t02) {
        if ((i10 & 1) == 0) {
            this.f71119a = null;
        } else {
            this.f71119a = nullablePopulateCartRemoteModel;
        }
        if ((i10 & 2) == 0) {
            this.f71120b = null;
        } else {
            this.f71120b = hVar;
        }
    }

    public CreateCartRequestRemoteModel(NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel, h hVar) {
        this.f71119a = nullablePopulateCartRemoteModel;
        this.f71120b = hVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateCartRequestRemoteModel(NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel, h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : nullablePopulateCartRemoteModel, (i10 & 2) != 0 ? null : hVar);
    }
}
