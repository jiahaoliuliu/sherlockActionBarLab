sherlockActionBarLab
====================

Like any other elements of Sherlock Action Bar, the home up button, which is the small arrow on the left side of the home(logo) button, could be customized.

Here is a short guide for it:
1. Override the actual style for the pre-v11 devices.
1.1 Copy and paste the follow code in the file styles.xml of the default values folder.
<resources>
    <style name="MyCustomTheme" parent="Theme.Sherlock.Light">
    <item name="homeAsUpIndicator">@drawable/ic_home_up</item>
    </style>
</resources>

Note that the parent could be changed to any Sherlock theme.

2. Override the actual style for the v11+ devices.
2.1 On the same folder where the folder values is, create a new folder called values-v11. Android will automatically look for the content of this folder for devices with API or above.
2.2 Create a new file called styles.xml
2.3 Paste the follow code into the file:
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="MyCustomTheme" parent="Theme.Sherlock.Light">
    <item name="android:homeAsUpIndicator">@drawable/ic_home_up</item>
    </style>
</resources>

Note tha the name of the style must be the same as the file in the default values folder and instead of the item homeAsUpIndicator, it is called android:homeAsUpIndicator.

The item issue is because for devices with API 11 or above, Sherlock Action Bar use the default Action Bar which comes with Android, which the key name is android:homeAsUpIndicator. But for the devices with API 10 or lower, Sherlock Action Bar uses its own ActionBar, which the home as up indicator is called simple "homeAsUpIndicator".

3. Use the new theme in the manifest
3.1 Replace the theme for the application/activity in the AndroidManifest file:
<application
    android:allowBackup="true"
    android:icon="@drawable/ic_launcher"
    android:label="@string/app_name"
    android:theme="@style/MyCustomTheme" >


http://www.jiahaoliuliu.com/2013/12/customize-home-up-button-in-action-bar.html
