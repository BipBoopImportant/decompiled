package com.ingka.ikea.discover.impl;

import HJ.C15854t;
import KJ.C15985a;
import XH.v;
import YH.C16877v;
import aq.C11079a;
import com.sugarcube.core.logger.DslKt;
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
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00026$BW\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\f\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010%\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001cR,\u0010\f\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/ingka/ikea/discover/impl/StoryRemote;", "Lcom/ingka/ikea/discover/impl/a;", "Laq/a$g;", "", "seen0", "", "storyId", "purpose", "title", "actionTitle", "", "Lcom/ingka/ikea/discover/impl/i;", "cards", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/discover/impl/StoryRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Laq/a$g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStoryId", "getStoryId$annotations", "()V", "getPurpose", "getPurpose$annotations", "getTitle", "getTitle$annotations", "d", "getActionTitle", "getActionTitle$annotations", "e", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "getCards$annotations", "Companion", "$serializer", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class StoryRemote implements a<C11079a.g> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f95543f = {null, null, null, null, new C17451f(j.f95567c)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95544a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95545b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95546c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95547d;

    /* renamed from: e  reason: collision with root package name */
    private final List<i<?>> f95548e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/discover/impl/StoryRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/discover/impl/StoryRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoryRemote> serializer() {
            return StoryRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoryRemote(int i10, String str, String str2, String str3, String str4, List list, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, StoryRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95544a = str;
        this.f95545b = str2;
        this.f95546c = str3;
        this.f95547d = str4;
        this.f95548e = list;
    }

    public static final /* synthetic */ void c(StoryRemote storyRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95543f;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, storyRemote.f95544a);
        dVar.B(serialDescriptor, 1, y02, storyRemote.f95545b);
        dVar.B(serialDescriptor, 2, y02, storyRemote.f95546c);
        dVar.B(serialDescriptor, 3, y02, storyRemote.f95547d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], storyRemote.f95548e);
    }

    /* renamed from: b */
    public C11079a.g toLocal() {
        String str = this.f95544a;
        if (str != null) {
            String str2 = this.f95545b;
            if (str2 != null) {
                String str3 = this.f95546c;
                if (str3 != null) {
                    String str4 = this.f95547d;
                    if (str4 != null) {
                        List<i<?>> list = this.f95548e;
                        if (list != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object next : list) {
                                if (((i) next) instanceof UnknownStoryCardRemote) {
                                    arrayList.add(next);
                                } else {
                                    arrayList2.add(next);
                                }
                            }
                            v vVar = new v(arrayList, arrayList2);
                            List list2 = (List) vVar.a();
                            List list3 = (List) vVar.b();
                            if (!list2.isEmpty()) {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unhandled types: " + list2);
                                e eVar = e.ERROR;
                                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                                for (Object next2 : d.f102012a.a()) {
                                    if (((C11819b) next2).b(eVar, false)) {
                                        arrayList3.add(next2);
                                    }
                                }
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                for (C11819b bVar : arrayList3) {
                                    if (str6 == null) {
                                        String a10 = C11818a.a(str5, illegalArgumentException);
                                        if (a10 == null) {
                                            break;
                                        }
                                        str6 = C11820c.a(a10);
                                    }
                                    String str8 = str6;
                                    if (str7 == null) {
                                        String name = StoryRemote.class.getName();
                                        C17542s.g(name);
                                        String o12 = C15854t.o1(C15854t.s1(name, '$', str5, 2, str5), '.', str5, 2, str5);
                                        if (o12.length() != 0) {
                                            name = C15854t.P0(o12, "Kt");
                                        }
                                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                                    }
                                    String str9 = str7;
                                    bVar.a(eVar, str9, false, illegalArgumentException, str8);
                                    str6 = str8;
                                    str7 = str9;
                                    str5 = str5;
                                }
                            }
                            Iterable<i> iterable = list3;
                            ArrayList arrayList4 = new ArrayList(C16877v.y(iterable, 10));
                            for (i local : iterable) {
                                arrayList4.add((aq.e) local.toLocal());
                            }
                            return new C11079a.g(str, str2, str3, str4, C15985a.h(arrayList4));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
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
        if (!(obj instanceof StoryRemote)) {
            return false;
        }
        StoryRemote storyRemote = (StoryRemote) obj;
        return C17542s.e(this.f95544a, storyRemote.f95544a) && C17542s.e(this.f95545b, storyRemote.f95545b) && C17542s.e(this.f95546c, storyRemote.f95546c) && C17542s.e(this.f95547d, storyRemote.f95547d) && C17542s.e(this.f95548e, storyRemote.f95548e);
    }

    public int hashCode() {
        String str = this.f95544a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95545b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95546c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95547d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<i<?>> list = this.f95548e;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f95544a;
        String str2 = this.f95545b;
        String str3 = this.f95546c;
        String str4 = this.f95547d;
        List<i<?>> list = this.f95548e;
        return "StoryRemote(storyId=" + str + ", purpose=" + str2 + ", title=" + str3 + ", actionTitle=" + str4 + ", cards=" + list + ")";
    }
}
