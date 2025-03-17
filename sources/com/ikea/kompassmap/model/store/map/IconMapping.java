package com.ikea.kompassmap.model.store.map;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18148c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lcom/ikea/kompassmap/model/store/map/IconMapping;", "", "", "name", "id", "iconName", "LuK/c;", "skapaIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LuK/c;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()LuK/c;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LuK/c;)Lcom/ikea/kompassmap/model/store/map/IconMapping;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getId", "getIconName", "LuK/c;", "getSkapaIcon", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IconMapping {
    public static final int $stable = 0;
    private final String iconName;

    /* renamed from: id  reason: collision with root package name */
    private final String f69451id;
    private final String name;
    private final C18148c skapaIcon;

    public IconMapping(String str, String str2, String str3, C18148c cVar) {
        C17542s.j(str, "name");
        C17542s.j(str2, "id");
        C17542s.j(str3, "iconName");
        C17542s.j(cVar, "skapaIcon");
        this.name = str;
        this.f69451id = str2;
        this.iconName = str3;
        this.skapaIcon = cVar;
    }

    public static /* synthetic */ IconMapping copy$default(IconMapping iconMapping, String str, String str2, String str3, C18148c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iconMapping.name;
        }
        if ((i10 & 2) != 0) {
            str2 = iconMapping.f69451id;
        }
        if ((i10 & 4) != 0) {
            str3 = iconMapping.iconName;
        }
        if ((i10 & 8) != 0) {
            cVar = iconMapping.skapaIcon;
        }
        return iconMapping.copy(str, str2, str3, cVar);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.f69451id;
    }

    public final String component3() {
        return this.iconName;
    }

    public final C18148c component4() {
        return this.skapaIcon;
    }

    public final IconMapping copy(String str, String str2, String str3, C18148c cVar) {
        C17542s.j(str, "name");
        C17542s.j(str2, "id");
        C17542s.j(str3, "iconName");
        C17542s.j(cVar, "skapaIcon");
        return new IconMapping(str, str2, str3, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconMapping)) {
            return false;
        }
        IconMapping iconMapping = (IconMapping) obj;
        return C17542s.e(this.name, iconMapping.name) && C17542s.e(this.f69451id, iconMapping.f69451id) && C17542s.e(this.iconName, iconMapping.iconName) && this.skapaIcon == iconMapping.skapaIcon;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final String getId() {
        return this.f69451id;
    }

    public final String getName() {
        return this.name;
    }

    public final C18148c getSkapaIcon() {
        return this.skapaIcon;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.f69451id.hashCode()) * 31) + this.iconName.hashCode()) * 31) + this.skapaIcon.hashCode();
    }

    public String toString() {
        return "IconMapping(name=" + this.name + ", id=" + this.f69451id + ", iconName=" + this.iconName + ", skapaIcon=" + this.skapaIcon + ')';
    }
}
