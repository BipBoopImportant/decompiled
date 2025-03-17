package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C7427v2;
import com.google.android.gms.internal.measurement.C7443x2;
import com.google.android.gms.internal.measurement.L4;
import java.util.ArrayList;
import java.util.List;

final class Z5 {

    /* renamed from: a  reason: collision with root package name */
    private C7427v2 f50028a;

    /* renamed from: b  reason: collision with root package name */
    private Long f50029b;

    /* renamed from: c  reason: collision with root package name */
    private long f50030c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Y5 f50031d;

    /* access modifiers changed from: package-private */
    public final C7427v2 a(String str, C7427v2 v2Var) {
        Object obj;
        String X10 = v2Var.X();
        List<C7443x2> Y10 = v2Var.Y();
        this.f50031d.l();
        Long l10 = (Long) N5.d0(v2Var, "_eid");
        boolean z10 = l10 != null;
        if (z10 && X10.equals("_ep")) {
            C6620s.l(l10);
            this.f50031d.l();
            X10 = (String) N5.d0(v2Var, "_en");
            if (TextUtils.isEmpty(X10)) {
                this.f50031d.f().G().b("Extra parameter without an event name. eventId", l10);
                return null;
            }
            if (this.f50028a == null || this.f50029b == null || l10.longValue() != this.f50029b.longValue()) {
                Pair<C7427v2, Long> H10 = this.f50031d.n().H(str, l10);
                if (H10 == null || (obj = H10.first) == null) {
                    this.f50031d.f().G().c("Extra parameter without existing main event. eventName, eventId", X10, l10);
                    return null;
                }
                this.f50028a = (C7427v2) obj;
                this.f50030c = ((Long) H10.second).longValue();
                this.f50031d.l();
                this.f50029b = (Long) N5.d0(this.f50028a, "_eid");
            }
            long j10 = this.f50030c - 1;
            this.f50030c = j10;
            if (j10 <= 0) {
                C7660p n10 = this.f50031d.n();
                n10.k();
                n10.f().I().b("Clearing complex main event info. appId", str);
                try {
                    n10.z().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e10) {
                    n10.f().E().b("Error clearing complex main event", e10);
                }
            } else {
                this.f50031d.n().q0(str, l10, this.f50030c, this.f50028a);
            }
            ArrayList arrayList = new ArrayList();
            for (C7443x2 next : this.f50028a.Y()) {
                this.f50031d.l();
                if (N5.D(v2Var, next.Z()) == null) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(Y10);
                Y10 = arrayList;
            } else {
                this.f50031d.f().G().b("No unique parameters in main event. eventName", X10);
            }
        } else if (z10) {
            this.f50029b = l10;
            this.f50028a = v2Var;
            this.f50031d.l();
            long longValue = ((Long) N5.H(v2Var, "_epc", 0L)).longValue();
            this.f50030c = longValue;
            if (longValue <= 0) {
                this.f50031d.f().G().b("Complex event with zero extra param count. eventName", X10);
            } else {
                this.f50031d.n().q0(str, (Long) C6620s.l(l10), this.f50030c, v2Var);
            }
        }
        return (C7427v2) ((L4) ((C7427v2.a) v2Var.A()).K(X10).P().I(Y10).s());
    }

    private Z5(Y5 y52) {
        this.f50031d = y52;
    }
}
