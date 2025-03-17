package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 .2\u00020\u0001:\u0002/\u001fBW\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010)\u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010)\u0012\u0004\b-\u0010#\u001a\u0004\b&\u0010\u0018¨\u00060"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CurrentUnitPricePropertiesRemoteModel;", "", "", "seen1", "", "exclTax", "inclTax", "tax", "", "validFromDate", "validToDate", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/app/caasremote/models/CurrentUnitPricePropertiesRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getExclTax$annotations", "()V", "b", "getInclTax$annotations", "c", "getTax", "getTax$annotations", "Ljava/lang/String;", "getValidFromDate", "getValidFromDate$annotations", "e", "getValidToDate$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CurrentUnitPricePropertiesRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Double f71124a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f71125b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f71126c;

    /* renamed from: d  reason: collision with root package name */
    private final String f71127d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71128e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CurrentUnitPricePropertiesRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/CurrentUnitPricePropertiesRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrentUnitPricePropertiesRemoteModel> serializer() {
            return CurrentUnitPricePropertiesRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ CurrentUnitPricePropertiesRemoteModel(int i10, Double d10, Double d11, Double d12, String str, String str2, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, CurrentUnitPricePropertiesRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71124a = d10;
        this.f71125b = d11;
        this.f71126c = d12;
        this.f71127d = str;
        this.f71128e = str2;
    }

    public static final /* synthetic */ void d(CurrentUnitPricePropertiesRemoteModel currentUnitPricePropertiesRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 0, c10, currentUnitPricePropertiesRemoteModel.f71124a);
        dVar.B(serialDescriptor, 1, c10, currentUnitPricePropertiesRemoteModel.f71125b);
        dVar.B(serialDescriptor, 2, c10, currentUnitPricePropertiesRemoteModel.f71126c);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 3, y02, currentUnitPricePropertiesRemoteModel.f71127d);
        dVar.B(serialDescriptor, 4, y02, currentUnitPricePropertiesRemoteModel.f71128e);
    }

    public final Double a() {
        return this.f71124a;
    }

    public final Double b() {
        return this.f71125b;
    }

    public final String c() {
        return this.f71128e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentUnitPricePropertiesRemoteModel)) {
            return false;
        }
        CurrentUnitPricePropertiesRemoteModel currentUnitPricePropertiesRemoteModel = (CurrentUnitPricePropertiesRemoteModel) obj;
        return C17542s.e(this.f71124a, currentUnitPricePropertiesRemoteModel.f71124a) && C17542s.e(this.f71125b, currentUnitPricePropertiesRemoteModel.f71125b) && C17542s.e(this.f71126c, currentUnitPricePropertiesRemoteModel.f71126c) && C17542s.e(this.f71127d, currentUnitPricePropertiesRemoteModel.f71127d) && C17542s.e(this.f71128e, currentUnitPricePropertiesRemoteModel.f71128e);
    }

    public int hashCode() {
        Double d10 = this.f71124a;
        int i10 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f71125b;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f71126c;
        int hashCode3 = (hashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.f71127d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71128e;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        Double d10 = this.f71124a;
        Double d11 = this.f71125b;
        Double d12 = this.f71126c;
        String str = this.f71127d;
        String str2 = this.f71128e;
        return "CurrentUnitPricePropertiesRemoteModel(exclTax=" + d10 + ", inclTax=" + d11 + ", tax=" + d12 + ", validFromDate=" + str + ", validToDate=" + str2 + ")";
    }
}
