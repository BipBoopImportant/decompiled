package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import Mi.C10767b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u0014B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsFilterValueRemote;", "", "", "seen0", "", "label", "value", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsFilterValueRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LMi/b;", "a", "()LMi/b;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getLabel$annotations", "()V", "getValue", "getValue$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReviewsFilterValueRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f91079a;

    /* renamed from: b  reason: collision with root package name */
    private final String f91080b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsFilterValueRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsFilterValueRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReviewsFilterValueRemote> serializer() {
            return ReviewsFilterValueRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReviewsFilterValueRemote(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ReviewsFilterValueRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91079a = str;
        this.f91080b = str2;
    }

    public static final /* synthetic */ void b(ReviewsFilterValueRemote reviewsFilterValueRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, reviewsFilterValueRemote.f91079a);
        dVar.y(serialDescriptor, 1, reviewsFilterValueRemote.f91080b);
    }

    public final C10767b a() {
        return new C10767b(this.f91079a, this.f91080b);
    }
}
