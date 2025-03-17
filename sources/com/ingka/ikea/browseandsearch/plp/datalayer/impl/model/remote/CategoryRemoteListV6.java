package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

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
import vn.C12196a;

@p
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001b2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u001c\u0016B+\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteListV6;", "Lpp/b;", "", "Lvn/a;", "", "seen0", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteV6;", "categoriesList", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteListV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Ljava/util/List;", "a", "Ljava/util/List;", "getCategoriesList", "getCategoriesList$annotations", "()V", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CategoryRemoteListV6 implements C11768b<List<? extends C12196a>> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer<Object>[] f93383b = {new C17451f(CategoryRemoteV6$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<CategoryRemoteV6> f93384a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteListV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteListV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CategoryRemoteListV6> serializer() {
            return CategoryRemoteListV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CategoryRemoteListV6(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, CategoryRemoteListV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f93384a = list;
    }

    public List<C12196a> b() {
        Iterable<CategoryRemoteV6> iterable = this.f93384a;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (CategoryRemoteV6 a10 : iterable) {
            arrayList.add(a10.a());
        }
        return arrayList;
    }
}
