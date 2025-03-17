package com.ingka.ikea.app.inappfeedback.data.model;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 02\u00020\u0001:\u00021 B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u001bR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010!\u0012\u0004\b/\u0010$\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/data/model/ApiRequestSurveyBody;", "", "", "id", "", "rating", "", "Lcom/ingka/ikea/app/inappfeedback/data/model/ApiRequestSurveyQuestion;", "answers", "storeId", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/inappfeedback/data/model/ApiRequestSurveyBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "I", "getRating", "getRating$annotations", "c", "Ljava/util/List;", "getAnswers", "()Ljava/util/List;", "getAnswers$annotations", "d", "getStoreId", "getStoreId$annotations", "Companion", "$serializer", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApiRequestSurveyBody {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f71933e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f71934f = {null, null, new C17451f(ApiRequestSurveyQuestion$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f71935a;

    /* renamed from: b  reason: collision with root package name */
    private final int f71936b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ApiRequestSurveyQuestion> f71937c;

    /* renamed from: d  reason: collision with root package name */
    private final String f71938d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/data/model/ApiRequestSurveyBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/inappfeedback/data/model/ApiRequestSurveyBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ApiRequestSurveyBody> serializer() {
            return ApiRequestSurveyBody$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ApiRequestSurveyBody(int i10, String str, int i11, List list, String str2, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, ApiRequestSurveyBody$$serializer.INSTANCE.getDescriptor());
        }
        this.f71935a = str;
        this.f71936b = i11;
        this.f71937c = list;
        this.f71938d = str2;
    }

    public static final /* synthetic */ void b(ApiRequestSurveyBody apiRequestSurveyBody, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71934f;
        dVar.y(serialDescriptor, 0, apiRequestSurveyBody.f71935a);
        dVar.w(serialDescriptor, 1, apiRequestSurveyBody.f71936b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], apiRequestSurveyBody.f71937c);
        dVar.B(serialDescriptor, 3, Y0.f144077a, apiRequestSurveyBody.f71938d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiRequestSurveyBody)) {
            return false;
        }
        ApiRequestSurveyBody apiRequestSurveyBody = (ApiRequestSurveyBody) obj;
        return C17542s.e(this.f71935a, apiRequestSurveyBody.f71935a) && this.f71936b == apiRequestSurveyBody.f71936b && C17542s.e(this.f71937c, apiRequestSurveyBody.f71937c) && C17542s.e(this.f71938d, apiRequestSurveyBody.f71938d);
    }

    public int hashCode() {
        int hashCode = ((((this.f71935a.hashCode() * 31) + Integer.hashCode(this.f71936b)) * 31) + this.f71937c.hashCode()) * 31;
        String str = this.f71938d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f71935a;
        int i10 = this.f71936b;
        List<ApiRequestSurveyQuestion> list = this.f71937c;
        String str2 = this.f71938d;
        return "ApiRequestSurveyBody(id=" + str + ", rating=" + i10 + ", answers=" + list + ", storeId=" + str2 + ")";
    }

    public ApiRequestSurveyBody(String str, int i10, List<ApiRequestSurveyQuestion> list, String str2) {
        C17542s.j(str, "id");
        C17542s.j(list, "answers");
        this.f71935a = str;
        this.f71936b = i10;
        this.f71937c = list;
        this.f71938d = str2;
    }
}
