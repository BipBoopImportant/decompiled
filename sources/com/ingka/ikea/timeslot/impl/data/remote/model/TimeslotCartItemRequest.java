package com.ingka.ikea.timeslot.impl.data.remote.model;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotCartItemRequest;", "", "", "itemNo", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotCartItemRequest;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemNo", "getItemNo$annotations", "()V", "b", "I", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimeslotCartItemRequest {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120528a;

    /* renamed from: b  reason: collision with root package name */
    private final int f120529b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotCartItemRequest$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotCartItemRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<TimeslotCartItemRequest> serializer() {
            return TimeslotCartItemRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TimeslotCartItemRequest(int i10, String str, int i11, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, TimeslotCartItemRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.f120528a = str;
        this.f120529b = i11;
    }

    public static final /* synthetic */ void a(TimeslotCartItemRequest timeslotCartItemRequest, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, timeslotCartItemRequest.f120528a);
        dVar.w(serialDescriptor, 1, timeslotCartItemRequest.f120529b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeslotCartItemRequest)) {
            return false;
        }
        TimeslotCartItemRequest timeslotCartItemRequest = (TimeslotCartItemRequest) obj;
        return C17542s.e(this.f120528a, timeslotCartItemRequest.f120528a) && this.f120529b == timeslotCartItemRequest.f120529b;
    }

    public int hashCode() {
        return (this.f120528a.hashCode() * 31) + Integer.hashCode(this.f120529b);
    }

    public String toString() {
        String str = this.f120528a;
        int i10 = this.f120529b;
        return "TimeslotCartItemRequest(itemNo=" + str + ", quantity=" + i10 + ")";
    }

    public TimeslotCartItemRequest(String str, int i10) {
        C17542s.j(str, "itemNo");
        this.f120528a = str;
        this.f120529b = i10;
    }
}
