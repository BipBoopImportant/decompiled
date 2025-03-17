# Exposed Intents Documentation

This document lists all intents that external applications can use to interact with this app.

## Firebase Cloud Messaging Intents

### Receive Messages
- Action: `com.google.android.c2dm.intent.RECEIVE` 
- Permission Required: Sender must have FCM permissions
- Description: Used to receive Firebase Cloud Messages

### Direct Boot Messages
- Action: `com.google.firebase.messaging.RECEIVE_DIRECT_BOOT`
- Description: Used to receive FCM messages in direct boot mode

### New Token
- Action: `com.google.firebase.messaging.NEW_TOKEN`
- Description: Notifies when a new FCM registration token is generated

### Messaging Event
- Action: `com.google.firebase.MESSAGING_EVENT`
- Package: Limited to app's own package
- Description: Internal intent for handling messaging events

## Notification Actions

### Notification Dismiss
- Action: `com.google.firebase.messaging.NOTIFICATION_DISMISS`
- Description: Triggered when a notification is dismissed by the user

## Afterpay Integration

### Afterpay Checkout
- Extra: `AFTERPAY_CHECKOUT_URL` (String)
- Extra: `AFTERPAY_INFO_URL` (String)
- Extra: `AFTERPAY_SHOULD_LOAD_REDIRECT_URLS` (Boolean)
- Description: Used for Afterpay payment flow integration

Note: Some intents may require specific permissions or authentication to work properly. Always refer to the official documentation for the most up-to-date integration guidelines.
