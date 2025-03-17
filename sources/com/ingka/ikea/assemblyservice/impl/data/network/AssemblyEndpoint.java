package com.ingka.ikea.assemblyservice.impl.data.network;

import QL.x;
import VL.C16699a;
import VL.o;
import com.ingka.ikea.assemblyservice.impl.data.network.model.AssemblyServiceDetailsRemote;
import dI.C17164e;
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

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\bJ \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint;", "", "Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody;", "data", "LQL/x;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote;", "a", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody;LdI/e;)Ljava/lang/Object;", "AssemblyRequestBody", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AssemblyEndpoint {

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 '2\u00020\u0001:\u0003()\u001eB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody;", "", "", "zipCode", "", "Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody$RequestItem;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getZipCode", "getZipCode$annotations", "()V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "Companion", "RequestItem", "$serializer", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AssemblyRequestBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final KSerializer<Object>[] f93042c = {null, new C17451f(AssemblyEndpoint$AssemblyRequestBody$RequestItem$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final String f93043a;

        /* renamed from: b  reason: collision with root package name */
        private final List<RequestItem> f93044b;

        @p
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody$RequestItem;", "", "", "itemNo", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody$RequestItem;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemNo", "getItemNo$annotations", "()V", "b", "I", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RequestItem {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f93045a;

            /* renamed from: b  reason: collision with root package name */
            private final int f93046b;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody$RequestItem$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody$RequestItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<RequestItem> serializer() {
                    return AssemblyEndpoint$AssemblyRequestBody$RequestItem$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ RequestItem(int i10, String str, int i11, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, AssemblyEndpoint$AssemblyRequestBody$RequestItem$$serializer.INSTANCE.getDescriptor());
                }
                this.f93045a = str;
                this.f93046b = i11;
            }

            public static final /* synthetic */ void a(RequestItem requestItem, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.y(serialDescriptor, 0, requestItem.f93045a);
                dVar.w(serialDescriptor, 1, requestItem.f93046b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequestItem)) {
                    return false;
                }
                RequestItem requestItem = (RequestItem) obj;
                return C17542s.e(this.f93045a, requestItem.f93045a) && this.f93046b == requestItem.f93046b;
            }

            public int hashCode() {
                return (this.f93045a.hashCode() * 31) + Integer.hashCode(this.f93046b);
            }

            public String toString() {
                String str = this.f93045a;
                int i10 = this.f93046b;
                return "RequestItem(itemNo=" + str + ", quantity=" + i10 + ")";
            }

            public RequestItem(String str, int i10) {
                C17542s.j(str, "itemNo");
                this.f93045a = str;
                this.f93046b = i10;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint$AssemblyRequestBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AssemblyRequestBody> serializer() {
                return AssemblyEndpoint$AssemblyRequestBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AssemblyRequestBody(int i10, String str, List list, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, AssemblyEndpoint$AssemblyRequestBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93043a = str;
            this.f93044b = list;
        }

        public static final /* synthetic */ void b(AssemblyRequestBody assemblyRequestBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f93042c;
            dVar.y(serialDescriptor, 0, assemblyRequestBody.f93043a);
            dVar.i(serialDescriptor, 1, kSerializerArr[1], assemblyRequestBody.f93044b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssemblyRequestBody)) {
                return false;
            }
            AssemblyRequestBody assemblyRequestBody = (AssemblyRequestBody) obj;
            return C17542s.e(this.f93043a, assemblyRequestBody.f93043a) && C17542s.e(this.f93044b, assemblyRequestBody.f93044b);
        }

        public int hashCode() {
            return (this.f93043a.hashCode() * 31) + this.f93044b.hashCode();
        }

        public String toString() {
            String str = this.f93043a;
            List<RequestItem> list = this.f93044b;
            return "AssemblyRequestBody(zipCode=" + str + ", items=" + list + ")";
        }

        public AssemblyRequestBody(String str, List<RequestItem> list) {
            C17542s.j(str, "zipCode");
            C17542s.j(list, "items");
            this.f93043a = str;
            this.f93044b = list;
        }
    }

    @o("checkout/v6/{cc}/{lc}/assembly-service")
    Object a(@C16699a AssemblyRequestBody assemblyRequestBody, C17164e<? super x<AssemblyServiceDetailsRemote>> eVar);
}
