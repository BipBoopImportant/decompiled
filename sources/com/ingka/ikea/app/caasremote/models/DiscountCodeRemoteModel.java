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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 .2\u00020\u0001:\u0002/\u001fBW\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010&\u0012\u0004\b)\u0010#\u001a\u0004\b'\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010 \u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b-\u0010#\u001a\u0004\b,\u0010\u0018¨\u00060"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;", "", "", "seen1", "", "code", "description", "Lcom/ingka/ikea/app/caasremote/models/i;", "status", "validFrom", "validTo", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/i;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getCode$annotations", "()V", "c", "getDescription$annotations", "Lcom/ingka/ikea/app/caasremote/models/i;", "d", "()Lcom/ingka/ikea/app/caasremote/models/i;", "getStatus$annotations", "getValidFrom", "getValidFrom$annotations", "getValidTo", "getValidTo$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DiscountCodeRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f71139f = {null, null, new C17250c(P.b(i.class), C17294a.u(i.Companion.serializer()), new KSerializer[0]), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f71140a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71141b;

    /* renamed from: c  reason: collision with root package name */
    private final i f71142c;

    /* renamed from: d  reason: collision with root package name */
    private final String f71143d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71144e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DiscountCodeRemoteModel> serializer() {
            return DiscountCodeRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ DiscountCodeRemoteModel(int i10, String str, String str2, i iVar, String str3, String str4, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, DiscountCodeRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71140a = str;
        this.f71141b = str2;
        this.f71142c = iVar;
        this.f71143d = str3;
        this.f71144e = str4;
    }

    public static final /* synthetic */ void e(DiscountCodeRemoteModel discountCodeRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71139f;
        dVar.y(serialDescriptor, 0, discountCodeRemoteModel.f71140a);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 1, y02, discountCodeRemoteModel.f71141b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], discountCodeRemoteModel.f71142c);
        dVar.B(serialDescriptor, 3, y02, discountCodeRemoteModel.f71143d);
        dVar.B(serialDescriptor, 4, y02, discountCodeRemoteModel.f71144e);
    }

    public final String b() {
        return this.f71140a;
    }

    public final String c() {
        return this.f71141b;
    }

    public final i d() {
        return this.f71142c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountCodeRemoteModel)) {
            return false;
        }
        DiscountCodeRemoteModel discountCodeRemoteModel = (DiscountCodeRemoteModel) obj;
        return C17542s.e(this.f71140a, discountCodeRemoteModel.f71140a) && C17542s.e(this.f71141b, discountCodeRemoteModel.f71141b) && this.f71142c == discountCodeRemoteModel.f71142c && C17542s.e(this.f71143d, discountCodeRemoteModel.f71143d) && C17542s.e(this.f71144e, discountCodeRemoteModel.f71144e);
    }

    public int hashCode() {
        int hashCode = this.f71140a.hashCode() * 31;
        String str = this.f71141b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.f71142c;
        int hashCode3 = (hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str2 = this.f71143d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71144e;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f71140a;
        String str2 = this.f71141b;
        i iVar = this.f71142c;
        String str3 = this.f71143d;
        String str4 = this.f71144e;
        return "DiscountCodeRemoteModel(code=" + str + ", description=" + str2 + ", status=" + iVar + ", validFrom=" + str3 + ", validTo=" + str4 + ")";
    }
}
