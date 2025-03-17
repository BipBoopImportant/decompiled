package com.ingka.ikea.appconfig.model;

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

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 +2\u00020\u0001:\u0003\",\u0017B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/ingka/ikea/appconfig/model/ZipInValidation;", "", "", "postalCodeHint", "postalCodeValidation", "postalCodeKeyboardType", "cursorFocus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/appconfig/model/ZipInValidation;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/appconfig/model/ZipInValidation$b;", "a", "()Lcom/ingka/ikea/appconfig/model/ZipInValidation$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getPostalCodeHint$annotations", "()V", "d", "getPostalCodeValidation$annotations", "c", "getPostalCodeKeyboardType$annotations", "getCursorFocus", "getCursorFocus$annotations", "Companion", "$serializer", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZipInValidation {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f93025a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93026b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93027c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93028d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/model/ZipInValidation$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/model/ZipInValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ZipInValidation> serializer() {
            return ZipInValidation$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/appconfig/model/ZipInValidation$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "START", "END", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        START("START"),
        END("END");
        
        public static final a Companion = null;
        private final String value;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/appconfig/model/ZipInValidation$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/appconfig/model/ZipInValidation$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/appconfig/model/ZipInValidation$b;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str) {
                T t10;
                Iterator<T> it = b.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((b) t10).j(), str)) {
                        break;
                    }
                }
                return (b) t10;
            }

            private a() {
            }
        }

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private b(String str) {
            this.value = str;
        }

        public static C17220a<b> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.value;
        }
    }

    public /* synthetic */ ZipInValidation(int i10, String str, String str2, String str3, String str4, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, ZipInValidation$$serializer.INSTANCE.getDescriptor());
        }
        this.f93025a = str;
        this.f93026b = str2;
        this.f93027c = str3;
        this.f93028d = str4;
    }

    public static final /* synthetic */ void e(ZipInValidation zipInValidation, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, zipInValidation.f93025a);
        dVar.y(serialDescriptor, 1, zipInValidation.f93026b);
        dVar.y(serialDescriptor, 2, zipInValidation.f93027c);
        dVar.B(serialDescriptor, 3, Y0.f144077a, zipInValidation.f93028d);
    }

    public final b a() {
        return b.Companion.a(this.f93028d);
    }

    public final String b() {
        return this.f93025a;
    }

    public final String c() {
        return this.f93027c;
    }

    public final String d() {
        return this.f93026b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZipInValidation)) {
            return false;
        }
        ZipInValidation zipInValidation = (ZipInValidation) obj;
        return C17542s.e(this.f93025a, zipInValidation.f93025a) && C17542s.e(this.f93026b, zipInValidation.f93026b) && C17542s.e(this.f93027c, zipInValidation.f93027c) && C17542s.e(this.f93028d, zipInValidation.f93028d);
    }

    public int hashCode() {
        int hashCode = ((((this.f93025a.hashCode() * 31) + this.f93026b.hashCode()) * 31) + this.f93027c.hashCode()) * 31;
        String str = this.f93028d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f93025a;
        String str2 = this.f93026b;
        String str3 = this.f93027c;
        String str4 = this.f93028d;
        return "ZipInValidation(postalCodeHint=" + str + ", postalCodeValidation=" + str2 + ", postalCodeKeyboardType=" + str3 + ", cursorFocus=" + str4 + ")";
    }

    public ZipInValidation(String str, String str2, String str3, String str4) {
        C17542s.j(str, "postalCodeHint");
        C17542s.j(str2, "postalCodeValidation");
        C17542s.j(str3, "postalCodeKeyboardType");
        this.f93025a = str;
        this.f93026b = str2;
        this.f93027c = str3;
        this.f93028d = str4;
    }
}
