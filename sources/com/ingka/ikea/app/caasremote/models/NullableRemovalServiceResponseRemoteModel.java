package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\b\u0018\u0000 C2\u00020\u0001:\u0002D$Bu\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010)\u001a\u0004\b0\u00101R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b6\u0010)\u001a\u0004\b\f\u00105R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00104\u0012\u0004\b8\u0010)\u001a\u0004\b\r\u00105R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010)\u001a\u0004\b;\u0010<R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010)\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseConfigRemoteModel;", "config", "", "", "eligibleItems", "Lcom/ingka/ikea/app/caasremote/models/NullableServiceErrorResponseRemoteModel;", "error", "", "isAvailableForPostCode", "isAvailableForRU", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponsePriceRemoteModel;", "price", "quantity", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseConfigRemoteModel;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/NullableServiceErrorResponseRemoteModel;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponsePriceRemoteModel;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseConfigRemoteModel;", "getConfig", "()Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseConfigRemoteModel;", "getConfig$annotations", "()V", "Ljava/util/List;", "getEligibleItems", "()Ljava/util/List;", "getEligibleItems$annotations", "c", "Lcom/ingka/ikea/app/caasremote/models/NullableServiceErrorResponseRemoteModel;", "getError", "()Lcom/ingka/ikea/app/caasremote/models/NullableServiceErrorResponseRemoteModel;", "getError$annotations", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isAvailableForPostCode$annotations", "e", "isAvailableForRU$annotations", "f", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponsePriceRemoteModel;", "getPrice", "()Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponsePriceRemoteModel;", "getPrice$annotations", "g", "Ljava/lang/Integer;", "getQuantity", "()Ljava/lang/Integer;", "getQuantity$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableRemovalServiceResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f71405h = {null, new C17451f(Y0.f144077a), null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final NullableRemovalServiceResponseConfigRemoteModel f71406a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f71407b;

    /* renamed from: c  reason: collision with root package name */
    private final NullableServiceErrorResponseRemoteModel f71408c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f71409d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f71410e;

    /* renamed from: f  reason: collision with root package name */
    private final NullableRemovalServiceResponsePriceRemoteModel f71411f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f71412g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableRemovalServiceResponseRemoteModel> serializer() {
            return NullableRemovalServiceResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableRemovalServiceResponseRemoteModel(int i10, NullableRemovalServiceResponseConfigRemoteModel nullableRemovalServiceResponseConfigRemoteModel, List list, NullableServiceErrorResponseRemoteModel nullableServiceErrorResponseRemoteModel, Boolean bool, Boolean bool2, NullableRemovalServiceResponsePriceRemoteModel nullableRemovalServiceResponsePriceRemoteModel, Integer num, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, NullableRemovalServiceResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71406a = nullableRemovalServiceResponseConfigRemoteModel;
        this.f71407b = list;
        this.f71408c = nullableServiceErrorResponseRemoteModel;
        this.f71409d = bool;
        this.f71410e = bool2;
        this.f71411f = nullableRemovalServiceResponsePriceRemoteModel;
        this.f71412g = num;
    }

    public static final /* synthetic */ void b(NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71405h;
        dVar.B(serialDescriptor, 0, NullableRemovalServiceResponseConfigRemoteModel$$serializer.INSTANCE, nullableRemovalServiceResponseRemoteModel.f71406a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], nullableRemovalServiceResponseRemoteModel.f71407b);
        dVar.B(serialDescriptor, 2, NullableServiceErrorResponseRemoteModel$$serializer.INSTANCE, nullableRemovalServiceResponseRemoteModel.f71408c);
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 3, iVar, nullableRemovalServiceResponseRemoteModel.f71409d);
        dVar.B(serialDescriptor, 4, iVar, nullableRemovalServiceResponseRemoteModel.f71410e);
        dVar.B(serialDescriptor, 5, NullableRemovalServiceResponsePriceRemoteModel$$serializer.INSTANCE, nullableRemovalServiceResponseRemoteModel.f71411f);
        dVar.B(serialDescriptor, 6, X.f144073a, nullableRemovalServiceResponseRemoteModel.f71412g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableRemovalServiceResponseRemoteModel)) {
            return false;
        }
        NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel = (NullableRemovalServiceResponseRemoteModel) obj;
        return C17542s.e(this.f71406a, nullableRemovalServiceResponseRemoteModel.f71406a) && C17542s.e(this.f71407b, nullableRemovalServiceResponseRemoteModel.f71407b) && C17542s.e(this.f71408c, nullableRemovalServiceResponseRemoteModel.f71408c) && C17542s.e(this.f71409d, nullableRemovalServiceResponseRemoteModel.f71409d) && C17542s.e(this.f71410e, nullableRemovalServiceResponseRemoteModel.f71410e) && C17542s.e(this.f71411f, nullableRemovalServiceResponseRemoteModel.f71411f) && C17542s.e(this.f71412g, nullableRemovalServiceResponseRemoteModel.f71412g);
    }

    public int hashCode() {
        NullableRemovalServiceResponseConfigRemoteModel nullableRemovalServiceResponseConfigRemoteModel = this.f71406a;
        int i10 = 0;
        int hashCode = (nullableRemovalServiceResponseConfigRemoteModel == null ? 0 : nullableRemovalServiceResponseConfigRemoteModel.hashCode()) * 31;
        List<String> list = this.f71407b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        NullableServiceErrorResponseRemoteModel nullableServiceErrorResponseRemoteModel = this.f71408c;
        int hashCode3 = (hashCode2 + (nullableServiceErrorResponseRemoteModel == null ? 0 : nullableServiceErrorResponseRemoteModel.hashCode())) * 31;
        Boolean bool = this.f71409d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f71410e;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        NullableRemovalServiceResponsePriceRemoteModel nullableRemovalServiceResponsePriceRemoteModel = this.f71411f;
        int hashCode6 = (hashCode5 + (nullableRemovalServiceResponsePriceRemoteModel == null ? 0 : nullableRemovalServiceResponsePriceRemoteModel.hashCode())) * 31;
        Integer num = this.f71412g;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        NullableRemovalServiceResponseConfigRemoteModel nullableRemovalServiceResponseConfigRemoteModel = this.f71406a;
        List<String> list = this.f71407b;
        NullableServiceErrorResponseRemoteModel nullableServiceErrorResponseRemoteModel = this.f71408c;
        Boolean bool = this.f71409d;
        Boolean bool2 = this.f71410e;
        NullableRemovalServiceResponsePriceRemoteModel nullableRemovalServiceResponsePriceRemoteModel = this.f71411f;
        Integer num = this.f71412g;
        return "NullableRemovalServiceResponseRemoteModel(config=" + nullableRemovalServiceResponseConfigRemoteModel + ", eligibleItems=" + list + ", error=" + nullableServiceErrorResponseRemoteModel + ", isAvailableForPostCode=" + bool + ", isAvailableForRU=" + bool2 + ", price=" + nullableRemovalServiceResponsePriceRemoteModel + ", quantity=" + num + ")";
    }
}
