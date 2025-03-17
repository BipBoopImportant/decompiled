package androidx.appcompat.app;

import D2.j;
import P4.d;
import P4.g;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.T;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.B;
import androidx.core.app.C5147b;
import androidx.core.app.l;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import f.C5297b;

public class AppCompatActivity extends C5191t implements d, B.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    class a implements d.c {
        a() {
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().K(bundle);
            return bundle;
        }
    }

    class b implements C5297b {
        b() {
        }

        public void a(Context context) {
            g delegate = AppCompatActivity.this.getDelegate();
            delegate.A();
            delegate.G(AppCompatActivity.this.getSavedStateRegistry().b(AppCompatActivity.DELEGATE_TAG));
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        l0.b(getWindow().getDecorView(), this);
        m0.b(getWindow().getDecorView(), this);
        g.b(getWindow().getDecorView(), this);
        C.b(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().f(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().m(context));
    }

    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.q(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i10) {
        return getDelegate().p(i10);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.n(this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        return getDelegate().t();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().w();
    }

    public Resources getResources() {
        if (this.mResources == null && T.d()) {
            this.mResources = new T(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public a getSupportActionBar() {
        return getDelegate().z();
    }

    public Intent getSupportParentActivityIntent() {
        return l.a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().B();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().F(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(B b10) {
        b10.j(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().H();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onLocalesChanged(j jVar) {
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i10) {
    }

    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().I(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().J();
    }

    public void onPrepareSupportNavigateUpTaskStack(B b10) {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().L();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().M();
    }

    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            B m10 = B.m(this);
            onCreateSupportNavigateUpTaskStack(m10);
            onPrepareSupportNavigateUpTaskStack(m10);
            m10.r();
            try {
                C5147b.r(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().Z(charSequence);
    }

    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.r()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i10) {
        initViewTreeOwners();
        getDelegate().S(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().X(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().Y(i10);
    }

    public androidx.appcompat.view.b startSupportActionMode(b.a aVar) {
        return getDelegate().a0(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().B();
    }

    public void supportNavigateUpTo(Intent intent) {
        l.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().P(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return l.f(this, intent);
    }

    public AppCompatActivity(int i10) {
        super(i10);
        initDelegate();
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().T(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().U(view, layoutParams);
    }
}
