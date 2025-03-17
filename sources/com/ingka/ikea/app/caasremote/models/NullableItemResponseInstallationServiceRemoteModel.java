package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.M;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\b\u0018\u0000 42\u00020\u0001:\u00025!BQ\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b\b\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010&\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;", "", "", "seen1", "", "Lcom/ingka/ikea/app/caasremote/models/k;", "consents", "", "isAvailable", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;", "price", "", "selectedItemQuantityForInstallation", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/Boolean;Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;Ljava/lang/Float;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getConsents", "()Ljava/util/List;", "getConsents$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isAvailable$annotations", "c", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;", "getPrice", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;", "getPrice$annotations", "d", "Ljava/lang/Float;", "getSelectedItemQuantityForInstallation", "()Ljava/lang/Float;", "getSelectedItemQuantityForInstallation$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableItemResponseInstallationServiceRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f71349e = {new C17451f(new C17250c(P.b(k.class), k.Companion.serializer(), new KSerializer[0])), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<k> f71350a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f71351b;

    /* renamed from: c  reason: collision with root package name */
    private final NullableItemResponseInstallationServicePriceRemoteModel f71352c;

    /* renamed from: d  reason: collision with root package name */
    private final Float f71353d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableItemResponseInstallationServiceRemoteModel> serializer() {
            return NullableItemResponseInstallationServiceRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableItemResponseInstallationServiceRemoteModel(int i10, List list, Boolean bool, NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel, Float f10, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, NullableItemResponseInstallationServiceRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71350a = list;
        this.f71351b = bool;
        this.f71352c = nullableItemResponseInstallationServicePriceRemoteModel;
        this.f71353d = f10;
    }

    public static final /* synthetic */ void b(NullableItemResponseInstallationServiceRemoteModel nullableItemResponseInstallationServiceRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f71349e[0], nullableItemResponseInstallationServiceRemoteModel.f71350a);
        dVar.B(serialDescriptor, 1, C17457i.f144111a, nullableItemResponseInstallationServiceRemoteModel.f71351b);
        dVar.B(serialDescriptor, 2, NullableItemResponseInstallationServicePriceRemoteModel$$serializer.INSTANCE, nullableItemResponseInstallationServiceRemoteModel.f71352c);
        dVar.B(serialDescriptor, 3, M.f144051a, nullableItemResponseInstallationServiceRemoteModel.f71353d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableItemResponseInstallationServiceRemoteModel)) {
            return false;
        }
        NullableItemResponseInstallationServiceRemoteModel nullableItemResponseInstallationServiceRemoteModel = (NullableItemResponseInstallationServiceRemoteModel) obj;
        return C17542s.e(this.f71350a, nullableItemResponseInstallationServiceRemoteModel.f71350a) && C17542s.e(this.f71351b, nullableItemResponseInstallationServiceRemoteModel.f71351b) && C17542s.e(this.f71352c, nullableItemResponseInstallationServiceRemoteModel.f71352c) && C17542s.e(this.f71353d, nullableItemResponseInstallationServiceRemoteModel.f71353d);
    }

    public int hashCode() {
        int hashCode = this.f71350a.hashCode() * 31;
        Boolean bool = this.f71351b;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel = this.f71352c;
        int hashCode3 = (hashCode2 + (nullableItemResponseInstallationServicePriceRemoteModel == null ? 0 : nullableItemResponseInstallationServicePriceRemoteModel.hashCode())) * 31;
        Float f10 = this.f71353d;
        if (f10 != null) {
            i10 = f10.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        List<k> list = this.f71350a;
        Boolean bool = this.f71351b;
        NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel = this.f71352c;
        Float f10 = this.f71353d;
        return "NullableItemResponseInstallationServiceRemoteModel(consents=" + list + ", isAvailable=" + bool + ", price=" + nullableItemResponseInstallationServicePriceRemoteModel + ", selectedItemQuantityForInstallation=" + f10 + ")";
    }
}
