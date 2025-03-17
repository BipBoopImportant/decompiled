package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u0000 92\u00020\u0001:\u0002:#B\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010$\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010$\u0012\u0004\b,\u0010'\u001a\u0004\b(\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010$\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010$\u0012\u0004\b0\u0010'\u001a\u0004\b+\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b1\u0010'\u001a\u0004\b/\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010$\u0012\u0004\b3\u0010'\u001a\u0004\b2\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010$\u0012\u0004\b6\u0010'\u001a\u0004\b5\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010$\u0012\u0004\b7\u0010'\u001a\u0004\b#\u0010\u001cR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010$\u0012\u0004\b8\u0010'\u001a\u0004\b4\u0010\u001c¨\u0006;"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;", "", "", "seen0", "", "rewardType", "rewardDescription", "inStoreDiscountCode", "inStoreDiscountCodeTitle", "inStoreDiscountCodeBody", "onlineDiscountCode", "termsTitle", "termsBody", "imageUrl", "spotlightBody", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "k", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "getRewardType$annotations", "()V", "b", "f", "getRewardDescription$annotations", "c", "getInStoreDiscountCode$annotations", "d", "getInStoreDiscountCodeTitle$annotations", "e", "getInStoreDiscountCodeBody$annotations", "getOnlineDiscountCode$annotations", "j", "getTermsTitle$annotations", "h", "i", "getTermsBody$annotations", "getImageUrl$annotations", "getSpotlightBody$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContentRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95783a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95784b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95785c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95786d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95787e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95788f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95789g;

    /* renamed from: h  reason: collision with root package name */
    private final String f95790h;

    /* renamed from: i  reason: collision with root package name */
    private final String f95791i;

    /* renamed from: j  reason: collision with root package name */
    private final String f95792j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ContentRemote> serializer() {
            return ContentRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ContentRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, ContentRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95783a = str;
        this.f95784b = str2;
        this.f95785c = str3;
        this.f95786d = str4;
        this.f95787e = str5;
        this.f95788f = str6;
        this.f95789g = str7;
        this.f95790h = str8;
        this.f95791i = str9;
        this.f95792j = str10;
    }

    public static final /* synthetic */ void k(ContentRemote contentRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, contentRemote.f95783a);
        dVar.B(serialDescriptor, 1, y02, contentRemote.f95784b);
        dVar.B(serialDescriptor, 2, y02, contentRemote.f95785c);
        dVar.B(serialDescriptor, 3, y02, contentRemote.f95786d);
        dVar.B(serialDescriptor, 4, y02, contentRemote.f95787e);
        dVar.B(serialDescriptor, 5, y02, contentRemote.f95788f);
        dVar.B(serialDescriptor, 6, y02, contentRemote.f95789g);
        dVar.B(serialDescriptor, 7, y02, contentRemote.f95790h);
        dVar.B(serialDescriptor, 8, y02, contentRemote.f95791i);
        dVar.B(serialDescriptor, 9, y02, contentRemote.f95792j);
    }

    public final String a() {
        return this.f95791i;
    }

    public final String b() {
        return this.f95785c;
    }

    public final String c() {
        return this.f95787e;
    }

    public final String d() {
        return this.f95786d;
    }

    public final String e() {
        return this.f95788f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentRemote)) {
            return false;
        }
        ContentRemote contentRemote = (ContentRemote) obj;
        return C17542s.e(this.f95783a, contentRemote.f95783a) && C17542s.e(this.f95784b, contentRemote.f95784b) && C17542s.e(this.f95785c, contentRemote.f95785c) && C17542s.e(this.f95786d, contentRemote.f95786d) && C17542s.e(this.f95787e, contentRemote.f95787e) && C17542s.e(this.f95788f, contentRemote.f95788f) && C17542s.e(this.f95789g, contentRemote.f95789g) && C17542s.e(this.f95790h, contentRemote.f95790h) && C17542s.e(this.f95791i, contentRemote.f95791i) && C17542s.e(this.f95792j, contentRemote.f95792j);
    }

    public final String f() {
        return this.f95784b;
    }

    public final String g() {
        return this.f95783a;
    }

    public final String h() {
        return this.f95792j;
    }

    public int hashCode() {
        String str = this.f95783a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95784b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95785c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95786d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95787e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f95788f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f95789g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f95790h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f95791i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f95792j;
        if (str10 != null) {
            i10 = str10.hashCode();
        }
        return hashCode9 + i10;
    }

    public final String i() {
        return this.f95790h;
    }

    public final String j() {
        return this.f95789g;
    }

    public String toString() {
        String str = this.f95783a;
        String str2 = this.f95784b;
        String str3 = this.f95785c;
        String str4 = this.f95786d;
        String str5 = this.f95787e;
        String str6 = this.f95788f;
        String str7 = this.f95789g;
        String str8 = this.f95790h;
        String str9 = this.f95791i;
        String str10 = this.f95792j;
        return "ContentRemote(rewardType=" + str + ", rewardDescription=" + str2 + ", inStoreDiscountCode=" + str3 + ", inStoreDiscountCodeTitle=" + str4 + ", inStoreDiscountCodeBody=" + str5 + ", onlineDiscountCode=" + str6 + ", termsTitle=" + str7 + ", termsBody=" + str8 + ", imageUrl=" + str9 + ", spotlightBody=" + str10 + ")";
    }
}
