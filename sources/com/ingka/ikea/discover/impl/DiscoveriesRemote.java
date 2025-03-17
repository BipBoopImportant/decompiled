package com.ingka.ikea.discover.impl;

import HJ.C15854t;
import KJ.C15985a;
import KJ.C15987c;
import XH.v;
import YH.C16877v;
import aq.C11079a;
import aq.C11080b;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 )2\u00020\u0001:\u0002*!B?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R,\u0010\u0006\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$¨\u0006+"}, d2 = {"Lcom/ingka/ikea/discover/impl/DiscoveriesRemote;", "", "", "seen0", "", "Lcom/ingka/ikea/discover/impl/a;", "discoveries", "", "publisherDiagnostics", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/discover/impl/DiscoveriesRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "useStoryPublisherMode", "Laq/b;", "b", "(Z)Laq/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getDiscoveries", "()Ljava/util/List;", "getDiscoveries$annotations", "()V", "getPublisherDiagnostics", "getPublisherDiagnostics$annotations", "Companion", "$serializer", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiscoveriesRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95521c = {new C17451f(b.f95562c), new C17451f(Y0.f144077a)};

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?>> f95522a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f95523b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/discover/impl/DiscoveriesRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/discover/impl/DiscoveriesRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DiscoveriesRemote> serializer() {
            return DiscoveriesRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DiscoveriesRemote(int i10, List list, List list2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, DiscoveriesRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95522a = list;
        this.f95523b = list2;
    }

    public static final /* synthetic */ void c(DiscoveriesRemote discoveriesRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95521c;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], discoveriesRemote.f95522a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], discoveriesRemote.f95523b);
    }

    public final C11080b b(boolean z10) {
        List<String> list;
        List<a<?>> list2 = this.f95522a;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list2) {
                if (((a) next) instanceof UnknownDiscoveryRemote) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            v vVar = new v(arrayList, arrayList2);
            List list3 = (List) vVar.a();
            List list4 = (List) vVar.b();
            C15987c cVar = null;
            if (!list3.isEmpty()) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unhandled types: " + list3);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar, false)) {
                        arrayList3.add(next2);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList3) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = DiscoveriesRemote.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalArgumentException, str3);
                    str = str3;
                    str2 = str4;
                }
            }
            Iterable<a> iterable = list4;
            ArrayList arrayList4 = new ArrayList(C16877v.y(iterable, 10));
            for (a local : iterable) {
                arrayList4.add((C11079a) local.toLocal());
            }
            C15987c h10 = C15985a.h(arrayList4);
            if (z10 && (list = this.f95523b) != null) {
                cVar = C15985a.h(list);
            }
            return new C11080b(h10, cVar);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveriesRemote)) {
            return false;
        }
        DiscoveriesRemote discoveriesRemote = (DiscoveriesRemote) obj;
        return C17542s.e(this.f95522a, discoveriesRemote.f95522a) && C17542s.e(this.f95523b, discoveriesRemote.f95523b);
    }

    public int hashCode() {
        List<a<?>> list = this.f95522a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f95523b;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        List<a<?>> list = this.f95522a;
        List<String> list2 = this.f95523b;
        return "DiscoveriesRemote(discoveries=" + list + ", publisherDiagnostics=" + list2 + ")";
    }
}
