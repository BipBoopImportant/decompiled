package j1;

import XH.C16796C;
import YH.X;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "Lj1/j;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(Lj1/j;)Ljava/lang/String;", "getAndroidType$annotations", "(Lj1/j;)V", "androidType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: j1.b  reason: case insensitive filesystem */
public final class C5471b {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<C5479j, String> f24671a = X.l(C16796C.a(C5479j.EmailAddress, "emailAddress"), C16796C.a(C5479j.Username, "username"), C16796C.a(C5479j.Password, "password"), C16796C.a(C5479j.NewUsername, "newUsername"), C16796C.a(C5479j.NewPassword, "newPassword"), C16796C.a(C5479j.PostalAddress, "postalAddress"), C16796C.a(C5479j.PostalCode, "postalCode"), C16796C.a(C5479j.CreditCardNumber, "creditCardNumber"), C16796C.a(C5479j.CreditCardSecurityCode, "creditCardSecurityCode"), C16796C.a(C5479j.CreditCardExpirationDate, "creditCardExpirationDate"), C16796C.a(C5479j.CreditCardExpirationMonth, "creditCardExpirationMonth"), C16796C.a(C5479j.CreditCardExpirationYear, "creditCardExpirationYear"), C16796C.a(C5479j.CreditCardExpirationDay, "creditCardExpirationDay"), C16796C.a(C5479j.AddressCountry, "addressCountry"), C16796C.a(C5479j.AddressRegion, "addressRegion"), C16796C.a(C5479j.AddressLocality, "addressLocality"), C16796C.a(C5479j.AddressStreet, "streetAddress"), C16796C.a(C5479j.AddressAuxiliaryDetails, "extendedAddress"), C16796C.a(C5479j.PostalCodeExtended, "extendedPostalCode"), C16796C.a(C5479j.PersonFullName, "personName"), C16796C.a(C5479j.PersonFirstName, "personGivenName"), C16796C.a(C5479j.PersonLastName, "personFamilyName"), C16796C.a(C5479j.PersonMiddleName, "personMiddleName"), C16796C.a(C5479j.PersonMiddleInitial, "personMiddleInitial"), C16796C.a(C5479j.PersonNamePrefix, "personNamePrefix"), C16796C.a(C5479j.PersonNameSuffix, "personNameSuffix"), C16796C.a(C5479j.PhoneNumber, "phoneNumber"), C16796C.a(C5479j.PhoneNumberDevice, "phoneNumberDevice"), C16796C.a(C5479j.PhoneCountryCode, "phoneCountryCode"), C16796C.a(C5479j.PhoneNumberNational, "phoneNational"), C16796C.a(C5479j.Gender, "gender"), C16796C.a(C5479j.BirthDateFull, "birthDateFull"), C16796C.a(C5479j.BirthDateDay, "birthDateDay"), C16796C.a(C5479j.BirthDateMonth, "birthDateMonth"), C16796C.a(C5479j.BirthDateYear, "birthDateYear"), C16796C.a(C5479j.SmsOtpCode, "smsOTPCode"));

    public static final String a(C5479j jVar) {
        String str = f24671a.get(jVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
