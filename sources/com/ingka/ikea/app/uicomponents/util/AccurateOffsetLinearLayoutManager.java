package com.ingka.ikea.app.uicomponents.util;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/util/AccurateOffsetLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "state", "LXH/N;", "x1", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "", "W", "(Landroidx/recyclerview/widget/RecyclerView$C;)I", "", "I", "Ljava/util/Map;", "childSizesMap", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccurateOffsetLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: I  reason: collision with root package name */
    private final Map<Integer, Integer> f92690I = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccurateOffsetLinearLayoutManager(Context context) {
        super(context);
        C17542s.j(context, "context");
    }

    public int W(RecyclerView.C c10) {
        View k02;
        C17542s.j(c10, "state");
        if (l0() <= 0 || (k02 = k0(0)) == null) {
            return 0;
        }
        int E02 = E0(k02);
        int i10 = -((int) k02.getY());
        for (int i11 = 0; i11 < E02; i11++) {
            Integer num = this.f92690I.get(Integer.valueOf(i11));
            i10 += num != null ? num.intValue() : 0;
        }
        return i10;
    }

    public void x1(RecyclerView.C c10) {
        super.x1(c10);
        this.f92690I.clear();
        int l02 = l0();
        for (int i10 = 0; i10 < l02; i10++) {
            View k02 = k0(i10);
            if (k02 != null) {
                this.f92690I.put(Integer.valueOf(E0(k02)), Integer.valueOf(k02.getHeight()));
            }
        }
    }
}
