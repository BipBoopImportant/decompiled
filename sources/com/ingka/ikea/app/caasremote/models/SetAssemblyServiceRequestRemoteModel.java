package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.C17451f;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \b\b\u0018\u0000 A2\u00020\u0001:\u0002B&B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bo\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001fR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010+\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010*\u001a\u0004\b9\u0010:R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010*\u001a\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestRemoteModel;", "", "", "group", "", "Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestItemRemoteModel;", "items", "Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestPlanRemoteModel;", "plans", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "populateCart", "Lcom/ingka/ikea/app/caasremote/models/NullableServiceAreaRemoteModel;", "serviceArea", "Lcom/ingka/ikea/app/caasremote/models/h;", "shoppingProfile", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableServiceAreaRemoteModel;Lcom/ingka/ikea/app/caasremote/models/h;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableServiceAreaRemoteModel;Lcom/ingka/ikea/app/caasremote/models/h;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getGroup", "getGroup$annotations", "()V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "c", "getPlans", "getPlans$annotations", "d", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "getPopulateCart", "()Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "getPopulateCart$annotations", "e", "Lcom/ingka/ikea/app/caasremote/models/NullableServiceAreaRemoteModel;", "getServiceArea", "()Lcom/ingka/ikea/app/caasremote/models/NullableServiceAreaRemoteModel;", "getServiceArea$annotations", "f", "Lcom/ingka/ikea/app/caasremote/models/h;", "getShoppingProfile", "()Lcom/ingka/ikea/app/caasremote/models/h;", "getShoppingProfile$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SetAssemblyServiceRequestRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f71517g = {null, new C17451f(SetAssemblyServiceRequestItemRemoteModel$$serializer.INSTANCE), new C17451f(SetAssemblyServiceRequestPlanRemoteModel$$serializer.INSTANCE), null, null, new C17250c(P.b(h.class), C17294a.u(h.Companion.serializer()), new KSerializer[0])};

    /* renamed from: a  reason: collision with root package name */
    private final String f71518a;

    /* renamed from: b  reason: collision with root package name */
    private final List<SetAssemblyServiceRequestItemRemoteModel> f71519b;

    /* renamed from: c  reason: collision with root package name */
    private final List<SetAssemblyServiceRequestPlanRemoteModel> f71520c;

    /* renamed from: d  reason: collision with root package name */
    private final NullablePopulateCartRemoteModel f71521d;

    /* renamed from: e  reason: collision with root package name */
    private final NullableServiceAreaRemoteModel f71522e;

    /* renamed from: f  reason: collision with root package name */
    private final h f71523f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SetAssemblyServiceRequestRemoteModel> serializer() {
            return SetAssemblyServiceRequestRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public SetAssemblyServiceRequestRemoteModel() {
        this((String) null, (List) null, (List) null, (NullablePopulateCartRemoteModel) null, (NullableServiceAreaRemoteModel) null, (h) null, 63, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void b(SetAssemblyServiceRequestRemoteModel setAssemblyServiceRequestRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71517g;
        if (dVar.z(serialDescriptor, 0) || setAssemblyServiceRequestRemoteModel.f71518a != null) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, setAssemblyServiceRequestRemoteModel.f71518a);
        }
        if (dVar.z(serialDescriptor, 1) || setAssemblyServiceRequestRemoteModel.f71519b != null) {
            dVar.B(serialDescriptor, 1, kSerializerArr[1], setAssemblyServiceRequestRemoteModel.f71519b);
        }
        if (dVar.z(serialDescriptor, 2) || setAssemblyServiceRequestRemoteModel.f71520c != null) {
            dVar.B(serialDescriptor, 2, kSerializerArr[2], setAssemblyServiceRequestRemoteModel.f71520c);
        }
        if (dVar.z(serialDescriptor, 3) || setAssemblyServiceRequestRemoteModel.f71521d != null) {
            dVar.B(serialDescriptor, 3, NullablePopulateCartRemoteModel$$serializer.INSTANCE, setAssemblyServiceRequestRemoteModel.f71521d);
        }
        if (dVar.z(serialDescriptor, 4) || setAssemblyServiceRequestRemoteModel.f71522e != null) {
            dVar.B(serialDescriptor, 4, NullableServiceAreaRemoteModel$$serializer.INSTANCE, setAssemblyServiceRequestRemoteModel.f71522e);
        }
        if (dVar.z(serialDescriptor, 5) || setAssemblyServiceRequestRemoteModel.f71523f != null) {
            dVar.B(serialDescriptor, 5, kSerializerArr[5], setAssemblyServiceRequestRemoteModel.f71523f);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetAssemblyServiceRequestRemoteModel)) {
            return false;
        }
        SetAssemblyServiceRequestRemoteModel setAssemblyServiceRequestRemoteModel = (SetAssemblyServiceRequestRemoteModel) obj;
        return C17542s.e(this.f71518a, setAssemblyServiceRequestRemoteModel.f71518a) && C17542s.e(this.f71519b, setAssemblyServiceRequestRemoteModel.f71519b) && C17542s.e(this.f71520c, setAssemblyServiceRequestRemoteModel.f71520c) && C17542s.e(this.f71521d, setAssemblyServiceRequestRemoteModel.f71521d) && C17542s.e(this.f71522e, setAssemblyServiceRequestRemoteModel.f71522e) && this.f71523f == setAssemblyServiceRequestRemoteModel.f71523f;
    }

    public int hashCode() {
        String str = this.f71518a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SetAssemblyServiceRequestItemRemoteModel> list = this.f71519b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SetAssemblyServiceRequestPlanRemoteModel> list2 = this.f71520c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel = this.f71521d;
        int hashCode4 = (hashCode3 + (nullablePopulateCartRemoteModel == null ? 0 : nullablePopulateCartRemoteModel.hashCode())) * 31;
        NullableServiceAreaRemoteModel nullableServiceAreaRemoteModel = this.f71522e;
        int hashCode5 = (hashCode4 + (nullableServiceAreaRemoteModel == null ? 0 : nullableServiceAreaRemoteModel.hashCode())) * 31;
        h hVar = this.f71523f;
        if (hVar != null) {
            i10 = hVar.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        String str = this.f71518a;
        List<SetAssemblyServiceRequestItemRemoteModel> list = this.f71519b;
        List<SetAssemblyServiceRequestPlanRemoteModel> list2 = this.f71520c;
        NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel = this.f71521d;
        NullableServiceAreaRemoteModel nullableServiceAreaRemoteModel = this.f71522e;
        h hVar = this.f71523f;
        return "SetAssemblyServiceRequestRemoteModel(group=" + str + ", items=" + list + ", plans=" + list2 + ", populateCart=" + nullablePopulateCartRemoteModel + ", serviceArea=" + nullableServiceAreaRemoteModel + ", shoppingProfile=" + hVar + ")";
    }

    @C16814e
    public /* synthetic */ SetAssemblyServiceRequestRemoteModel(int i10, String str, List list, List list2, NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel, NullableServiceAreaRemoteModel nullableServiceAreaRemoteModel, h hVar, T0 t02) {
        if ((i10 & 1) == 0) {
            this.f71518a = null;
        } else {
            this.f71518a = str;
        }
        if ((i10 & 2) == 0) {
            this.f71519b = null;
        } else {
            this.f71519b = list;
        }
        if ((i10 & 4) == 0) {
            this.f71520c = null;
        } else {
            this.f71520c = list2;
        }
        if ((i10 & 8) == 0) {
            this.f71521d = null;
        } else {
            this.f71521d = nullablePopulateCartRemoteModel;
        }
        if ((i10 & 16) == 0) {
            this.f71522e = null;
        } else {
            this.f71522e = nullableServiceAreaRemoteModel;
        }
        if ((i10 & 32) == 0) {
            this.f71523f = null;
        } else {
            this.f71523f = hVar;
        }
    }

    public SetAssemblyServiceRequestRemoteModel(String str, List<SetAssemblyServiceRequestItemRemoteModel> list, List<SetAssemblyServiceRequestPlanRemoteModel> list2, NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel, NullableServiceAreaRemoteModel nullableServiceAreaRemoteModel, h hVar) {
        this.f71518a = str;
        this.f71519b = list;
        this.f71520c = list2;
        this.f71521d = nullablePopulateCartRemoteModel;
        this.f71522e = nullableServiceAreaRemoteModel;
        this.f71523f = hVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SetAssemblyServiceRequestRemoteModel(java.lang.String r6, java.util.List r7, java.util.List r8, com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r9, com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel r10, com.ingka.ikea.app.caasremote.models.h r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.SetAssemblyServiceRequestRemoteModel.<init>(java.lang.String, java.util.List, java.util.List, com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel, com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel, com.ingka.ikea.app.caasremote.models.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
