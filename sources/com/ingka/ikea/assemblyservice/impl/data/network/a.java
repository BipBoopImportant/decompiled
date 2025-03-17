package com.ingka.ikea.assemblyservice.impl.data.network;

import dI.C17164e;
import fm.C11273a;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0002\b\nJ&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/a;", "", "", "zipCode", "", "Lcom/ingka/ikea/assemblyservice/impl/data/network/a$a;", "items", "Lfm/a;", "a", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "b", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/a$a;", "", "", "itemNo", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.assemblyservice.impl.data.network.a$a  reason: collision with other inner class name */
    public static final class C2069a {

        /* renamed from: a  reason: collision with root package name */
        private final String f93047a;

        /* renamed from: b  reason: collision with root package name */
        private final int f93048b;

        public C2069a(String str, int i10) {
            C17542s.j(str, "itemNo");
            this.f93047a = str;
            this.f93048b = i10;
        }

        public final String a() {
            return this.f93047a;
        }

        public final int b() {
            return this.f93048b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2069a)) {
                return false;
            }
            C2069a aVar = (C2069a) obj;
            return C17542s.e(this.f93047a, aVar.f93047a) && this.f93048b == aVar.f93048b;
        }

        public int hashCode() {
            return (this.f93047a.hashCode() * 31) + Integer.hashCode(this.f93048b);
        }

        public String toString() {
            String str = this.f93047a;
            int i10 = this.f93048b;
            return "AssemblyRequestItem(itemNo=" + str + ", quantity=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/a$b;", "Ljava/io/IOException;", "<init>", "()V", "b", "a", "Lcom/ingka/ikea/assemblyservice/impl/data/network/a$b$a;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/a$b$b;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b extends IOException {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/a$b$a;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.assemblyservice.impl.data.network.a$b$a  reason: collision with other inner class name */
        public static final class C2070a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C2070a f93049a = new C2070a();

            private C2070a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2070a);
            }

            public int hashCode() {
                return 1118774025;
            }

            public String toString() {
                return "Generic";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/a$b$b;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.assemblyservice.impl.data.network.a$b$b  reason: collision with other inner class name */
        public static final class C2071b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C2071b f93050a = new C2071b();

            private C2071b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2071b);
            }

            public int hashCode() {
                return -606397850;
            }

            public String toString() {
                return "NoService";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    Object a(String str, List<C2069a> list, C17164e<? super C11273a> eVar);
}
