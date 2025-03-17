package com.ingka.ikea.inbox.communicationpost.impl;

import YH.C16877v;
import fK.p;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import js.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import pp.C11768b;

@p
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u0016B+\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/inbox/communicationpost/impl/CommunicationPostsRemote;", "Lpp/b;", "Ljs/e;", "", "seen0", "", "Lcom/ingka/ikea/inbox/communicationpost/impl/CommunicationPostRemote;", "items", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/inbox/communicationpost/impl/CommunicationPostsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Ljs/e;", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "()V", "Companion", "$serializer", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommunicationPostsRemote implements C11768b<e> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer<Object>[] f96001b = {new C17451f(CommunicationPostRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<CommunicationPostRemote> f96002a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/inbox/communicationpost/impl/CommunicationPostsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/inbox/communicationpost/impl/CommunicationPostsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CommunicationPostsRemote> serializer() {
            return CommunicationPostsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CommunicationPostsRemote(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, CommunicationPostsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96002a = list;
    }

    public e b() {
        ArrayList arrayList;
        List<CommunicationPostRemote> list = this.f96002a;
        if (list != null) {
            Iterable<CommunicationPostRemote> iterable = list;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (CommunicationPostRemote a10 : iterable) {
                arrayList.add(a10.a());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return new e(arrayList);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
