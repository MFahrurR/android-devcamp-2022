package com.tkpd.devcamp2022.day3.mvvm_livedata_coroutine.coroutine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tkpd.devcamp2022.day3.mvvm_livedata_coroutine.api.MockProductApi
import com.tkpd.devcamp2022.day3.mvvm_livedata_coroutine.view.setProduct
import com.tkpd.devcamp2022.databinding.FragmentProductCoroutineBinding

/**
 * Created by kenny.hadisaputra on 26/09/22
 */
class ProductCoroutineFragment : Fragment() {

    private var _binding: FragmentProductCoroutineBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<ProductCoroutineViewModel>(
        factoryProducer = {
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return ProductCoroutineViewModel(MockProductApi()) as T
                }
            }
        }
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductCoroutineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSearch.setOnClickListener {
            viewModel.getProduct(binding.etSearchProduct.text.toString())
        }

        binding.btnSearchSlower.setOnClickListener {
            viewModel.getProductSlower(binding.etSearchProduct.text.toString())
        }

        viewModel.product.observe(viewLifecycleOwner) {
            binding.productCard.setProduct(it)
            binding.productCard.root.visibility = View.VISIBLE
        }

        viewModel.seconds.observe(viewLifecycleOwner) {
            binding.tvTimer.text = "$it seconds"
        }
    }
}