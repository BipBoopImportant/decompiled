package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\b\u0018\u0000 /2\u00020\u0001:\u00020\u001fBG\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010#\u001a\u0004\b$\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010#\u001a\u0004\b(\u0010*R \u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010,\u0012\u0004\b.\u0010#\u001a\u0004\b-\u0010\u001b¨\u00061"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationAisleAndBinRemoteModel;", "aisleAndBin", "Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationDepartmentRemoteModel;", "department", "", "fullServe", "recommendationRank", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableSalesLocationAisleAndBinRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationDepartmentRemoteModel;ZILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationAisleAndBinRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationAisleAndBinRemoteModel;", "getAisleAndBin$annotations", "()V", "b", "Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationDepartmentRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableSalesLocationDepartmentRemoteModel;", "getDepartment$annotations", "c", "Z", "()Z", "getFullServe$annotations", "I", "getRecommendationRank", "getRecommendationRank$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SalesLocationRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final NullableSalesLocationAisleAndBinRemoteModel f71507a;

    /* renamed from: b  reason: collision with root package name */
    private final NullableSalesLocationDepartmentRemoteModel f71508b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f71509c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71510d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SalesLocationRemoteModel> serializer() {
            return SalesLocationRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ SalesLocationRemoteModel(int i10, NullableSalesLocationAisleAndBinRemoteModel nullableSalesLocationAisleAndBinRemoteModel, NullableSalesLocationDepartmentRemoteModel nullableSalesLocationDepartmentRemoteModel, boolean z10, int i11, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, SalesLocationRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71507a = nullableSalesLocationAisleAndBinRemoteModel;
        this.f71508b = nullableSalesLocationDepartmentRemoteModel;
        this.f71509c = z10;
        this.f71510d = i11;
    }

    public static final /* synthetic */ void d(SalesLocationRemoteModel salesLocationRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, NullableSalesLocationAisleAndBinRemoteModel$$serializer.INSTANCE, salesLocationRemoteModel.f71507a);
        dVar.B(serialDescriptor, 1, NullableSalesLocationDepartmentRemoteModel$$serializer.INSTANCE, salesLocationRemoteModel.f71508b);
        dVar.x(serialDescriptor, 2, salesLocationRemoteModel.f71509c);
        dVar.w(serialDescriptor, 3, salesLocationRemoteModel.f71510d);
    }

    public final NullableSalesLocationAisleAndBinRemoteModel a() {
        return this.f71507a;
    }

    public final NullableSalesLocationDepartmentRemoteModel b() {
        return this.f71508b;
    }

    public final boolean c() {
        return this.f71509c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalesLocationRemoteModel)) {
            return false;
        }
        SalesLocationRemoteModel salesLocationRemoteModel = (SalesLocationRemoteModel) obj;
        return C17542s.e(this.f71507a, salesLocationRemoteModel.f71507a) && C17542s.e(this.f71508b, salesLocationRemoteModel.f71508b) && this.f71509c == salesLocationRemoteModel.f71509c && this.f71510d == salesLocationRemoteModel.f71510d;
    }

    public int hashCode() {
        NullableSalesLocationAisleAndBinRemoteModel nullableSalesLocationAisleAndBinRemoteModel = this.f71507a;
        int i10 = 0;
        int hashCode = (nullableSalesLocationAisleAndBinRemoteModel == null ? 0 : nullableSalesLocationAisleAndBinRemoteModel.hashCode()) * 31;
        NullableSalesLocationDepartmentRemoteModel nullableSalesLocationDepartmentRemoteModel = this.f71508b;
        if (nullableSalesLocationDepartmentRemoteModel != null) {
            i10 = nullableSalesLocationDepartmentRemoteModel.hashCode();
        }
        return ((((hashCode + i10) * 31) + Boolean.hashCode(this.f71509c)) * 31) + Integer.hashCode(this.f71510d);
    }

    public String toString() {
        NullableSalesLocationAisleAndBinRemoteModel nullableSalesLocationAisleAndBinRemoteModel = this.f71507a;
        NullableSalesLocationDepartmentRemoteModel nullableSalesLocationDepartmentRemoteModel = this.f71508b;
        boolean z10 = this.f71509c;
        int i10 = this.f71510d;
        return "SalesLocationRemoteModel(aisleAndBin=" + nullableSalesLocationAisleAndBinRemoteModel + ", department=" + nullableSalesLocationDepartmentRemoteModel + ", fullServe=" + z10 + ", recommendationRank=" + i10 + ")";
    }
}
