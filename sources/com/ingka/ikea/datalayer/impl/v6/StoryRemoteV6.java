package com.ingka.ikea.datalayer.impl.v6;

import Mp.d;
import YH.C16877v;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.core.remotemodel.MediaRemote;
import com.ingka.ikea.core.remotemodel.MediaRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\b\u0018\u0000 E2\u00020\u0001:\u0002F)B}\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010-\u001a\u0004\b4\u00105R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u00108\u0012\u0004\b>\u0010-\u001a\u0004\b=\u0010:R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010*\u0012\u0004\bA\u0010-\u001a\u0004\b@\u0010#R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\bB\u00108\u0012\u0004\bD\u0010-\u001a\u0004\bC\u0010:¨\u0006G"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/v6/StoryRemoteV6;", "", "", "seen0", "", "id", "title", "intro", "Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "headlineMedia", "", "Lcom/ingka/ikea/datalayer/impl/v6/QuoteRemoteV6;", "headBeats", "Lcom/ingka/ikea/datalayer/impl/v6/SceneRemoteV6;", "scenes", "summary", "publisherDiagnostics", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/MediaRemote;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/datalayer/impl/v6/StoryRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "useStoryPublisherMode", "LMp/d;", "b", "(Z)LMp/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "getIntro", "getIntro$annotations", "d", "Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "getHeadlineMedia", "()Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "getHeadlineMedia$annotations", "e", "Ljava/util/List;", "getHeadBeats", "()Ljava/util/List;", "getHeadBeats$annotations", "f", "getScenes", "getScenes$annotations", "g", "getSummary", "getSummary$annotations", "h", "getPublisherDiagnostics", "getPublisherDiagnostics$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoryRemoteV6 {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f95509i = {null, null, null, null, new C17451f(QuoteRemoteV6$$serializer.INSTANCE), new C17451f(SceneRemoteV6$$serializer.INSTANCE), null, new C17451f(Y0.f144077a)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95510a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95511b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95512c;

    /* renamed from: d  reason: collision with root package name */
    private final MediaRemote f95513d;

    /* renamed from: e  reason: collision with root package name */
    private final List<QuoteRemoteV6> f95514e;

    /* renamed from: f  reason: collision with root package name */
    private final List<SceneRemoteV6> f95515f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95516g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f95517h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/v6/StoryRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/datalayer/impl/v6/StoryRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoryRemoteV6> serializer() {
            return StoryRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoryRemoteV6(int i10, String str, String str2, String str3, MediaRemote mediaRemote, List list, List list2, String str4, List list3, T0 t02) {
        if (255 != (i10 & 255)) {
            E0.b(i10, 255, StoryRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f95510a = str;
        this.f95511b = str2;
        this.f95512c = str3;
        this.f95513d = mediaRemote;
        this.f95514e = list;
        this.f95515f = list2;
        this.f95516g = str4;
        this.f95517h = list3;
    }

    public static final /* synthetic */ void c(StoryRemoteV6 storyRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95509i;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, storyRemoteV6.f95510a);
        dVar.B(serialDescriptor, 1, y02, storyRemoteV6.f95511b);
        dVar.B(serialDescriptor, 2, y02, storyRemoteV6.f95512c);
        dVar.B(serialDescriptor, 3, MediaRemote$$serializer.INSTANCE, storyRemoteV6.f95513d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], storyRemoteV6.f95514e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], storyRemoteV6.f95515f);
        dVar.B(serialDescriptor, 6, y02, storyRemoteV6.f95516g);
        dVar.B(serialDescriptor, 7, kSerializerArr[7], storyRemoteV6.f95517h);
    }

    public final d b(boolean z10) {
        ArrayList arrayList;
        String str = this.f95510a;
        if (str != null) {
            String str2 = this.f95511b;
            if (str2 != null) {
                String str3 = this.f95512c;
                MediaRemote mediaRemote = this.f95513d;
                Media a10 = mediaRemote != null ? mediaRemote.a() : null;
                List<QuoteRemoteV6> list = this.f95514e;
                if (list != null) {
                    Iterable<QuoteRemoteV6> iterable = list;
                    arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (QuoteRemoteV6 a11 : iterable) {
                        arrayList.add(a11.a());
                    }
                } else {
                    arrayList = null;
                }
                List<SceneRemoteV6> list2 = this.f95515f;
                if (list2 != null) {
                    Iterable<SceneRemoteV6> iterable2 = list2;
                    ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
                    for (SceneRemoteV6 b10 : iterable2) {
                        arrayList2.add(b10.b());
                    }
                    return new d(str, str2, str3, a10, arrayList, arrayList2, this.f95516g, z10 ? this.f95517h : null);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryRemoteV6)) {
            return false;
        }
        StoryRemoteV6 storyRemoteV6 = (StoryRemoteV6) obj;
        return C17542s.e(this.f95510a, storyRemoteV6.f95510a) && C17542s.e(this.f95511b, storyRemoteV6.f95511b) && C17542s.e(this.f95512c, storyRemoteV6.f95512c) && C17542s.e(this.f95513d, storyRemoteV6.f95513d) && C17542s.e(this.f95514e, storyRemoteV6.f95514e) && C17542s.e(this.f95515f, storyRemoteV6.f95515f) && C17542s.e(this.f95516g, storyRemoteV6.f95516g) && C17542s.e(this.f95517h, storyRemoteV6.f95517h);
    }

    public int hashCode() {
        String str = this.f95510a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95511b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95512c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MediaRemote mediaRemote = this.f95513d;
        int hashCode4 = (hashCode3 + (mediaRemote == null ? 0 : mediaRemote.hashCode())) * 31;
        List<QuoteRemoteV6> list = this.f95514e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<SceneRemoteV6> list2 = this.f95515f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.f95516g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list3 = this.f95517h;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        String str = this.f95510a;
        String str2 = this.f95511b;
        String str3 = this.f95512c;
        MediaRemote mediaRemote = this.f95513d;
        List<QuoteRemoteV6> list = this.f95514e;
        List<SceneRemoteV6> list2 = this.f95515f;
        String str4 = this.f95516g;
        List<String> list3 = this.f95517h;
        return "StoryRemoteV6(id=" + str + ", title=" + str2 + ", intro=" + str3 + ", headlineMedia=" + mediaRemote + ", headBeats=" + list + ", scenes=" + list2 + ", summary=" + str4 + ", publisherDiagnostics=" + list3 + ")";
    }
}
