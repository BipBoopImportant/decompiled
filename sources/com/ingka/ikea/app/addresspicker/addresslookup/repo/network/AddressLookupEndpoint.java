package com.ingka.ikea.app.addresspicker.addresslookup.repo.network;

import VL.C16699a;
import VL.o;
import com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress;
import dI.C17164e;
import fK.p;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\bJ \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint;", "", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint$SearchBody;", "searchBody", "", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress$Remote;", "a", "(Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint$SearchBody;LdI/e;)Ljava/lang/Object;", "SearchBody", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AddressLookupEndpoint {

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint$SearchBody;", "", "", "query", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint$SearchBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuery", "getQuery$annotations", "()V", "Companion", "$serializer", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f70003a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint$SearchBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/network/AddressLookupEndpoint$SearchBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<SearchBody> serializer() {
                return AddressLookupEndpoint$SearchBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ SearchBody(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, AddressLookupEndpoint$SearchBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f70003a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchBody) && C17542s.e(this.f70003a, ((SearchBody) obj).f70003a);
        }

        public int hashCode() {
            return this.f70003a.hashCode();
        }

        public String toString() {
            String str = this.f70003a;
            return "SearchBody(query=" + str + ")";
        }

        public SearchBody(String str) {
            C17542s.j(str, "query");
            this.f70003a = str;
        }
    }

    @o("checkout/v6/{cc}/{lc}/address/suggestions")
    Object a(@C16699a SearchBody searchBody, C17164e<? super List<PostalCodeAddress.Remote>> eVar);
}
