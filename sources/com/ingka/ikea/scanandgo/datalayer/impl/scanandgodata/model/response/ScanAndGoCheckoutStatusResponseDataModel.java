package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u001eB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b#\u0010\"\u001a\u0004\b\u001e\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010\"\u001a\u0004\b$\u0010&¨\u0006*"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutStatusResponseDataModel;", "", "", "status", "code", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StatusStringsResponse;", "statusStrings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StatusStringsResponse;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StatusStringsResponse;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutStatusResponseDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getStatus$annotations", "()V", "getCode$annotations", "c", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StatusStringsResponse;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StatusStringsResponse;", "getStatusStrings$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoCheckoutStatusResponseDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120075a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120076b;

    /* renamed from: c  reason: collision with root package name */
    private final StatusStringsResponse f120077c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutStatusResponseDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutStatusResponseDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ScanAndGoCheckoutStatusResponseDataModel> serializer() {
            return ScanAndGoCheckoutStatusResponseDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ScanAndGoCheckoutStatusResponseDataModel(int i10, String str, String str2, StatusStringsResponse statusStringsResponse, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ScanAndGoCheckoutStatusResponseDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120075a = str;
        this.f120076b = str2;
        this.f120077c = statusStringsResponse;
    }

    public static final /* synthetic */ void d(ScanAndGoCheckoutStatusResponseDataModel scanAndGoCheckoutStatusResponseDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, scanAndGoCheckoutStatusResponseDataModel.f120075a);
        dVar.B(serialDescriptor, 1, y02, scanAndGoCheckoutStatusResponseDataModel.f120076b);
        dVar.B(serialDescriptor, 2, StatusStringsResponse$$serializer.INSTANCE, scanAndGoCheckoutStatusResponseDataModel.f120077c);
    }

    public final String a() {
        return this.f120076b;
    }

    public final String b() {
        return this.f120075a;
    }

    public final StatusStringsResponse c() {
        return this.f120077c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoCheckoutStatusResponseDataModel)) {
            return false;
        }
        ScanAndGoCheckoutStatusResponseDataModel scanAndGoCheckoutStatusResponseDataModel = (ScanAndGoCheckoutStatusResponseDataModel) obj;
        return C17542s.e(this.f120075a, scanAndGoCheckoutStatusResponseDataModel.f120075a) && C17542s.e(this.f120076b, scanAndGoCheckoutStatusResponseDataModel.f120076b) && C17542s.e(this.f120077c, scanAndGoCheckoutStatusResponseDataModel.f120077c);
    }

    public int hashCode() {
        String str = this.f120075a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120076b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StatusStringsResponse statusStringsResponse = this.f120077c;
        if (statusStringsResponse != null) {
            i10 = statusStringsResponse.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f120075a;
        String str2 = this.f120076b;
        StatusStringsResponse statusStringsResponse = this.f120077c;
        return "ScanAndGoCheckoutStatusResponseDataModel(status=" + str + ", code=" + str2 + ", statusStrings=" + statusStringsResponse + ")";
    }

    public ScanAndGoCheckoutStatusResponseDataModel(String str, String str2, StatusStringsResponse statusStringsResponse) {
        this.f120075a = str;
        this.f120076b = str2;
        this.f120077c = statusStringsResponse;
    }
}
