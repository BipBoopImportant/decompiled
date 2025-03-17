package com.ingka.ikea.benefits.impl.data.models.remote;

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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \b\b\u0018\u0000 A2\u00020\u0001:\u0002B&B{\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001fR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010'\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001fR \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010'\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001fR \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010'\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u001fR \u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010'\u0012\u0004\b4\u0010*\u001a\u0004\b0\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010'\u0012\u0004\b6\u0010*\u001a\u0004\b5\u0010\u001fR&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u00107\u0012\u0004\b:\u0010*\u001a\u0004\b8\u00109R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010;\u0012\u0004\b=\u0010*\u001a\u0004\b3\u0010<R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010>\u0012\u0004\b@\u0010*\u001a\u0004\b+\u0010?¨\u0006C"}, d2 = {"Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote;", "", "", "seen0", "", "id", "loyaltyProgramme", "category", "name", "description", "smallDescription", "", "Lcom/ingka/ikea/benefits/impl/data/models/remote/MediaRemote;", "media", "Lcom/ingka/ikea/benefits/impl/data/models/remote/SvgIconRemote;", "icon", "Lcom/ingka/ikea/benefits/impl/data/models/remote/CallToActionRemote;", "callToAction", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/benefits/impl/data/models/remote/SvgIconRemote;Lcom/ingka/ikea/benefits/impl/data/models/remote/CallToActionRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "k", "(Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "getId$annotations", "()V", "b", "g", "getLoyaltyProgramme$annotations", "c", "getCategory$annotations", "d", "i", "getName$annotations", "e", "getDescription$annotations", "j", "getSmallDescription$annotations", "Ljava/util/List;", "h", "()Ljava/util/List;", "getMedia$annotations", "Lcom/ingka/ikea/benefits/impl/data/models/remote/SvgIconRemote;", "()Lcom/ingka/ikea/benefits/impl/data/models/remote/SvgIconRemote;", "getIcon$annotations", "Lcom/ingka/ikea/benefits/impl/data/models/remote/CallToActionRemote;", "()Lcom/ingka/ikea/benefits/impl/data/models/remote/CallToActionRemote;", "getCallToAction$annotations", "Companion", "$serializer", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BenefitRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final KSerializer<Object>[] f93176j = {null, null, null, null, null, null, new C17451f(MediaRemote$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f93177a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93178b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93179c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93180d;

    /* renamed from: e  reason: collision with root package name */
    private final String f93181e;

    /* renamed from: f  reason: collision with root package name */
    private final String f93182f;

    /* renamed from: g  reason: collision with root package name */
    private final List<MediaRemote> f93183g;

    /* renamed from: h  reason: collision with root package name */
    private final SvgIconRemote f93184h;

    /* renamed from: i  reason: collision with root package name */
    private final CallToActionRemote f93185i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<BenefitRemote> serializer() {
            return BenefitRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BenefitRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, List list, SvgIconRemote svgIconRemote, CallToActionRemote callToActionRemote, T0 t02) {
        if (511 != (i10 & 511)) {
            E0.b(i10, 511, BenefitRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93177a = str;
        this.f93178b = str2;
        this.f93179c = str3;
        this.f93180d = str4;
        this.f93181e = str5;
        this.f93182f = str6;
        this.f93183g = list;
        this.f93184h = svgIconRemote;
        this.f93185i = callToActionRemote;
    }

    public static final /* synthetic */ void k(BenefitRemote benefitRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93176j;
        dVar.y(serialDescriptor, 0, benefitRemote.f93177a);
        dVar.y(serialDescriptor, 1, benefitRemote.f93178b);
        dVar.y(serialDescriptor, 2, benefitRemote.f93179c);
        dVar.y(serialDescriptor, 3, benefitRemote.f93180d);
        dVar.y(serialDescriptor, 4, benefitRemote.f93181e);
        dVar.B(serialDescriptor, 5, Y0.f144077a, benefitRemote.f93182f);
        dVar.i(serialDescriptor, 6, kSerializerArr[6], benefitRemote.f93183g);
        dVar.B(serialDescriptor, 7, SvgIconRemote$$serializer.INSTANCE, benefitRemote.f93184h);
        dVar.B(serialDescriptor, 8, CallToActionRemote$$serializer.INSTANCE, benefitRemote.f93185i);
    }

    public final CallToActionRemote b() {
        return this.f93185i;
    }

    public final String c() {
        return this.f93179c;
    }

    public final String d() {
        return this.f93181e;
    }

    public final SvgIconRemote e() {
        return this.f93184h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitRemote)) {
            return false;
        }
        BenefitRemote benefitRemote = (BenefitRemote) obj;
        return C17542s.e(this.f93177a, benefitRemote.f93177a) && C17542s.e(this.f93178b, benefitRemote.f93178b) && C17542s.e(this.f93179c, benefitRemote.f93179c) && C17542s.e(this.f93180d, benefitRemote.f93180d) && C17542s.e(this.f93181e, benefitRemote.f93181e) && C17542s.e(this.f93182f, benefitRemote.f93182f) && C17542s.e(this.f93183g, benefitRemote.f93183g) && C17542s.e(this.f93184h, benefitRemote.f93184h) && C17542s.e(this.f93185i, benefitRemote.f93185i);
    }

    public final String f() {
        return this.f93177a;
    }

    public final String g() {
        return this.f93178b;
    }

    public final List<MediaRemote> h() {
        return this.f93183g;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f93177a.hashCode() * 31) + this.f93178b.hashCode()) * 31) + this.f93179c.hashCode()) * 31) + this.f93180d.hashCode()) * 31) + this.f93181e.hashCode()) * 31;
        String str = this.f93182f;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f93183g.hashCode()) * 31;
        SvgIconRemote svgIconRemote = this.f93184h;
        int hashCode3 = (hashCode2 + (svgIconRemote == null ? 0 : svgIconRemote.hashCode())) * 31;
        CallToActionRemote callToActionRemote = this.f93185i;
        if (callToActionRemote != null) {
            i10 = callToActionRemote.hashCode();
        }
        return hashCode3 + i10;
    }

    public final String i() {
        return this.f93180d;
    }

    public final String j() {
        return this.f93182f;
    }

    public String toString() {
        String str = this.f93177a;
        String str2 = this.f93178b;
        String str3 = this.f93179c;
        String str4 = this.f93180d;
        String str5 = this.f93181e;
        String str6 = this.f93182f;
        List<MediaRemote> list = this.f93183g;
        SvgIconRemote svgIconRemote = this.f93184h;
        CallToActionRemote callToActionRemote = this.f93185i;
        return "BenefitRemote(id=" + str + ", loyaltyProgramme=" + str2 + ", category=" + str3 + ", name=" + str4 + ", description=" + str5 + ", smallDescription=" + str6 + ", media=" + list + ", icon=" + svgIconRemote + ", callToAction=" + callToActionRemote + ")";
    }
}
