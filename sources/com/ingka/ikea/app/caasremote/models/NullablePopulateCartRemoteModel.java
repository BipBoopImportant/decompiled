package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\b\u0018\u0000 A2\u00020\u0001:\u0002B\u001aBs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eB\u0001\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010#\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010#\u0012\u0004\b0\u0010'\u001a\u0004\b/\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010#\u0012\u0004\b3\u0010'\u001a\u0004\b2\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010#\u0012\u0004\b6\u0010'\u001a\u0004\b5\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b:\u0010'\u001a\u0004\b9\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u00108\u0012\u0004\b=\u0010'\u001a\u0004\b<\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u00108\u0012\u0004\b@\u0010'\u001a\u0004\b?\u0010\u001d¨\u0006C"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "", "", "fetchCartContext", "fetchDiscountCodes", "fetchIndicativeAvailability", "fetchItemInfo", "fetchPrice", "fetchServices", "", "postCode", "stateCode", "storeId", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getFetchCartContext", "()Ljava/lang/Boolean;", "getFetchCartContext$annotations", "()V", "b", "getFetchDiscountCodes", "getFetchDiscountCodes$annotations", "c", "getFetchIndicativeAvailability", "getFetchIndicativeAvailability$annotations", "d", "getFetchItemInfo", "getFetchItemInfo$annotations", "e", "getFetchPrice", "getFetchPrice$annotations", "f", "getFetchServices", "getFetchServices$annotations", "g", "Ljava/lang/String;", "getPostCode", "getPostCode$annotations", "h", "getStateCode", "getStateCode$annotations", "i", "getStoreId", "getStoreId$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullablePopulateCartRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f71385a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f71386b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f71387c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f71388d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f71389e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f71390f;

    /* renamed from: g  reason: collision with root package name */
    private final String f71391g;

    /* renamed from: h  reason: collision with root package name */
    private final String f71392h;

    /* renamed from: i  reason: collision with root package name */
    private final String f71393i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullablePopulateCartRemoteModel> serializer() {
            return NullablePopulateCartRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public NullablePopulateCartRemoteModel() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void a(NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.z(serialDescriptor, 0) || nullablePopulateCartRemoteModel.f71385a != null) {
            dVar.B(serialDescriptor, 0, C17457i.f144111a, nullablePopulateCartRemoteModel.f71385a);
        }
        if (dVar.z(serialDescriptor, 1) || nullablePopulateCartRemoteModel.f71386b != null) {
            dVar.B(serialDescriptor, 1, C17457i.f144111a, nullablePopulateCartRemoteModel.f71386b);
        }
        if (dVar.z(serialDescriptor, 2) || nullablePopulateCartRemoteModel.f71387c != null) {
            dVar.B(serialDescriptor, 2, C17457i.f144111a, nullablePopulateCartRemoteModel.f71387c);
        }
        if (dVar.z(serialDescriptor, 3) || nullablePopulateCartRemoteModel.f71388d != null) {
            dVar.B(serialDescriptor, 3, C17457i.f144111a, nullablePopulateCartRemoteModel.f71388d);
        }
        if (dVar.z(serialDescriptor, 4) || nullablePopulateCartRemoteModel.f71389e != null) {
            dVar.B(serialDescriptor, 4, C17457i.f144111a, nullablePopulateCartRemoteModel.f71389e);
        }
        if (dVar.z(serialDescriptor, 5) || nullablePopulateCartRemoteModel.f71390f != null) {
            dVar.B(serialDescriptor, 5, C17457i.f144111a, nullablePopulateCartRemoteModel.f71390f);
        }
        if (dVar.z(serialDescriptor, 6) || nullablePopulateCartRemoteModel.f71391g != null) {
            dVar.B(serialDescriptor, 6, Y0.f144077a, nullablePopulateCartRemoteModel.f71391g);
        }
        if (dVar.z(serialDescriptor, 7) || nullablePopulateCartRemoteModel.f71392h != null) {
            dVar.B(serialDescriptor, 7, Y0.f144077a, nullablePopulateCartRemoteModel.f71392h);
        }
        if (dVar.z(serialDescriptor, 8) || nullablePopulateCartRemoteModel.f71393i != null) {
            dVar.B(serialDescriptor, 8, Y0.f144077a, nullablePopulateCartRemoteModel.f71393i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullablePopulateCartRemoteModel)) {
            return false;
        }
        NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel = (NullablePopulateCartRemoteModel) obj;
        return C17542s.e(this.f71385a, nullablePopulateCartRemoteModel.f71385a) && C17542s.e(this.f71386b, nullablePopulateCartRemoteModel.f71386b) && C17542s.e(this.f71387c, nullablePopulateCartRemoteModel.f71387c) && C17542s.e(this.f71388d, nullablePopulateCartRemoteModel.f71388d) && C17542s.e(this.f71389e, nullablePopulateCartRemoteModel.f71389e) && C17542s.e(this.f71390f, nullablePopulateCartRemoteModel.f71390f) && C17542s.e(this.f71391g, nullablePopulateCartRemoteModel.f71391g) && C17542s.e(this.f71392h, nullablePopulateCartRemoteModel.f71392h) && C17542s.e(this.f71393i, nullablePopulateCartRemoteModel.f71393i);
    }

    public int hashCode() {
        Boolean bool = this.f71385a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f71386b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f71387c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f71388d;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f71389e;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f71390f;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str = this.f71391g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71392h;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71393i;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        Boolean bool = this.f71385a;
        Boolean bool2 = this.f71386b;
        Boolean bool3 = this.f71387c;
        Boolean bool4 = this.f71388d;
        Boolean bool5 = this.f71389e;
        Boolean bool6 = this.f71390f;
        String str = this.f71391g;
        String str2 = this.f71392h;
        String str3 = this.f71393i;
        return "NullablePopulateCartRemoteModel(fetchCartContext=" + bool + ", fetchDiscountCodes=" + bool2 + ", fetchIndicativeAvailability=" + bool3 + ", fetchItemInfo=" + bool4 + ", fetchPrice=" + bool5 + ", fetchServices=" + bool6 + ", postCode=" + str + ", stateCode=" + str2 + ", storeId=" + str3 + ")";
    }

    @C16814e
    public /* synthetic */ NullablePopulateCartRemoteModel(int i10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str, String str2, String str3, T0 t02) {
        if ((i10 & 1) == 0) {
            this.f71385a = null;
        } else {
            this.f71385a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f71386b = null;
        } else {
            this.f71386b = bool2;
        }
        if ((i10 & 4) == 0) {
            this.f71387c = null;
        } else {
            this.f71387c = bool3;
        }
        if ((i10 & 8) == 0) {
            this.f71388d = null;
        } else {
            this.f71388d = bool4;
        }
        if ((i10 & 16) == 0) {
            this.f71389e = null;
        } else {
            this.f71389e = bool5;
        }
        if ((i10 & 32) == 0) {
            this.f71390f = null;
        } else {
            this.f71390f = bool6;
        }
        if ((i10 & 64) == 0) {
            this.f71391g = null;
        } else {
            this.f71391g = str;
        }
        if ((i10 & 128) == 0) {
            this.f71392h = null;
        } else {
            this.f71392h = str2;
        }
        if ((i10 & 256) == 0) {
            this.f71393i = null;
        } else {
            this.f71393i = str3;
        }
    }

    public NullablePopulateCartRemoteModel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str, String str2, String str3) {
        this.f71385a = bool;
        this.f71386b = bool2;
        this.f71387c = bool3;
        this.f71388d = bool4;
        this.f71389e = bool5;
        this.f71390f = bool6;
        this.f71391g = str;
        this.f71392h = str2;
        this.f71393i = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NullablePopulateCartRemoteModel(java.lang.Boolean r11, java.lang.Boolean r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
