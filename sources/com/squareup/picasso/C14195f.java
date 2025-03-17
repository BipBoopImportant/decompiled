package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.f  reason: case insensitive filesystem */
class C14195f extends y {

    /* renamed from: b  reason: collision with root package name */
    private static final UriMatcher f122549b;

    /* renamed from: a  reason: collision with root package name */
    private final Context f122550a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f122549b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C14195f(Context context) {
        this.f122550a = context;
    }

    private InputStream j(w wVar) {
        ContentResolver contentResolver = this.f122550a.getContentResolver();
        Uri uri = wVar.f122638d;
        int match = f122549b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    public boolean c(w wVar) {
        Uri uri = wVar.f122638d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f122549b.match(wVar.f122638d) != -1;
    }

    public y.a f(w wVar, int i10) {
        InputStream j10 = j(wVar);
        if (j10 == null) {
            return null;
        }
        return new y.a(WK.y.l(j10), t.e.DISK);
    }
}
