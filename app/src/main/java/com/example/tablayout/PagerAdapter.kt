package com.example.tablayout

import android.content.res.Resources.NotFoundException
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayout.fragments.MaybeFragment
import com.example.tablayout.fragments.NoFragment
import com.example.tablayout.fragments.YesFragment

class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                YesFragment()
            }
            1 -> {
                NoFragment()
            }
            2 -> {
                MaybeFragment()
            }
            else -> {
                throw NotFoundException("Page Not Found!")
            }
        }
    }
}