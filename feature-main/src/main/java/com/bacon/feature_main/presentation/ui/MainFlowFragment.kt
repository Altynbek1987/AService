package com.bacon.feature_main.presentation.ui

import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bacon.common.base.BaseFlowFragment
import com.bacon.feature_main.R
import com.bacon.feature_main.databinding.FragmentMainFlowBinding

class MainFlowFragment : BaseFlowFragment(
    R.layout.fragment_main_flow, R.id.nav_host_fragment_main
) {
    private val binding by viewBinding(FragmentMainFlowBinding::bind)

    override fun setupNavigation() {
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController)
    }

}