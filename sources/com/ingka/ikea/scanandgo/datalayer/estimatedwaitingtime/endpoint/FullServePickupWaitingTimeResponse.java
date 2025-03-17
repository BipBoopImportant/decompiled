package com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.endpoint;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010!\u0012\u0004\b#\u0010 \u001a\u0004\b\u001c\u0010\"¨\u0006&"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServePickupWaitingTimeResponse;", "", "", "seen0", "waitingTimeMinutes", "", "pickupTimeEpoch", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IIJLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServePickupWaitingTimeResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "getWaitingTimeMinutes$annotations", "()V", "J", "()J", "getPickupTimeEpoch$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FullServePickupWaitingTimeResponse {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f119904a;

    /* renamed from: b  reason: collision with root package name */
    private final long f119905b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServePickupWaitingTimeResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServePickupWaitingTimeResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FullServePickupWaitingTimeResponse> serializer() {
            return FullServePickupWaitingTimeResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FullServePickupWaitingTimeResponse(int i10, int i11, long j10, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, FullServePickupWaitingTimeResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f119904a = i11;
        this.f119905b = j10;
    }

    public static final /* synthetic */ void c(FullServePickupWaitingTimeResponse fullServePickupWaitingTimeResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, fullServePickupWaitingTimeResponse.f119904a);
        dVar.F(serialDescriptor, 1, fullServePickupWaitingTimeResponse.f119905b);
    }

    public final long a() {
        return this.f119905b;
    }

    public final int b() {
        return this.f119904a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullServePickupWaitingTimeResponse)) {
            return false;
        }
        FullServePickupWaitingTimeResponse fullServePickupWaitingTimeResponse = (FullServePickupWaitingTimeResponse) obj;
        return this.f119904a == fullServePickupWaitingTimeResponse.f119904a && this.f119905b == fullServePickupWaitingTimeResponse.f119905b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f119904a) * 31) + Long.hashCode(this.f119905b);
    }

    public String toString() {
        int i10 = this.f119904a;
        long j10 = this.f119905b;
        return "FullServePickupWaitingTimeResponse(waitingTimeMinutes=" + i10 + ", pickupTimeEpoch=" + j10 + ")";
    }
}
