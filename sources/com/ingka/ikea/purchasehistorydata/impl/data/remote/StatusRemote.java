package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import Hx.c;
import androidx.annotation.Keep;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J(\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006-"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/StatusRemote;", "", "", "tense", "appDeliveryStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$purchasehistorydata_implementation_release", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/StatusRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "LHx/c$c$d;", "convertToLocal", "()LHx/c$c$d;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/StatusRemote;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTense", "getTense$annotations", "()V", "getAppDeliveryStatus", "getAppDeliveryStatus$annotations", "Companion", "$serializer", "a", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatusRemote {
    public static final int $stable = 0;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final String appDeliveryStatus;
    private final String tense;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/StatusRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/StatusRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StatusRemote> serializer() {
            return StatusRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StatusRemote(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, StatusRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.tense = str;
        this.appDeliveryStatus = str2;
    }

    public static /* synthetic */ StatusRemote copy$default(StatusRemote statusRemote, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = statusRemote.tense;
        }
        if ((i10 & 2) != 0) {
            str2 = statusRemote.appDeliveryStatus;
        }
        return statusRemote.copy(str, str2);
    }

    public static /* synthetic */ void getAppDeliveryStatus$annotations() {
    }

    public static /* synthetic */ void getTense$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchasehistorydata_implementation_release(StatusRemote statusRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, statusRemote.tense);
        dVar.B(serialDescriptor, 1, y02, statusRemote.appDeliveryStatus);
    }

    public final String component1() {
        return this.tense;
    }

    public final String component2() {
        return this.appDeliveryStatus;
    }

    public final c.C2661c.d convertToLocal() {
        return new c.C2661c.d(c.C2661c.d.a.Companion.a(this.appDeliveryStatus), c.C2661c.d.b.Companion.a(this.tense));
    }

    public final StatusRemote copy(String str, String str2) {
        return new StatusRemote(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusRemote)) {
            return false;
        }
        StatusRemote statusRemote = (StatusRemote) obj;
        return C17542s.e(this.tense, statusRemote.tense) && C17542s.e(this.appDeliveryStatus, statusRemote.appDeliveryStatus);
    }

    public final String getAppDeliveryStatus() {
        return this.appDeliveryStatus;
    }

    public final String getTense() {
        return this.tense;
    }

    public int hashCode() {
        String str = this.tense;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appDeliveryStatus;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.tense;
        String str2 = this.appDeliveryStatus;
        return "StatusRemote(tense=" + str + ", appDeliveryStatus=" + str2 + ")";
    }

    public StatusRemote(String str, String str2) {
        this.tense = str;
        this.appDeliveryStatus = str2;
    }
}
