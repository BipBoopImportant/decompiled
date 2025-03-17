package com.ingka.ikea.discover.impl;

import aq.d;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00021\u0017BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010\"\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/ingka/ikea/discover/impl/InspirationRemote;", "Lpp/b;", "Laq/d;", "", "seen0", "", "filter", "title", "inspirationId", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/discover/impl/InspirationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Laq/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFilter", "getFilter$annotations", "()V", "getTitle", "getTitle$annotations", "c", "getInspirationId", "getInspirationId$annotations", "d", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "Companion", "$serializer", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class InspirationRemote implements C11768b<d> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95526a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95527b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95528c;

    /* renamed from: d  reason: collision with root package name */
    private final ImageRemote f95529d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/discover/impl/InspirationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/discover/impl/InspirationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InspirationRemote> serializer() {
            return InspirationRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InspirationRemote(int i10, String str, String str2, String str3, ImageRemote imageRemote, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, InspirationRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95526a = str;
        this.f95527b = str2;
        this.f95528c = str3;
        this.f95529d = imageRemote;
    }

    public static final /* synthetic */ void b(InspirationRemote inspirationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, inspirationRemote.f95526a);
        dVar.B(serialDescriptor, 1, y02, inspirationRemote.f95527b);
        dVar.B(serialDescriptor, 2, y02, inspirationRemote.f95528c);
        dVar.B(serialDescriptor, 3, ImageRemote$$serializer.INSTANCE, inspirationRemote.f95529d);
    }

    public d a() {
        String str = this.f95526a;
        if (str != null) {
            String str2 = this.f95527b;
            if (str2 != null) {
                String str3 = this.f95528c;
                if (str3 != null) {
                    ImageRemote imageRemote = this.f95529d;
                    if (imageRemote != null) {
                        return new d(str, str2, str3, imageRemote.c());
                    }
                    throw new IllegalArgumentException("Required value was null.");
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
        if (!(obj instanceof InspirationRemote)) {
            return false;
        }
        InspirationRemote inspirationRemote = (InspirationRemote) obj;
        return C17542s.e(this.f95526a, inspirationRemote.f95526a) && C17542s.e(this.f95527b, inspirationRemote.f95527b) && C17542s.e(this.f95528c, inspirationRemote.f95528c) && C17542s.e(this.f95529d, inspirationRemote.f95529d);
    }

    public int hashCode() {
        String str = this.f95526a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95527b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95528c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageRemote imageRemote = this.f95529d;
        if (imageRemote != null) {
            i10 = imageRemote.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f95526a;
        String str2 = this.f95527b;
        String str3 = this.f95528c;
        ImageRemote imageRemote = this.f95529d;
        return "InspirationRemote(filter=" + str + ", title=" + str2 + ", inspirationId=" + str3 + ", image=" + imageRemote + ")";
    }
}
