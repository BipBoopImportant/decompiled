package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 12\u00020\u0001:\u00022 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010$\u001a\u0004\b)\u0010*R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010$\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/MergeCartFromUserIdRequestRemoteModel;", "", "", "userId", "group", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "populateCart", "Lcom/ingka/ikea/app/caasremote/models/h;", "shoppingProfile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;Lcom/ingka/ikea/app/caasremote/models/h;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;Lcom/ingka/ikea/app/caasremote/models/h;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/MergeCartFromUserIdRequestRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getGroup", "getGroup$annotations", "c", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "getPopulateCart", "()Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "getPopulateCart$annotations", "d", "Lcom/ingka/ikea/app/caasremote/models/h;", "getShoppingProfile", "()Lcom/ingka/ikea/app/caasremote/models/h;", "getShoppingProfile$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MergeCartFromUserIdRequestRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f71218e = {null, null, null, new C17250c(P.b(h.class), C17294a.u(h.Companion.serializer()), new KSerializer[0])};

    /* renamed from: a  reason: collision with root package name */
    private final String f71219a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71220b;

    /* renamed from: c  reason: collision with root package name */
    private final NullablePopulateCartRemoteModel f71221c;

    /* renamed from: d  reason: collision with root package name */
    private final h f71222d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/MergeCartFromUserIdRequestRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/MergeCartFromUserIdRequestRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MergeCartFromUserIdRequestRemoteModel> serializer() {
            return MergeCartFromUserIdRequestRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ MergeCartFromUserIdRequestRemoteModel(int i10, String str, String str2, NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel, h hVar, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, MergeCartFromUserIdRequestRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71219a = str;
        if ((i10 & 2) == 0) {
            this.f71220b = null;
        } else {
            this.f71220b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f71221c = null;
        } else {
            this.f71221c = nullablePopulateCartRemoteModel;
        }
        if ((i10 & 8) == 0) {
            this.f71222d = null;
        } else {
            this.f71222d = hVar;
        }
    }

    public static final /* synthetic */ void b(MergeCartFromUserIdRequestRemoteModel mergeCartFromUserIdRequestRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71218e;
        dVar.y(serialDescriptor, 0, mergeCartFromUserIdRequestRemoteModel.f71219a);
        if (dVar.z(serialDescriptor, 1) || mergeCartFromUserIdRequestRemoteModel.f71220b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, mergeCartFromUserIdRequestRemoteModel.f71220b);
        }
        if (dVar.z(serialDescriptor, 2) || mergeCartFromUserIdRequestRemoteModel.f71221c != null) {
            dVar.B(serialDescriptor, 2, NullablePopulateCartRemoteModel$$serializer.INSTANCE, mergeCartFromUserIdRequestRemoteModel.f71221c);
        }
        if (dVar.z(serialDescriptor, 3) || mergeCartFromUserIdRequestRemoteModel.f71222d != null) {
            dVar.B(serialDescriptor, 3, kSerializerArr[3], mergeCartFromUserIdRequestRemoteModel.f71222d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergeCartFromUserIdRequestRemoteModel)) {
            return false;
        }
        MergeCartFromUserIdRequestRemoteModel mergeCartFromUserIdRequestRemoteModel = (MergeCartFromUserIdRequestRemoteModel) obj;
        return C17542s.e(this.f71219a, mergeCartFromUserIdRequestRemoteModel.f71219a) && C17542s.e(this.f71220b, mergeCartFromUserIdRequestRemoteModel.f71220b) && C17542s.e(this.f71221c, mergeCartFromUserIdRequestRemoteModel.f71221c) && this.f71222d == mergeCartFromUserIdRequestRemoteModel.f71222d;
    }

    public int hashCode() {
        int hashCode = this.f71219a.hashCode() * 31;
        String str = this.f71220b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel = this.f71221c;
        int hashCode3 = (hashCode2 + (nullablePopulateCartRemoteModel == null ? 0 : nullablePopulateCartRemoteModel.hashCode())) * 31;
        h hVar = this.f71222d;
        if (hVar != null) {
            i10 = hVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f71219a;
        String str2 = this.f71220b;
        NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel = this.f71221c;
        h hVar = this.f71222d;
        return "MergeCartFromUserIdRequestRemoteModel(userId=" + str + ", group=" + str2 + ", populateCart=" + nullablePopulateCartRemoteModel + ", shoppingProfile=" + hVar + ")";
    }

    public MergeCartFromUserIdRequestRemoteModel(String str, String str2, NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel, h hVar) {
        C17542s.j(str, "userId");
        this.f71219a = str;
        this.f71220b = str2;
        this.f71221c = nullablePopulateCartRemoteModel;
        this.f71222d = hVar;
    }
}
