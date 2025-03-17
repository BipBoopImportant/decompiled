package com.ingka.ikea.discover.impl;

import com.ingka.ikea.core.remotemodel.MediaRemote;
import com.ingka.ikea.core.remotemodel.MediaRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.C11559a;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-\u0016B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019R \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010$\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/discover/impl/StoryLiteRemote;", "Lpp/b;", "Llp/a;", "", "seen0", "", "id", "title", "Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "headlineMedia", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/MediaRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/discover/impl/StoryLiteRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Llp/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "c", "Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "getHeadlineMedia", "()Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "getHeadlineMedia$annotations", "Companion", "$serializer", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class StoryLiteRemote implements C11768b<C11559a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95539a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95540b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaRemote f95541c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/discover/impl/StoryLiteRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/discover/impl/StoryLiteRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoryLiteRemote> serializer() {
            return StoryLiteRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoryLiteRemote(int i10, String str, String str2, MediaRemote mediaRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, StoryLiteRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95539a = str;
        this.f95540b = str2;
        this.f95541c = mediaRemote;
    }

    public static final /* synthetic */ void b(StoryLiteRemote storyLiteRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, storyLiteRemote.f95539a);
        dVar.y(serialDescriptor, 1, storyLiteRemote.f95540b);
        dVar.B(serialDescriptor, 2, MediaRemote$$serializer.INSTANCE, storyLiteRemote.f95541c);
    }

    public C11559a a() {
        String str = this.f95539a;
        String str2 = this.f95540b;
        MediaRemote mediaRemote = this.f95541c;
        return new C11559a(str, str2, mediaRemote != null ? mediaRemote.a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryLiteRemote)) {
            return false;
        }
        StoryLiteRemote storyLiteRemote = (StoryLiteRemote) obj;
        return C17542s.e(this.f95539a, storyLiteRemote.f95539a) && C17542s.e(this.f95540b, storyLiteRemote.f95540b) && C17542s.e(this.f95541c, storyLiteRemote.f95541c);
    }

    public int hashCode() {
        int hashCode = ((this.f95539a.hashCode() * 31) + this.f95540b.hashCode()) * 31;
        MediaRemote mediaRemote = this.f95541c;
        return hashCode + (mediaRemote == null ? 0 : mediaRemote.hashCode());
    }

    public String toString() {
        String str = this.f95539a;
        String str2 = this.f95540b;
        MediaRemote mediaRemote = this.f95541c;
        return "StoryLiteRemote(id=" + str + ", title=" + str2 + ", headlineMedia=" + mediaRemote + ")";
    }
}
