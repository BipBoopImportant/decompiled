package com.ingka.ikea.core.remotemodel;

import com.ingka.ikea.InfoDot;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)\u0016B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b#\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/InfoDotRemote;", "Lpp/b;", "Lcom/ingka/ikea/InfoDot;", "", "seen0", "", "header", "text", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "icon", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/InfoDotRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/InfoDot;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getText", "c", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getIcon", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InfoDotRemote implements C11768b<InfoDot> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95197a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95198b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageRemote f95199c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/InfoDotRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/InfoDotRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InfoDotRemote> serializer() {
            return InfoDotRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InfoDotRemote(int i10, String str, String str2, ImageRemote imageRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, InfoDotRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95197a = str;
        this.f95198b = str2;
        this.f95199c = imageRemote;
    }

    public static final /* synthetic */ void b(InfoDotRemote infoDotRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, infoDotRemote.f95197a);
        dVar.y(serialDescriptor, 1, infoDotRemote.f95198b);
        dVar.i(serialDescriptor, 2, ImageRemote$$serializer.INSTANCE, infoDotRemote.f95199c);
    }

    public InfoDot a() {
        return new InfoDot(this.f95197a, this.f95198b, this.f95199c.c());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoDotRemote)) {
            return false;
        }
        InfoDotRemote infoDotRemote = (InfoDotRemote) obj;
        return C17542s.e(this.f95197a, infoDotRemote.f95197a) && C17542s.e(this.f95198b, infoDotRemote.f95198b) && C17542s.e(this.f95199c, infoDotRemote.f95199c);
    }

    public int hashCode() {
        return (((this.f95197a.hashCode() * 31) + this.f95198b.hashCode()) * 31) + this.f95199c.hashCode();
    }

    public String toString() {
        String str = this.f95197a;
        String str2 = this.f95198b;
        ImageRemote imageRemote = this.f95199c;
        return "InfoDotRemote(header=" + str + ", text=" + str2 + ", icon=" + imageRemote + ")";
    }
}
