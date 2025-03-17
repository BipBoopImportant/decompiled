package com.ingka.ikea.store.datalayer.impl.network.model;

import EB.C12831c;
import YH.C16877v;
import fK.p;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import pp.C11768b;

@p
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001b2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u001c\u0016B+\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreListResponseRemote;", "Lpp/b;", "", "LEB/c;", "", "seen0", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote;", "stores", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreListResponseRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Ljava/util/List;", "a", "Ljava/util/List;", "getStores", "getStores$annotations", "()V", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreListResponseRemote implements C11768b<List<? extends C12831c>> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer<Object>[] f120385b = {new C17451f(StoreRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<StoreRemote> f120386a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreListResponseRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreListResponseRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoreListResponseRemote> serializer() {
            return StoreListResponseRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoreListResponseRemote(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, StoreListResponseRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120386a = list;
    }

    public List<C12831c> b() {
        Iterable<StoreRemote> iterable = this.f120386a;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (StoreRemote b10 : iterable) {
            arrayList.add(b10.b());
        }
        return arrayList;
    }
}
