package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u001bB3\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÁ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001d¨\u0006$"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationAisleAndBinRemoteModel;", "", "", "seen1", "aisle", "bin", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationAisleAndBinRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getAisle$annotations", "()V", "b", "getBin$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableSalesLocationAisleAndBinRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Integer f71421a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f71422b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationAisleAndBinRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationAisleAndBinRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableSalesLocationAisleAndBinRemoteModel> serializer() {
            return NullableSalesLocationAisleAndBinRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableSalesLocationAisleAndBinRemoteModel(int i10, Integer num, Integer num2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, NullableSalesLocationAisleAndBinRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71421a = num;
        this.f71422b = num2;
    }

    public static final /* synthetic */ void c(NullableSalesLocationAisleAndBinRemoteModel nullableSalesLocationAisleAndBinRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        X x10 = X.f144073a;
        dVar.B(serialDescriptor, 0, x10, nullableSalesLocationAisleAndBinRemoteModel.f71421a);
        dVar.B(serialDescriptor, 1, x10, nullableSalesLocationAisleAndBinRemoteModel.f71422b);
    }

    public final Integer a() {
        return this.f71421a;
    }

    public final Integer b() {
        return this.f71422b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableSalesLocationAisleAndBinRemoteModel)) {
            return false;
        }
        NullableSalesLocationAisleAndBinRemoteModel nullableSalesLocationAisleAndBinRemoteModel = (NullableSalesLocationAisleAndBinRemoteModel) obj;
        return C17542s.e(this.f71421a, nullableSalesLocationAisleAndBinRemoteModel.f71421a) && C17542s.e(this.f71422b, nullableSalesLocationAisleAndBinRemoteModel.f71422b);
    }

    public int hashCode() {
        Integer num = this.f71421a;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f71422b;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Integer num = this.f71421a;
        Integer num2 = this.f71422b;
        return "NullableSalesLocationAisleAndBinRemoteModel(aisle=" + num + ", bin=" + num2 + ")";
    }
}
