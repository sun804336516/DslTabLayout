package com.angcyo.dsltablayout.demo

import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.angcyo.dsladapter.DslViewHolder
import com.angcyo.tablayout.delegate.ViewPager1Delegate
import com.angcyo.tablayout.delegate2.ViewPager2Delegate
import com.angcyo.tablayout.DslTabLayout

/**
 *
 * Email:angcyo@126.com
 * @author angcyo
 * @date 2019/11/23
 */
open class BaseTabLayoutFragment : BaseDslFragment() {
    override fun initBaseView(viewHolder: DslViewHolder, savedInstanceState: Bundle?) {
        super.initBaseView(viewHolder, savedInstanceState)
    }

    val tabLayoutList = mutableListOf<DslTabLayout>()

    fun addTabLayout(tabLayout: DslTabLayout) {
        if (!tabLayoutList.contains(tabLayout)) {
            tabLayoutList.add(tabLayout)
        }
    }

    fun setViewPager(viewPager: ViewPager) {
        tabLayoutList.forEach {
            ViewPager1Delegate.install(viewPager, it)
        }
    }

    fun setViewPager2(viewPager: ViewPager2) {
        tabLayoutList.forEach {
            ViewPager2Delegate.install(viewPager, it)
        }
    }
}