package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import Mi.C10766a;
import Mi.C10773h;
import Mi.n;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 ;2\u00020\u0001:\u0002<'BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010 R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010/\u0012\u0004\b2\u0010+\u001a\u0004\b0\u00101R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00104\u0012\u0004\b:\u0010+\u001a\u0004\b9\u00106¨\u0006="}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsResponseRemote;", "", "", "seen0", "totalResult", "", "sortedBy", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/AvailableSettingRemote;", "availableSorting", "", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewResponseItemRemote;", "reviews", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/TranslationRemote;", "translations", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/String;Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/AvailableSettingRemote;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsResponseRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "retailCode", "languageCode", "LMi/h;", "b", "(Ljava/lang/String;Ljava/lang/String;)LMi/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTotalResult", "getTotalResult$annotations", "()V", "Ljava/lang/String;", "getSortedBy", "getSortedBy$annotations", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/AvailableSettingRemote;", "getAvailableSorting", "()Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/AvailableSettingRemote;", "getAvailableSorting$annotations", "d", "Ljava/util/List;", "getReviews", "()Ljava/util/List;", "getReviews$annotations", "e", "getTranslations", "getTranslations$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReviewsResponseRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f91082f = 8;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f91083g = {null, null, null, new C17451f(ReviewResponseItemRemote$$serializer.INSTANCE), new C17451f(TranslationRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final int f91084a;

    /* renamed from: b  reason: collision with root package name */
    private final String f91085b;

    /* renamed from: c  reason: collision with root package name */
    private final AvailableSettingRemote f91086c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ReviewResponseItemRemote> f91087d;

    /* renamed from: e  reason: collision with root package name */
    private final List<TranslationRemote> f91088e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsResponseRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsResponseRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReviewsResponseRemote> serializer() {
            return ReviewsResponseRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReviewsResponseRemote(int i10, int i11, String str, AvailableSettingRemote availableSettingRemote, List list, List list2, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, ReviewsResponseRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91084a = i11;
        this.f91085b = str;
        this.f91086c = availableSettingRemote;
        this.f91087d = list;
        this.f91088e = list2;
    }

    public static final /* synthetic */ void c(ReviewsResponseRemote reviewsResponseRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f91083g;
        dVar.w(serialDescriptor, 0, reviewsResponseRemote.f91084a);
        dVar.y(serialDescriptor, 1, reviewsResponseRemote.f91085b);
        dVar.i(serialDescriptor, 2, AvailableSettingRemote$$serializer.INSTANCE, reviewsResponseRemote.f91086c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], reviewsResponseRemote.f91087d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], reviewsResponseRemote.f91088e);
    }

    public final C10773h b(String str, String str2) {
        ArrayList arrayList;
        n nVar;
        Object obj;
        C17542s.j(str, "retailCode");
        C17542s.j(str2, "languageCode");
        C10766a b10 = this.f91086c.b();
        List<TranslationRemote> list = this.f91088e;
        if (list != null) {
            Iterable<TranslationRemote> iterable = list;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (TranslationRemote a10 : iterable) {
                arrayList.add(a10.a());
            }
        } else {
            arrayList = null;
        }
        int i10 = this.f91084a;
        Iterable<ReviewResponseItemRemote> iterable2 = this.f91087d;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (ReviewResponseItemRemote reviewResponseItemRemote : iterable2) {
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C17542s.e(((n) obj).b(), reviewResponseItemRemote.b())) {
                        break;
                    }
                }
                nVar = (n) obj;
            } else {
                nVar = null;
            }
            arrayList2.add(reviewResponseItemRemote.a(nVar, str, str2));
        }
        return new C10773h(i10, b10, arrayList2, this.f91085b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewsResponseRemote)) {
            return false;
        }
        ReviewsResponseRemote reviewsResponseRemote = (ReviewsResponseRemote) obj;
        return this.f91084a == reviewsResponseRemote.f91084a && C17542s.e(this.f91085b, reviewsResponseRemote.f91085b) && C17542s.e(this.f91086c, reviewsResponseRemote.f91086c) && C17542s.e(this.f91087d, reviewsResponseRemote.f91087d) && C17542s.e(this.f91088e, reviewsResponseRemote.f91088e);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f91084a) * 31) + this.f91085b.hashCode()) * 31) + this.f91086c.hashCode()) * 31) + this.f91087d.hashCode()) * 31;
        List<TranslationRemote> list = this.f91088e;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        int i10 = this.f91084a;
        String str = this.f91085b;
        AvailableSettingRemote availableSettingRemote = this.f91086c;
        List<ReviewResponseItemRemote> list = this.f91087d;
        List<TranslationRemote> list2 = this.f91088e;
        return "ReviewsResponseRemote(totalResult=" + i10 + ", sortedBy=" + str + ", availableSorting=" + availableSettingRemote + ", reviews=" + list + ", translations=" + list2 + ")";
    }
}
