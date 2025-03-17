package com.ingka.ikea.appconfig.impl.service.network;

import Rl.d;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 %2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002& B+\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006'"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/MarketListRemote;", "Lpp/b;", "", "LRl/d;", "", "seen0", "Lcom/ingka/ikea/appconfig/impl/service/network/MarketRemote;", "markets", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/appconfig/impl/service/network/MarketListRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getMarkets", "getMarkets$annotations", "()V", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MarketListRemote implements C11768b<List<? extends d>> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer<Object>[] f92948b = {new C17451f(MarketRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<MarketRemote> f92949a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/MarketListRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/MarketListRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MarketListRemote> serializer() {
            return MarketListRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MarketListRemote(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, MarketListRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92949a = list;
    }

    public List<d> b() {
        List<MarketRemote> list = this.f92949a;
        if (list == null) {
            return C16877v.n();
        }
        Iterable<MarketRemote> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (MarketRemote b10 : iterable) {
            arrayList.add(b10.b());
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketListRemote) && C17542s.e(this.f92949a, ((MarketListRemote) obj).f92949a);
    }

    public int hashCode() {
        List<MarketRemote> list = this.f92949a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<MarketRemote> list = this.f92949a;
        return "MarketListRemote(markets=" + list + ")";
    }
}
