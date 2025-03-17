package com.ingka.ikea.mcomsettings.impl.network;

import HJ.C15854t;
import YH.C16877v;
import com.ingka.ikea.mcomsettings.impl.db.MComSurveyConfig;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 02\u00020\u0001:\u000312\"BI\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u001bR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010&\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote;", "", "", "seen0", "", "id", "title", "description", "", "Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote$SurveyQuestionRemote;", "questions", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;", "b", "()Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "d", "Ljava/util/List;", "getQuestions", "()Ljava/util/List;", "getQuestions$annotations", "Companion", "SurveyQuestionRemote", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SurveyConfigRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f96727e = {null, null, null, new C17451f(SurveyConfigRemote$SurveyQuestionRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f96728a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96729b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96730c;

    /* renamed from: d  reason: collision with root package name */
    private final List<SurveyQuestionRemote> f96731d;

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 .2\u00020\u0001:\u0002/\u0016BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010#\u001a\u0004\b(\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010'\u0012\u0004\b-\u0010#\u001a\u0004\b,\u0010)¨\u00060"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote$SurveyQuestionRemote;", "", "", "seen0", "", "id", "title", "minRating", "maxRating", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote$SurveyQuestionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$SurveyQuestion;", "a", "()Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$SurveyQuestion;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "c", "Ljava/lang/Integer;", "getMinRating", "()Ljava/lang/Integer;", "getMinRating$annotations", "d", "getMaxRating", "getMaxRating$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SurveyQuestionRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96732a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96733b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f96734c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f96735d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote$SurveyQuestionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote$SurveyQuestionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<SurveyQuestionRemote> serializer() {
                return SurveyConfigRemote$SurveyQuestionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ SurveyQuestionRemote(int i10, String str, String str2, Integer num, Integer num2, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, SurveyConfigRemote$SurveyQuestionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96732a = str;
            this.f96733b = str2;
            this.f96734c = num;
            this.f96735d = num2;
        }

        public static final /* synthetic */ void b(SurveyQuestionRemote surveyQuestionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, surveyQuestionRemote.f96732a);
            dVar.B(serialDescriptor, 1, y02, surveyQuestionRemote.f96733b);
            X x10 = X.f144073a;
            dVar.B(serialDescriptor, 2, x10, surveyQuestionRemote.f96734c);
            dVar.B(serialDescriptor, 3, x10, surveyQuestionRemote.f96735d);
        }

        public final MComSurveyConfig.SurveyQuestion a() {
            String str;
            String str2 = this.f96732a;
            Class<SurveyQuestionRemote> cls = SurveyQuestionRemote.class;
            if (str2 == null || C15854t.v0(str2) || (str = this.f96733b) == null || C15854t.v0(str)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid question data: " + this);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    if (str4 == null) {
                        String name = cls.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str4;
                    bVar.a(eVar, str5, false, illegalArgumentException, str3);
                    str4 = str5;
                }
                return null;
            }
            if (this.f96734c == null || this.f96735d == null) {
                e eVar2 = e.WARN;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str6 == null) {
                        String a11 = C11818a.a("Invalid min or max rating: " + this, (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str6 = C11820c.a(a11);
                    }
                    String str8 = str6;
                    if (str7 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    String str9 = str7;
                    bVar2.a(eVar2, str9, false, (Throwable) null, str8);
                    str7 = str9;
                    str6 = str8;
                }
            }
            String str10 = this.f96732a;
            String str11 = this.f96733b;
            Integer num = this.f96734c;
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = this.f96735d;
            return new MComSurveyConfig.SurveyQuestion(str10, str11, intValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurveyQuestionRemote)) {
                return false;
            }
            SurveyQuestionRemote surveyQuestionRemote = (SurveyQuestionRemote) obj;
            return C17542s.e(this.f96732a, surveyQuestionRemote.f96732a) && C17542s.e(this.f96733b, surveyQuestionRemote.f96733b) && C17542s.e(this.f96734c, surveyQuestionRemote.f96734c) && C17542s.e(this.f96735d, surveyQuestionRemote.f96735d);
        }

        public int hashCode() {
            String str = this.f96732a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96733b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f96734c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f96735d;
            if (num2 != null) {
                i10 = num2.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f96732a;
            String str2 = this.f96733b;
            Integer num = this.f96734c;
            Integer num2 = this.f96735d;
            return "SurveyQuestionRemote(id=" + str + ", title=" + str2 + ", minRating=" + num + ", maxRating=" + num2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<SurveyConfigRemote> serializer() {
            return SurveyConfigRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SurveyConfigRemote(int i10, String str, String str2, String str3, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, SurveyConfigRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96728a = str;
        this.f96729b = str2;
        this.f96730c = str3;
        this.f96731d = list;
    }

    public static final /* synthetic */ void c(SurveyConfigRemote surveyConfigRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96727e;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, surveyConfigRemote.f96728a);
        dVar.B(serialDescriptor, 1, y02, surveyConfigRemote.f96729b);
        dVar.B(serialDescriptor, 2, y02, surveyConfigRemote.f96730c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], surveyConfigRemote.f96731d);
    }

    public final MComSurveyConfig b() {
        String str;
        List list;
        String str2 = this.f96728a;
        if (str2 == null || C15854t.v0(str2) || (str = this.f96729b) == null || C15854t.v0(str)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid survey config: " + this);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                if (str4 == null) {
                    String name = SurveyConfigRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str4;
                bVar.a(eVar, str5, false, illegalArgumentException, str3);
                str4 = str5;
            }
            return null;
        }
        String str6 = this.f96728a;
        String str7 = this.f96729b;
        String str8 = this.f96730c;
        List<SurveyQuestionRemote> list2 = this.f96731d;
        if (list2 != null) {
            list = new ArrayList();
            for (SurveyQuestionRemote a11 : list2) {
                MComSurveyConfig.SurveyQuestion a12 = a11.a();
                if (a12 != null) {
                    list.add(a12);
                }
            }
        } else {
            list = C16877v.n();
        }
        return new MComSurveyConfig(str6, str7, str8, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyConfigRemote)) {
            return false;
        }
        SurveyConfigRemote surveyConfigRemote = (SurveyConfigRemote) obj;
        return C17542s.e(this.f96728a, surveyConfigRemote.f96728a) && C17542s.e(this.f96729b, surveyConfigRemote.f96729b) && C17542s.e(this.f96730c, surveyConfigRemote.f96730c) && C17542s.e(this.f96731d, surveyConfigRemote.f96731d);
    }

    public int hashCode() {
        String str = this.f96728a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f96729b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f96730c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SurveyQuestionRemote> list = this.f96731d;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f96728a;
        String str2 = this.f96729b;
        String str3 = this.f96730c;
        List<SurveyQuestionRemote> list = this.f96731d;
        return "SurveyConfigRemote(id=" + str + ", title=" + str2 + ", description=" + str3 + ", questions=" + list + ")";
    }
}
