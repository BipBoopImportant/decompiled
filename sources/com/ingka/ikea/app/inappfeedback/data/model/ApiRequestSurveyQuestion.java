package com.ingka.ikea.app.inappfeedback.data.model;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 '2\u00020\u0001:\u0002(\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001d\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/data/model/ApiRequestSurveyQuestion;", "", "", "id", "question", "answer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/inappfeedback/data/model/ApiRequestSurveyQuestion;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "b", "getQuestion", "getQuestion$annotations", "c", "getAnswer", "getAnswer$annotations", "Companion", "$serializer", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApiRequestSurveyQuestion {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f71940a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71941b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71942c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/data/model/ApiRequestSurveyQuestion$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/inappfeedback/data/model/ApiRequestSurveyQuestion;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ApiRequestSurveyQuestion> serializer() {
            return ApiRequestSurveyQuestion$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ApiRequestSurveyQuestion(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ApiRequestSurveyQuestion$$serializer.INSTANCE.getDescriptor());
        }
        this.f71940a = str;
        this.f71941b = str2;
        this.f71942c = str3;
    }

    public static final /* synthetic */ void a(ApiRequestSurveyQuestion apiRequestSurveyQuestion, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, apiRequestSurveyQuestion.f71940a);
        dVar.y(serialDescriptor, 1, apiRequestSurveyQuestion.f71941b);
        dVar.y(serialDescriptor, 2, apiRequestSurveyQuestion.f71942c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiRequestSurveyQuestion)) {
            return false;
        }
        ApiRequestSurveyQuestion apiRequestSurveyQuestion = (ApiRequestSurveyQuestion) obj;
        return C17542s.e(this.f71940a, apiRequestSurveyQuestion.f71940a) && C17542s.e(this.f71941b, apiRequestSurveyQuestion.f71941b) && C17542s.e(this.f71942c, apiRequestSurveyQuestion.f71942c);
    }

    public int hashCode() {
        return (((this.f71940a.hashCode() * 31) + this.f71941b.hashCode()) * 31) + this.f71942c.hashCode();
    }

    public String toString() {
        String str = this.f71940a;
        String str2 = this.f71941b;
        String str3 = this.f71942c;
        return "ApiRequestSurveyQuestion(id=" + str + ", question=" + str2 + ", answer=" + str3 + ")";
    }

    public ApiRequestSurveyQuestion(String str, String str2, String str3) {
        C17542s.j(str, "id");
        C17542s.j(str2, "question");
        C17542s.j(str3, "answer");
        this.f71940a = str;
        this.f71941b = str2;
        this.f71942c = str3;
    }
}
