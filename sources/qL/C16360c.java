package QL;

import QL.C16362e;
import QL.h;
import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: QL.c  reason: case insensitive filesystem */
class C16360c {

    @TargetApi(24)
    /* renamed from: QL.c$a */
    static final class a extends C16360c {
        a() {
        }

        /* access modifiers changed from: package-private */
        public List<? extends C16362e.a> a(Executor executor) {
            return Arrays.asList(new C16362e.a[]{new g(), new i(executor)});
        }

        /* access modifiers changed from: package-private */
        public List<? extends h.a> b() {
            return Collections.singletonList(new r());
        }
    }

    C16360c() {
    }

    /* access modifiers changed from: package-private */
    public List<? extends C16362e.a> a(Executor executor) {
        return Collections.singletonList(new i(executor));
    }

    /* access modifiers changed from: package-private */
    public List<? extends h.a> b() {
        return Collections.emptyList();
    }
}
