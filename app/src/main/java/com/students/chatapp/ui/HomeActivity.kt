package com.students.chatapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.students.chatapp.databinding.ActivityHomeBinding
import sdk.chat.core.session.ChatSDK

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.startChatButton.setOnClickListener {
            ChatSDK.ui().startMainActivity(this)
        }
    }
}