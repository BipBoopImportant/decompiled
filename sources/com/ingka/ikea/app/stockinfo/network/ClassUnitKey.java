package com.ingka.ikea.app.stockinfo.network;

import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey;", "", "", "classUnitCode", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "classUnitType", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "()Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "Remote", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClassUnitKey {

    /* renamed from: a  reason: collision with root package name */
    private final String f92596a;

    /* renamed from: b  reason: collision with root package name */
    private final a f92597b;

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u0014B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$Remote;", "", "", "seen0", "", "classUnitCode", "classUnitType", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey;", "a", "()Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClassUnitCode", "getClassUnitCode$annotations", "()V", "getClassUnitType", "getClassUnitType$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Remote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f92598a;

        /* renamed from: b  reason: collision with root package name */
        private final String f92599b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Remote> serializer() {
                return ClassUnitKey$Remote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Remote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, ClassUnitKey$Remote$$serializer.INSTANCE.getDescriptor());
            }
            this.f92598a = str;
            this.f92599b = str2;
        }

        public static final /* synthetic */ void b(Remote remote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, remote.f92598a);
            dVar.B(serialDescriptor, 1, y02, remote.f92599b);
        }

        public final ClassUnitKey a() {
            String str;
            a a10 = a.Companion.a(this.f92599b);
            if (a10 == null || (str = this.f92598a) == null || str.length() == 0) {
                return null;
            }
            return new ClassUnitKey(this.f92598a, a10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj;
            return C17542s.e(this.f92598a, remote.f92598a) && C17542s.e(this.f92599b, remote.f92599b);
        }

        public int hashCode() {
            String str = this.f92598a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f92599b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f92598a;
            String str2 = this.f92599b;
            return "Remote(classUnitCode=" + str + ", classUnitType=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "STORE", "RETAIL_UNIT", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        STORE("STO"),
        RETAIL_UNIT("RU");
        
        public static final C2058a Companion = null;
        private final String rawValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.stockinfo.network.ClassUnitKey$a$a  reason: collision with other inner class name */
        public static final class C2058a {
            public /* synthetic */ C2058a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                T t10;
                Iterator<T> it = a.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((a) t10).j(), str)) {
                        break;
                    }
                }
                return (a) t10;
            }

            private C2058a() {
            }
        }

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C2058a((DefaultConstructorMarker) null);
        }

        private a(String str) {
            this.rawValue = str;
        }

        public static C17220a<a> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.rawValue;
        }
    }

    public ClassUnitKey(String str, a aVar) {
        C17542s.j(str, "classUnitCode");
        C17542s.j(aVar, "classUnitType");
        this.f92596a = str;
        this.f92597b = aVar;
    }

    public final String a() {
        return this.f92596a;
    }

    public final a b() {
        return this.f92597b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassUnitKey)) {
            return false;
        }
        ClassUnitKey classUnitKey = (ClassUnitKey) obj;
        return C17542s.e(this.f92596a, classUnitKey.f92596a) && this.f92597b == classUnitKey.f92597b;
    }

    public int hashCode() {
        return (this.f92596a.hashCode() * 31) + this.f92597b.hashCode();
    }

    public String toString() {
        String str = this.f92596a;
        a aVar = this.f92597b;
        return "ClassUnitKey(classUnitCode=" + str + ", classUnitType=" + aVar + ")";
    }
}
