package com.ingka.ikea.mcomsettings.impl.db;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 -2\u00020\u0001:\u0003./ B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010!\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b%\u0010\u0019R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010$\u001a\u0004\b)\u0010+¨\u00060"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;", "", "", "id", "title", "description", "", "Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$SurveyQuestion;", "questions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getId$annotations", "()V", "b", "e", "getTitle$annotations", "getDescription$annotations", "d", "Ljava/util/List;", "()Ljava/util/List;", "getQuestions$annotations", "Companion", "SurveyQuestion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MComSurveyConfig {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f96651e = {null, null, null, new C17451f(MComSurveyConfig$SurveyQuestion$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f96652a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96653b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96654c;

    /* renamed from: d  reason: collision with root package name */
    private final List<SurveyQuestion> f96655d;

    @p
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 )2\u00020\u0001:\u0002*\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001f\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b'\u0010!\u001a\u0004\b%\u0010\u0019R \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010&\u0012\u0004\b(\u0010!\u001a\u0004\b\"\u0010\u0019¨\u0006+"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$SurveyQuestion;", "", "", "id", "title", "", "minRating", "maxRating", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$SurveyQuestion;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId$annotations", "()V", "b", "d", "getTitle$annotations", "c", "I", "getMinRating$annotations", "getMaxRating$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SurveyQuestion {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96656a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96657b;

        /* renamed from: c  reason: collision with root package name */
        private final int f96658c;

        /* renamed from: d  reason: collision with root package name */
        private final int f96659d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$SurveyQuestion$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$SurveyQuestion;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<SurveyQuestion> serializer() {
                return MComSurveyConfig$SurveyQuestion$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ SurveyQuestion(int i10, String str, String str2, int i11, int i12, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, MComSurveyConfig$SurveyQuestion$$serializer.INSTANCE.getDescriptor());
            }
            this.f96656a = str;
            this.f96657b = str2;
            this.f96658c = i11;
            this.f96659d = i12;
        }

        public static final /* synthetic */ void e(SurveyQuestion surveyQuestion, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, surveyQuestion.f96656a);
            dVar.y(serialDescriptor, 1, surveyQuestion.f96657b);
            dVar.w(serialDescriptor, 2, surveyQuestion.f96658c);
            dVar.w(serialDescriptor, 3, surveyQuestion.f96659d);
        }

        public final String a() {
            return this.f96656a;
        }

        public final int b() {
            return this.f96659d;
        }

        public final int c() {
            return this.f96658c;
        }

        public final String d() {
            return this.f96657b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurveyQuestion)) {
                return false;
            }
            SurveyQuestion surveyQuestion = (SurveyQuestion) obj;
            return C17542s.e(this.f96656a, surveyQuestion.f96656a) && C17542s.e(this.f96657b, surveyQuestion.f96657b) && this.f96658c == surveyQuestion.f96658c && this.f96659d == surveyQuestion.f96659d;
        }

        public int hashCode() {
            return (((((this.f96656a.hashCode() * 31) + this.f96657b.hashCode()) * 31) + Integer.hashCode(this.f96658c)) * 31) + Integer.hashCode(this.f96659d);
        }

        public String toString() {
            String str = this.f96656a;
            String str2 = this.f96657b;
            int i10 = this.f96658c;
            int i11 = this.f96659d;
            return "SurveyQuestion(id=" + str + ", title=" + str2 + ", minRating=" + i10 + ", maxRating=" + i11 + ")";
        }

        public SurveyQuestion(String str, String str2, int i10, int i11) {
            C17542s.j(str, "id");
            C17542s.j(str2, "title");
            this.f96656a = str;
            this.f96657b = str2;
            this.f96658c = i10;
            this.f96659d = i11;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MComSurveyConfig> serializer() {
            return MComSurveyConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MComSurveyConfig(int i10, String str, String str2, String str3, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, MComSurveyConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.f96652a = str;
        this.f96653b = str2;
        this.f96654c = str3;
        this.f96655d = list;
    }

    public static final /* synthetic */ void f(MComSurveyConfig mComSurveyConfig, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96651e;
        dVar.y(serialDescriptor, 0, mComSurveyConfig.f96652a);
        dVar.y(serialDescriptor, 1, mComSurveyConfig.f96653b);
        dVar.B(serialDescriptor, 2, Y0.f144077a, mComSurveyConfig.f96654c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], mComSurveyConfig.f96655d);
    }

    public final String b() {
        return this.f96654c;
    }

    public final String c() {
        return this.f96652a;
    }

    public final List<SurveyQuestion> d() {
        return this.f96655d;
    }

    public final String e() {
        return this.f96653b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MComSurveyConfig)) {
            return false;
        }
        MComSurveyConfig mComSurveyConfig = (MComSurveyConfig) obj;
        return C17542s.e(this.f96652a, mComSurveyConfig.f96652a) && C17542s.e(this.f96653b, mComSurveyConfig.f96653b) && C17542s.e(this.f96654c, mComSurveyConfig.f96654c) && C17542s.e(this.f96655d, mComSurveyConfig.f96655d);
    }

    public int hashCode() {
        int hashCode = ((this.f96652a.hashCode() * 31) + this.f96653b.hashCode()) * 31;
        String str = this.f96654c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f96655d.hashCode();
    }

    public String toString() {
        String str = this.f96652a;
        String str2 = this.f96653b;
        String str3 = this.f96654c;
        List<SurveyQuestion> list = this.f96655d;
        return "MComSurveyConfig(id=" + str + ", title=" + str2 + ", description=" + str3 + ", questions=" + list + ")";
    }

    public MComSurveyConfig(String str, String str2, String str3, List<SurveyQuestion> list) {
        C17542s.j(str, "id");
        C17542s.j(str2, "title");
        C17542s.j(list, "questions");
        this.f96652a = str;
        this.f96653b = str2;
        this.f96654c = str3;
        this.f96655d = list;
    }
}
