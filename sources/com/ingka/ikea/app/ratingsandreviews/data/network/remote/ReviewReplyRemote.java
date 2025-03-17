package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import Mi.C10776k;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u0015B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001f\u0012\u0004\b'\u0010\"\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewReplyRemote;", "", "", "seen0", "", "responseBy", "responseText", "age", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewReplyRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LMi/k;", "a", "()LMi/k;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getResponseBy", "getResponseBy$annotations", "()V", "getResponseText", "getResponseText$annotations", "c", "getAge", "getAge$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReviewReplyRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f91063a;

    /* renamed from: b  reason: collision with root package name */
    private final String f91064b;

    /* renamed from: c  reason: collision with root package name */
    private final String f91065c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewReplyRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewReplyRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReviewReplyRemote> serializer() {
            return ReviewReplyRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReviewReplyRemote(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ReviewReplyRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91063a = str;
        this.f91064b = str2;
        this.f91065c = str3;
    }

    public static final /* synthetic */ void b(ReviewReplyRemote reviewReplyRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, reviewReplyRemote.f91063a);
        dVar.y(serialDescriptor, 1, reviewReplyRemote.f91064b);
        dVar.y(serialDescriptor, 2, reviewReplyRemote.f91065c);
    }

    public final C10776k a() {
        return new C10776k(this.f91063a, this.f91064b, this.f91065c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewReplyRemote)) {
            return false;
        }
        ReviewReplyRemote reviewReplyRemote = (ReviewReplyRemote) obj;
        return C17542s.e(this.f91063a, reviewReplyRemote.f91063a) && C17542s.e(this.f91064b, reviewReplyRemote.f91064b) && C17542s.e(this.f91065c, reviewReplyRemote.f91065c);
    }

    public int hashCode() {
        return (((this.f91063a.hashCode() * 31) + this.f91064b.hashCode()) * 31) + this.f91065c.hashCode();
    }

    public String toString() {
        String str = this.f91063a;
        String str2 = this.f91064b;
        String str3 = this.f91065c;
        return "ReviewReplyRemote(responseBy=" + str + ", responseText=" + str2 + ", age=" + str3 + ")";
    }
}
