package com.ingka.ikea.core.remotemodel;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kp.j;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)\u0015B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0018R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;", "Lpp/b;", "Lkp/j;", "", "seen0", "", "name", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "icon", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lkp/j;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getIcon", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getIcon$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferenceImageSourceRemote implements C11768b<j> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95231a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageRemote f95232b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReferenceImageSourceRemote> serializer() {
            return ReferenceImageSourceRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReferenceImageSourceRemote(int i10, String str, ImageRemote imageRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ReferenceImageSourceRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95231a = str;
        this.f95232b = imageRemote;
    }

    public static final /* synthetic */ void b(ReferenceImageSourceRemote referenceImageSourceRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, referenceImageSourceRemote.f95231a);
        dVar.i(serialDescriptor, 1, ImageRemote$$serializer.INSTANCE, referenceImageSourceRemote.f95232b);
    }

    public j a() {
        return new j(this.f95231a, this.f95232b.c());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferenceImageSourceRemote)) {
            return false;
        }
        ReferenceImageSourceRemote referenceImageSourceRemote = (ReferenceImageSourceRemote) obj;
        return C17542s.e(this.f95231a, referenceImageSourceRemote.f95231a) && C17542s.e(this.f95232b, referenceImageSourceRemote.f95232b);
    }

    public int hashCode() {
        return (this.f95231a.hashCode() * 31) + this.f95232b.hashCode();
    }

    public String toString() {
        String str = this.f95231a;
        ImageRemote imageRemote = this.f95232b;
        return "ReferenceImageSourceRemote(name=" + str + ", icon=" + imageRemote + ")";
    }
}
