package com.ingka.ikea.inbox.impl.mapper;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006#"}, d2 = {"Lcom/ingka/ikea/inbox/impl/mapper/Body;", "", "", "seen0", "", "text", "Lcom/ingka/ikea/inbox/impl/mapper/Cta;", "cta", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/inbox/impl/mapper/Cta;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/inbox/impl/mapper/Body;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/inbox/impl/mapper/Cta;", "()Lcom/ingka/ikea/inbox/impl/mapper/Cta;", "Companion", "$serializer", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class Body {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f96070a;

    /* renamed from: b  reason: collision with root package name */
    private final Cta f96071b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/inbox/impl/mapper/Body$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/inbox/impl/mapper/Body;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Body> serializer() {
            return Body$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Body(int i10, String str, Cta cta, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, Body$$serializer.INSTANCE.getDescriptor());
        }
        this.f96070a = str;
        this.f96071b = cta;
    }

    public static final /* synthetic */ void c(Body body, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, body.f96070a);
        dVar.B(serialDescriptor, 1, Cta$$serializer.INSTANCE, body.f96071b);
    }

    public final Cta a() {
        return this.f96071b;
    }

    public final String b() {
        return this.f96070a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Body)) {
            return false;
        }
        Body body = (Body) obj;
        return C17542s.e(this.f96070a, body.f96070a) && C17542s.e(this.f96071b, body.f96071b);
    }

    public int hashCode() {
        int hashCode = this.f96070a.hashCode() * 31;
        Cta cta = this.f96071b;
        return hashCode + (cta == null ? 0 : cta.hashCode());
    }

    public String toString() {
        String str = this.f96070a;
        Cta cta = this.f96071b;
        return "Body(text=" + str + ", cta=" + cta + ")";
    }
}
