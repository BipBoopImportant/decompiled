package com.sugarcube.app.base.data.feature;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uK.C18146a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014B%\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "", "name", "", "iconResId", "", "sortOrder", "<init>", "(Ljava/lang/String;II)V", "getName", "()Ljava/lang/String;", "getIconResId", "()I", "getSortOrder", "FeatureFlagGroup", "UserFlow", "Capture", "Decorate", "Upload", "ConfigRepo", "Blacklists", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$Blacklists;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$Capture;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$ConfigRepo;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$Decorate;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$FeatureFlagGroup;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$Upload;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$UserFlow;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConfigItemGroup {
    public static final int $stable = 0;
    private final int iconResId;
    private final String name;
    private final int sortOrder;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$Blacklists;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Blacklists extends ConfigItemGroup {
        public static final int $stable = 0;
        public static final Blacklists INSTANCE = new Blacklists();

        private Blacklists() {
            super("Blacklists", C18146a.f148002Cc, 5, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Blacklists);
        }

        public int hashCode() {
            return -2072481130;
        }

        public String toString() {
            return "Blacklists";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$Capture;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Capture extends ConfigItemGroup {
        public static final int $stable = 0;
        public static final Capture INSTANCE = new Capture();

        private Capture() {
            super("Capture", C18146a.f148351a1, 2, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Capture);
        }

        public int hashCode() {
            return -983272538;
        }

        public String toString() {
            return "Capture";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$ConfigRepo;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConfigRepo extends ConfigItemGroup {
        public static final int $stable = 0;
        public static final ConfigRepo INSTANCE = new ConfigRepo();

        private ConfigRepo() {
            super("Config", C18146a.f148412de, 6, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfigRepo);
        }

        public int hashCode() {
            return 385243508;
        }

        public String toString() {
            return "ConfigRepo";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$Decorate;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Decorate extends ConfigItemGroup {
        public static final int $stable = 0;
        public static final Decorate INSTANCE = new Decorate();

        private Decorate() {
            super("Decorate", C18146a.f148502j8, 3, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Decorate);
        }

        public int hashCode() {
            return 204278445;
        }

        public String toString() {
            return "Decorate";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$FeatureFlagGroup;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeatureFlagGroup extends ConfigItemGroup {
        public static final int $stable = 0;
        public static final FeatureFlagGroup INSTANCE = new FeatureFlagGroup();

        private FeatureFlagGroup() {
            super("Feature Flags", C18146a.f148574o4, 0, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeatureFlagGroup);
        }

        public int hashCode() {
            return 1568908221;
        }

        public String toString() {
            return "FeatureFlagGroup";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$Upload;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Upload extends ConfigItemGroup {
        public static final int $stable = 0;
        public static final Upload INSTANCE = new Upload();

        private Upload() {
            super("Uploads", C18146a.f148173O3, 4, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Upload);
        }

        public int hashCode() {
            return -333949535;
        }

        public String toString() {
            return "Upload";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/feature/ConfigItemGroup$UserFlow;", "Lcom/sugarcube/app/base/data/feature/ConfigItemGroup;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UserFlow extends ConfigItemGroup {
        public static final int $stable = 0;
        public static final UserFlow INSTANCE = new UserFlow();

        private UserFlow() {
            super("User Flow", C18146a.f148013D8, 1, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UserFlow);
        }

        public int hashCode() {
            return -633838791;
        }

        public String toString() {
            return "UserFlow";
        }
    }

    public /* synthetic */ ConfigItemGroup(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11);
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    private ConfigItemGroup(String str, int i10, int i11) {
        this.name = str;
        this.iconResId = i10;
        this.sortOrder = i11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConfigItemGroup(String str, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? C18146a.f148050G0 : i10, (i12 & 4) != 0 ? Integer.MAX_VALUE : i11, (DefaultConstructorMarker) null);
    }
}
