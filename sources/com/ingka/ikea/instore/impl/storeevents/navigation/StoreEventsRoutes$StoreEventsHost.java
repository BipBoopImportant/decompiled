package com.ingka.ikea.instore.impl.storeevents.navigation;

import android.net.Uri;
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
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \"2\u00020\u0001:\u0002\u001d#B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u0016¨\u0006$"}, d2 = {"com/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$StoreEventsHost", "", "", "storeId", "eventId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$StoreEventsHost;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$StoreEventsHost;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getEventId$annotations", "()V", "Companion", "$serializer", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreEventsRoutes$StoreEventsHost {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f96276a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96277b;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$StoreEventsHost$a;", "", "<init>", "()V", "", "storeId", "eventId", "Landroid/net/Uri;", "a", "(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$StoreEventsHost;", "serializer", "()Lkotlinx/serialization/KSerializer;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String str, String str2) {
            C17542s.j(str, "storeId");
            Uri build = (str2 != null ? Uri.parse(StoreEventsRoutes$EventDetails.Companion.a()).buildUpon().appendPath(str).appendQueryParameter("eventId", str2) : Uri.parse("ikea://navigation/store_events/all_events").buildUpon().appendPath(str)).build();
            C17542s.i(build, "build(...)");
            return build;
        }

        public final KSerializer<StoreEventsRoutes$StoreEventsHost> serializer() {
            return StoreEventsRoutes$StoreEventsHost$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ StoreEventsRoutes$StoreEventsHost(int i10, String str, String str2, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, StoreEventsRoutes$StoreEventsHost$$serializer.INSTANCE.getDescriptor());
        }
        this.f96276a = str;
        if ((i10 & 2) == 0) {
            this.f96277b = null;
        } else {
            this.f96277b = str2;
        }
    }

    public static final /* synthetic */ void c(StoreEventsRoutes$StoreEventsHost storeEventsRoutes$StoreEventsHost, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, storeEventsRoutes$StoreEventsHost.f96276a);
        if (dVar.z(serialDescriptor, 1) || storeEventsRoutes$StoreEventsHost.f96277b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, storeEventsRoutes$StoreEventsHost.f96277b);
        }
    }

    public final String a() {
        return this.f96277b;
    }

    public final String b() {
        return this.f96276a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreEventsRoutes$StoreEventsHost)) {
            return false;
        }
        StoreEventsRoutes$StoreEventsHost storeEventsRoutes$StoreEventsHost = (StoreEventsRoutes$StoreEventsHost) obj;
        return C17542s.e(this.f96276a, storeEventsRoutes$StoreEventsHost.f96276a) && C17542s.e(this.f96277b, storeEventsRoutes$StoreEventsHost.f96277b);
    }

    public int hashCode() {
        int hashCode = this.f96276a.hashCode() * 31;
        String str = this.f96277b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f96276a;
        String str2 = this.f96277b;
        return "StoreEventsHost(storeId=" + str + ", eventId=" + str2 + ")";
    }

    public StoreEventsRoutes$StoreEventsHost(String str, String str2) {
        C17542s.j(str, "storeId");
        this.f96276a = str;
        this.f96277b = str2;
    }
}
