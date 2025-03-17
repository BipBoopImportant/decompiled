package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import u2.C6012a;

public final class B implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Intent> f20945a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f20946b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private B(Context context) {
        this.f20946b = context;
    }

    public static B m(Context context) {
        return new B(context);
    }

    public B b(Intent intent) {
        this.f20945a.add(intent);
        return this;
    }

    public B i(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f20946b.getPackageManager());
        }
        if (component != null) {
            k(component);
        }
        b(intent);
        return this;
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f20945a.iterator();
    }

    public B j(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = l.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f20946b.getPackageManager());
            }
            k(component);
            b(supportParentActivityIntent);
        }
        return this;
    }

    public B k(ComponentName componentName) {
        int size = this.f20945a.size();
        try {
            Intent b10 = l.b(this.f20946b, componentName);
            while (b10 != null) {
                this.f20945a.add(size, b10);
                b10 = l.b(this.f20946b, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public Intent p(int i10) {
        return this.f20945a.get(i10);
    }

    public int q() {
        return this.f20945a.size();
    }

    public void r() {
        s((Bundle) null);
    }

    public void s(Bundle bundle) {
        if (!this.f20945a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f20945a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C6012a.n(this.f20946b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f20946b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
