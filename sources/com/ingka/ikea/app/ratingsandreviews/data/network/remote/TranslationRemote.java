package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import Mi.n;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*\u0016BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u0016\u0010!\u0012\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u0012\u0004\b$\u0010#R\u001a\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b%\u0010!\u0012\u0004\b&\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b'\u0010!\u0012\u0004\b(\u0010#¨\u0006+"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/TranslationRemote;", "Lpp/b;", "LMi/n;", "", "seen0", "", "reviewId", "text", "title", "response", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/TranslationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LMi/n;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReviewId$annotations", "()V", "getText$annotations", "c", "getTitle$annotations", "d", "getResponse$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TranslationRemote implements C11768b<n> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f91105a;

    /* renamed from: b  reason: collision with root package name */
    private final String f91106b;

    /* renamed from: c  reason: collision with root package name */
    private final String f91107c;

    /* renamed from: d  reason: collision with root package name */
    private final String f91108d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/TranslationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/TranslationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<TranslationRemote> serializer() {
            return TranslationRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TranslationRemote(int i10, String str, String str2, String str3, String str4, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, TranslationRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91105a = str;
        this.f91106b = str2;
        this.f91107c = str3;
        this.f91108d = str4;
    }

    public static final /* synthetic */ void b(TranslationRemote translationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, translationRemote.f91105a);
        dVar.y(serialDescriptor, 1, translationRemote.f91106b);
        dVar.y(serialDescriptor, 2, translationRemote.f91107c);
        dVar.B(serialDescriptor, 3, Y0.f144077a, translationRemote.f91108d);
    }

    public n a() {
        return new n(this.f91105a, this.f91107c, this.f91106b, this.f91108d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationRemote)) {
            return false;
        }
        TranslationRemote translationRemote = (TranslationRemote) obj;
        return C17542s.e(this.f91105a, translationRemote.f91105a) && C17542s.e(this.f91106b, translationRemote.f91106b) && C17542s.e(this.f91107c, translationRemote.f91107c) && C17542s.e(this.f91108d, translationRemote.f91108d);
    }

    public int hashCode() {
        int hashCode = ((((this.f91105a.hashCode() * 31) + this.f91106b.hashCode()) * 31) + this.f91107c.hashCode()) * 31;
        String str = this.f91108d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f91105a;
        String str2 = this.f91106b;
        String str3 = this.f91107c;
        String str4 = this.f91108d;
        return "TranslationRemote(reviewId=" + str + ", text=" + str2 + ", title=" + str3 + ", response=" + str4 + ")";
    }
}
