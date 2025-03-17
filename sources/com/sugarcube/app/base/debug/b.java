package com.sugarcube.app.base.debug;

import TJ.C16519P;
import VE.C13759a;
import com.sugarcube.app.base.data.feature.ConfigItem;
import com.sugarcube.app.base.data.feature.ConfigItemGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/app/base/debug/b;", "", "<init>", "()V", "f", "e", "b", "g", "c", "i", "h", "j", "d", "a", "Lcom/sugarcube/app/base/debug/b$a;", "Lcom/sugarcube/app/base/debug/b$b;", "Lcom/sugarcube/app/base/debug/b$c;", "Lcom/sugarcube/app/base/debug/b$d;", "Lcom/sugarcube/app/base/debug/b$e;", "Lcom/sugarcube/app/base/debug/b$f;", "Lcom/sugarcube/app/base/debug/b$g;", "Lcom/sugarcube/app/base/debug/b$h;", "Lcom/sugarcube/app/base/debug/b$i;", "Lcom/sugarcube/app/base/debug/b$j;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/app/base/debug/b$a;", "Lcom/sugarcube/app/base/debug/b;", "", "libVersion", "decorateVersion", "arCoreVersion", "appVersion", "", "debug", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Z", "()Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final String f122975a;

        /* renamed from: b  reason: collision with root package name */
        private final String f122976b;

        /* renamed from: c  reason: collision with root package name */
        private final String f122977c;

        /* renamed from: d  reason: collision with root package name */
        private final String f122978d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f122979e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, boolean z10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "libVersion");
            C17542s.j(str2, "decorateVersion");
            C17542s.j(str3, "arCoreVersion");
            C17542s.j(str4, "appVersion");
            this.f122975a = str;
            this.f122976b = str2;
            this.f122977c = str3;
            this.f122978d = str4;
            this.f122979e = z10;
        }

        public final String a() {
            return this.f122978d;
        }

        public final String b() {
            return this.f122977c;
        }

        public final boolean c() {
            return this.f122979e;
        }

        public final String d() {
            return this.f122976b;
        }

        public final String e() {
            return this.f122975a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f122975a, aVar.f122975a) && C17542s.e(this.f122976b, aVar.f122976b) && C17542s.e(this.f122977c, aVar.f122977c) && C17542s.e(this.f122978d, aVar.f122978d) && this.f122979e == aVar.f122979e;
        }

        public int hashCode() {
            return (((((((this.f122975a.hashCode() * 31) + this.f122976b.hashCode()) * 31) + this.f122977c.hashCode()) * 31) + this.f122978d.hashCode()) * 31) + Boolean.hashCode(this.f122979e);
        }

        public String toString() {
            String str = this.f122975a;
            String str2 = this.f122976b;
            String str3 = this.f122977c;
            String str4 = this.f122978d;
            boolean z10 = this.f122979e;
            return "AppVersion(libVersion=" + str + ", decorateVersion=" + str2 + ", arCoreVersion=" + str3 + ", appVersion=" + str4 + ", debug=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/debug/b$b;", "Lcom/sugarcube/app/base/debug/b;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "", "configItem", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "()Lcom/sugarcube/app/base/data/feature/ConfigItem;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.debug.b$b  reason: collision with other inner class name */
    public static final class C3027b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ConfigItem<Boolean> f122980a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3027b(ConfigItem<Boolean> configItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(configItem, "configItem");
            this.f122980a = configItem;
        }

        public final ConfigItem<Boolean> a() {
            return this.f122980a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3027b) && C17542s.e(this.f122980a, ((C3027b) obj).f122980a);
        }

        public int hashCode() {
            return this.f122980a.hashCode();
        }

        public String toString() {
            ConfigItem<Boolean> configItem = this.f122980a;
            return "BooleanSwitchItem(configItem=" + configItem + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/debug/b$c;", "Lcom/sugarcube/app/base/debug/b;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "", "configItem", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "()Lcom/sugarcube/app/base/data/feature/ConfigItem;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ConfigItem<Double> f122981a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ConfigItem<Double> configItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(configItem, "configItem");
            this.f122981a = configItem;
        }

        public final ConfigItem<Double> a() {
            return this.f122981a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f122981a, ((c) obj).f122981a);
        }

        public int hashCode() {
            return this.f122981a.hashCode();
        }

        public String toString() {
            ConfigItem<Double> configItem = this.f122981a;
            return "DoubleEditor(configItem=" + configItem + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/app/base/debug/b$d;", "Lcom/sugarcube/app/base/debug/b;", "LTJ/P;", "LVE/a;", "currentEnvironment", "", "environments", "<init>", "(LTJ/P;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LTJ/P;", "()LTJ/P;", "b", "Ljava/util/List;", "()Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        private final C16519P<C13759a> f122982a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C13759a> f122983b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16519P<? extends C13759a> p10, List<? extends C13759a> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(p10, "currentEnvironment");
            C17542s.j(list, "environments");
            this.f122982a = p10;
            this.f122983b = list;
        }

        public final C16519P<C13759a> a() {
            return this.f122982a;
        }

        public final List<C13759a> b() {
            return this.f122983b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f122982a, dVar.f122982a) && C17542s.e(this.f122983b, dVar.f122983b);
        }

        public int hashCode() {
            return (this.f122982a.hashCode() * 31) + this.f122983b.hashCode();
        }

        public String toString() {
            C16519P<C13759a> p10 = this.f122982a;
            List<C13759a> list = this.f122983b;
            return "EnvironmentSelector(currentEnvironment=" + p10 + ", environments=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/app/base/debug/b$e;", "Lcom/sugarcube/app/base/debug/b;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "group", "", "children", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "b", "()Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "Ljava/util/List;", "()Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ConfigItemGroup f122984a;

        /* renamed from: b  reason: collision with root package name */
        private final List<b> f122985b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ConfigItemGroup configItemGroup, List<? extends b> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(configItemGroup, "group");
            C17542s.j(list, "children");
            this.f122984a = configItemGroup;
            this.f122985b = list;
        }

        public final List<b> a() {
            return this.f122985b;
        }

        public final ConfigItemGroup b() {
            return this.f122984a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f122984a, eVar.f122984a) && C17542s.e(this.f122985b, eVar.f122985b);
        }

        public int hashCode() {
            return (this.f122984a.hashCode() * 31) + this.f122985b.hashCode();
        }

        public String toString() {
            ConfigItemGroup configItemGroup = this.f122984a;
            List<b> list = this.f122985b;
            return "Group(group=" + configItemGroup + ", children=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/app/base/debug/b$f;", "Lcom/sugarcube/app/base/debug/b;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        private final String f122986a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            this.f122986a = str;
        }

        public final String a() {
            return this.f122986a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C17542s.e(this.f122986a, ((f) obj).f122986a);
        }

        public int hashCode() {
            return this.f122986a.hashCode();
        }

        public String toString() {
            String str = this.f122986a;
            return "Header(text=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/debug/b$g;", "Lcom/sugarcube/app/base/debug/b;", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "Ljava/lang/Integer;", "configItem", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "()Lcom/sugarcube/app/base/data/feature/ConfigItem;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ConfigItem<Integer> f122987a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ConfigItem<Integer> configItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(configItem, "configItem");
            this.f122987a = configItem;
        }

        public final ConfigItem<Integer> a() {
            return this.f122987a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && C17542s.e(this.f122987a, ((g) obj).f122987a);
        }

        public int hashCode() {
            return this.f122987a.hashCode();
        }

        public String toString() {
            ConfigItem<Integer> configItem = this.f122987a;
            return "IntegerEditor(configItem=" + configItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/debug/b$h;", "Lcom/sugarcube/app/base/debug/b;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListConfigItem;", "configItem", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListConfigItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListConfigItem;", "()Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListConfigItem;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ConfigItem.ObjectListConfigItem f122988a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ConfigItem.ObjectListConfigItem objectListConfigItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(objectListConfigItem, "configItem");
            this.f122988a = objectListConfigItem;
        }

        public final ConfigItem.ObjectListConfigItem a() {
            return this.f122988a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C17542s.e(this.f122988a, ((h) obj).f122988a);
        }

        public int hashCode() {
            return this.f122988a.hashCode();
        }

        public String toString() {
            ConfigItem.ObjectListConfigItem objectListConfigItem = this.f122988a;
            return "ObjectDropdown(configItem=" + objectListConfigItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/debug/b$i;", "Lcom/sugarcube/app/base/debug/b;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringListConfigItem;", "configItem", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItem$StringListConfigItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringListConfigItem;", "()Lcom/sugarcube/app/base/data/feature/ConfigItem$StringListConfigItem;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ConfigItem.StringListConfigItem f122989a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(ConfigItem.StringListConfigItem stringListConfigItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(stringListConfigItem, "configItem");
            this.f122989a = stringListConfigItem;
        }

        public final ConfigItem.StringListConfigItem a() {
            return this.f122989a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C17542s.e(this.f122989a, ((i) obj).f122989a);
        }

        public int hashCode() {
            return this.f122989a.hashCode();
        }

        public String toString() {
            ConfigItem.StringListConfigItem stringListConfigItem = this.f122989a;
            return "StringDropdown(configItem=" + stringListConfigItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/debug/b$j;", "Lcom/sugarcube/app/base/debug/b;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "configItem", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "()Lcom/sugarcube/app/base/data/feature/ConfigItem$StringConfigItem;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ConfigItem.StringConfigItem f122990a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(ConfigItem.StringConfigItem stringConfigItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(stringConfigItem, "configItem");
            this.f122990a = stringConfigItem;
        }

        public final ConfigItem.StringConfigItem a() {
            return this.f122990a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && C17542s.e(this.f122990a, ((j) obj).f122990a);
        }

        public int hashCode() {
            return this.f122990a.hashCode();
        }

        public String toString() {
            ConfigItem.StringConfigItem stringConfigItem = this.f122990a;
            return "StringEditor(configItem=" + stringConfigItem + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
