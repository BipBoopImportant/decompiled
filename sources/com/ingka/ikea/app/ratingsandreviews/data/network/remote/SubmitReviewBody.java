package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\b\u0018\u0000 62\u00020\u0001:\u00027#Bc\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u001a\u0010'\u0012\u0004\b(\u0010&R\u001a\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b)\u0010'\u0012\u0004\b*\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010&R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0004¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010&R\u001a\u0010\u000f\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b4\u0010'\u0012\u0004\b5\u0010&¨\u00068"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewBody;", "", "", "seen0", "rating", "", "title", "text", "", "recommended", "", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewSecondaryRatingRemote;", "secondaryRatings", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewOrderRemote;", "order", "sourceName", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewOrderRemote;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getRating$annotations", "()V", "Ljava/lang/String;", "getTitle$annotations", "c", "getText$annotations", "d", "Z", "getRecommended$annotations", "e", "Ljava/util/List;", "getSecondaryRatings$annotations", "f", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewOrderRemote;", "getOrder$annotations", "g", "getSourceName$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SubmitReviewBody {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f91090h = 8;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f91091i = {null, null, null, null, new C17451f(SubmitReviewSecondaryRatingRemote$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final int f91092a;

    /* renamed from: b  reason: collision with root package name */
    private final String f91093b;

    /* renamed from: c  reason: collision with root package name */
    private final String f91094c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f91095d;

    /* renamed from: e  reason: collision with root package name */
    private final List<SubmitReviewSecondaryRatingRemote> f91096e;

    /* renamed from: f  reason: collision with root package name */
    private final SubmitReviewOrderRemote f91097f;

    /* renamed from: g  reason: collision with root package name */
    private final String f91098g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<SubmitReviewBody> serializer() {
            return SubmitReviewBody$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubmitReviewBody(int i10, int i11, String str, String str2, boolean z10, List list, SubmitReviewOrderRemote submitReviewOrderRemote, String str3, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, SubmitReviewBody$$serializer.INSTANCE.getDescriptor());
        }
        this.f91092a = i11;
        this.f91093b = str;
        this.f91094c = str2;
        this.f91095d = z10;
        this.f91096e = list;
        this.f91097f = submitReviewOrderRemote;
        this.f91098g = str3;
    }

    public static final /* synthetic */ void b(SubmitReviewBody submitReviewBody, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f91091i;
        dVar.w(serialDescriptor, 0, submitReviewBody.f91092a);
        dVar.y(serialDescriptor, 1, submitReviewBody.f91093b);
        dVar.y(serialDescriptor, 2, submitReviewBody.f91094c);
        dVar.x(serialDescriptor, 3, submitReviewBody.f91095d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], submitReviewBody.f91096e);
        dVar.B(serialDescriptor, 5, SubmitReviewOrderRemote$$serializer.INSTANCE, submitReviewBody.f91097f);
        dVar.y(serialDescriptor, 6, submitReviewBody.f91098g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitReviewBody)) {
            return false;
        }
        SubmitReviewBody submitReviewBody = (SubmitReviewBody) obj;
        return this.f91092a == submitReviewBody.f91092a && C17542s.e(this.f91093b, submitReviewBody.f91093b) && C17542s.e(this.f91094c, submitReviewBody.f91094c) && this.f91095d == submitReviewBody.f91095d && C17542s.e(this.f91096e, submitReviewBody.f91096e) && C17542s.e(this.f91097f, submitReviewBody.f91097f) && C17542s.e(this.f91098g, submitReviewBody.f91098g);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f91092a) * 31) + this.f91093b.hashCode()) * 31) + this.f91094c.hashCode()) * 31) + Boolean.hashCode(this.f91095d)) * 31;
        List<SubmitReviewSecondaryRatingRemote> list = this.f91096e;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        SubmitReviewOrderRemote submitReviewOrderRemote = this.f91097f;
        if (submitReviewOrderRemote != null) {
            i10 = submitReviewOrderRemote.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f91098g.hashCode();
    }

    public String toString() {
        int i10 = this.f91092a;
        String str = this.f91093b;
        String str2 = this.f91094c;
        boolean z10 = this.f91095d;
        List<SubmitReviewSecondaryRatingRemote> list = this.f91096e;
        SubmitReviewOrderRemote submitReviewOrderRemote = this.f91097f;
        String str3 = this.f91098g;
        return "SubmitReviewBody(rating=" + i10 + ", title=" + str + ", text=" + str2 + ", recommended=" + z10 + ", secondaryRatings=" + list + ", order=" + submitReviewOrderRemote + ", sourceName=" + str3 + ")";
    }
}
