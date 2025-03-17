package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import Mi.q;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'!B;\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\"\u0012\u0004\b%\u0010$¨\u0006("}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/WriteReviewQuestionsRemote;", "Lpp/b;", "LMi/q;", "", "seen0", "", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/WriteReviewQuestionRemote;", "questions", "subQuestions", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/WriteReviewQuestionsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LMi/q;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getQuestions$annotations", "()V", "getSubQuestions$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WriteReviewQuestionsRemote implements C11768b<q> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f91120c = 8;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f91121d;

    /* renamed from: a  reason: collision with root package name */
    private final List<WriteReviewQuestionRemote> f91122a;

    /* renamed from: b  reason: collision with root package name */
    private final List<WriteReviewQuestionRemote> f91123b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/WriteReviewQuestionsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/WriteReviewQuestionsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<WriteReviewQuestionsRemote> serializer() {
            return WriteReviewQuestionsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        WriteReviewQuestionRemote$$serializer writeReviewQuestionRemote$$serializer = WriteReviewQuestionRemote$$serializer.INSTANCE;
        f91121d = new KSerializer[]{new C17451f(writeReviewQuestionRemote$$serializer), new C17451f(writeReviewQuestionRemote$$serializer)};
    }

    public /* synthetic */ WriteReviewQuestionsRemote(int i10, List list, List list2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, WriteReviewQuestionsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91122a = list;
        this.f91123b = list2;
    }

    public static final /* synthetic */ void c(WriteReviewQuestionsRemote writeReviewQuestionsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f91121d;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], writeReviewQuestionsRemote.f91122a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], writeReviewQuestionsRemote.f91123b);
    }

    public q b() {
        Iterable<WriteReviewQuestionRemote> iterable = this.f91122a;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (WriteReviewQuestionRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        Iterable<WriteReviewQuestionRemote> iterable2 = this.f91123b;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (WriteReviewQuestionRemote a11 : iterable2) {
            arrayList2.add(a11.a());
        }
        return new q(arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteReviewQuestionsRemote)) {
            return false;
        }
        WriteReviewQuestionsRemote writeReviewQuestionsRemote = (WriteReviewQuestionsRemote) obj;
        return C17542s.e(this.f91122a, writeReviewQuestionsRemote.f91122a) && C17542s.e(this.f91123b, writeReviewQuestionsRemote.f91123b);
    }

    public int hashCode() {
        return (this.f91122a.hashCode() * 31) + this.f91123b.hashCode();
    }

    public String toString() {
        List<WriteReviewQuestionRemote> list = this.f91122a;
        List<WriteReviewQuestionRemote> list2 = this.f91123b;
        return "WriteReviewQuestionsRemote(questions=" + list + ", subQuestions=" + list2 + ")";
    }
}
