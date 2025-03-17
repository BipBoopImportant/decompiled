package com.contentsquare.android.sdk;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.w0  reason: case insensitive filesystem */
public abstract class C7158w0 {

    /* renamed from: com.contentsquare.android.sdk.w0$a */
    public static final class a extends C7158w0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47674a;

        /* renamed from: b  reason: collision with root package name */
        public final w8.b f47675b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47676c;

        /* renamed from: d  reason: collision with root package name */
        public final int f47677d;

        /* renamed from: e  reason: collision with root package name */
        public final Rect f47678e;

        /* renamed from: f  reason: collision with root package name */
        public final List<w8.e> f47679f;

        /* renamed from: g  reason: collision with root package name */
        public final Rect f47680g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f47681h;

        public a(String str, w8.b bVar, int i10, int i11, Rect rect, List<w8.e> list, Rect rect2, boolean z10) {
            C17542s.j(str, "snapshotId");
            C17542s.j(bVar, "scroller");
            C17542s.j(rect, "scrollContainerRect");
            C17542s.j(list, "itemsToProcess");
            C17542s.j(rect2, "pageRect");
            this.f47674a = str;
            this.f47675b = bVar;
            this.f47676c = i10;
            this.f47677d = i11;
            this.f47678e = rect;
            this.f47679f = list;
            this.f47680g = rect2;
            this.f47681h = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f47674a, aVar.f47674a) && C17542s.e(this.f47675b, aVar.f47675b) && this.f47676c == aVar.f47676c && this.f47677d == aVar.f47677d && C17542s.e(this.f47678e, aVar.f47678e) && C17542s.e(this.f47679f, aVar.f47679f) && C17542s.e(this.f47680g, aVar.f47680g) && this.f47681h == aVar.f47681h;
        }

        public final int hashCode() {
            int hashCode = this.f47675b.hashCode();
            int hashCode2 = Integer.hashCode(this.f47676c);
            int hashCode3 = Integer.hashCode(this.f47677d);
            int hashCode4 = this.f47678e.hashCode();
            int hashCode5 = this.f47679f.hashCode();
            int hashCode6 = (this.f47680g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f47674a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            boolean z10 = this.f47681h;
            if (z10) {
                z10 = true;
            }
            return hashCode6 + (z10 ? 1 : 0);
        }

        public final String toString() {
            return "ComposeLazy(snapshotId=" + this.f47674a + ", scroller=" + this.f47675b + ", itemCount=" + this.f47676c + ", processedItemCount=" + this.f47677d + ", scrollContainerRect=" + this.f47678e + ", itemsToProcess=" + this.f47679f + ", pageRect=" + this.f47680g + ", isLastPage=" + this.f47681h + ')';
        }
    }

    /* renamed from: com.contentsquare.android.sdk.w0$b */
    public static final class b extends C7158w0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47682a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47683b;

        /* renamed from: c  reason: collision with root package name */
        public final w8.c f47684c;

        public b(String str, int i10, w8.c cVar) {
            C17542s.j(str, "snapshotId");
            C17542s.j(cVar, "scroller");
            this.f47682a = str;
            this.f47683b = i10;
            this.f47684c = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f47682a, bVar.f47682a) && this.f47683b == bVar.f47683b && C17542s.e(this.f47684c, bVar.f47684c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f47683b);
            return this.f47684c.hashCode() + ((hashCode + (this.f47682a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ComposeScrollable(snapshotId=" + this.f47682a + ", snapshotIndex=" + this.f47683b + ", scroller=" + this.f47684c + ')';
        }
    }

    /* renamed from: com.contentsquare.android.sdk.w0$c */
    public static final class c extends C7158w0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47685a = new c();
    }

    /* renamed from: com.contentsquare.android.sdk.w0$d */
    public static final class d extends C7158w0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47686a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Rect> f47687b;

        /* renamed from: c  reason: collision with root package name */
        public final List<View> f47688c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f47689d;

        /* renamed from: e  reason: collision with root package name */
        public final List<Integer> f47690e;

        /* renamed from: f  reason: collision with root package name */
        public final int f47691f;

        /* renamed from: g  reason: collision with root package name */
        public final int f47692g;

        /* renamed from: h  reason: collision with root package name */
        public final r1 f47693h;

        /* renamed from: i  reason: collision with root package name */
        public final Rect f47694i;

        public d(String str, ArrayList arrayList, ArrayList arrayList2, Rect rect, ArrayList arrayList3, int i10, int i11, r1 r1Var, Rect rect2) {
            C17542s.j(str, "snapshotId");
            C17542s.j(arrayList, "itemRectangles");
            C17542s.j(arrayList2, "itemViews");
            C17542s.j(rect, "scrollContainerRect");
            C17542s.j(arrayList3, "snapshotIndices");
            C17542s.j(r1Var, "config");
            C17542s.j(rect2, "pageRect");
            this.f47686a = str;
            this.f47687b = arrayList;
            this.f47688c = arrayList2;
            this.f47689d = rect;
            this.f47690e = arrayList3;
            this.f47691f = i10;
            this.f47692g = i11;
            this.f47693h = r1Var;
            this.f47694i = rect2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f47686a, dVar.f47686a) && C17542s.e(this.f47687b, dVar.f47687b) && C17542s.e(this.f47688c, dVar.f47688c) && C17542s.e(this.f47689d, dVar.f47689d) && C17542s.e(this.f47690e, dVar.f47690e) && this.f47691f == dVar.f47691f && this.f47692g == dVar.f47692g && C17542s.e(this.f47693h, dVar.f47693h) && C17542s.e(this.f47694i, dVar.f47694i);
        }

        public final int hashCode() {
            int hashCode = this.f47687b.hashCode();
            int hashCode2 = this.f47688c.hashCode();
            int hashCode3 = this.f47689d.hashCode();
            int hashCode4 = this.f47690e.hashCode();
            int hashCode5 = Integer.hashCode(this.f47691f);
            int hashCode6 = Integer.hashCode(this.f47692g);
            int hashCode7 = this.f47693h.hashCode();
            return this.f47694i.hashCode() + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f47686a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "RecyclerView(snapshotId=" + this.f47686a + ", itemRectangles=" + this.f47687b + ", itemViews=" + this.f47688c + ", scrollContainerRect=" + this.f47689d + ", snapshotIndices=" + this.f47690e + ", numberOfSnapshots=" + this.f47691f + ", numberOfProcessedItems=" + this.f47692g + ", config=" + this.f47693h + ", pageRect=" + this.f47694i + ')';
        }
    }

    /* renamed from: com.contentsquare.android.sdk.w0$e */
    public static final class e extends C7158w0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47695a;

        /* renamed from: b  reason: collision with root package name */
        public final Point f47696b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f47697c;

        /* renamed from: d  reason: collision with root package name */
        public final int f47698d;

        /* renamed from: e  reason: collision with root package name */
        public final int f47699e;

        /* renamed from: f  reason: collision with root package name */
        public final r1 f47700f;

        public e(String str, Point point, Rect rect, int i10, int i11, r1 r1Var) {
            C17542s.j(str, "snapshotId");
            C17542s.j(point, "coordinates");
            C17542s.j(rect, "scrollContainerRect");
            C17542s.j(r1Var, "config");
            this.f47695a = str;
            this.f47696b = point;
            this.f47697c = rect;
            this.f47698d = i10;
            this.f47699e = i11;
            this.f47700f = r1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f47695a, eVar.f47695a) && C17542s.e(this.f47696b, eVar.f47696b) && C17542s.e(this.f47697c, eVar.f47697c) && this.f47698d == eVar.f47698d && this.f47699e == eVar.f47699e && C17542s.e(this.f47700f, eVar.f47700f);
        }

        public final int hashCode() {
            int hashCode = this.f47696b.hashCode();
            int hashCode2 = this.f47697c.hashCode();
            int hashCode3 = Integer.hashCode(this.f47698d);
            int hashCode4 = Integer.hashCode(this.f47699e);
            return this.f47700f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f47695a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ScrollView(snapshotId=" + this.f47695a + ", coordinates=" + this.f47696b + ", scrollContainerRect=" + this.f47697c + ", snapshotIndex=" + this.f47698d + ", numberOfSnapshots=" + this.f47699e + ", config=" + this.f47700f + ')';
        }
    }
}
