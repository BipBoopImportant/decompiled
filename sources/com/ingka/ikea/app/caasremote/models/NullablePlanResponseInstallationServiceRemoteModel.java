package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.X;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\b\u0018\u0000 32\u00020\u0001:\u00024 BQ\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b\b\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010%\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseInstallationServiceRemoteModel;", "", "", "seen1", "", "Lcom/ingka/ikea/app/caasremote/models/k;", "consents", "", "isAvailable", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;", "price", "selectedQuantityForInstallation", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/Boolean;Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseInstallationServiceRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getConsents", "()Ljava/util/List;", "getConsents$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isAvailable$annotations", "c", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;", "getPrice", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;", "getPrice$annotations", "d", "Ljava/lang/Integer;", "getSelectedQuantityForInstallation", "()Ljava/lang/Integer;", "getSelectedQuantityForInstallation$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullablePlanResponseInstallationServiceRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f71378e = {new C17451f(new C17250c(P.b(k.class), k.Companion.serializer(), new KSerializer[0])), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<k> f71379a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f71380b;

    /* renamed from: c  reason: collision with root package name */
    private final NullableItemResponseInstallationServicePriceRemoteModel f71381c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f71382d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseInstallationServiceRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseInstallationServiceRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullablePlanResponseInstallationServiceRemoteModel> serializer() {
            return NullablePlanResponseInstallationServiceRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullablePlanResponseInstallationServiceRemoteModel(int i10, List list, Boolean bool, NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel, Integer num, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, NullablePlanResponseInstallationServiceRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71379a = list;
        this.f71380b = bool;
        this.f71381c = nullableItemResponseInstallationServicePriceRemoteModel;
        this.f71382d = num;
    }

    public static final /* synthetic */ void b(NullablePlanResponseInstallationServiceRemoteModel nullablePlanResponseInstallationServiceRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f71378e[0], nullablePlanResponseInstallationServiceRemoteModel.f71379a);
        dVar.B(serialDescriptor, 1, C17457i.f144111a, nullablePlanResponseInstallationServiceRemoteModel.f71380b);
        dVar.B(serialDescriptor, 2, NullableItemResponseInstallationServicePriceRemoteModel$$serializer.INSTANCE, nullablePlanResponseInstallationServiceRemoteModel.f71381c);
        dVar.B(serialDescriptor, 3, X.f144073a, nullablePlanResponseInstallationServiceRemoteModel.f71382d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullablePlanResponseInstallationServiceRemoteModel)) {
            return false;
        }
        NullablePlanResponseInstallationServiceRemoteModel nullablePlanResponseInstallationServiceRemoteModel = (NullablePlanResponseInstallationServiceRemoteModel) obj;
        return C17542s.e(this.f71379a, nullablePlanResponseInstallationServiceRemoteModel.f71379a) && C17542s.e(this.f71380b, nullablePlanResponseInstallationServiceRemoteModel.f71380b) && C17542s.e(this.f71381c, nullablePlanResponseInstallationServiceRemoteModel.f71381c) && C17542s.e(this.f71382d, nullablePlanResponseInstallationServiceRemoteModel.f71382d);
    }

    public int hashCode() {
        int hashCode = this.f71379a.hashCode() * 31;
        Boolean bool = this.f71380b;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel = this.f71381c;
        int hashCode3 = (hashCode2 + (nullableItemResponseInstallationServicePriceRemoteModel == null ? 0 : nullableItemResponseInstallationServicePriceRemoteModel.hashCode())) * 31;
        Integer num = this.f71382d;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        List<k> list = this.f71379a;
        Boolean bool = this.f71380b;
        NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel = this.f71381c;
        Integer num = this.f71382d;
        return "NullablePlanResponseInstallationServiceRemoteModel(consents=" + list + ", isAvailable=" + bool + ", price=" + nullableItemResponseInstallationServicePriceRemoteModel + ", selectedQuantityForInstallation=" + num + ")";
    }
}
