package com.example.aplicacion.ui.element

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aplicacion.databinding.FragmentElementBinding


class ElementFragment : Fragment() {
    private var _binding: FragmentElementBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
                _binding = FragmentElementBinding.inflate(inflater, container, false)

        binding.textInfo.text = "Aplicación hecha por Cariño Montiel Vanessa cargando elementos..."

        binding.progressBarInfo.progress = 70

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}