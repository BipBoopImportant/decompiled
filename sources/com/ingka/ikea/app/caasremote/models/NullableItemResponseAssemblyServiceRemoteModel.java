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
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\b\u0018\u0000 92\u00020\u0001:\u0002:\"B]\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b\b\u0010)R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010'\u001a\u0004\b2\u00103R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b8\u0010'\u001a\u0004\b7\u0010\u001c¨\u0006;"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServiceRemoteModel;", "", "", "seen1", "", "Lcom/ingka/ikea/app/caasremote/models/k;", "consents", "", "isAvailable", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServicePriceRemoteModel;", "price", "", "selectedItemQuantityForAssembly", "", "serviceItemNo", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/Boolean;Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServicePriceRemoteModel;Ljava/lang/Float;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServiceRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getConsents", "()Ljava/util/List;", "getConsents$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isAvailable$annotations", "c", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServicePriceRemoteModel;", "getPrice", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServicePriceRemoteModel;", "getPrice$annotations", "d", "Ljava/lang/Float;", "getSelectedItemQuantityForAssembly", "()Ljava/lang/Float;", "getSelectedItemQuantityForAssembly$annotations", "e", "Ljava/lang/String;", "getServiceItemNo", "getServiceItemNo$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableItemResponseAssemblyServiceRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f71341f = {new C17451f(new C17250c(P.b(k.class), k.Companion.serializer(), new KSerializer[0])), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<k> f71342a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f71343b;

    /* renamed from: c  reason: collision with root package name */
    private final NullableItemResponseAssemblyServicePriceRemoteModel f71344c;

    /* renamed from: d  reason: collision with root package name */
    private final Float f71345d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71346e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServiceRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServiceRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableItemResponseAssemblyServiceRemoteModel> serializer() {
            return NullableItemResponseAssemblyServiceRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableItemResponseAssemblyServiceRemoteModel(int i10, List list, Boolean bool, NullableItemResponseAssemblyServicePriceRemoteModel nullableItemResponseAssemblyServicePriceRemoteModel, Float f10, String str, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, NullableItemResponseAssemblyServiceRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71342a = list;
        this.f71343b = bool;
        this.f71344c = nullableItemResponseAssemblyServicePriceRemoteModel;
        this.f71345d = f10;
        this.f71346e = str;
    }

    public static final /* synthetic */ void b(NullableItemResponseAssemblyServiceRemoteModel nullableItemResponseAssemblyServiceRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f71341f[0], nullableItemResponseAssemblyServiceRemoteModel.f71342a);
        dVar.B(serialDescriptor, 1, C17457i.f144111a, nullableItemResponseAssemblyServiceRemoteModel.f71343b);
        dVar.B(serialDescriptor, 2, NullableItemResponseAssemblyServicePriceRemoteModel$$serializer.INSTANCE, nullableItemResponseAssemblyServiceRemoteModel.f71344c);
        dVar.B(serialDescriptor, 3, M.f144051a, nullableItemResponseAssemblyServiceRemoteModel.f71345d);
        dVar.B(serialDescriptor, 4, Y0.f144077a, nullableItemResponseAssemblyServiceRemoteModel.f71346e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableItemResponseAssemblyServiceRemoteModel)) {
            return false;
        }
        NullableItemResponseAssemblyServiceRemoteModel nullableItemResponseAssemblyServiceRemoteModel = (NullableItemResponseAssemblyServiceRemoteModel) obj;
        return C17542s.e(this.f71342a, nullableItemResponseAssemblyServiceRemoteModel.f71342a) && C17542s.e(this.f71343b, nullableItemResponseAssemblyServiceRemoteModel.f71343b) && C17542s.e(this.f71344c, nullableItemResponseAssemblyServiceRemoteModel.f71344c) && C17542s.e(this.f71345d, nullableItemResponseAssemblyServiceRemoteModel.f71345d) && C17542s.e(this.f71346e, nullableItemResponseAssemblyServiceRemoteModel.f71346e);
    }

    public int hashCode() {
        int hashCode = this.f71342a.hashCode() * 31;
        Boolean bool = this.f71343b;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NullableItemResponseAssemblyServicePriceRemoteModel nullableItemResponseAssemblyServicePriceRemoteModel = this.f71344c;
        int hashCode3 = (hashCode2 + (nullableItemResponseAssemblyServicePriceRemoteModel == null ? 0 : nullableItemResponseAssemblyServicePriceRemoteModel.hashCode())) * 31;
        Float f10 = this.f71345d;
        int hashCode4 = (hashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str = this.f71346e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        List<k> list = this.f71342a;
        Boolean bool = this.f71343b;
        NullableItemResponseAssemblyServicePriceRemoteModel nullableItemResponseAssemblyServicePriceRemoteModel = this.f71344c;
        Float f10 = this.f71345d;
        String str = this.f71346e;
        return "NullableItemResponseAssemblyServiceRemoteModel(consents=" + list + ", isAvailable=" + bool + ", price=" + nullableItemResponseAssemblyServicePriceRemoteModel + ", selectedItemQuantityForAssembly=" + f10 + ", serviceItemNo=" + str + ")";
    }
}
