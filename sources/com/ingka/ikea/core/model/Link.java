package com.ingka.ikea.core.model;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.os.Parcel;
import android.os.Parcelable;
import fK.C17261n;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kp.C11524f;
import uI.C18055d;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/core/model/Link;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/core/model/Link;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "d", "()Ljava/lang/String;", "name", "e", "uri", "Companion", "External", "Deeplink", "a", "Lcom/ingka/ikea/core/model/Link$Deeplink;", "Lcom/ingka/ikea/core/model/Link$External;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Link implements Parcelable {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16824o<KSerializer<Object>> f94913a = C16825p.a(s.PUBLICATION, new C11524f());

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001c¨\u0006+"}, d2 = {"Lcom/ingka/ikea/core/model/Link$Deeplink;", "Lcom/ingka/ikea/core/model/Link;", "", "name", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/Link$Deeplink;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "e", "Companion", "$serializer", "a", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Deeplink extends Link {
        public static final Parcelable.Creator<Deeplink> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final String f94914b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94915c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/Link$Deeplink$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/Link$Deeplink;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Deeplink> serializer() {
                return Link$Deeplink$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Deeplink> {
            /* renamed from: a */
            public final Deeplink createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new Deeplink(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final Deeplink[] newArray(int i10) {
                return new Deeplink[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Deeplink(int i10, String str, String str2, T0 t02) {
            super(i10, t02);
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, Link$Deeplink$$serializer.INSTANCE.getDescriptor());
            }
            this.f94914b = str;
            this.f94915c = str2;
        }

        public static final /* synthetic */ void g(Deeplink deeplink, C17395d dVar, SerialDescriptor serialDescriptor) {
            Link.f(deeplink, dVar, serialDescriptor);
            dVar.B(serialDescriptor, 0, Y0.f144077a, deeplink.d());
            dVar.y(serialDescriptor, 1, deeplink.e());
        }

        public String d() {
            return this.f94914b;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f94915c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) obj;
            return C17542s.e(this.f94914b, deeplink.f94914b) && C17542s.e(this.f94915c, deeplink.f94915c);
        }

        public int hashCode() {
            String str = this.f94914b;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f94915c.hashCode();
        }

        public String toString() {
            String str = this.f94914b;
            String str2 = this.f94915c;
            return "Deeplink(name=" + str + ", uri=" + str2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f94914b);
            parcel.writeString(this.f94915c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Deeplink(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str2, "uri");
            this.f94914b = str;
            this.f94915c = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001c¨\u0006+"}, d2 = {"Lcom/ingka/ikea/core/model/Link$External;", "Lcom/ingka/ikea/core/model/Link;", "", "name", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/Link$External;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "e", "Companion", "$serializer", "a", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class External extends Link {
        public static final Parcelable.Creator<External> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final String f94916b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94917c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/Link$External$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/Link$External;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<External> serializer() {
                return Link$External$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<External> {
            /* renamed from: a */
            public final External createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new External(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final External[] newArray(int i10) {
                return new External[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ External(int i10, String str, String str2, T0 t02) {
            super(i10, t02);
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, Link$External$$serializer.INSTANCE.getDescriptor());
            }
            this.f94916b = str;
            this.f94917c = str2;
        }

        public static final /* synthetic */ void g(External external, C17395d dVar, SerialDescriptor serialDescriptor) {
            Link.f(external, dVar, serialDescriptor);
            dVar.B(serialDescriptor, 0, Y0.f144077a, external.d());
            dVar.y(serialDescriptor, 1, external.e());
        }

        public String d() {
            return this.f94916b;
        }

        public final int describeContents() {
            return 0;
        }

        public String e() {
            return this.f94917c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof External)) {
                return false;
            }
            External external = (External) obj;
            return C17542s.e(this.f94916b, external.f94916b) && C17542s.e(this.f94917c, external.f94917c);
        }

        public int hashCode() {
            String str = this.f94916b;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f94917c.hashCode();
        }

        public String toString() {
            String str = this.f94916b;
            String str2 = this.f94917c;
            return "External(name=" + str + ", uri=" + str2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f94916b);
            parcel.writeString(this.f94917c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public External(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str2, "uri");
            this.f94916b = str;
            this.f94917c = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/Link$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/Link;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) Link.f94913a.getValue();
        }

        public final KSerializer<Link> serializer() {
            return a();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Link(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new C17261n("com.ingka.ikea.core.model.Link", P.b(Link.class), new C18055d[]{P.b(Deeplink.class), P.b(External.class)}, new KSerializer[]{Link$Deeplink$$serializer.INSTANCE, Link$External$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void f(Link link, C17395d dVar, SerialDescriptor serialDescriptor) {
    }

    public abstract String d();

    public abstract String e();

    private Link() {
    }

    public /* synthetic */ Link(int i10, T0 t02) {
    }
}
