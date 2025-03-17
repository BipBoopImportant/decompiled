package com.ingka.ikea.core.remotemodel;

import com.ingka.ikea.core.model.KeyBenefit;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)\u0015B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/KeyBenefitRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/KeyBenefit;", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "icon", "", "text", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/ImageRemote;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/KeyBenefitRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/core/model/KeyBenefit;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getIcon", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getIcon$annotations", "()V", "Ljava/lang/String;", "getText", "getText$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyBenefitRemote implements C11768b<KeyBenefit> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ImageRemote f95211a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95212b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/KeyBenefitRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/KeyBenefitRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<KeyBenefitRemote> serializer() {
            return KeyBenefitRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ KeyBenefitRemote(int i10, ImageRemote imageRemote, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, KeyBenefitRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95211a = imageRemote;
        this.f95212b = str;
    }

    public static final /* synthetic */ void b(KeyBenefitRemote keyBenefitRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, ImageRemote$$serializer.INSTANCE, keyBenefitRemote.f95211a);
        dVar.y(serialDescriptor, 1, keyBenefitRemote.f95212b);
    }

    public KeyBenefit a() {
        ImageRemote imageRemote = this.f95211a;
        return new KeyBenefit(imageRemote != null ? imageRemote.c() : null, this.f95212b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyBenefitRemote)) {
            return false;
        }
        KeyBenefitRemote keyBenefitRemote = (KeyBenefitRemote) obj;
        return C17542s.e(this.f95211a, keyBenefitRemote.f95211a) && C17542s.e(this.f95212b, keyBenefitRemote.f95212b);
    }

    public int hashCode() {
        ImageRemote imageRemote = this.f95211a;
        return ((imageRemote == null ? 0 : imageRemote.hashCode()) * 31) + this.f95212b.hashCode();
    }

    public String toString() {
        ImageRemote imageRemote = this.f95211a;
        String str = this.f95212b;
        return "KeyBenefitRemote(icon=" + imageRemote + ", text=" + str + ")";
    }
}
