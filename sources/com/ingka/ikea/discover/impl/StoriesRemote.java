package com.ingka.ikea.discover.impl;

import KJ.C15985a;
import YH.C16877v;
import aq.C11079a;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+!B5\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0019R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/discover/impl/StoriesRemote;", "Lcom/ingka/ikea/discover/impl/a;", "Laq/a$h;", "", "seen0", "", "title", "", "Lcom/ingka/ikea/discover/impl/StoryLiteRemote;", "stories", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/discover/impl/StoriesRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Laq/a$h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getStories", "()Ljava/util/List;", "getStories$annotations", "Companion", "$serializer", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class StoriesRemote implements a<C11079a.h> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95536c = {null, new C17451f(StoryLiteRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95537a;

    /* renamed from: b  reason: collision with root package name */
    private final List<StoryLiteRemote> f95538b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/discover/impl/StoriesRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/discover/impl/StoriesRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoriesRemote> serializer() {
            return StoriesRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoriesRemote(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, StoriesRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95537a = str;
        this.f95538b = list;
    }

    public static final /* synthetic */ void c(StoriesRemote storiesRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95536c;
        dVar.B(serialDescriptor, 0, Y0.f144077a, storiesRemote.f95537a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], storiesRemote.f95538b);
    }

    /* renamed from: b */
    public C11079a.h toLocal() {
        String str = this.f95537a;
        Iterable<StoryLiteRemote> iterable = this.f95538b;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (StoryLiteRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        return new C11079a.h(str, C15985a.h(arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesRemote)) {
            return false;
        }
        StoriesRemote storiesRemote = (StoriesRemote) obj;
        return C17542s.e(this.f95537a, storiesRemote.f95537a) && C17542s.e(this.f95538b, storiesRemote.f95538b);
    }

    public int hashCode() {
        String str = this.f95537a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f95538b.hashCode();
    }

    public String toString() {
        String str = this.f95537a;
        List<StoryLiteRemote> list = this.f95538b;
        return "StoriesRemote(title=" + str + ", stories=" + list + ")";
    }
}
