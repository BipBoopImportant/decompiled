package com.ingka.ikea.app.inappfeedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\"BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b#\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\"\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/e;", "Landroid/os/Parcelable;", "", "title", "body", "surveyId", "storeId", "", "Lcom/ingka/ikea/app/inappfeedback/e$b;", "questions", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lcom/ingka/ikea/analytics/Interaction$Component;", "getComponent", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final int f71944g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f71945a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71946b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71947c;

    /* renamed from: d  reason: collision with root package name */
    private final String f71948d;

    /* renamed from: e  reason: collision with root package name */
    private final List<b> f71949e;

    /* renamed from: f  reason: collision with root package name */
    private final Interaction$Component f71950f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        /* renamed from: a */
        public final e createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(b.CREATOR.createFromParcel(parcel));
            }
            return new e(readString, readString2, readString3, readString4, arrayList, Interaction$Component.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001c\u0010\u0011¨\u0006 "}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/e$b;", "Landroid/os/Parcelable;", "", "id", "title", "", "minRating", "maxRating", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "I", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public static final int f71951e = 8;

        /* renamed from: a  reason: collision with root package name */
        private final String f71952a;

        /* renamed from: b  reason: collision with root package name */
        private final String f71953b;

        /* renamed from: c  reason: collision with root package name */
        private final int f71954c;

        /* renamed from: d  reason: collision with root package name */
        private final int f71955d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(String str, String str2, int i10, int i11) {
            C17542s.j(str, "id");
            C17542s.j(str2, "title");
            this.f71952a = str;
            this.f71953b = str2;
            this.f71954c = i10;
            this.f71955d = i11;
        }

        public final String a() {
            return this.f71952a;
        }

        public final int b() {
            return this.f71955d;
        }

        public final int c() {
            return this.f71954c;
        }

        public final String d() {
            return this.f71953b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f71952a, bVar.f71952a) && C17542s.e(this.f71953b, bVar.f71953b) && this.f71954c == bVar.f71954c && this.f71955d == bVar.f71955d;
        }

        public int hashCode() {
            return (((((this.f71952a.hashCode() * 31) + this.f71953b.hashCode()) * 31) + Integer.hashCode(this.f71954c)) * 31) + Integer.hashCode(this.f71955d);
        }

        public String toString() {
            String str = this.f71952a;
            String str2 = this.f71953b;
            int i10 = this.f71954c;
            int i11 = this.f71955d;
            return "SurveyQuestion(id=" + str + ", title=" + str2 + ", minRating=" + i10 + ", maxRating=" + i11 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f71952a);
            parcel.writeString(this.f71953b);
            parcel.writeInt(this.f71954c);
            parcel.writeInt(this.f71955d);
        }
    }

    public e(String str, String str2, String str3, String str4, List<b> list, Interaction$Component interaction$Component) {
        C17542s.j(str, "title");
        C17542s.j(str2, "body");
        C17542s.j(str3, "surveyId");
        C17542s.j(list, "questions");
        C17542s.j(interaction$Component, "component");
        this.f71945a = str;
        this.f71946b = str2;
        this.f71947c = str3;
        this.f71948d = str4;
        this.f71949e = list;
        this.f71950f = interaction$Component;
    }

    public final String a() {
        return this.f71946b;
    }

    public final List<b> b() {
        return this.f71949e;
    }

    public final String c() {
        return this.f71948d;
    }

    public final String d() {
        return this.f71947c;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f71945a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f71945a, eVar.f71945a) && C17542s.e(this.f71946b, eVar.f71946b) && C17542s.e(this.f71947c, eVar.f71947c) && C17542s.e(this.f71948d, eVar.f71948d) && C17542s.e(this.f71949e, eVar.f71949e) && this.f71950f == eVar.f71950f;
    }

    public int hashCode() {
        int hashCode = ((((this.f71945a.hashCode() * 31) + this.f71946b.hashCode()) * 31) + this.f71947c.hashCode()) * 31;
        String str = this.f71948d;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f71949e.hashCode()) * 31) + this.f71950f.hashCode();
    }

    public String toString() {
        String str = this.f71945a;
        String str2 = this.f71946b;
        String str3 = this.f71947c;
        String str4 = this.f71948d;
        List<b> list = this.f71949e;
        Interaction$Component interaction$Component = this.f71950f;
        return "FeedbackArguments(title=" + str + ", body=" + str2 + ", surveyId=" + str3 + ", storeId=" + str4 + ", questions=" + list + ", component=" + interaction$Component + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f71945a);
        parcel.writeString(this.f71946b);
        parcel.writeString(this.f71947c);
        parcel.writeString(this.f71948d);
        List<b> list = this.f71949e;
        parcel.writeInt(list.size());
        for (b writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f71950f.name());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, String str2, String str3, String str4, List list, Interaction$Component interaction$Component, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4, list, interaction$Component);
    }
}
