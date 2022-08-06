# Fuck DocumentsUI
Simple Xposed module for removing the stupid "To protect your privacy, choose another folder" restriction from DocumentsUI.

Tested with LSPosed 1.8.3, DocumentsUI from Android 11.

The "Can't use this folder" notice banner is preserved as a reminder.

How to use:

1. Build & install
2. Turn on the module, select **Recommended** apps (DocumentsUI)
3. `am force-stop com.android.documentsui`
4. Choose whichever folder you want
