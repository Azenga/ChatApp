# ChatSDK
-keep public class sdk.chat.**, sdk.guru.**, firestream.chat.**, app.xmpp.**, co.chatsdk.** {
    public protected *;
}

-keep class org.ocpsoft.prettytime.i18n.**

-keep class **.R$* {
    <fields>;
}

-keep class com.students.chatapp.data.models.User { *; }
# End