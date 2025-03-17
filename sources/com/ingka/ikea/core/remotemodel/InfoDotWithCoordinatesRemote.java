package com.ingka.ikea.core.remotemodel;

import com.ingka.ikea.InfoDotWithCoordinates;
import com.ingka.ikea.core.remotemodel.product.CoordinatesRemoteV6;
import com.ingka.ikea.core.remotemodel.product.CoordinatesRemoteV6$$serializer;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+\u0015B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/InfoDotWithCoordinatesRemote;", "Lpp/b;", "Lcom/ingka/ikea/InfoDotWithCoordinates;", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/product/CoordinatesRemoteV6;", "coordinatesRemote", "Lcom/ingka/ikea/core/remotemodel/InfoDotRemote;", "infoDot", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/product/CoordinatesRemoteV6;Lcom/ingka/ikea/core/remotemodel/InfoDotRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/InfoDotWithCoordinatesRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/InfoDotWithCoordinates;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/core/remotemodel/product/CoordinatesRemoteV6;", "getCoordinatesRemote", "()Lcom/ingka/ikea/core/remotemodel/product/CoordinatesRemoteV6;", "getCoordinatesRemote$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/InfoDotRemote;", "getInfoDot", "()Lcom/ingka/ikea/core/remotemodel/InfoDotRemote;", "getInfoDot$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InfoDotWithCoordinatesRemote implements C11768b<InfoDotWithCoordinates> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatesRemoteV6 f95200a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoDotRemote f95201b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/InfoDotWithCoordinatesRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/InfoDotWithCoordinatesRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InfoDotWithCoordinatesRemote> serializer() {
            return InfoDotWithCoordinatesRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InfoDotWithCoordinatesRemote(int i10, CoordinatesRemoteV6 coordinatesRemoteV6, InfoDotRemote infoDotRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, InfoDotWithCoordinatesRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95200a = coordinatesRemoteV6;
        this.f95201b = infoDotRemote;
    }

    public static final /* synthetic */ void b(InfoDotWithCoordinatesRemote infoDotWithCoordinatesRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, CoordinatesRemoteV6$$serializer.INSTANCE, infoDotWithCoordinatesRemote.f95200a);
        dVar.i(serialDescriptor, 1, InfoDotRemote$$serializer.INSTANCE, infoDotWithCoordinatesRemote.f95201b);
    }

    public InfoDotWithCoordinates a() {
        return new InfoDotWithCoordinates(this.f95200a.a(), this.f95201b.a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoDotWithCoordinatesRemote)) {
            return false;
        }
        InfoDotWithCoordinatesRemote infoDotWithCoordinatesRemote = (InfoDotWithCoordinatesRemote) obj;
        return C17542s.e(this.f95200a, infoDotWithCoordinatesRemote.f95200a) && C17542s.e(this.f95201b, infoDotWithCoordinatesRemote.f95201b);
    }

    public int hashCode() {
        return (this.f95200a.hashCode() * 31) + this.f95201b.hashCode();
    }

    public String toString() {
        CoordinatesRemoteV6 coordinatesRemoteV6 = this.f95200a;
        InfoDotRemote infoDotRemote = this.f95201b;
        return "InfoDotWithCoordinatesRemote(coordinatesRemote=" + coordinatesRemoteV6 + ", infoDot=" + infoDotRemote + ")";
    }
}
