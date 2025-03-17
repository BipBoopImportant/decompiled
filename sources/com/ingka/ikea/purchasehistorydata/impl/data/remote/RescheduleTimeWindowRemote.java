package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\b\u0018\u0000 22\u00020\u0001:\u00023 BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010$\u001a\u0004\b \u0010)R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010!\u0012\u0004\b,\u0010$\u001a\u0004\b+\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u0010$\u001a\u0004\b-\u0010/R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010.\u0012\u0004\b1\u0010$\u001a\u0004\b'\u0010/¨\u00064"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/RescheduleTimeWindowRemote;", "", "", "seen0", "", "id", "dateTimeRange", "", "atlPermitted", "timeZone", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/TimeWindowDateTimeRemote;", "startDateTime", "endDateTime", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/TimeWindowDateTimeRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/TimeWindowDateTimeRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/RescheduleTimeWindowRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "getId$annotations", "()V", "b", "getDateTimeRange$annotations", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getAtlPermitted$annotations", "f", "getTimeZone$annotations", "e", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/TimeWindowDateTimeRemote;", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/TimeWindowDateTimeRemote;", "getStartDateTime$annotations", "getEndDateTime$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RescheduleTimeWindowRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f119567a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119568b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f119569c;

    /* renamed from: d  reason: collision with root package name */
    private final String f119570d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeWindowDateTimeRemote f119571e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeWindowDateTimeRemote f119572f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/RescheduleTimeWindowRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/RescheduleTimeWindowRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RescheduleTimeWindowRemote> serializer() {
            return RescheduleTimeWindowRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RescheduleTimeWindowRemote(int i10, String str, String str2, Boolean bool, String str3, TimeWindowDateTimeRemote timeWindowDateTimeRemote, TimeWindowDateTimeRemote timeWindowDateTimeRemote2, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, RescheduleTimeWindowRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119567a = str;
        this.f119568b = str2;
        this.f119569c = bool;
        this.f119570d = str3;
        this.f119571e = timeWindowDateTimeRemote;
        this.f119572f = timeWindowDateTimeRemote2;
    }

    public static final /* synthetic */ void g(RescheduleTimeWindowRemote rescheduleTimeWindowRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, rescheduleTimeWindowRemote.f119567a);
        dVar.B(serialDescriptor, 1, y02, rescheduleTimeWindowRemote.f119568b);
        dVar.B(serialDescriptor, 2, C17457i.f144111a, rescheduleTimeWindowRemote.f119569c);
        dVar.B(serialDescriptor, 3, y02, rescheduleTimeWindowRemote.f119570d);
        TimeWindowDateTimeRemote$$serializer timeWindowDateTimeRemote$$serializer = TimeWindowDateTimeRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 4, timeWindowDateTimeRemote$$serializer, rescheduleTimeWindowRemote.f119571e);
        dVar.B(serialDescriptor, 5, timeWindowDateTimeRemote$$serializer, rescheduleTimeWindowRemote.f119572f);
    }

    public final Boolean a() {
        return this.f119569c;
    }

    public final String b() {
        return this.f119568b;
    }

    public final TimeWindowDateTimeRemote c() {
        return this.f119572f;
    }

    public final String d() {
        return this.f119567a;
    }

    public final TimeWindowDateTimeRemote e() {
        return this.f119571e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RescheduleTimeWindowRemote)) {
            return false;
        }
        RescheduleTimeWindowRemote rescheduleTimeWindowRemote = (RescheduleTimeWindowRemote) obj;
        return C17542s.e(this.f119567a, rescheduleTimeWindowRemote.f119567a) && C17542s.e(this.f119568b, rescheduleTimeWindowRemote.f119568b) && C17542s.e(this.f119569c, rescheduleTimeWindowRemote.f119569c) && C17542s.e(this.f119570d, rescheduleTimeWindowRemote.f119570d) && C17542s.e(this.f119571e, rescheduleTimeWindowRemote.f119571e) && C17542s.e(this.f119572f, rescheduleTimeWindowRemote.f119572f);
    }

    public final String f() {
        return this.f119570d;
    }

    public int hashCode() {
        String str = this.f119567a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f119568b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f119569c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f119570d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TimeWindowDateTimeRemote timeWindowDateTimeRemote = this.f119571e;
        int hashCode5 = (hashCode4 + (timeWindowDateTimeRemote == null ? 0 : timeWindowDateTimeRemote.hashCode())) * 31;
        TimeWindowDateTimeRemote timeWindowDateTimeRemote2 = this.f119572f;
        if (timeWindowDateTimeRemote2 != null) {
            i10 = timeWindowDateTimeRemote2.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        String str = this.f119567a;
        String str2 = this.f119568b;
        Boolean bool = this.f119569c;
        String str3 = this.f119570d;
        TimeWindowDateTimeRemote timeWindowDateTimeRemote = this.f119571e;
        TimeWindowDateTimeRemote timeWindowDateTimeRemote2 = this.f119572f;
        return "RescheduleTimeWindowRemote(id=" + str + ", dateTimeRange=" + str2 + ", atlPermitted=" + bool + ", timeZone=" + str3 + ", startDateTime=" + timeWindowDateTimeRemote + ", endDateTime=" + timeWindowDateTimeRemote2 + ")";
    }
}
