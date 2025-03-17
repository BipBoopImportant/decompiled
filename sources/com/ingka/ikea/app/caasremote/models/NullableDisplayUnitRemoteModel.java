package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 -2\u00020\u0001:\u0002.\u001fB?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableImperialRemoteModel;", "imperial", "Lcom/ingka/ikea/app/caasremote/models/NullableMetricRemoteModel;", "metric", "Lcom/ingka/ikea/app/caasremote/models/d;", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableImperialRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableMetricRemoteModel;Lcom/ingka/ikea/app/caasremote/models/d;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullableImperialRemoteModel;", "b", "()Lcom/ingka/ikea/app/caasremote/models/NullableImperialRemoteModel;", "getImperial$annotations", "()V", "Lcom/ingka/ikea/app/caasremote/models/NullableMetricRemoteModel;", "c", "()Lcom/ingka/ikea/app/caasremote/models/NullableMetricRemoteModel;", "getMetric$annotations", "Lcom/ingka/ikea/app/caasremote/models/d;", "d", "()Lcom/ingka/ikea/app/caasremote/models/d;", "getType$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableDisplayUnitRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f71280d = {null, null, new C17250c(P.b(d.class), C17294a.u(d.Companion.serializer()), new KSerializer[0])};

    /* renamed from: a  reason: collision with root package name */
    private final NullableImperialRemoteModel f71281a;

    /* renamed from: b  reason: collision with root package name */
    private final NullableMetricRemoteModel f71282b;

    /* renamed from: c  reason: collision with root package name */
    private final d f71283c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableDisplayUnitRemoteModel> serializer() {
            return NullableDisplayUnitRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableDisplayUnitRemoteModel(int i10, NullableImperialRemoteModel nullableImperialRemoteModel, NullableMetricRemoteModel nullableMetricRemoteModel, d dVar, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, NullableDisplayUnitRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71281a = nullableImperialRemoteModel;
        this.f71282b = nullableMetricRemoteModel;
        this.f71283c = dVar;
    }

    public static final /* synthetic */ void e(NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71280d;
        dVar.B(serialDescriptor, 0, NullableImperialRemoteModel$$serializer.INSTANCE, nullableDisplayUnitRemoteModel.f71281a);
        dVar.B(serialDescriptor, 1, NullableMetricRemoteModel$$serializer.INSTANCE, nullableDisplayUnitRemoteModel.f71282b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], nullableDisplayUnitRemoteModel.f71283c);
    }

    public final NullableImperialRemoteModel b() {
        return this.f71281a;
    }

    public final NullableMetricRemoteModel c() {
        return this.f71282b;
    }

    public final d d() {
        return this.f71283c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableDisplayUnitRemoteModel)) {
            return false;
        }
        NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel = (NullableDisplayUnitRemoteModel) obj;
        return C17542s.e(this.f71281a, nullableDisplayUnitRemoteModel.f71281a) && C17542s.e(this.f71282b, nullableDisplayUnitRemoteModel.f71282b) && this.f71283c == nullableDisplayUnitRemoteModel.f71283c;
    }

    public int hashCode() {
        NullableImperialRemoteModel nullableImperialRemoteModel = this.f71281a;
        int i10 = 0;
        int hashCode = (nullableImperialRemoteModel == null ? 0 : nullableImperialRemoteModel.hashCode()) * 31;
        NullableMetricRemoteModel nullableMetricRemoteModel = this.f71282b;
        int hashCode2 = (hashCode + (nullableMetricRemoteModel == null ? 0 : nullableMetricRemoteModel.hashCode())) * 31;
        d dVar = this.f71283c;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        NullableImperialRemoteModel nullableImperialRemoteModel = this.f71281a;
        NullableMetricRemoteModel nullableMetricRemoteModel = this.f71282b;
        d dVar = this.f71283c;
        return "NullableDisplayUnitRemoteModel(imperial=" + nullableImperialRemoteModel + ", metric=" + nullableMetricRemoteModel + ", type=" + dVar + ")";
    }
}
