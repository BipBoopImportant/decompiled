package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\b\u0018\u0000 -2\u00020\u0001:\u0002.\u0014BK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u0005\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010#\u0012\u0004\b)\u0010!\u001a\u0004\b(\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010#\u0012\u0004\b,\u0010!\u001a\u0004\b+\u0010%¨\u0006/"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServicesResponseRemoteModel;", "", "", "seen1", "", "isAnyItemEligibleForRemovalService", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;", "mattressRemovalService", "sofaRemovalService", "whiteGoodsRemovalService", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServicesResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isAnyItemEligibleForRemovalService$annotations", "()V", "b", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;", "getMattressRemovalService", "()Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;", "getMattressRemovalService$annotations", "c", "getSofaRemovalService", "getSofaRemovalService$annotations", "d", "getWhiteGoodsRemovalService", "getWhiteGoodsRemovalService$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableRemovalServicesResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f71417a;

    /* renamed from: b  reason: collision with root package name */
    private final NullableRemovalServiceResponseRemoteModel f71418b;

    /* renamed from: c  reason: collision with root package name */
    private final NullableRemovalServiceResponseRemoteModel f71419c;

    /* renamed from: d  reason: collision with root package name */
    private final NullableRemovalServiceResponseRemoteModel f71420d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServicesResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServicesResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableRemovalServicesResponseRemoteModel> serializer() {
            return NullableRemovalServicesResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableRemovalServicesResponseRemoteModel(int i10, Boolean bool, NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel, NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel2, NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel3, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, NullableRemovalServicesResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71417a = bool;
        this.f71418b = nullableRemovalServiceResponseRemoteModel;
        this.f71419c = nullableRemovalServiceResponseRemoteModel2;
        this.f71420d = nullableRemovalServiceResponseRemoteModel3;
    }

    public static final /* synthetic */ void a(NullableRemovalServicesResponseRemoteModel nullableRemovalServicesResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, C17457i.f144111a, nullableRemovalServicesResponseRemoteModel.f71417a);
        NullableRemovalServiceResponseRemoteModel$$serializer nullableRemovalServiceResponseRemoteModel$$serializer = NullableRemovalServiceResponseRemoteModel$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 1, nullableRemovalServiceResponseRemoteModel$$serializer, nullableRemovalServicesResponseRemoteModel.f71418b);
        dVar.B(serialDescriptor, 2, nullableRemovalServiceResponseRemoteModel$$serializer, nullableRemovalServicesResponseRemoteModel.f71419c);
        dVar.B(serialDescriptor, 3, nullableRemovalServiceResponseRemoteModel$$serializer, nullableRemovalServicesResponseRemoteModel.f71420d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableRemovalServicesResponseRemoteModel)) {
            return false;
        }
        NullableRemovalServicesResponseRemoteModel nullableRemovalServicesResponseRemoteModel = (NullableRemovalServicesResponseRemoteModel) obj;
        return C17542s.e(this.f71417a, nullableRemovalServicesResponseRemoteModel.f71417a) && C17542s.e(this.f71418b, nullableRemovalServicesResponseRemoteModel.f71418b) && C17542s.e(this.f71419c, nullableRemovalServicesResponseRemoteModel.f71419c) && C17542s.e(this.f71420d, nullableRemovalServicesResponseRemoteModel.f71420d);
    }

    public int hashCode() {
        Boolean bool = this.f71417a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel = this.f71418b;
        int hashCode2 = (hashCode + (nullableRemovalServiceResponseRemoteModel == null ? 0 : nullableRemovalServiceResponseRemoteModel.hashCode())) * 31;
        NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel2 = this.f71419c;
        int hashCode3 = (hashCode2 + (nullableRemovalServiceResponseRemoteModel2 == null ? 0 : nullableRemovalServiceResponseRemoteModel2.hashCode())) * 31;
        NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel3 = this.f71420d;
        if (nullableRemovalServiceResponseRemoteModel3 != null) {
            i10 = nullableRemovalServiceResponseRemoteModel3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Boolean bool = this.f71417a;
        NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel = this.f71418b;
        NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel2 = this.f71419c;
        NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel3 = this.f71420d;
        return "NullableRemovalServicesResponseRemoteModel(isAnyItemEligibleForRemovalService=" + bool + ", mattressRemovalService=" + nullableRemovalServiceResponseRemoteModel + ", sofaRemovalService=" + nullableRemovalServiceResponseRemoteModel2 + ", whiteGoodsRemovalService=" + nullableRemovalServiceResponseRemoteModel3 + ")";
    }
}
