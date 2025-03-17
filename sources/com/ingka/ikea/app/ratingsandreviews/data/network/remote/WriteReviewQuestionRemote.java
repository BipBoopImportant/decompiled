package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000f\b\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+\u0017BA\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u0017\u0010!\u0012\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u0015\u0010!\u0012\u0004\b$\u0010#R\u001a\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b%\u0010!\u0012\u0004\b&\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010#¨\u0006,"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/WriteReviewQuestionRemote;", "Lpp/b;", "LMi/p;", "", "seen0", "", "id", "title", "typeId", "", "mandatory", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/WriteReviewQuestionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LMi/p;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId$annotations", "()V", "getTitle$annotations", "c", "getTypeId$annotations", "d", "Z", "getMandatory$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WriteReviewQuestionRemote implements C11768b<Mi.p> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f91115a;

    /* renamed from: b  reason: collision with root package name */
    private final String f91116b;

    /* renamed from: c  reason: collision with root package name */
    private final String f91117c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f91118d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/WriteReviewQuestionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/WriteReviewQuestionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<WriteReviewQuestionRemote> serializer() {
            return WriteReviewQuestionRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WriteReviewQuestionRemote(int i10, String str, String str2, String str3, boolean z10, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, WriteReviewQuestionRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91115a = str;
        this.f91116b = str2;
        this.f91117c = str3;
        this.f91118d = z10;
    }

    public static final /* synthetic */ void b(WriteReviewQuestionRemote writeReviewQuestionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, writeReviewQuestionRemote.f91115a);
        dVar.y(serialDescriptor, 1, writeReviewQuestionRemote.f91116b);
        dVar.y(serialDescriptor, 2, writeReviewQuestionRemote.f91117c);
        dVar.x(serialDescriptor, 3, writeReviewQuestionRemote.f91118d);
    }

    public Mi.p a() {
        return new Mi.p(this.f91115a, this.f91116b, this.f91117c, this.f91118d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteReviewQuestionRemote)) {
            return false;
        }
        WriteReviewQuestionRemote writeReviewQuestionRemote = (WriteReviewQuestionRemote) obj;
        return C17542s.e(this.f91115a, writeReviewQuestionRemote.f91115a) && C17542s.e(this.f91116b, writeReviewQuestionRemote.f91116b) && C17542s.e(this.f91117c, writeReviewQuestionRemote.f91117c) && this.f91118d == writeReviewQuestionRemote.f91118d;
    }

    public int hashCode() {
        return (((((this.f91115a.hashCode() * 31) + this.f91116b.hashCode()) * 31) + this.f91117c.hashCode()) * 31) + Boolean.hashCode(this.f91118d);
    }

    public String toString() {
        String str = this.f91115a;
        String str2 = this.f91116b;
        String str3 = this.f91117c;
        boolean z10 = this.f91118d;
        return "WriteReviewQuestionRemote(id=" + str + ", title=" + str2 + ", typeId=" + str3 + ", mandatory=" + z10 + ")";
    }
}
