package a9;

import D8.c;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.P0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.content.Intent;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.V5;
import dI.C17164e;
import eI.C17187b;
import jI.C17416c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipOutputStream;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsViewModel$createEmailIntent$1", f = "SettingsViewModel.kt", l = {462}, m = "invokeSuspend")
public final class R2 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42237c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f42238d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C7130i0 f42239e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f42240f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C17642l<Intent, C16807N> f42241g;

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsViewModel$createEmailIntent$1$1", f = "SettingsViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C17642l<Intent, C16807N> f42242c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Intent f42243d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(V5.a aVar, Intent intent, C17164e eVar) {
            super(2, eVar);
            this.f42242c = aVar;
            this.f42243d = intent;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a((V5.a) this.f42242c, this.f42243d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            C17642l<Intent, C16807N> lVar = this.f42242c;
            return new a((V5.a) lVar, this.f42243d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            y.b(obj);
            this.f42242c.invoke(this.f42243d);
            return C16807N.f139792a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R2(String str, C7130i0 i0Var, Context context, V5.a aVar, C17164e eVar) {
        super(2, eVar);
        this.f42238d = str;
        this.f42239e = i0Var;
        this.f42240f = context;
        this.f42241g = aVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new R2(this.f42238d, this.f42239e, this.f42240f, (V5.a) this.f42241g, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((R2) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f42237c;
        if (i10 == 0) {
            y.b(obj);
            D8.a d10 = c.f34592b.d();
            if (d10 != null) {
                d10.d();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f42238d);
            String str = File.separator;
            sb2.append(str);
            sb2.append("cs");
            String sb3 = sb2.toString();
            File file = new File(sb3, "debug-logs");
            File file2 = new File(sb3, "telemetry");
            File file3 = new File(sb3 + str + "cs_debug_logs.zip");
            C7130i0 i0Var = this.f42239e;
            List<File> q10 = C16877v.q(file, file2);
            i0Var.getClass();
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file3)));
            try {
                for (File file4 : q10) {
                    String name = file4.getName();
                    C17542s.i(name, "folder.name");
                    C7130i0.c(file4, name, zipOutputStream);
                }
                C16807N n10 = C16807N.f139792a;
                C17416c.a(zipOutputStream, (Throwable) null);
                Intent a10 = C7130i0.a(this.f42239e, this.f42240f, file3);
                P0 c10 = C16311i0.c();
                a aVar = new a((V5.a) this.f42241g, a10, (C17164e) null);
                this.f42237c = 1;
                if (C16310i.g(c10, aVar, this) == f10) {
                    return f10;
                }
            } catch (Throwable th2) {
                C17416c.a(zipOutputStream, th);
                throw th2;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C16807N.f139792a;
    }
}
