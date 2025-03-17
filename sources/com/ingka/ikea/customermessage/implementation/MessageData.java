package com.ingka.ikea.customermessage.implementation;

import fK.p;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0012B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/customermessage/implementation/MessageData;", "", "", "seen0", "Lcom/ingka/ikea/customermessage/implementation/MessageContent;", "content", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/customermessage/implementation/MessageContent;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/customermessage/implementation/MessageData;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Lcom/ingka/ikea/customermessage/implementation/MessageContent;", "()Lcom/ingka/ikea/customermessage/implementation/MessageContent;", "getContent$annotations", "()V", "Companion", "$serializer", "customermessage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageData {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final MessageContent f95452a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/customermessage/implementation/MessageData$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/customermessage/implementation/MessageData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "customermessage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MessageData> serializer() {
            return MessageData$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MessageData(int i10, MessageContent messageContent, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, MessageData$$serializer.INSTANCE.getDescriptor());
        }
        this.f95452a = messageContent;
    }

    public final MessageContent a() {
        return this.f95452a;
    }
}
