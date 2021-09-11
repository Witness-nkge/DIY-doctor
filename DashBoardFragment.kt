package com.wintech.diydr.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import com.wintech.diydr.R
import android.content.Intent
import android.view.View
import androidx.fragment.app.Fragment
import com.wintech.diydr.ChatbotActivity
import com.wintech.diydr.ReportActivity
import com.wintech.diydr.ContactActivity

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.findViewById<View>(R.id.chatbot).setOnClickListener { v: View? -> startActivity(Intent(activity, ChatbotActivity::class.java)) }
        view.findViewById<View>(R.id.report).setOnClickListener { v: View? -> startActivity(Intent(activity, ReportActivity::class.java)) }
        view.findViewById<View>(R.id.contacts).setOnClickListener { v: View? -> startActivity(Intent(activity, ContactActivity::class.java)) }
        return view
    }
}
