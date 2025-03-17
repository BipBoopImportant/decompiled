package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB3\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010!\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/WrappedCartResponseRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;", "cart", "", "cartId", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/WrappedCartResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;", "getCart$annotations", "()V", "Ljava/lang/String;", "getCartId", "getCartId$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WrappedCartResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final NullableCartResponseRemoteModel f71575a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71576b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/WrappedCartResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/WrappedCartResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WrappedCartResponseRemoteModel> serializer() {
            return WrappedCartResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ WrappedCartResponseRemoteModel(int i10, NullableCartResponseRemoteModel nullableCartResponseRemoteModel, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, WrappedCartResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71575a = nullableCartResponseRemoteModel;
        this.f71576b = str;
    }

    public static final /* synthetic */ void b(WrappedCartResponseRemoteModel wrappedCartResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, NullableCartResponseRemoteModel$$serializer.INSTANCE, wrappedCartResponseRemoteModel.f71575a);
        dVar.y(serialDescriptor, 1, wrappedCartResponseRemoteModel.f71576b);
    }

    public final NullableCartResponseRemoteModel a() {
        return this.f71575a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedCartResponseRemoteModel)) {
            return false;
        }
        WrappedCartResponseRemoteModel wrappedCartResponseRemoteModel = (WrappedCartResponseRemoteModel) obj;
        return C17542s.e(this.f71575a, wrappedCartResponseRemoteModel.f71575a) && C17542s.e(this.f71576b, wrappedCartResponseRemoteModel.f71576b);
    }

    public int hashCode() {
        NullableCartResponseRemoteModel nullableCartResponseRemoteModel = this.f71575a;
        return ((nullableCartResponseRemoteModel == null ? 0 : nullableCartResponseRemoteModel.hashCode()) * 31) + this.f71576b.hashCode();
    }

    public String toString() {
        NullableCartResponseRemoteModel nullableCartResponseRemoteModel = this.f71575a;
        String str = this.f71576b;
        return "WrappedCartResponseRemoteModel(cart=" + nullableCartResponseRemoteModel + ", cartId=" + str + ")";
    }
}
