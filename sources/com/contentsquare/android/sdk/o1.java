package com.contentsquare.android.sdk;

import D8.c;
import XH.v;
import a9.C6841h3;
import a9.C6955v6;
import android.view.View;
import android.view.ViewGroup;
import java.util.PriorityQueue;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.p;

public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public final c f47577a = new c("ViewUtil");

    public static final class a {
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r2 = (r2 = r2.getResources()).getDisplayMetrics();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r1, android.content.Context r2) {
            /*
                r0 = 160(0xa0, float:2.24E-43)
                if (r2 == 0) goto L_0x0013
                android.content.res.Resources r2 = r2.getResources()
                if (r2 == 0) goto L_0x0013
                android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
                if (r2 == 0) goto L_0x0013
                int r2 = r2.densityDpi
                goto L_0x0014
            L_0x0013:
                r2 = r0
            L_0x0014:
                float r2 = (float) r2
                float r0 = (float) r0
                float r2 = r2 / r0
                float r1 = (float) r1
                float r1 = r1 / r2
                r2 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 + r2
                int r1 = (int) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.o1.a.a(int, android.content.Context):int");
        }
    }

    public static final class b extends C17544u implements p<v<? extends View, ? extends Integer>, v<? extends View, ? extends Integer>, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f47578c = new b();

        public b() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(C6841h3.a(((Number) ((v) obj).d()).intValue(), ((Number) ((v) obj2).d()).intValue()));
        }
    }

    public static final int a(p pVar, Object obj, Object obj2) {
        C17542s.j(pVar, "$tmp0");
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    public final View b(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "viewGroup");
        PriorityQueue priorityQueue = new PriorityQueue(10, new C6955v6(b.f47578c));
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            c cVar = this.f47577a;
            cVar.f("View Group without children detected, returning " + viewGroup);
            return null;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt == null || childAt.getVisibility() != 0) {
                c cVar2 = this.f47577a;
                cVar2.h("Child was null or invisible, skipping, " + childAt);
            } else {
                priorityQueue.add(new v(childAt, Integer.valueOf(childAt.getHeight() * childAt.getWidth())));
            }
        }
        v vVar = (v) priorityQueue.poll();
        if (vVar != null) {
            return (View) vVar.c();
        }
        return null;
    }
}
