package org.maplibre.android.maps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.adjust.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.maplibre.android.MapLibre;
import org.maplibre.android.c;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.k;
import org.maplibre.android.l;
import org.maplibre.android.style.sources.Source;
import xL.C18680a;
import xL.C18681b;

/* renamed from: org.maplibre.android.maps.d  reason: case insensitive filesystem */
public class C17735d implements View.OnClickListener, DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f145831a;

    /* renamed from: b  reason: collision with root package name */
    private final o f145832b;

    /* renamed from: c  reason: collision with root package name */
    private Set<C18680a> f145833c;

    /* renamed from: d  reason: collision with root package name */
    private AlertDialog f145834d;

    /* renamed from: org.maplibre.android.maps.d$a */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final o f145835a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Context> f145836b;

        a(o oVar, Context context) {
            this.f145835a = oVar;
            this.f145836b = new WeakReference<>(context);
        }

        /* access modifiers changed from: private */
        public Set<C18680a> b() {
            Context context = this.f145836b.get();
            if (context == null) {
                return Collections.emptySet();
            }
            ArrayList arrayList = new ArrayList();
            E t10 = this.f145835a.t();
            if (t10 != null) {
                for (Source attribution : t10.j()) {
                    String attribution2 = attribution.getAttribution();
                    if (!attribution2.isEmpty()) {
                        arrayList.add(attribution2);
                    }
                }
            }
            return new C18681b.a(context).d(true).e(true).c((String[]) arrayList.toArray(new String[arrayList.size()])).a().b();
        }
    }

    public C17735d(Context context, o oVar) {
        this.f145831a = context;
        this.f145832b = oVar;
    }

    private String[] b() {
        ArrayList arrayList = new ArrayList();
        for (C18680a a10 : this.f145833c) {
            arrayList.add(a10.a());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private void d(int i10) {
        Set<C18680a> set = this.f145833c;
        String b10 = ((C18680a[]) set.toArray(new C18680a[set.size()]))[i10].b();
        if (b10.contains("https://www.mapbox.com/map-feedback") || b10.contains("https://apps.mapbox.com/feedback")) {
            b10 = a(MapLibre.getApiKey());
        }
        e(b10);
    }

    private void e(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.f145831a.startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            Toast.makeText(this.f145831a, l.f145539a, 1).show();
            c.d(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        Uri.Builder buildUpon = Uri.parse("https://apps.mapbox.com/feedback").buildUpon();
        CameraPosition m10 = this.f145832b.m();
        if (m10 != null) {
            buildUpon.encodedFragment(String.format(Locale.getDefault(), "/%f/%f/%f/%f/%d", new Object[]{Double.valueOf(m10.target.b()), Double.valueOf(m10.target.a()), Double.valueOf(m10.zoom), Double.valueOf(m10.bearing), Integer.valueOf((int) m10.tilt)}));
        }
        String packageName = this.f145831a.getApplicationContext().getPackageName();
        if (packageName != null) {
            buildUpon.appendQueryParameter(Constants.REFERRER, packageName);
        }
        if (str != null) {
            buildUpon.appendQueryParameter("access_token", str);
        }
        E t10 = this.f145832b.t();
        if (t10 != null) {
            Matcher matcher = Pattern.compile("^(.*://[^:^/]*)/(.*)/(.*)").matcher(t10.k());
            if (matcher.find()) {
                String group = matcher.group(2);
                buildUpon.appendQueryParameter("owner", group).appendQueryParameter("id", matcher.group(3));
            }
        }
        return buildUpon.build().toString();
    }

    /* access modifiers changed from: protected */
    public void c(String[] strArr) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f145831a);
        builder.setTitle(l.f145540b);
        builder.setAdapter(new ArrayAdapter(this.f145831a, k.f145537a, strArr), this);
        this.f145834d = builder.show();
    }

    public void onClick(View view) {
        this.f145833c = new a(this.f145832b, view.getContext()).b();
        Context context = this.f145831a;
        if (!(context instanceof Activity ? ((Activity) context).isFinishing() : false)) {
            c(b());
        }
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        d(i10);
    }
}
