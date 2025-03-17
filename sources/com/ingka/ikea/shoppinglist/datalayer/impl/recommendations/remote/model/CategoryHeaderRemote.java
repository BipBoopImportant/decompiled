package com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u0013B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0015R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u0012\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/CategoryHeaderRemote;", "", "", "seen0", "", "id", "title", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/CategoryHeaderRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "getId$annotations", "()V", "b", "getTitle$annotations", "Companion", "$serializer", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CategoryHeaderRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120301a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120302b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/CategoryHeaderRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/CategoryHeaderRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CategoryHeaderRemote> serializer() {
            return CategoryHeaderRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CategoryHeaderRemote(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, CategoryHeaderRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120301a = str;
        this.f120302b = str2;
    }

    public static final /* synthetic */ void c(CategoryHeaderRemote categoryHeaderRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, categoryHeaderRemote.f120301a);
        dVar.y(serialDescriptor, 1, categoryHeaderRemote.f120302b);
    }

    public final String a() {
        return this.f120301a;
    }

    public final String b() {
        return this.f120302b;
    }
}
