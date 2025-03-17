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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001eB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006("}, d2 = {"Lcom/ingka/ikea/inbox/impl/mapper/Content;", "", "", "seen0", "", "header", "Lcom/ingka/ikea/inbox/impl/mapper/Body;", "body", "Lcom/ingka/ikea/inbox/impl/mapper/Image;", "image", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/inbox/impl/mapper/Body;Lcom/ingka/ikea/inbox/impl/mapper/Image;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/inbox/impl/mapper/Content;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/inbox/impl/mapper/Body;", "()Lcom/ingka/ikea/inbox/impl/mapper/Body;", "c", "Lcom/ingka/ikea/inbox/impl/mapper/Image;", "()Lcom/ingka/ikea/inbox/impl/mapper/Image;", "Companion", "$serializer", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class Content {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f96073a;

    /* renamed from: b  reason: collision with root package name */
    private final Body f96074b;

    /* renamed from: c  reason: collision with root package name */
    private final Image f96075c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/inbox/impl/mapper/Content$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/inbox/impl/mapper/Content;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Content> serializer() {
            return Content$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Content(int i10, String str, Body body, Image image, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, Content$$serializer.INSTANCE.getDescriptor());
        }
        this.f96073a = str;
        this.f96074b = body;
        this.f96075c = image;
    }

    public static final /* synthetic */ void d(Content content, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, content.f96073a);
        dVar.i(serialDescriptor, 1, Body$$serializer.INSTANCE, content.f96074b);
        dVar.i(serialDescriptor, 2, Image$$serializer.INSTANCE, content.f96075c);
    }

    public final Body a() {
        return this.f96074b;
    }

    public final String b() {
        return this.f96073a;
    }

    public final Image c() {
        return this.f96075c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return C17542s.e(this.f96073a, content.f96073a) && C17542s.e(this.f96074b, content.f96074b) && C17542s.e(this.f96075c, content.f96075c);
    }

    public int hashCode() {
        return (((this.f96073a.hashCode() * 31) + this.f96074b.hashCode()) * 31) + this.f96075c.hashCode();
    }

    public String toString() {
        String str = this.f96073a;
        Body body = this.f96074b;
        Image image = this.f96075c;
        return "Content(header=" + str + ", body=" + body + ", image=" + image + ")";
    }
}
