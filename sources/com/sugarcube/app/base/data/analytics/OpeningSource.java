package com.sugarcube.app.base.data.analytics;

import XH.C16796C;
import YH.X;
import androidx.annotation.Keep;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\n\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "Lcom/sugarcube/core/analytics/Trackable;", "key", "", "<init>", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "HomeTab", "SearchTab", "Profile", "MembersOverview", "MembersList", "PIP", "ItemList", "Push", "SearchSuggestion", "Link", "Companion", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$HomeTab;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$ItemList;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$Link;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$MembersList;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$MembersOverview;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$PIP;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$Profile;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$Push;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$SearchSuggestion;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource$SearchTab;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public abstract class OpeningSource implements Trackable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String key;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$Companion;", "", "<init>", "()V", "valueOf", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "source", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.sugarcube.app.base.data.analytics.OpeningSource} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.sugarcube.app.base.data.analytics.OpeningSource valueOf(java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.C17542s.j(r5, r0)
                java.lang.Class<com.sugarcube.app.base.data.analytics.OpeningSource> r0 = com.sugarcube.app.base.data.analytics.OpeningSource.class
                uI.d r0 = kotlin.jvm.internal.P.b(r0)
                java.util.List r0 = r0.m()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = YH.C16877v.y(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L_0x0020:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0036
                java.lang.Object r2 = r0.next()
                uI.d r2 = (uI.C18055d) r2
                java.lang.Object r2 = r2.p()
                com.sugarcube.app.base.data.analytics.OpeningSource r2 = (com.sugarcube.app.base.data.analytics.OpeningSource) r2
                r1.add(r2)
                goto L_0x0020
            L_0x0036:
                java.util.Iterator r0 = r1.iterator()
            L_0x003a:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L_0x0055
                java.lang.Object r1 = r0.next()
                r3 = r1
                com.sugarcube.app.base.data.analytics.OpeningSource r3 = (com.sugarcube.app.base.data.analytics.OpeningSource) r3
                if (r3 == 0) goto L_0x004e
                java.lang.String r2 = r3.getKey()
            L_0x004e:
                boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r5)
                if (r2 == 0) goto L_0x003a
                r2 = r1
            L_0x0055:
                com.sugarcube.app.base.data.analytics.OpeningSource r2 = (com.sugarcube.app.base.data.analytics.OpeningSource) r2
                if (r2 != 0) goto L_0x005e
                com.sugarcube.app.base.data.analytics.OpeningSource$Link r2 = new com.sugarcube.app.base.data.analytics.OpeningSource$Link
                r2.<init>(r5)
            L_0x005e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.analytics.OpeningSource.Companion.valueOf(java.lang.String):com.sugarcube.app.base.data.analytics.OpeningSource");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$HomeTab;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HomeTab extends OpeningSource {
        public static final int $stable = 0;
        public static final HomeTab INSTANCE = new HomeTab();

        private HomeTab() {
            super("HomeTab", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HomeTab);
        }

        public int hashCode() {
            return -1338419793;
        }

        public String toString() {
            return "HomeTab";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$ItemList;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemList extends OpeningSource {
        public static final int $stable = 0;
        public static final ItemList INSTANCE = new ItemList();

        private ItemList() {
            super("ItemList", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ItemList);
        }

        public int hashCode() {
            return -1172821512;
        }

        public String toString() {
            return "ItemList";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$Link;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Link extends OpeningSource {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String key = "Link";
        private final String source;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$Link$Companion;", "", "<init>", "()V", "key", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Link(String str) {
            super(key, (DefaultConstructorMarker) null);
            C17542s.j(str, "source");
            this.source = str;
        }

        public static /* synthetic */ Link copy$default(Link link, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = link.source;
            }
            return link.copy(str);
        }

        public final String component1() {
            return this.source;
        }

        public final Link copy(String str) {
            C17542s.j(str, "source");
            return new Link(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Link) && C17542s.e(this.source, ((Link) obj).source);
        }

        public final String getSource() {
            return this.source;
        }

        public HashMap<TrackingKey, String> getValues() {
            HashMap<TrackingKey, String> values = OpeningSource.super.getValues();
            HashMap<TrackingKey, String> hashMap = new HashMap<>();
            hashMap.putAll(values);
            hashMap.put(TrackingKey.Source, this.source);
            return hashMap;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            String str = this.source;
            return "Link(source=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$MembersList;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MembersList extends OpeningSource {
        public static final int $stable = 0;
        public static final MembersList INSTANCE = new MembersList();

        private MembersList() {
            super("MembersList", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MembersList);
        }

        public int hashCode() {
            return 1786673232;
        }

        public String toString() {
            return "MembersList";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$MembersOverview;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MembersOverview extends OpeningSource {
        public static final int $stable = 0;
        public static final MembersOverview INSTANCE = new MembersOverview();

        private MembersOverview() {
            super("MembersOverview", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MembersOverview);
        }

        public int hashCode() {
            return 1786088491;
        }

        public String toString() {
            return "MembersOverview";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$PIP;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PIP extends OpeningSource {
        public static final int $stable = 0;
        public static final PIP INSTANCE = new PIP();

        private PIP() {
            super("PIP", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PIP);
        }

        public int hashCode() {
            return -1407158896;
        }

        public String toString() {
            return "PIP";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$Profile;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Profile extends OpeningSource {
        public static final int $stable = 0;
        public static final Profile INSTANCE = new Profile();

        private Profile() {
            super("Profile", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Profile);
        }

        public int hashCode() {
            return 1554427170;
        }

        public String toString() {
            return "Profile";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$Push;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Push extends OpeningSource {
        public static final int $stable = 0;
        public static final Push INSTANCE = new Push();

        private Push() {
            super("Push", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Push);
        }

        public int hashCode() {
            return -672209343;
        }

        public String toString() {
            return "Push";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$SearchSuggestion;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchSuggestion extends OpeningSource {
        public static final int $stable = 0;
        public static final SearchSuggestion INSTANCE = new SearchSuggestion();

        private SearchSuggestion() {
            super("SearchSuggestion", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchSuggestion);
        }

        public int hashCode() {
            return 1432407667;
        }

        public String toString() {
            return "SearchSuggestion";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/OpeningSource$SearchTab;", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchTab extends OpeningSource {
        public static final int $stable = 0;
        public static final SearchTab INSTANCE = new SearchTab();

        private SearchTab() {
            super("SearchTab", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchTab);
        }

        public int hashCode() {
            return 1939491334;
        }

        public String toString() {
            return "SearchTab";
        }
    }

    public /* synthetic */ OpeningSource(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getKey() {
        return this.key;
    }

    public HashMap<TrackingKey, String> getValues() {
        return X.l(C16796C.a(TrackingKey.OpeningSource, this.key));
    }

    private OpeningSource(String str) {
        this.key = str;
    }
}
