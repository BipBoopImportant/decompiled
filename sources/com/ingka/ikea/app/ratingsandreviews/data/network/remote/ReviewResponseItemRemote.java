package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import HJ.C15854t;
import Mi.C10775j;
import Mi.n;
import fK.p;
import iK.C17395d;
import ip.o;
import jK.C17457i;
import jK.E0;
import jK.T0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b3\b\b\u0018\u0000 T2\u00020\u0001:\u0002U$B\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010'R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010'R \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010'R \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010-\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010'R \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u00100\u001a\u0004\b:\u0010;R \u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010-\u0012\u0004\b?\u00100\u001a\u0004\b>\u0010'R \u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u0010-\u0012\u0004\bB\u00100\u001a\u0004\bA\u0010'R \u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010-\u0012\u0004\bE\u00100\u001a\u0004\bD\u0010'R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u00100\u001a\u0004\bH\u0010IR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bO\u00100\u001a\u0004\bM\u0010NR \u0010\u0012\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bP\u0010Q\u0012\u0004\bS\u00100\u001a\u0004\bR\u0010)¨\u0006V"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewResponseItemRemote;", "", "", "seen0", "", "id", "nickname", "sourceLanguageCode", "sourceCountryCode", "", "rating", "age", "title", "reviewText", "", "verifiedPurchase", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewReplyRemote;", "response", "positiveFeedbacksCount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewReplyRemote;ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewResponseItemRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LMi/n;", "translation", "retailCode", "languageCode", "LMi/j;", "a", "(LMi/n;Ljava/lang/String;Ljava/lang/String;)LMi/j;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getId$annotations", "()V", "getNickname", "getNickname$annotations", "getSourceLanguageCode", "getSourceLanguageCode$annotations", "d", "getSourceCountryCode", "getSourceCountryCode$annotations", "e", "F", "getRating", "()F", "getRating$annotations", "f", "getAge", "getAge$annotations", "g", "getTitle", "getTitle$annotations", "h", "getReviewText", "getReviewText$annotations", "i", "Ljava/lang/Boolean;", "getVerifiedPurchase", "()Ljava/lang/Boolean;", "getVerifiedPurchase$annotations", "j", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewReplyRemote;", "getResponse", "()Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewReplyRemote;", "getResponse$annotations", "k", "I", "getPositiveFeedbacksCount", "getPositiveFeedbacksCount$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReviewResponseItemRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f91067a;

    /* renamed from: b  reason: collision with root package name */
    private final String f91068b;

    /* renamed from: c  reason: collision with root package name */
    private final String f91069c;

    /* renamed from: d  reason: collision with root package name */
    private final String f91070d;

    /* renamed from: e  reason: collision with root package name */
    private final float f91071e;

    /* renamed from: f  reason: collision with root package name */
    private final String f91072f;

    /* renamed from: g  reason: collision with root package name */
    private final String f91073g;

    /* renamed from: h  reason: collision with root package name */
    private final String f91074h;

    /* renamed from: i  reason: collision with root package name */
    private final Boolean f91075i;

    /* renamed from: j  reason: collision with root package name */
    private final ReviewReplyRemote f91076j;

    /* renamed from: k  reason: collision with root package name */
    private final int f91077k;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewResponseItemRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewResponseItemRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReviewResponseItemRemote> serializer() {
            return ReviewResponseItemRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReviewResponseItemRemote(int i10, String str, String str2, String str3, String str4, float f10, String str5, String str6, String str7, Boolean bool, ReviewReplyRemote reviewReplyRemote, int i11, T0 t02) {
        if (2047 != (i10 & 2047)) {
            E0.b(i10, 2047, ReviewResponseItemRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91067a = str;
        this.f91068b = str2;
        this.f91069c = str3;
        this.f91070d = str4;
        this.f91071e = f10;
        this.f91072f = str5;
        this.f91073g = str6;
        this.f91074h = str7;
        this.f91075i = bool;
        this.f91076j = reviewReplyRemote;
        this.f91077k = i11;
    }

    public static final /* synthetic */ void c(ReviewResponseItemRemote reviewResponseItemRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, reviewResponseItemRemote.f91067a);
        dVar.y(serialDescriptor, 1, reviewResponseItemRemote.f91068b);
        dVar.y(serialDescriptor, 2, reviewResponseItemRemote.f91069c);
        dVar.y(serialDescriptor, 3, reviewResponseItemRemote.f91070d);
        dVar.s(serialDescriptor, 4, reviewResponseItemRemote.f91071e);
        dVar.y(serialDescriptor, 5, reviewResponseItemRemote.f91072f);
        dVar.y(serialDescriptor, 6, reviewResponseItemRemote.f91073g);
        dVar.y(serialDescriptor, 7, reviewResponseItemRemote.f91074h);
        dVar.B(serialDescriptor, 8, C17457i.f144111a, reviewResponseItemRemote.f91075i);
        dVar.B(serialDescriptor, 9, ReviewReplyRemote$$serializer.INSTANCE, reviewResponseItemRemote.f91076j);
        dVar.w(serialDescriptor, 10, reviewResponseItemRemote.f91077k);
    }

    public final C10775j a(n nVar, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C17542s.j(str3, "retailCode");
        C17542s.j(str4, "languageCode");
        Locale locale = new Locale(this.f91069c, this.f91070d);
        Locale locale2 = new Locale(str4, str3);
        String str5 = this.f91067a;
        String str6 = this.f91068b;
        String displayLanguage = locale.getDisplayLanguage(locale2);
        C17542s.i(displayLanguage, "getDisplayLanguage(...)");
        String a10 = o.a(displayLanguage);
        String displayCountry = locale.getDisplayCountry(locale2);
        C17542s.i(displayCountry, "getDisplayCountry(...)");
        String a11 = o.a(displayCountry);
        String displayLanguage2 = locale2.getDisplayLanguage(locale2);
        C17542s.i(displayLanguage2, "getDisplayLanguage(...)");
        String a12 = o.a(displayLanguage2);
        int i10 = (int) this.f91071e;
        String str7 = this.f91072f;
        String str8 = this.f91073g;
        String str9 = this.f91074h;
        Boolean bool = this.f91075i;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ReviewReplyRemote reviewReplyRemote = this.f91076j;
        return new C10775j(str5, str6, a10, a11, a12, i10, str7, str8, str9, booleanValue, reviewReplyRemote != null ? reviewReplyRemote.a() : null, nVar, C15854t.H(this.f91070d, str3, true), this.f91077k, false, 16384, (DefaultConstructorMarker) null);
    }

    public final String b() {
        return this.f91067a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewResponseItemRemote)) {
            return false;
        }
        ReviewResponseItemRemote reviewResponseItemRemote = (ReviewResponseItemRemote) obj;
        return C17542s.e(this.f91067a, reviewResponseItemRemote.f91067a) && C17542s.e(this.f91068b, reviewResponseItemRemote.f91068b) && C17542s.e(this.f91069c, reviewResponseItemRemote.f91069c) && C17542s.e(this.f91070d, reviewResponseItemRemote.f91070d) && Float.compare(this.f91071e, reviewResponseItemRemote.f91071e) == 0 && C17542s.e(this.f91072f, reviewResponseItemRemote.f91072f) && C17542s.e(this.f91073g, reviewResponseItemRemote.f91073g) && C17542s.e(this.f91074h, reviewResponseItemRemote.f91074h) && C17542s.e(this.f91075i, reviewResponseItemRemote.f91075i) && C17542s.e(this.f91076j, reviewResponseItemRemote.f91076j) && this.f91077k == reviewResponseItemRemote.f91077k;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f91067a.hashCode() * 31) + this.f91068b.hashCode()) * 31) + this.f91069c.hashCode()) * 31) + this.f91070d.hashCode()) * 31) + Float.hashCode(this.f91071e)) * 31) + this.f91072f.hashCode()) * 31) + this.f91073g.hashCode()) * 31) + this.f91074h.hashCode()) * 31;
        Boolean bool = this.f91075i;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ReviewReplyRemote reviewReplyRemote = this.f91076j;
        if (reviewReplyRemote != null) {
            i10 = reviewReplyRemote.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Integer.hashCode(this.f91077k);
    }

    public String toString() {
        String str = this.f91067a;
        String str2 = this.f91068b;
        String str3 = this.f91069c;
        String str4 = this.f91070d;
        float f10 = this.f91071e;
        String str5 = this.f91072f;
        String str6 = this.f91073g;
        String str7 = this.f91074h;
        Boolean bool = this.f91075i;
        ReviewReplyRemote reviewReplyRemote = this.f91076j;
        int i10 = this.f91077k;
        return "ReviewResponseItemRemote(id=" + str + ", nickname=" + str2 + ", sourceLanguageCode=" + str3 + ", sourceCountryCode=" + str4 + ", rating=" + f10 + ", age=" + str5 + ", title=" + str6 + ", reviewText=" + str7 + ", verifiedPurchase=" + bool + ", response=" + reviewReplyRemote + ", positiveFeedbacksCount=" + i10 + ")";
    }
}
