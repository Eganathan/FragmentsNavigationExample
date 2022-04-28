package com.varefree.fragmentsnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.varefree.fragmentsnavigationexample.databinding.FragmentFirstBinding
import com.varefree.fragmentsnavigationexample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //binding
        val binding = DataBindingUtil.inflate<FragmentSecondBinding>(
            inflater, R.layout.fragment_second,container, false
        )

        //binding the listeners to
        binding.prevBtn.setOnClickListener {
            view :View -> view.findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }

        return binding.root
    }
}