package com.students.chatapp

import android.app.Application
import sdk.chat.app.firebase.ChatSDKFirebase

class ChatApp : Application() {

    override fun onCreate() {
        super.onCreate()

        ChatSDKFirebase.quickStart(this, "chats", "some-api-key", false)
    }
}