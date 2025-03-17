package com.ingka.ikea.feature.inspire.datalayer.impl.v6.models;

import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import zr.d;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\b\u0018\u0000 +2\u00020\u0001:\u0002,\u0017B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010#\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFilterValueRemoteV6;", "", "", "seen0", "", "name", "text", "", "selected", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFilterValueRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "facetName", "Lzr/d;", "a", "(Ljava/lang/String;)Lzr/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getText", "getText$annotations", "c", "Ljava/lang/Boolean;", "getSelected", "()Ljava/lang/Boolean;", "getSelected$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspirationFilterValueRemoteV6 {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95970a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95971b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f95972c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFilterValueRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFilterValueRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InspirationFilterValueRemoteV6> serializer() {
            return InspirationFilterValueRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InspirationFilterValueRemoteV6(int i10, String str, String str2, Boolean bool, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, InspirationFilterValueRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f95970a = str;
        this.f95971b = str2;
        this.f95972c = bool;
    }

    public static final /* synthetic */ void b(InspirationFilterValueRemoteV6 inspirationFilterValueRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, inspirationFilterValueRemoteV6.f95970a);
        dVar.B(serialDescriptor, 1, y02, inspirationFilterValueRemoteV6.f95971b);
        dVar.B(serialDescriptor, 2, C17457i.f144111a, inspirationFilterValueRemoteV6.f95972c);
    }

    public final d a(String str) {
        C17542s.j(str, "facetName");
        String str2 = this.f95970a;
        if (str2 != null) {
            String str3 = str + ":" + str2;
            String str4 = this.f95971b;
            if (str4 != null) {
                Boolean bool = this.f95972c;
                if (bool != null) {
                    return new d(str3, str4, bool.booleanValue(), (List<String>) null);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InspirationFilterValueRemoteV6)) {
            return false;
        }
        InspirationFilterValueRemoteV6 inspirationFilterValueRemoteV6 = (InspirationFilterValueRemoteV6) obj;
        return C17542s.e(this.f95970a, inspirationFilterValueRemoteV6.f95970a) && C17542s.e(this.f95971b, inspirationFilterValueRemoteV6.f95971b) && C17542s.e(this.f95972c, inspirationFilterValueRemoteV6.f95972c);
    }

    public int hashCode() {
        String str = this.f95970a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95971b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f95972c;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f95970a;
        String str2 = this.f95971b;
        Boolean bool = this.f95972c;
        return "InspirationFilterValueRemoteV6(name=" + str + ", text=" + str2 + ", selected=" + bool + ")";
    }
}
