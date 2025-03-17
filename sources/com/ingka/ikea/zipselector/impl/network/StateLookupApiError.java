package com.ingka.ikea.zipselector.impl.network;

import fK.p;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "a", "b", "Remote", "Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError$a;", "Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError$b;", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class StateLookupApiError extends Exception {

    @p
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001aB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError$Remote;", "", "", "seen0", "", "message", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage$annotations", "()V", "Companion", "$serializer", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Remote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f120745a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Remote> serializer() {
                return StateLookupApiError$Remote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Remote(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, StateLookupApiError$Remote$$serializer.INSTANCE.getDescriptor());
            }
            this.f120745a = str;
        }

        public final String a() {
            return this.f120745a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Remote) && C17542s.e(this.f120745a, ((Remote) obj).f120745a);
        }

        public int hashCode() {
            String str = this.f120745a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f120745a;
            return "Remote(message=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError$a;", "Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError;", "", "localizedErrorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends StateLookupApiError {

        /* renamed from: a  reason: collision with root package name */
        private final String f120746a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "localizedErrorMessage");
            this.f120746a = str;
        }

        public final String a() {
            return this.f120746a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f120746a, ((a) obj).f120746a);
        }

        public int hashCode() {
            return this.f120746a.hashCode();
        }

        public String toString() {
            String str = this.f120746a;
            return "LocalizedError(localizedErrorMessage=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError$b;", "Lcom/ingka/ikea/zipselector/impl/network/StateLookupApiError;", "<init>", "()V", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends StateLookupApiError {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120747a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ StateLookupApiError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StateLookupApiError() {
    }
}
