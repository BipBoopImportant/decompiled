package com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.endpoint;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0003$%\u001dB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest;", "", "", "Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest$FullServeWaitingTimeItem;", "items", "<init>", "(Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "()V", "Companion", "FullServeWaitingTimeItem", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FullServeWaitingTimeRequest {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer<Object>[] f119906b = {new C17451f(FullServeWaitingTimeRequest$FullServeWaitingTimeItem$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<FullServeWaitingTimeItem> f119907a;

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest$FullServeWaitingTimeItem;", "", "", "articleNumber", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest$FullServeWaitingTimeItem;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArticleNumber", "getArticleNumber$annotations", "()V", "b", "I", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FullServeWaitingTimeItem {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119908a;

        /* renamed from: b  reason: collision with root package name */
        private final int f119909b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest$FullServeWaitingTimeItem$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest$FullServeWaitingTimeItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<FullServeWaitingTimeItem> serializer() {
                return FullServeWaitingTimeRequest$FullServeWaitingTimeItem$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FullServeWaitingTimeItem(int i10, String str, int i11, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, FullServeWaitingTimeRequest$FullServeWaitingTimeItem$$serializer.INSTANCE.getDescriptor());
            }
            this.f119908a = str;
            this.f119909b = i11;
        }

        public static final /* synthetic */ void a(FullServeWaitingTimeItem fullServeWaitingTimeItem, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, fullServeWaitingTimeItem.f119908a);
            dVar.w(serialDescriptor, 1, fullServeWaitingTimeItem.f119909b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FullServeWaitingTimeItem)) {
                return false;
            }
            FullServeWaitingTimeItem fullServeWaitingTimeItem = (FullServeWaitingTimeItem) obj;
            return C17542s.e(this.f119908a, fullServeWaitingTimeItem.f119908a) && this.f119909b == fullServeWaitingTimeItem.f119909b;
        }

        public int hashCode() {
            return (this.f119908a.hashCode() * 31) + Integer.hashCode(this.f119909b);
        }

        public String toString() {
            String str = this.f119908a;
            int i10 = this.f119909b;
            return "FullServeWaitingTimeItem(articleNumber=" + str + ", quantity=" + i10 + ")";
        }

        public FullServeWaitingTimeItem(String str, int i10) {
            C17542s.j(str, "articleNumber");
            this.f119908a = str;
            this.f119909b = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FullServeWaitingTimeRequest> serializer() {
            return FullServeWaitingTimeRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FullServeWaitingTimeRequest(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, FullServeWaitingTimeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.f119907a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FullServeWaitingTimeRequest) && C17542s.e(this.f119907a, ((FullServeWaitingTimeRequest) obj).f119907a);
    }

    public int hashCode() {
        return this.f119907a.hashCode();
    }

    public String toString() {
        List<FullServeWaitingTimeItem> list = this.f119907a;
        return "FullServeWaitingTimeRequest(items=" + list + ")";
    }

    public FullServeWaitingTimeRequest(List<FullServeWaitingTimeItem> list) {
        C17542s.j(list, "items");
        this.f119907a = list;
    }
}
