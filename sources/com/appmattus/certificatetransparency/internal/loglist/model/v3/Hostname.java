package com.appmattus.certificatetransparency.internal.loglist.model.v3;

import GK.C15803v;
import f7.C7858a;
import fK.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p(with = C7858a.class)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Hostname;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Hostname {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String value;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Hostname$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Hostname;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<Hostname> serializer() {
            return new C7858a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Hostname(String str) {
        C17542s.j(str, "value");
        this.value = str;
        C15803v.b bVar = C15803v.f135109k;
        bVar.d("http://" + str).i();
    }

    public static /* synthetic */ Hostname copy$default(Hostname hostname, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hostname.value;
        }
        return hostname.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final Hostname copy(String str) {
        C17542s.j(str, "value");
        return new Hostname(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Hostname) && C17542s.e(this.value, ((Hostname) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "Hostname(value=" + this.value + ')';
    }
}
