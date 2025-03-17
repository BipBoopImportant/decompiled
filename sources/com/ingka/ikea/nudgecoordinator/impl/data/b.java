package com.ingka.ikea.nudgecoordinator.impl.data;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import R2.h;
import W2.e;
import W2.f;
import android.content.Context;
import com.optimizely.ab.config.FeatureVariable;
import java.io.File;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB)\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/nudgecoordinator/impl/data/b;", "Lcom/ingka/ikea/nudgecoordinator/impl/data/NudgeDataSource;", "LR2/h;", "LW2/f;", "dataStore", "LkK/c;", "json", "Lam/h;", "timeProvider", "<init>", "(LR2/h;LkK/c;Lam/h;)V", "a", "LR2/h;", "b", "LkK/c;", "c", "Lam/h;", "d", "nudgecoordinator-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements NudgeDataSource {

    /* renamed from: d  reason: collision with root package name */
    public static final a f50679d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h<f> f50680a;

    /* renamed from: b  reason: collision with root package name */
    private final C17514c f50681b;

    /* renamed from: c  reason: collision with root package name */
    private final am.h f50682c;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/nudgecoordinator/impl/data/b$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "dispatcher", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "FILE_NAME", "Ljava/lang/String;", "nudgecoordinator-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final h<f> c(String str, Context context, M m10) {
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new uw.a(context, str), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final File d(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final h<f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "dispatcher");
            return c("nudge_coordinator_storage", context, m10);
        }

        private a() {
        }
    }

    public b(h<f> hVar, C17514c cVar, am.h hVar2) {
        C17542s.j(hVar, "dataStore");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(hVar2, "timeProvider");
        this.f50680a = hVar;
        this.f50681b = cVar;
        this.f50682c = hVar2;
    }
}
