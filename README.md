sherlockActionBarLab
====================

Like any other elements of Sherlock Action Bar, the home up button, which is the small arrow on the left side of the home(logo) button, could be customized.

Here is a short guide for it:
I have checked the question. Here is the steps that I follow. The source code is hosted on GitHub:
https://github.com/jiahaoliuliu/sherlockActionBarLab

**Override the actual style for the pre-v11 devices.**

Copy and paste the follow code in the file styles.xml of the default values folder.

    <resources>
        <style name="MyCustomTheme" parent="Theme.Sherlock.Light">
        <item name="homeAsUpIndicator">@drawable/ic_home_up</item>
        </style>
    </resources>

Note that the parent could be changed to any Sherlock theme.

**Override the actual style for the v11+ devices.**

On the same folder where the folder values is, create a new folder called values-v11. Android will automatically look for the content of this folder for devices with API or above.

Create a new file called styles.xml and paste the follow code into the file:

    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <style name="MyCustomTheme" parent="Theme.Sherlock.Light">
        <item name="android:homeAsUpIndicator">@drawable/ic_home_up</item>
        </style>
    </resources>

Note tha the name of the style must be the same as the file in the default values folder and instead of the item homeAsUpIndicator, it is called android:homeAsUpIndicator.

The item issue is because for devices with API 11 or above, Sherlock Action Bar use the default Action Bar which comes with Android, which the key name is android:homeAsUpIndicator. But for the devices with API 10 or lower, Sherlock Action Bar uses its own ActionBar, which the home as up indicator is called simple "homeAsUpIndicator".

**Use the new theme in the manifest**

Replace the theme for the application/activity in the AndroidManifest file:

    <application
        android:allowBackup="true"
        android:icon="@drawable/ic_launcher"
        android:label="@string/app_name"
        android:theme="@style/MyCustomTheme" >


http://www.jiahaoliuliu.com/2013/12/customize-home-up-button-in-action-bar.html
