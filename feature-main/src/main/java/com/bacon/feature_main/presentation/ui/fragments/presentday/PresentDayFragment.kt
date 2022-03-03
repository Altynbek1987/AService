package com.bacon.feature_main.presentation.ui.fragments.presentday

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bacon.common.base.BaseFragment
import com.bacon.feature_main.R
import com.bacon.feature_main.databinding.FragmentPresentDayBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PresentDayFragment : BaseFragment<FragmentPresentDayBinding, PresentDayViewModel>(
    R.layout.fragment_present_day
) {
    override val binding by viewBinding(FragmentPresentDayBinding::bind)
    override val viewModel: PresentDayViewModel by viewModels()

}