package com.bacon.feature_main.presentation.ui.fragments.history

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bacon.common.base.BaseFragment
import com.bacon.feature_main.R
import com.bacon.feature_main.databinding.FragmentHistoryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HistoryFragment : BaseFragment<FragmentHistoryBinding, HistoryViewModel>(
    R.layout.fragment_history
) {
    override val binding by viewBinding(FragmentHistoryBinding::bind)
    override val viewModel: HistoryViewModel by viewModels()

}