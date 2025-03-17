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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 *2\u00020\u0001:\u0002+\u001eBM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0017R \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b&\u0010\"\u001a\u0004\b\u001e\u0010\u0017R \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001f\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\u0017R \u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001f\u0012\u0004\b)\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006,"}, d2 = {"Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData;", "", "", "seen0", "", "id", "startDateTime", "endDateTime", "paymentCutOffDateTime", "hardCutOffDateTime", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getId$annotations", "()V", "b", "e", "getStartDateTime$annotations", "getEndDateTime$annotations", "d", "getPaymentCutOffDateTime$annotations", "getHardCutOffDateTime$annotations", "Companion", "$serializer", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimeslotRemoteData {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120531a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120532b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120533c;

    /* renamed from: d  reason: collision with root package name */
    private final String f120534d;

    /* renamed from: e  reason: collision with root package name */
    private final String f120535e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<TimeslotRemoteData> serializer() {
            return TimeslotRemoteData$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TimeslotRemoteData(int i10, String str, String str2, String str3, String str4, String str5, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, TimeslotRemoteData$$serializer.INSTANCE.getDescriptor());
        }
        this.f120531a = str;
        this.f120532b = str2;
        this.f120533c = str3;
        this.f120534d = str4;
        this.f120535e = str5;
    }

    public static final /* synthetic */ void f(TimeslotRemoteData timeslotRemoteData, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, timeslotRemoteData.f120531a);
        dVar.y(serialDescriptor, 1, timeslotRemoteData.f120532b);
        dVar.y(serialDescriptor, 2, timeslotRemoteData.f120533c);
        dVar.y(serialDescriptor, 3, timeslotRemoteData.f120534d);
        dVar.y(serialDescriptor, 4, timeslotRemoteData.f120535e);
    }

    public final String a() {
        return this.f120533c;
    }

    public final String b() {
        return this.f120535e;
    }

    public final String c() {
        return this.f120531a;
    }

    public final String d() {
        return this.f120534d;
    }

    public final String e() {
        return this.f120532b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeslotRemoteData)) {
            return false;
        }
        TimeslotRemoteData timeslotRemoteData = (TimeslotRemoteData) obj;
        return C17542s.e(this.f120531a, timeslotRemoteData.f120531a) && C17542s.e(this.f120532b, timeslotRemoteData.f120532b) && C17542s.e(this.f120533c, timeslotRemoteData.f120533c) && C17542s.e(this.f120534d, timeslotRemoteData.f120534d) && C17542s.e(this.f120535e, timeslotRemoteData.f120535e);
    }

    public int hashCode() {
        return (((((((this.f120531a.hashCode() * 31) + this.f120532b.hashCode()) * 31) + this.f120533c.hashCode()) * 31) + this.f120534d.hashCode()) * 31) + this.f120535e.hashCode();
    }

    public String toString() {
        String str = this.f120531a;
        String str2 = this.f120532b;
        String str3 = this.f120533c;
        String str4 = this.f120534d;
        String str5 = this.f120535e;
        return "TimeslotRemoteData(id=" + str + ", startDateTime=" + str2 + ", endDateTime=" + str3 + ", paymentCutOffDateTime=" + str4 + ", hardCutOffDateTime=" + str5 + ")";
    }
}
