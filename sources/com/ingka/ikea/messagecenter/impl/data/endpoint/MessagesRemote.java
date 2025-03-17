package com.ingka.ikea.messagecenter.impl.data.endpoint;

import fK.p;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u001e¨\u0006#"}, d2 = {"Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessagesRemote;", "", "Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessageListsRemote;", "messages", "<init>", "(Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessageListsRemote;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/messagecenter/impl/data/endpoint/MessageListsRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessagesRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessageListsRemote;", "()Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessageListsRemote;", "getMessages$annotations", "()V", "Companion", "$serializer", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagesRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final MessageListsRemote f72323a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessagesRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessagesRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MessagesRemote> serializer() {
            return MessagesRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MessagesRemote(int i10, MessageListsRemote messageListsRemote, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, MessagesRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f72323a = messageListsRemote;
    }

    public final MessageListsRemote a() {
        return this.f72323a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesRemote) && C17542s.e(this.f72323a, ((MessagesRemote) obj).f72323a);
    }

    public int hashCode() {
        return this.f72323a.hashCode();
    }

    public String toString() {
        MessageListsRemote messageListsRemote = this.f72323a;
        return "MessagesRemote(messages=" + messageListsRemote + ")";
    }

    public MessagesRemote(MessageListsRemote messageListsRemote) {
        C17542s.j(messageListsRemote, "messages");
        this.f72323a = messageListsRemote;
    }
}
