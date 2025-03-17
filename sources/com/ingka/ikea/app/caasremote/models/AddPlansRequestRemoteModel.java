package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\b\b\u0018\u0000 42\u00020\u0001:\u00025!BQ\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010&\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/AddPlansRequestRemoteModel;", "", "", "seen1", "", "Lcom/ingka/ikea/app/caasremote/models/PlanRequestRemoteModel;", "plans", "", "group", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "populateCart", "Lcom/ingka/ikea/app/caasremote/models/h;", "shoppingProfile", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;Lcom/ingka/ikea/app/caasremote/models/h;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/AddPlansRequestRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getPlans", "()Ljava/util/List;", "getPlans$annotations", "()V", "Ljava/lang/String;", "getGroup", "getGroup$annotations", "c", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "getPopulateCart", "()Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "getPopulateCart$annotations", "d", "Lcom/ingka/ikea/app/caasremote/models/h;", "getShoppingProfile", "()Lcom/ingka/ikea/app/caasremote/models/h;", "getShoppingProfile$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddPlansRequestRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f71021e = {new C17451f(PlanRequestRemoteModel$$serializer.INSTANCE), null, null, new C17250c(P.b(h.class), C17294a.u(h.Companion.serializer()), new KSerializer[0])};

    /* renamed from: a  reason: collision with root package name */
    private final List<PlanRequestRemoteModel> f71022a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71023b;

    /* renamed from: c  reason: collision with root package name */
    private final NullablePopulateCartRemoteModel f71024c;

    /* renamed from: d  reason: collision with root package name */
    private final h f71025d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/AddPlansRequestRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/AddPlansRequestRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddPlansRequestRemoteModel> serializer() {
            return AddPlansRequestRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ AddPlansRequestRemoteModel(int i10, List list, String str, NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel, h hVar, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, AddPlansRequestRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71022a = list;
        if ((i10 & 2) == 0) {
            this.f71023b = null;
        } else {
            this.f71023b = str;
        }
        if ((i10 & 4) == 0) {
            this.f71024c = null;
        } else {
            this.f71024c = nullablePopulateCartRemoteModel;
        }
        if ((i10 & 8) == 0) {
            this.f71025d = null;
        } else {
            this.f71025d = hVar;
        }
    }

    public static final /* synthetic */ void b(AddPlansRequestRemoteModel addPlansRequestRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71021e;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], addPlansRequestRemoteModel.f71022a);
        if (dVar.z(serialDescriptor, 1) || addPlansRequestRemoteModel.f71023b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, addPlansRequestRemoteModel.f71023b);
        }
        if (dVar.z(serialDescriptor, 2) || addPlansRequestRemoteModel.f71024c != null) {
            dVar.B(serialDescriptor, 2, NullablePopulateCartRemoteModel$$serializer.INSTANCE, addPlansRequestRemoteModel.f71024c);
        }
        if (dVar.z(serialDescriptor, 3) || addPlansRequestRemoteModel.f71025d != null) {
            dVar.B(serialDescriptor, 3, kSerializerArr[3], addPlansRequestRemoteModel.f71025d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPlansRequestRemoteModel)) {
            return false;
        }
        AddPlansRequestRemoteModel addPlansRequestRemoteModel = (AddPlansRequestRemoteModel) obj;
        return C17542s.e(this.f71022a, addPlansRequestRemoteModel.f71022a) && C17542s.e(this.f71023b, addPlansRequestRemoteModel.f71023b) && C17542s.e(this.f71024c, addPlansRequestRemoteModel.f71024c) && this.f71025d == addPlansRequestRemoteModel.f71025d;
    }

    public int hashCode() {
        int hashCode = this.f71022a.hashCode() * 31;
        String str = this.f71023b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel = this.f71024c;
        int hashCode3 = (hashCode2 + (nullablePopulateCartRemoteModel == null ? 0 : nullablePopulateCartRemoteModel.hashCode())) * 31;
        h hVar = this.f71025d;
        if (hVar != null) {
            i10 = hVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        List<PlanRequestRemoteModel> list = this.f71022a;
        String str = this.f71023b;
        NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel = this.f71024c;
        h hVar = this.f71025d;
        return "AddPlansRequestRemoteModel(plans=" + list + ", group=" + str + ", populateCart=" + nullablePopulateCartRemoteModel + ", shoppingProfile=" + hVar + ")";
    }
}
