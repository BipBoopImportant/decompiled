package com.ingka.ikea.store.impl.data.remotemodel;

import GB.f;
import YH.C16877v;
import fK.p;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002' B+\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesTrendRemote;", "Lpp/b;", "LGB/f;", "", "seen0", "", "Lcom/ingka/ikea/store/impl/data/remotemodel/WeekdayTrendRemote;", "weekdayTrends", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesTrendRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LGB/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getWeekdayTrends", "()Ljava/util/List;", "getWeekdayTrends$annotations", "()V", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PopularTimesTrendRemote implements C11768b<f> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer<Object>[] f120432b = {new C17451f(WeekdayTrendRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<WeekdayTrendRemote> f120433a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesTrendRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/PopularTimesTrendRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PopularTimesTrendRemote> serializer() {
            return PopularTimesTrendRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PopularTimesTrendRemote(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, PopularTimesTrendRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120433a = list;
    }

    public f b() {
        Iterable<WeekdayTrendRemote> iterable = this.f120433a;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (WeekdayTrendRemote b10 : iterable) {
            arrayList.add(b10.b());
        }
        return new f(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PopularTimesTrendRemote) && C17542s.e(this.f120433a, ((PopularTimesTrendRemote) obj).f120433a);
    }

    public int hashCode() {
        return this.f120433a.hashCode();
    }

    public String toString() {
        List<WeekdayTrendRemote> list = this.f120433a;
        return "PopularTimesTrendRemote(weekdayTrends=" + list + ")";
    }
}
