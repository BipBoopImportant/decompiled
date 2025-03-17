package com.ingka.ikea.liveshopping.impl.data.network.model;

import fK.p;
import hv.d;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002.\u0015B;\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001bR \u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001bR \u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010!\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\u001bR \u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010!\u0012\u0004\b,\u0010$\u001a\u0004\b+\u0010\u001b¨\u0006/"}, d2 = {"Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;", "Lpp/b;", "Lhv/d;", "", "seen0", "averageViewingTime", "totalLikes", "totalViewers", "totalViews", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IIIIILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lhv/d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAverageViewingTime", "getAverageViewingTime$annotations", "()V", "getTotalLikes", "getTotalLikes$annotations", "c", "getTotalViewers", "getTotalViewers$annotations", "d", "getTotalViews", "getTotalViews$annotations", "Companion", "$serializer", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatisticsRemote implements C11768b<d> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f96528a;

    /* renamed from: b  reason: collision with root package name */
    private final int f96529b;

    /* renamed from: c  reason: collision with root package name */
    private final int f96530c;

    /* renamed from: d  reason: collision with root package name */
    private final int f96531d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StatisticsRemote> serializer() {
            return StatisticsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StatisticsRemote(int i10, int i11, int i12, int i13, int i14, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, StatisticsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96528a = i11;
        this.f96529b = i12;
        this.f96530c = i13;
        this.f96531d = i14;
    }

    public static final /* synthetic */ void b(StatisticsRemote statisticsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, statisticsRemote.f96528a);
        dVar.w(serialDescriptor, 1, statisticsRemote.f96529b);
        dVar.w(serialDescriptor, 2, statisticsRemote.f96530c);
        dVar.w(serialDescriptor, 3, statisticsRemote.f96531d);
    }

    public d a() {
        return new d(this.f96528a, this.f96529b, this.f96530c, this.f96531d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticsRemote)) {
            return false;
        }
        StatisticsRemote statisticsRemote = (StatisticsRemote) obj;
        return this.f96528a == statisticsRemote.f96528a && this.f96529b == statisticsRemote.f96529b && this.f96530c == statisticsRemote.f96530c && this.f96531d == statisticsRemote.f96531d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f96528a) * 31) + Integer.hashCode(this.f96529b)) * 31) + Integer.hashCode(this.f96530c)) * 31) + Integer.hashCode(this.f96531d);
    }

    public String toString() {
        int i10 = this.f96528a;
        int i11 = this.f96529b;
        int i12 = this.f96530c;
        int i13 = this.f96531d;
        return "StatisticsRemote(averageViewingTime=" + i10 + ", totalLikes=" + i11 + ", totalViewers=" + i12 + ", totalViews=" + i13 + ")";
    }
}
