package com.ingka.ikea.store.impl.data.remotemodel;

import GB.e;
import fK.p;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%\u0013B%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesLiveRemote;", "Lpp/b;", "LGB/e;", "", "seen0", "Lcom/ingka/ikea/store/impl/data/remotemodel/LiveRemote;", "live", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/store/impl/data/remotemodel/LiveRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesLiveRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LGB/e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/store/impl/data/remotemodel/LiveRemote;", "getLive", "()Lcom/ingka/ikea/store/impl/data/remotemodel/LiveRemote;", "getLive$annotations", "()V", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PopularTimesLiveRemote implements C11768b<e> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final LiveRemote f120431a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesLiveRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesLiveRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PopularTimesLiveRemote> serializer() {
            return PopularTimesLiveRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PopularTimesLiveRemote(int i10, LiveRemote liveRemote, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, PopularTimesLiveRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120431a = liveRemote;
    }

    public e a() {
        return this.f120431a.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PopularTimesLiveRemote) && C17542s.e(this.f120431a, ((PopularTimesLiveRemote) obj).f120431a);
    }

    public int hashCode() {
        return this.f120431a.hashCode();
    }

    public String toString() {
        LiveRemote liveRemote = this.f120431a;
        return "PopularTimesLiveRemote(live=" + liveRemote + ")";
    }
}
