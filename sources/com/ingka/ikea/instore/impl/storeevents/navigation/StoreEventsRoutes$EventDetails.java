package com.ingka.ikea.instore.impl.storeevents.navigation;

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
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 !2\u00020\u0001:\u0002\u001d\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u0016¨\u0006#"}, d2 = {"com/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventDetails", "", "", "storeId", "eventId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventDetails;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventDetails;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Companion", "$serializer", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreEventsRoutes$EventDetails {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f96267c = "ikea://navigation/store_events/event";

    /* renamed from: a  reason: collision with root package name */
    private final String f96268a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96269b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0006XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventDetails$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "deeplinkBasePath", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return StoreEventsRoutes$EventDetails.f96267c;
        }

        public final KSerializer<StoreEventsRoutes$EventDetails> serializer() {
            return StoreEventsRoutes$EventDetails$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ StoreEventsRoutes$EventDetails(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, StoreEventsRoutes$EventDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.f96268a = str;
        this.f96269b = str2;
    }

    public static final /* synthetic */ void d(StoreEventsRoutes$EventDetails storeEventsRoutes$EventDetails, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, storeEventsRoutes$EventDetails.f96268a);
        dVar.y(serialDescriptor, 1, storeEventsRoutes$EventDetails.f96269b);
    }

    public final String b() {
        return this.f96269b;
    }

    public final String c() {
        return this.f96268a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreEventsRoutes$EventDetails)) {
            return false;
        }
        StoreEventsRoutes$EventDetails storeEventsRoutes$EventDetails = (StoreEventsRoutes$EventDetails) obj;
        return C17542s.e(this.f96268a, storeEventsRoutes$EventDetails.f96268a) && C17542s.e(this.f96269b, storeEventsRoutes$EventDetails.f96269b);
    }

    public int hashCode() {
        return (this.f96268a.hashCode() * 31) + this.f96269b.hashCode();
    }

    public String toString() {
        String str = this.f96268a;
        String str2 = this.f96269b;
        return "EventDetails(storeId=" + str + ", eventId=" + str2 + ")";
    }

    public StoreEventsRoutes$EventDetails(String str, String str2) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "eventId");
        this.f96268a = str;
        this.f96269b = str2;
    }
}
