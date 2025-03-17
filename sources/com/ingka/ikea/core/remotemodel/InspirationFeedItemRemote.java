package com.ingka.ikea.core.remotemodel;

import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.inspiration.InspirationType;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.M;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mp.C11588a;
import pp.C11768b;
import qp.C11803a;

@p
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\b\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002A'Ba\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b'\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010/\u0012\u0004\b2\u0010+\u001a\u0004\b0\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010/\u0012\u0004\b4\u0010+\u001a\u0004\b3\u00101R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010(\u0012\u0004\b7\u0010+\u001a\u0004\b6\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010(\u0012\u0004\b:\u0010+\u001a\u0004\b9\u0010\u001fR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010+\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote;", "Lpp/b;", "Lmp/a;", "", "seen0", "", "inspirationId", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "", "heightFactor", "aspectRatio", "name", "type", "Lcom/ingka/ikea/core/remotemodel/SourceRemote;", "source", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/SourceRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()Lmp/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getInspirationId$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "Ljava/lang/Float;", "getHeightFactor", "()Ljava/lang/Float;", "getHeightFactor$annotations", "getAspectRatio", "getAspectRatio$annotations", "e", "getName", "getName$annotations", "f", "getType", "getType$annotations", "g", "Lcom/ingka/ikea/core/remotemodel/SourceRemote;", "getSource", "()Lcom/ingka/ikea/core/remotemodel/SourceRemote;", "getSource$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspirationFeedItemRemote implements C11768b<C11588a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95204a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageRemote f95205b;

    /* renamed from: c  reason: collision with root package name */
    private final Float f95206c;

    /* renamed from: d  reason: collision with root package name */
    private final Float f95207d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95208e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95209f;

    /* renamed from: g  reason: collision with root package name */
    private final SourceRemote f95210g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InspirationFeedItemRemote> serializer() {
            return InspirationFeedItemRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InspirationFeedItemRemote(int i10, String str, ImageRemote imageRemote, Float f10, Float f11, String str2, String str3, SourceRemote sourceRemote, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, InspirationFeedItemRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95204a = str;
        this.f95205b = imageRemote;
        this.f95206c = f10;
        this.f95207d = f11;
        this.f95208e = str2;
        this.f95209f = str3;
        this.f95210g = sourceRemote;
    }

    public static final /* synthetic */ void d(InspirationFeedItemRemote inspirationFeedItemRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, inspirationFeedItemRemote.f95204a);
        dVar.B(serialDescriptor, 1, ImageRemote$$serializer.INSTANCE, inspirationFeedItemRemote.f95205b);
        M m10 = M.f144051a;
        dVar.B(serialDescriptor, 2, m10, inspirationFeedItemRemote.f95206c);
        dVar.B(serialDescriptor, 3, m10, inspirationFeedItemRemote.f95207d);
        dVar.B(serialDescriptor, 4, y02, inspirationFeedItemRemote.f95208e);
        dVar.B(serialDescriptor, 5, y02, inspirationFeedItemRemote.f95209f);
        dVar.B(serialDescriptor, 6, SourceRemote$$serializer.INSTANCE, inspirationFeedItemRemote.f95210g);
    }

    public final ImageRemote a() {
        return this.f95205b;
    }

    public final String b() {
        return this.f95204a;
    }

    public C11588a c() {
        String str = this.f95204a;
        if (str != null) {
            ImageRemote imageRemote = this.f95205b;
            if (imageRemote != null) {
                Image c10 = imageRemote.c();
                Float f10 = this.f95206c;
                float floatValue = f10 != null ? f10.floatValue() : 1.36f;
                Float f11 = this.f95207d;
                if (f11 != null) {
                    float floatValue2 = f11.floatValue();
                    String str2 = this.f95208e;
                    if (str2 != null) {
                        String str3 = this.f95209f;
                        if (str3 != null) {
                            InspirationType a10 = C11803a.b(str3);
                            SourceRemote sourceRemote = this.f95210g;
                            return new C11588a(str, c10, floatValue, floatValue2, str2, a10, sourceRemote != null ? sourceRemote.a() : null);
                        }
                        throw new IllegalArgumentException("Required value was null.");
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
        if (!(obj instanceof InspirationFeedItemRemote)) {
            return false;
        }
        InspirationFeedItemRemote inspirationFeedItemRemote = (InspirationFeedItemRemote) obj;
        return C17542s.e(this.f95204a, inspirationFeedItemRemote.f95204a) && C17542s.e(this.f95205b, inspirationFeedItemRemote.f95205b) && C17542s.e(this.f95206c, inspirationFeedItemRemote.f95206c) && C17542s.e(this.f95207d, inspirationFeedItemRemote.f95207d) && C17542s.e(this.f95208e, inspirationFeedItemRemote.f95208e) && C17542s.e(this.f95209f, inspirationFeedItemRemote.f95209f) && C17542s.e(this.f95210g, inspirationFeedItemRemote.f95210g);
    }

    public int hashCode() {
        String str = this.f95204a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ImageRemote imageRemote = this.f95205b;
        int hashCode2 = (hashCode + (imageRemote == null ? 0 : imageRemote.hashCode())) * 31;
        Float f10 = this.f95206c;
        int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f95207d;
        int hashCode4 = (hashCode3 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str2 = this.f95208e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95209f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SourceRemote sourceRemote = this.f95210g;
        if (sourceRemote != null) {
            i10 = sourceRemote.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        String str = this.f95204a;
        ImageRemote imageRemote = this.f95205b;
        Float f10 = this.f95206c;
        Float f11 = this.f95207d;
        String str2 = this.f95208e;
        String str3 = this.f95209f;
        SourceRemote sourceRemote = this.f95210g;
        return "InspirationFeedItemRemote(inspirationId=" + str + ", image=" + imageRemote + ", heightFactor=" + f10 + ", aspectRatio=" + f11 + ", name=" + str2 + ", type=" + str3 + ", source=" + sourceRemote + ")";
    }
}
