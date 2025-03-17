package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

import YH.C16877v;
import com.ingka.ikea.browseandsearch.plp.datalayer.model.InjectablePriority;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import tn.C11926a;
import vn.c;
import vn.f;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003&'\u0019BE\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010!¨\u0006("}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6;", "Lpp/b;", "Lvn/f;", "", "seen0", "totalNumberOfProducts", "", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6$SortOptionRemoteV6;", "sortOptions", "", "injectablePriority", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lvn/f;", "a", "Ljava/lang/Integer;", "getTotalNumberOfProducts", "()Ljava/lang/Integer;", "getTotalNumberOfProducts$annotations", "()V", "Ljava/util/List;", "getSortOptions", "()Ljava/util/List;", "getSortOptions$annotations", "getInjectablePriority", "getInjectablePriority$annotations", "Companion", "SortOptionRemoteV6", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MetaInfoRemoteV6 implements C11768b<f> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f93425d = {null, new C17451f(MetaInfoRemoteV6$SortOptionRemoteV6$$serializer.INSTANCE), new C17451f(Y0.f144077a)};

    /* renamed from: a  reason: collision with root package name */
    private final Integer f93426a;

    /* renamed from: b  reason: collision with root package name */
    private final List<SortOptionRemoteV6> f93427b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f93428c;

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,\u0016B7\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010#\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6$SortOptionRemoteV6;", "Lpp/b;", "Lvn/c;", "", "seen0", "", "displayName", "sortByValue", "", "selected", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6$SortOptionRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lvn/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "getDisplayName$annotations", "()V", "getSortByValue", "getSortByValue$annotations", "c", "Z", "getSelected", "()Z", "getSelected$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SortOptionRemoteV6 implements C11768b<c> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93429a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93430b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f93431c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6$SortOptionRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6$SortOptionRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<SortOptionRemoteV6> serializer() {
                return MetaInfoRemoteV6$SortOptionRemoteV6$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ SortOptionRemoteV6(int i10, String str, String str2, boolean z10, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, MetaInfoRemoteV6$SortOptionRemoteV6$$serializer.INSTANCE.getDescriptor());
            }
            this.f93429a = str;
            this.f93430b = str2;
            this.f93431c = z10;
        }

        public static final /* synthetic */ void b(SortOptionRemoteV6 sortOptionRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, sortOptionRemoteV6.f93429a);
            dVar.y(serialDescriptor, 1, sortOptionRemoteV6.f93430b);
            dVar.x(serialDescriptor, 2, sortOptionRemoteV6.f93431c);
        }

        public c a() {
            return new c(this.f93429a, this.f93430b, this.f93431c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SortOptionRemoteV6)) {
                return false;
            }
            SortOptionRemoteV6 sortOptionRemoteV6 = (SortOptionRemoteV6) obj;
            return C17542s.e(this.f93429a, sortOptionRemoteV6.f93429a) && C17542s.e(this.f93430b, sortOptionRemoteV6.f93430b) && this.f93431c == sortOptionRemoteV6.f93431c;
        }

        public int hashCode() {
            return (((this.f93429a.hashCode() * 31) + this.f93430b.hashCode()) * 31) + Boolean.hashCode(this.f93431c);
        }

        public String toString() {
            String str = this.f93429a;
            String str2 = this.f93430b;
            boolean z10 = this.f93431c;
            return "SortOptionRemoteV6(displayName=" + str + ", sortByValue=" + str2 + ", selected=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MetaInfoRemoteV6> serializer() {
            return MetaInfoRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MetaInfoRemoteV6(int i10, Integer num, List list, List list2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, MetaInfoRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f93426a = num;
        this.f93427b = list;
        this.f93428c = list2;
    }

    public static final /* synthetic */ void c(MetaInfoRemoteV6 metaInfoRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93425d;
        dVar.B(serialDescriptor, 0, X.f144073a, metaInfoRemoteV6.f93426a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], metaInfoRemoteV6.f93427b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], metaInfoRemoteV6.f93428c);
    }

    public f b() {
        List list;
        List list2;
        Integer num = this.f93426a;
        if (num != null) {
            int intValue = num.intValue();
            List<SortOptionRemoteV6> list3 = this.f93427b;
            if (list3 != null) {
                Iterable<SortOptionRemoteV6> iterable = list3;
                list = new ArrayList(C16877v.y(iterable, 10));
                for (SortOptionRemoteV6 a10 : iterable) {
                    list.add(a10.a());
                }
            } else {
                list = C16877v.n();
            }
            List<String> list4 = this.f93428c;
            if (list4 != null) {
                list2 = new ArrayList();
                for (String a11 : list4) {
                    InjectablePriority a12 = C11926a.b(a11);
                    if (a12 != null) {
                        list2.add(a12);
                    }
                }
            } else {
                list2 = C16877v.n();
            }
            return new f(intValue, list, list2);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
